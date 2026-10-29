/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f0e7c..0x1f0f04 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f0e7c_1 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
} st_1f0e7c_1;

typedef struct st_1f0e7c_0 {
    char field_0;
} st_1f0e7c_0;


double sub_1f0e7c(unsigned long long *a0, unsigned long a1, st_1f0e7c_1 *a2)
{
    unsigned long long i;  // x21
    unsigned long long v5;  // x8
    st_1f0e7c_1 *v6;  // x9
    uint128_t v7;  // q0
    uint128_t v8;  // q1
    unsigned long v9;  // d0
    unsigned long v10;  // d0
    st_1f0e7c_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1f0e7c_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    i = a0[1];
    sub_1ec7e8();
    if (a0[1] <= i)
        return v10;
    v5 = i * 40;
    do
    {
        v6 = *a0 + v5;
        v7 = a2->field_0;
        v8 = a2->field_10;
        v6->field_20 = a2->field_20;
        v6->field_0 = v7;
        v6->field_10 = v8;
        i += 1;
        v5 += 40;
    } while (i < a0[1]);
    return v9;
}
