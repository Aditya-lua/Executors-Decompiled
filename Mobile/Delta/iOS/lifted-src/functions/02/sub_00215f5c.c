/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x215f5c..0x215ff4 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02948;
extern unsigned short g_f0294a;
extern unsigned short g_f0294c;
extern unsigned short g_f0294e;
extern unsigned long long g_f02a58;
extern unsigned short g_f10f60;
extern unsigned short g_f10f62;
extern unsigned short g_f10f64;
extern unsigned short g_f10f66;

long long sub_215f5c(void)
{
    unsigned long v0;  // x0

    g_f10f60 = 8483;
    g_f10f62 = 34624;
    g_f10f64 = 35316;
    g_f10f66 = 48785;
    g_f02948 = g_f10f60 ^ g_f02948;
    g_f0294a = g_f10f62 ^ g_f0294a;
    g_f0294c = g_f10f64 ^ g_f0294c;
    g_f0294e = g_f10f66 ^ g_f0294e;
    g_f02a58 = g_f02a58 ^ 13731908422163505443;
    return v0;
}
