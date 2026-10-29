/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x49ee4..0x49f18 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00f70;
extern char g_f00f78;
extern unsigned int g_f0c94c;

long long sub_49ee4(void)
{
    unsigned long v0;  // x0

    if (!(g_f00f78 & 1))
    {
        g_f00f78 = 1;
        g_f0c94c = g_f0c94c + 1;
        g_f00f70 = g_f0c94c;
    }
    return v0;
}
