/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x995d30..0x995ec0 (400 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_995d30_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_995d30_0;


unsigned long long sub_995d30(long long idx, char *a1, long long a2, st_995d30_0 *a3)
{
    unsigned long v9;  // cc_op
    unsigned long v10;  // cc_dep1
    unsigned long long v13;  // 4112
    unsigned long long v14;  // 4102
    unsigned long v15;  // cc_dep2
    unsigned long v16;  // cc_ndep
    unsigned long long v17;  // x24
    unsigned long long v18;  // x23
    unsigned long long v19;  // x22
    unsigned long long v20;  // x21
    unsigned long long v21;  // x20
    unsigned long long v22;  // x19
    unsigned long long v23;  // x30
    unsigned long v24;  // x2
    unsigned long v25;  // x8
    unsigned long long v26;  // x21
    unsigned long long v27;  // x8
    unsigned int v28;  // w9
    unsigned long long v29;  // x9
    unsigned long long v30;  // x9
    unsigned long long v31;  // x8
    unsigned long long v11;  // 4112
    unsigned long long v12;  // 4102
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (*(int *)(idx + 4304))
    {
        v11 = arm64g_calculate_condition(v9 | 16, v10, v15, v16);
        v12 = arm64g_calculate_condition(19, (v11 & 1 ? *a1 : 0x40000000), (v11 & 1 ? 21 : 0), 0);
        if (v12 & 1)
            return 1;
    }
    else
    {
        v13 = arm64g_calculate_condition(v9 | 16, v10, v15, v16);
        v14 = arm64g_calculate_condition(16, (v13 & 1 ? *a1 : 0x40000000), (v13 & 1 ? 21 : 0), 0);
        if (v14 & 1)
            return 1;
    }
    v0 = v17;
    v1 = v18;
    v2 = v19;
    v3 = v20;
    v4 = v21;
    v5 = v22;
    v6 = &v8;
    v7 = v23;
    if (!sub_c68d5c(a2))
    {
        sub_a368c8();
        sub_a369bc("ssl/record/methods/tls13_meth.c", 340, "tls13_add_record_padding");
        sub_996e84(idx, 80, 0xc0103, 0);
        return 0;
    }
    v24 = a3->field_8 + 1;
    a3->field_8 = v24;
    v25 = *(int *)(idx + 4172);
    v26 = v25 - v24;
    if (v25 <= v24)
        return 1;
    if (*(long long *)(idx + 4400))
        (*(long long *)(idx + 4400))();
    v27 = *(long long *)(idx + 4192);
    if (*(long long *)(idx + 4192) || *(long long *)(idx + 4200))
    {
        v28 = *a1;
        if (v28 != 21)
        {
            if (v28 == 23)
                goto LABEL_995e80;
            if (v28 == 22 && !(v27 = *(long long *)(idx + 4200), !v27))
                goto LABEL_995e84;
        }
        else
        {
            v27 = *(long long *)(idx + 4200);
LABEL_995e80:
            if (v27)
            {
LABEL_995e84:
                v29 = v27 - 1;
                if (v27 & v29)
                    v30 = v24 - v27 * v24 / v27;
                else
                    v30 = v29 & v24;
                if (v30)
                {
                    v31 = v27 - v30;
                    if (v31)
                    {
                        if (v31 < v26)
                            v26 = v31;
                        if (!sub_a6eb5c())
                        {
                            sub_a368c8();
                            sub_a369bc("ssl/record/methods/tls13_meth.c", 403, "tls13_add_record_padding");
                            sub_996e84(idx, 80, 0xc0103, 0);
                            return 0;
                        }
                        a3->field_8 = a3->field_8 + v26;
                    }
                }
            }
        }
    }
    return 1;
}
