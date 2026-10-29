/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x278d0..0x27904 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00e70;
extern char g_f00e78;
extern unsigned int g_f0c94c;

long long sub_278d0(void)
{
    unsigned long v0;  // x0

    if (!(g_f00e78 & 1))
    {
        g_f00e78 = 1;
        g_f0c94c = g_f0c94c + 1;
        g_f00e70 = g_f0c94c;
    }
    return v0;
}
