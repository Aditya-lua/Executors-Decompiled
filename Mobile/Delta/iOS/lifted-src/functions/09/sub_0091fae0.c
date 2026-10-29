/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x91fae0..0x91fbd8 (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f04c30;
extern unsigned short g_f04c32;
extern unsigned short g_f04c34;
extern unsigned short g_f04c36;
extern unsigned long long g_f04c38;
extern unsigned short g_f1277c;
extern unsigned short g_f1277e;
extern unsigned short g_f12780;
extern unsigned short g_f12782;

long long sub_91fae0(void)
{
    unsigned long long v0;  // x9
    unsigned short v1;  // x12
    unsigned short v2;  // x10
    unsigned long v3;  // x0

    v0 = 435842963988554912 + ((18010901125767053936 + ~18010901125767053936 * 2 + 1 & 33547917615) + 18010901100970066512) * 2;
    g_f1277c = v0;
    g_f1277e = v0 >> 16;
    g_f12780 = v0 >> 32;
    g_f12782 = v0 >> 48;
    g_f04c30 = (g_f04c30 | g_f1277c) + (unsigned short)~((g_f1277c | ~g_f04c30) + g_f04c30);
    g_f04c32 = g_f1277e ^ g_f04c32;
    g_f04c34 = g_f12780 ^ g_f04c34;
    v1 = g_f12782 | g_f04c36;
    v2 = -(g_f12782 & g_f04c36);
    g_f04c36 = (v1 ^ v2) + (v1 & v2) * 2;
    g_f04c38 = g_f04c38 ^ v0;
    return v3;
}
