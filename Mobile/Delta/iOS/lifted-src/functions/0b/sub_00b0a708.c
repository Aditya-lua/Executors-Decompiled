/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0a708..0xb0a9c4 (700 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b0a708_0 {
    char padding_0[48];
    unsigned long long field_30;
    unsigned int field_38;
    char padding_3c[4];
    unsigned int field_40;
    char padding_44[40];
    char field_6c;
    char padding_6d[67];
    unsigned long long field_b0;
} st_b0a708_0;

extern unsigned long long g_acbd00;
extern unsigned long long g_acbd60;
extern unsigned int g_acbdc0;
extern unsigned int g_acc0a0;
extern unsigned int g_acc520;
extern unsigned long long g_acca24;
extern unsigned long long g_acd334;
extern unsigned long long g_ace320;
extern unsigned long long g_ace540;
extern unsigned int g_ace760;
extern unsigned int g_acea80;
extern unsigned int g_acf860;
extern unsigned long long g_ad2260;
extern unsigned long long g_ad2440;
extern unsigned int g_ad2620;
extern unsigned int g_ad2900;
extern unsigned int g_ad35e0;
extern unsigned int g_f0d568;
extern unsigned int g_f0d56c;

unsigned int sub_b0a708(st_b0a708_0 *a0, long long a1)
{
    unsigned int v2;  // w9
    unsigned long v3;  // cc_dep1
    unsigned long long v12;  // x8
    unsigned int v13;  // x10
    unsigned int v14;  // x9
    unsigned int v15;  // w10
    unsigned long long v16;  // 4112
    unsigned long long v17;  // 4102
    unsigned long long v18;  // 4112
    unsigned long long v19;  // 4102
    unsigned int v20;  // w8
    unsigned long v4;  // cc_dep2
    unsigned int v5;  // w10
    unsigned int v6;  // w8
    unsigned long long v7;  // 4112
    unsigned long long v8;  // 4102
    unsigned long long v9;  // 4112
    unsigned long long v10;  // 4102
    unsigned int v11;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    a0->field_b0 = &a0[1].padding_0[8];
    if (!(a0->field_6c >> 1 & 1) && (v2 = a0->field_40 - 1, v3 = v2, v4 = 2, 2 > v2))
    {
        if (g_f0d568 >> 10 & 1)
        {
            sub_acbc60(a1);
            v13 = (unsigned int)&g_acc0a0;
            if (a0->field_40 != 2)
                v13 = 0;
            if (a0->field_40 == 1)
                v14 = (unsigned int)&g_acbdc0;
            else
                v14 = v13;
            a0->field_30 = &g_acbd60;
            *(unsigned long long *)&a0->field_38 = v14;
            return 1;
        }
        v5 = g_f0d56c & 0xfffffff0 & 0xff0fffff;
        if (g_f0d568 >> 7 & 1)
        {
            v3 = v5;
            v4 = 1208995856;
            if (v5 == 1208995856)
            {
                sub_ad2240(a1);
                a0->field_30 = &g_ad2440;
                *(unsigned long long *)&a0->field_38 = 0;
                v6 = a0->field_40;
                if (v6 == 1)
                {
                    *(unsigned int **)&a0->field_38 = &g_ad2620;
                    return 1;
                }
LABEL_b0a7f8:
                if (v6 != 2)
                    return 1;
                *(unsigned int **)&a0->field_38 = &g_ad2900;
                return 1;
            }
        }
        if (g_f0d568 >> 7 & 1)
        {
            if (v5 != 0x410fd400)
            {
                v7 = arm64g_calculate_condition(19, v3, v4, 0);
                v8 = arm64g_calculate_condition(19, (v7 & 1 ? v5 : 0x40000000), (v7 & 1 ? 1091555520 : 0), 0);
                if (!(v8 & 1))
                    goto LABEL_b0a948;
            }
            else
            {
                v9 = arm64g_calculate_condition(19, v3, v4, 0);
                v10 = arm64g_calculate_condition(16, (v9 & 1 ? v5 : 0x40000000), (v9 & 1 ? 1091555520 : 0), 0);
                if (!(v10 & 1))
                {
LABEL_b0a948:
                    sub_ace300(a1);
                    a0->field_30 = &g_ace540;
                    *(unsigned long long *)&a0->field_38 = 0;
                    v11 = a0->field_40;
                    if (v11 == 1)
                    {
                        *(unsigned int **)&a0->field_38 = &g_ace760;
                        return 1;
                    }
LABEL_b0a968:
                    if (v11 != 2)
                        return 1;
                    *(unsigned int **)&a0->field_38 = &g_acea80;
                    return 1;
                }
            }
        }
        sub_acc878(a1);
        v12 = &g_acd334;
    }
    else
    {
        if (g_f0d568 >> 10 & 1)
        {
            sub_acbc00(a1);
            a0->field_30 = &g_acbd00;
            *(unsigned long long *)&a0->field_38 = 0;
            switch (v20)
            {
            case 1:
                *(unsigned int **)&a0->field_38 = &g_acbdc0;
                return 1;
            case 5:
                *(unsigned int **)&a0->field_38 = &g_acc520;
                return 1;
            case 2:
                *(unsigned int **)&a0->field_38 = &g_acc0a0;
            default:
                return 1;
            }
        }
        v15 = g_f0d56c & 0xfffffff0 & 0xff0fffff;
        if (g_f0d568 >> 7 & 1)
        {
            v3 = v15;
            v4 = 1208995856;
            if (v15 == 1208995856)
            {
                sub_ad2220(a1);
                a0->field_30 = &g_ad2260;
                *(unsigned long long *)&a0->field_38 = 0;
                v6 = a0->field_40;
                switch (v6)
                {
                case 1:
                    *(unsigned int **)&a0->field_38 = &g_ad2620;
                    return 1;
                case 5:
                    *(unsigned int **)&a0->field_38 = &g_ad35e0;
                    return 1;
                default:
                    goto LABEL_b0a7f8;
                }
            }
        }
        if (g_f0d568 >> 7 & 1)
        {
            if (v15 != 0x410fd400)
            {
                v16 = arm64g_calculate_condition(19, v3, v4, 0);
                v17 = arm64g_calculate_condition(19, (v16 & 1 ? v15 : 0x40000000), (v16 & 1 ? 1091555520 : 0), 0);
                if (!(v17 & 1))
                    goto LABEL_b0a870;
            }
            else
            {
                v18 = arm64g_calculate_condition(19, v3, v4, 0);
                v19 = arm64g_calculate_condition(16, (v18 & 1 ? v15 : 0x40000000), (v18 & 1 ? 1091555520 : 0), 0);
                if (!(v19 & 1))
                {
LABEL_b0a870:
                    sub_ace2e0(a1);
                    a0->field_30 = &g_ace320;
                    *(unsigned long long *)&a0->field_38 = 0;
                    v11 = a0->field_40;
                    switch (v11)
                    {
                    case 1:
                        *(unsigned int **)&a0->field_38 = &g_ace760;
                        return 1;
                    case 5:
                        *(unsigned int **)&a0->field_38 = &g_acf860;
                        return 1;
                    default:
                        goto LABEL_b0a968;
                    }
                }
            }
        }
        sub_acc878(a1);
        v12 = &g_acca24;
    }
    a0->field_30 = v12;
    return 1;
}
