/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x55dc8..0x55dfc (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00ac0;
extern char g_f00ac8;
extern unsigned int g_f0c948;

long long sub_55dc8(void)
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
