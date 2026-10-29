/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0a550..0xb0a660 (272 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b0a550_0 {
    char padding_0[84];
    char field_54;
    char padding_55[163];
    char field_f8;
    char padding_f9[447];
    unsigned int field_2b8;
} st_b0a550_0;

extern unsigned int g_acc520;
extern unsigned int g_acf860;
extern unsigned int g_ad35e0;
extern unsigned int g_f0d568;
extern unsigned int g_f0d56c;

int sub_b0a550(st_b0a550_0 *a0, long long a1)
{
    unsigned int v2;  // w10
    unsigned long v3;  // cc_op
    unsigned long v4;  // cc_dep1
    unsigned long v5;  // cc_dep2
    unsigned long v6;  // cc_ndep
    unsigned int v7;  // x20
    unsigned long long v8;  // 4112
    unsigned long long v9;  // 4102
    unsigned long long v10;  // 4112
    unsigned long long v11;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!(g_f0d568 >> 10 & 1))
    {
        v2 = g_f0d56c & 0xfffffff0 & 0xff0fffff;
        if (g_f0d568 >> 7 & 1 && !(v3 = 3, v4 = v2, v5 = 1208995856, v6 = 0, v2 != 1208995856))
        {
            sub_ad2220(a1, &a0[1].padding_0[4]);
            v7 = (unsigned int)&g_ad35e0;
        }
        else
        {
            if (g_f0d568 >> 7 & 1)
            {
                if (v2 != 0x410fd400)
                {
                    v8 = arm64g_calculate_condition(v3 | 16, v4, v5, v6);
                    v9 = arm64g_calculate_condition(19, (v8 & 1 ? v2 : 0x40000000), (v8 & 1 ? 1091555520 : 0), 0);
                    if (!(v9 & 1))
                    {
                        sub_ace2e0(a1, &a0[1].padding_0[4]);
                        sub_a94ad4(&a0->field_f8, &a0[1].padding_0[4]);
                        *(unsigned int **)&a0->field_2b8 = &g_acf860;
                        a0->field_54 = a0->field_54 | 4;
                        return 1;
                    }
                }
                else
                {
                    v10 = arm64g_calculate_condition(v3 | 16, v4, v5, v6);
                    v11 = arm64g_calculate_condition(16, (v10 & 1 ? v2 : 0x40000000), (v10 & 1 ? 1091555520 : 0), 0);
                    if (!(v11 & 1))
                    {
                        sub_ace2e0(a1, &a0[1].padding_0[4]);
                        sub_a94ad4(&a0->field_f8, &a0[1].padding_0[4]);
                        *(unsigned int **)&a0->field_2b8 = &g_acf860;
                        a0->field_54 = a0->field_54 | 4;
                        return 1;
                    }
                }
            }
            sub_acc878(a1, &a0[1].padding_0[4]);
            v7 = 0;
        }
    }
    else
    {
        sub_acbc00(a1, &a0[1].padding_0[4]);
        v7 = (unsigned int)&g_acc520;
    }
    sub_a94ad4(&a0->field_f8, &a0[1].padding_0[4]);
    *(unsigned long long *)&a0->field_2b8 = v7;
    a0->field_54 = a0->field_54 | 4;
    return 1;
}
