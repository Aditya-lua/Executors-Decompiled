/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a20..0x9a50 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00f40;
extern char g_f00f48;
extern unsigned int g_f0c94c;

long long sub_9a20(void)
{
    unsigned long v0;  // x0

    if (!(g_f00f48 & 1))
    {
        g_f00f48 = 1;
        g_f0c94c = g_f0c94c + 1;
        g_f00f40 = g_f0c94c;
    }
    return v0;
}
