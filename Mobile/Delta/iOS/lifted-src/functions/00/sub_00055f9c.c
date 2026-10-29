/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x55f9c..0x55fd0 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00c80;
extern char g_f00c88;
extern unsigned int g_f0c948;

long long sub_55f9c(void)
{
    unsigned long v0;  // x0

    if (!(g_f00c88 & 1))
    {
        g_f00c88 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00c80 = g_f0c948;
    }
    return v0;
}
