/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x11365c..0x1136f4 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01850;
extern unsigned short g_f01852;
extern unsigned short g_f01854;
extern unsigned short g_f01856;
extern unsigned long long g_f018e8;
extern unsigned short g_f0e728;
extern unsigned short g_f0e72a;
extern unsigned short g_f0e72c;
extern unsigned short g_f0e72e;

long long sub_11365c(void)
{
    unsigned long v0;  // x0

    g_f0e728 = 46945;
    g_f0e72a = 21394;
    g_f0e72c = 45548;
    g_f0e72e = 19569;
    g_f01850 = g_f0e728 ^ g_f01850;
    g_f01852 = g_f0e72a ^ g_f01852;
    g_f01854 = g_f0e72c ^ g_f01854;
    g_f01856 = g_f0e72e ^ g_f01856;
    g_f018e8 = g_f018e8 ^ 5508379447823349601;
    return v0;
}
