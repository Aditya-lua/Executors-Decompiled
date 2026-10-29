/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x124094..0x12412c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f019c8;
extern unsigned short g_f019ca;
extern unsigned short g_f019cc;
extern unsigned short g_f019ce;
extern unsigned long long g_f01ab0;
extern unsigned short g_f0ea68;
extern unsigned short g_f0ea6a;
extern unsigned short g_f0ea6c;
extern unsigned short g_f0ea6e;

long long sub_124094(void)
{
    unsigned long v0;  // x0

    g_f0ea68 = 48574;
    g_f0ea6a = 42649;
    g_f0ea6c = 63248;
    g_f0ea6e = 19563;
    g_f019c8 = g_f0ea68 ^ g_f019c8;
    g_f019ca = g_f0ea6a ^ g_f019ca;
    g_f019cc = g_f0ea6c ^ g_f019cc;
    g_f019ce = g_f0ea6e ^ g_f019ce;
    g_f01ab0 = g_f01ab0 ^ 5506766620277194174;
    return v0;
}
