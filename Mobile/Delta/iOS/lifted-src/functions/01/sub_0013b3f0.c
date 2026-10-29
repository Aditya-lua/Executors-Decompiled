/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13b3f0..0x13b488 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01ba8;
extern unsigned short g_f01baa;
extern unsigned short g_f01bac;
extern unsigned short g_f01bae;
extern unsigned long long g_f01ca8;
extern unsigned short g_f0eee0;
extern unsigned short g_f0eee2;
extern unsigned short g_f0eee4;
extern unsigned short g_f0eee6;

long long sub_13b3f0(void)
{
    unsigned long v0;  // x0

    g_f0eee0 = 23286;
    g_f0eee2 = 60035;
    g_f0eee4 = 44015;
    g_f0eee6 = 1429;
    g_f01ba8 = g_f0eee0 ^ g_f01ba8;
    g_f01baa = g_f0eee2 ^ g_f01baa;
    g_f01bac = g_f0eee4 ^ g_f01bac;
    g_f01bae = g_f0eee6 ^ g_f01bae;
    g_f01ca8 = g_f01ca8 ^ 402416788639537910;
    return v0;
}
