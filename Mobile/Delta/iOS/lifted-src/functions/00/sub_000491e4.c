/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x491e4..0x49218 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00f50;
extern char g_f00f58;
extern unsigned int g_f0c94c;

long long sub_491e4(void)
{
    unsigned long v0;  // x0

    if (!(g_f00f58 & 1))
    {
        g_f00f58 = 1;
        g_f0c94c = g_f0c94c + 1;
        g_f00f50 = g_f0c94c;
    }
    return v0;
}
