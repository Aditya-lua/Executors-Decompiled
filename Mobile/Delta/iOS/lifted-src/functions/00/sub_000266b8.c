/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x266b8..0x266ec (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00fb0;
extern char g_f00fb8;
extern unsigned int g_f0c94c;

long long sub_266b8(void)
{
    unsigned long v0;  // x0

    if (!(g_f00fb8 & 1))
    {
        g_f00fb8 = 1;
        g_f0c94c = g_f0c94c + 1;
        g_f00fb0 = g_f0c94c;
    }
    return v0;
}
