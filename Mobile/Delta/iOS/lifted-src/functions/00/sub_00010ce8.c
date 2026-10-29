/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x10ce8..0x10d5c (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_10ce8_0 {
    char field_0;
} st_10ce8_0;


char * sub_10ce8(unsigned long a0, char *a1, char *a2)
{
    char *iter;  // x0
    char *v5;  // x8
    unsigned long v8;  // cc_dep2
    unsigned long v9;  // cc_ndep
    unsigned long long v10;  // 4110
    unsigned long long v11;  // 4102
    unsigned long v12;  // cc_op
    unsigned long v13;  // cc_dep1
    unsigned int v14;  // w9
    unsigned long long v6;  // 4110
    unsigned long long v7;  // 4102
    st_10ce8_0 **v0;  // [bp-0x38], Other Possible Types: char
    st_10ce8_0 *v1;  // [bp-0x30]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    iter = sub_18494();
    v5 = iter + 1;
    if (iter != a1)
    {
        v6 = arm64g_calculate_condition(v12 | 16, v13, v8, v9);
        v7 = arm64g_calculate_condition(20, (v6 & 1 ? v5 : 0x40000000), (v6 & 1 ? a1 : 0), 0);
        if (!(v7 & 1))
            return iter;
    }
    else
    {
        v10 = arm64g_calculate_condition(v12 | 16, v13, v8, v9);
        v11 = arm64g_calculate_condition(16, (v10 & 1 ? v5 : 0x40000000), (v10 & 1 ? a1 : 0), 0);
        if (!(v11 & 1))
            return iter;
    }
    do
    {
        v14 = *v5;
        if (v14 != *a2)
        {
            *iter = v14;
            iter += 1;
        }
    } while ((v5 += 1, v5 != a1));
    return iter;
}
