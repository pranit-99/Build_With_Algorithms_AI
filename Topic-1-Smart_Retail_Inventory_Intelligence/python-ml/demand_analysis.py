import csv
import statistics


def calculate_demand_score(sales):
    average_sales = statistics.mean(sales)

    if average_sales >= 30:
        return "HIGH"
    elif average_sales >= 15:
        return "NORMAL"
    else:
        return "LOW"


def analyze_products():

    with open("sales_data.csv", "r") as file:

        reader = csv.DictReader(file)

        for row in reader:

            sales = [
                int(row["week1"]),
                int(row["week2"]),
                int(row["week3"]),
                int(row["week4"])
            ]

            mean_sales = statistics.mean(sales)
            median_sales = statistics.median(sales)
            minimum_sales = min(sales)
            maximum_sales = max(sales)

            demand = calculate_demand_score(sales)

            print("\n----------------------------")
            print("Product:", row["product_name"])
            print("Mean Sales:", mean_sales)
            print("Median Sales:", median_sales)
            print("Minimum Sales:", minimum_sales)
            print("Maximum Sales:", maximum_sales)
            print("Demand:", demand)


analyze_products()