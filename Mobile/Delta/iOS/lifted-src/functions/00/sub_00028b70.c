/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x28b70..0x28ba4 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f01040;
extern char g_f01048;
extern unsigned int g_f0c94c;

long long sub_28b70(void)
{
    unsigned long v0;  // x0

    if (!(g_f01048 & 1))
    {
        g_f01048 = 1;
        g_f0c94c = g_f0c94c + 1;
        g_f01040 = g_f0c94c;
    }
    return v0;
}
