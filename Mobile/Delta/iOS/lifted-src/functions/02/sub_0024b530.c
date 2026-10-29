/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x24b530..0x24b564 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00b00;
extern char g_f00b08;
extern unsigned int g_f0c948;

long long sub_24b530(void)
{
    unsigned long v0;  // x0

    if (!(g_f00b08 & 1))
    {
        g_f00b08 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00b00 = g_f0c948;
    }
    return v0;
}
