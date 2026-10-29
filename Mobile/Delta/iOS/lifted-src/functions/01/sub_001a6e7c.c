/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a6e7c..0x1a6f3c (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a6e7c_0 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    unsigned long long field_30;
    uint128_t field_38;
    unsigned long long field_48;
    char field_50[13];
    unsigned long long field_55;
} st_1a6e7c_0;

typedef struct st_1a6e7c_1 {
    char field_0;
} st_1a6e7c_1;


double sub_1a6e7c(unsigned long long *a0, st_1a6e7c_0 *a1)
{
    unsigned long long v4;  // x0
    uint128_t v5;  // q0
    uint128_t v6;  // q0
    unsigned long long v7;  // x8
    st_1a6e7c_1 **v0;  // [bp-0x30], Other Possible Types: char
    st_1a6e7c_1 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_1ad9f8();
    if (v4 == a0[5] + a0[4])
        sub_1a4660(a0);
    sub_1b1cac(a0);
    v5 = a1->field_10;
    a1->field_0 = a1->field_0;
    a1->field_10 = v5;
    memset(&a1->field_20, 0, 24);
    a1->field_20 = a1->field_20;
    a1->field_30 = a1->field_30;
    memset(&a1->field_20, 0, 24);
    memset(&(&a1->field_30)[1], 0, 24);
    v6 = *(int128_t *)&(&a1->field_30)[1];
    *(uint128_t *)&(&a1->field_30)[1] = v6;
    *(long long *)((char *)&a1->field_38 + 8) = *(long long *)((char *)&a1->field_38 + 8);
    memset(&(&a1->field_30)[1], 0, 24);
    v7 = *(long long *)((char *)&a1->field_48 + 5);
    a1->field_48 = a1->field_48;
    *(unsigned long long *)((char *)&a1->field_48 + 5) = v7;
    a0[5] = a0[5] + 1;
    return (unsigned long long)v6;
}
