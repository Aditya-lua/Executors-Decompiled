/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1633c..0xa165e8 (684 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_e8ee48;

unsigned long long sub_a1633c(unsigned long long a0, long long a1)
{
    unsigned long long idx;  // x19
    unsigned long long v5;  // x0
    unsigned long v6;  // x8
    unsigned long long v7;  // x0
    long long v8;  // x1
    unsigned long long v9;  // x0
    unsigned long long v10;  // x0
    long long v11;  // x1
    unsigned long long v12;  // x20
    long long v13;  // x1
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = 0;
    v1 = 0;
    if (a0 && *(long long *)(a0 + 24) && ((char)(*(char *)(a0 + 48)) >> 1 & 1 || *(long long *)(a0 + 32)))
    {
        idx = sub_9cde20(&g_e8ee48);
        if (idx)
        {
            *(int *)idx = *(int *)(a0 + 16);
            v5 = sub_a19bd0(a0, &v1);
            if (v5)
            {
                sub_9c79a0(*(long long *)(idx + 8), v1, v5);
                v1 = 0;
                v6 = *(int *)(a0 + 48);
                if (!(v6 & 1))
                {
                    v7 = sub_a15520(*(long long *)(a0 + 24), *(long long *)(idx + 16));
                    *(unsigned long long *)(idx + 16) = v7;
                    if (v7)
                    {
                        v6 = *(int *)(a0 + 48);
                    }
                    else
                    {
                        sub_a368c8();
                        v8 = 1040;
                        goto LABEL_a16578;
                    }
                }
                if (!(v6 >> 1 & 1))
                {
                    v9 = sub_9cf14c();
                    *(unsigned long long *)(idx + 24) = v9;
                    if (!v9)
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/ec/ec_asn1.c", 1048, "i2d_ECPrivateKey");
                        v11 = 524301;
                        goto LABEL_a16588;
                    }
                    v10 = sub_a19928(a0, *(int *)(a0 + 52), &v0, 0);
                    if (v10)
                    {
                        sub_9c76f4(*(long long *)(idx + 24), 0);
                        sub_9c79a0(*(long long *)(idx + 24), v0, v10);
                        v0 = 0;
                        goto LABEL_a1642c;
                    }
                    else
                    {
                        sub_a368c8();
                        v8 = 1055;
LABEL_a16578:
                        sub_a369bc("crypto/ec/ec_asn1.c", v8, "i2d_ECPrivateKey");
                        v11 = 524304;
LABEL_a16588:
                        sub_a36abc(16, v11, 0);
                        v12 = 0;
                    }
                }
                else
                {
LABEL_a1642c:
                    v12 = sub_9ccc7c(idx, a1, &g_e8ee48);
                    if (!(unsigned int)v12)
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/ec/ec_asn1.c", 1065, "i2d_ECPrivateKey");
                        sub_a36abc(16, 0x80010, 0);
                    }
                }
            }
            else
            {
                sub_a368c8();
                v13 = 1029;
LABEL_a164f0:
                sub_a369bc("crypto/ec/ec_asn1.c", v13, "i2d_ECPrivateKey");
                sub_a36abc(16, 0x80010, 0);
                v12 = 0;
            }
        }
        else
        {
            sub_a368c8();
            v13 = 0x3fc;
            goto LABEL_a164f0;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_asn1.c", 1015, "i2d_ECPrivateKey");
        sub_a36abc(16, 0xc0102, 0);
        v12 = 0;
        idx = 0;
    }
    sub_a6c4e8(v1);
    sub_a6c2e4(v0, "crypto/ec/ec_asn1.c", 1071);
    sub_9cd960(idx, &g_e8ee48);
    return v12;
}
