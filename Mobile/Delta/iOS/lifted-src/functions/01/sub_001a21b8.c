/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a21b8..0x1a2250 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02418;
extern unsigned short g_f0241a;
extern unsigned short g_f0241c;
extern unsigned short g_f0241e;
extern unsigned long long g_f02480;
extern unsigned short g_f105f0;
extern unsigned short g_f105f2;
extern unsigned short g_f105f4;
extern unsigned short g_f105f6;

long long sub_1a21b8(void)
{
    unsigned long v0;  // x0

    g_f105f0 = 51626;
    g_f105f2 = 32392;
    g_f105f4 = 22992;
    g_f105f6 = 18129;
    g_f02418 = g_f105f0 ^ g_f02418;
    g_f0241a = g_f105f2 ^ g_f0241a;
    g_f0241c = g_f105f4 ^ g_f0241c;
    g_f0241e = g_f105f6 ^ g_f0241e;
    g_f02480 = g_f02480 ^ 5102958604798445994;
    return v0;
}
