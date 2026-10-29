/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7efc..0x7f2c (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00e10;
extern char g_f00e18;
extern unsigned int g_f0c948;

long long sub_7efc(void)
{
    unsigned long v0;  // x0

    if (!(g_f00e18 & 1))
    {
        g_f00e18 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00e10 = g_f0c948;
    }
    return v0;
}
