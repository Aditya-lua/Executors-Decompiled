/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x10924c..0x1092e4 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01610;
extern unsigned short g_f01612;
extern unsigned short g_f01614;
extern unsigned short g_f01616;
extern unsigned long long g_f01750;
extern unsigned short g_f0e128;
extern unsigned short g_f0e12a;
extern unsigned short g_f0e12c;
extern unsigned short g_f0e12e;

long long sub_10924c(void)
{
    unsigned long v0;  // x0

    g_f0e128 = 2577;
    g_f0e12a = 35474;
    g_f0e12c = 3102;
    g_f0e12e = 54438;
    g_f01610 = g_f0e128 ^ g_f01610;
    g_f01612 = g_f0e12a ^ g_f01612;
    g_f01614 = g_f0e12c ^ g_f01614;
    g_f01616 = g_f0e12e ^ g_f01616;
    g_f01750 = g_f01750 ^ 15322948107488070161;
    return v0;
}
