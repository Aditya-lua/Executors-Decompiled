/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a1ef0..0x1a1f88 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f023f0;
extern unsigned short g_f023f2;
extern unsigned short g_f023f4;
extern unsigned short g_f023f6;
extern unsigned long long g_f02458;
extern unsigned short g_f105c8;
extern unsigned short g_f105ca;
extern unsigned short g_f105cc;
extern unsigned short g_f105ce;

long long sub_1a1ef0(void)
{
    unsigned long v0;  // x0

    g_f105c8 = 1945;
    g_f105ca = 8907;
    g_f105cc = 57366;
    g_f105ce = 25101;
    g_f023f0 = g_f105c8 ^ g_f023f0;
    g_f023f2 = g_f105ca ^ g_f023f2;
    g_f023f4 = g_f105cc ^ g_f023f4;
    g_f023f6 = g_f105ce ^ g_f023f6;
    g_f02458 = g_f02458 ^ 7065549776091809689;
    return v0;
}
