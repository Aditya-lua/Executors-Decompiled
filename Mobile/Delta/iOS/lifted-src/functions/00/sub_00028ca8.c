/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x28ca8..0x28cdc (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f01050;
extern char g_f01058;
extern unsigned int g_f0c94c;

long long sub_28ca8(void)
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
