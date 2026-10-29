/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8db8..0x8de8 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00ed0;
extern char g_f00ed8;
extern unsigned int g_f0c94c;

long long sub_8db8(void)
{
    unsigned long v0;  // x0

    if (!(g_f00ed8 & 1))
    {
        g_f00ed8 = 1;
        g_f0c94c = g_f0c94c + 1;
        g_f00ed0 = g_f0c94c;
    }
    return v0;
}
