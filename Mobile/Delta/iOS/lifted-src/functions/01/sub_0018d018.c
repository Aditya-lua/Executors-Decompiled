/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x18d018..0x18d0b0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02140;
extern unsigned short g_f02142;
extern unsigned short g_f02144;
extern unsigned short g_f02146;
extern unsigned long long g_f02250;
extern unsigned short g_f10078;
extern unsigned short g_f1007a;
extern unsigned short g_f1007c;
extern unsigned short g_f1007e;

long long sub_18d018(void)
{
    unsigned long v0;  // x0

    g_f10078 = 65146;
    g_f1007a = 59539;
    g_f1007c = 19398;
    g_f1007e = 13957;
    g_f02140 = g_f10078 ^ g_f02140;
    g_f02142 = g_f1007a ^ g_f02142;
    g_f02144 = g_f1007c ^ g_f02144;
    g_f02146 = g_f1007e ^ g_f02146;
    g_f02250 = g_f02250 ^ 0x36854bc6e893fe7a;
    return v0;
}
