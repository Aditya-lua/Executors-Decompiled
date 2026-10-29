/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xe8110..0xe81a8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01410;
extern unsigned short g_f01412;
extern unsigned short g_f01414;
extern unsigned short g_f01416;
extern unsigned long long g_f014a0;
extern unsigned short g_f0dcf0;
extern unsigned short g_f0dcf2;
extern unsigned short g_f0dcf4;
extern unsigned short g_f0dcf6;

long long sub_e8110(void)
{
    unsigned long v0;  // x0

    g_f0dcf0 = 12604;
    g_f0dcf2 = 3770;
    g_f0dcf4 = 23612;
    g_f0dcf6 = 12614;
    g_f01410 = g_f0dcf0 ^ g_f01410;
    g_f01412 = g_f0dcf2 ^ g_f01412;
    g_f01414 = g_f0dcf4 ^ g_f01414;
    g_f01416 = g_f0dcf6 ^ g_f01416;
    g_f014a0 = g_f014a0 ^ 3550626769243091260;
    return v0;
}
