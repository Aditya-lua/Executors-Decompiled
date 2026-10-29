/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c5a44..0x3c5adc (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f03828;
extern unsigned short g_f0382a;
extern unsigned short g_f0382c;
extern unsigned short g_f0382e;
extern unsigned long long g_f03838;
extern unsigned short g_f11d20;
extern unsigned short g_f11d22;
extern unsigned short g_f11d24;
extern unsigned short g_f11d26;

long long sub_3c5a44(void)
{
    unsigned long v0;  // x0

    g_f11d20 = 30422;
    g_f11d22 = 8467;
    g_f11d24 = 13791;
    g_f11d26 = 40361;
    g_f03828 = g_f11d20 ^ g_f03828;
    g_f0382a = g_f11d22 ^ g_f0382a;
    g_f0382c = g_f11d24 ^ g_f0382c;
    g_f0382e = g_f11d26 ^ g_f0382e;
    g_f03838 = g_f03838 ^ 11360670767467689686;
    return v0;
}
