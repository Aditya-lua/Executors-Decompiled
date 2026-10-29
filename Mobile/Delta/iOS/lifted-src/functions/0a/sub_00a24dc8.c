/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa24dc8..0xa250e8 (800 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a24dc8(long long *a0, long long a1, unsigned int a2, unsigned int a3, unsigned int a4, unsigned int a5)
{
    unsigned int v3;  // w21
    unsigned int v4;  // x19
    unsigned int v13;  // x0
    long long v14;  // x25
    unsigned int v15;  // x0
    long long v16;  // x22
    unsigned int v17;  // w8
    unsigned int v18;  // w0
    unsigned long long v19;  // 4162
    unsigned int v20;  // w8
    long long v21;  // x20
    unsigned long v22;  // x23
    unsigned int v5;  // w0
    unsigned long long v23;  // x23
    unsigned int v24;  // w0
    unsigned long long v25;  // 4166
    int v26;  // w9
    unsigned int v27;  // w8
    unsigned long long v6;  // 4199
    unsigned long v7;  // x8
    unsigned long v8;  // x9
    unsigned long v9;  // x26
    unsigned int v10;  // x28
    unsigned int v11;  // x27
    long long v12;  // x1
    unsigned int v0;  // [bp-0x68]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (6 >= a2 && !(v3 = a2, !(1 << ((char)a2 & 31) & 84)))
    {
        v4 = a5;
        if (sub_a1b4f4())
        {
            if (!a3)
            {
                return 1;
            }
            else if (a4)
            {
                *(char *)a3 = 0;
                return 1;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/ec/ecp_oct.c", 180, "ossl_ec_GFp_simple_point2oct");
                sub_a36abc(16, 100, 0);
                return 0;
            }
        }
        v5 = sub_9e46a8(a0[8]);
        v6 = arm64g_calculate_condition(177, v5, 7, 0);
        v7 = (v6 & 1 ? v5 + 14 : v5 + 7);
        v8 = (int)((unsigned int)v7) >> 3;
        v9 = (long long)(v7 * 0x100000000) >> 63 & 0xffffffffe0000000 | __ROL__(v7, 61) & 0xe00000001fffffff & 0x1fffffff;
        v10 = v9 + 1;
        v11 = (v3 == 2 ? v10 : ((long long)(v8 * 0x100000000) >> 63 & 0xfffffffe00000000 | __ROL__(v8, 1) & 0x1fffffffe & 0x1ffffffff) + 1);
        if (!a3)
        {
            sub_9dded4(0);
            return v11;
        }
        else if (v11 > a4)
        {
            sub_a368c8();
            sub_a369bc("crypto/ec/ecp_oct.c", 195, "ossl_ec_GFp_simple_point2oct");
            v12 = 100;
        }
        else
        {
            if (v4)
            {
                v13 = 0;
            }
            else
            {
                v13 = sub_9dddcc(a0[21]);
                v4 = v13;
                if (!v4)
                    return v13;
            }
            v0 = v13;
            sub_9de064(v4);
            v14 = sub_9de208(v4);
            v15 = sub_9de208(v4);
            if (!v15 || !(v16 = v15, sub_a1b3cc(a0, a1, v14, v16, v4)))
            {
LABEL_a250d8:
                sub_9de17c(v4);
                sub_9dded4(v0);
                return 0;
            }
            v17 = v3;
            if ((v17 | 4) == 6)
            {
                if (!sub_9e5c70(v16))
                    v17 = v3;
                else
                    v17 = v3 + 1;
            }
            *(char *)a3 = v17;
            v18 = sub_9e46a8(v14);
            v19 = arm64g_calculate_condition(177, v18, 7, 0);
            v20 = (unsigned int)v9 - ((int)((v19 & 1 ? v18 + 14 : v18 + 7)) >> 3);
            if (v20 > (unsigned int)v9)
            {
                v21 = 226;
            }
            else
            {
                if (v20)
                {
                    v22 = v20;
                    _bzero(a3 + 1, v22);
                    v23 = v22 + 1;
                }
                else
                {
                    v23 = 1;
                }
                if (v23 + sub_9e5350(v14, a3 + v23) != v10)
                {
                    v21 = 236;
                }
                else if ((v3 | 2) == 6)
                {
                    v24 = sub_9e46a8(v16);
                    v25 = arm64g_calculate_condition(177, v24, 7, 0);
                    v26 = (int)((v25 & 1 ? v24 + 14 : v24 + 7)) >> 3;
                    v27 = v9 - v26;
                    if (v27 > (unsigned int)v9)
                    {
                        v21 = 244;
                    }
                    else
                    {
                        if (v27)
                        {
                            _bzero(a3 + v10, v27);
                            v10 = v10 + v9 + -v26;
                        }
                        v10 += sub_9e5350(v16, a3 + v10);
                        goto LABEL_a2508c;
                    }
                }
                else
                {
LABEL_a2508c:
                    if (v10 == v11)
                    {
                        sub_9de17c(v4);
                        sub_9dded4(v0);
                        return v11;
                    }
                    v21 = 0x100;
                }
            }
            sub_a368c8();
            sub_a369bc("crypto/ec/ecp_oct.c", v21, "ossl_ec_GFp_simple_point2oct");
            sub_a36abc(16, 0xc0103, 0);
            goto LABEL_a250d8;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ecp_oct.c", 172, "ossl_ec_GFp_simple_point2oct");
        v12 = 104;
    }
    sub_a36abc(16, v12, 0);
    sub_9dded4(0);
    return 0;
}
