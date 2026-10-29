/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x123aa4..0x123b3c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01950;
extern unsigned short g_f01952;
extern unsigned short g_f01954;
extern unsigned short g_f01956;
extern unsigned long long g_f01a38;
extern unsigned short g_f0e9f0;
extern unsigned short g_f0e9f2;
extern unsigned short g_f0e9f4;
extern unsigned short g_f0e9f6;

long long sub_123aa4(void)
{
    unsigned long v0;  // x0

    g_f0e9f0 = 19404;
    g_f0e9f2 = 29856;
    g_f0e9f4 = 35295;
    g_f0e9f6 = 40481;
    g_f01950 = g_f0e9f0 ^ g_f01950;
    g_f01952 = g_f0e9f2 ^ g_f01952;
    g_f01954 = g_f0e9f4 ^ g_f01954;
    g_f01956 = g_f0e9f6 ^ g_f01956;
    g_f01a38 = g_f01a38 ^ 11394540125051440076;
    return v0;
}
