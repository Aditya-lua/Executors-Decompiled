/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1236e0..0x123778 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f019d8;
extern unsigned short g_f019da;
extern unsigned short g_f019dc;
extern unsigned short g_f019de;
extern unsigned long long g_f01ac0;
extern unsigned short g_f0ea78;
extern unsigned short g_f0ea7a;
extern unsigned short g_f0ea7c;
extern unsigned short g_f0ea7e;

long long sub_1236e0(void)
{
    unsigned long v0;  // x0

    g_f0ea78 = 30068;
    g_f0ea7a = 38697;
    g_f0ea7c = 62611;
    g_f0ea7e = 16774;
    g_f019d8 = g_f0ea78 ^ g_f019d8;
    g_f019da = g_f0ea7a ^ g_f019da;
    g_f019dc = g_f0ea7c ^ g_f019dc;
    g_f019de = g_f0ea7e ^ g_f019de;
    g_f01ac0 = g_f01ac0 ^ 4721730174077990260;
    return v0;
}
