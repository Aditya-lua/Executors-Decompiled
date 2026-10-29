/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x676c..0x67b4 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_676c_0 {
    char padding_0[8];
    unsigned int field_8;
} st_676c_0;

extern unsigned int g_f00af0;
extern unsigned int g_f00b10;
extern unsigned int g_f00b30;

long long sub_676c(st_676c_0 *a0)
{
    unsigned int v0;  // w8
    unsigned long v1;  // cc_op
    unsigned long v7;  // cc_dep1
    unsigned long v8;  // cc_dep2
    unsigned long v9;  // cc_ndep
    unsigned long v10;  // 4112
    unsigned long long v11;  // 4112
    unsigned long long v12;  // 4112
    unsigned long long v13;  // 4102
    unsigned long long v14;  // 4112
    unsigned long long v15;  // 4102
    unsigned long v2;  // 4112
    unsigned long v3;  // cc_op
    unsigned long v4;  // cc_dep1
    unsigned long v5;  // cc_dep2
    unsigned long long v6;  // 4112

    v0 = a0->field_8;
    if (v0 != g_f00af0)
    {
        v2 = arm64g_calculate_condition(v1 | 16, v7, v8, v9);
        v3 = 3;
        v4 = (v2 & 1 ? v0 : 0x40000000);
        v5 = (v2 & 1 ? *(int *)0xf00b00 : 0);
        v6 = arm64g_calculate_condition(19, v4, v5, 0);
        if (!(v6 & 1))
            goto LABEL_6792;
LABEL_6791:
        v12 = arm64g_calculate_condition(v3 | 16, v4, v5, 0);
        v13 = arm64g_calculate_condition(19, (v12 & 1 ? v0 : 0x40000000), (v12 & 1 ? g_f00b10 : 0), 0);
        if (!(v13 & 1))
            return 1;
    }
    else
    {
        v10 = arm64g_calculate_condition(v1 | 16, v7, v8, v9);
        v3 = 0;
        v4 = (v10 & 1 ? v0 : 0x40000000);
        v5 = (v10 & 1 ? *(int *)0xf00b00 : 0);
        v11 = arm64g_calculate_condition(16, v4, v5, 0);
        if (v11 & 1)
            goto LABEL_6791;
LABEL_6792:
        v14 = arm64g_calculate_condition(v3 | 16, v4, v5, 0);
        v15 = arm64g_calculate_condition(16, (v14 & 1 ? v0 : 0x40000000), (v14 & 1 ? g_f00b10 : 0), 0);
        if (!(v15 & 1))
            return 1;
    }
    return v0 == g_f00b30;
}
