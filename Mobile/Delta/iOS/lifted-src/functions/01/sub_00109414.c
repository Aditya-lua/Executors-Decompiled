/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x109414..0x1094ac (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f016a0;
extern unsigned short g_f016a2;
extern unsigned short g_f016a4;
extern unsigned short g_f016a6;
extern unsigned long long g_f017e0;
extern unsigned short g_f0e1b8;
extern unsigned short g_f0e1ba;
extern unsigned short g_f0e1bc;
extern unsigned short g_f0e1be;

long long sub_109414(void)
{
    unsigned long v0;  // x0

    g_f0e1b8 = 12877;
    g_f0e1ba = 15110;
    g_f0e1bc = 62862;
    g_f0e1be = 29336;
    g_f016a0 = g_f0e1b8 ^ g_f016a0;
    g_f016a2 = g_f0e1ba ^ g_f016a2;
    g_f016a4 = g_f0e1bc ^ g_f016a4;
    g_f016a6 = g_f0e1be ^ g_f016a6;
    g_f017e0 = g_f017e0 ^ 8257619908008227405;
    return v0;
}
