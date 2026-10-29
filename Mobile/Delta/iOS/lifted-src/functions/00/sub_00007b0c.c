/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7b0c..0x7b3c (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00c20;
extern char g_f00c28;
extern unsigned int g_f0c948;

long long sub_7b0c(void)
{
    unsigned long v0;  // x0

    if (!(g_f00c28 & 1))
    {
        g_f00c28 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00c20 = g_f0c948;
    }
    return v0;
}
