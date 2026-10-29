/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x10937c..0x109414 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f016b0;
extern unsigned short g_f016b2;
extern unsigned short g_f016b4;
extern unsigned short g_f016b6;
extern unsigned long long g_f017f0;
extern unsigned short g_f0e1c8;
extern unsigned short g_f0e1ca;
extern unsigned short g_f0e1cc;
extern unsigned short g_f0e1ce;

long long sub_10937c(void)
{
    unsigned long v0;  // x0

    g_f0e1c8 = 62100;
    g_f0e1ca = 47237;
    g_f0e1cc = 62223;
    g_f0e1ce = 26547;
    g_f016b0 = g_f0e1c8 ^ g_f016b0;
    g_f016b2 = g_f0e1ca ^ g_f016b2;
    g_f016b4 = g_f0e1cc ^ g_f016b4;
    g_f016b6 = g_f0e1ce ^ g_f016b6;
    g_f017f0 = g_f017f0 ^ 7472583455583629972;
    return v0;
}
