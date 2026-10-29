/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95d0ec..0x95d124 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_e87610;

unsigned int sub_95d0ec(unsigned long long *a0, unsigned long a1)
{
    if (!a1)
        return 0xfffffffd;
    a0[12] = &g_e87610;
    a0[13] = 6;
}
