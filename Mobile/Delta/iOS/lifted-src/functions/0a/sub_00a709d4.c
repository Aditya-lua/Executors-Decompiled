/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa709d4..0xa70c40 (620 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_a709d4(void* a0, void* a1)
{
    unsigned int v3;  // w8
    void* v4;  // x8
    double v13;  // d0
    double v14;  // d0
    double v15;  // d0
    void* v5;  // x9
    long long v6;  // x1
    void* v7;  // x20
    long long v9;  // x1
    void* v10;  // x9
    double v11;  // d0
    double v12;  // d0
    void* v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = a1;
    if (a0)
    {
        *(unsigned long long *)&a0[32] = 0;
        v3 = (int)a0[8];
        if (v3 == 1)
        {
            v4 = (long long)a0[16];
            if (!v4)
            {
                *(unsigned long long *)&a0[32] = 8;
                return v14;
            }
            switch (v10)
            {
            case 8:
                if (a1 >= 0)
                {
                    *(unsigned long long *)&a0[32] = 8;
                    *(void* *)v4 = a1;
                    return v13;
                }
                sub_a368c8();
                v6 = 988;
                break;
            case 4:
                if (a1 <= 0x7fffffff)
                {
                    *(unsigned long long *)&a0[32] = 4;
                    *(unsigned int *)v4 = (unsigned int)a1;
                    return v11;
                }
                sub_a368c8();
                v6 = 980;
                break;
            default:
                v7 = a0;
                if (!sub_a71d50(v4, (long long)a0[24], &v0, 8, 0, 1))
                {
                    *(unsigned long long *)&v7[32] = 8;
                    return v12;
                }
                *(long long *)&v7[32] = (long long)v7[24];
                return v12;
            }
            goto LABEL_a70c18;
        }
        else if (v3 != 3)
        {
            if (v3 == 2)
            {
                v4 = (long long)a0[16];
                if (!v4)
                {
                    *(unsigned long long *)&a0[32] = 8;
                    return v14;
                }
                switch (v5)
                {
                case 8:
                    *(long long *)&a0[32] = (long long)a0[24];
                    *(void* *)v4 = a1;
                    return v13;
                case 4:
                    if (a1 > 0xffffffff)
                    {
                        sub_a368c8();
                        v6 = 958;
                        break;
                    }
                    else
                    {
                        *(unsigned long long *)&a0[32] = 4;
                        *(unsigned int *)v4 = (unsigned int)a1;
                        return v11;
                    }
                default:
                    v7 = a0;
                    if (!sub_a71d50(v4, (long long)a0[24], &v0, 8, 0, 0))
                    {
                        *(unsigned long long *)&v7[32] = 8;
                        return v12;
                    }
                    *(long long *)&v7[32] = (long long)v7[24];
                    return v12;
                }
LABEL_a70c18:
                sub_a369bc("crypto/params.c", v6, "OSSL_PARAM_set_uint64");
                v9 = 126;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/params.c", 1009, "OSSL_PARAM_set_uint64");
                v9 = 129;
            }
        }
        else
        {
            if ((long long)a0[24] == 8)
            {
                if (a1 <= 0x1fffffffffffff)
                {
                    *(unsigned long long *)&a0[32] = 8;
                    *(double *)(long long)a0[16] = (double)(unsigned long long)a1;
                    return (double)(unsigned long long)a1;
                }
                sub_a368c8();
                sub_a369bc("crypto/params.c", 1002, "OSSL_PARAM_set_uint64");
                v9 = 123;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/params.c", 1005, "OSSL_PARAM_set_uint64");
                v9 = 130;
            }
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/params.c", 940, "OSSL_PARAM_set_uint64");
        v9 = 786690;
    }
    sub_a36abc(15, v9, 0);
    return v15;
}
