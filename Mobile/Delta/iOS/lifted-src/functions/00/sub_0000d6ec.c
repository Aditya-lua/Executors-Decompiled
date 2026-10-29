/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xd6ec..0xd720 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00dc0;
extern char g_f00dc8;
extern unsigned int g_f0c948;

long long sub_d6ec(void)
{
    unsigned long v0;  // x0

    if (!(g_f00dc8 & 1))
    {
        g_f00dc8 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00dc0 = g_f0c948;
    }
    return v0;
}
