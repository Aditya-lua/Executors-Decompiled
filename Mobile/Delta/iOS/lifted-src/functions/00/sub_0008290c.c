/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8290c..0x82970 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8290c_0 {
    char padding_0[244];
    unsigned int field_f4;
    char padding_f8[136];
    unsigned int field_180;
} st_8290c_0;

extern unsigned long long g_cbf2b8[4];

long long sub_8290c(st_8290c_0 *a0, unsigned int *a1, unsigned long a2)
{
    unsigned long long v0;  // 4112

    if (a0->field_f4)
        return 1;
    v0 = arm64g_calculate_condition(2, a2, 1, 0);
    if (!(v0 & 1) && a2 > g_cbf2b8[a0->field_180])
    {
        if (a1[0x11] != 1)
            return 0;
    }
    else
    {
        if (a1[0x11] == 2)
            return 0;
    }
    return !a1[12];
}
