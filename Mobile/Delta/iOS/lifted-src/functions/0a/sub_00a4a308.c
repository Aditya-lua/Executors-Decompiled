/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4a308..0xa4a530 (552 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4a308_0 {
    char padding_0[128];
    unsigned long long field_80;
    unsigned int field_88;
} st_a4a308_0;

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
extern unsigned int g_f0d568;
extern unsigned int g_f0d56c;

int sub_a4a308(long long a0, long long a1, unsigned long a2, unsigned int a3)
{
    st_a4a308_0 *v2;  // x19
    unsigned long long v12;  // 4112
    unsigned long long v13;  // 4102
    unsigned long long v14;  // 4112
    unsigned long long v15;  // 4102
    unsigned int v17;  // x9
    unsigned int v18;  // w8
    unsigned long long v19;  // 4112
    unsigned long long v20;  // 4102
    unsigned long long v21;  // 4112
    unsigned int v4;  // w20
    unsigned long long v22;  // 4102
    unsigned int v5;  // w9
    unsigned long v6;  // cc_op
    unsigned long v7;  // cc_dep1
    unsigned long v8;  // cc_dep2
    unsigned long v9;  // cc_ndep
    unsigned long long v10;  // 4118
    unsigned int v11;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9ffdd8();
    v4 = sub_a4fdf4(sub_a2d030(a0));
    if (!a3)
    {
        v5 = v4 - 3;
        v6 = 1;
        v7 = v5;
        v8 = 2;
        v9 = 0;
        v10 = arm64g_calculate_condition(49, v5, 2, 0);
        if (!(v10 & 1))
        {
            if (!(g_f0d568 >> 10 & 1))
            {
                if (g_f0d568 >> 7 & 1)
                {
                    v11 = g_f0d56c & 0xfffffff0 & 0xff0fffff;
                    if (v11 != 0x410fd400)
                    {
                        v12 = arm64g_calculate_condition(0x11, v7, 2, 0);
                        v13 = arm64g_calculate_condition(19, (v12 & 1 ? v11 : 0x40000000), (v12 & 1 ? 1091555520 : 0), 0);
                        if (!(v13 & 1))
                            goto LABEL_a4a394;
                    }
                    else
                    {
                        v14 = arm64g_calculate_condition(0x11, v7, 2, 0);
                        v15 = arm64g_calculate_condition(16, (v14 & 1 ? v11 : 0x40000000), (v14 & 1 ? 1091555520 : 0), 0);
                        if (!(v15 & 1))
                        {
LABEL_a4a394:
                            sub_ace300(a1, v2);
                            v2->field_80 = &g_ace540;
                            if (v4 != 2)
                            {
                                *(unsigned int **)&v2->field_88 = &g_ace760;
                                return 1;
                            }
                            *(unsigned int **)&v2->field_88 = &g_acea80;
                            return 1;
                        }
                    }
                }
                v2->field_80 = &g_acd334;
                sub_acc878(a1, sub_9ffdd8(a0));
                return 1;
            }
            else
            {
                sub_acbc60(a1, v2);
                v17 = (unsigned int)&g_acc0a0;
                if (v4 != 2)
                    v17 = 0;
                if (v4 == 1)
                    v17 = (unsigned int)&g_acbdc0;
                v2->field_80 = &g_acbd60;
                *(unsigned long long *)&v2->field_88 = v17;
                return 1;
            }
        }
    }
    if (!(g_f0d568 >> 10 & 1))
    {
        if (g_f0d568 >> 7 & 1)
        {
            v18 = g_f0d56c & 0xfffffff0 & 0xff0fffff;
            if (v18 != 0x410fd400)
            {
                v19 = arm64g_calculate_condition(v6 | 16, v7, v8, v9);
                v20 = arm64g_calculate_condition(19, (v19 & 1 ? v18 : 0x40000000), (v19 & 1 ? 1091555520 : 0), 0);
                if (!(v20 & 1))
                    goto LABEL_a4a3f0;
            }
            else
            {
                v21 = arm64g_calculate_condition(v6 | 16, v7, v8, v9);
                v22 = arm64g_calculate_condition(16, (v21 & 1 ? v18 : 0x40000000), (v21 & 1 ? 1091555520 : 0), 0);
                if (!(v22 & 1))
                {
LABEL_a4a3f0:
                    sub_ace2e0(a1, v2);
                    v2->field_80 = &g_ace320;
                    *(unsigned long long *)&v2->field_88 = 0;
                    switch (v4)
                    {
                    case 2:
                        *(unsigned int **)&v2->field_88 = &g_acea80;
                        return 1;
                    case 1:
                        *(unsigned int **)&v2->field_88 = &g_ace760;
                        return 1;
                    case 5:
                        *(unsigned int **)&v2->field_88 = &g_acf860;
                    default:
                        return 1;
                    }
                }
            }
        }
        v2->field_80 = &g_acca24;
        sub_acc878(a1, sub_9ffdd8(a0));
        return 1;
    }
    sub_acbc00(a1, v2);
    v2->field_80 = &g_acbd00;
    *(unsigned long long *)&v2->field_88 = 0;
    switch (v4)
    {
    case 2:
        *(unsigned int **)&v2->field_88 = &g_acc0a0;
        return 1;
    case 1:
        *(unsigned int **)&v2->field_88 = &g_acbdc0;
        return 1;
    case 5:
        *(unsigned int **)&v2->field_88 = &g_acc520;
    default:
        return 1;
    }
}
