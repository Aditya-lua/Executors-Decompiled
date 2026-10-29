/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x107cb8..0x107d50 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f016b8;
extern unsigned short g_f016ba;
extern unsigned short g_f016bc;
extern unsigned short g_f016be;
extern unsigned long long g_f017f8;
extern unsigned short g_f0e1d0;
extern unsigned short g_f0e1d2;
extern unsigned short g_f0e1d4;
extern unsigned short g_f0e1d6;

long long sub_107cb8(void)
{
    unsigned long v0;  // x0

    g_f0e1d0 = 24327;
    g_f0e1d2 = 64973;
    g_f0e1d4 = 29128;
    g_f0e1d6 = 25153;
    g_f016b8 = g_f0e1d0 ^ g_f016b8;
    g_f016ba = g_f0e1d2 ^ g_f016ba;
    g_f016bc = g_f0e1d4 ^ g_f016bc;
    g_f016be = g_f0e1d6 ^ g_f016be;
    g_f017f8 = g_f017f8 ^ 7080065197268623111;
    return v0;
}
