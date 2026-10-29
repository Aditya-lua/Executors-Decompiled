/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x227750..0x2277e8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02bc0;
extern unsigned short g_f02bc2;
extern unsigned short g_f02bc4;
extern unsigned short g_f02bc6;
extern unsigned long long g_f02c50;
extern unsigned short g_f11520;
extern unsigned short g_f11522;
extern unsigned short g_f11524;
extern unsigned short g_f11526;

long long sub_227750(void)
{
    unsigned long v0;  // x0

    g_f11520 = 12506;
    g_f11522 = 57053;
    g_f11524 = 42755;
    g_f11526 = 4155;
    g_f02bc0 = g_f11520 ^ g_f02bc0;
    g_f02bc2 = g_f11522 ^ g_f02bc2;
    g_f02bc4 = g_f11524 ^ g_f02bc4;
    g_f02bc6 = g_f11526 ^ g_f02bc6;
    g_f02c50 = g_f02c50 ^ 1169712163298554074;
    return v0;
}
