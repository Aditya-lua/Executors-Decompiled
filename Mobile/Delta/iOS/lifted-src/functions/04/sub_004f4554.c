/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4f4554..0x4f45ac (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00c80;
extern char g_f00c88;
extern unsigned int g_f0c948;

long long sub_4f4554(void)
{
    unsigned long v1;  // x0

    if ((-(((g_f00c88 + ~g_f00c88 * 2 + 1 | 1) & ~(g_f00c88 + ~g_f00c88 * 2)) * 2) & 254) == ((g_f00c88 + ~g_f00c88 * 2 ^ ~(g_f00c88 + ~g_f00c88 * 2 + 1 | 1)) & 0xff))
    {
        g_f00c88 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00c80 = g_f0c948;
    }
    return v1;
}
