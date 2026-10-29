/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x216124..0x2161bc (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02928;
extern unsigned short g_f0292a;
extern unsigned short g_f0292c;
extern unsigned short g_f0292e;
extern unsigned long long g_f02a38;
extern unsigned short g_f10f40;
extern unsigned short g_f10f42;
extern unsigned short g_f10f44;
extern unsigned short g_f10f46;

long long sub_216124(void)
{
    unsigned long v0;  // x0

    g_f10f40 = 41622;
    g_f10f42 = 27590;
    g_f10f44 = 36597;
    g_f10f46 = 54363;
    g_f02928 = g_f10f40 ^ g_f02928;
    g_f0292a = g_f10f42 ^ g_f0292a;
    g_f0292c = g_f10f44 ^ g_f0292c;
    g_f0292e = g_f10f46 ^ g_f0292e;
    g_f02a38 = g_f02a38 ^ 15301981343647703702;
    return v0;
}
