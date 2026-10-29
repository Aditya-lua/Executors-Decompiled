/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x123350..0x1233e8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01a10;
extern unsigned short g_f01a12;
extern unsigned short g_f01a14;
extern unsigned short g_f01a16;
extern unsigned long long g_f01af8;
extern unsigned short g_f0eab0;
extern unsigned short g_f0eab2;
extern unsigned short g_f0eab4;
extern unsigned short g_f0eab6;

long long sub_123350(void)
{
    unsigned long v0;  // x0

    g_f0eab0 = 49340;
    g_f0eab2 = 24318;
    g_f0eab4 = 27597;
    g_f0eab6 = 7013;
    g_f01a10 = g_f0eab0 ^ g_f01a10;
    g_f01a12 = g_f0eab2 ^ g_f01a12;
    g_f01a14 = g_f0eab4 ^ g_f01a14;
    g_f01a16 = g_f0eab6 ^ g_f01a16;
    g_f01af8 = g_f01af8 ^ 1974102541478052028;
    return v0;
}
