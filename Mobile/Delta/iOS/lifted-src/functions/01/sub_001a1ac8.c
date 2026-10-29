/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a1ac8..0x1a1b60 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f023e8;
extern unsigned short g_f023ea;
extern unsigned short g_f023ec;
extern unsigned short g_f023ee;
extern unsigned long long g_f02450;
extern unsigned short g_f105c0;
extern unsigned short g_f105c2;
extern unsigned short g_f105c4;
extern unsigned short g_f105c6;

long long sub_1a1ac8(void)
{
    unsigned long v0;  // x0

    g_f105c0 = 43622;
    g_f105c2 = 64500;
    g_f105c4 = 24918;
    g_f105c6 = 26496;
    g_f023e8 = g_f105c0 ^ g_f023e8;
    g_f023ea = g_f105c2 ^ g_f023ea;
    g_f023ec = g_f105c4 ^ g_f023ec;
    g_f023ee = g_f105c6 ^ g_f023ee;
    g_f02450 = g_f02450 ^ 7458068009147738726;
    return v0;
}
