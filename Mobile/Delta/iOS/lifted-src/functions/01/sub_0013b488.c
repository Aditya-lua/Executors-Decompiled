/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13b488..0x13b520 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01bb0;
extern unsigned short g_f01bb2;
extern unsigned short g_f01bb4;
extern unsigned short g_f01bb6;
extern unsigned long long g_f01cb0;
extern unsigned short g_f0eee8;
extern unsigned short g_f0eeea;
extern unsigned short g_f0eeec;
extern unsigned short g_f0eeee;

long long sub_13b488(void)
{
    unsigned long v0;  // x0

    g_f0eee8 = 16009;
    g_f0eeea = 12739;
    g_f0eeec = 10927;
    g_f0eeee = 35;
    g_f01bb0 = g_f0eee8 ^ g_f01bb0;
    g_f01bb2 = g_f0eeea ^ g_f01bb2;
    g_f01bb4 = g_f0eeec ^ g_f01bb4;
    g_f01bb6 = g_f0eeee ^ g_f01bb6;
    g_f01cb0 = g_f01cb0 ^ 9898556127395465;
    return v0;
}
