/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x18c9e0..0x18ca78 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02208;
extern unsigned short g_f0220a;
extern unsigned short g_f0220c;
extern unsigned short g_f0220e;
extern unsigned long long g_f02318;
extern unsigned short g_f10140;
extern unsigned short g_f10142;
extern unsigned short g_f10144;
extern unsigned short g_f10146;

long long sub_18c9e0(void)
{
    unsigned long v0;  // x0

    g_f10140 = 50094;
    g_f10142 = 46394;
    g_f10144 = 44157;
    g_f10146 = 44630;
    g_f02208 = g_f10140 ^ g_f02208;
    g_f0220a = g_f10142 ^ g_f0220a;
    g_f0220c = g_f10144 ^ g_f0220c;
    g_f0220e = g_f10146 ^ g_f0220e;
    g_f02318 = g_f02318 ^ 12562417866507994030;
    return v0;
}
