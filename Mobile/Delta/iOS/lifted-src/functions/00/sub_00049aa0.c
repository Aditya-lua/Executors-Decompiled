/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x49aa0..0x49ad4 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00fd0;
extern char g_f00fd8;
extern unsigned int g_f0c94c;

long long sub_49aa0(void)
{
    unsigned long v0;  // x0

    if (!(g_f00fd8 & 1))
    {
        g_f00fd8 = 1;
        g_f0c94c = g_f0c94c + 1;
        g_f00fd0 = g_f0c94c;
    }
    return v0;
}
