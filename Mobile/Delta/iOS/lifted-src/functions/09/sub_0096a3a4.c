/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96a3a4..0x96a5ac (520 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_96a3a4_2 {
    char padding_0[1624];
    char *field_658;
    char padding_660[8];
    char *field_668;
} st_96a3a4_2;

typedef struct st_96a3a4_1 {
    char padding_0[8];
    struct st_96a3a4_2 *field_8;
    char padding_10[104];
    char *field_78;
    char padding_80[152];
    char *field_118;
    char padding_120[704];
    char *field_3e0;
    char *field_3e8;
    char padding_3f0[24];
    char *field_408;
    char padding_410[1136];
    struct st_96a3a4_0 *field_880;
} st_96a3a4_1;

typedef struct st_96a3a4_0 {
    char padding_0[30];
    unsigned short field_1e;
    char padding_20[32];
    char *field_40;
    char *field_48;
    char *field_50;
    char *field_58;
} st_96a3a4_0;

extern char g_d282a4;
extern char g_d282a6;

char * sub_96a3a4(st_96a3a4_1 *a0)
{
    unsigned long long v2;  // x1
    char *v3;  // x0
    char *v12;  // x0
    char *v13;  // x9
    char *v14;  // x10
    char *v15;  // x10
    st_96a3a4_1 *v17;  // x0
    long long v18;  // x1
    long long v19;  // x2
    st_96a3a4_0 *v4;  // x8
    char *v5;  // w9
    char *v6;  // x21
    char *v7;  // x22
    unsigned long v8;  // cc_dep1
    unsigned long long v9;  // 4105
    unsigned long long v10;  // 4105
    char *v11;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_a6c2e4(*(long long *)&a0[2].padding_410[104], "ssl/t1_lib.c", 2923);
    *(uint128_t *)&a0[2].padding_410[104] = 0;
    v2 = a0->field_118 * 4;
    if (a0->field_408)
    {
        _bzero(a0->field_408, v2);
        if (!a0->field_408)
            return a0->field_408;
    }
    else
    {
        v3 = sub_a6bffc(v2, "ssl/t1_lib.c", 2931);
        a0->field_408 = v3;
        if (!v3)
            return v3;
    }
    if (!a0->field_3e8 && !a0->field_3e0)
    {
        v4 = a0->field_880;
        v5 = (char *)(v4->field_1e & 3);
        if (1 < v5)
        {
            v8 = v5 & 0xffff;
            if (v5 == 2)
            {
                v6 = &g_d282a6;
                v9 = arm64g_calculate_condition(3, v8, 2, 0);
                if (!(v9 & 1))
                    goto LABEL_96a516;
LABEL_96a515:
                v7 = 1;
            }
            else
            {
                v6 = &g_d282a4;
                v10 = arm64g_calculate_condition(3, v8, 2, 0);
                if (v10 & 1)
                    goto LABEL_96a515;
LABEL_96a516:
                v7 = 2;
            }
        }
        else if (v5)
        {
            v6 = &g_d282a4;
            v7 = 1;
        }
        else if ((int)a0->field_78 == 1 && !(v6 = v4->field_50, !v6))
        {
            v7 = v4->field_58;
        }
        else
        {
            v6 = v4->field_40;
            if (v6)
            {
                v7 = v4->field_48;
            }
            else
            {
                v6 = a0->field_8->field_668;
                v7 = a0->field_8->field_658;
            }
        }
        if (!a0->field_118)
            return 1;
        v11 = 0;
        do
        {
            v12 = sub_9694fc(a0, v11);
            if (v12 && v7)
            {
                v13 = v6;
                v14 = v7;
                do
                {
                    v15 = v14;
                    if (*(short *)&v12[16] == *(short *)v13)
                    {
                        *(unsigned int *)(a0->field_408 + 0x4 * v11) = 2;
                        break;
                    }
                } while ((v14 = v15 - 1, v13 += 2, v15 != 1));
            }
        } while ((v11 += 1, a0->field_118 > v11));
        return 1;
    }
    if (sub_96a5ac(a0))
    {
        if (*(long long *)&a0[2].padding_410[104])
            return 1;
        sub_a368c8();
        sub_a369bc("ssl/t1_lib.c", 2969, "tls1_set_server_sigalgs");
        v17 = a0;
        v18 = 40;
        v19 = 376;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/t1_lib.c", 2961, "tls1_set_server_sigalgs");
        v17 = a0;
        v18 = 80;
        v19 = 786691;
    }
    sub_9a58a4(v17, v18, v19, 0);
    return 0;
}
