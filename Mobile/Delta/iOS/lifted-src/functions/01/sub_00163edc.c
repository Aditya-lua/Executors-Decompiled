/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x163edc..0x163f74 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01f60;
extern unsigned short g_f01f62;
extern unsigned short g_f01f64;
extern unsigned short g_f01f66;
extern unsigned long long g_f01fb8;
extern unsigned short g_f0fb68;
extern unsigned short g_f0fb6a;
extern unsigned short g_f0fb6c;
extern unsigned short g_f0fb6e;

long long sub_163edc(void)
{
    unsigned long v0;  // x0

    g_f0fb68 = 10418;
    g_f0fb6a = 46733;
    g_f0fb6c = 38633;
    g_f0fb6e = 32091;
    g_f01f60 = g_f0fb68 ^ g_f01f60;
    g_f01f62 = g_f0fb6a ^ g_f01f62;
    g_f01f64 = g_f0fb6c ^ g_f01f64;
    g_f01f66 = g_f0fb6e ^ g_f01f66;
    g_f01fb8 = g_f01fb8 ^ 9032979408155912370;
    return v0;
}
