/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x109f10..0x109fa8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f015d0;
extern unsigned short g_f015d2;
extern unsigned short g_f015d4;
extern unsigned short g_f015d6;
extern unsigned long long g_f01710;
extern unsigned short g_f0e0e8;
extern unsigned short g_f0e0ea;
extern unsigned short g_f0e0ec;
extern unsigned short g_f0e0ee;

long long sub_109f10(void)
{
    unsigned long v0;  // x0

    g_f0e0e8 = 34678;
    g_f0e0ea = 56303;
    g_f0e0ec = 5660;
    g_f0e0ee = 58;
    g_f015d0 = g_f0e0e8 ^ g_f015d0;
    g_f015d2 = g_f0e0ea ^ g_f015d2;
    g_f015d4 = g_f0e0ec ^ g_f015d4;
    g_f015d6 = g_f0e0ee ^ g_f015d6;
    g_f01710 = g_f01710 ^ 16349861854021494;
    return v0;
}
