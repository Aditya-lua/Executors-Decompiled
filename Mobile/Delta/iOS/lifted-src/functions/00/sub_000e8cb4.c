/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xe8cb4..0xe8ce8 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00e40;
extern char g_f00e48;
extern unsigned int g_f0c948;

long long sub_e8cb4(void)
{
    unsigned long v0;  // x0

    if (!(g_f00e48 & 1))
    {
        g_f00e48 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00e40 = g_f0c948;
    }
    return v0;
}
