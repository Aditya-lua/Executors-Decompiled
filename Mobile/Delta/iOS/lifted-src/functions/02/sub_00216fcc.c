/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x216fcc..0x217064 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02a08;
extern unsigned short g_f02a0a;
extern unsigned short g_f02a0c;
extern unsigned short g_f02a0e;
extern unsigned long long g_f02b18;
extern unsigned short g_f11020;
extern unsigned short g_f11022;
extern unsigned short g_f11024;
extern unsigned short g_f11026;

long long sub_216fcc(void)
{
    unsigned long v0;  // x0

    g_f11020 = 22387;
    g_f11022 = 44381;
    g_f11024 = 27618;
    g_f11026 = 15317;
    g_f02a08 = g_f11020 ^ g_f02a08;
    g_f02a0a = g_f11022 ^ g_f02a0a;
    g_f02a0c = g_f11024 ^ g_f02a0c;
    g_f02a0e = g_f11026 ^ g_f02a0e;
    g_f02b18 = g_f02b18 ^ 4311470839592474483;
    return v0;
}
