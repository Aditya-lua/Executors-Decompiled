/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x109c78..0x109d10 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f016c0;
extern unsigned short g_f016c2;
extern unsigned short g_f016c4;
extern unsigned short g_f016c6;
extern unsigned long long g_f01800;
extern unsigned short g_f0e1d8;
extern unsigned short g_f0e1da;
extern unsigned short g_f0e1dc;
extern unsigned short g_f0e1de;

long long sub_109c78(void)
{
    unsigned long v0;  // x0

    g_f0e1d8 = 45978;
    g_f0e1da = 48132;
    g_f0e1dc = 61577;
    g_f0e1de = 23758;
    g_f016c0 = g_f0e1d8 ^ g_f016c0;
    g_f016c2 = g_f0e1da ^ g_f016c2;
    g_f016c4 = g_f0e1dc ^ g_f016c4;
    g_f016c6 = g_f0e1de ^ g_f016c6;
    g_f01800 = g_f01800 ^ 6687546971047375770;
    return v0;
}
