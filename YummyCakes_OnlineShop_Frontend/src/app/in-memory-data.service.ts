import { InMemoryDbService } from 'angular-in-memory-web-api';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class InMemoryDataService implements InMemoryDbService {

  constructor() { }

  createDb() {

    const phoneNumber = '';

    const mainNav = [
      { name: 'Cakes', alias: 'main-page-catalog', showHeader: true },
      { name: 'Special Order', alias: 'main-page-order', showHeader: true }, 
      { name: 'Contacts', alias: 'main-page-contacts', showHeader: true }
    ];

    const sNetworkLinks = [
      { name: 'Vkontakte', iconPath: 'icon-vk.svg', link: 'vk.com'},
      { name: 'Instagram', iconPath: 'icon-insta.svg', link: 'instagram.com'}
    ];

    const catalogGroupsItems1 = [
      { id: 1, name: 'Classic Berry', image: 'assets/images/piece1.jpg', options: [{ title: "1kg", price: 200}, { title: "3kg", price: 300}] },
      { id: 2, name: 'Classic Mango', image: 'assets/images/piece2.jpg', options: [{ title: "1kg", price: 180}, { title: "2kg", price: 300}] },
      { id: 3, name: 'Classic Cup Cake', image: 'assets/images/piece12.jpg', options: [{ title: "1kg", price: 160}, { title: "2kg", price: 300}] },
      { id: 4, name: 'Classic Caramel', image: 'assets/images/common2.jpg', options: [{ title: "2kg", price: 350}, { title: "4kg", price: 700}] },
      { id: 5, name: 'Classic Rainbow Cake', image: 'assets/images/rainbow.jpg', options: [{ title: "2kg", price: 520}, { title: "3kg", price: 800}] },
      { id: 6, name: 'Classic Brownie', image: 'assets/images/piece6.jpg', options: [{ title: "4kg", price: 130}, { title: "2kg", price: 300}] },
      { id: 7, name: 'Classic Tri-chocolate', image: 'assets/images/piece7.jpg', options: [{ title: "1kg", price: 275}, { title: "2kg", price: 400}] },
      { id: 8, name: 'Classic Cheese Cake', image: 'assets/images/piece8.jpg', options: [{ title: "2kg", price: 300}, { title: "3kg", price: 600}] },
      { id: 9, name: 'Classic citrus', image: 'assets/images/piece9.jpg', options: [{ title: "1kg", price: 200}, { title: "2kg", price: 400}] },
      ];

    const catalogGroupsItems2 = [
      { id: 1, name: 'Red Velvet', image: 'assets/images/wedding4.jpg', options: [{ title: "1kg", price: 200}, { title: "8kg", price: 300}] },
      { id: 2, name: 'Chocolate Truffle', image: 'assets/images/wedding2.jpg', options: [{ title: "1kg", price: 180}, { title: "2kg", price: 300}] },
      { id: 3, name: 'Strawberry Cake', image: 'assets/images/wedding1.jpg', options: [{ title: "2kg", price: 160}, { title: "3kg", price: 300}] },
      { id: 4, name: 'White Forest', image: 'assets/images/weddingcake.jpg', options: [{ title: "1kg", price: 150}, { title: "2kg", price: 300}] },
      { id: 5, name: 'Butter Scotch', image: 'assets/images/weddingcake1.jpg', options: [{ title: "1kg", price: 120}, { title: "2kg", price: 300}] },
      { id: 6, name: 'Berry Cup Cakes', image: 'assets/images/wedding6.jpg', options: [{ title: "1kg", price: 130}, { title: "2kg", price: 300}] },
      { id: 7, name: 'vannila Cake', image: 'assets/images/wedding7.jpg', options: [{ title: "1kg", price: 175}, { title: "2kg", price: 300}] },
      { id: 8, name: 'Red Forest', image: 'assets/images/weddingcake2.jpg', options: [{ title: "2kg", price: 102}, { title: "3kg", price: 300}] },
      { id: 9, name: 'Strawberry Cake', image: 'assets/images/piece13.jpg', options: [{ title: "1kg", price: 85}, { title: "2kg", price: 300}] },
         ];

    const catalogGroupsItems3 = [
      { id: 1, name: 'Red Velvet', image: 'assets/images/kid7.jpg', options: [{ title: "1kg", price: 200}, { title: "2kg", price: 300}] },
      { id: 2, name: 'Strawberry Cake', image: 'assets/images/kid18.jpg', options: [{ title: "2kg", price: 180}, { title: "3kg", price: 300}] },
      { id: 3, name: 'White Forest', image: 'assets/images/kid17.jpg', options: [{ title: "2kg", price: 160}, { title: "3kg", price: 300}] },
      { id: 4, name: 'chocolate truffle', image: 'assets/images/kid16.jpg', options: [{ title: "3kg", price: 150}, { title: "5kg", price: 300}] },
      { id: 5, name: 'Black Forest', image: 'assets/images/kid15.jpg', options: [{ title: "2kg", price: 120}, { title: "4kg", price: 300}] },
      { id: 6, name: 'Blueberry Cake', image: 'assets/images/kid4.jpg', options: [{ title: "1kg", price: 130}, { title: "2kg", price: 300}] },
      { id: 7, name: 'Vannila Cake', image: 'assets/images/kid6.jpg', options: [{ title: "1kg", price: 175}, { title: "2kg", price: 300}] },
      { id: 8, name: 'ButterScotch Cake', image: 'assets/images/kid1.jpg', options: [{ title: "1kg", price: 102}, { title: "2kg", price: 300}] },
      { id: 9, name: 'Pineapple Cake', image: 'assets/images/birthday9.jpg', options: [{ title: "1kg", price: 85}, { title: "2kg", price: 300}] },
       ];

    

    const maxPrice = 1500;

    const minPrice = 50;

    const catalogGroups = [
      { id: 1, name: 'classic', nameRus: 'Classic Cakes', items: catalogGroupsItems1, groupImage: {title: 'Classic cakes', path: 'assets/images/catalog-classic.png'}, quantity: 20},
      { id: 3, name: 'wedding', nameRus: 'Wedding Cakes', items: catalogGroupsItems2, groupImage: {title: ' cakes', path: 'assets/images/catalog-wedding.png'}, quantity: 15},
      { id: 4, name: 'children', nameRus: 'Kids Cake', items: catalogGroupsItems3, groupImage: {title: 'Cakes for children', path: 'assets/images/catalog-children.png'}, quantity: 18},
    ];

    const cakeFillings = [
      { name: 'ganache', nameRus: 'Chocolate cream', description: 'The most loved chocolate cake among other chocolate cakes!', imageUrl: 'assets/images/fillingchoco.jpg', price: 800, priceUnit: 'kg'},
      { name: 'vanilla-cream', nameRus: 'Vanilla cream', description: 'Nobody refuse the piece of this vanilla cakes', imageUrl: 'assets/images/fillingvanilla.jpg', price: 700, priceUnit: 'kg'},
      { name: 'berry-cream', nameRus: 'Strawberry cream', description: 'Straw berries cream - the best filling ever!', imageUrl: 'assets/images/strawberry1.jpg', price: 1000, priceUnit: 'kg'}
    ];

    const cakeSizes = [
      { size: 1, diameter: '18cm', imageUrl: 'assets/images/cake-1kg.png', persons: '6 servings'},
      { size: 2, diameter: '24cm', imageUrl: 'assets/images/cake-2kg.png', persons: '10-12 servings'},
      { size: 5, diameter: '2 tiers- 18cm, 20cm', imageUrl: 'assets/images/cake-5kg.png', persons: '15-20 servings'},
      { size: 8, diameter: '3 tiers- 18cm, 20cm and 25cm', imageUrl: 'assets/images/cake-8kg.png', persons: '25-30 servings'}
    ];

    const cakeDecorating = [
      { name: 'berry-assorty', nameRus: 'Fruits', imageUrl: 'assets/images/fruits3.jpg', price: 300, priceUnit: 'kg'},
      { name: 'marshmallow', nameRus: 'Nutties', imageUrl: 'assets/images/nuts1.jpg', price: 500, priceUnit: 'kg'},
      { name: 'chocolate', nameRus: 'Sprinkles', imageUrl: 'assets/images/sprinkles1.jpg', price: 250, priceUnit: 'kg'}
    ];

    return {mainNav, phoneNumber, sNetworkLinks, catalogGroups, cakeFillings, cakeSizes, cakeDecorating, maxPrice, minPrice};
  }
}
