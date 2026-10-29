/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa71030..0xa71204 (468 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a71030(void* a0, unsigned long long a1)
{
    unsigned long long v2;  // x1
    long long v3;  // x1
    long long v12;  // x1
    long long v13;  // x1
    long long v14;  // x1
    unsigned long long v4;  // x20
    unsigned int v5;  // w0
    unsigned long long v6;  // 4198
    unsigned long v7;  // x8
    unsigned long long v8;  // x9
    unsigned int v9;  // w8
    unsigned long v10;  // x9
    unsigned long long v11;  // x9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        sub_a368c8();
        v14 = 1117;
        goto LABEL_a71138;
    }
    *(unsigned long long *)&a0[32] = 0;
    if (a1)
    {
        v2 = a1;
        if ((int)a0[8] == 2 && (v2 = a1, sub_9e5c94(a1)))
        {
            sub_a368c8();
            v3 = 1126;
            goto LABEL_a71084;
        }
        v4 = v2;
        v5 = sub_9e46a8(v2);
        v6 = arm64g_calculate_condition(177, v5, 7, 0);
        v7 = (v6 & 1 ? v5 + 14 : v5 + 7);
        v8 = (long long)(v7 * 0x100000000) >> 63 & 0xffffffffe0000000 | __ROL__(v7, 61) & 0xe00000001fffffff & 0x1fffffff;
        v9 = (int)a0[8];
        v10 = (v9 != 1 ? v8 : v8 + 1);
        v11 = (1 < v10 ? v10 : 1);
        if (!(long long)a0[16])
        {
            *(unsigned long long *)&a0[32] = v11;
            return 1;
        }
        if (v11 > (unsigned long long)(long long)a0[24])
        {
            *(unsigned long long *)&a0[32] = v11;
            sub_a368c8();
            sub_a369bc("crypto/params.c", 1165, "OSSL_PARAM_set_BN");
            v12 = 116;
        }
        else if (v9 == 1)
        {
            if (!(sub_9e5390(v4) >> 31 & 1))
            {
                *(long long *)&a0[32] = (long long)a0[24];
                return 1;
            }
            sub_a368c8();
            v13 = 1153;
            goto LABEL_a711f4;
            goto LABEL_a711f4;
        }
        else if (v9 == 2)
        {
            if (!(sub_9e536c(v4) >> 31 & 1))
            {
                *(long long *)&a0[32] = (long long)a0[24];
                return 1;
            }
            sub_a368c8();
            v13 = 1147;
LABEL_a711f4:
            sub_a369bc("crypto/params.c", v13, "OSSL_PARAM_set_BN");
            v12 = 127;
        }
        else
        {
            sub_a368c8();
            v3 = 1158;
LABEL_a71084:
            sub_a369bc("crypto/params.c", v3, "OSSL_PARAM_set_BN");
            v12 = 129;
        }
    }
    else
    {
        sub_a368c8();
        v14 = 1122;
LABEL_a71138:
        sub_a369bc("crypto/params.c", v14, "OSSL_PARAM_set_BN");
        v12 = 786690;
    }
    sub_a36abc(15, v12, 0);
    return 0;
}
