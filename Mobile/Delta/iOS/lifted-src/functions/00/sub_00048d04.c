/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x48d04..0x48d38 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00fe0;
extern char g_f00fe8;
extern unsigned int g_f0c94c;

long long sub_48d04(void)
{
    unsigned long v0;  // x0

    if (!(g_f00fe8 & 1))
    {
        g_f00fe8 = 1;
        g_f0c94c = g_f0c94c + 1;
        g_f00fe0 = g_f0c94c;
    }
    return v0;
}
