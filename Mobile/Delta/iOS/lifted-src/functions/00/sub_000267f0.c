/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x267f0..0x26824 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00f60;
extern char g_f00f68;
extern unsigned int g_f0c94c;

long long sub_267f0(void)
{
    unsigned long v0;  // x0

    if (!(g_f00f68 & 1))
    {
        g_f00f68 = 1;
        g_f0c94c = g_f0c94c + 1;
        g_f00f60 = g_f0c94c;
    }
    return v0;
}
