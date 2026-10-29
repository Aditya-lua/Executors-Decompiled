/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5972c..0xa59a84 (856 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_a5972c(long long a0, long long a1, long long a2, long long a3, unsigned long a4, unsigned long a5, long long a6, long long a7)
{
    unsigned long long v7;  // w0
    unsigned long long v8;  // x19
    long long v17;  // x1
    unsigned long long v9;  // x0
    unsigned long long v10;  // x20
    long long v11;  // x1
    unsigned long long v12;  // x0
    unsigned long long v13;  // x28
    long long v15;  // x1
    unsigned long long v16;  // x0
    unsigned int v0;  // [bp-0xbc]
    unsigned long v1;  // [bp-0xb8]
    unsigned int v2;  // [bp-0xac]
    char v3;  // [bp-0xa8]
    unsigned long v4;  // [bp-0x68]
    char *v5;  // [bp-0x10]
    long long v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    if (sub_a2d030())
    {
        v7 = (unsigned int)sub_a50904(a0);
        if (65 <= v7)
            sub_a69928("assertion failed: keylen <= sizeof(key)", "crypto/evp/p5_crpt2.c", 200);
        v8 = sub_9c5520(sub_9c9edc(), a3);
        if (v8)
        {
            v9 = sub_a50904(a0);
            if (!(v9 >> 31 & 1))
            {
                v10 = v9;
                if (*(long long *)(v8 + 16) && sub_9c1a94(*(long long *)(v8 + 16)) != (v10 & 0xffffffff))
                {
                    sub_a368c8();
                    sub_a369bc("crypto/evp/p5_crpt2.c", 0xdd, "PKCS5_v2_PBKDF2_keyivgen_ex");
                    v11 = 123;
                    goto LABEL_a599a8;
                }
                if (*(long long *)(v8 + 24))
                    sub_a99eac(*(long long *)*(long long *)(v8 + 24));
                if (sub_a513e8(1))
                {
                    sub_a36c8c();
                    v12 = sub_a40ca8(a7, sub_a9976c(v2), v6);
                    v13 = v12;
                    if (!v13)
                    {
                        v13 = sub_a58d60(sub_a9976c(v2));
                        if (v13)
                            goto LABEL_a59904;
                        sub_a368c8(sub_a36e70());
                        v15 = 241;
LABEL_a5999c:
                        sub_a369bc("crypto/evp/p5_crpt2.c", v15, "PKCS5_v2_PBKDF2_keyivgen_ex");
                        v11 = 125;
LABEL_a599a8:
                        sub_a36abc(6, v11, 0);
                        v16 = 0;
                        v12 = 0;
                    }
                    else
                    {
LABEL_a59904:
                        sub_a36cd4();
                        if (*(int *)*(long long *)v8 == 4)
                        {
                            v1 = *(long long *)(*(long long *)(*(long long *)v8 + 8) + 8);
                            v0 = *(int *)*(long long *)(*(long long *)v8 + 8);
                            if (!sub_a59264(a1, a2, v1, v0, sub_9c1a94(*(long long *)(v8 + 8)), v13, v10, &v3, a7, v6))
                                goto LABEL_a599e8;
                            v16 = sub_a4c694(a0, 0, 0, &v3, 0, a6);
                        }
                        else
                        {
                            sub_a368c8();
                            sub_a369bc("crypto/evp/p5_crpt2.c", 247, "PKCS5_v2_PBKDF2_keyivgen_ex");
                            sub_a36abc(6, 126, 0);
LABEL_a599e8:
                            v16 = 0;
                        }
                    }
                }
                else
                {
                    sub_a368c8();
                    v15 = 231;
                    goto LABEL_a5999c;
                }
                v7 = (unsigned int)v10;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/evp/p5_crpt2.c", 213, "PKCS5_v2_PBKDF2_keyivgen_ex");
                v17 = 130;
LABEL_a5986c:
                sub_a36abc(6, v17, 0);
                v16 = 0;
                v12 = 0;
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/evp/p5_crpt2.c", 207, "PKCS5_v2_PBKDF2_keyivgen_ex");
            v17 = 114;
            goto LABEL_a5986c;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/p5_crpt2.c", 196, "PKCS5_v2_PBKDF2_keyivgen_ex");
        sub_a36abc(6, 131, 0);
        v16 = 0;
        v7 = 0;
        v8 = 0;
        v12 = 0;
    }
    sub_a66ec0(&v3, v7);
    sub_9c9ee8(v8);
    sub_a3f52c(v12);
    if (*(long long *)&g_10002b0 == v4)
        return v16;
    ___stack_chk_fail();
    sub_a69928("assertion failed: keylen <= sizeof(key)", "crypto/evp/p5_crpt2.c", 200);
}
