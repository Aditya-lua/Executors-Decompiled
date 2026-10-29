/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d439c..0x1d4434 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02588;
extern unsigned short g_f0258a;
extern unsigned short g_f0258c;
extern unsigned short g_f0258e;
extern unsigned long long g_f02650;
extern unsigned short g_f10840;
extern unsigned short g_f10842;
extern unsigned short g_f10844;
extern unsigned short g_f10846;

long long sub_1d439c(void)
{
    unsigned long v0;  // x0

    g_f10840 = 27731;
    g_f10842 = 4877;
    g_f10844 = 8245;
    g_f10846 = 19518;
    g_f02588 = g_f10840 ^ g_f02588;
    g_f0258a = g_f10842 ^ g_f0258a;
    g_f0258c = g_f10844 ^ g_f0258c;
    g_f0258e = g_f10846 ^ g_f0258e;
    g_f02650 = g_f02650 ^ 5493864007763586131;
    return v0;
}
