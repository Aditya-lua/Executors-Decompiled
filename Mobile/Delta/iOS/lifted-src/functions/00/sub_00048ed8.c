/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x48ed8..0x48f0c (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00cb0;
extern char g_f00cb8;
extern unsigned int g_f0c948;

long long sub_48ed8(void)
{
    unsigned long v0;  // x0

    if (!(g_f00cb8 & 1))
    {
        g_f00cb8 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00cb0 = g_f0c948;
    }
    return v0;
}
