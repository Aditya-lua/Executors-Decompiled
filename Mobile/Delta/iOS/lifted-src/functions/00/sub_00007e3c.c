/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7e3c..0x7e6c (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00cc0;
extern char g_f00cc8;
extern unsigned int g_f0c948;

long long sub_7e3c(void)
{
    unsigned long v0;  // x0

    if (!(g_f00cc8 & 1))
    {
        g_f00cc8 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00cc0 = g_f0c948;
    }
    return v0;
}
