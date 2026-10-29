/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa68148..0xa681e0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a680ec;
extern long long g_f08ef0;
extern char g_f12a90;
extern unsigned int g_f12a98;
extern long long g_f12be0;
extern unsigned int g_f12be8;

unsigned int sub_a68148(unsigned int a0)
{
    unsigned long v3;  // cc_op
    unsigned long v6;  // cc_ndep
    unsigned long long v7;  // 4112
    unsigned long long v8;  // 4102
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned int v11;  // x0
    unsigned long long v4;  // 4112
    unsigned long long v5;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a7c208(&g_f08ef0, &g_a680ec))
    {
        v4 = arm64g_calculate_condition(v3 | 16, v9, v10, v6);
        v5 = arm64g_calculate_condition(19, (v4 & 1 ? g_f12be8 : 0x40000000), 0, 0);
        if (v5 & 1)
            goto LABEL_a68188;
LABEL_a68180:
        v11 = 0;
    }
    else
    {
        v7 = arm64g_calculate_condition(v3 | 16, v9, v10, v6);
        v8 = arm64g_calculate_condition(16, (v7 & 1 ? g_f12be8 : 0x40000000), 0, 0);
        if (!(v8 & 1))
            goto LABEL_a68180;
LABEL_a68188:
        v11 = sub_a7bbe0(&g_f12be0);
    }
    if (!v11 & g_f12a90)
        v11 = (unsigned int)&g_f12a98;
    if (!a0)
    {
        return v11;
    }
    else if (v11)
    {
        sub_a7bbe8();
        return v11;
    }
    else
    {
        return v11;
    }
}
