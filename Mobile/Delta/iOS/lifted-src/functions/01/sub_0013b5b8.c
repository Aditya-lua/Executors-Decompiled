/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13b5b8..0x13b650 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01bf0;
extern unsigned short g_f01bf2;
extern unsigned short g_f01bf4;
extern unsigned short g_f01bf6;
extern unsigned long long g_f01cf0;
extern unsigned short g_f0ef28;
extern unsigned short g_f0ef2a;
extern unsigned short g_f0ef2c;
extern unsigned short g_f0ef2e;

long long sub_13b5b8(void)
{
    unsigned long v0;  // x0

    g_f0ef28 = 39524;
    g_f0ef2a = 8772;
    g_f0ef2c = 8364;
    g_f0ef2e = 54415;
    g_f01bf0 = g_f0ef28 ^ g_f01bf0;
    g_f01bf2 = g_f0ef2a ^ g_f01bf2;
    g_f01bf4 = g_f0ef2c ^ g_f01bf4;
    g_f01bf6 = g_f0ef2e ^ g_f01bf6;
    g_f01cf0 = g_f01cf0 ^ 15316496781391731300;
    return v0;
}
