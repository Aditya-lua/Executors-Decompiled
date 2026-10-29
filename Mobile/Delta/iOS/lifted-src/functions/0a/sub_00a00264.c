/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa00264..0xa00454 (496 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a00264(void* a0, unsigned long a1, void* a2)
{
    void* v2;  // x25
    long long v3;  // x20
    unsigned long v7;  // cc_dep1
    unsigned long v8;  // cc_dep2
    unsigned long v9;  // cc_ndep
    unsigned long long v10;  // 4110
    unsigned long long v11;  // 4102
    unsigned long v12;  // cc_op
    long long v13;  // x1
    unsigned int v14;  // w8
    unsigned long long v15;  // x0
    unsigned long long v16;  // x8
    unsigned long v17;  // x8
    unsigned int v18;  // w0
    unsigned long v19;  // x21
    unsigned long v20;  // x0
    unsigned long long v21;  // x22
    unsigned long v22;  // x19
    unsigned long long v5;  // 4110
    unsigned long long v6;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if ((long long)a0[0x88] && (long long)a0[144])
    {
        v2 = (long long)a0[152];
        v3 = sub_a5af48((long long)a0[0x88]);
        if (sub_a5af48((long long)a0[144]))
        {
            v5 = arm64g_calculate_condition(v12 | 16, v7, v8, v9);
            v6 = arm64g_calculate_condition(20, (v5 & 1 ? v3 : 0x40000000), 0, 0);
            if (v6 & 1)
                goto LABEL_a00320;
LABEL_a002bc:
            sub_a368c8();
            v13 = 410;
LABEL_a002f0:
            sub_a369bc("crypto/dh/dh_pmeth.c", v13, "pkey_dh_derive");
            sub_a36abc(5, 108, 0);
        }
        else
        {
            v10 = arm64g_calculate_condition(v12 | 16, v7, v8, v9);
            v11 = arm64g_calculate_condition(16, (v10 & 1 ? v3 : 0x40000000), 0, 0);
            if (!(v11 & 1))
                goto LABEL_a002bc;
LABEL_a00320:
            v14 = (char)v2[44];
            if (v14 == 2)
            {
                v17 = (long long)v2[80];
                if (v17 && (long long)v2[48])
                {
                    if (a1)
                    {
                        if (*(long long *)a2 == v17)
                        {
                            v18 = sub_9ffc34(v3);
                            if ((int)v18 >= 1)
                            {
                                v19 = v18;
                                v20 = sub_a6bf4c(v19, "crypto/dh/dh_pmeth.c", 443);
                                if (!v20)
                                    return v20;
                                v21 = v20;
                                if ((int)sub_9ff258() >= 1 && sub_9fede0(a1, *(long long *)a2, v21, v19, (long long)v2[48], (long long)v2[64], (long long)v2[72], (long long)v2[56]))
                                {
                                    *(long long *)a2 = (long long)v2[80];
                                    v22 = 1;
                                }
                                else
                                {
                                    v22 = 0;
                                }
                                sub_a6c4e8(v21, v19, "crypto/dh/dh_pmeth.c", 453);
                                return v22;
                            }
                        }
                    }
                    else
                    {
                        *(unsigned long *)a2 = v17;
                        return 1;
                    }
                }
            }
            else if (v14 == 1)
            {
                if (a1)
                {
                    if ((int)v2[16])
                        v15 = sub_9ff258(a1);
                    else
                        v15 = sub_9ff19c(a1);
                    if ((int)v15 < 1)
                        return v15;
                    v16 = v15 & 0xffffffff;
                }
                else
                {
                    v16 = sub_9ffc34(v3);
                }
                *(unsigned long long *)a2 = v16;
                return 1;
            }
        }
        return 0;
    }
    sub_a368c8();
    v13 = 404;
    goto LABEL_a002f0;
}
