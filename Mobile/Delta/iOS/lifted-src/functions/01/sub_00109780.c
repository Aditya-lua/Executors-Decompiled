/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x109780..0x109818 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f015d8;
extern unsigned short g_f015da;
extern unsigned short g_f015dc;
extern unsigned short g_f015de;
extern unsigned long long g_f01718;
extern unsigned short g_f0e0f0;
extern unsigned short g_f0e0f2;
extern unsigned short g_f0e0f4;
extern unsigned short g_f0e0f6;

long long sub_109780(void)
{
    unsigned long v0;  // x0

    g_f0e0f0 = 15130;
    g_f0e0f2 = 37591;
    g_f0e0f4 = 38107;
    g_f0e0f6 = 64199;
    g_f015d8 = g_f0e0f0 ^ g_f015d8;
    g_f015da = g_f0e0f2 ^ g_f015da;
    g_f015dc = g_f0e0f4 ^ g_f015dc;
    g_f015de = g_f0e0f6 ^ g_f015de;
    g_f01718 = g_f01718 ^ 18070575700629732122;
    return v0;
}
