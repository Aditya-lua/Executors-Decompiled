/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x174fc4..0x17505c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02000;
extern unsigned short g_f02002;
extern unsigned short g_f02004;
extern unsigned short g_f02006;
extern unsigned long long g_f02088;
extern unsigned short g_f0fd50;
extern unsigned short g_f0fd52;
extern unsigned short g_f0fd54;
extern unsigned short g_f0fd56;

long long sub_174fc4(void)
{
    unsigned long v0;  // x0

    g_f0fd50 = 20213;
    g_f0fd52 = 12930;
    g_f0fd54 = 32222;
    g_f0fd56 = 4201;
    g_f02000 = g_f0fd50 ^ g_f02000;
    g_f02002 = g_f0fd52 ^ g_f02002;
    g_f02004 = g_f0fd54 ^ g_f02004;
    g_f02006 = g_f0fd56 ^ g_f02006;
    g_f02088 = g_f02088 ^ 1182614770445078261;
    return v0;
}
