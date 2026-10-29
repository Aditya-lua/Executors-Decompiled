/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x342f8..0x3432c (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00ac0;
extern char g_f00ac8;
extern unsigned int g_f0c948;

long long sub_342f8(void)
{
    unsigned long v0;  // x0

    if (!(g_f00ac8 & 1))
    {
        g_f00ac8 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00ac0 = g_f0c948;
    }
    return v0;
}
