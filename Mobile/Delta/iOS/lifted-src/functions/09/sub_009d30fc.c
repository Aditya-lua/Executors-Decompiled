/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d30fc..0x9d32e4 (488 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d30fc_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
    unsigned int field_10;
    int field_14;
} st_9d30fc_0;

typedef struct st_9d30fc_1 {
    char padding_0[64];
    struct st_9d30fc_0 *field_40;
} st_9d30fc_1;


unsigned long long sub_9d30fc(st_9d30fc_1 *a0, char *a1, unsigned long long a2)
{
    st_9d30fc_0 *v2;  // x23
    char *iter;  // x19
    unsigned long long v12;  // 4110
    unsigned long long v13;  // 4102
    unsigned long long v14;  // x9
    int v15;  // w8
    unsigned long long v16;  // w9
    unsigned long long v17;  // w10
    unsigned long long v18;  // w9
    unsigned int v19;  // w22
    unsigned long long v20;  // x0
    unsigned long long *v21;  // x22
    unsigned long v4;  // x24
    unsigned long long v22;  // w25
    unsigned long long v23;  // w25
    unsigned long long v24;  // w0
    unsigned long v25;  // cc_dep1
    unsigned long long *v26;  // x22
    unsigned long long v27;  // w8
    unsigned long long v28;  // 4112
    unsigned long long v29;  // 4106
    unsigned long long v30;  // 4112
    unsigned long long v31;  // 4106
    unsigned long long v5;  // x8
    unsigned long long v32;  // w8
    unsigned long v33;  // x21
    unsigned long long v6;  // x21
    unsigned long long v7;  // x10
    unsigned long long v8;  // w8
    unsigned long v9;  // cc_dep1
    unsigned long long v10;  // 4110
    unsigned long long v11;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1)
    {
        return 0;
    }
    else if (a2)
    {
        v2 = a0->field_40;
        if (!v2)
        {
            return 0;
        }
        else if (*(long long *)&a0[1].padding_0[0])
        {
            iter = a1;
            v4 = a2 - 1;
            sub_9d3d58(a0, 15);
            v5 = v2->field_10;
            if ((int)v5 >= 1)
            {
                if (a2 > 1)
                {
                    v6 = 0;
LABEL_9d3170:
                    v7 = v6;
                    v8 = *(char *)(v2->field_8 + v2->field_14 + v6);
                    iter[v6] = v8;
                    v9 = v8 & 0xff;
                    if (v8 == 10)
                    {
                        v6 = v7 + 1;
                        v5 = v2->field_10;
                        iter = &iter[v6];
                        v14 = 1;
                        goto LABEL_9d31d0;
                    }
                    v6 = v7 + 1;
                    v5 = v2->field_10;
                    if ((long long)v6 < (long long)v5)
                    {
                        v10 = arm64g_calculate_condition(179, v9, 10, 0);
                        v11 = arm64g_calculate_condition(52, (v10 & 1 ? v6 : 0x20000000), (v10 & 1 ? v4 : 0), 0);
                        goto LABEL_9d3198;
                        if (v11 & 1)
                            continue;
                    }
                    v12 = arm64g_calculate_condition(179, v9, 10, 0);
                    v13 = arm64g_calculate_condition(48, (v12 & 1 ? v6 : 0x20000000), (v12 & 1 ? v4 : 0), 0);
                    if (!(v13 & 1))
                    {
LABEL_9d3198:
                        v14 = 0;
                        iter = &iter[v7 + 1];
                        goto LABEL_9d31d0;
                    }
                    goto LABEL_9d3170;
                }
                else
                {
                    v14 = 0;
                    v6 = 0;
                }
LABEL_9d31d0:
                v15 = v2->field_14 + (unsigned int)v6;
                v2->field_10 = v5 - v6;
                v2->field_14 = v15;
                if (v14 & 1)
                {
                    *iter = 0;
                    return v6;
                }
                v4 -= v6;
                if (!(unsigned int)v4)
                    goto LABEL_9d3298;
            }
            else
            {
                v6 = 0;
                v15 = v2->field_14;
            }
            v16 = (unsigned int)v4 + v15;
            v17 = v16 + 0x1000;
            if (v17 < 0)
                v18 = v16 + 0x1fff;
            else
                v18 = v17;
            v19 = v18 & 0xfffff000;
            v20 = v2->field_8;
            if ((int)v19 > (int)v2->field_0)
            {
                v20 = sub_a6c1b4(v20, v19, "crypto/bio/bf_readbuff.c", 97);
                if (!v20)
                    return 0;
                v2->field_8 = v20;
                v2->field_0 = v19;
                v15 = v2->field_14;
            }
            if ((int)v4 >= 1)
            {
                v21 = v20 + v15;
                v22 = 1;
                while (1)
                {
                    v23 = v22;
                    v24 = (unsigned int)sub_9d3d84(*(long long *)&a0[1].padding_0[0], v21, 1);
                    v25 = v24;
                    if (v24 <= 0)
                    {
                        sub_9d5054(a0);
                        *iter = 0;
                        v32 = (unsigned int)v6 + v23 - 1;
                        if (0 < v32)
                            v33 = v32;
                        else
                            v33 = v24;
                        return v33;
                    }
                    *iter = *(char *)v21;
                    iter += 1;
                    v2->field_14 = v2->field_14 + 1;
                    v26 = (char *)v21 + 1;
                    v27 = v23 + 1;
                    if (*(char *)v21 != 10)
                    {
                        v28 = arm64g_calculate_condition(19, v25, 0, 0);
                        v22 = v27;
                        v29 = arm64g_calculate_condition(179, (v28 & 1 ? v23 : 0), (v28 & 1 ? v4 & 0xffffffff : 0), 0);
                        v21 = v26;
                        if (v29 & 1)
                            continue;
                        goto LABEL_9d3290;
                    }
                    else
                    {
                        v30 = arm64g_calculate_condition(19, v25, 0, 0);
                        v22 = v27;
                        v31 = arm64g_calculate_condition(176, (v30 & 1 ? v23 : 0), (v30 & 1 ? v4 & 0xffffffff : 0), 0);
                        v21 = v26;
                        if (!(v31 & 1))
                        {
LABEL_9d3290:
                            v6 = (unsigned int)v6 + v27 - 1;
                            break;
                        }
                    }
                }
            }
LABEL_9d3298:
            *iter = 0;
            return v6;
        }
        else
        {
            return 0;
        }
    }
    else
    {
        return 0;
    }
}
