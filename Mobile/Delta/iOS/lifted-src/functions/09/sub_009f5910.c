/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f5910..0x9f5a4c (316 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f5910_1 {
    struct st_9f5910_0 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
} st_9f5910_1;

typedef struct st_9f5910_0 {
    char padding_0[24];
    struct st_9f5910_1 *field_18;
    unsigned int field_20;
} st_9f5910_0;

extern long long g_9f5e14;
extern long long g_f08598;
extern st_9f5910_1 *g_f127c0;
extern unsigned int g_f127d4;
extern long long g_f127d8;

st_9f5910_1 * sub_9f5910(void)
{
    unsigned long v4;  // cc_op
    unsigned long v7;  // cc_ndep
    unsigned long long v8;  // 4112
    unsigned long long v9;  // 4102
    unsigned long v10;  // cc_dep1
    unsigned long v11;  // cc_dep2
    long long v12;  // x19
    st_9f5910_1 *v13;  // x0
    st_9f5910_1 *v14;  // x21
    st_9f5910_0 *v15;  // x8
    unsigned long long v5;  // 4112
    unsigned long long v6;  // 4102
    st_9f5910_1 *v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    if (sub_a7c208(&g_f08598, &g_9f5e14))
    {
        v5 = arm64g_calculate_condition(v4 | 16, v10, v11, v7);
        v6 = arm64g_calculate_condition(19, (v5 & 1 ? g_f127d4 : 0x40000000), 0, 0);
        if (v6 & 1)
            goto LABEL_9f5958;
    }
    else
    {
        v8 = arm64g_calculate_condition(v4 | 16, v10, v11, v7);
        v9 = arm64g_calculate_condition(16, (v8 & 1 ? g_f127d4 : 0x40000000), 0, 0);
        if (v9 & 1)
        {
LABEL_9f5958:
            if (!g_f127c0)
                return g_f127c0;
            sub_a7bd78(g_f127c0);
            v12 = sub_a7bf24(&g_f127d8);
            sub_a7bf2c(&g_f127d8, &v0);
            sub_a7bd80(g_f127c0);
            sub_a7bd88(g_f127c0);
            if ((int)sub_ad69e4(v12) >= 1)
            {
                do
                {
                    v13 = sub_ad692c(v12);
                    if (v13)
                    {
                        v14 = v13;
                        v15 = v13->field_0;
                        if (v15->field_18)
                            v15->field_18();
                        v15->field_20 = v15->field_20 - 1;
                        sub_a6c2e4(v14->field_8, "crypto/conf/conf_mod.c", 611);
                        sub_a6c2e4(v14->field_10, "crypto/conf/conf_mod.c", 612);
                        sub_a6c2e4(v14, "crypto/conf/conf_mod.c", 613);
                    }
                } while ((int)sub_ad69e4(v12) > 0);
            }
            sub_ad6020(v12);
            return 1;
        }
    }
    return 0;
}
