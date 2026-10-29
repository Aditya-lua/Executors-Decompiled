/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab61c8..0xab652c (868 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_ab61c8(long long a0, long long iter, unsigned int a2, long long a3, unsigned int a4, long long a5, unsigned long long a6)
{
    unsigned long v7;  // x19
    unsigned long v8;  // x20
    unsigned long v9;  // x25
    unsigned long v10;  // x26
    unsigned long v11;  // x27
    unsigned long n;  // x24
    long long v13;  // x1
    unsigned long v14;  // x21
    unsigned int v0;  // [bp-0x90]
    unsigned short v1;  // [bp-0x8c]
    unsigned short v2;  // [bp-0x8a]
    char v3;  // [bp-0x88]
    unsigned long v4;  // [bp-0x68]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    if ((unsigned int)a6 == a2 * 8)
    {
        v1 = (unsigned short)((a6 & 0xff00ff00ff00ff00) >> 8) | (unsigned short)a6 * 0x100 & 0xff00;
        v7 = sub_a64420();
        if (!v7)
        {
            sub_a368c8();
            sub_a369bc("crypto/rsa/rsa_pk1.c", 303, "ossl_rsa_prf");
            sub_a36abc(4, 0xc0103, 0);
            v8 = 0;
            goto LABEL_ab6428;
        }
        v8 = sub_a40ca8(a0, "sha256", 0);
        if (!v8)
        {
            sub_a368c8();
            v13 = 316;
            goto LABEL_ab6410;
        }
        else if ((int)sub_a64000(v7, a5, 32, v8, 0) >= 1)
        {
            if ((int)a2 >= 1)
            {
                v9 = 0;
                v10 = 0;
                v11 = a2;
                n = v11;
                do
                {
                    if ((int)sub_a64000(v7, 0, 0, 0, 0) > 0)
                    {
                        v2 = (((((v10 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v10 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v10 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v10 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48;
                        if ((int)sub_a6432c(v7, &v2, 2) <= 0)
                        {
                            sub_a368c8();
                            v13 = 335;
                            goto LABEL_ab6410;
                        }
                        else if ((int)sub_a6432c(v7, a3, a4) <= 0)
                        {
                            sub_a368c8();
                            v13 = 339;
                            goto LABEL_ab6410;
                        }
                        else if ((int)sub_a6432c(v7, &v1, 2) > 0)
                        {
                            v0 = 32;
                            v9 += 32;
                            if (v9 <= v11)
                            {
                                if ((int)sub_a64344(v7, iter, &v0) > 0)
                                    continue;
                                sub_a368c8();
                                v13 = 361;
                                goto LABEL_ab6410;
                            }
                            else if ((int)sub_a64344(v7, &v3, &v0) > 0)
                            {
                                _memcpy(iter, &v3, n);
                            }
                            else
                            {
                                sub_a368c8();
                                v13 = 355;
                                goto LABEL_ab6410;
                            }
                        }
                        else
                        {
                            sub_a368c8();
                            v13 = 343;
                            goto LABEL_ab6410;
                        }
                    }
                    else
                    {
                        sub_a368c8();
                        v13 = 327;
                        goto LABEL_ab6410;
                    }
                } while ((v10 = (unsigned int)v10 + 1, n -= 32, iter += 32, v11 > v9));
            }
            v14 = 0;
        }
        else
        {
            sub_a368c8();
            v13 = 321;
LABEL_ab6410:
            sub_a369bc("crypto/rsa/rsa_pk1.c", v13, "ossl_rsa_prf");
            sub_a36abc(4, 0xc0103, 0);
LABEL_ab6428:
            v14 = 0xffffffff;
        }
        sub_a644c4(v7);
        sub_a3f52c(v8);
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/rsa/rsa_pk1.c", 294, "ossl_rsa_prf");
        sub_a36abc(4, 0xc0103, 0);
        v14 = 0xffffffff;
    }
    if (*(long long *)&g_10002b0 == v4)
        return v14;
    ___stack_chk_fail();
}
