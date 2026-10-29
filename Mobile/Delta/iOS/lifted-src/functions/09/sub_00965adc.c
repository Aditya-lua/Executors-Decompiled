/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x965adc..0x965af4 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_fffffffffffffffc;

unsigned long long * sub_965adc(unsigned long long *a0)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // 4118

    v0 = a0[92] + a0[91];
    v1 = arm64g_calculate_condition(50, a0[92], a0[91], 0);
    if (!(v1 & 1))
        v0 = (char *)&g_fffffffffffffffc + 3;
    a0[93] = v0;
    return a0;
}
