/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x284c4..0x284f8 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00d40;
extern char g_f00d48;
extern unsigned int g_f0c948;

long long sub_284c4(void)
{
    unsigned long v0;  // x0

    if (!(g_f00d48 & 1))
    {
        g_f00d48 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00d40 = g_f0c948;
    }
    return v0;
}
