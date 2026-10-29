/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d3c48..0x1d3ce0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02548;
extern unsigned short g_f0254a;
extern unsigned short g_f0254c;
extern unsigned short g_f0254e;
extern unsigned long long g_f02610;
extern unsigned short g_f10800;
extern unsigned short g_f10802;
extern unsigned short g_f10804;
extern unsigned short g_f10806;

long long sub_1d3c48(void)
{
    unsigned long v0;  // x0

    g_f10800 = 27464;
    g_f10802 = 41736;
    g_f10804 = 10815;
    g_f10806 = 30674;
    g_f02548 = g_f10800 ^ g_f02548;
    g_f0254a = g_f10802 ^ g_f0254a;
    g_f0254c = g_f10804 ^ g_f0254c;
    g_f0254e = g_f10806 ^ g_f0254e;
    g_f02610 = g_f02610 ^ 8634009888429206344;
    return v0;
}
