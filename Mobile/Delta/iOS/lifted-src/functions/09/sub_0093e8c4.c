/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x93e8c4..0x93e91c (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00c70;
extern char g_f00c78;
extern unsigned int g_f0c948;

long long sub_93e8c4(void)
{
    unsigned long v1;  // x0

    if ((-(((g_f00c78 + ~g_f00c78 * 2 + 1 | 1) & ~(g_f00c78 + ~g_f00c78 * 2)) * 2) & 254) == ((g_f00c78 + ~g_f00c78 * 2 ^ ~(g_f00c78 + ~g_f00c78 * 2 + 1 | 1)) & 0xff))
    {
        g_f00c78 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00c70 = g_f0c948;
    }
    return v1;
}
