/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x19af44..0x19afdc (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02388;
extern unsigned short g_f0238a;
extern unsigned short g_f0238c;
extern unsigned short g_f0238e;
extern unsigned long long g_f02390;
extern unsigned short g_f10598;
extern unsigned short g_f1059a;
extern unsigned short g_f1059c;
extern unsigned short g_f1059e;

long long sub_19af44(void)
{
    unsigned long v0;  // x0

    g_f10598 = 20750;
    g_f1059a = 33041;
    g_f1059c = 28761;
    g_f1059e = 43230;
    g_f02388 = g_f10598 ^ g_f02388;
    g_f0238a = g_f1059a ^ g_f0238a;
    g_f0238c = g_f1059c ^ g_f0238c;
    g_f0238e = g_f1059e ^ g_f0238e;
    g_f02390 = g_f02390 ^ 12168286772921454862;
    return v0;
}
