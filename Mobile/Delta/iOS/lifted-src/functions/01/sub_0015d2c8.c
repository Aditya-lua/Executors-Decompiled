/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x15d2c8..0x15d2fc (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00d30;
extern char g_f00d38;
extern unsigned int g_f0c948;

long long sub_15d2c8(void)
{
    unsigned long v0;  // x0

    if (!(g_f00d38 & 1))
    {
        g_f00d38 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00d30 = g_f0c948;
    }
    return v0;
}
