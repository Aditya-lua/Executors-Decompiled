/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x108854..0x1088ec (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01698;
extern unsigned short g_f0169a;
extern unsigned short g_f0169c;
extern unsigned short g_f0169e;
extern unsigned long long g_f017d8;
extern unsigned short g_f0e1b0;
extern unsigned short g_f0e1b2;
extern unsigned short g_f0e1b4;
extern unsigned short g_f0e1b6;

long long sub_108854(void)
{
    unsigned long v0;  // x0

    g_f0e1b0 = 33226;
    g_f0e1b2 = 34126;
    g_f0e1b4 = 30413;
    g_f0e1b6 = 30731;
    g_f01698 = g_f0e1b0 ^ g_f01698;
    g_f0169a = g_f0e1b2 ^ g_f0169a;
    g_f0169c = g_f0e1b4 ^ g_f0169c;
    g_f0169e = g_f0e1b6 ^ g_f0169e;
    g_f017d8 = g_f017d8 ^ 8650138134372057546;
    return v0;
}
