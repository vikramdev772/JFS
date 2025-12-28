import React from 'react'
import "./App.css";
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Register from './pages/Register';

const App = () => {
  return (
    <>
    <BrowserRouter>
    <Routes>
      <Route path="/signup" element={<Register/>}/>

    </Routes>
    </BrowserRouter>
    
    </>
  )
}

export default App