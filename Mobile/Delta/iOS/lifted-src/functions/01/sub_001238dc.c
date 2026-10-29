/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1238dc..0x123974 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f019a8;
extern unsigned short g_f019aa;
extern unsigned short g_f019ac;
extern unsigned short g_f019ae;
extern unsigned long long g_f01a90;
extern unsigned short g_f0ea48;
extern unsigned short g_f0ea4a;
extern unsigned short g_f0ea4c;
extern unsigned short g_f0ea4e;

long long sub_1238dc(void)
{
    unsigned long v0;  // x0

    g_f0ea48 = 35616;
    g_f0ea4a = 2747;
    g_f0ea4c = 64534;
    g_f0ea4e = 25141;
    g_f019a8 = g_f0ea48 ^ g_f019a8;
    g_f019aa = g_f0ea4a ^ g_f019aa;
    g_f019ac = g_f0ea4c ^ g_f019ac;
    g_f019ae = g_f0ea4e ^ g_f019ae;
    g_f01a90 = g_f01a90 ^ 7076839561082145568;
    return v0;
}
