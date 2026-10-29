/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7b720..0xa7b78c (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7b720_0 {
    struct st_a7b720_0 *field_0;
    unsigned long long field_8;
    struct st_a7b720_0 *field_10;
    struct st_a7b720_0 *field_18;
} st_a7b720_0;


st_a7b720_0 * sub_a7b720(st_a7b720_0 *a0, unsigned long long a1)
{
    st_a7b720_0 *v0;  // x8
    unsigned long iter;  // x9
    unsigned long v2;  // cc_op
    unsigned long v3;  // cc_dep1
    unsigned long v4;  // cc_dep2
    unsigned long long node;  // x10
    unsigned long v6;  // 4110
    unsigned long long v7;  // 4108
    unsigned long v8;  // 4110
    unsigned long long v9;  // 4108

    if (!a0)
        return a0;
    if (!a0->field_10 || a0->field_8 < a1)
        return 0;
    v0 = a0->field_18;
    if (v0)
    {
        iter = (int)a0->field_0;
        v2 = 3;
        v3 = iter & 0xffffffff;
        v4 = 2;
        if ((int)iter >= 2)
        {
            node = iter * 4 - 4;
            while (1)
            {
                v0 = (&v0->field_0)[a1 >> ((char)node & 63) & 15];
                if (v0)
                {
                    v6 = arm64g_calculate_condition(v2 | 16, v3, v4, 0);
                    v2 = 4;
                    v3 = (v6 & 1 ? iter : 0);
                    v4 = (v6 & 1 ? 2 : 0);
                    iter -= 1;
                    node -= 4;
                    v7 = arm64g_calculate_condition(132, v3, v4, 0);
                    if (!(v7 & 1))
                        break;
                }
                else
                {
                    v8 = arm64g_calculate_condition(v2 | 16, v3, v4, 0);
                    v2 = 0;
                    v3 = (v8 & 1 ? iter : 0);
                    v4 = (v8 & 1 ? 2 : 0);
                    iter -= 1;
                    node -= 4;
                    v9 = arm64g_calculate_condition(128, v3, v4, 0);
                    if (!(v9 & 1))
                        break;
                }
            }
        }
    }
    if (v0)
        return (&v0->field_0)[a1 & 15];
    return 0;
}
