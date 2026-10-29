/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ea080..0x9ea45c (988 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_e8bc40;

unsigned int sub_9ea080(long long a0, long long a1, unsigned int a2, long long a3, long long a4, int a5, long long a6, long long a7)
{
    long long v8;  // x27
    long long v9;  // x24
    unsigned int v18;  // w27
    unsigned int v19;  // w0
    unsigned int v20;  // w8
    long long v10;  // x20
    unsigned int v11;  // x0
    long long v12;  // x26
    unsigned long long v13;  // x23
    unsigned int v14;  // w8
    long long v15;  // x24
    unsigned int v16;  // w26
    unsigned int v17;  // x21
    unsigned int i;  // [bp-0x94]
    long long v1;  // [bp-0x88]
    long long v2;  // [bp-0x80]
    long long v3;  // [bp-0x78]
    long long v4;  // [bp-0x70]
    long long v5;  // [bp-0x68]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v8 = a6;
    v5 = a1;
    sub_9de064(a7);
    v4 = sub_9de208(a7);
    v2 = sub_9de208(a7);
    v3 = sub_9de208(a7);
    v9 = sub_9de208(a7);
    v1 = sub_9de208(a7);
    v10 = sub_9de208(a7);
    v11 = sub_9de208(a7);
    if (v11)
    {
        v12 = v11;
        v13 = a5 >> 1;
        if (a2)
        {
            i = v13;
            if (sub_9e4c34(v5, a2))
                goto LABEL_9ea13c;
        }
        else if ((int)v13 >= (int)sub_9e46a8(&g_e8bc40) && !(v8 = v8, !sub_9ea668(v4, &g_e8bc40, v13 - sub_9e46a8(&g_e8bc40)) || (i = v13, !sub_9ea668(v2, sub_9e4624(), v13) || !sub_9db58c(v2, v2, v4))))
        {
LABEL_9ea13c:
            if (sub_9ea45c(v12, a3) && sub_9e1750(v9, v12, a4, a7) && sub_9e1750(v3, a4, v12, a7) && sub_9e7dc8(v3, v3, a4, a7) && sub_9e7dc8(v9, v9, v12, a7) && sub_9db58c(v3, v3, v9) && sub_9e7dc8(v1, v12, a4, a7) && (!sub_9e5c94(v3) || sub_9db29c(v3, v3, v1)))
            {
                if (0x7ff < a5)
                    v14 = 5;
                else
                    v14 = 0;
                if (0xbff < a5)
                    v15 = 4;
                else
                    v15 = v14;
                v16 = i * 20;
                v17 = v5;
                if (a2)
                    goto LABEL_9ea30c;
                do
                {
                    if (!sub_9e93c8(v17, v2, 0, a7) || !sub_9db29c(v17, v17))
                        break;
LABEL_9ea30c:
                    if (!sub_9e6138(a0, v3, v17, v1, a7) || !sub_9db29c(a0, a0, v17))
                        break;
                    v8 = v8;
                    if (1 < (int)v16)
                        v18 = v16;
                    else
                        v18 = 1;
                    while ((int)i >= (int)sub_9e46a8(a0))
                    {
                        sub_9e804c(v7, 0, 2);
                        if (!sub_9e4c34(v10, a0) || !sub_9ebaf8(v10, 1))
                            goto LABEL_9ea2a8;
                        if (!sub_9e1838(v10, v8, a7))
                            goto LABEL_9ea3cc;
                        v19 = sub_9e8920(a0, v15, a7, v7);
                        switch (v20)
                        {
                        case 0:
LABEL_9ea3cc:
                            if (v18 == 1)
                            {
                                sub_a368c8();
                                sub_a369bc("crypto/bn/bn_rsa_fips186_4.c", 391, "ossl_bn_rsa_fips186_4_derive_prime");
                                sub_a36abc(3, 121, 0);
                                sub_9e4cf0(v10);
                                sub_9de17c(a7);
                                return 0;
                            }
                            v17 = 0;
                            v18 -= 1;
                            if (!sub_9db29c(a0, a0, v1))
                            {
                                sub_9e4cf0(v10);
                                sub_9de17c(a7);
                                return 0;
                            }
                            break;
                        case 2:
                            goto LABEL_9ea2a8;
                        case 7:
                            sub_9e804c(v7, 3, 0);
                            sub_9e4cf0(v10);
                            sub_9de17c(a7);
                            return 1;
                        default:
                            return v17;
                        }
                        continue;
                        goto LABEL_9ea2a8;
                    }
                } while ((v17 = v5, !a2));
            }
        }
    }
LABEL_9ea2a8:
    sub_9e4cf0(v10);
    sub_9de17c(a7);
    return 0;
}
