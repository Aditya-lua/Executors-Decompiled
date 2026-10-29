/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xecac8..0xecb60 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01548;
extern unsigned short g_f0154a;
extern unsigned short g_f0154c;
extern unsigned short g_f0154e;
extern unsigned long long g_f01578;
extern unsigned short g_f0dfd8;
extern unsigned short g_f0dfda;
extern unsigned short g_f0dfdc;
extern unsigned short g_f0dfde;

long long sub_ecac8(void)
{
    unsigned long v0;  // x0

    g_f0dfd8 = 12702;
    g_f0dfda = 8809;
    g_f0dfdc = 43876;
    g_f0dfde = 23764;
    g_f01548 = g_f0dfd8 ^ g_f01548;
    g_f0154a = g_f0dfda ^ g_f0154a;
    g_f0154c = g_f0dfdc ^ g_f0154c;
    g_f0154e = g_f0dfde ^ g_f0154e;
    g_f01578 = g_f01578 ^ 6689159793114427806;
    return v0;
}
