/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x217e60..0x217ef8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02b38;
extern unsigned short g_f02b3a;
extern unsigned short g_f02b3c;
extern unsigned short g_f02b3e;
extern unsigned long long g_f02b40;
extern unsigned short g_f11440;
extern unsigned short g_f11442;
extern unsigned short g_f11444;
extern unsigned short g_f11446;

long long sub_217e60(void)
{
    unsigned long v0;  // x0

    g_f11440 = 55730;
    g_f11442 = 12092;
    g_f11444 = 15438;
    g_f11446 = 27862;
    g_f02b38 = g_f11440 ^ g_f02b38;
    g_f02b3a = g_f11442 ^ g_f02b3a;
    g_f02b3c = g_f11444 ^ g_f02b3c;
    g_f02b3e = g_f11446 ^ g_f02b3e;
    g_f02b40 = g_f02b40 ^ 7842522107609930162;
    return v0;
}
