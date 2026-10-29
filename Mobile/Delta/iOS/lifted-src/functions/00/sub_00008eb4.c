/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8eb4..0x8ee4 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f010b0;
extern char g_f010b8;
extern unsigned int g_f0c94c;

long long sub_8eb4(void)
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
