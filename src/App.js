import React from 'react';
import logo from './logo.svg';
import './App.css';
import TransporterComponent from './components/TransporterComponent';
import AllComponent from './components/AllComponent';

function App() {
  return (
    <div>
      <header className="container-fluid">
         <TransporterComponent />
         <AllComponent />
      </header>
    </div>
  );
}

export default App;