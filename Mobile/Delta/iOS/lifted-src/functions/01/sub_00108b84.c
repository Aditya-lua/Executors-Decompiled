/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x108b84..0x108c1c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f015c0;
extern unsigned short g_f015c2;
extern unsigned short g_f015c4;
extern unsigned short g_f015c6;
extern unsigned long long g_f01700;
extern unsigned short g_f0e0d8;
extern unsigned short g_f0e0da;
extern unsigned short g_f0e0dc;
extern unsigned short g_f0e0de;

long long sub_108b84(void)
{
    unsigned long v0;  // x0

    g_f0e0d8 = 44592;
    g_f0e0da = 23582;
    g_f0e0dc = 6302;
    g_f0e0de = 2847;
    g_f015c0 = g_f0e0d8 ^ g_f015c0;
    g_f015c2 = g_f0e0da ^ g_f015c2;
    g_f015c4 = g_f0e0dc ^ g_f015c4;
    g_f015c6 = g_f0e0de ^ g_f015c6;
    g_f01700 = g_f01700 ^ 801386327124651568;
    return v0;
}
