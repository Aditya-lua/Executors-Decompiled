/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x20e70..0x20f00 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_20e70_1 {
    char padding_0[216];
    long long field_d8;
} st_20e70_1;

typedef struct st_20e70_2 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned int field_20;
} st_20e70_2;

typedef struct st_20e70_0 {
    char field_0;
} st_20e70_0;


double sub_20e70(st_20e70_1 *a0, st_20e70_2 *node, unsigned long long a2)
{
    unsigned long long i;  // x19
    st_20e70_2 *iter;  // x0
    unsigned long long v6;  // x8
    uint128_t v7;  // q0
    uint128_t v8;  // q1
    unsigned long v10;  // d0
    st_20e70_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_20e70_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    i = a2;
    v1 = &v0;
    v0 = &v1;
    if (!a2)
        return v10;
    iter = sub_404c(a0->field_d8, i * 36);
    do
    {
        v6 = i;
        v7 = node->field_0;
        v8 = node->field_10;
        iter->field_20 = node->field_20;
        iter->field_0 = v7;
        iter->field_10 = v8;
        iter += 1;
        node += 1;
        i = v6 - 1;
    } while (i);
    return *(unsigned long long *)&v7;
}
