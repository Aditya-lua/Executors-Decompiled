/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13c1cc..0x13c264 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01b68;
extern unsigned short g_f01b6a;
extern unsigned short g_f01b6c;
extern unsigned short g_f01b6e;
extern unsigned long long g_f01c68;
extern unsigned short g_f0eea0;
extern unsigned short g_f0eea2;
extern unsigned short g_f0eea4;
extern unsigned short g_f0eea6;

long long sub_13c1cc(void)
{
    unsigned long v0;  // x0

    g_f0eea0 = 32235;
    g_f0eea2 = 63879;
    g_f0eea4 = 46581;
    g_f0eea6 = 12585;
    g_f01b68 = g_f0eea0 ^ g_f01b68;
    g_f01b6a = g_f0eea2 ^ g_f01b6a;
    g_f01b6c = g_f0eea4 ^ g_f01b6c;
    g_f01b6e = g_f0eea6 ^ g_f01b6e;
    g_f01c68 = g_f01c68 ^ 3542562649961627115;
    return v0;
}
