/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d4304..0x1d439c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f025b0;
extern unsigned short g_f025b2;
extern unsigned short g_f025b4;
extern unsigned short g_f025b6;
extern unsigned long long g_f02678;
extern unsigned short g_f10868;
extern unsigned short g_f1086a;
extern unsigned short g_f1086c;
extern unsigned short g_f1086e;

long long sub_1d4304(void)
{
    unsigned long v0;  // x0

    g_f10868 = 41556;
    g_f1086a = 86;
    g_f1086c = 39413;
    g_f1086e = 12545;
    g_f025b0 = g_f10868 ^ g_f025b0;
    g_f025b2 = g_f1086a ^ g_f025b2;
    g_f025b4 = g_f1086c ^ g_f025b4;
    g_f025b6 = g_f1086e ^ g_f025b6;
    g_f02678 = g_f02678 ^ 3531272860386894420;
    return v0;
}
