/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13b780..0x13b818 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01bb8;
extern unsigned short g_f01bba;
extern unsigned short g_f01bbc;
extern unsigned short g_f01bbe;
extern unsigned long long g_f01cb8;
extern unsigned short g_f0eef0;
extern unsigned short g_f0eef2;
extern unsigned short g_f0eef4;
extern unsigned short g_f0eef6;

long long sub_13b780(void)
{
    unsigned long v0;  // x0

    g_f0eef0 = 39212;
    g_f0eef2 = 19971;
    g_f0eef4 = 43369;
    g_f0eef6 = 64176;
    g_f01bb8 = g_f0eef0 ^ g_f01bb8;
    g_f01bba = g_f0eef2 ^ g_f01bba;
    g_f01bbc = g_f0eef4 ^ g_f01bbc;
    g_f01bbe = g_f0eef6 ^ g_f01bbe;
    g_f01cb8 = g_f01cb8 ^ 18064124375128578348;
    return v0;
}
