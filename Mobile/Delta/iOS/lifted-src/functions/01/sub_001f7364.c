/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f7364..0x1f7418 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f7364_2 {
    unsigned int field_0;
    long long field_4;
} st_1f7364_2;

typedef struct st_1f7364_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
    char padding_20[16];
    unsigned long long field_30;
    char padding_38[16];
    unsigned long long field_48;
} st_1f7364_1;

typedef struct st_1f7364_0 {
    char field_0;
} st_1f7364_0;


st_1f7364_2 * sub_1f7364(st_1f7364_1 *a0, unsigned int a1)
{
    st_1f7364_2 *v4;  // x8
    unsigned int *v5;  // x9
    unsigned long v6;  // x19
    unsigned int v7;  // w23
    st_1f7364_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_1f7364_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0->field_18 + a1 * 8;
    if ((&v4->field_0)[1])
        return v4;
    v5 = a0->field_48 + a1 * 8;
    v6 = v5[1];
    if (!(unsigned int)v6)
        return v4;
    v7 = a0->field_8;
    v4->field_0 = v7;
    sub_1fb5d8();
    sub_1f32ac(a0, 0, a0->field_30 + *v5 * 8, v6, a0->field_0 + v7 * 8, 0);
    (&v4->field_0)[1] = v6;
    return v4;
}
