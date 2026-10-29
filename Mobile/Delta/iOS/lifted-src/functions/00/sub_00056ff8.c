/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x56ff8..0x5702c (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00b50;
extern char g_f00b58;
extern unsigned int g_f0c948;

long long sub_56ff8(void)
{
    unsigned long v0;  // x0

    if (!(g_f00b58 & 1))
    {
        g_f00b58 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00b50 = g_f0c948;
    }
    return v0;
}
