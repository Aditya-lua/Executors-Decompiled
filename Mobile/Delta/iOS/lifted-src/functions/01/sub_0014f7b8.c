/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x14f7b8..0x14f850 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01df8;
extern unsigned short g_f01dfa;
extern unsigned short g_f01dfc;
extern unsigned short g_f01dfe;
extern unsigned long long g_f01e48;
extern unsigned short g_f0f7b8;
extern unsigned short g_f0f7ba;
extern unsigned short g_f0f7bc;
extern unsigned short g_f0f7be;

long long sub_14f7b8(void)
{
    unsigned long v0;  // x0

    g_f0f7b8 = 58812;
    g_f0f7ba = 4065;
    g_f0f7bc = 20295;
    g_f0f7be = 29308;
    g_f01df8 = g_f0f7b8 ^ g_f01df8;
    g_f01dfa = g_f0f7ba ^ g_f01dfa;
    g_f01dfc = g_f0f7bc ^ g_f01dfc;
    g_f01dfe = g_f0f7be ^ g_f01dfe;
    g_f01e48 = g_f01e48 ^ 8249555784063641020;
    return v0;
}
