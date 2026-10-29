/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x108d4c..0x108d80 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00dc0;
extern char g_f00dc8;
extern unsigned int g_f0c948;

long long sub_108d4c(void)
{
    unsigned long v0;  // x0

    if (!(g_f00dc8 & 1))
    {
        g_f00dc8 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00dc0 = g_f0c948;
    }
    return v0;
}
