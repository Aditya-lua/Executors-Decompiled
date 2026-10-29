/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x33fb8..0x33fec (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00bc0;
extern char g_f00bc8;
extern unsigned int g_f0c948;

long long sub_33fb8(void)
{
    unsigned long v0;  // x0

    if (!(g_f00bc8 & 1))
    {
        g_f00bc8 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00bc0 = g_f0c948;
    }
    return v0;
}
