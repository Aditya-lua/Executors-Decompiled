/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4999c..0x499d0 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00bd0;
extern char g_f00bd8;
extern unsigned int g_f0c948;

long long sub_4999c(void)
{
    unsigned long v0;  // x0

    if (!(g_f00bd8 & 1))
    {
        g_f00bd8 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00bd0 = g_f0c948;
    }
    return v0;
}
