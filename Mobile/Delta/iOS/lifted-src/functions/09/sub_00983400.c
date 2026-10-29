/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x983400..0x983424 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_983400_0 {
    char padding_0[1088];
    unsigned int field_440;
} st_983400_0;


st_983400_0 * sub_983400(st_983400_0 *a0)
{
    unsigned long long v0;  // 4118

    if (a0)
    {
        v0 = arm64g_calculate_condition(1, a0->field_440, 1, 0);
        if (v0 & 1)
            return 0;
        a0->field_440 = a0->field_440 + 1;
    }
    return (unsigned int)a0;
}
