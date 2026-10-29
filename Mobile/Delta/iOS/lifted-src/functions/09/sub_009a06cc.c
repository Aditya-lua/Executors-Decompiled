/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a06cc..0x9a0728 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a06cc_0 {
    struct st_9a06cc_0 *field_0;
    char field_1;
    char padding_2[2];
    char field_4;
} st_9a06cc_0;


int sub_9a06cc(st_9a06cc_0 **a0, unsigned int a1, unsigned int a2, st_9a06cc_0 *a3)
{
    st_9a06cc_0 *v0;  // x8
    st_9a06cc_0 *iter;  // x0
    unsigned long v2;  // cc_dep1
    unsigned int v3;  // w10
    unsigned long long v4;  // 4112
    unsigned long long v5;  // 4102
    unsigned long long v6;  // 4112
    unsigned long long v7;  // 4102

    if (!a0[1])
        return 0;
    v0 = 0;
    iter = *a0;
    do
    {
        if ((short)iter->field_0 == a2)
        {
            v2 = a1;
            if (a1 != 2)
            {
                v3 = *(int *)((char *)&iter->field_0 + 4);
                if (v3 != a1)
                {
                    v4 = arm64g_calculate_condition(19, v2, 2, 0);
                    v5 = arm64g_calculate_condition(19, (v4 & 1 ? v3 : 0x40000000), (v4 & 1 ? 2 : 0), 0);
                    if (!(v5 & 1))
                    {
                        if (a3)
                        {
                            a3->field_0 = v0;
                            return (unsigned int)iter;
                        }
                        return (unsigned int)iter;
                    }
                }
                else
                {
                    v6 = arm64g_calculate_condition(19, v2, 2, 0);
                    v7 = arm64g_calculate_condition(16, (v6 & 1 ? v3 : 0x40000000), (v6 & 1 ? 2 : 0), 0);
                    if (!(v7 & 1))
                    {
                        if (a3)
                        {
                            a3->field_0 = v0;
                            return (unsigned int)iter;
                        }
                        return (unsigned int)iter;
                    }
                }
            }
            else if (a3)
            {
                a3->field_0 = v0;
                return (unsigned int)iter;
            }
            else
            {
                return (unsigned int)iter;
            }
        }
    } while ((v0 = (char *)&v0->field_0 + 1, iter = &iter[4].field_1, a0[1] != v0));
    return 0;
}
