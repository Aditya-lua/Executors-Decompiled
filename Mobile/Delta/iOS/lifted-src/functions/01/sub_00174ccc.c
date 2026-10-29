/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x174ccc..0x174d64 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02078;
extern unsigned short g_f0207a;
extern unsigned short g_f0207c;
extern unsigned short g_f0207e;
extern unsigned long long g_f02100;
extern unsigned short g_f0fdc8;
extern unsigned short g_f0fdca;
extern unsigned short g_f0fdcc;
extern unsigned short g_f0fdce;

long long sub_174ccc(void)
{
    unsigned long v0;  // x0

    g_f0fdc8 = 63671;
    g_f0fdca = 1148;
    g_f0fdcc = 60176;
    g_f0fdce = 48819;
    g_f02078 = g_f0fdc8 ^ g_f02078;
    g_f0207a = g_f0fdca ^ g_f0207a;
    g_f0207c = g_f0fdcc ^ g_f0207c;
    g_f0207e = g_f0fdce ^ g_f0207e;
    g_f02100 = g_f02100 ^ 13741585342064818359;
    return v0;
}
