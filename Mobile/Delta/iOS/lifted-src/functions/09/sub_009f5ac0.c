/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f5ac0..0x9f5c38 (376 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f5ac0_0 {
    unsigned long long field_0;
    struct st_9f5ac0_0 *field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_9f5ac0_0;

extern long long g_9f5e14;
extern long long g_f08598;
extern long long g_f127c0;
extern long long g_f127c8;
extern unsigned int g_f127d4;

st_9f5ac0_0 * sub_9f5ac0(unsigned long a0, long long a1, unsigned long a2, unsigned long a3)
{
    unsigned long v4;  // cc_op
    unsigned long v7;  // cc_ndep
    unsigned long long v8;  // 4112
    unsigned long long v9;  // 4102
    unsigned long v10;  // cc_dep1
    unsigned long v11;  // cc_dep2
    st_9f5ac0_0 *v12;  // x19
    st_9f5ac0_0 *v13;  // x0
    long long v14;  // x21
    st_9f5ac0_0 *v15;  // x0
    st_9f5ac0_0 *v16;  // x24
    st_9f5ac0_0 *v17;  // x0
    st_9f5ac0_0 *v18;  // x22
    unsigned long long v5;  // 4112
    unsigned long long v6;  // 4102
    unsigned long v0;  // [bp-0x58]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (sub_a7c208(&g_f08598, &g_9f5e14))
    {
        v5 = arm64g_calculate_condition(v4 | 16, v10, v11, v7);
        v6 = arm64g_calculate_condition(3, (v5 & 1 ? g_f127d4 : 0x40000000), 0, 0);
        if (!(v6 & 1))
            goto LABEL_9f5b14;
    }
    else
    {
        v8 = arm64g_calculate_condition(v4 | 16, v10, v11, v7);
        v9 = arm64g_calculate_condition(0, (v8 & 1 ? g_f127d4 : 0x40000000), 0, 0);
        if (!(v9 & 1))
        {
LABEL_9f5b14:
            sub_a7bd78(g_f127c0);
            v12 = sub_a7bf24(&g_f127c8);
            if (v12)
                v13 = sub_ad5f4c(v12);
            else
                v13 = sub_ad61b4();
            v14 = v13;
            v0 = v13;
            if (v13 && !(v15 = sub_a6bffc(48, "crypto/conf/conf_mod.c", 358), !v15))
            {
                v15->field_0 = a0;
                v16 = v15;
                v17 = sub_a6d9b4(a1, "crypto/conf/conf_mod.c", 362);
                v16->field_8 = v17;
                v16->field_10 = a2;
                v18 = v16;
                v18->field_18 = a3;
                if (v17 && sub_ad68a0(v14, v18))
                {
                    sub_a7bf2c(&g_f127c8, &v0);
                    sub_a7bd80(g_f127c0);
                    sub_a7bd88(g_f127c0);
                    sub_ad6020(v12);
                    return v18;
                }
                sub_a7bd80(g_f127c0);
                sub_a6c2e4(v18->field_8, "crypto/conf/conf_mod.c", 381);
                sub_a6c2e4(v18, "crypto/conf/conf_mod.c", 382);
            }
            else
            {
                sub_a7bd80(g_f127c0);
            }
            sub_ad6020(v14);
        }
    }
    return 0;
}
