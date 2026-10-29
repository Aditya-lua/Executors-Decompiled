/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13bda4..0x13be3c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01be0;
extern unsigned short g_f01be2;
extern unsigned short g_f01be4;
extern unsigned short g_f01be6;
extern unsigned long long g_f01ce0;
extern unsigned short g_f0ef18;
extern unsigned short g_f0ef1a;
extern unsigned short g_f0ef1c;
extern unsigned short g_f0ef1e;

long long sub_13bda4(void)
{
    unsigned long v0;  // x0

    g_f0ef18 = 52029;
    g_f0ef1a = 19269;
    g_f0ef1c = 9005;
    g_f0ef1e = 57204;
    g_f01be0 = g_f0ef18 ^ g_f01be0;
    g_f01be2 = g_f0ef1a ^ g_f01be2;
    g_f01be4 = g_f0ef1c ^ g_f01be4;
    g_f01be6 = g_f0ef1e ^ g_f01be6;
    g_f01ce0 = g_f01ce0 ^ 16101533245199731517;
    return v0;
}
