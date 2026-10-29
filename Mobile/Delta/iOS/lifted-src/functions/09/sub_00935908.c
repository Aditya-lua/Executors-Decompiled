/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x935908..0x935950 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00c00;
extern char g_f00c08;
extern unsigned int g_f0c948;

long long sub_935908(void)
{
    unsigned long v1;  // x0

    if (!~(char)(g_f00c08 - (g_f00c08 | 1)))
    {
        g_f00c08 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00c00 = g_f0c948;
        return v1;
    }
    return v1;
}
