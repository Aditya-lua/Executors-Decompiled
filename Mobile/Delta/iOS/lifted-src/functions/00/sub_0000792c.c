/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x792c..0x795c (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00e20;
extern char g_f00e28;
extern unsigned int g_f0c948;

long long sub_792c(void)
{
    unsigned long v0;  // x0

    if (!(g_f00e28 & 1))
    {
        g_f00e28 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00e20 = g_f0c948;
    }
    return v0;
}
