/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5501a8..0x5504ac (772 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5501a8_0 {
    char field_0;
} st_5501a8_0;

extern unsigned short g_f04940;
extern unsigned short g_f04942;
extern unsigned short g_f04944;
extern unsigned short g_f04946;
extern unsigned short g_f04948;
extern unsigned short g_f0494a;
extern unsigned short g_f0494c;
extern unsigned short g_f0494e;
extern unsigned long long g_f04950;

int sub_5501a8(void)
{
    st_5501a8_0 *v2;  // x8
    st_5501a8_0 **v3;  // x9
    unsigned long long v12;  // x11
    unsigned long long v13;  // x10
    unsigned long long v14;  // x10
    unsigned long v15;  // x10
    unsigned long long v16;  // x9
    unsigned long long v4;  // x10
    unsigned long long v5;  // x11
    unsigned long long v6;  // x8
    unsigned long long v7;  // x8
    unsigned long long v8;  // x9
    unsigned long long v9;  // x10
    unsigned long long v10;  // x9
    unsigned long long v11;  // x10
    st_5501a8_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned long long
    st_5501a8_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long long

    v1 = &v0;
    v0 = &v1;
    v2 = v1;
    v3 = v0;
    v4 = v3 | v2;
    v5 = (v4 ^ -(v3 & v2)) + (v4 & -(v3 & v2)) * 2;
    v6 = (v4 ^ (char *)~v3 - (v2 | ~v3)) + (v4 & (char *)~v3 - (v2 | ~v3)) * 2;
    v7 = v5 + v6 + (-v6 & ~v5) * 2 + (v5 - v6 - (v5 | -v6)) * 2;
    v0 = v7 + 29;
    v1 = v7 + 4;
    v8 = 15747392 >> ((char)v1 + (char)v0 & 63);
    v9 = v1 - (v0 + (v0 ^ -v1) + (v1 & ~v0) * 2) + ((v0 & ~v1) - (v0 & -v1)) * 2;
    v0 = ~((9133435658668766824 & v9 * 2) + (v9 ^ 13790089866189159220)) + ((9133435658668766824 & v9 * 2) + (v9 ^ 13790089866189159220)) * 2;
    v1 = v9 + (0x3ff1722c566a519a | ~v9) + (v9 | 0x3ff1722c566a519a) + 1;
    v10 = ((-v8 ^ 15747392) + (v8 & ~&g_f04940 | -v8 & 15747392) * 2) * ((v1 + 1 ^ v0) + (v1 + 1 & v0) * 2 - 1);
    v11 = v1;
    v12 = v0;
    v13 = -((v12 ^ -v11) + ((v12 + ~v12 * 2 + 1 & v11) + (v12 & -v11)) * 2);
    v14 = (v13 ^ ((v11 | v12) ^ -(v12 & v11)) + ((v11 | v12) & -(v12 & v11)) * 2) + (((v11 | v12) ^ -(v12 & v11)) + ((v11 | v12) & -(v12 & v11)) * 2 + (v13 | ~(((v11 | v12) ^ -(v12 & v11)) + ((v11 | v12) & -(v12 & v11)) * 2))) * 2;
    v0 = v14 + (v14 + 2 | 2) + (~(v14 + 2) | 2) + 3;
    v1 = v14 + 29;
    v15 = v10 >> ((char)~((v1 + 1 ^ v0) + (v1 + 1 & v0) * 2) + (((char)v1 + 1 ^ v0) + ((char)v1 + 1 & v0) * 2) * 2 & 63);
    v16 = v10 - v15 + (v15 & ~v10) * 2;
    g_f04942 = ((unsigned short)(__ROL__((unsigned int)v16 + 0xffff, 1)) & 2 & 3) + ((unsigned short)v16 + 0xffff ^ 1);
    g_f04944 = ((unsigned short)(__ROL__((unsigned int)(v16 >> 16) + 0xffff, 1)) & 2 & 3) + ((unsigned short)(v16 >> 16) + 0xffff ^ 1);
    g_f04946 = ((unsigned short)(__ROL__((unsigned int)(v16 >> 32) + 0xffff, 1)) & 2 & 3) + ((unsigned short)(v16 >> 32) + 0xffff ^ 1);
    g_f04948 = v16 >> 48;
    g_f04940 = g_f04942 ^ g_f04940;
    g_f0494a = g_f0494a - g_f04944 + (g_f04944 & ~g_f0494a) * 2;
    g_f0494c = (g_f0494c | g_f04946) + (unsigned short)~((g_f04946 | ~g_f0494c) + g_f0494c);
    g_f0494e = (g_f0494e | g_f04948) - (g_f04948 & g_f0494e);
    g_f04950 = (g_f04950 | v16) + ~((v16 | ~g_f04950) + g_f04950);
    return 0;
}
