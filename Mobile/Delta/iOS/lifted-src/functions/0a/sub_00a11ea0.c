/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa11ea0..0xa12208 (872 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a11ea0_0 {
    char padding_0[264];
    struct st_a11ea0_1 *field_108;
} st_a11ea0_0;

typedef struct st_a11ea0_1 {
    unsigned long long field_0;
} st_a11ea0_1;


unsigned long long sub_a11ea0(st_a11ea0_0 **a0, long long a1, unsigned int a2, unsigned int a3, unsigned int a4, unsigned int a5)
{
    unsigned int v4;  // x19
    unsigned int v5;  // w0
    long long v14;  // x24
    long long v15;  // x22
    unsigned int v16;  // w0
    unsigned long long v17;  // 4162
    unsigned int v18;  // w8
    long long v19;  // x20
    unsigned long v20;  // x23
    unsigned long long v21;  // x23
    unsigned int v22;  // w0
    unsigned long long v23;  // 4166
    unsigned long long v6;  // 4199
    int v24;  // w9
    unsigned int v25;  // w8
    unsigned long v7;  // x8
    unsigned long v8;  // x9
    unsigned long long v9;  // x28
    unsigned long long v10;  // x27
    unsigned int v11;  // x8
    long long v12;  // x1
    unsigned int v13;  // x8
    unsigned int v0;  // [bp-0x70]
    unsigned long long v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (6 >= a2 && 1 << ((char)a2 & 31) & 84)
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
                sub_a369bc("crypto/ec/ec2_oct.c", 149, "ossl_ec_GF2m_simple_point2oct");
                sub_a36abc(16, 100, 0);
                return 0;
            }
        }
        v5 = sub_a1ad1c(a0);
        v6 = arm64g_calculate_condition(177, v5, 7, 0);
        v7 = (v6 & 1 ? v5 + 14 : v5 + 7);
        v8 = (int)((unsigned int)v7) >> 3;
        v9 = (long long)(v7 * 0x100000000) >> 63 & 0xffffffffe0000000 | __ROL__(v7, 61) & 0xe00000001fffffff & 0x1fffffff;
        v10 = v9 + 1;
        v11 = (a2 == 2 ? v10 : ((long long)(v8 * 0x100000000) >> 63 & 0xfffffffe00000000 | __ROL__(v8, 1) & 0x1fffffffe & 0x1ffffffff) + 1);
        if (!a3)
        {
            v1 = v11;
            sub_9dded4(0);
            return v1;
        }
        else if (v11 > a4)
        {
            sub_a368c8();
            sub_a369bc("crypto/ec/ec2_oct.c", 164, "ossl_ec_GF2m_simple_point2oct");
            v12 = 100;
        }
        else
        {
            v1 = v11;
            if (v4)
            {
                v13 = 0;
            }
            else
            {
                v13 = sub_9dde10();
                v4 = v13;
                if (!v4)
                    return v13;
            }
            v0 = v13;
            sub_9de064(v4);
            v14 = sub_9de208(v4);
            v15 = sub_9de208(v4);
            if (!sub_9de208(v4) || !sub_a1b3cc(a0, a1, v14, v15, v4))
            {
LABEL_a121f8:
                sub_9de17c(v4);
                sub_9dded4(v0);
                return 0;
            }
            *(char *)a3 = a2;
            if (a2 != 4 && !sub_9e4828(v14))
                *a0->field_108();
            v16 = sub_9e46a8(v14);
            v17 = arm64g_calculate_condition(177, v16, 7, 0);
            v18 = (unsigned int)v9 - ((int)((v17 & 1 ? v16 + 14 : v16 + 7)) >> 3);
            if (v18 > (unsigned int)v9)
            {
                v19 = 199;
            }
            else
            {
                if (v18)
                {
                    v20 = v18;
                    _bzero(a3 + 1, v20);
                    v21 = v20 + 1;
                }
                else
                {
                    v21 = 1;
                }
                if (v21 + sub_9e5350(v14, a3 + v21) != v10)
                {
                    v19 = 209;
                }
                else if (a2 >= 4)
                {
                    v22 = sub_9e46a8(v15);
                    v23 = arm64g_calculate_condition(177, v22, 7, 0);
                    v24 = (int)((v23 & 1 ? v22 + 14 : v22 + 7)) >> 3;
                    v25 = v9 - v24;
                    if (v25 > (unsigned int)v9)
                    {
                        v19 = 217;
                    }
                    else
                    {
                        if (v25)
                        {
                            _bzero(a3 + v10, v25);
                            v10 = v10 + v9 + -v24;
                        }
                        v10 += sub_9e5350(v15, a3 + v10);
                        goto LABEL_a121a8;
                    }
                }
                else
                {
LABEL_a121a8:
                    if (v10 == v1)
                    {
                        sub_9de17c(v4);
                        sub_9dded4(v0);
                        return v1;
                    }
                    v19 = 229;
                }
            }
            sub_a368c8();
            sub_a369bc("crypto/ec/ec2_oct.c", v19, "ossl_ec_GF2m_simple_point2oct");
            sub_a36abc(16, 0xc0103, 0);
            goto LABEL_a121f8;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec2_oct.c", 141, "ossl_ec_GF2m_simple_point2oct");
        v12 = 104;
    }
    sub_a36abc(16, v12, 0);
    sub_9dded4(0);
    return 0;
}
