/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a1a30..0x1a1ac8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02420;
extern unsigned short g_f02422;
extern unsigned short g_f02424;
extern unsigned short g_f02426;
extern unsigned long long g_f02488;
extern unsigned short g_f105f8;
extern unsigned short g_f105fa;
extern unsigned short g_f105fc;
extern unsigned short g_f105fe;

long long sub_1a1a30(void)
{
    unsigned long v0;  // x0

    g_f105f8 = 43309;
    g_f105fa = 47192;
    g_f105fc = 55443;
    g_f105fe = 16734;
    g_f02420 = g_f105f8 ^ g_f02420;
    g_f02422 = g_f105fa ^ g_f02422;
    g_f02424 = g_f105fc ^ g_f02424;
    g_f02426 = g_f105fe ^ g_f02426;
    g_f02488 = g_f02488 ^ 4710440389240727853;
    return v0;
}
