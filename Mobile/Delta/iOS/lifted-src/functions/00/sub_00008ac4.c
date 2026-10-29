/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8ac4..0x8af4 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00f80;
extern char g_f00f88;
extern unsigned int g_f0c94c;

long long sub_8ac4(void)
{
    unsigned long v0;  // x0

    if (!(g_f00f88 & 1))
    {
        g_f00f88 = 1;
        g_f0c94c = g_f0c94c + 1;
        g_f00f80 = g_f0c94c;
    }
    return v0;
}
