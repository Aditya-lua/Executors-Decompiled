/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x24ab5c..0x24ab90 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00d20;
extern char g_f00d28;
extern unsigned int g_f0c948;

long long sub_24ab5c(void)
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
