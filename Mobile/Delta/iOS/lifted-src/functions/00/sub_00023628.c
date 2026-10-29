/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x23628..0x23758 (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_23628_3 {
    char padding_0[8];
    long long field_8;
} st_23628_3;

typedef struct st_23628_1 {
    char padding_0[88];
    long long field_58;
    char padding_60[36];
    uint128_t field_84;
    char padding_94[4];
    long long field_98;
    char padding_a0[56];
    long long field_d8;
} st_23628_1;

typedef struct st_23628_2 {
    long long field_0;
    char padding_8[8];
    unsigned long long field_10;
} st_23628_2;

typedef struct st_23628_0 {
    char field_0;
} st_23628_0;


st_23628_3 * sub_23628(st_23628_1 *a0, st_23628_2 *a1)
{
    long long v12;  // x0
    long long v13;  // x0
    st_23628_3 *v14;  // x0
    long long v15;  // x0
    st_23628_3 *v16;  // x0
    st_23628_0 **v0;  // [bp-0x90], Other Possible Types: char
    st_23628_0 *v1;  // [bp-0x88]
    unsigned long v2;  // [bp-0x80]
    unsigned int v3;  // [bp-0x78]
    long long v4;  // [bp-0x74]
    uint128_t v5;  // [bp-0x70]
    long long v6;  // [bp-0x60]
    long long v7;  // [bp-0x58]
    st_23628_0 **v8;  // [bp-0x50], Other Possible Types: char
    st_23628_0 *v9;  // [bp-0x48], Other Possible Types: unsigned int, unsigned long
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v1 = &v0;
    v0 = &v1;
    v6 = 0;
    v7 = 0;
    v5 = *(int128_t *)&(a0->padding_60)[1];
    v3 = sub_193ec();
    v4 = 0;
    sub_f8d0(a0);
    v9 = 4;
    v12 = sub_14f50(&v3, &v9);
    v13 = sub_404c(*(long long *)&a0->padding_a0[40], 56);
    v2 = sub_68e8(v13, &v5, v12, v6, v7, *(long long *)((char *)&a0->field_84 + 8));
    v9 = &v8;
    v8 = &v9;
    v14 = sub_103a8(a1->field_0, &v2);
    a1->field_10 = a1->field_10 + 1;
    if ((char)a0->field_58 != 1)
        return v14;
    v15 = sub_404c(*(long long *)&a0->padding_a0[40], 8);
    sub_8880(v15, 1);
    v9 = v2;
    sub_1c9f0(&a0[4].padding_a0[48], &v9);
    v16 = sub_12484(&a0[4].padding_a0[48], &v9);
    v16->field_8 = v15;
    return v16;
}
