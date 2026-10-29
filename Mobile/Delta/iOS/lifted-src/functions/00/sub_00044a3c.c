/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x44a3c..0x44a98 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_44a3c_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[20];
    struct st_44a3c_0 *field_20;
} st_44a3c_0;

extern unsigned int g_f00ae0;
extern unsigned int g_f00bb0;
extern unsigned int g_f00be0;

st_44a3c_0 * sub_44a3c(st_44a3c_0 *iter)
{
    unsigned int v0;  // w9
    unsigned long v1;  // cc_dep1
    unsigned long v2;  // cc_dep2
    unsigned long long v3;  // 4112
    unsigned long long v4;  // 4102
    unsigned long long v5;  // 4112
    unsigned long long v6;  // 4102

    v0 = iter->field_8;
    if (iter && iter->field_8 == g_f00bb0)
        return iter;
    while (1)
    {
        v1 = v0;
        v2 = g_f00ae0;
        if (v0 != g_f00ae0)
        {
            v1 = v0;
            v2 = g_f00be0;
            if (v0 != g_f00be0)
                return 0;
        }
        iter = iter->field_20;
        v0 = iter->field_8;
        if (iter)
        {
            v3 = arm64g_calculate_condition(19, v1, v2, 0);
            v4 = arm64g_calculate_condition(3, (v3 & 1 ? v0 : 0), (v3 & 1 ? g_f00bb0 : 0), 0);
            if (v4 & 1)
                return iter;
        }
        else
        {
            v5 = arm64g_calculate_condition(19, v1, v2, 0);
            v6 = arm64g_calculate_condition(0, (v5 & 1 ? v0 : 0), (v5 & 1 ? g_f00bb0 : 0), 0);
            if (v6 & 1)
                return iter;
        }
    }
}
