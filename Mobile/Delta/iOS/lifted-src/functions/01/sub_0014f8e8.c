/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x14f8e8..0x14f980 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01e10;
extern unsigned short g_f01e12;
extern unsigned short g_f01e14;
extern unsigned short g_f01e16;
extern unsigned long long g_f01e60;
extern unsigned short g_f0f7d0;
extern unsigned short g_f0f7d2;
extern unsigned short g_f0f7d4;
extern unsigned short g_f0f7d6;

long long sub_14f8e8(void)
{
    unsigned long v0;  // x0

    g_f0f7d0 = 36550;
    g_f0f7d2 = 52526;
    g_f0f7d4 = 52097;
    g_f0f7d6 = 25124;
    g_f01e10 = g_f0f7d0 ^ g_f01e10;
    g_f01e12 = g_f0f7d2 ^ g_f01e12;
    g_f01e14 = g_f0f7d4 ^ g_f01e14;
    g_f01e16 = g_f0f7d6 ^ g_f01e16;
    g_f01e60 = g_f01e60 ^ 7072001073232121542;
    return v0;
}
