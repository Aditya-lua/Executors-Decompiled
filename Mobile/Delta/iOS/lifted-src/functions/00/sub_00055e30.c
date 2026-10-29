/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x55e30..0x55e64 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00e50;
extern char g_f00e58;
extern unsigned int g_f0c948;

long long sub_55e30(void)
{
    unsigned long v0;  // x0

    if (!(g_f00e58 & 1))
    {
        g_f00e58 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00e50 = g_f0c948;
    }
    return v0;
}
