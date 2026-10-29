/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa0664..0xaa09a4 (832 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_aa0664(long long *a0, long long a1, unsigned long long a2, long long a3, unsigned long long a4, unsigned long long a5, unsigned long long a6, long long a7, unsigned long a8, long long a9)
{
    unsigned long long v3;  // x23
    unsigned long v4;  // x19
    long long v16;  // x1
    unsigned long long v5;  // x0
    unsigned long long v6;  // x25
    unsigned long v7;  // x2
    long long v9;  // x1
    unsigned long long v10;  // x25
    unsigned long v11;  // x23
    unsigned long long v12;  // x22
    unsigned long long v0;  // [bp-0x68]
    unsigned int v1;  // [bp-0x64]
    char *v2;  // [bp-0x10]

    v2 = &a8;
    v3 = a4;
    v4 = sub_a4bc70();
    v0 = 0;
    if (!v4)
    {
        sub_a368c8();
        v16 = 32;
        goto LABEL_aa07e8;
    }
    if (!sub_a5100c(*a0, a1, a2, a0[1], v4, a7, a8, a9))
    {
        sub_a4bca0(v4);
        return 0;
    }
    v5 = sub_a50638(v4);
    if ((unsigned int)v5)
    {
        v6 = v5 + v3;
        if (!(sub_a2cf88(sub_a2d030(v4)) >> 25 & 1))
        {
LABEL_aa0724:
            v10 = sub_a6bffc((int)v6, "crypto/pkcs12/p12_decr.c", 81);
            if (!v10)
            {
                sub_a4bca0(v4);
                return v10;
            }
            if (sub_a4c6a0(v4, v10, &v1, a3, v3))
            {
                v11 = v1;
                if (!sub_a4ca14(v4, v10 + v11, &v1))
                {
                    sub_a368c8(sub_a6c2e4(v10, "crypto/pkcs12/p12_decr.c", 93), "crypto/pkcs12/p12_decr.c", 93);
                    sub_a369bc("crypto/pkcs12/p12_decr.c", 95, "PKCS12_pbe_crypt_ex");
                    sub_a36abc();
                    sub_a4bca0(v4);
                    return 0;
                }
                v12 = v1 + v11;
                if (sub_a2cf88(sub_a2d030(v4)) >> 25 & 1 && sub_a50720(v4))
                {
                    if ((int)sub_a4d5dc(v4, 16, v0, v10 + v12) > 0)
                    {
                        v12 += v0;
                        goto LABEL_aa07bc;
                    }
                    else
                    {
                        sub_a368c8(sub_a6c2e4(v10, "crypto/pkcs12/p12_decr.c", 108), "crypto/pkcs12/p12_decr.c", 108);
                        v9 = 110;
                        goto LABEL_aa0844;
                    }
                }
                else
                {
LABEL_aa07bc:
                    if (a6)
                        *(unsigned int *)a6 = v12;
                    if (a5)
                        *(unsigned long long *)a5 = v10;
                    sub_a4bca0(v4);
                    return v10;
                }
                goto LABEL_aa0844;
            }
            else
            {
                sub_a368c8(sub_a6c2e4(v10, "crypto/pkcs12/p12_decr.c", 0x55), "crypto/pkcs12/p12_decr.c", 0x55);
                v16 = 87;
LABEL_aa07e8:
                sub_a369bc("crypto/pkcs12/p12_decr.c", v16, "PKCS12_pbe_crypt_ex");
            }
        }
        else if ((int)sub_a4d5dc(v4, 22, 0, &v0) > 0)
        {
            v7 = v0;
            if (sub_a50720(v4))
            {
                v6 += v7;
                goto LABEL_aa0724;
            }
            if ((int)v7 > (int)v3)
            {
                sub_a368c8();
                sub_a369bc("crypto/pkcs12/p12_decr.c", 0x44, "PKCS12_pbe_crypt_ex");
            }
            else
            {
                v3 -= v7;
                if (0 < (int)sub_a4d5dc(v4, 0x11))
                    goto LABEL_aa0724;
                sub_a368c8();
                v9 = 75;
LABEL_aa0844:
                sub_a369bc("crypto/pkcs12/p12_decr.c", v9, "PKCS12_pbe_crypt_ex");
            }
        }
        else
        {
            sub_a368c8();
            v9 = 60;
            goto LABEL_aa0844;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/pkcs12/p12_decr.c", 50, "PKCS12_pbe_crypt_ex");
    }
    sub_a36abc();
    sub_a4bca0(v4);
    return 0;
}
