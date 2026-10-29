/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x109e74..0x109ea8 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00d90;
extern char g_f00d98;
extern unsigned int g_f0c948;

long long sub_109e74(void)
{
    unsigned long v0;  // x0

    if (!(g_f00d98 & 1))
    {
        g_f00d98 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00d90 = g_f0c948;
    }
    return v0;
}
