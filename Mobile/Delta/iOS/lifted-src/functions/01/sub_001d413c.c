/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d413c..0x1d41d4 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02568;
extern unsigned short g_f0256a;
extern unsigned short g_f0256c;
extern unsigned short g_f0256e;
extern unsigned long long g_f02630;
extern unsigned short g_f10820;
extern unsigned short g_f10822;
extern unsigned short g_f10824;
extern unsigned short g_f10826;

long long sub_1d413c(void)
{
    unsigned long v0;  // x0

    g_f10820 = 64902;
    g_f10822 = 55307;
    g_f10824 = 9530;
    g_f10826 = 25096;
    g_f02568 = g_f10820 ^ g_f02568;
    g_f0256a = g_f10822 ^ g_f0256a;
    g_f0256c = g_f10824 ^ g_f0256c;
    g_f0256e = g_f10826 ^ g_f0256e;
    g_f02630 = g_f02630 ^ 0x6208253ad80bfd86;
    return v0;
}
