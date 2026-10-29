/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x18c948..0x18c9e0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f021e0;
extern unsigned short g_f021e2;
extern unsigned short g_f021e4;
extern unsigned short g_f021e6;
extern unsigned long long g_f022f0;
extern unsigned short g_f10118;
extern unsigned short g_f1011a;
extern unsigned short g_f1011c;
extern unsigned short g_f1011e;

long long sub_18c948(void)
{
    unsigned long v0;  // x0

    g_f10118 = 13757;
    g_f1011a = 65192;
    g_f1011c = 12989;
    g_f1011e = 51603;
    g_f021e0 = g_f10118 ^ g_f021e0;
    g_f021e2 = g_f1011a ^ g_f021e2;
    g_f021e4 = g_f1011c ^ g_f021e4;
    g_f021e6 = g_f1011e ^ g_f021e6;
    g_f022f0 = g_f022f0 ^ 0xc99332bdfea835bd;
    return v0;
}
