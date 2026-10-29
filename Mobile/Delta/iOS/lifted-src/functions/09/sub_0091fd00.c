/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x91fd00..0x91fd54 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00e30;
extern char g_f00e38;
extern unsigned int g_f0c948;

long long sub_91fd00(void)
{
    unsigned int v0;  // w9
    unsigned long v2;  // x0

    v0 = g_f00e38 + 1;
    if ((-((v0 & (~g_f00e38 | 1)) * 2) & 254) == ((v0 ^ (~g_f00e38 | 1)) & 0xff))
    {
        g_f00e38 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00e30 = g_f0c948;
    }
    return v2;
}
