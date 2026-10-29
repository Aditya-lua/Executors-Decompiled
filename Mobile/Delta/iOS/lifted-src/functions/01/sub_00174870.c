/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x174870..0x174908 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02048;
extern unsigned short g_f0204a;
extern unsigned short g_f0204c;
extern unsigned short g_f0204e;
extern unsigned long long g_f020d0;
extern unsigned short g_f0fd98;
extern unsigned short g_f0fd9a;
extern unsigned short g_f0fd9c;
extern unsigned short g_f0fd9e;

long long sub_174870(void)
{
    unsigned long v0;  // x0

    g_f0fd98 = 44387;
    g_f0fd9a = 35534;
    g_f0fd9c = 62111;
    g_f0fd9e = 57186;
    g_f02048 = g_f0fd98 ^ g_f02048;
    g_f0204a = g_f0fd9a ^ g_f0204a;
    g_f0204c = g_f0fd9c ^ g_f0204c;
    g_f0204e = g_f0fd9e ^ g_f0204e;
    g_f020d0 = g_f020d0 ^ 16096694785218096483;
    return v0;
}
