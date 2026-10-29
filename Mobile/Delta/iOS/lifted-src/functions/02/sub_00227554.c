/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x227554..0x2275ec (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02c18;
extern unsigned short g_f02c1a;
extern unsigned short g_f02c1c;
extern unsigned short g_f02c1e;
extern unsigned long long g_f02ca8;
extern unsigned short g_f11578;
extern unsigned short g_f1157a;
extern unsigned short g_f1157c;
extern unsigned short g_f1157e;

long long sub_227554(void)
{
    unsigned long v0;  // x0

    g_f11578 = 42719;
    g_f1157a = 22248;
    g_f1157c = 6458;
    g_f1157e = 54352;
    g_f02c18 = g_f11578 ^ g_f02c18;
    g_f02c1a = g_f1157a ^ g_f02c1a;
    g_f02c1c = g_f1157c ^ g_f02c1c;
    g_f02c1e = g_f1157e ^ g_f02c1e;
    g_f02ca8 = g_f02ca8 ^ 15298755672534460127;
    return v0;
}
