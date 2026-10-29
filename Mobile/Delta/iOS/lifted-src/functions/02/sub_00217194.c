/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x217194..0x21722c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f029f0;
extern unsigned short g_f029f2;
extern unsigned short g_f029f4;
extern unsigned short g_f029f6;
extern unsigned long long g_f02b00;
extern unsigned short g_f11008;
extern unsigned short g_f1100a;
extern unsigned short g_f1100c;
extern unsigned short g_f1100e;

long long sub_217194(void)
{
    unsigned long v0;  // x0

    g_f11008 = 43033;
    g_f1100a = 21143;
    g_f1100c = 61351;
    g_f1100e = 19500;
    g_f029f0 = g_f11008 ^ g_f029f0;
    g_f029f2 = g_f1100a ^ g_f029f2;
    g_f029f4 = g_f1100c ^ g_f029f4;
    g_f029f6 = g_f1100e ^ g_f029f6;
    g_f02b00 = g_f02b00 ^ 5489025547782039577;
    return v0;
}
