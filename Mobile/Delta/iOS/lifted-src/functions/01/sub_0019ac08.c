/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x19ac08..0x19ac3c (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00ae0;
extern char g_f00ae8;
extern unsigned int g_f0c948;

long long sub_19ac08(void)
{
    unsigned long v0;  // x0

    if (!(g_f00ae8 & 1))
    {
        g_f00ae8 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00ae0 = g_f0c948;
    }
    return v0;
}
