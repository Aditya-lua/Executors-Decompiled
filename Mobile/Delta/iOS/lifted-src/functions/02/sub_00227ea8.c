/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x227ea8..0x227f40 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02b98;
extern unsigned short g_f02b9a;
extern unsigned short g_f02b9c;
extern unsigned short g_f02b9e;
extern unsigned long long g_f02c28;
extern unsigned short g_f114f8;
extern unsigned short g_f114fa;
extern unsigned short g_f114fc;
extern unsigned short g_f114fe;

long long sub_227ea8(void)
{
    unsigned long v0;  // x0

    g_f114f8 = 25226;
    g_f114fa = 4707;
    g_f114fc = 11591;
    g_f114fe = 11128;
    g_f02b98 = g_f114f8 ^ g_f02b98;
    g_f02b9a = g_f114fa ^ g_f02b9a;
    g_f02b9c = g_f114fc ^ g_f02b9c;
    g_f02b9e = g_f114fe ^ g_f02b9e;
    g_f02c28 = g_f02c28 ^ 3132303324110611082;
    return v0;
}
