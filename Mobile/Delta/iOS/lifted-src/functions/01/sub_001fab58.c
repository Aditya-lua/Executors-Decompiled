/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1fab58..0x1fab7c (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1fab58_0 {
    unsigned int field_0;
    unsigned int field_4;
} st_1fab58_0;


int sub_1fab58(st_1fab58_0 *a0)
{
    unsigned long long v0;  // 4121

    if (a0->field_0 != 1)
        return 0;
    v0 = arm64g_calculate_condition(0x11, a0->field_4, 1, 0);
    return !(v0 & 1);
}
