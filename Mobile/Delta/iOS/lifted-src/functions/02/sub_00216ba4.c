/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x216ba4..0x216c3c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f029a0;
extern unsigned short g_f029a2;
extern unsigned short g_f029a4;
extern unsigned short g_f029a6;
extern unsigned long long g_f02ab0;
extern unsigned short g_f10fb8;
extern unsigned short g_f10fba;
extern unsigned short g_f10fbc;
extern unsigned short g_f10fbe;

long long sub_216ba4(void)
{
    unsigned long v0;  // x0

    g_f10fb8 = 13432;
    g_f10fba = 7195;
    g_f10fbc = 64559;
    g_f10fbe = 33445;
    g_f029a0 = g_f10fb8 ^ g_f029a0;
    g_f029a2 = g_f10fba ^ g_f029a2;
    g_f029a4 = g_f10fbc ^ g_f029a4;
    g_f029a6 = g_f10fbe ^ g_f029a6;
    g_f02ab0 = g_f02ab0 ^ 9414207875353097336;
    return v0;
}
