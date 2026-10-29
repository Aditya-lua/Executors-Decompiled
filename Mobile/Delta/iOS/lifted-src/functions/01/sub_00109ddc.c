/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x109ddc..0x109e74 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01690;
extern unsigned short g_f01692;
extern unsigned short g_f01694;
extern unsigned short g_f01696;
extern unsigned long long g_f017d0;
extern unsigned short g_f0e1a8;
extern unsigned short g_f0e1aa;
extern unsigned short g_f0e1ac;
extern unsigned short g_f0e1ae;

long long sub_109ddc(void)
{
    unsigned long v0;  // x0

    g_f0e1a8 = 4390;
    g_f0e1aa = 12679;
    g_f0e1ac = 63501;
    g_f0e1ae = 0x7d7d;
    g_f01690 = g_f0e1a8 ^ g_f01690;
    g_f01692 = g_f0e1aa ^ g_f01692;
    g_f01694 = g_f0e1ac ^ g_f01694;
    g_f01696 = g_f0e1ae ^ g_f01696;
    g_f017d0 = g_f017d0 ^ 9042656362379022630;
    return v0;
}
