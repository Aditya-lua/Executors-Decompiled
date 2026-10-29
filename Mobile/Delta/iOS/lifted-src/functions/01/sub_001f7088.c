/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f7088..0x1f70f8 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f7088_1 {
    uint128_t field_0;
} st_1f7088_1;

typedef struct st_1f7088_0 {
    struct st_1f7088_1 *field_0;
    long long field_8;
    long long field_10;
} st_1f7088_0;

typedef struct st_1f7088_2 {
    char field_0;
} st_1f7088_2;


double sub_1f7088(st_1f7088_0 *a0, uint128_t *a1)
{
    long long v4;  // x8
    unsigned long v5;  // x21
    uint128_t v6;  // q0
    st_1f7088_2 **v0;  // [bp-0x40], Other Possible Types: char
    st_1f7088_2 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0->field_8;
    v5 = a0->field_8 + 16;
    if (v5 > (unsigned long long)a0->field_10)
    {
        sub_1f9de0(a0, v5);
        v4 = a0->field_8;
    }
    v6 = *a1;
    *(uint128_t *)((char *)a0->field_0 + v4) = v6;
    a0->field_8 = v5;
    return (unsigned long long)v6;
}
