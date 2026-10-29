/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x20c34..0x20d84 (336 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_20c34_2 {
    char padding_0[20];
    unsigned long long field_14;
} st_20c34_2;

typedef struct st_20c34_1 {
    char padding_0[88];
    char field_58;
    char padding_59[39];
    unsigned int field_80;
    unsigned long long field_84;
    char padding_8c[20];
    long long field_a0;
    char padding_a8[48];
    long long field_d8;
    char padding_e0[112];
    unsigned int *field_150;
    char padding_158[56];
    unsigned long long field_190;
    unsigned long long field_198;
} st_20c34_1;

typedef struct st_20c34_3 {
    char padding_0[48];
    char field_30;
} st_20c34_3;

typedef struct st_20c34_0 {
    char field_0;
} st_20c34_0;


long long sub_20c34(st_20c34_1 *a0)
{
    unsigned long v7;  // x25
    unsigned int v8;  // w21
    unsigned long long v9;  // x9
    unsigned long long v10;  // x8
    st_20c34_3 *v11;  // x20
    unsigned long long v12;  // x0
    long long v13;  // x21
    st_20c34_2 *v14;  // x24
    unsigned long v15;  // x0
    long long v16;  // x0
    st_20c34_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_20c34_0 *v1;  // [bp-0x68]
    unsigned int v2;  // [bp-0x60], Other Possible Types: unsigned long
    unsigned long v3;  // [bp-0x5c]
    unsigned long v4;  // [bp-0x58]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v0 = &v1;
    v7 = *(long long *)&(&a0->field_80)[1];
    v8 = a0->field_80;
    sub_f8d0();
    v9 = *(long long *)&a0->padding_158[48];
    v10 = a0->field_190;
    *(int *)(*(long long *)&a0->padding_e0[104] - 4) = *(int *)(*(long long *)&a0->padding_e0[104] - 4) + 1;
    v11 = sub_10a78(a0);
    *(int *)(*(long long *)&a0->padding_e0[104] - 4) = *(int *)(*(long long *)&a0->padding_e0[104] - 4) - 1;
    v2 = v8;
    v3 = v7;
    v12 = sub_1e5c4(a0, 310, &v2);
    v11->field_30 = v12;
    if ((unsigned int)v12)
        v13 = *(long long *)&a0->padding_8c[16];
    else
        v13 = -0x1;
    v14 = sub_18934(a0, 0);
    sub_16df8(a0, v10 - v9 >> 3);
    v2 = v7;
    v4 = *(long long *)&(v14->padding_0)[1];
    v15 = sub_404c(*(long long *)&a0->padding_a8[40], 56);
    sub_747c(v15, &v2, v14, v11, v12);
    if (a0->field_58 != 1)
        return v15;
    v16 = sub_404c(*(long long *)&a0->padding_a8[40], 12);
    sub_84a8(v16, v13);
    v2 = v15;
    sub_1c9f0(&a0[2].padding_e0[104], &v2);
    *(long long *)(sub_12484(&a0[2].padding_e0[104], &v2) + 8) = v16;
    return v15;
}
