/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8f18..0x8f4c (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00c00;
extern char g_f00c08;
extern unsigned int g_f0c948;

long long sub_8f18(void)
{
    unsigned long v0;  // x0

    if (!(g_f00c08 & 1))
    {
        g_f00c08 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00c00 = g_f0c948;
    }
    return v0;
}
