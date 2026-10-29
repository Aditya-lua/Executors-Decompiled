/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x508798..0x5087ec (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00d00;
extern char g_f00d08;
extern unsigned int g_f0c948;

long long sub_508798(void)
{
    unsigned int v0;  // w9
    unsigned long v2;  // x0

    v0 = g_f00d08 + 1;
    if ((-((v0 & (~g_f00d08 | 1)) * 2) & 254) == ((v0 ^ (~g_f00d08 | 1)) & 0xff))
    {
        g_f00d08 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00d00 = g_f0c948;
    }
    return v2;
}
