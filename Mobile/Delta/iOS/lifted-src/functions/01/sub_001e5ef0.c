/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1e5ef0..0x1e5f88 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f026d8;
extern unsigned short g_f026da;
extern unsigned short g_f026dc;
extern unsigned short g_f026de;
extern unsigned long long g_f02708;
extern unsigned short g_f10c08;
extern unsigned short g_f10c0a;
extern unsigned short g_f10c0c;
extern unsigned short g_f10c0e;

long long sub_1e5ef0(void)
{
    unsigned long v0;  // x0

    g_f10c08 = 26127;
    g_f10c0a = 51426;
    g_f10c0c = 60317;
    g_f10c0e = 26484;
    g_f026d8 = g_f10c08 ^ g_f026d8;
    g_f026da = g_f10c0a ^ g_f026da;
    g_f026dc = g_f10c0c ^ g_f026dc;
    g_f026de = g_f10c0e ^ g_f026de;
    g_f02708 = g_f02708 ^ 7454842346117686799;
    return v0;
}
