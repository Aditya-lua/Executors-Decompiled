/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x267e44..0x267e78 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00b90;
extern char g_f00b98;
extern unsigned int g_f0c948;

long long sub_267e44(void)
{
    unsigned long v0;  // x0

    if (!(g_f00b98 & 1))
    {
        g_f00b98 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00b90 = g_f0c948;
    }
    return v0;
}
