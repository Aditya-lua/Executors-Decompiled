/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x123d04..0x123d9c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01a18;
extern unsigned short g_f01a1a;
extern unsigned short g_f01a1c;
extern unsigned short g_f01a1e;
extern unsigned long long g_f01b00;
extern unsigned short g_f0eab8;
extern unsigned short g_f0eaba;
extern unsigned short g_f0eabc;
extern unsigned short g_f0eabe;

long long sub_123d04(void)
{
    unsigned long v0;  // x0

    g_f0eab8 = 20831;
    g_f0eaba = 24341;
    g_f0eabc = 60044;
    g_f0eabe = 5618;
    g_f01a18 = g_f0eab8 ^ g_f01a18;
    g_f01a1a = g_f0eaba ^ g_f01a1a;
    g_f01a1c = g_f0eabc ^ g_f01a1c;
    g_f01a1e = g_f0eabe ^ g_f01a1e;
    g_f01b00 = g_f01b00 ^ 1581584307772019039;
    return v0;
}
