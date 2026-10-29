/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1235b0..0x123648 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f019e8;
extern unsigned short g_f019ea;
extern unsigned short g_f019ec;
extern unsigned short g_f019ee;
extern unsigned long long g_f01ad0;
extern unsigned short g_f0ea88;
extern unsigned short g_f0ea8a;
extern unsigned short g_f0ea8c;
extern unsigned short g_f0ea8e;

long long sub_1235b0(void)
{
    unsigned long v0;  // x0

    g_f0ea88 = 3659;
    g_f0ea8a = 50552;
    g_f0ea8c = 61969;
    g_f0ea8e = 13985;
    g_f019e8 = g_f0ea88 ^ g_f019e8;
    g_f019ea = g_f0ea8a ^ g_f019ea;
    g_f019ec = g_f0ea8c ^ g_f019ec;
    g_f019ee = g_f0ea8e ^ g_f019ee;
    g_f01ad0 = g_f01ad0 ^ 3936693707439869515;
    return v0;
}
