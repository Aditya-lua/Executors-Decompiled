/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1fd720..0x1fd7b8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f028f0;
extern unsigned short g_f028f2;
extern unsigned short g_f028f4;
extern unsigned short g_f028f6;
extern unsigned long long g_f02900;
extern unsigned short g_f10ee8;
extern unsigned short g_f10eea;
extern unsigned short g_f10eec;
extern unsigned short g_f10eee;

long long sub_1fd720(void)
{
    unsigned long v0;  // x0

    g_f10ee8 = 46478;
    g_f10eea = 3468;
    g_f10eec = 6064;
    g_f10eee = 64125;
    g_f028f0 = g_f10ee8 ^ g_f028f0;
    g_f028f2 = g_f10eea ^ g_f028f2;
    g_f028f4 = g_f10eec ^ g_f028f4;
    g_f028f6 = g_f10eee ^ g_f028f6;
    g_f02900 = g_f02900 ^ 18049608926479824270;
    return v0;
}
