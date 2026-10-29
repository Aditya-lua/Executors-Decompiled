/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x123844..0x1238dc (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f019f0;
extern unsigned short g_f019f2;
extern unsigned short g_f019f4;
extern unsigned short g_f019f6;
extern unsigned long long g_f01ad8;
extern unsigned short g_f0ea90;
extern unsigned short g_f0ea92;
extern unsigned short g_f0ea94;
extern unsigned short g_f0ea96;

long long sub_123844(void)
{
    unsigned long v0;  // x0

    g_f0ea90 = 33614;
    g_f0ea92 = 21087;
    g_f0ea94 = 28878;
    g_f0ea96 = 12591;
    g_f019f0 = g_f0ea90 ^ g_f019f0;
    g_f019f2 = g_f0ea92 ^ g_f019f2;
    g_f019f4 = g_f0ea94 ^ g_f019f4;
    g_f019f6 = g_f0ea96 ^ g_f019f6;
    g_f01ad8 = g_f01ad8 ^ 3544175463211434830;
    return v0;
}
