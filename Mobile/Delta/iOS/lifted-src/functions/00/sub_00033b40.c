/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x33b40..0x33b74 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00b80;
extern char g_f00b88;
extern unsigned int g_f0c948;

long long sub_33b40(void)
{
    unsigned long v0;  // x0

    if (!(g_f00b88 & 1))
    {
        g_f00b88 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00b80 = g_f0c948;
    }
    return v0;
}
