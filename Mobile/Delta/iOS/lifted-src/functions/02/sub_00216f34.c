/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x216f34..0x216fcc (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02980;
extern unsigned short g_f02982;
extern unsigned short g_f02984;
extern unsigned short g_f02986;
extern unsigned long long g_f02a90;
extern unsigned short g_f10f98;
extern unsigned short g_f10f9a;
extern unsigned short g_f10f9c;
extern unsigned short g_f10f9e;

long long sub_216f34(void)
{
    unsigned long v0;  // x0

    g_f10f98 = 13034;
    g_f10f9a = 40195;
    g_f10f9c = 297;
    g_f10f9e = 39024;
    g_f02980 = g_f10f98 ^ g_f02980;
    g_f02982 = g_f10f9a ^ g_f02982;
    g_f02984 = g_f10f9c ^ g_f02984;
    g_f02986 = g_f10f9e ^ g_f02986;
    g_f02a90 = g_f02a90 ^ 10984280769396159210;
    return v0;
}
