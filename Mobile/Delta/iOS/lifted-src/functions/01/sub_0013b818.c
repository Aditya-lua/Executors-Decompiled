/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13b818..0x13b8b0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01b70;
extern unsigned short g_f01b72;
extern unsigned short g_f01b74;
extern unsigned short g_f01b76;
extern unsigned long long g_f01c70;
extern unsigned short g_f0eea8;
extern unsigned short g_f0eeaa;
extern unsigned short g_f0eeac;
extern unsigned short g_f0eeae;

long long sub_13b818(void)
{
    unsigned long v0;  // x0

    g_f0eea8 = 40238;
    g_f0eeaa = 34510;
    g_f0eeac = 13490;
    g_f0eeae = 11191;
    g_f01b70 = g_f0eea8 ^ g_f01b70;
    g_f01b72 = g_f0eeaa ^ g_f01b72;
    g_f01b74 = g_f0eeac ^ g_f01b74;
    g_f01b76 = g_f0eeae ^ g_f01b76;
    g_f01c70 = g_f01c70 ^ 3150044405739461934;
    return v0;
}
