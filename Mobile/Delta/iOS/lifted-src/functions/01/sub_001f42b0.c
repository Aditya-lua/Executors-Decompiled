/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f42b0..0x1f4328 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f42b0_0 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
} st_1f42b0_0;

typedef struct st_1f42b0_1 {
    char field_0;
} st_1f42b0_1;


double sub_1f42b0(unsigned long long *a0, st_1f42b0_0 *a1)
{
    unsigned long long v4;  // x21
    unsigned long v5;  // x8
    unsigned long v6;  // x1
    st_1f42b0_0 *v7;  // x8
    uint128_t v8;  // q0
    uint128_t v9;  // q1
    st_1f42b0_1 **v0;  // [bp-0x40], Other Possible Types: char
    st_1f42b0_1 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0[1];
    v5 = a0[2];
    v6 = v4 + 1;
    a0[1] = v6;
    if (v6 > v5)
        sub_1f070c(a0);
    v7 = *a0 + 40 * v4;
    v8 = a1->field_0;
    v9 = a1->field_10;
    v7->field_20 = a1->field_20;
    v7->field_0 = v8;
    v7->field_10 = v9;
    return (unsigned long long)v8;
}
