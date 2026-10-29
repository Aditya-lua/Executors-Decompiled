/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13b0f8..0x13b190 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01c10;
extern unsigned short g_f01c12;
extern unsigned short g_f01c14;
extern unsigned short g_f01c16;
extern unsigned long long g_f01d10;
extern unsigned short g_f0ef48;
extern unsigned short g_f0ef4a;
extern unsigned short g_f0ef4c;
extern unsigned short g_f0ef4e;

long long sub_13b0f8(void)
{
    unsigned long v0;  // x0

    g_f0ef48 = 58769;
    g_f0ef4a = 50887;
    g_f0ef4c = 7085;
    g_f0ef4e = 48837;
    g_f01c10 = g_f0ef48 ^ g_f01c10;
    g_f01c12 = g_f0ef4a ^ g_f01c12;
    g_f01c14 = g_f0ef4c ^ g_f01c14;
    g_f01c16 = g_f0ef4e ^ g_f01c16;
    g_f01d10 = g_f01d10 ^ 13746423870796588433;
    return v0;
}
