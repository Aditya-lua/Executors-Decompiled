/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ca51c..0x9ca7cc (688 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_e8a5b8;
extern char g_10002b0;

unsigned long long sub_9ca51c(long long a0, long long a1, int a2, long long a3, unsigned long a4, unsigned long a5, long long a6, long long a7)
{
    unsigned long long v7;  // x19
    unsigned long long v8;  // x0
    unsigned long long v13;  // 4102
    unsigned long v14;  // cc_op
    unsigned long v15;  // cc_dep1
    unsigned long v16;  // cc_dep2
    unsigned long v17;  // cc_ndep
    unsigned long long v18;  // 4110
    unsigned long long v19;  // 4102
    unsigned long long v9;  // w21
    long long v20;  // x1
    unsigned long long v21;  // x22
    unsigned long long v10;  // x20
    long long v22;  // x1
    unsigned long long v12;  // 4110
    char v0;  // [bp-0xc0], Other Possible Types: long long
    char v1;  // [bp-0xb8], Other Possible Types: long long
    char v2;  // [bp-0xb0], Other Possible Types: long long
    char v3;  // [bp-0xa8], Other Possible Types: unsigned long
    unsigned long v4;  // [bp-0x68]
    char *v5;  // [bp-0x10]
    long long v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    if (sub_a2d030())
    {
        v7 = sub_9c5520(&g_e8a5b8, a3);
        if (v7)
        {
            v8 = sub_a50904(a0);
            if (!(v8 >> 31 & 1))
            {
                v9 = (unsigned int)v8;
                v10 = v8 & 0xffffffff;
                if (*(long long *)(v7 + 32))
                {
                    if (sub_9c1860(&v3))
                    {
                        v12 = arm64g_calculate_condition(v14 | 16, v15, v16, v17);
                        v13 = arm64g_calculate_condition(4, (v12 & 1 ? v3 : 0), (v12 & 1 ? v10 : 0), 0);
                        if (!(v13 & 1))
                            goto LABEL_9ca5b8;
                    }
                    else
                    {
                        v18 = arm64g_calculate_condition(v14 | 16, v15, v16, v17);
                        v19 = arm64g_calculate_condition(0, (v18 & 1 ? v3 : 0), (v18 & 1 ? v10 : 0), 0);
                        if (!(v19 & 1))
                        {
LABEL_9ca5b8:
                            sub_a368c8();
                            sub_a369bc("crypto/asn1/p5_scrypt.c", 278, "PKCS5_v2_scrypt_keyivgen_ex");
                            v20 = 123;
                            goto LABEL_9ca754;
                        }
                    }
                }
                if (!sub_9c1860(&v0, *(long long *)(v7 + 8)) || !sub_9c1860(&v1, *(long long *)(v7 + 16)) || !sub_9c1860(&v2, *(long long *)(v7 + 24)) || !sub_a5c4a4(0, 0, 0, 0, v0, v1, v2, 0, 0, 0, a7, v6))
                {
                    sub_a368c8();
                    sub_a369bc("crypto/asn1/p5_scrypt.c", 289, "PKCS5_v2_scrypt_keyivgen_ex");
                    v20 = 171;
LABEL_9ca754:
                    sub_a36abc(6, v20, 0);
                    v21 = 0;
                    if (v9)
                        goto LABEL_9ca764;
                }
                else if (sub_a5c4a4(a1, a2, *(long long *)(*(long long *)v7 + 8), *(int *)*(long long *)v7, v0, v1, v2, 0, &v3, v10, a7, v6))
                {
                    v21 = sub_a4c694(a0, 0, 0, &v3, 0, a6);
                    if (v9)
                        goto LABEL_9ca764;
                }
                else
                {
                    v21 = 0;
                    if (v9)
                    {
LABEL_9ca764:
                        sub_a66ec0(&v3, v10);
                    }
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/asn1/p5_scrypt.c", 267, "PKCS5_v2_scrypt_keyivgen_ex");
                v22 = 130;
LABEL_9ca720:
                sub_a36abc(6, v22, 0);
                v21 = 0;
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/asn1/p5_scrypt.c", 261, "PKCS5_v2_scrypt_keyivgen_ex");
            v22 = 114;
            goto LABEL_9ca720;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/asn1/p5_scrypt.c", 252, "PKCS5_v2_scrypt_keyivgen_ex");
        sub_a36abc(6, 131, 0);
        v7 = 0;
        v21 = 0;
    }
    sub_9cd960(v7, &g_e8a5b8);
    if (*(long long *)&g_10002b0 == v4)
        return v21;
    ___stack_chk_fail();
}
