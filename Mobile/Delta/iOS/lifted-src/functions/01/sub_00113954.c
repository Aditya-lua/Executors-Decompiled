/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x113954..0x1139ec (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01840;
extern unsigned short g_f01842;
extern unsigned short g_f01844;
extern unsigned short g_f01846;
extern unsigned long long g_f018d8;
extern unsigned short g_f0e718;
extern unsigned short g_f0e71a;
extern unsigned short g_f0e71c;
extern unsigned short g_f0e71e;

long long sub_113954(void)
{
    unsigned long v0;  // x0

    g_f0e718 = 51258;
    g_f0e71a = 57459;
    g_f0e71c = 46189;
    g_f0e71e = 22358;
    g_f01840 = g_f0e718 ^ g_f01840;
    g_f01842 = g_f0e71a ^ g_f01842;
    g_f01844 = g_f0e71c ^ g_f01844;
    g_f01846 = g_f0e71e ^ g_f01846;
    g_f018d8 = g_f018d8 ^ 6293415913306966074;
    return v0;
}
