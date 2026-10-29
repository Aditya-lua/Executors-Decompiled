/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x113298..0x113330 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01838;
extern unsigned short g_f0183a;
extern unsigned short g_f0183c;
extern unsigned short g_f0183e;
extern unsigned long long g_f018d0;
extern unsigned short g_f0e710;
extern unsigned short g_f0e712;
extern unsigned short g_f0e714;
extern unsigned short g_f0e716;

long long sub_113298(void)
{
    unsigned long v0;  // x0

    g_f0e710 = 43431;
    g_f0e712 = 5715;
    g_f0e714 = 13741;
    g_f0e716 = 23753;
    g_f01838 = g_f0e710 ^ g_f01838;
    g_f0183a = g_f0e712 ^ g_f0183a;
    g_f0183c = g_f0e714 ^ g_f0183c;
    g_f0183e = g_f0e716 ^ g_f0183e;
    g_f018d0 = g_f018d0 ^ 6685934139328407975;
    return v0;
}
