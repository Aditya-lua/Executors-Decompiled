/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x15dba4..0x15dc3c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01ec8;
extern unsigned short g_f01eca;
extern unsigned short g_f01ecc;
extern unsigned short g_f01ece;
extern unsigned long long g_f01f28;
extern unsigned short g_f0f970;
extern unsigned short g_f0f972;
extern unsigned short g_f0f974;
extern unsigned short g_f0f976;

long long sub_15dba4(void)
{
    unsigned long v0;  // x0

    g_f0f970 = 29571;
    g_f0f972 = 22367;
    g_f0f974 = 11954;
    g_f0f976 = 58587;
    g_f01ec8 = g_f0f970 ^ g_f01ec8;
    g_f01eca = g_f0f972 ^ g_f01eca;
    g_f01ecc = g_f0f974 ^ g_f01ecc;
    g_f01ece = g_f0f976 ^ g_f01ece;
    g_f01f28 = g_f01f28 ^ 16490825804052132739;
    return v0;
}
