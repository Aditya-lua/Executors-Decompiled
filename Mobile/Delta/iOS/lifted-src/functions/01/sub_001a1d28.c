/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a1d28..0x1a1dc0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02430;
extern unsigned short g_f02432;
extern unsigned short g_f02434;
extern unsigned short g_f02436;
extern unsigned long long g_f02498;
extern unsigned short g_f10608;
extern unsigned short g_f1060a;
extern unsigned short g_f1060c;
extern unsigned short g_f1060e;

long long sub_1a1d28(void)
{
    unsigned long v0;  // x0

    g_f10608 = 35572;
    g_f1060a = 15305;
    g_f1060c = 54801;
    g_f1060e = 13945;
    g_f02430 = g_f10608 ^ g_f02430;
    g_f02432 = g_f1060a ^ g_f02432;
    g_f02434 = g_f1060c ^ g_f02434;
    g_f02436 = g_f1060e ^ g_f02436;
    g_f02498 = g_f02498 ^ 3925403919735950068;
    return v0;
}
