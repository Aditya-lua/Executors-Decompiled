/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xd2188..0xd2220 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f012b6;
extern unsigned short g_f012b8;
extern unsigned short g_f012ba;
extern unsigned short g_f012bc;
extern unsigned long long g_f012e8;
extern unsigned short g_f0dc7a;
extern unsigned short g_f0dc7c;
extern unsigned short g_f0dc7e;
extern unsigned short g_f0dc80;

long long sub_d2188(void)
{
    unsigned long v0;  // x0

    g_f0dc7a = 4235;
    g_f0dc7c = 22557;
    g_f0dc7e = 45670;
    g_f0dc80 = 7390;
    g_f012b6 = g_f0dc7a ^ g_f012b6;
    g_f012b8 = g_f0dc7c ^ g_f012b8;
    g_f012ba = g_f0dc7e ^ g_f012ba;
    g_f012bc = g_f0dc80 ^ g_f012bc;
    g_f012e8 = g_f012e8 ^ 2080296230526455947;
    return v0;
}
