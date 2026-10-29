/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1134f8..0x113590 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01828;
extern unsigned short g_f0182a;
extern unsigned short g_f0182c;
extern unsigned short g_f0182e;
extern unsigned long long g_f018c0;
extern unsigned short g_f0e700;
extern unsigned short g_f0e702;
extern unsigned short g_f0e704;
extern unsigned short g_f0e706;

long long sub_1134f8(void)
{
    unsigned long v0;  // x0

    g_f0e700 = 63872;
    g_f0e702 = 10160;
    g_f0e704 = 14386;
    g_f0e706 = 26542;
    g_f01828 = g_f0e700 ^ g_f01828;
    g_f0182a = g_f0e702 ^ g_f0182a;
    g_f0182c = g_f0e704 ^ g_f0182c;
    g_f0182e = g_f0e706 ^ g_f0182e;
    g_f018c0 = g_f018c0 ^ 7470970619919661440;
    return v0;
}
