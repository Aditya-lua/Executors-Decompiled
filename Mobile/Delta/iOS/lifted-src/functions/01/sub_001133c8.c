/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1133c8..0x113460 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01810;
extern unsigned short g_f01812;
extern unsigned short g_f01814;
extern unsigned short g_f01816;
extern unsigned long long g_f018a8;
extern unsigned short g_f0e6e8;
extern unsigned short g_f0e6ea;
extern unsigned short g_f0e6ec;
extern unsigned short g_f0e6ee;

long long sub_1133c8(void)
{
    unsigned long v0;  // x0

    g_f0e6e8 = 56134;
    g_f0e6ea = 6801;
    g_f0e6ec = 48113;
    g_f0e6ee = 30725;
    g_f01810 = g_f0e6e8 ^ g_f01810;
    g_f01812 = g_f0e6ea ^ g_f01812;
    g_f01814 = g_f0e6ec ^ g_f01814;
    g_f01816 = g_f0e6ee ^ g_f01816;
    g_f018a8 = g_f018a8 ^ 8648525303642184518;
    return v0;
}
