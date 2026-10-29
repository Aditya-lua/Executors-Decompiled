/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x228070..0x228108 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02bb8;
extern unsigned short g_f02bba;
extern unsigned short g_f02bbc;
extern unsigned short g_f02bbe;
extern unsigned long long g_f02c48;
extern unsigned short g_f11518;
extern unsigned short g_f1151a;
extern unsigned short g_f1151c;
extern unsigned short g_f1151e;

long long sub_228070(void)
{
    unsigned long v0;  // x0

    g_f11518 = 57415;
    g_f1151a = 22818;
    g_f1151c = 10307;
    g_f1151e = 5550;
    g_f02bb8 = g_f11518 ^ g_f02bb8;
    g_f02bba = g_f1151a ^ g_f02bba;
    g_f02bbc = g_f1151c ^ g_f02bbc;
    g_f02bbe = g_f1151e ^ g_f02bbe;
    g_f02c48 = g_f02c48 ^ 1562230390467518535;
    return v0;
}
