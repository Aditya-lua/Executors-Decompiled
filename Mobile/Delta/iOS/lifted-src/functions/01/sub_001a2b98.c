/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a2b98..0x1a2c10 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a2b98_0 {
    uint128_t field_0;
    unsigned long long field_10;
} st_1a2b98_0;


st_1a2b98_0 * sub_1a2b98(unsigned long a0, st_1a2b98_0 *node, st_1a2b98_0 *a2, st_1a2b98_0 *a3)
{
    st_1a2b98_0 *iter;  // x19
    uint128_t v9;  // q0
    unsigned long v0;  // [bp-0x50]
    st_1a2b98_0 **v1;  // [bp-0x48]
    st_1a2b98_0 **v2;  // [bp-0x40]
    char v3;  // [bp-0x38]
    st_1a2b98_0 *v4;  // [bp-0x30]
    st_1a2b98_0 *v5;  // [bp-0x28]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    iter = a3;
    v5 = a3;
    v4 = a3;
    v0 = a0;
    v1 = &v4;
    v2 = &v5;
    if (node != a2)
    {
        do
        {
            v9 = node->field_0;
            iter->field_10 = node->field_10;
            iter->field_0 = v9;
            iter += 1;
            node += 1;
        } while (node != a2);
        v5 = iter;
    }
    v3 = 1;
    sub_1b07d0(&v0);
    return iter;
}
