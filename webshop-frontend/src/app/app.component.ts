import { Component } from '@angular/core';

@Component({
    selector: 'app-root',
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.scss']
})
export class AppComponent {
    title = 'frontend';

    constructor() {

        const body = {
            user: {
                name: 'name',
                email: 'email',
                phone: 'phone',
                user_fields: {
                    intershop_customer_number: '',
                },
            },
        };

        body.user.user_fields.intershop_customer_number = '123';

        // body = Object.assign(body.user.user_fields.intershop_customer_number, '123');

        console.log(body);

    }
}
