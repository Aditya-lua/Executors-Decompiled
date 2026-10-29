/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13b948..0x13b9e0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01b60;
extern unsigned short g_f01b62;
extern unsigned short g_f01b64;
extern unsigned short g_f01b66;
extern unsigned long long g_f01c60;
extern unsigned short g_f0ee98;
extern unsigned short g_f0ee9a;
extern unsigned short g_f0ee9c;
extern unsigned short g_f0ee9e;

long long sub_13b948(void)
{
    unsigned long v0;  // x0

    g_f0ee98 = 53832;
    g_f0ee9a = 0xb2ff;
    g_f0ee9c = 14132;
    g_f0ee9e = 13980;
    g_f01b60 = g_f0ee98 ^ g_f01b60;
    g_f01b62 = g_f0ee9a ^ g_f01b62;
    g_f01b64 = g_f0ee9c ^ g_f01b64;
    g_f01b66 = g_f0ee9e ^ g_f01b66;
    g_f01c60 = g_f01c60 ^ 0x369c3734b2ffd248;
    return v0;
}
