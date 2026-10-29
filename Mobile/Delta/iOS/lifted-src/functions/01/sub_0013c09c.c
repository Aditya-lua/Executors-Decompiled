/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13c09c..0x13c134 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01bd0;
extern unsigned short g_f01bd2;
extern unsigned short g_f01bd4;
extern unsigned short g_f01bd6;
extern unsigned long long g_f01cd0;
extern unsigned short g_f0ef08;
extern unsigned short g_f0ef0a;
extern unsigned short g_f0ef0c;
extern unsigned short g_f0ef0e;

long long sub_13c09c(void)
{
    unsigned long v0;  // x0

    g_f0ef08 = 10486;
    g_f0ef0a = 35141;
    g_f0ef0c = 9643;
    g_f0ef0e = 59993;
    g_f01bd0 = g_f0ef08 ^ g_f01bd0;
    g_f01bd2 = g_f0ef0a ^ g_f01bd2;
    g_f01bd4 = g_f0ef0c ^ g_f01bd4;
    g_f01bd6 = g_f0ef0e ^ g_f01bd6;
    g_f01cd0 = g_f01cd0 ^ 16886569696475031798;
    return v0;
}
