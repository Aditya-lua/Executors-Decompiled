/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x49eb0..0x49ee4 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f01050;
extern char g_f01058;
extern unsigned int g_f0c94c;

long long sub_49eb0(void)
{
    unsigned long v0;  // x0

    if (!(g_f01058 & 1))
    {
        g_f01058 = 1;
        g_f0c94c = g_f0c94c + 1;
        g_f01050 = g_f0c94c;
    }
    return v0;
}
