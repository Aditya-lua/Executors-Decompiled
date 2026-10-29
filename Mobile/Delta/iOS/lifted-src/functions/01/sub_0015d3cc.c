/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x15d3cc..0x15d464 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01e90;
extern unsigned short g_f01e92;
extern unsigned short g_f01e94;
extern unsigned short g_f01e96;
extern unsigned long long g_f01ef0;
extern unsigned short g_f0f938;
extern unsigned short g_f0f93a;
extern unsigned short g_f0f93c;
extern unsigned short g_f0f93e;

long long sub_15d3cc(void)
{
    unsigned long v0;  // x0

    g_f0f938 = 33436;
    g_f0f93a = 53546;
    g_f0f93c = 46969;
    g_f0f93e = 2812;
    g_f01e90 = g_f0f938 ^ g_f01e90;
    g_f01e92 = g_f0f93a ^ g_f01e92;
    g_f01e94 = g_f0f93c ^ g_f01e94;
    g_f01e96 = g_f0f93e ^ g_f01e96;
    g_f01ef0 = g_f01ef0 ^ 791709368338514588;
    return v0;
}
