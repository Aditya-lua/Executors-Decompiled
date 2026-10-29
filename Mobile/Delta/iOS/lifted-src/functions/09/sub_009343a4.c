/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9343a4..0x934400 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00ac0;
extern char g_f00ac8;
extern unsigned int g_f0c948;

long long sub_9343a4(void)
{
    unsigned long v1;  // x0

    if (!~(char)(g_f00ac8 - (g_f00ac8 | 1)))
    {
        g_f00ac8 = 1;
        g_f0c948 = g_f0c948 + (g_f0c948 | 1) + (~g_f0c948 | 1) + 1;
        g_f00ac0 = g_f0c948;
        return v1;
    }
    return v1;
}
