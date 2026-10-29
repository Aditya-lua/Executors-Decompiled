/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x164170..0x164208 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01f68;
extern unsigned short g_f01f6a;
extern unsigned short g_f01f6c;
extern unsigned short g_f01f6e;
extern unsigned long long g_f01fc0;
extern unsigned short g_f0fb70;
extern unsigned short g_f0fb72;
extern unsigned short g_f0fb74;
extern unsigned short g_f0fb76;

long long sub_164170(void)
{
    unsigned long v0;  // x0

    g_f0fb70 = 43782;
    g_f0fb72 = 31158;
    g_f0fb74 = 5546;
    g_f0fb76 = 30697;
    g_f01f68 = g_f0fb70 ^ g_f01f68;
    g_f01f6a = g_f0fb72 ^ g_f01f6a;
    g_f01f6c = g_f0fb74 ^ g_f01f6c;
    g_f01f6e = g_f0fb76 ^ g_f01f6e;
    g_f01fc0 = g_f01fc0 ^ 8640461182017645318;
    return v0;
}
