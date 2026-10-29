/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab99f4..0xab9bf8 (516 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_ab99f4(void* a0)
{
    unsigned int v3;  // w0
    long long v4;  // x1
    long long v5;  // x0
    unsigned long v6;  // x19
    unsigned long v7;  // x20
    unsigned long v8;  // x8
    long long v9;  // x0
    long long v10;  // x1
    char v0;  // [bp-0x44]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!(long long)a0[40])
        return (long long)a0[40];
    if (!(long long)a0[48])
        return 0;
    v3 = sub_9e46a8();
    if ((int)v3 > 0x4000)
    {
        sub_a368c8();
        sub_a369bc("crypto/rsa/rsa_sp800_56b_check.c", 294, "ossl_rsa_sp800_56b_check_public");
        v4 = 105;
    }
    else if (sub_9e5c70((long long)a0[40]))
    {
        if (sub_9e5c70((long long)a0[48]))
        {
            v5 = sub_9e4624();
            if ((int)sub_9e5528((long long)a0[48], v5) > 0)
            {
                v6 = sub_9dddcc((long long)a0[8]);
                v7 = sub_9e4958(v6);
                v8 = 0;
                if (v6 && v7)
                {
                    v9 = sub_9e8040();
                    if (!sub_9e18c0(v7, (long long)a0[40], v9, v6) || !sub_9e5b90(v7))
                    {
                        sub_a368c8();
                        v10 = 329;
                        goto LABEL_ab9bc4;
                    }
                    else if (sub_9e897c((long long)a0[40], 5, v6, 0, 1, &v0) == 1)
                    {
                        v8 = v0;
                        if ((unsigned int)v8 == 2)
                        {
                            v8 = 1;
                        }
                        else if (0x1ff < (int)v3 || (unsigned int)v8 != 1)
                        {
                            goto LABEL_ab9bac;
                        }
                    }
                    else
                    {
LABEL_ab9bac:
                        sub_a368c8();
                        v10 = 340;
LABEL_ab9bc4:
                        sub_a369bc("crypto/rsa/rsa_sp800_56b_check.c", v10, "ossl_rsa_sp800_56b_check_public");
                        sub_a36abc(4, 174, 0);
                        v8 = 0;
                    }
                }
                sub_9e48d4(v7);
                sub_9dded4(v6);
                return v8;
            }
        }
        sub_a368c8();
        sub_a369bc("crypto/rsa/rsa_sp800_56b_check.c", 314, "ossl_rsa_sp800_56b_check_public");
        v4 = 178;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/rsa/rsa_sp800_56b_check.c", 309, "ossl_rsa_sp800_56b_check_public");
        v4 = 174;
    }
    sub_a36abc(4, v4, 0);
    return 0;
}
