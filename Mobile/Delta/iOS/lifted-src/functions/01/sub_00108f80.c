/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x108f80..0x109018 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01668;
extern unsigned short g_f0166a;
extern unsigned short g_f0166c;
extern unsigned short g_f0166e;
extern unsigned long long g_f017a8;
extern unsigned short g_f0e180;
extern unsigned short g_f0e182;
extern unsigned short g_f0e184;
extern unsigned short g_f0e186;

long long sub_108f80(void)
{
    unsigned long v0;  // x0

    g_f0e180 = 9158;
    g_f0e182 = 217;
    g_f0e184 = 32341;
    g_f0e186 = 39098;
    g_f01668 = g_f0e180 ^ g_f01668;
    g_f0166a = g_f0e182 ^ g_f0166a;
    g_f0166c = g_f0e184 ^ g_f0166c;
    g_f0166e = g_f0e186 ^ g_f0166e;
    g_f017a8 = g_f017a8 ^ 11005247542984778694;
    return v0;
}
