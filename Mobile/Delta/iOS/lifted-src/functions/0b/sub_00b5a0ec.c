/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5a0ec..0xb5a358 (620 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_b5a0ec(void* a0, long long a1, unsigned long n, long long a3)
{
    void* v4;  // x19
    unsigned long v5;  // x0
    long long v6;  // x22
    unsigned long v7;  // x19
    unsigned int v8;  // w0
    unsigned long v9;  // x23
    long long v10;  // x1
    unsigned long v11;  // x24
    unsigned long v12;  // x24
    long long v13;  // x1
    char v0;  // [bp-0xa8]
    unsigned long v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a0;
    v1 = *(long long *)&g_10002b0;
    v5 = sub_a2f9e0();
    if ((unsigned int)v5)
    {
        v5 = sub_b5a364(a0, a3);
        if ((unsigned int)v5)
        {
            if (!(long long)a0[32])
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/kdfs/pbkdf1.c", 0xbb, "kdf_pbkdf1_derive");
                v13 = 130;
                goto LABEL_b5a258;
            }
            else if ((long long)a0[48])
            {
                v6 = sub_954340(a0 + 8);
                v7 = sub_a3f728(v6);
                if (!v7)
                {
                    sub_a368c8();
                    sub_a369bc("providers/implementations/kdfs/pbkdf1.c", 63, "kdf_pbkdf1_do_derive");
                    v10 = 524294;
                    goto LABEL_b5a290;
                }
                if (sub_a3fe04(v7, v6, 0) && sub_a3fe10(v7, (long long)v4[32], (long long)v4[40]) && sub_a3fe10(v7, (long long)v4[48], (long long)v4[56]) && sub_a3ff7c(v7, &v0, 0) && !(v8 = sub_a50ac8(v6), (int)v8 < 1))
                {
                    v9 = v8;
                    if (n > v9)
                    {
                        sub_a368c8();
                        sub_a369bc("providers/implementations/kdfs/pbkdf1.c", 76, "kdf_pbkdf1_do_derive");
                        v10 = 202;
LABEL_b5a290:
                        sub_a36abc(57, v10, 0);
                        goto LABEL_b5a298;
                    }
                    if ((unsigned long long)(long long)a0[64] >= 2)
                    {
                        v11 = (long long)a0[64] - 1;
                        do
                        {
                            v12 = v11;
                            if (!sub_a3fe04(v7, v6, 0) || !sub_a3fe10(v7, &v0, v9) || !sub_a3ff7c(v7, &v0, 0))
                                goto LABEL_b5a298;
                        } while ((v11 = v12 - 1, v12 != 1));
                        goto LABEL_b5a33c;
                        goto LABEL_b5a298;
                    }
                    else
                    {
LABEL_b5a33c:
                        _memcpy(a1, &v0, n);
                        v5 = 1;
                    }
                }
                else
                {
LABEL_b5a298:
                    v5 = 0;
                }
                sub_a66ec0(&v0, 64);
                sub_a3f73c(v7);
            }
            else
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/kdfs/pbkdf1.c", 192, "kdf_pbkdf1_derive");
                v13 = 131;
LABEL_b5a258:
                sub_a36abc(57, v13, 0);
                v5 = 0;
            }
        }
    }
    if (*(long long *)&g_10002b0 == v1)
        return v5;
    ___stack_chk_fail();
}
