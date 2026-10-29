/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x15cf94..0x15cfc8 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00be0;
extern char g_f00be8;
extern unsigned int g_f0c948;

long long sub_15cf94(void)
{
    unsigned long v0;  // x0

    if (!(g_f00be8 & 1))
    {
        g_f00be8 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00be0 = g_f0c948;
    }
    return v0;
}
