/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x91ef64..0x91ef98 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00be0;
extern char g_f00be8;
extern unsigned int g_f0c948;

long long sub_91ef64(void)
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
