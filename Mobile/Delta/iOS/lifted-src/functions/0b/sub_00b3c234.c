/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3c234..0xb3c248 (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_ee9250;

unsigned int sub_b3c234(unsigned int a0)
{
    if (a0 & 3)
        return &g_ee9250;
    return 0;
}
