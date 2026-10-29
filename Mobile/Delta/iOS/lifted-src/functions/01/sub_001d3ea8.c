/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d3ea8..0x1d3f40 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02590;
extern unsigned short g_f02592;
extern unsigned short g_f02594;
extern unsigned short g_f02596;
extern unsigned long long g_f02658;
extern unsigned short g_f10848;
extern unsigned short g_f1084a;
extern unsigned short g_f1084c;
extern unsigned short g_f1084e;

long long sub_1d3ea8(void)
{
    unsigned long v0;  // x0

    g_f10848 = 9190;
    g_f1084a = 60404;
    g_f1084c = 40692;
    g_f1084e = 18123;
    g_f02590 = g_f10848 ^ g_f02590;
    g_f02592 = g_f1084a ^ g_f02592;
    g_f02594 = g_f1084c ^ g_f02594;
    g_f02596 = g_f1084e ^ g_f02596;
    g_f02658 = g_f02658 ^ 5101345777695073254;
    return v0;
}
