/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x109818..0x1098b0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01590;
extern unsigned short g_f01592;
extern unsigned short g_f01594;
extern unsigned short g_f01596;
extern unsigned long long g_f016d0;
extern unsigned short g_f0e0a8;
extern unsigned short g_f0e0aa;
extern unsigned short g_f0e0ac;
extern unsigned short g_f0e0ae;

long long sub_109818(void)
{
    unsigned long v0;  // x0

    g_f0e0a8 = 1372;
    g_f0e0aa = 55981;
    g_f0e0ac = 0x2020;
    g_f0e0ae = 11214;
    g_f01590 = g_f0e0a8 ^ g_f01590;
    g_f01592 = g_f0e0aa ^ g_f01592;
    g_f01594 = g_f0e0ac ^ g_f01594;
    g_f01596 = g_f0e0ae ^ g_f01596;
    g_f016d0 = g_f016d0 ^ 3156495714313110876;
    return v0;
}
