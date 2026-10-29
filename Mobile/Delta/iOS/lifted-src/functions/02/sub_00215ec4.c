/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x215ec4..0x215f5c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02a18;
extern unsigned short g_f02a1a;
extern unsigned short g_f02a1c;
extern unsigned short g_f02a1e;
extern unsigned long long g_f02b28;
extern unsigned short g_f11030;
extern unsigned short g_f11032;
extern unsigned short g_f11034;
extern unsigned short g_f11036;

long long sub_215ec4(void)
{
    unsigned long v0;  // x0

    g_f11030 = 40490;
    g_f11032 = 52941;
    g_f11034 = 26979;
    g_f11036 = 12528;
    g_f02a18 = g_f11030 ^ g_f02a18;
    g_f02a1a = g_f11032 ^ g_f02a1a;
    g_f02a1c = g_f11034 ^ g_f02a1c;
    g_f02a1e = g_f11036 ^ g_f02a1e;
    g_f02b28 = g_f02b28 ^ 3526434385623359018;
    return v0;
}
