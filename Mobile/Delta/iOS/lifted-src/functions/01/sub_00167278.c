/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x167278..0x167288 (16 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_167278_0 {
    char padding_0[24];
    unsigned int field_18;
} st_167278_0;


unsigned long long sub_167278(st_167278_0 *a0)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // 4121

    v0 = a0->field_18;
    v1 = arm64g_calculate_condition(0x11, v0 & 0xffffffff, 1, 0);
    if (!(v1 & 1))
        return 0xffffffffffffffff;
    return v0;
}
