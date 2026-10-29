/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x804c..0x807c (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00ca0;
extern char g_f00ca8;
extern unsigned int g_f0c948;

long long sub_804c(void)
{
    unsigned long v0;  // x0

    if (!(g_f00ca8 & 1))
    {
        g_f00ca8 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00ca0 = g_f0c948;
    }
    return v0;
}
