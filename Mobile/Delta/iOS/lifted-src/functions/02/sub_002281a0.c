/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2281a0..0x228238 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02be8;
extern unsigned short g_f02bea;
extern unsigned short g_f02bec;
extern unsigned short g_f02bee;
extern unsigned long long g_f02c78;
extern unsigned short g_f11548;
extern unsigned short g_f1154a;
extern unsigned short g_f1154c;
extern unsigned short g_f1154e;

long long sub_2281a0(void)
{
    unsigned long v0;  // x0

    g_f11548 = 3787;
    g_f1154a = 54183;
    g_f1154c = 8391;
    g_f1154e = 0xf4ff;
    g_f02be8 = g_f11548 ^ g_f02be8;
    g_f02bea = g_f1154a ^ g_f02bea;
    g_f02bec = g_f1154c ^ g_f02bec;
    g_f02bee = g_f1154e ^ g_f02bee;
    g_f02c78 = g_f02c78 ^ 0xf4ff20c7d3a70ecb;
    return v0;
}
