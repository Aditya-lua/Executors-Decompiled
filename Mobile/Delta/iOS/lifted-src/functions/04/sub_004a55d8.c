/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4a55d8..0x4a57c0 (488 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4a55d8_0 {
    char field_0;
} st_4a55d8_0;

extern unsigned int g_f00b10;
extern char g_f00b18;
extern unsigned int g_f0c948;

long long sub_4a55d8(void)
{
    unsigned int v2;  // w10
    unsigned int v3;  // w11
    unsigned int v12;  // w11
    unsigned int v13;  // w9
    unsigned int v14;  // w9
    unsigned int v15;  // w10
    unsigned long v16;  // x0
    unsigned int v4;  // w10
    char v5;  // x11
    unsigned int v6;  // w10
    unsigned int v7;  // w11
    unsigned int v8;  // w12
    unsigned int v9;  // w12
    char v10;  // x13
    unsigned int v11;  // w10
    st_4a55d8_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_4a55d8_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = (char)v0;
    v3 = (-(v2 * 2) & 0xffffffc3) + (-v2 ^ 97) + (v2 * 2 & 60);
    v4 = ((v2 | ~v3) + v3 - (v3 | v2) | 0xfffffffe) + (v3 | v2) - ((v2 | ~v3) + v3);
    v5 = -(v4 + 1 | 1);
    v6 = (char)v1;
    v7 = (char)v0;
    v8 = v6 + ~v6 * 2 + 1;
    v9 = v6 - v7 + (v8 + (v7 | ~v8)) * 2 + 2;
    v10 = (char)v9 | (char)v6;
    v11 = (v6 | ~v9) + v9;
    v12 = v9 - v7 + (v7 & ~v9) * 2;
    if ((g_f00b18 + ((v4 + 2 ^ v5) + (v4 + 2 & v5) * 2 | ~g_f00b18) & 0xff) == (((char)v9 | (char)v6) + (char)~v11 | (char)~v12) + (char)v12 + (char)((v10 + ~v11 ^ -v12) - (v12 | v10 + ~v11)) + (((char)(v11 - (v9 | v6)) & (char)v12) + (((char)v9 | (char)v6) + (char)~v11 & (char)-v12)) * 2)
    {
        v13 = (((char)v0 * 2 & 60) - (char)v0 + 97 ^ -(char)v0) + ((((char)v0 * 2 & 60) - (char)v0 + 97 | (char)v0) - (((char)v0 * 2 & 60) - (char)v0) + (((char)v0 * 2 & 60) - (char)v0 + 97 & -(char)v0)) * 2;
        v14 = (v13 + 63 + (2 & ~((v13 + 62) * 2)) - 2 | v13 + 62 & 1) + (v13 + 62 & 1 & v13 + 63);
        g_f00b18 = ((char)v14 + (char)~v14 * 2 ^ (char)~(v14 + ~v14 * 2 + 1 | 1)) + (((char)v14 + (char)~v14 * 2 + 1 | 1) & (char)~(v14 + ~v14 * 2)) * 2;
        v15 = ((0xaa & (unsigned int)v0 * 2) - (unsigned int)v0 + 0x7fffffaa & (unsigned int)v0) * 2 - (0xaa & (unsigned int)v0 * 2) + 87 & 0xfffffffe;
        g_f0c948 = ((unsigned int)(1 - v15) ^ v15) + g_f0c948 + ((unsigned int)(1 - v15) & v15) * 2;
        g_f00b10 = g_f0c948;
    }
    return v16;
}
