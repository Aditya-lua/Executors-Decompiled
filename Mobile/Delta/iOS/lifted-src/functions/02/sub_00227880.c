/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x227880..0x227918 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02c08;
extern unsigned short g_f02c0a;
extern unsigned short g_f02c0c;
extern unsigned short g_f02c0e;
extern unsigned long long g_f02c98;
extern unsigned short g_f11568;
extern unsigned short g_f1156a;
extern unsigned short g_f1156c;
extern unsigned short g_f1156e;

long long sub_227880(void)
{
    unsigned long v0;  // x0

    g_f11568 = 0x7f98;
    g_f1156a = 59047;
    g_f1156c = 7096;
    g_f1156e = 57141;
    g_f02c08 = g_f11568 ^ g_f02c08;
    g_f02c0a = g_f1156a ^ g_f02c0a;
    g_f02c0c = g_f1156c ^ g_f02c0c;
    g_f02c0e = g_f1156e ^ g_f02c0e;
    g_f02c98 = g_f02c98 ^ 0xdf351bb8e6a77f98;
    return v0;
}
