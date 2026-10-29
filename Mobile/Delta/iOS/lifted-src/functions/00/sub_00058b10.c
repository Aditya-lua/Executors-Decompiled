/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x58b10..0x58b3c (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_1000280;

unsigned long long sub_58b10(unsigned int a0, unsigned long a1)
{
    if (a0 <= 0xff)
        return (*(int *)&(&g_1000280)[60 + 4 * a0] & a1) != 0;
    return 0;
}
