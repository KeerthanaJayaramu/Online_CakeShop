import { Country } from '../models';


import { HttpClient } from '@angular/common/http';

export class MyComponent {
    constructor(private http: HttpClient) {}
  
    getData() {
      this.http.get('https://api.example.com/endpoint')
        .subscribe(data => {
          console.log("data: "+ data);
        });
    }
  }


export const COUNTRIES: Country[] = [
    {
        id: 1,
        name: 'Chocolate truffle',
        flag: '',
        area: 2,
        population: 950,
      
    },
    {
        id: 2,
        name: 'Red Velvet',
        flag: '',
        area: 1,
        population: 550,
      
    },
    {
        id: 3,
        name: 'Black Forest',
        flag: '',
        area: 2,
        population: 1000,
      
    },
    {
        id: 4,
        name: 'Classic Berry',
        flag: '',
        area: 3,
        population: 1100,
      
    },
    {
        id: 5,
        name: 'Caramel Cake',
        flag: '',
        area: 1,
        population: 350,
      
    },
    {
        id: 6,
        name: 'Angel Cake',
        flag: '',
        area: 4,
        population: 1550,
      
    },
    {
        id: 7,
        name: 'Three Chocolate',
        flag: '',
        area: 1,
        population: 650,
      
    },
    {
        id: 8,
        name: 'Almond Cake',
        flag: '',
        area: 2,
        population: 700,
      
    },
    {
        id: 9,
        name: 'Classic Cheese Cake',
        flag: '',
        area: 2,
        population: 950,
      
    },
    {
        id: 10,
        name: 'Classic Berry',
        flag: '',
        area: 1,
        population: 450,
      
    },
    {
        id: 11,
        name: 'Brownie',
        flag: '',
        area: 4,
        population: 1050,
      
    },
    {
        id: 12,
        name: 'Cheese Cake',
        flag: '',
        area: 2,
        population: 800,
      
    },
];
