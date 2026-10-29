/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d41d4..0x1d426c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f025c8;
extern unsigned short g_f025ca;
extern unsigned short g_f025cc;
extern unsigned short g_f025ce;
extern unsigned long long g_f02690;
extern unsigned short g_f10880;
extern unsigned short g_f10882;
extern unsigned short g_f10884;
extern unsigned short g_f10886;

long long sub_1d41d4(void)
{
    unsigned long v0;  // x0

    g_f10880 = 4286;
    g_f10882 = 52495;
    g_f10884 = 5683;
    g_f10886 = 8362;
    g_f025c8 = g_f10880 ^ g_f025c8;
    g_f025ca = g_f10882 ^ g_f025ca;
    g_f025cc = g_f10884 ^ g_f025cc;
    g_f025ce = g_f10886 ^ g_f025ce;
    g_f02690 = g_f02690 ^ 2353718166993965246;
    return v0;
}
