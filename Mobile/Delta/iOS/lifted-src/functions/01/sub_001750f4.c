/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1750f4..0x17518c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02008;
extern unsigned short g_f0200a;
extern unsigned short g_f0200c;
extern unsigned short g_f0200e;
extern unsigned long long g_f02090;
extern unsigned short g_f0fd58;
extern unsigned short g_f0fd5a;
extern unsigned short g_f0fd5c;
extern unsigned short g_f0fd5e;

long long sub_1750f4(void)
{
    unsigned long v0;  // x0

    g_f0fd58 = 58008;
    g_f0fd5a = 19393;
    g_f0fd5c = 64670;
    g_f0fd5e = 2806;
    g_f02008 = g_f0fd58 ^ g_f02008;
    g_f0200a = g_f0fd5a ^ g_f0200a;
    g_f0200c = g_f0fd5c ^ g_f0200c;
    g_f0200e = g_f0fd5e ^ g_f0200e;
    g_f02090 = g_f02090 ^ 790096541456130712;
    return v0;
}
