/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x51ee0..0x51f14 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00bf0;
extern char g_f00bf8;
extern unsigned int g_f0c948;

long long sub_51ee0(void)
{
    unsigned long v0;  // x0

    if (!(g_f00bf8 & 1))
    {
        g_f00bf8 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00bf0 = g_f0c948;
    }
    return v0;
}
