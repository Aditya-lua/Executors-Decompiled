/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9248..0x9278 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00e80;
extern char g_f00e88;
extern unsigned int g_f0c94c;

long long sub_9248(void)
{
    unsigned long v0;  // x0

    if (!(g_f00e88 & 1))
    {
        g_f00e88 = 1;
        g_f0c94c = g_f0c94c + 1;
        g_f00e80 = g_f0c94c;
    }
    return v0;
}
