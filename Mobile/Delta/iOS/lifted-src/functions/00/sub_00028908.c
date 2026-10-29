/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x28908..0x2893c (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00ff0;
extern char g_f00ff8;
extern unsigned int g_f0c94c;

long long sub_28908(void)
{
    unsigned long v0;  // x0

    if (!(g_f00ff8 & 1))
    {
        g_f00ff8 = 1;
        g_f0c94c = g_f0c94c + 1;
        g_f00ff0 = g_f0c94c;
    }
    return v0;
}
