/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1fd7b8..0x1fd850 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f028e8;
extern unsigned short g_f028ea;
extern unsigned short g_f028ec;
extern unsigned short g_f028ee;
extern unsigned long long g_f028f8;
extern unsigned short g_f10ee0;
extern unsigned short g_f10ee2;
extern unsigned short g_f10ee4;
extern unsigned short g_f10ee6;

long long sub_1fd7b8(void)
{
    unsigned long v0;  // x0

    g_f10ee0 = 26123;
    g_f10ee2 = 36043;
    g_f10ee4 = 0x98ff;
    g_f10ee6 = 0xffef;
    g_f028e8 = g_f10ee0 ^ g_f028e8;
    g_f028ea = g_f10ee2 ^ g_f028ea;
    g_f028ec = g_f10ee4 ^ g_f028ec;
    g_f028ee = g_f10ee6 ^ g_f028ee;
    g_f028f8 = g_f028f8 ^ 0xffef98ff8ccb660b;
    return v0;
}
