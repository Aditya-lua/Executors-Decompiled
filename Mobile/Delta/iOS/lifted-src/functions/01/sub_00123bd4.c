/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x123bd4..0x123c6c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01968;
extern unsigned short g_f0196a;
extern unsigned short g_f0196c;
extern unsigned short g_f0196e;
extern unsigned long long g_f01a50;
extern unsigned short g_f0ea08;
extern unsigned short g_f0ea0a;
extern unsigned short g_f0ea0c;
extern unsigned short g_f0ea0e;

long long sub_123bd4(void)
{
    unsigned long v0;  // x0

    g_f0ea08 = 2182;
    g_f0ea0a = 44001;
    g_f0ea0c = 1565;
    g_f0ea0e = 36298;
    g_f01968 = g_f0ea08 ^ g_f01968;
    g_f0196a = g_f0ea0a ^ g_f0196a;
    g_f0196c = g_f0ea0c ^ g_f0196c;
    g_f0196e = g_f0ea0e ^ g_f0196e;
    g_f01a50 = g_f01a50 ^ 10216985429150861446;
    return v0;
}
