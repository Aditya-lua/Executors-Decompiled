/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1533e4..0x153484 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1533e4_0 {
    unsigned long long field_0;
    char field_8;
    char padding_9[31];
    unsigned int field_28;
    char padding_2c[4];
    uint128_t field_30;
} st_1533e4_0;

typedef struct st_1533e4_1 {
    char field_0;
} st_1533e4_1;


double sub_1533e4(unsigned long long *a0, st_1533e4_0 *a1)
{
    unsigned long long v4;  // x0
    uint128_t v5;  // q0
    st_1533e4_1 **v0;  // [bp-0x40], Other Possible Types: char
    st_1533e4_1 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_15390c();
    if (v4 == a0[5] + a0[4])
        sub_153240(a0);
    sub_15a4d0(a0);
    a1->field_0 = a1->field_0;
    a1->field_8 = 0;
    a1->field_28 = 0xffffffff;
    sub_15b73c(&a1->field_8, &a1->field_8);
    v5 = a1->field_30;
    a1->field_30 = v5;
    a0[5] = a0[5] + 1;
    return (unsigned long long)v5;
}
