/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3ddac..0xb3e0c4 (792 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b3ddac(unsigned long long a0, unsigned long long a1, long long a2)
{
    unsigned int v9;  // w0
    unsigned long long *v10;  // x20
    unsigned long long v19;  // 4115
    unsigned long long v11;  // x0
    unsigned long long v12;  // x0
    long long v13;  // x1
    unsigned long long v14;  // x6
    unsigned long long v15;  // x0
    unsigned long long v16;  // x0
    unsigned long long v17;  // x0
    unsigned long long v18;  // x0
    unsigned long v0;  // [bp-0x70]
    unsigned long long v1;  // [bp-0x60]
    unsigned long long v2;  // [bp-0x58]
    unsigned long long v3;  // [bp-0x50]
    unsigned long long v4;  // [bp-0x48]
    unsigned long long v5;  // [bp-0x40]
    unsigned long long v6;  // [bp-0x38]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v9 = sub_a2f9e0();
    if (!((unsigned int)a1 & 3))
    {
        return 0;
    }
    else if (!a0)
    {
        return 0;
    }
    else if (v9)
    {
        v10 = sub_c4c40(a0);
        v6 = 0;
        v4 = 0;
        v5 = 0;
        v2 = 0;
        v3 = 0;
        v1 = 0;
        if (sub_a6fbc4(a2, "pub"))
        {
            v11 = sub_a71cdc();
            if (!(unsigned int)v11)
            {
                return v11;
            }
            else if (v6 && v3 != v10[9])
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/keymgmt/ml_dsa_kmgmt.c", 208, "ml_dsa_key_fromdata");
                v0 = *v10;
                sub_a36abc(57, 105);
                return 0;
            }
        }
        if (!(a1 & 1))
        {
LABEL_b3de44:
            v14 = 0;
            goto LABEL_b3de4c;
        }
        else
        {
            if (sub_a6fbc4(a2, "seed"))
            {
                v12 = sub_a71cdc();
                if (!(unsigned int)v12)
                    return v12;
                if (!v4 || v1 == 32)
                    goto LABEL_b3df1c;
                sub_a368c8();
                sub_a369bc("providers/implementations/keymgmt/ml_dsa_kmgmt.c", 0xdd, "ml_dsa_key_fromdata");
                v13 = 154;
            }
            else
            {
LABEL_b3df1c:
                if (!sub_a6fbc4(a2, "priv"))
                    goto LABEL_b3de44;
                v15 = sub_a71cdc();
                if (!(unsigned int)v15)
                    return v15;
                v14 = v2;
                if (v5 && v14 != v10[8])
                {
                    sub_a368c8();
                    sub_a369bc("providers/implementations/keymgmt/ml_dsa_kmgmt.c", 229, "ml_dsa_key_fromdata");
                    v0 = *v10;
                    sub_a36abc(57, 105);
                    return 0;
                }
LABEL_b3de4c:
                if (!v1 && !v3 && !v14)
                {
                    sub_a368c8();
                    sub_a369bc("providers/implementations/keymgmt/ml_dsa_kmgmt.c", 237, "ml_dsa_key_fromdata");
                    v13 = 128;
                }
                else if (v1)
                {
                    if (v14)
                    {
                        v14 = v2;
                        if (!(sub_a7f880(a0) & 1))
                            goto LABEL_b3df00;
                    }
                    v16 = sub_a7f888(a0, 0, 0, v4);
                    if (!(unsigned int)v16)
                        return v16;
                    if (sub_a80554(a0))
                    {
LABEL_b3e008:
                        if (!v3)
                            return 1;
                        v19 = arm64g_calculate_condition(2, v1, v2, 0);
                        if (!(v19 & 1) && _memcmp(sub_a01e1c(a0), v6, v3))
                        {
                            sub_a368c8();
                            sub_a369bc("providers/implementations/keymgmt/ml_dsa_kmgmt.c", 263, "ml_dsa_key_fromdata");
                            v0 = *v10;
                            sub_a36abc(57, 158, "explicit %s public key does not match private");
                            sub_a7fbd8(a0);
                            return 0;
                        }
                        return 1;
                    }
                    sub_a368c8();
                    sub_a369bc("providers/implementations/keymgmt/ml_dsa_kmgmt.c", 247, "ml_dsa_key_fromdata");
                    v13 = 121;
                }
                else
                {
LABEL_b3df00:
                    if (v14)
                    {
                        v17 = sub_a7e86c(a0, v5, v14);
                        if (!(unsigned int)v17)
                            return v17;
                    }
                    else if (v3)
                    {
                        v18 = sub_a7de4c(a0, v6);
                        if (!(unsigned int)v18)
                            return v18;
                    }
                    else
                    {
                        return 1;
                    }
                    goto LABEL_b3e008;
                }
            }
            sub_a36abc(57, v13);
            return 0;
        }
    }
    else
    {
        return 0;
    }
}
