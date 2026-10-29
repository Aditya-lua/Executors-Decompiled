/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x17664..0x176e0 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_17664_1 {
    char padding_0[216];
    long long field_d8;
} st_17664_1;

typedef struct st_17664_0 {
    char field_0;
} st_17664_0;


double sub_17664(st_17664_1 *a0, uint128_t *iter, unsigned long long a2)
{
    unsigned long long i;  // x19
    uint128_t *node;  // x0
    unsigned long long v6;  // x8
    uint128_t v7;  // q0
    uint128_t v8;  // q1
    unsigned long v10;  // d0
    st_17664_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_17664_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    i = a2;
    v1 = &v0;
    v0 = &v1;
    if (!a2)
        return v10;
    node = sub_404c(a0->field_d8, i * 32);
    do
    {
        v6 = i;
        v7 = *iter;
        v8 = iter[1];
        iter += 2;
        *node = v7;
        node[1] = v8;
        node += 2;
        i = v6 - 1;
    } while (i);
    return *(unsigned long long *)&v7;
}
