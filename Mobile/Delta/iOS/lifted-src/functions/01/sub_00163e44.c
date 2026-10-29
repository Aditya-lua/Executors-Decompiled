/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x163e44..0x163edc (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01f50;
extern unsigned short g_f01f52;
extern unsigned short g_f01f54;
extern unsigned short g_f01f56;
extern unsigned long long g_f01fa8;
extern unsigned short g_f0fb58;
extern unsigned short g_f0fb5a;
extern unsigned short g_f0fb5c;
extern unsigned short g_f0fb5e;

long long sub_163e44(void)
{
    unsigned long v0;  // x0

    g_f0fb58 = 6220;
    g_f0fb5a = 50428;
    g_f0fb5c = 39279;
    g_f0fb5e = 34880;
    g_f01f50 = g_f0fb58 ^ g_f01f50;
    g_f01f52 = g_f0fb5a ^ g_f01f52;
    g_f01f54 = g_f0fb5c ^ g_f01f54;
    g_f01f56 = g_f0fb5e ^ g_f01f56;
    g_f01fa8 = g_f01fa8 ^ 9818015892992956492;
    return v0;
}
