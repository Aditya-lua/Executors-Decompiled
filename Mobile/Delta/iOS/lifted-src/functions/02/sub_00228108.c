/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x228108..0x2281a0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02bf0;
extern unsigned short g_f02bf2;
extern unsigned short g_f02bf4;
extern unsigned short g_f02bf6;
extern unsigned long long g_f02c80;
extern unsigned short g_f11550;
extern unsigned short g_f11552;
extern unsigned short g_f11554;
extern unsigned short g_f11556;

long long sub_228108(void)
{
    unsigned long v0;  // x0

    g_f11550 = 38094;
    g_f11552 = 41838;
    g_f11554 = 40824;
    g_f11556 = 61324;
    g_f02bf0 = g_f11550 ^ g_f02bf0;
    g_f02bf2 = g_f11552 ^ g_f02bf2;
    g_f02bf4 = g_f11554 ^ g_f02bf4;
    g_f02bf6 = g_f11556 ^ g_f02bf6;
    g_f02c80 = g_f02c80 ^ 17261346812291093710;
    return v0;
}
