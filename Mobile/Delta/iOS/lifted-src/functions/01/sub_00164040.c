/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x164040..0x1640d8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01f88;
extern unsigned short g_f01f8a;
extern unsigned short g_f01f8c;
extern unsigned short g_f01f8e;
extern unsigned long long g_f01fe0;
extern unsigned short g_f0fb90;
extern unsigned short g_f0fb92;
extern unsigned short g_f0fb94;
extern unsigned short g_f0fb96;

long long sub_164040(void)
{
    unsigned long v0;  // x0

    g_f0fb90 = 6867;
    g_f0fb92 = 24919;
    g_f0fb94 = 4260;
    g_f0fb96 = 25119;
    g_f01f88 = g_f0fb90 ^ g_f01f88;
    g_f01f8a = g_f0fb92 ^ g_f01f8a;
    g_f01f8c = g_f0fb94 ^ g_f01f8c;
    g_f01f8e = g_f0fb96 ^ g_f01f8e;
    g_f01fe0 = g_f01fe0 ^ 7070388238188747475;
    return v0;
}
