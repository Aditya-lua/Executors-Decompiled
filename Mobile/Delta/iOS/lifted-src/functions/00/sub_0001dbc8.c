/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1dbc8..0x1dcb8 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1dbc8_1 {
    char padding_0[88];
    char field_58;
    char padding_59[39];
    unsigned int field_80;
    unsigned long long field_84;
    char padding_8c[76];
    long long field_d8;
} st_1dbc8_1;

typedef struct st_1dbc8_2 {
    char padding_0[20];
    unsigned long long field_14;
} st_1dbc8_2;

typedef struct st_1dbc8_0 {
    char field_0;
} st_1dbc8_0;


long long sub_1dbc8(st_1dbc8_1 *a0)
{
    unsigned long v6;  // x22
    st_1dbc8_2 *v7;  // x23
    unsigned long v8;  // x20
    long long v9;  // x0
    st_1dbc8_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_1dbc8_0 *v1;  // [bp-0x58]
    unsigned long v2;  // [bp-0x50]
    unsigned long v3;  // [bp-0x48]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v6 = sub_16f40();
    if (a0->field_80 != 264)
        return v6;
    sub_f8d0(a0);
    v7 = sub_12740(a0, 0);
    v2 = *(long long *)&(&a0->field_80)[1];
    v3 = *(long long *)&(v7->padding_0)[1];
    v8 = sub_404c(*(long long *)&a0->padding_8c[72], 48);
    sub_6330(v8, &v2, v6, v7);
    if (a0->field_58 != 1)
        return v8;
    v9 = sub_404c(*(long long *)&a0->padding_8c[72], 12);
    sub_88cc(v9, *(long long *)&(&a0->field_80)[1]);
    v2 = v8;
    sub_1c9f0(&a0[5].padding_0[24], &v2);
    *(long long *)(sub_12484(&a0[5].padding_0[24], &v2) + 8) = v9;
    return v8;
}
