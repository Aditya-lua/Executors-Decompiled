/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x28428..0x2845c (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00d20;
extern char g_f00d28;
extern unsigned int g_f0c948;

long long sub_28428(void)
{
    unsigned long v0;  // x0

    if (!(g_f00d28 & 1))
    {
        g_f00d28 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00d20 = g_f0c948;
    }
    return v0;
}
