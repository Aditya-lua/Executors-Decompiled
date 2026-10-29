/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab5344..0xab56a0 (860 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab5344_0 {
    char padding_0[8];
    long long field_8;
} st_ab5344_0;

extern char g_10002b0;

unsigned long long sub_ab5344(unsigned int a0, long long a1, st_ab5344_0 *a2, long long a3, unsigned long long a4, long long a5)
{
    unsigned long long v6;  // x19
    unsigned long long v7;  // x0
    unsigned long long v8;  // x20
    unsigned long v9;  // x25
    long long v10;  // x1
    unsigned long long v11;  // x21
    long long v12;  // x1
    long long v13;  // x1
    long long v14;  // x1
    unsigned int v0;  // [bp-0x84]
    unsigned long long v1;  // [bp-0x80]
    unsigned long long v2;  // [bp-0x70]
    unsigned long v3;  // [bp-0x58]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    v0 = 32;
    v1 = 0;
    v2 = 0;
    v6 = sub_9e4958();
    if (!v6)
    {
        sub_a368c8();
        v12 = 453;
        goto LABEL_ab54c4;
    }
    if (a2[3].field_8)
    {
        sub_9e5cb4(v6);
        if (!(sub_9e5174(v6, a3, a4) >> 31 & 1))
        {
            sub_9e48d4(v6);
            v6 = sub_a40ca8(a2->field_8, "sha256", 0);
            if (!v6)
            {
                sub_a368c8();
                sub_a369bc("crypto/rsa/rsa_ossl.c", 478, "derive_kdk");
                v13 = 524557;
            }
            else if ((int)sub_a40abc(a3, (int)a4, &v1, 0, v6, 0) > 0)
            {
                v7 = sub_a64420();
                if (v7)
                {
                    v8 = v7;
                    if ((int)sub_a64000() <= 0)
                    {
                        sub_a368c8();
                        v10 = 494;
                    }
                    else if ((int)a4 > (int)a0 && (v9 = (int)(a4 - a0), _bzero(a3, v9), (int)sub_a6432c(v8, a3, v9) <= 0))
                    {
                        sub_a368c8();
                        v10 = 501;
                    }
                    else if ((int)sub_a6432c(v8, a1, a0) > 0)
                    {
                        v0 = 32;
                        if ((int)sub_a64344(v8, a5, &v0) > 0)
                        {
                            v11 = 1;
                            goto LABEL_ab5694;
                        }
                        else
                        {
                            sub_a368c8();
                            v10 = 0x200;
                        }
                    }
                    else
                    {
                        sub_a368c8();
                        v10 = 506;
                    }
                    sub_a369bc("crypto/rsa/rsa_ossl.c", v10, "derive_kdk");
                    sub_a36abc(4, 0xc0103, 0);
                    v11 = 0;
LABEL_ab5694:
                    goto LABEL_ab5550;
                }
                else
                {
                    sub_a368c8();
                    v12 = 489;
                }
LABEL_ab54c4:
                sub_a369bc("crypto/rsa/rsa_ossl.c", v12, "derive_kdk");
                v13 = 524303;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/rsa/rsa_ossl.c", 483, "derive_kdk");
                v13 = 786691;
            }
            sub_a36abc(4, v13, 0);
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/rsa/rsa_ossl.c", 463, "derive_kdk");
            v14 = 786691;
LABEL_ab5534:
            sub_a36abc(4, v14, 0);
            sub_9e48d4(v6);
            v6 = 0;
        }
        v11 = 0;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/rsa/rsa_ossl.c", 457, "derive_kdk");
        v14 = 179;
        goto LABEL_ab5534;
    }
LABEL_ab5550:
    sub_a644c4();
    sub_a3f52c(v6);
    if (*(long long *)&g_10002b0 == v3)
        return v11;
    ___stack_chk_fail();
}
