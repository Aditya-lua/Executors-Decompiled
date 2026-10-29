/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x15d098..0x15d130 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01eb0;
extern unsigned short g_f01eb2;
extern unsigned short g_f01eb4;
extern unsigned short g_f01eb6;
extern unsigned long long g_f01f10;
extern unsigned short g_f0f958;
extern unsigned short g_f0f95a;
extern unsigned short g_f0f95c;
extern unsigned short g_f0f95e;

long long sub_15d098(void)
{
    unsigned long v0;  // x0

    g_f0f958 = 16713;
    g_f0f95a = 38933;
    g_f0f95c = 45680;
    g_f0f95e = 62770;
    g_f01eb0 = g_f0f958 ^ g_f01eb0;
    g_f01eb2 = g_f0f95a ^ g_f01eb2;
    g_f01eb4 = g_f0f95c ^ g_f01eb4;
    g_f01eb6 = g_f0f95e ^ g_f01eb6;
    g_f01f10 = g_f01f10 ^ 17668380484785488201;
    return v0;
}
