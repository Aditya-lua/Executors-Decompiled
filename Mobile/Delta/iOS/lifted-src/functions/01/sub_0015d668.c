/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x15d668..0x15d700 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01ea8;
extern unsigned short g_f01eaa;
extern unsigned short g_f01eac;
extern unsigned short g_f01eae;
extern unsigned long long g_f01f08;
extern unsigned short g_f0f950;
extern unsigned short g_f0f952;
extern unsigned short g_f0f954;
extern unsigned short g_f0f956;

long long sub_15d668(void)
{
    unsigned long v0;  // x0

    g_f0f950 = 61750;
    g_f0f952 = 0x13fd;
    g_f0f954 = 13232;
    g_f0f956 = 64165;
    g_f01ea8 = g_f0f950 ^ g_f01ea8;
    g_f01eaa = g_f0f952 ^ g_f01eaa;
    g_f01eac = g_f0f954 ^ g_f01eac;
    g_f01eae = g_f0f956 ^ g_f01eae;
    g_f01f08 = g_f01f08 ^ 0xfaa533b013fdf136;
    return v0;
}
