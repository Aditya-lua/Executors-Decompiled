/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13c134..0x13c1cc (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01c20;
extern unsigned short g_f01c22;
extern unsigned short g_f01c24;
extern unsigned short g_f01c26;
extern unsigned long long g_f01d20;
extern unsigned short g_f0ef58;
extern unsigned short g_f0ef5a;
extern unsigned short g_f0ef5c;
extern unsigned short g_f0ef5e;

long long sub_13c134(void)
{
    unsigned long v0;  // x0

    g_f0ef58 = 52376;
    g_f0ef5a = 39240;
    g_f0ef5c = 6434;
    g_f0ef5e = 46048;
    g_f01c20 = g_f0ef58 ^ g_f01c20;
    g_f01c22 = g_f0ef5a ^ g_f01c22;
    g_f01c24 = g_f0ef5c ^ g_f01c24;
    g_f01c26 = g_f0ef5e ^ g_f01c26;
    g_f01d20 = g_f01d20 ^ 12961387363963554968;
    return v0;
}
