/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x216e04..0x216e9c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02950;
extern unsigned short g_f02952;
extern unsigned short g_f02954;
extern unsigned short g_f02956;
extern unsigned long long g_f02a60;
extern unsigned short g_f10f68;
extern unsigned short g_f10f6a;
extern unsigned short g_f10f6c;
extern unsigned short g_f10f6e;

long long sub_216e04(void)
{
    unsigned long v0;  // x0

    g_f10f68 = 37014;
    g_f10f6a = 5760;
    g_f10f6c = 2229;
    g_f10f6e = 47391;
    g_f02950 = g_f10f68 ^ g_f02950;
    g_f02952 = g_f10f6a ^ g_f02952;
    g_f02954 = g_f10f6c ^ g_f02954;
    g_f02956 = g_f10f6e ^ g_f02956;
    g_f02a60 = g_f02a60 ^ 13339390195154325654;
    return v0;
}
