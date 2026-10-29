/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x216384..0x21641c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02978;
extern unsigned short g_f0297a;
extern unsigned short g_f0297c;
extern unsigned short g_f0297e;
extern unsigned long long g_f02a88;
extern unsigned short g_f10f90;
extern unsigned short g_f10f92;
extern unsigned short g_f10f94;
extern unsigned short g_f10f96;

long long sub_216384(void)
{
    unsigned long v0;  // x0

    g_f10f90 = 50807;
    g_f10f92 = 7362;
    g_f10f94 = 33385;
    g_f10f96 = 40418;
    g_f02978 = g_f10f90 ^ g_f02978;
    g_f0297a = g_f10f92 ^ g_f0297a;
    g_f0297c = g_f10f94 ^ g_f0297c;
    g_f0297e = g_f10f96 ^ g_f0297e;
    g_f02a88 = g_f02a88 ^ 11376798996656998007;
    return v0;
}
