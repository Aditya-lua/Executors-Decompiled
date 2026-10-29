/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa01020..0xa0118c (364 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a01020_0 {
    char padding_0[32];
    long long field_20;
} st_a01020_0;


long long sub_a01020(st_a01020_0 *a0, unsigned long a1, unsigned long long *a2)
{
    long long v2;  // x19
    long long v3;  // x0
    unsigned long v8;  // 4110
    unsigned long v9;  // cc_op
    unsigned long v10;  // cc_dep1
    unsigned long long v11;  // 4110
    unsigned long v12;  // cc_op
    unsigned long v13;  // cc_dep1
    unsigned long v14;  // cc_dep2
    unsigned long v15;  // cc_ndep
    unsigned long v16;  // 4110
    unsigned long long v17;  // 4110
    long long v4;  // x23
    unsigned long long v18;  // 4110
    unsigned long long v19;  // 4102
    long long v5;  // x24
    unsigned long long v20;  // 4110
    unsigned long long v21;  // 4102
    long long v6;  // x22
    long long v22;  // x26
    long long v23;  // x0
    long long v24;  // x19
    long long v7;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_20;
    v3 = sub_c4c40(v2);
    v4 = sub_9ffdd0(v2);
    v5 = sub_c4ba8(v2);
    v6 = sub_a0212c(v2);
    v7 = sub_9ffde0(v2);
    if (v3)
    {
        v8 = arm64g_calculate_condition(v12 | 16, v13, v14, v15);
        v9 = 4;
        v10 = (v8 & 1 ? v5 : 0x40000000);
        v11 = arm64g_calculate_condition(20, v10, 0, 0);
        if (!(v11 & 1))
            goto LABEL_a01086;
LABEL_a01085:
        v18 = arm64g_calculate_condition(v9 | 16, v10, 0, 0);
        v19 = arm64g_calculate_condition(20, (v18 & 1 ? v4 : 0x40000000), 0, 0);
        if (v19 & 1)
            goto LABEL_a01094;
    }
    else
    {
        v16 = arm64g_calculate_condition(v12 | 16, v13, v14, v15);
        v9 = 0;
        v10 = (v16 & 1 ? v5 : 0x40000000);
        v17 = arm64g_calculate_condition(16, v10, 0, 0);
        if (v17 & 1)
            goto LABEL_a01085;
LABEL_a01086:
        v20 = arm64g_calculate_condition(v9 | 16, v10, 0, 0);
        v21 = arm64g_calculate_condition(16, (v20 & 1 ? v4 : 0x40000000), 0, 0);
        if (v21 & 1)
        {
LABEL_a01094:
            v22 = v7;
            v23 = sub_a6ee78();
            if (!v23)
                return v23;
            v24 = v23;
            if (sub_a6f188() && sub_a6f188(v24, "q", v5) && sub_a6f188(v24, "g", v4))
            {
                if (!v6)
                {
                    if (!v22)
                        goto LABEL_a01134;
LABEL_a01118:
                    if (sub_a6f188(v24, "priv", v22))
                    {
LABEL_a01134:
                        if (sub_a6f570(v24))
                            a2();
                    }
                }
                else if (sub_a6f188(v24, "pub", v6))
                {
                    if (v22)
                        goto LABEL_a01118;
                    goto LABEL_a01134;
                }
            }
            sub_a6eed4(v24);
            return 0;
        }
    }
    return 0;
}
