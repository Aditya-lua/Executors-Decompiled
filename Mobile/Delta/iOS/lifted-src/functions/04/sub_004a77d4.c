/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4a77d4..0x4a7838 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00d30;
extern char g_f00d38;
extern unsigned int g_f0c948;

long long sub_4a77d4(void)
{
    unsigned int v0;  // w10
    unsigned long v2;  // x0

    v0 = g_f00d38 + 1;
    if ((-((v0 & -(g_f00d38 | 1)) * 2) & 254) == ((v0 ^ -(g_f00d38 | 1)) & 0xff))
    {
        g_f00d38 = 1;
        g_f0c948 = (g_f0c948 ^ 2) + (g_f0c948 * 2 & 4) - 1;
        g_f00d30 = g_f0c948;
    }
    return v2;
}
