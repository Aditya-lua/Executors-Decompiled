/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x27ad8..0x27b0c (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f010b0;
extern char g_f010b8;
extern unsigned int g_f0c94c;

long long sub_27ad8(void)
{
    unsigned long v0;  // x0

    if (!(g_f010b8 & 1))
    {
        g_f010b8 = 1;
        g_f0c94c = g_f0c94c + 1;
        g_f010b0 = g_f0c94c;
    }
    return v0;
}
