/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa70214..0xa70404 (496 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a70214(void* a0, unsigned long long a1)
{
    unsigned long long v2;  // w8
    unsigned long long v3;  // x8
    unsigned long long v4;  // x9
    void* v5;  // x20
    unsigned long long v7;  // x0
    long long v8;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0)
    {
        *(unsigned long long *)&a0[32] = 0;
        v2 = (int)a0[8];
        if (v2 == 1)
        {
            *(unsigned long long *)&a0[32] = 4;
            v3 = (long long)a0[16];
            if (!v3)
                return 1;
            v4 = (long long)a0[24];
            switch (v4)
            {
            case 8:
                goto LABEL_a70350;
            case 4:
                if (!(a1 >> 31 & 1))
                {
                    *(unsigned int *)v3 = a1;
                    return 1;
                }
                sub_a368c8();
                sub_a369bc("crypto/params.c", 662, "OSSL_PARAM_set_uint32");
                v8 = 126;
                break;
            default:
                v5 = a0;
                v7 = sub_a71d50(v3, v4, &(unsigned int)a1, 4, 0, 1);
                if (!(unsigned int)v7)
                {
                    *(unsigned long long *)&v5[32] = 4;
                    return v7;
                }
LABEL_a703cc:
                *(long long *)&v5[32] = (long long)v5[24];
                return 1;
            }
        }
        else if (v2 != 3)
        {
            if (v2 == 2)
            {
                *(unsigned long long *)&a0[32] = 4;
                v3 = (long long)a0[16];
                if (!v3)
                    return 1;
                v4 = (long long)a0[24];
                switch (v4)
                {
                case 8:
LABEL_a70350:
                    *(unsigned long long *)&a0[32] = v4;
                    *(unsigned long long *)v3 = a1 & 0xffffffff;
                    return 1;
                case 4:
                    *(unsigned int *)v3 = a1;
                    return 1;
                default:
                    v5 = a0;
                    v7 = sub_a71d50(v3, v4, &(unsigned int)a1, 4, 0, 0);
                    if (!(unsigned int)v7)
                    {
                        *(unsigned long long *)&v5[32] = 4;
                        return v7;
                    }
                }
                goto LABEL_a703cc;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/params.c", 694, "OSSL_PARAM_set_uint32");
                v8 = 129;
            }
        }
        else
        {
            if ((long long)a0[16])
            {
                if ((long long)a0[24] == 8)
                {
                    *(double *)(long long)a0[16] = (double)(unsigned int)a1;
                    *(unsigned long long *)&a0[32] = 8;
                    return 1;
                }
                sub_a368c8();
                sub_a369bc("crypto/params.c", 690, "OSSL_PARAM_set_uint32");
                v8 = 130;
            }
            else
            {
                *(unsigned long long *)&a0[32] = 8;
                return 1;
            }
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/params.c", 630, "OSSL_PARAM_set_uint32");
        v8 = 786690;
    }
    sub_a36abc(15, v8, 0);
    return 0;
}
