/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d40a4..0x1d413c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02578;
extern unsigned short g_f0257a;
extern unsigned short g_f0257c;
extern unsigned short g_f0257e;
extern unsigned long long g_f02640;
extern unsigned short g_f10830;
extern unsigned short g_f10832;
extern unsigned short g_f10834;
extern unsigned short g_f10836;

long long sub_1d40a4(void)
{
    unsigned long v0;  // x0

    g_f10830 = 46300;
    g_f10832 = 9402;
    g_f10834 = 8890;
    g_f10836 = 22307;
    g_f02578 = g_f10830 ^ g_f02578;
    g_f0257a = g_f10832 ^ g_f0257a;
    g_f0257c = g_f10834 ^ g_f0257c;
    g_f0257e = g_f10836 ^ g_f0257e;
    g_f02640 = g_f02640 ^ 6278900488360080604;
    return v0;
}
