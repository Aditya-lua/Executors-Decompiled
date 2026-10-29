/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x109d10..0x109da8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f016a8;
extern unsigned short g_f016aa;
extern unsigned short g_f016ac;
extern unsigned short g_f016ae;
extern unsigned long long g_f017e8;
extern unsigned short g_f0e1c0;
extern unsigned short g_f0e1c2;
extern unsigned short g_f0e1c4;
extern unsigned short g_f0e1c6;

long long sub_109d10(void)
{
    unsigned long v0;  // x0

    g_f0e1c0 = 42720;
    g_f0e1c2 = 29533;
    g_f0e1c4 = 29774;
    g_f0e1c6 = 27942;
    g_f016a8 = g_f0e1c0 ^ g_f016a8;
    g_f016aa = g_f0e1c2 ^ g_f016aa;
    g_f016ac = g_f0e1c4 ^ g_f016ac;
    g_f016ae = g_f0e1c6 ^ g_f016ae;
    g_f017e8 = g_f017e8 ^ 7865101679540938464;
    return v0;
}
