/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x174dfc..0x174e94 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02058;
extern unsigned short g_f0205a;
extern unsigned short g_f0205c;
extern unsigned short g_f0205e;
extern unsigned long long g_f020e0;
extern unsigned short g_f0fda8;
extern unsigned short g_f0fdaa;
extern unsigned short g_f0fdac;
extern unsigned short g_f0fdae;

long long sub_174dfc(void)
{
    unsigned long v0;  // x0

    g_f0fda8 = 34490;
    g_f0fdaa = 58589;
    g_f0fdac = 61470;
    g_f0fdae = 54397;
    g_f02058 = g_f0fda8 ^ g_f02058;
    g_f0205a = g_f0fdaa ^ g_f0205a;
    g_f0205c = g_f0fdac ^ g_f0205c;
    g_f0205e = g_f0fdae ^ g_f0205e;
    g_f020e0 = g_f020e0 ^ 15311658323608962746;
    return v0;
}
