/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x42b8..0x42ec (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00c50;
extern char g_f00c58;
extern unsigned int g_f0c948;

long long sub_42b8(void)
{
    unsigned long v0;  // x0

    if (!(g_f00c58 & 1))
    {
        g_f00c58 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00c50 = g_f0c948;
    }
    return v0;
}
