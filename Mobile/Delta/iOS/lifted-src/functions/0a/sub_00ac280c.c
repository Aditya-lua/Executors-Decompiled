/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac280c..0xac2860 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac280c_0 {
    char padding_0[16];
    unsigned long long field_10;
    char padding_18[20];
    unsigned long long field_2c;
} st_ac280c_0;


unsigned long long sub_ac280c(st_ac280c_0 *a0, unsigned long long a1)
{
    unsigned long long v0;  // x9
    unsigned long long v1;  // 4110
    unsigned long long v2;  // 4102
    unsigned long long v3;  // 4110
    unsigned long long v4;  // 4102
    unsigned long long v5;  // x9

    v0 = 16;
    if (a1)
        v0 = a1;
    if (v0 != 16)
    {
        v1 = arm64g_calculate_condition(20, a1, 0, 0);
        v2 = arm64g_calculate_condition(20, (v1 & 1 ? v0 : 0x40000000), (v1 & 1 ? 8 : 0), 0);
        if (v2 & 1)
            return 0;
    }
    else
    {
        v3 = arm64g_calculate_condition(20, a1, 0, 0);
        v4 = arm64g_calculate_condition(16, (v3 & 1 ? 16 : 0x40000000), (v3 & 1 ? 8 : 0), 0);
        if (v4 & 1)
            return 0;
    }
    if (!*(int *)&(a0->padding_18)[1])
        v5 = 16;
    else
        v5 = *(int *)&(a0->padding_18)[1];
    *(unsigned int *)&(a0->padding_18)[1] = v5;
    if (v0 != v5)
    {
        a0->field_10 = a0->field_10 ^ 0xee;
        *(unsigned int *)&(a0->padding_18)[1] = v0;
    }
    return 1;
}
