/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x91ef98..0x91effc (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00d90;
extern char g_f00d98;
extern unsigned int g_f0c948;

long long sub_91ef98(void)
{
    unsigned int v0;  // w10
    unsigned long v2;  // x0

    v0 = g_f00d98 + 1;
    if ((-((v0 & -(g_f00d98 | 1)) * 2) & 254) == ((v0 ^ -(g_f00d98 | 1)) & 0xff))
    {
        g_f00d98 = 1;
        g_f0c948 = (g_f0c948 ^ 2) + (g_f0c948 * 2 & 4) - 1;
        g_f00d90 = g_f0c948;
    }
    return v2;
}
