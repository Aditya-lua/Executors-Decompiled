/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2161bc..0x216254 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02958;
extern unsigned short g_f0295a;
extern unsigned short g_f0295c;
extern unsigned short g_f0295e;
extern unsigned long long g_f02a68;
extern unsigned short g_f10f70;
extern unsigned short g_f10f72;
extern unsigned short g_f10f74;
extern unsigned short g_f10f76;

long long sub_2161bc(void)
{
    unsigned long v0;  // x0

    g_f10f70 = 250;
    g_f10f72 = 54337;
    g_f10f74 = 34677;
    g_f10f76 = 45996;
    g_f02958 = g_f10f70 ^ g_f02958;
    g_f0295a = g_f10f72 ^ g_f0295a;
    g_f0295c = g_f10f74 ^ g_f0295c;
    g_f0295e = g_f10f76 ^ g_f0295e;
    g_f02a68 = g_f02a68 ^ 12946871968925286650;
    return v0;
}
