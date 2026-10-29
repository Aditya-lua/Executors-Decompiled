/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e7df8..0x9e8040 (584 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e7df8_0 {
    long long field_0;
    char field_1;
    char padding_2[6];
    struct st_9e7df8_0 *field_8;
    unsigned int field_10;
} st_9e7df8_0;


st_9e7df8_0 * sub_9e7df8(st_9e7df8_0 *a0, st_9e7df8_0 *a1, st_9e7df8_0 *a2, long long a3)
{
    st_9e7df8_0 *v3;  // x20
    unsigned long v4;  // x26
    unsigned long v8;  // cc_dep1
    unsigned long v9;  // cc_dep2
    unsigned long v10;  // cc_ndep
    unsigned long long v11;  // 4112
    unsigned long long v12;  // 4102
    unsigned long v13;  // cc_op
    unsigned long v5;  // x24
    st_9e7df8_0 *v14;  // x23
    unsigned long long v15;  // x25
    st_9e7df8_0 *v16;  // w8
    char v17;  // x0
    st_9e7df8_0 *v18;  // x0
    st_9e7df8_0 *v19;  // x28
    char v20;  // x8
    unsigned long long v21;  // x27
    unsigned long long v22;  // 4112
    unsigned long long v23;  // 4102
    unsigned long long v24;  // 4112
    unsigned long long v25;  // 4102
    long long v26;  // x26
    long long v27;  // x26
    unsigned long long v6;  // 4112
    unsigned long long v7;  // 4102
    unsigned int v0;  // [bp-0x64]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a0;
    v4 = *(int *)&a1->field_1;
    v5 = *(int *)&a2->field_1;
    if ((unsigned int)v4)
    {
        v6 = arm64g_calculate_condition(v13 | 16, v8, v9, v10);
        v7 = arm64g_calculate_condition(19, (v6 & 1 ? v5 & 0xffffffff : 0x40000000), 0, 0);
        if (v7 & 1)
            goto LABEL_9e7e40;
    }
    else
    {
        v11 = arm64g_calculate_condition(v13 | 16, v8, v9, v10);
        v12 = arm64g_calculate_condition(16, (v11 & 1 ? v5 & 0xffffffff : 0x40000000), 0, 0);
        if (v12 & 1)
        {
LABEL_9e7e40:
            sub_9de064(a3);
            if (v3 != a1 && !(v14 = v3, v14 == a2) || !(v14 = sub_9de208(a3), !v14))
            {
                if ((unsigned int)v4 != 8 || (unsigned int)v5 != 8)
                {
                    v15 = v5 + v4;
                    if ((int)v4 >= 16 && (int)v5 >= 16 && (v16 = (st_9e7df8_0 *)(unsigned int)(v4 - v5), 2 >= (unsigned int)(v4 - v5) + 1))
                    {
                        v17 = sub_9e4630();
                        v18 = sub_9de208(a3);
                        if (v18)
                        {
                            v19 = v18;
                            v20 = v17 - 1;
                            v21 = 1 << (v20 & 31);
                            v0 = v4 - v21;
                            if ((int)v4 <= (int)v21)
                            {
                                v22 = arm64g_calculate_condition(v13 | 208, v8, v9, v10);
                                v23 = arm64g_calculate_condition(211, (v22 & 1 ? v5 & 0xffffffff : 0), (v22 & 1 ? v21 & 0xffffffff : 0), 0);
                                if (v23 & 1)
                                    goto LABEL_9e7fc0;
                                goto LABEL_9e7f14;
                            }
                            v24 = arm64g_calculate_condition(v13 | 208, v8, v9, v10);
                            v25 = arm64g_calculate_condition(208, (v24 & 1 ? v5 & 0xffffffff : 0), (v24 & 1 ? v21 & 0xffffffff : 0), 0);
                            if (!(v25 & 1))
                            {
LABEL_9e7f14:
                                v26 = 8 << (v20 & 31);
                                if (sub_9e4cdc(v19, v26) && sub_9e4cdc(v14, v26))
                                {
                                    sub_9e7940(v14->field_0, a1->field_0, a2->field_0, v21, v0, v5 - v21, v19->field_0);
                                    *(unsigned int *)&v14->field_1 = v15;
                                    goto LABEL_9e7f90;
                                }
                            }
                            else
                            {
LABEL_9e7fc0:
                                v27 = 4 << (v20 & 31);
                                if (sub_9e4cdc(v19, v27) && sub_9e4cdc(v14, v27))
                                {
                                    sub_9e7384(v14->field_0, a1->field_0, a2->field_0, v21, v0, v5 - v21, v19->field_0);
                                    *(unsigned int *)&v14->field_1 = v15;
LABEL_9e7f90:
                                    *(int *)&v14->field_8 = (int)a2->field_8 ^ (int)a1->field_8;
                                    if (v14 == v3 || sub_9e4c34(v3, v14))
                                    {
                                        sub_9de17c(a3);
                                        return 1;
                                    }
                                }
                            }
                        }
                    }
                    else
                    {
                        if (sub_9e4cdc(v14, v15))
                        {
                            *(unsigned int *)&v14->field_1 = v15;
                            sub_9e77f0(v14->field_0, a1->field_0, v4, a2->field_0, v5);
                            goto LABEL_9e7f90;
                        }
                    }
                }
                else if (sub_9e4cdc(v14, 16))
                {
                    *(unsigned int *)&v14->field_1 = 16;
                    sub_9dbcc4(v14->field_0, a1->field_0, a2->field_0);
                    goto LABEL_9e7f90;
                }
            }
            sub_9de17c(a3);
            return 0;
        }
    }
    sub_9e5b4c(v3);
    return 1;
}
