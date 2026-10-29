/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8c54..0x8c84 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00ef0;
extern char g_f00ef8;
extern unsigned int g_f0c94c;

long long sub_8c54(void)
{
    unsigned long v0;  // x0

    if (!(g_f00ef8 & 1))
    {
        g_f00ef8 = 1;
        g_f0c94c = g_f0c94c + 1;
        g_f00ef0 = g_f0c94c;
    }
    return v0;
}
