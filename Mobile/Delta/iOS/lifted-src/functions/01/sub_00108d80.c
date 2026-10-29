/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x108d80..0x108e18 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01640;
extern unsigned short g_f01642;
extern unsigned short g_f01644;
extern unsigned short g_f01646;
extern unsigned long long g_f01780;
extern unsigned short g_f0e158;
extern unsigned short g_f0e15a;
extern unsigned short g_f0e15c;
extern unsigned short g_f0e15e;

long long sub_108d80(void)
{
    unsigned long v0;  // x0

    g_f0e158 = 62949;
    g_f0e15a = 12308;
    g_f0e15c = 1169;
    g_f0e15e = 46071;
    g_f01640 = g_f0e158 ^ g_f01640;
    g_f01642 = g_f0e15a ^ g_f01642;
    g_f01644 = g_f0e15c ^ g_f01644;
    g_f01646 = g_f0e15e ^ g_f01646;
    g_f01780 = g_f01780 ^ 12967838673660081637;
    return v0;
}
