/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xe8444..0xe84dc (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01400;
extern unsigned short g_f01402;
extern unsigned short g_f01404;
extern unsigned short g_f01406;
extern unsigned long long g_f01490;
extern unsigned short g_f0dce0;
extern unsigned short g_f0dce2;
extern unsigned short g_f0dce4;
extern unsigned short g_f0dce6;

long long sub_e8444(void)
{
    unsigned long v0;  // x0

    g_f0dce0 = 61941;
    g_f0dce2 = 20074;
    g_f0dce4 = 24255;
    g_f0dce6 = 15403;
    g_f01400 = g_f0dce0 ^ g_f01400;
    g_f01402 = g_f0dce2 ^ g_f01402;
    g_f01404 = g_f0dce4 ^ g_f01404;
    g_f01406 = g_f0dce6 ^ g_f01406;
    g_f01490 = g_f01490 ^ 4335663242021630453;
    return v0;
}
