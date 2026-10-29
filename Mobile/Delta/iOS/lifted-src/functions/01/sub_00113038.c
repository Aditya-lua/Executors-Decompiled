/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x113038..0x1130d0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01818;
extern unsigned short g_f0181a;
extern unsigned short g_f0181c;
extern unsigned short g_f0181e;
extern unsigned long long g_f018b0;
extern unsigned short g_f0e6f0;
extern unsigned short g_f0e6f2;
extern unsigned short g_f0e6f4;
extern unsigned short g_f0e6f6;

long long sub_113038(void)
{
    unsigned long v0;  // x0

    g_f0e6f0 = 48810;
    g_f0e6f2 = 53745;
    g_f0e6f4 = 15025;
    g_f0e6f6 = 29331;
    g_f01818 = g_f0e6f0 ^ g_f01818;
    g_f0181a = g_f0e6f2 ^ g_f0181a;
    g_f0181c = g_f0e6f4 ^ g_f0181c;
    g_f0181e = g_f0e6f6 ^ g_f0181e;
    g_f018b0 = g_f018b0 ^ 8256007077306154666;
    return v0;
}
