/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb42278..0xb4228c (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_eec748;

unsigned int sub_b42278(unsigned int a0)
{
    if (a0 & 3)
        return &g_eec748;
    return 0;
}
