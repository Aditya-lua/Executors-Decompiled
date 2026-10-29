/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1beff0..0x1bf098 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1beff0_0 {
    char padding_0[24];
    unsigned int field_18;
    char padding_1c[4];
    char field_20;
    char padding_21[23];
    char field_38;
    char padding_39[39];
    char field_60;
    char padding_61[23];
    char field_78;
    char padding_79[23];
    unsigned long long field_90;
    char field_98;
    char padding_99[31];
    char field_b8;
    char padding_b9[31];
    unsigned short field_d8;
} st_1beff0_0;


st_1beff0_0 * sub_1beff0(st_1beff0_0 *a0, st_1beff0_0 *a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_5ccc();
    a0->field_18 = a1->field_18;
    sub_5ccc(&a0->field_20, &a1->field_20);
    sub_1c2910(&a0->field_38, &a1->field_38);
    sub_5ccc(&a0->field_60, &a1->field_60);
    sub_5ccc(&a0->field_78, &a1->field_78);
    a0->field_90 = a1->field_90;
    sub_1b41f8(&a0->field_98, &a1->field_98);
    sub_1b41f8(&a0->field_b8, &a1->field_b8);
    a0->field_d8 = a1->field_d8;
    sub_5ccc(&a0[1].padding_0[6], &a1[1].padding_0[6]);
    sub_5ccc(&a0[1].padding_1c[2], &a1[1].padding_1c[2]);
    return a0;
}
