/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4a4764..0x4a48fc (408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4a4764_0 {
    char field_0;
} st_4a4764_0;

extern unsigned int g_f00af0;
extern char g_f00af8;
extern unsigned int g_f0c948;

long long sub_4a4764(void)
{
    unsigned int v2;  // w10
    unsigned int v3;  // w11
    unsigned int v12;  // w10
    unsigned int v13;  // w11
    unsigned int v14;  // w10
    unsigned int v15;  // w12
    unsigned int v16;  // w10
    unsigned long v17;  // x0
    unsigned int v4;  // w12
    unsigned int v5;  // w10
    unsigned int v6;  // w11
    char v7;  // x12
    char v8;  // x13
    char v9;  // x10
    unsigned int v10;  // w9
    char v11;  // x9
    st_4a4764_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_4a4764_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = (char)v1;
    v3 = (char)v0;
    v4 = v2 - v3 + (v2 + ~v2 * 2 + 1 & v3) * 2;
    v5 = (v4 + (v2 | ~v4) ^ ~(v4 | v2)) + ((v4 | v2) & ~(v4 + (v2 | ~v4))) * 2;
    v6 = v4 - v3 + (v3 & ~v4) * 2;
    v7 = (char)v5 | (char)v6;
    v8 = -(v5 & v6);
    v9 = ((char)v5 | (char)~v6) + (char)v6;
    if ((g_f00af8 & 1) != (char)((v7 ^ v8) - v9) + ((char)v5 | (char)v6) + ((char)(v9 - (v5 | v6)) + (((char)v5 | (char)v6) & (char)-(v5 & v6))) * 2 + 1)
        return v17;
    v10 = ((char)v0 | 97) + ~(((char)v0 | 0xffffff9e) + ((char)v0 ^ 97)) + ((char)v0 | 97) + ~(((char)v0 | 0xffffff9e) + ((char)v0 ^ 97)) + (((char)v0 | 0xffffff9e) + ((char)v0 ^ 97) - ((char)v0 | 97)) * 2 - (((char)v0 | 97) + ~(((char)v0 | 0xffffff9e) + ((char)v0 ^ 97)) + (((char)v0 | 0xffffff9e) + ((char)v0 ^ 97) - ((char)v0 | 97)) * 2 + 1 & 0xfffffffe);
    v11 = -(v10 + 1 | 1);
    g_f00af8 = ((char)v10 + 2 ^ v11) + ((char)v10 + 2 & v11) * 2;
    v12 = (unsigned int)v0;
    v13 = ((v12 & 47 ^ 47) + v12 ^ -(v12 & 47)) + ((v12 & 47 ^ 47) + v12 & -(v12 & 47)) * 2;
    v14 = ((2 & ~(((v13 | v12) - (v13 & v12)) * 2)) + (v13 | v12) - (v13 & v12) - 1 | (v13 | v12) - (v13 & v12) & 1) + ((v13 | v12) - (v13 & v12) - 1 & (v13 | v12) - (v13 & v12) & 1);
    v15 = v14 + 1;
    v16 = v15 + ~v14 * 2 + (v14 | 0xfffffffe) + 2;
    g_f0c948 = (v16 ^ v15) + g_f0c948 + (v16 & v15) * 2;
    g_f00af0 = g_f0c948;
    return v17;
}
