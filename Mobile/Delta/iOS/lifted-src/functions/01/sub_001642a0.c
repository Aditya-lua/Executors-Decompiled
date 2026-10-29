/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1642a0..0x164338 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01f70;
extern unsigned short g_f01f72;
extern unsigned short g_f01f74;
extern unsigned short g_f01f76;
extern unsigned long long g_f01fc8;
extern unsigned short g_f0fb78;
extern unsigned short g_f0fb7a;
extern unsigned short g_f0fb7c;
extern unsigned short g_f0fb7e;

long long sub_1642a0(void)
{
    unsigned long v0;  // x0

    g_f0fb78 = 0xcff9;
    g_f0fb7a = 41502;
    g_f0fb7c = 37994;
    g_f0fb7e = 29302;
    g_f01f70 = g_f0fb78 ^ g_f01f70;
    g_f01f72 = g_f0fb7a ^ g_f01f72;
    g_f01f74 = g_f0fb7c ^ g_f01f74;
    g_f01f76 = g_f0fb7e ^ g_f01f76;
    g_f01fc8 = g_f01fc8 ^ 0x7276946aa21ecff9;
    return v0;
}
