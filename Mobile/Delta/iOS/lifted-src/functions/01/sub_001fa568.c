/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1fa568..0x1fa588 (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1fa568_0 {
    unsigned int field_0;
    unsigned int field_4;
} st_1fa568_0;


int sub_1fa568(st_1fa568_0 *a0)
{
    unsigned long long v0;  // 4121

    if (!a0->field_0)
    {
        v0 = arm64g_calculate_condition(0x11, a0->field_4, 1, 0);
        return !(v0 & 1);
    }
    return 0;
}
