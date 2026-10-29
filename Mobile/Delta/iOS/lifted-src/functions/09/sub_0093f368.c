/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x93f368..0x93f47c (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f04a08;
extern unsigned short g_f04a0a;
extern unsigned short g_f04a0c;
extern unsigned short g_f04a0e;
extern unsigned long long g_f04a10;
extern unsigned short g_f12674;
extern unsigned short g_f12676;
extern unsigned short g_f12678;
extern unsigned short g_f1267a;

long long sub_93f368(void)
{
    unsigned long long v0;  // x9
    unsigned long v1;  // x0

    v0 = 10245573095086824422 + ((8201170980678117480 + ~8201170980678117480 * 2 + 1 & 15275871345) + 8201170972012486664) * 2;
    g_f12674 = v0;
    g_f12676 = v0 >> 16;
    g_f12678 = (((unsigned short)(v0 >> 32) ^ 0xffff) + (unsigned short)(v0 >> 32) ^ (unsigned short)(v0 >> 32) + 1) + (((unsigned short)(v0 >> 32) ^ 0xffff) + (unsigned short)(v0 >> 32) & (unsigned short)(v0 >> 32) + 1) * 2;
    g_f1267a = v0 >> 48;
    g_f04a08 = (g_f04a08 | g_f12674) + (unsigned short)~((g_f12674 | ~g_f04a08) + g_f04a08);
    g_f04a0a = g_f12676 ^ g_f04a0a;
    g_f04a0c = (g_f04a0c | g_f12678) + (unsigned short)~((g_f12678 | ~g_f04a0c) + g_f04a0c);
    g_f04a0e = g_f04a0e - g_f1267a + (g_f1267a & ~g_f04a0e) * 2;
    g_f04a10 = g_f04a10 ^ v0;
    return v1;
}
