/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x174a6c..0x174b04 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02038;
extern unsigned short g_f0203a;
extern unsigned short g_f0203c;
extern unsigned short g_f0203e;
extern unsigned long long g_f020c0;
extern unsigned short g_f0fd88;
extern unsigned short g_f0fd8a;
extern unsigned short g_f0fd8c;
extern unsigned short g_f0fd8e;

long long sub_174a6c(void)
{
    unsigned long v0;  // x0

    g_f0fd88 = 50188;
    g_f0fd8a = 52927;
    g_f0fd8c = 62749;
    g_f0fd8e = 59975;
    g_f02038 = g_f0fd88 ^ g_f02038;
    g_f0203a = g_f0fd8a ^ g_f0203a;
    g_f0203c = g_f0fd8c ^ g_f0203c;
    g_f0203e = g_f0fd8e ^ g_f0203e;
    g_f020c0 = g_f020c0 ^ 0xea47f51dcebfc40c;
    return v0;
}
