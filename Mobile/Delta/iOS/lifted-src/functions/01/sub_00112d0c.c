/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x112d0c..0x112da4 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01880;
extern unsigned short g_f01882;
extern unsigned short g_f01884;
extern unsigned short g_f01886;
extern unsigned long long g_f01918;
extern unsigned short g_f0e758;
extern unsigned short g_f0e75a;
extern unsigned short g_f0e75c;
extern unsigned short g_f0e75e;

long long sub_112d0c(void)
{
    unsigned long v0;  // x0

    g_f0e758 = 52693;
    g_f0e75a = 60988;
    g_f0e75c = 43627;
    g_f0e75e = 11202;
    g_f01880 = g_f0e758 ^ g_f01880;
    g_f01882 = g_f0e75a ^ g_f01882;
    g_f01884 = g_f0e75c ^ g_f01884;
    g_f01886 = g_f0e75e ^ g_f01886;
    g_f01918 = g_f01918 ^ 3153270069647953365;
    return v0;
}
