/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d38b8..0x1d3950 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02530;
extern unsigned short g_f02532;
extern unsigned short g_f02534;
extern unsigned short g_f02536;
extern unsigned long long g_f025f8;
extern unsigned short g_f107e8;
extern unsigned short g_f107ea;
extern unsigned short g_f107ec;
extern unsigned short g_f107ee;

long long sub_1d38b8(void)
{
    unsigned long v0;  // x0

    g_f107e8 = 26782;
    g_f107ea = 40153;
    g_f107ec = 44537;
    g_f107ee = 34857;
    g_f02530 = g_f107e8 ^ g_f02530;
    g_f02532 = g_f107ea ^ g_f02532;
    g_f02534 = g_f107ec ^ g_f02534;
    g_f02536 = g_f107ee ^ g_f02536;
    g_f025f8 = g_f025f8 ^ 9811564550793291934;
    return v0;
}
