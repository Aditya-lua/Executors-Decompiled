/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x164338..0x1643d0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01f58;
extern unsigned short g_f01f5a;
extern unsigned short g_f01f5c;
extern unsigned short g_f01f5e;
extern unsigned long long g_f01fb0;
extern unsigned short g_f0fb60;
extern unsigned short g_f0fb62;
extern unsigned short g_f0fb64;
extern unsigned short g_f0fb66;

long long sub_164338(void)
{
    unsigned long v0;  // x0

    g_f0fb60 = 63535;
    g_f0fb62 = 59349;
    g_f0fb64 = 6190;
    g_f0fb66 = 33486;
    g_f01f58 = g_f0fb60 ^ g_f01f58;
    g_f01f5a = g_f0fb62 ^ g_f01f5a;
    g_f01f5c = g_f0fb64 ^ g_f01f5c;
    g_f01f5e = g_f0fb66 ^ g_f01f5e;
    g_f01fb0 = g_f01fb0 ^ 9425497659870148655;
    return v0;
}
