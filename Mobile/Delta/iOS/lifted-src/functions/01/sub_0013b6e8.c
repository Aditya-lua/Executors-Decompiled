/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13b6e8..0x13b780 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01c48;
extern unsigned short g_f01c4a;
extern unsigned short g_f01c4c;
extern unsigned short g_f01c4e;
extern unsigned long long g_f01d48;
extern unsigned short g_f0ef80;
extern unsigned short g_f0ef82;
extern unsigned short g_f0ef84;
extern unsigned short g_f0ef86;

long long sub_13b6e8(void)
{
    unsigned long v0;  // x0

    g_f0ef80 = 37512;
    g_f0ef82 = 57018;
    g_f0ef84 = 37600;
    g_f0ef86 = 39075;
    g_f01c48 = g_f0ef80 ^ g_f01c48;
    g_f01c4a = g_f0ef82 ^ g_f01c4a;
    g_f01c4c = g_f0ef84 ^ g_f01c4c;
    g_f01c4e = g_f0ef86 ^ g_f01c4e;
    g_f01d48 = g_f01d48 ^ 10998796209475981960;
    return v0;
}
