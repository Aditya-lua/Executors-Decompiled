/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb34dc8..0xb3507c (692 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_b34dc8(long long a0, long long a1, long long a2, unsigned long a3)
{
    unsigned long long v9;  // x0
    void* v10;  // x21
    unsigned int v19;  // w8
    long long v11;  // x0
    long long v12;  // x0
    unsigned long long v13;  // x0
    unsigned long long v14;  // x19
    unsigned long long v15;  // x2
    long long v16;  // x1
    unsigned long v17;  // x8
    long long v18;  // x0
    unsigned long long v0;  // [bp-0x110]
    unsigned long v1;  // [bp-0x108]
    unsigned long long v2;  // [bp-0xed]
    unsigned short v3;  // [bp-0xec]
    char v4;  // [bp-0xea]
    char v5;  // [bp-0xa8]
    unsigned long v6;  // [bp-0x68]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    v2 = 0;
    if (sub_a186b4(sub_a1abcc(sub_9ffdd0())) && !(v9 = sub_a646b8(), !v9))
    {
        v10 = v9;
        v11 = sub_a19700(a0);
        v12 = sub_a19708(a0);
        v13 = sub_a64d0c("HKDF", *(long long *)(v9 + 24), v11, v12);
        if (v13)
        {
            v14 = v13;
            if ((unsigned long long)(long long)v10[56] > a3)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/kem/ec_kem.c", 410, "ossl_ec_dhkem_derive_private");
                v0 = a3;
                v1 = (long long)v10[56];
                v15 = "ikm length is :%zu, should be at least %zu";
                v16 = 230;
                goto LABEL_b34ea0;
            }
            v17 = *(short *)v10;
            v3 = (((((v17 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v17 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v17 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v17 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48;
            if (sub_a64954(v14, &v5, (long long)v10[32], 0, 0, "KEM", &v3, 2, "dkp_prk", a2, a3))
            {
                v18 = sub_c4ba8(sub_9ffdd0(a0));
                if (sub_a64b24(v14, &v4, (long long)v10[56], &v5, (long long)v10[32], "KEM", &v3, 2, "candidate", &v2, 1))
                {
                    while (1)
                    {
                        v4 &= (char)v10[64];
                        if (!sub_9e4db0(&v4, (int)v10[56], a1))
                            break;
                        v19 = v2;
                        if (v19 != 0xff)
                        {
                            v2 = (char)v19 + 1;
                            if (!sub_9e4828(a1) && sub_9e5528(a1, v18) >> 31 & 1)
                            {
                                v13 = 1;
                                goto LABEL_b34ff0;
                            }
                            if (!sub_a64b24(v14, &v4, (long long)v10[56], &v5, (long long)v10[32], "KEM", &v3, 2, "candidate", &v2, 1))
                                break;
                        }
                        else
                        {
                            sub_a368c8();
                            sub_a369bc("providers/implementations/kem/ec_kem.c", 436, "ossl_ec_dhkem_derive_private");
                            v16 = 121;
                            v15 = 0;
LABEL_b34ea0:
                            sub_a36abc(57, v16, v15);
                            break;
                        }
                    }
                }
            }
            v13 = 0;
LABEL_b34ff0:
            sub_a66ec0(&v5, 64);
            sub_a66ec0(&v4, 66);
            sub_a53588(v14);
        }
    }
    else
    {
        v13 = 0xfffffffe;
    }
    if (*(long long *)&g_10002b0 == v6)
        return v13;
    ___stack_chk_fail();
}
