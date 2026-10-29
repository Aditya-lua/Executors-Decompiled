/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ff4b4..0x9ff650 (412 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_9ff4b4(long long a0, unsigned long long a1, unsigned long a2, unsigned long long a3)
{
    unsigned long long v4;  // x0
    long long v5;  // x8
    unsigned long v8;  // cc_dep2
    unsigned long v9;  // cc_ndep
    unsigned long long v10;  // 4110
    unsigned long long v11;  // 4102
    unsigned long v12;  // cc_op
    unsigned long v13;  // cc_dep1
    unsigned int v14;  // w9
    unsigned long long v15;  // 4125
    unsigned int v16;  // w21
    unsigned long long v17;  // x21
    unsigned long long v18;  // x0
    unsigned long long v19;  // x22
    unsigned long long v6;  // 4110
    unsigned long long v7;  // 4102
    unsigned long long v0;  // [bp-0x40]
    long long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    sub_9ffcc8();
    sub_9ffd58(a0, &v1, 0);
    v4 = v0;
    v5 = v1;
    if (v4)
    {
        v6 = arm64g_calculate_condition(v12 | 16, v13, v8, v9);
        v7 = arm64g_calculate_condition(4, (v6 & 1 ? v5 : 0x40000000), 0, 0);
        if (!(v7 & 1))
            goto LABEL_9ff508;
    }
    else
    {
        v10 = arm64g_calculate_condition(v12 | 16, v13, v8, v9);
        v11 = arm64g_calculate_condition(0, (v10 & 1 ? v5 : 0x40000000), 0, 0);
        if (!(v11 & 1))
        {
LABEL_9ff508:
            v4 = sub_9e46a8(v4);
            v14 = (unsigned int)v4 + 14;
            v15 = arm64g_calculate_condition(177, v4 & 0xffffffff, 7, 0);
            if (v15 & 1)
                v16 = v14;
            else
                v16 = (unsigned int)v4 + 7;
            if (v14 >= 15)
            {
                v4 = sub_9e46a8(v1);
                if (14 < (unsigned int)v4 + 14)
                {
                    v17 = (int)(v16) >> 3;
                    if (!a1)
                        return v17;
                    if (a3)
                    {
                        v18 = sub_a6bf4c((int)v17, "crypto/dh/dh_key.c", 440);
                        if (!v18)
                            return v18;
                        v19 = v18;
                        if (!(sub_9e5174(v1, v19, v17) >> 31 & 1))
                        {
                            *(unsigned long long *)a1 = v19;
                            return v17;
                        }
                        sub_a6c2e4(v19, "crypto/dh/dh_key.c", 452);
                    }
                    else
                    {
                        v19 = *(long long *)a1;
                        if (!v19)
                        {
                            return v17;
                        }
                        else if ((int)v17 > a2)
                        {
                            sub_a368c8();
                            sub_a369bc("crypto/dh/dh_key.c", 438, "ossl_dh_key2buf");
                            sub_a36abc(5, 129, 0);
                            return 0;
                        }
                        else if (!(sub_9e5174(v1, v19, v17) >> 31 & 1))
                        {
                            *(unsigned long long *)a1 = v19;
                            return v17;
                        }
                    }
                    sub_a368c8();
                    sub_a369bc("crypto/dh/dh_key.c", 453, "ossl_dh_key2buf");
                    sub_a36abc(5, 106, 0);
                    return 0;
                }
            }
        }
    }
    sub_a368c8(v4);
    sub_a369bc("crypto/dh/dh_key.c", 430, "ossl_dh_key2buf");
    sub_a36abc(5, 0x66, 0);
    return 0;
}
