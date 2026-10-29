/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fd150..0x9fd2f4 (420 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9fd150_0 {
    char padding_0[32];
    long long field_20;
} st_9fd150_0;


long long sub_9fd150(st_9fd150_0 *a0, unsigned long a1, unsigned long long *a2)
{
    long long v2;  // x19
    long long v3;  // x0
    unsigned long v9;  // cc_ndep
    unsigned long long v10;  // 4110
    unsigned long long v11;  // 4102
    unsigned long v12;  // cc_op
    unsigned long v13;  // cc_dep1
    unsigned long v14;  // cc_dep2
    unsigned long long v15;  // 4110
    unsigned long long v16;  // 4102
    long long v4;  // x25
    long long v17;  // x27
    long long v18;  // x0
    long long v19;  // x19
    long long v5;  // x24
    long long v6;  // x23
    long long v7;  // x22
    long long v8;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_20;
    v3 = sub_c4c40(v2);
    v4 = sub_9ffdd0(v2);
    v5 = sub_c4ba8(v2);
    v6 = sub_9ffd38(v2);
    v7 = sub_9ffde0(v2);
    v8 = sub_9ffdd8(v2);
    if (v3)
    {
        v10 = arm64g_calculate_condition(v12 | 16, v13, v14, v9);
        v11 = arm64g_calculate_condition(20, (v10 & 1 ? v4 : 0x40000000), 0, 0);
        if (v11 & 1)
            goto LABEL_9fd1d0;
    }
    else
    {
        v15 = arm64g_calculate_condition(v12 | 16, v13, v14, v9);
        v16 = arm64g_calculate_condition(16, (v15 & 1 ? v4 : 0x40000000), 0, 0);
        if (v16 & 1)
        {
LABEL_9fd1d0:
            v17 = v8;
            v18 = sub_a6ee78();
            if (!v18)
                return v18;
            v19 = v18;
            if (sub_a6f188() && sub_a6f188(v19, "g", v4) && (!v5 || sub_a6f188(v19, "q", v5)))
            {
                if (v6 < 1)
                {
                    if (!v7)
                        goto LABEL_9fd274;
LABEL_9fd25c:
                    if (sub_a6f188(v19, "pub", v7))
                    {
LABEL_9fd274:
                        if (v17)
                        {
                            if (sub_a6f188(v19, "priv", v17))
                                goto LABEL_9fd298;
                        }
                        else
                        {
LABEL_9fd298:
                            if (sub_a6f570(v19))
                                a2();
                        }
                    }
                }
                else if (sub_a6f11c(v19, "priv_len", v6))
                {
                    if (v7)
                        goto LABEL_9fd25c;
                    goto LABEL_9fd274;
                }
            }
            sub_a6eed4(v19);
            return 0;
        }
    }
    return 0;
}
