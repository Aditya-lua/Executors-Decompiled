/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6be70..0xa6bf18 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6be70_0 {
    long long field_0;
    long long field_8;
} st_a6be70_0;

extern unsigned int g_f12e74;
extern st_a6be70_0 *g_f12e78;

long long sub_a6be70(void)
{
    long long v2;  // x0
    long long v3;  // x0
    unsigned long v8;  // cc_op
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned long v11;  // cc_ndep
    unsigned long long v12;  // 4110
    unsigned long long v13;  // 4102
    long long v14;  // w8
    unsigned long long v5;  // x8
    unsigned long long v6;  // 4110
    unsigned long long v7;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(16, "crypto/initthread.c", 60);
    g_f12e78 = v2;
    if (v2)
    {
        v3 = sub_ad61b4();
        g_f12e78->field_0 = v3;
        v5 = sub_a7c11c(v3);
        g_f12e78->field_8 = v5;
        v2 = g_f12e78->field_0;
        if (v2)
        {
            v6 = arm64g_calculate_condition(v8 | 16, v9, v10, v11);
            v7 = arm64g_calculate_condition(20, (v6 & 1 ? v5 : 0x40000000), 0, 0);
            if (v7 & 1)
                goto LABEL_a6bf00;
LABEL_a6bec8:
            sub_ad6020(v2);
            sub_a7c1d0(g_f12e78->field_8);
            v2 = sub_a6c2e4(g_f12e78, "crypto/initthread.c", 69);
            v14 = 0;
            g_f12e78 = 0;
        }
        else
        {
            v12 = arm64g_calculate_condition(v8 | 16, v9, v10, v11);
            v13 = arm64g_calculate_condition(16, (v12 & 1 ? v5 : 0x40000000), 0, 0);
            if (!(v13 & 1))
                goto LABEL_a6bec8;
LABEL_a6bf00:
            v14 = 1;
        }
    }
    else
    {
        v14 = 0;
    }
    g_f12e74 = v14;
    return v2;
}
