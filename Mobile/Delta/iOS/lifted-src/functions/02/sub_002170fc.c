/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2170fc..0x217194 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f029c0;
extern unsigned short g_f029c2;
extern unsigned short g_f029c4;
extern unsigned short g_f029c6;
extern unsigned long long g_f02ad0;
extern unsigned short g_f10fd8;
extern unsigned short g_f10fda;
extern unsigned short g_f10fdc;
extern unsigned short g_f10fde;

long long sub_2170fc(void)
{
    unsigned long v0;  // x0

    g_f10fd8 = 55173;
    g_f10fda = 54585;
    g_f10fdc = 63275;
    g_f10fde = 27867;
    g_f029c0 = g_f10fd8 ^ g_f029c0;
    g_f029c2 = g_f10fda ^ g_f029c2;
    g_f029c4 = g_f10fdc ^ g_f029c4;
    g_f029c6 = g_f10fde ^ g_f029c6;
    g_f02ad0 = g_f02ad0 ^ 7844134943628842885;
    return v0;
}
