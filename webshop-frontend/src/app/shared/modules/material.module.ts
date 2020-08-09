import { NgModule } from '@angular/core';
import { MatCardModule } from '@angular/material/card';

const MATERIAL_MODULES = [
    MatCardModule,
];

@NgModule({
    imports: [
        ...MATERIAL_MODULES
    ],
    exports: [
        ...MATERIAL_MODULES
    ]
})
export class MaterialModule {
}
