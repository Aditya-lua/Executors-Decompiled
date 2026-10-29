/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a1dc0..0x1a1e58 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f023f8;
extern unsigned short g_f023fa;
extern unsigned short g_f023fc;
extern unsigned short g_f023fe;
extern unsigned long long g_f02460;
extern unsigned short g_f105d0;
extern unsigned short g_f105d2;
extern unsigned short g_f105d4;
extern unsigned short g_f105d6;

long long sub_1a1dc0(void)
{
    unsigned long v0;  // x0

    g_f105d0 = 39740;
    g_f105d2 = 31114;
    g_f105d4 = 24278;
    g_f105d6 = 23707;
    g_f023f8 = g_f105d0 ^ g_f023f8;
    g_f023fa = g_f105d2 ^ g_f023fa;
    g_f023fc = g_f105d4 ^ g_f023fc;
    g_f023fe = g_f105d6 ^ g_f023fe;
    g_f02460 = g_f02460 ^ 6673031548134660924;
    return v0;
}
