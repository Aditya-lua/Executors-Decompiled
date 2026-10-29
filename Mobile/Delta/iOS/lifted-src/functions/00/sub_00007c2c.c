/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7c2c..0x7c5c (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00c90;
extern char g_f00c98;
extern unsigned int g_f0c948;

long long sub_7c2c(void)
{
    unsigned long v0;  // x0

    if (!(g_f00c98 & 1))
    {
        g_f00c98 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00c90 = g_f0c948;
    }
    return v0;
}
