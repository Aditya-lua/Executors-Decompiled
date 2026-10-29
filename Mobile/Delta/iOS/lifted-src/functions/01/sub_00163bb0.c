/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x163bb0..0x163c48 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01f80;
extern unsigned short g_f01f82;
extern unsigned short g_f01f84;
extern unsigned short g_f01f86;
extern unsigned long long g_f01fd8;
extern unsigned short g_f0fb88;
extern unsigned short g_f0fb8a;
extern unsigned short g_f0fb8c;
extern unsigned short g_f0fb8e;

long long sub_163bb0(void)
{
    unsigned long v0;  // x0

    g_f0fb88 = 46784;
    g_f0fb8a = 15247;
    g_f0fb8c = 37355;
    g_f0fb8e = 26513;
    g_f01f80 = g_f0fb88 ^ g_f01f80;
    g_f01f82 = g_f0fb8a ^ g_f01f82;
    g_f01f84 = g_f0fb8c ^ g_f01f84;
    g_f01f86 = g_f0fb8e ^ g_f01f86;
    g_f01fd8 = g_f01fd8 ^ 7462906497032238784;
    return v0;
}
