/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x174f2c..0x174fc4 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02080;
extern unsigned short g_f02082;
extern unsigned short g_f02084;
extern unsigned short g_f02086;
extern unsigned long long g_f02108;
extern unsigned short g_f0fdd0;
extern unsigned short g_f0fdd2;
extern unsigned short g_f0fdd4;
extern unsigned short g_f0fdd6;

long long sub_174f2c(void)
{
    unsigned long v0;  // x0

    g_f0fdd0 = 18474;
    g_f0fdd2 = 38555;
    g_f0fdd4 = 27088;
    g_f0fdd6 = 47425;
    g_f02080 = g_f0fdd0 ^ g_f02080;
    g_f02082 = g_f0fdd2 ^ g_f02082;
    g_f02084 = g_f0fdd4 ^ g_f02084;
    g_f02086 = g_f0fdd6 ^ g_f02086;
    g_f02108 = g_f02108 ^ 13349067115103733802;
    return v0;
}
