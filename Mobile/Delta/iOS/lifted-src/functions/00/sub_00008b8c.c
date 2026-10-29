/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8b8c..0x8bc0 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00b10;
extern char g_f00b18;
extern unsigned int g_f0c948;

long long sub_8b8c(void)
{
    unsigned long v0;  // x0

    if (!(g_f00b18 & 1))
    {
        g_f00b18 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00b10 = g_f0c948;
    }
    return v0;
}
