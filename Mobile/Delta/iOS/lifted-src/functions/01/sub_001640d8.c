/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1640d8..0x164170 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01f40;
extern unsigned short g_f01f42;
extern unsigned short g_f01f44;
extern unsigned short g_f01f46;
extern unsigned long long g_f01f98;
extern unsigned short g_f0fb48;
extern unsigned short g_f0fb4a;
extern unsigned short g_f0fb4c;
extern unsigned short g_f0fb4e;

long long sub_1640d8(void)
{
    unsigned long v0;  // x0

    g_f0fb48 = 55589;
    g_f0fb4a = 10380;
    g_f0fb4c = 39912;
    g_f0fb4e = 37669;
    g_f01f40 = g_f0fb48 ^ g_f01f40;
    g_f01f42 = g_f0fb4a ^ g_f01f42;
    g_f01f44 = g_f0fb4c ^ g_f01f44;
    g_f01f46 = g_f0fb4e ^ g_f01f46;
    g_f01f98 = g_f01f98 ^ 10603052319128738085;
    return v0;
}
