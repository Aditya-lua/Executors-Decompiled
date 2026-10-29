/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa6fe0..0xaa70f4 (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa6fe0_0 {
    struct st_aa6fe0_0 *field_0;
    char field_1;
    char padding_2[2];
    char field_4;
    char padding_5[7];
    char field_c;
    char padding_d[3];
    unsigned long long field_10;
} st_aa6fe0_0;


st_aa6fe0_0 * sub_aa6fe0(st_aa6fe0_0 **a0, st_aa6fe0_0 **a1)
{
    unsigned long v2;  // x22
    st_aa6fe0_0 *v3;  // x0
    st_aa6fe0_0 *v12;  // x17
    unsigned long v13;  // cc_dep1
    unsigned long v14;  // cc_dep2
    st_aa6fe0_0 *v15;  // w16
    unsigned long long v16;  // 4105
    unsigned long long v17;  // 4105
    unsigned long long v18;  // 4109
    unsigned long long v19;  // 4109
    unsigned long long v20;  // 4109
    unsigned long long v21;  // 4109
    st_aa6fe0_0 *v4;  // w8
    st_aa6fe0_0 *v22;  // x16
    st_aa6fe0_0 *iter;  // w9
    st_aa6fe0_0 *node;  // w11
    unsigned int v7;  // w10
    st_aa6fe0_0 *v8;  // w12
    st_aa6fe0_0 *v9;  // w13
    unsigned long long v10;  // x14
    st_aa6fe0_0 *v11;  // x15
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1 + 1;
    v3 = sub_a6bf4c();
    if (!v3)
        return v3;
    v4 = (st_aa6fe0_0 *)0;
    iter = (st_aa6fe0_0 *)0;
    node = (st_aa6fe0_0 *)0;
    v7 = *((char *)&v3->field_0 + 4) & 0xfffffffe;
    *((char *)&v3->field_0 + 4) = v7;
    v8 = (st_aa6fe0_0 *)*(int *)a0;
    v9 = (st_aa6fe0_0 *)*(int *)a1;
    v10 = 8;
    while (1)
    {
        if (v8 > iter)
        {
            v11 = (char *)a0 + iter * 24 + 1;
            if (node < v9)
            {
                v12 = v2 + node * 24;
                v13 = (int)v11->field_0;
                v14 = (int)v12->field_0;
                if ((int)v11->field_0 != (int)v12->field_0)
                {
                    v15 = node;
                    v16 = arm64g_calculate_condition(195, v13, v14, 0);
                    if (!(v16 & 1))
                        goto LABEL_aa7076;
                    goto LABEL_aa7075;
                }
                else
                {
                    v15 = (char *)&node->field_0 + 1;
                    v17 = arm64g_calculate_condition(195, v13, v14, 0);
                    if (v17 & 1)
                    {
LABEL_aa7075:
                        v11 = v12;
                        v18 = arm64g_calculate_condition(195, v13, v14, 0);
                        if (!(v18 & 1))
                            goto LABEL_aa707a;
                        goto LABEL_aa7079;
                    }
                    else
                    {
LABEL_aa7076:
                        v19 = arm64g_calculate_condition(195, v13, v14, 0);
                        if (v19 & 1)
                        {
LABEL_aa7079:
                            v20 = arm64g_calculate_condition(211, v13, v14, 0);
                            if (!(v20 & 1))
                                goto LABEL_aa707e;
                            goto LABEL_aa707d;
                        }
                        else
                        {
LABEL_aa707a:
                            iter = (char *)&iter->field_0 + 1;
                            v21 = arm64g_calculate_condition(211, v13, v14, 0);
                            if (v21 & 1)
                            {
LABEL_aa707d:
                                node = v15;
                            }
                            else
                            {
LABEL_aa707e:
                                node = (char *)&node->field_0 + 1;
                            }
                        }
                    }
                }
            }
            else
            {
                iter = (char *)&iter->field_0 + 1;
            }
        }
        else
        {
            if (v9 <= node)
                break;
            v11 = v2 + node * 24;
            node = (char *)&node->field_0 + 1;
        }
LABEL_aa7080:
        v22 = (char *)v3 + v10;
        *(int128_t *)&v22->field_0 = *(int128_t *)&v11->field_0;
        *(long long *)&v22->padding_5[4] = *(long long *)&v11->padding_5[4];
        v7 |= v11->padding_5[0] & 1;
        *((char *)&v3->field_0 + 4) = v7;
        v4 = (char *)&v4->field_0 + 1;
        v10 += 24;
        goto LABEL_aa7080;
    }
    *(unsigned int *)&v3->field_0 = (unsigned int)v4;
    return v3;
}
