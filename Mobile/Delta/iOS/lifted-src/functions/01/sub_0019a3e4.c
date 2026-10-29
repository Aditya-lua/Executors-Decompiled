/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x19a3e4..0x19a418 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00d30;
extern char g_f00d38;
extern unsigned int g_f0c948;

long long sub_19a3e4(void)
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
