/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x233674..0x23370c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02cb8;
extern unsigned short g_f02cba;
extern unsigned short g_f02cbc;
extern unsigned short g_f02cbe;
extern unsigned long long g_f02cc0;
extern unsigned short g_f117c0;
extern unsigned short g_f117c2;
extern unsigned short g_f117c4;
extern unsigned short g_f117c6;

long long sub_233674(void)
{
    unsigned long v0;  // x0

    g_f117c0 = 28370;
    g_f117c2 = 29456;
    g_f117c4 = 50;
    g_f117c6 = 26462;
    g_f02cb8 = g_f117c0 ^ g_f02cb8;
    g_f02cba = g_f117c2 ^ g_f02cba;
    g_f02cbc = g_f117c4 ^ g_f02cbc;
    g_f02cbe = g_f117c6 ^ g_f02cbe;
    g_f02cc0 = g_f02cc0 ^ 7448391050396200658;
    return v0;
}
