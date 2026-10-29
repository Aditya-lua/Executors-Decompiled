/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab6cb8..0xab6f64 (684 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab6cb8_0 {
    char padding_0[136];
    long long field_88;
    char padding_90[8];
    void* field_98;
} st_ab6cb8_0;


unsigned long long sub_ab6cb8(st_ab6cb8_0 *a0, long long a1, unsigned long long *a2, unsigned long long a3, unsigned long n)
{
    void* v4;  // x23
    long long v5;  // x21
    long long v14;  // x3
    unsigned long v15;  // x4
    long long v16;  // x1
    unsigned long long v17;  // x0
    unsigned long long v18;  // x0
    long long v19;  // x1
    unsigned long long v6;  // w0
    unsigned long long v7;  // x0
    unsigned long long v8;  // x0
    unsigned int v9;  // w8
    char v10;  // x0
    unsigned long long v11;  // x1
    unsigned long v12;  // x0
    long long v13;  // x2
    char v0;  // [bp-0x58]
    char v1;  // [bp-0x54]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a0->field_98;
    v5 = sub_a59af4(a0->field_88);
    if (!(long long)v4[32])
    {
        v15 = (int)v4[28];
        v12 = n;
        v11 = a3;
        v13 = a1;
        v14 = v5;
        goto LABEL_ab6d78;
    }
    v6 = (unsigned int)sub_a50ac8((long long)v4[32]);
    if (v6 <= 0)
    {
        sub_a368c8();
        v19 = 151;
        goto LABEL_ab6dc4;
    }
    if (v6 == n)
    {
        if (sub_9c7b68((long long)v4[32]) != 95)
        {
            switch (v9)
            {
            case 1:
                v18 = sub_ab8fe0(sub_9c7b68((long long)v4[32]), a3, n, a1, &v0, v5);
                if ((int)v18 <= 0)
                    return v18;
                v8 = v0;
                if (v8 >> 31 & 1)
                    return v8;
                *a2 = v8 & 0xffffffff;
                return 1;
            case 6:
                if (!(long long)v4[56])
                {
                    v17 = sub_a6bf4c(sub_aafbcc(sub_a59af4(a0->field_88)), "crypto/rsa/rsa_pmeth.c", 118);
                    *(unsigned long long *)&v4[56] = v17;
                    if (v17)
                        goto LABEL_ab6ea8;
                    break;
                }
                else
                {
LABEL_ab6ea8:
                    if (sub_ab8788(v5))
                    {
                        v12 = sub_aafbcc(v5);
                        v11 = (long long)v4[56];
                        v13 = a1;
                        v14 = v5;
                        v15 = 3;
LABEL_ab6d78:
                        v8 = sub_aafc00(v12, v11, v13, v14, v15);
                        if (v8 >> 31 & 1)
                            return v8;
                        *a2 = v8 & 0xffffffff;
                        return 1;
                    }
                }
                break;
            case 5:
                if (sub_aafbcc(v5) > n)
                {
                    if (sub_ab7fd0(v4, a0))
                    {
                        _memcpy((long long)v4[56], a3, n);
                        v10 = sub_aba5a8(sub_9c7b68((long long)v4[32]));
                        *(char *)((long long)v4[56] + n) = v10;
                        v11 = (long long)v4[56];
                        v12 = (unsigned int)n + 1;
                        v13 = a1;
                        v14 = v5;
                        v15 = 5;
                        goto LABEL_ab6d78;
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/rsa/rsa_pmeth.c", 175, "pkey_rsa_sign");
                        v16 = 524292;
                    }
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("crypto/rsa/rsa_pmeth.c", 171, "pkey_rsa_sign");
                    v16 = 120;
                }
LABEL_ab6dd0:
                sub_a36abc(4, v16, 0);
                break;
            default:
                break;
            }
        }
        else if ((int)v4[28] == 1)
        {
            v7 = sub_ab8d0c(0, a3, n, a1, &v1, v5);
            if ((int)v7 <= 0)
                return v7;
            v8 = v1;
            if (v8 >> 31 & 1)
                return v8;
            *a2 = v8 & 0xffffffff;
            return 1;
        }
        return 0xffffffff;
    }
    sub_a368c8();
    v19 = 156;
LABEL_ab6dc4:
    sub_a369bc("crypto/rsa/rsa_pmeth.c", v19, "pkey_rsa_sign");
    v16 = 143;
    goto LABEL_ab6dd0;
}
