/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xdc9c..0xdcd0 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00b60;
extern char g_f00b68;
extern unsigned int g_f0c948;

long long sub_dc9c(void)
{
    unsigned long v0;  // x0

    if (!(g_f00b68 & 1))
    {
        g_f00b68 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00b60 = g_f0c948;
    }
    return v0;
}
