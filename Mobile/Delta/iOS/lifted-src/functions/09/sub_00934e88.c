/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x934e88..0x934edc (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00e00;
extern char g_f00e08;
extern unsigned int g_f0c948;

long long sub_934e88(void)
{
    unsigned int v0;  // w10
    unsigned long v2;  // x0

    v0 = ~g_f00e08 | 1;
    if ((-((g_f00e08 + 1 & v0) * 2) & 254) == ((g_f00e08 + 1 ^ v0) & 0xff))
    {
        g_f00e08 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00e00 = g_f0c948;
    }
    return v2;
}
