/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x21648..0x217dc (404 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_21648_1 {
    char padding_0[88];
    long long field_58;
    char padding_60[32];
    unsigned int field_80;
    unsigned long long field_84;
    char padding_8c[20];
    long long field_a0;
    char padding_a8[48];
    long long field_d8;
    char padding_e0[52];
    unsigned int field_114;
} st_21648_1;

typedef struct st_21648_2 {
    char padding_0[20];
    unsigned long long field_14;
} st_21648_2;

typedef struct st_21648_0 {
    char field_0;
} st_21648_0;


long long sub_21648(st_21648_1 *a0)
{
    unsigned long v6;  // x25
    long long v7;  // x0
    long long v16;  // x0
    unsigned long long v8;  // x0
    long long v9;  // x20
    long long v10;  // x0
    unsigned long v11;  // x22
    unsigned int v12;  // w28
    st_21648_2 *v13;  // x27
    long long v14;  // x26
    unsigned long v15;  // x0
    st_21648_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_21648_0 *v1;  // [bp-0x78]
    unsigned long v2;  // [bp-0x70]
    unsigned long v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v6 = *(long long *)&(&a0->field_80)[1];
    sub_f8d0();
    v7 = sub_18934(a0, 0);
    v8 = sub_1f3d4(a0, 308, "if then else expression");
    if ((unsigned int)v8)
        v9 = *(long long *)&a0->padding_8c[16];
    else
        v9 = -0x1;
    v10 = sub_18934(a0, 0);
    v11 = *(long long *)&(&a0->field_80)[1];
    v12 = a0->field_80;
    if (v12 == 295)
    {
        sub_16844(a0, "expression");
        v13 = sub_21648(a0);
        *(int *)&a0->padding_e0[44] = *(int *)&a0->padding_e0[44];
        v14 = 1;
    }
    else
    {
        v14 = sub_1f3d4(a0, 294, "if then else expression");
        v13 = sub_18934(a0, 0);
    }
    v2 = v6;
    v3 = *(long long *)&(v13->padding_0)[1];
    v15 = sub_404c(*(long long *)&a0->padding_a8[40], 72);
    sub_6294(v15, &v2, v7, v8, v10, v14, v13);
    if ((char)a0->field_58 != 1)
        return v15;
    v16 = sub_404c(*(long long *)&a0->padding_a8[40], 24);
    sub_8894(v16, v9, v11, v12 == 295);
    v2 = v15;
    sub_1c9f0(&a0[4].padding_0[32], &v2);
    *(long long *)(sub_12484(&a0[4].padding_0[32], &v2) + 8) = v16;
    return v15;
}
