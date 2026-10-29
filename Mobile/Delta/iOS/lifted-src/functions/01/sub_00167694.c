/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x167694..0x16772c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_167694_0 {
    char field_0;
} st_167694_0;


uint128_t * sub_167694(unsigned long a0, uint128_t *a1, unsigned long a2)
{
    uint128_t *node;  // x20
    unsigned long v11;  // cc_dep1
    unsigned long v12;  // cc_dep2
    unsigned long v13;  // cc_ndep
    unsigned long long v14;  // 4110
    unsigned long long v15;  // 4102
    unsigned long v16;  // cc_op
    uint128_t v17;  // q0
    uint128_t *iter;  // x21
    unsigned long long v9;  // 4110
    unsigned long long v10;  // 4102
    st_167694_0 **v0;  // [bp-0x58], Other Possible Types: char
    st_167694_0 *v1;  // [bp-0x50]
    unsigned long v2;  // [bp-0x48]
    uint128_t v3;  // [bp-0x40]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v2 = a2;
    v0 = &v1;
    node = sub_168514();
    iter = node + 1;
    if (node != a1)
    {
        v9 = arm64g_calculate_condition(v16 | 16, v11, v12, v13);
        v10 = arm64g_calculate_condition(20, (v9 & 1 ? iter : 0x40000000), (v9 & 1 ? a1 : 0), 0);
        if (!(v10 & 1))
            return node;
    }
    else
    {
        v14 = arm64g_calculate_condition(v16 | 16, v11, v12, v13);
        v15 = arm64g_calculate_condition(16, (v14 & 1 ? iter : 0x40000000), (v14 & 1 ? a1 : 0), 0);
        if (!(v15 & 1))
            return node;
    }
    do
    {
        if (!(sub_1685c8(&v2, iter) & 1))
        {
            v17 = *iter;
            *(unsigned long long *)iter = 0;
            *(unsigned long long *)((char *)iter + 8) = 0;
            v3 = *node;
            *node = v17;
            node += 1;
            sub_60b78(&v3);
        }
    } while ((iter += 1, iter != a1));
    return node;
}
