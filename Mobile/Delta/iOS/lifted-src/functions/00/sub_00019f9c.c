/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x19f9c..0x1a030 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_19f9c_1 {
    char padding_0[216];
    long long field_d8;
} st_19f9c_1;

typedef struct st_19f9c_2 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    unsigned long long field_30;
} st_19f9c_2;

typedef struct st_19f9c_0 {
    char field_0;
} st_19f9c_0;


double sub_19f9c(st_19f9c_1 *a0, st_19f9c_2 *node, unsigned long long a2)
{
    unsigned long long i;  // x19
    st_19f9c_2 *iter;  // x0
    unsigned long long v6;  // x8
    uint128_t v7;  // q0
    uint128_t v8;  // q1
    uint128_t v9;  // q2
    unsigned long v11;  // d0
    st_19f9c_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_19f9c_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    i = a2;
    v1 = &v0;
    v0 = &v1;
    if (!a2)
        return v11;
    iter = sub_404c(a0->field_d8, i * 56);
    do
    {
        v6 = i;
        v7 = node->field_0;
        v8 = node->field_10;
        v9 = node->field_20;
        iter->field_30 = node->field_30;
        iter->field_10 = v8;
        iter->field_20 = v9;
        iter->field_0 = v7;
        iter += 1;
        node += 1;
        i = v6 - 1;
    } while (i);
    return *(unsigned long long *)&v7;
}
