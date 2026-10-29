/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x27764..0x27798 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f01010;
extern char g_f01018;
extern unsigned int g_f0c94c;

long long sub_27764(void)
{
    unsigned long v0;  // x0

    if (!(g_f01018 & 1))
    {
        g_f01018 = 1;
        g_f0c94c = g_f0c94c + 1;
        g_f01010 = g_f0c94c;
    }
    return v0;
}
