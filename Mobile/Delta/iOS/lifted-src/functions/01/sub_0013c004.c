/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13c004..0x13c09c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01b80;
extern unsigned short g_f01b82;
extern unsigned short g_f01b84;
extern unsigned short g_f01b86;
extern unsigned long long g_f01c80;
extern unsigned short g_f0eeb8;
extern unsigned short g_f0eeba;
extern unsigned short g_f0eebc;
extern unsigned short g_f0eebe;

long long sub_13c004(void)
{
    unsigned long v0;  // x0

    g_f0eeb8 = 37909;
    g_f0eeba = 46657;
    g_f0eebc = 12851;
    g_f0eebe = 8402;
    g_f01b80 = g_f0eeb8 ^ g_f01b80;
    g_f01b82 = g_f0eeba ^ g_f01b82;
    g_f01b84 = g_f0eebc ^ g_f01b84;
    g_f01b86 = g_f0eebe ^ g_f01b86;
    g_f01c80 = g_f01c80 ^ 2365007952005403669;
    return v0;
}
