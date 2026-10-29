/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x164208..0x1642a0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01f78;
extern unsigned short g_f01f7a;
extern unsigned short g_f01f7c;
extern unsigned short g_f01f7e;
extern unsigned long long g_f01fd0;
extern unsigned short g_f0fb80;
extern unsigned short g_f0fb82;
extern unsigned short g_f0fb84;
extern unsigned short g_f0fb86;

long long sub_164208(void)
{
    unsigned long v0;  // x0

    g_f0fb80 = 19036;
    g_f0fb82 = 62582;
    g_f0fb84 = 4907;
    g_f0fb86 = 27908;
    g_f01f78 = g_f0fb80 ^ g_f01f78;
    g_f01f7a = g_f0fb82 ^ g_f01f7a;
    g_f01f7c = g_f0fb84 ^ g_f01f7c;
    g_f01f7e = g_f0fb86 ^ g_f01f7e;
    g_f01fd0 = g_f01fd0 ^ 7855424729546902108;
    return v0;
}
