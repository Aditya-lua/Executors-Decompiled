/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x18bb34..0x18bbcc (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02118;
extern unsigned short g_f0211a;
extern unsigned short g_f0211c;
extern unsigned short g_f0211e;
extern unsigned long long g_f02228;
extern unsigned short g_f10050;
extern unsigned short g_f10052;
extern unsigned short g_f10054;
extern unsigned short g_f10056;

long long sub_18bb34(void)
{
    unsigned long v0;  // x0

    g_f10050 = 12394;
    g_f10052 = 51541;
    g_f10054 = 53768;
    g_f10056 = 20929;
    g_f02118 = g_f10050 ^ g_f02118;
    g_f0211a = g_f10052 ^ g_f0211a;
    g_f0211c = g_f10054 ^ g_f0211c;
    g_f0211e = g_f10056 ^ g_f0211e;
    g_f02228 = g_f02228 ^ 5891220722756694122;
    return v0;
}
