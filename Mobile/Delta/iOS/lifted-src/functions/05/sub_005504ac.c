/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5504ac..0x5507c4 (792 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5504ac_0 {
    char field_0;
} st_5504ac_0;

extern unsigned short g_f04928;
extern unsigned short g_f0492a;
extern unsigned short g_f0492c;
extern unsigned short g_f0492e;
extern unsigned short g_f04930;
extern unsigned short g_f04932;
extern unsigned short g_f04934;
extern unsigned short g_f04936;
extern unsigned long long g_f04938;

int sub_5504ac(void)
{
    st_5504ac_0 *v2;  // x8
    st_5504ac_0 **v3;  // x9
    unsigned long long v12;  // x11
    unsigned long long v13;  // x13
    unsigned long long v14;  // x10
    unsigned long long v15;  // x10
    unsigned long v16;  // x10
    unsigned long long v17;  // x9
    unsigned short v18;  // x11
    unsigned long long v4;  // x10
    unsigned long long v5;  // x11
    unsigned long long v6;  // x8
    unsigned long long v7;  // x8
    unsigned long long v8;  // x9
    unsigned long long v9;  // x10
    unsigned long long v10;  // x9
    unsigned long long v11;  // x10
    st_5504ac_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned long long
    st_5504ac_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long long

    v1 = &v0;
    v0 = &v1;
    v2 = v1;
    v3 = v0;
    v4 = v3 | v2;
    v5 = (v4 ^ -(v3 & v2)) + (v4 & -(v3 & v2)) * 2;
    v6 = (v4 ^ (char *)~v3 - (v2 | ~v3)) + (v4 & (char *)~v3 - (v2 | ~v3)) * 2;
    v7 = v5 + v6 + (-v6 & ~v5) * 2 + (v5 - (v6 + (v5 | -v6))) * 2;
    v0 = v7 + 29;
    v1 = v7 + 4;
    v8 = 15747368 >> ((char)v1 + (char)v0 & 63);
    v9 = v1 - (v0 + (v0 ^ -v1) + (v1 & ~v0) * 2) + ((v0 & ~v1) - (v0 & -v1)) * 2;
    v0 = ~((9133435658668766824 & v9 * 2) + (v9 ^ 13790089866189159220)) + ((9133435658668766824 & v9 * 2) + (v9 ^ 13790089866189159220)) * 2;
    v1 = v9 + (0x3ff1722c566a519a | ~v9) + (v9 | 0x3ff1722c566a519a) + 1;
    v10 = ((-v8 ^ 15747368) + (v8 & ~&g_f04928 | -v8 & 15747368) * 2) * ((v1 + 1 ^ v0) + (v1 + 1 & v0) * 2 - 1);
    v11 = v1;
    v12 = v0;
    v13 = ((v11 | v12) ^ -(v12 & v11)) + ((v11 | v12) & -(v12 & v11)) * 2;
    v14 = -((v12 ^ -v11) + ((v12 + ~v12 * 2 + 1 & v11) + (v12 & -v11)) * 2);
    v15 = (v14 ^ v13) + (v13 + (v14 | ~v13)) * 2;
    v0 = v15 + (v15 + 2 | 2) + (~(v15 + 2) | 2) + 3;
    v1 = v15 + 29;
    v16 = v10 >> ((char)~((v1 + 1 ^ v0) + (v1 + 1 & v0) * 2) + (((char)v1 + 1 ^ v0) + ((char)v1 + 1 & v0) * 2) * 2 & 63);
    v17 = v10 - v16 + (v16 & ~v10) * 2;
    g_f0492a = (unsigned short)((~(unsigned int)v17 + (unsigned int)v17 * 2) * 2 - v17) + 2;
    g_f0492c = v17 >> 16;
    g_f0492e = ((unsigned short)(__ROL__((unsigned int)(v17 >> 32) + 0xffff, 1)) & 2 & 3) + ((unsigned short)(v17 >> 32) + 0xffff ^ 1);
    g_f04930 = v17 >> 48;
    g_f04928 = (g_f0492a | g_f04928) + (unsigned short)~((g_f0492a | ~g_f04928) + g_f04928);
    v18 = -g_f0492c;
    g_f04932 = (v18 ^ g_f04932) + (v18 & g_f04932) * 2 + (g_f04932 + ~g_f04932 * 2 + 1 & g_f0492c) * 2;
    g_f04934 = g_f0492e ^ g_f04934;
    g_f04936 = g_f04936 - g_f04930 + (g_f04930 & ~g_f04936) * 2;
    g_f04938 = (g_f04938 | v17) + ~((v17 | ~g_f04938) + g_f04938);
    return 0;
}
