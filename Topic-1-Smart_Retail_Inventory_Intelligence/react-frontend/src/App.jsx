import { useState } from "react";
import "./App.css";

function App() {

  const products = [
    {
      id: "P101",
      name: "Wireless Mouse",
      category: "Electronics",
      price: 29.99,
      stock: 45,
      demand: "HIGH"
    },
    {
      id: "P102",
      name: "Coffee Mug",
      category: "Home",
      price: 12.50,
      stock: 80,
      demand: "LOW"
    },
    {
      id: "P103",
      name: "Mechanical Keyboard",
      category: "Electronics",
      price: 79.99,
      stock: 20,
      demand: "NORMAL"
    },
    {
      id: "P104",
      name: "Notebook",
      category: "Stationery",
      price: 5.99,
      stock: 150,
      demand: "LOW"
    },
    {
      id: "P105",
      name: "USB-C Charger",
      category: "Electronics",
      price: 39.99,
      stock: 12,
      demand: "HIGH"
    }
  ];

  const [search, setSearch] = useState("");

  const filteredProducts = products.filter(product =>
    product.name.toLowerCase().includes(search.toLowerCase()) ||
    product.id.toLowerCase().includes(search.toLowerCase())
  );

  return (
    <div className="container">

      <h1>Smart Retail Inventory Intelligence</h1>

      <input
        type="text"
        placeholder="Search by product ID or name..."
        value={search}
        onChange={(event) => setSearch(event.target.value)}
      />

      <table>

        <thead>
          <tr>
            <th>Product ID</th>
            <th>Name</th>
            <th>Category</th>
            <th>Price</th>
            <th>Stock</th>
            <th>Demand</th>
          </tr>
        </thead>

        <tbody>

          {filteredProducts.map(product => (

            <tr key={product.id}>

              <td>{product.id}</td>
              <td>{product.name}</td>
              <td>{product.category}</td>
              <td>${product.price}</td>
              <td>{product.stock}</td>
              <td>{product.demand}</td>

            </tr>

          ))}

        </tbody>

      </table>

    </div>
  );
}

export default App;