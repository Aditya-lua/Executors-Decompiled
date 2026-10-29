/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9991c0..0x9993f8 (568 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9991c0_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_9991c0_0;


int sub_9991c0(void* a0, unsigned long a1, unsigned long a2, long long a3, st_9991c0_0 *a4)
{
    unsigned long v4;  // cc_dep1
    unsigned long long v5;  // 4107
    unsigned long v11;  // cc_ndep
    unsigned long long v12;  // 4110
    unsigned long long v13;  // 4102
    unsigned long v14;  // cc_op
    unsigned long v15;  // cc_dep1
    unsigned long v16;  // cc_dep2
    unsigned long long v17;  // 4110
    unsigned long long v18;  // 4102
    unsigned long long v6;  // 4107
    long long v19;  // x1
    unsigned long long v7;  // x22
    unsigned long long v9;  // x8
    unsigned long long v10;  // x9
    char v0;  // [bp-0x60]
    unsigned long long v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = (int)a0[16];
    if (!(int)a0[16])
    {
        v5 = arm64g_calculate_condition(3, v4, 0, 0);
        if (!(v5 & 1))
            goto LABEL_99920e;
LABEL_99920d:
        v7 = 5;
    }
    else
    {
        v6 = arm64g_calculate_condition(3, v4, 0, 0);
        if (v6 & 1)
            goto LABEL_99920d;
LABEL_99920e:
        v7 = 13;
    }
    if (sub_c68ecc())
    {
        v9 = v1;
        v10 = a4->field_8;
        if (v10 <= v9 - a1 + 80)
        {
            v12 = arm64g_calculate_condition(v14 | 32, v15, v16, v11);
            v13 = arm64g_calculate_condition(36, (v12 & 1 ? v10 : 0), (v12 & 1 ? v9 : 0), 0);
            if (v13 & 1)
                goto LABEL_999290;
        }
        else
        {
            v17 = arm64g_calculate_condition(v14 | 32, v15, v16, v11);
            v18 = arm64g_calculate_condition(32, (v17 & 1 ? v10 : 0), (v17 & 1 ? v9 : 0), 0);
            if (v18 & 1)
            {
LABEL_999290:
                if (v10 <= v9 || sub_a6e830(a3))
                {
                    if (a1 && (int)a0[4272])
                    {
                        if (sub_a6e830(a3, a1, &v0))
                            (*(long long *)((long long)a0[4416] + 16))();
                        sub_a368c8();
                        v19 = 1721;
                    }
                    else
                    {
                        if (!sub_c68ecc(a3, &v0) || !sub_a6e970(a3))
                        {
                            sub_a368c8();
                            v19 = 1730;
                        }
                        else if ((long long)a0[4384])
                        {
                            sub_a6e990(a3);
                            (long long)a0[4384]();
                        }
                        else
                        {
                            if (sub_a6eaf8(a3))
                            {
                                a4->field_8 = a4->field_8 + v7;
                                return 1;
                            }
                            sub_a368c8();
                            v19 = 1750;
                        }
                    }
                    sub_a369bc("ssl/record/methods/tls_common.c", v19, "tls_post_encryption_processing_default");
                    sub_996e84(a0, 80, 0xc0103, 0);
                    return 0;
                }
            }
        }
    }
    sub_a368c8();
    sub_a369bc("ssl/record/methods/tls_common.c", 1713, "tls_post_encryption_processing_default");
    sub_996e84(a0, 80, 0xc0103, 0);
    return 0;
}
