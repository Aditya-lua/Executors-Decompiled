/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x26788..0x267bc (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00ea0;
extern char g_f00ea8;
extern unsigned int g_f0c94c;

long long sub_26788(void)
{
    unsigned long v0;  // x0

    if (!(g_f00ea8 & 1))
    {
        g_f00ea8 = 1;
        g_f0c94c = g_f0c94c + 1;
        g_f00ea0 = g_f0c94c;
    }
    return v0;
}
