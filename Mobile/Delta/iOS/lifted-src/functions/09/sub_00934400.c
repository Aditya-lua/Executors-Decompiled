/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x934400..0x934448 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00d60;
extern char g_f00d68;
extern unsigned int g_f0c948;

long long sub_934400(void)
{
    unsigned long v1;  // x0

    if (!~(char)(g_f00d68 - (g_f00d68 | 1)))
    {
        g_f00d68 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00d60 = g_f0c948;
        return v1;
    }
    return v1;
}
