/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x48b64..0x48b98 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f01060;
extern char g_f01068;
extern unsigned int g_f0c94c;

long long sub_48b64(void)
{
    unsigned long v0;  // x0

    if (!(g_f01068 & 1))
    {
        g_f01068 = 1;
        g_f0c94c = g_f0c94c + 1;
        g_f01060 = g_f0c94c;
    }
    return v0;
}
