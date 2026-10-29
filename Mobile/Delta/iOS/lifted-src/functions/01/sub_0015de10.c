/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x15de10..0x15dea8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01eb8;
extern unsigned short g_f01eba;
extern unsigned short g_f01ebc;
extern unsigned short g_f01ebe;
extern unsigned long long g_f01f18;
extern unsigned short g_f0f960;
extern unsigned short g_f0f962;
extern unsigned short g_f0f964;
extern unsigned short g_f0f966;

long long sub_15de10(void)
{
    unsigned long v0;  // x0

    g_f0f960 = 45292;
    g_f0f962 = 57900;
    g_f0f964 = 0x3131;
    g_f0f966 = 61376;
    g_f01eb8 = g_f0f960 ^ g_f01eb8;
    g_f01eba = g_f0f962 ^ g_f01eba;
    g_f01ebc = g_f0f964 ^ g_f01ebc;
    g_f01ebe = g_f0f966 ^ g_f01ebe;
    g_f01f18 = g_f01f18 ^ 17275862260910960876;
    return v0;
}
