/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa32d54..0xa32e7c (296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a32d54_0 {
    char padding_0[96];
    struct st_a32d54_0 *field_60;
    char padding_68[56];
    unsigned int field_a0;
} st_a32d54_0;

extern long long g_a32f08;
extern long long g_f086d8;
extern unsigned int g_f0d558;
extern long long g_f0d560;

st_a32d54_0 * sub_a32d54(st_a32d54_0 *a0)
{
    unsigned long v3;  // cc_op
    unsigned long v6;  // cc_ndep
    unsigned long long v7;  // 4112
    unsigned long long v8;  // 4102
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    long long v11;  // x1
    st_a32d54_0 *v12;  // x0
    st_a32d54_0 *v13;  // x8
    unsigned long long v4;  // 4112
    unsigned long long v5;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0)
    {
        if (sub_a7c208(&g_f086d8, &g_a32f08))
        {
            v4 = arm64g_calculate_condition(v3 | 16, v9, v10, v6);
            v5 = arm64g_calculate_condition(19, (v4 & 1 ? g_f0d558 : 0x40000000), 0, 0);
            if (v5 & 1)
                goto LABEL_a32dfc;
        }
        else
        {
            v7 = arm64g_calculate_condition(v3 | 16, v9, v10, v6);
            v8 = arm64g_calculate_condition(16, (v7 & 1 ? g_f0d558 : 0x40000000), 0, 0);
            if (v8 & 1)
            {
LABEL_a32dfc:
                v12 = sub_a7c198(g_f0d560);
                if (!(unsigned int)v12)
                    return v12;
                v13 = a0->field_a0;
                if (!(unsigned int)v13)
                {
                    v13 = a0->field_60;
                    if (v13)
                        v13();
                }
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                a0->field_a0 = (unsigned int)v13 + 1;
                sub_a7c1b4(g_f0d560);
                return 1;
            }
        }
        sub_a368c8();
        sub_a369bc("crypto/engine/eng_init.c", 95, "ENGINE_init");
        v11 = 524303;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/engine/eng_init.c", 90, "ENGINE_init");
        v11 = 786690;
    }
    sub_a36abc(38, v11, 0);
    return 0;
}
