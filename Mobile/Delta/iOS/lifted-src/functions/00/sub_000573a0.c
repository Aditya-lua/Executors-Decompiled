/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x573a0..0x573d4 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00b70;
extern char g_f00b78;
extern unsigned int g_f0c948;

long long sub_573a0(void)
{
    unsigned long v0;  // x0

    if (!(g_f00b78 & 1))
    {
        g_f00b78 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00b70 = g_f0c948;
    }
    return v0;
}
