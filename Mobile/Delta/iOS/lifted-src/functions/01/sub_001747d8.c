/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1747d8..0x174870 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02010;
extern unsigned short g_f02012;
extern unsigned short g_f02014;
extern unsigned short g_f02016;
extern unsigned long long g_f02098;
extern unsigned short g_f0fd60;
extern unsigned short g_f0fd62;
extern unsigned short g_f0fd64;
extern unsigned short g_f0fd66;

long long sub_1747d8(void)
{
    unsigned long v0;  // x0

    g_f0fd60 = 46652;
    g_f0fd62 = 43777;
    g_f0fd64 = 31581;
    g_f0fd66 = 1412;
    g_f02010 = g_f0fd60 ^ g_f02010;
    g_f02012 = g_f0fd62 ^ g_f02012;
    g_f02014 = g_f0fd64 ^ g_f02014;
    g_f02016 = g_f0fd66 ^ g_f02016;
    g_f02098 = g_f02098 ^ 397578309346637372;
    return v0;
}
