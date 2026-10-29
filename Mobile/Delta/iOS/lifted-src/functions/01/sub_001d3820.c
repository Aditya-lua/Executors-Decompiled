/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d3820..0x1d38b8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02560;
extern unsigned short g_f02562;
extern unsigned short g_f02564;
extern unsigned short g_f02566;
extern unsigned long long g_f02628;
extern unsigned short g_f10818;
extern unsigned short g_f1081a;
extern unsigned short g_f1081c;
extern unsigned short g_f1081e;

long long sub_1d3820(void)
{
    unsigned long v0;  // x0

    g_f10818 = 24114;
    g_f1081a = 26187;
    g_f1081c = 42617;
    g_f1081e = 26490;
    g_f02560 = g_f10818 ^ g_f02560;
    g_f02562 = g_f1081a ^ g_f02562;
    g_f02564 = g_f1081c ^ g_f02564;
    g_f02566 = g_f1081e ^ g_f02566;
    g_f02628 = g_f02628 ^ 7456455173402746418;
    return v0;
}
