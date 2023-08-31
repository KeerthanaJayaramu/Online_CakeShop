import { SideNavItems, SideNavSection } from '@modules/navigation/models';

export const sideNavSections: SideNavSection[] = [
    {
        text: 'EDU - Bridge',
        items: ['dashboard', 'tables']
    }
];

export const sideNavItems: SideNavItems = {
    dashboard: {
        icon: 'tachometer-alt',
        text: 'Cake',
        link: '/cake',
    },
    tables: {
        icon: 'table',
        text: 'Order',
        link: '/orders',
    },
};
