/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x18bec4..0x18bf5c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f021e8;
extern unsigned short g_f021ea;
extern unsigned short g_f021ec;
extern unsigned short g_f021ee;
extern unsigned long long g_f022f8;
extern unsigned short g_f10120;
extern unsigned short g_f10122;
extern unsigned short g_f10124;
extern unsigned short g_f10126;

long long sub_18bec4(void)
{
    unsigned long v0;  // x0

    g_f10120 = 36112;
    g_f10122 = 15835;
    g_f10124 = 45437;
    g_f10126 = 50208;
    g_f021e8 = g_f10120 ^ g_f021e8;
    g_f021ea = g_f10122 ^ g_f021ea;
    g_f021ec = g_f10124 ^ g_f021ec;
    g_f021ee = g_f10126 ^ g_f021ee;
    g_f022f8 = g_f022f8 ^ 14132490782155443472;
    return v0;
}
