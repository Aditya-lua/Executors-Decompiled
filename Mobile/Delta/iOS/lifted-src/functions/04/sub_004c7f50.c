/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4c7f50..0x4c7fa4 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00b40;
extern char g_f00b48;
extern unsigned int g_f0c948;

long long sub_4c7f50(void)
{
    unsigned int v0;  // w9
    unsigned long v2;  // x0

    v0 = g_f00b48 + 1;
    if ((-((v0 & (~g_f00b48 | 1)) * 2) & 254) == ((v0 ^ (~g_f00b48 | 1)) & 0xff))
    {
        g_f00b48 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00b40 = g_f0c948;
    }
    return v2;
}
