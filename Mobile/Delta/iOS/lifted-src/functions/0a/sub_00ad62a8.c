/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad62a8..0xad6458 (432 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad62a8_0 {
    unsigned int field_0;
    char padding_4[4];
    long long field_8;
    char padding_10[4];
    unsigned int field_14;
} st_ad62a8_0;


long long sub_ad62a8(st_ad62a8_0 *a0, int a1, long long a2)
{
    unsigned int v3;  // w8
    unsigned long long v12;  // x15
    long long v13;  // w16
    long long v14;  // w15
    long long v15;  // x13
    unsigned long v16;  // x13
    unsigned long long v17;  // x15
    unsigned long long v18;  // 4141
    long long v19;  // x0
    long long v20;  // x0
    unsigned int v4;  // x19
    unsigned int v5;  // x20
    unsigned long v6;  // cc_dep1
    unsigned int v7;  // w13
    unsigned long long v8;  // 4108
    unsigned long long v9;  // 4108
    unsigned int v10;  // w12
    long long v11;  // w14
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1 > (int)(a0->field_0 ^ 0x7fffffff))
    {
        sub_a368c8();
        sub_a369bc("crypto/stack/stack.c", 185, "sk_reserve");
        sub_a36abc(15, 114, 0);
        return 0;
    }
    v3 = a0->field_0 + a1;
    if (4 < (int)v3)
        v4 = v3;
    else
        v4 = 4;
    if (a0->field_8)
    {
        v5 = a0->field_14;
        if (a2)
        {
            v5 = v4;
            if (v5 != v5)
                goto LABEL_ad6324;
        }
        else if ((int)v4 > (int)v5)
        {
            do
            {
                if (6 < v5 + 0xf0000000 >> 29)
                {
                    v5 = ((int)((v5 * 8) * 1717986919) >> 33) + ((v5 * 8) * 1717986919 >> 63);
                    continue;
                }
                v6 = v5 & 0xffffffff;
                if ((int)v5 < 8)
                {
                    v7 = v5;
                    v8 = arm64g_calculate_condition(195, v6, 8, 0);
                    if (!(v8 & 1))
                        goto LABEL_ad63ce;
                    goto LABEL_ad63cd;
                }
                else
                {
                    v7 = 8;
                    v9 = arm64g_calculate_condition(195, v6, 8, 0);
                    if (v9 & 1)
                    {
LABEL_ad63cd:
                        v10 = v5;
                        goto LABEL_ad63d0;
                    }
                    else
                    {
LABEL_ad63ce:
                        v10 = 8;
LABEL_ad63d0:
                        v11 = v10 / 5;
                        v12 = (v10 - v11 * 5) * v7;
                        v13 = (int)(v5) >> 31 ^ 0x7fffffff;
                        if (v12 != (int)v12)
                            v14 = v13;
                        else
                            v14 = (unsigned int)v12;
                        v15 = v11 * v7;
                        if (v15 != (int)v15)
                            v16 = v13;
                        else
                            v16 = v15 & 0xffffffff;
                        v17 = (v14 * 1717986919 >> 33) + ((unsigned long long)(v14 * 1717986919) >> 63);
                        v5 = v16 + v17;
                        v18 = arm64g_calculate_condition(113, v16 & 0xffffffff, v17 & 0xffffffff, 0);
                        if (v15 != (int)v15 || v12 != (int)v12 || !(v18 & 1))
                        {
                            sub_a368c8();
                            sub_a369bc("crypto/stack/stack.c", 211, "sk_reserve");
                            sub_a36abc(15, 114, 0);
                            return 0;
                        }
                    }
                }
            } while ((int)v4 > (int)v5);
LABEL_ad6324:
            v19 = sub_a6c1b4(a0->field_8, (long long)(v5 * 0x100000000) >> 63 & 0xfffffff800000000 | __ROL__(v5, 3) & 0x7fffffff8 & 0x7ffffffff, "crypto/stack/stack.c", 218);
            if (!v19)
                return v19;
            a0->field_8 = v19;
            a0->field_14 = v5;
        }
    }
    else
    {
        v20 = sub_a6bffc((v4 * 8 | v4 >> 61) & 0x7fffffff8 & 0x7ffffffff, "crypto/stack/stack.c", 200);
        a0->field_8 = v20;
        if (!v20)
            return v20;
        a0->field_14 = v4;
    }
    return 1;
}
