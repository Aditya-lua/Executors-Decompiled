/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4e548..0x4e57c (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00d60;
extern char g_f00d68;
extern unsigned int g_f0c948;

long long sub_4e548(void)
{
    unsigned long v0;  // x0

    if (!(g_f00d68 & 1))
    {
        g_f00d68 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00d60 = g_f0c948;
    }
    return v0;
}
