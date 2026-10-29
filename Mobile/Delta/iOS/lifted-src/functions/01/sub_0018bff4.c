/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x18bff4..0x18c08c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f021d8;
extern unsigned short g_f021da;
extern unsigned short g_f021dc;
extern unsigned short g_f021de;
extern unsigned long long g_f022e8;
extern unsigned short g_f10110;
extern unsigned short g_f10112;
extern unsigned short g_f10114;
extern unsigned short g_f10116;

long long sub_18bff4(void)
{
    unsigned long v0;  // x0

    g_f10110 = 42522;
    g_f10112 = 16296;
    g_f10114 = 46074;
    g_f10116 = 52997;
    g_f021d8 = g_f10110 ^ g_f021d8;
    g_f021da = g_f10112 ^ g_f021da;
    g_f021dc = g_f10114 ^ g_f021dc;
    g_f021de = g_f10116 ^ g_f021de;
    g_f022e8 = g_f022e8 ^ 14917527228125849114;
    return v0;
}
