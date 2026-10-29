/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x507c74..0x507de8 (372 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_507c74_0 {
    char field_0;
} st_507c74_0;

extern unsigned int g_f03928;
extern char g_f03930;

long long sub_507c74(void)
{
    unsigned int v5;  // w10
    unsigned int v6;  // w11
    unsigned int v15;  // w9
    unsigned long v16;  // x0
    char v7;  // x10
    char v8;  // x11
    unsigned int v9;  // w10
    unsigned int v10;  // w11
    unsigned int v11;  // w12
    unsigned int v12;  // w13
    char v13;  // x13
    unsigned int v14;  // w10
    st_507c74_0 **v0;  // [bp-0x28], Other Possible Types: char
    st_507c74_0 *v1;  // [bp-0x20]
    char v2;  // [bp-0x11]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    v5 = (char)v0;
    v6 = (-(v5 * 2) & 0xffffffca) + (-v5 ^ 101) + (v5 * 2 & 52);
    v7 = (((char)v6 | (char)v5) ^ (char)-(v6 & v5)) + (((char)v6 | (char)v5) & (char)-(v6 & v5)) * 2 + (((char)v6 | (char)v5) ^ (char)~-(v6 & v5) | 254);
    v8 = 0xfffffffd - (v7 + 1) - (v7 + 1 | 0xfffffffe);
    v9 = (char)v1;
    v10 = (char)v0;
    v11 = v10 ^ v9;
    v12 = v11 + (v10 ^ ~v9) * 2 + 1;
    v13 = (char)(v11 - v9) + ((char)v12 + ((char)v9 | (char)~v12)) * 2 + 2;
    v14 = (v11 ^ -v10) + (v10 & v9) * 2 + (v11 & -v10) * 2;
    if ((g_f03930 + ((v8 ^ v7 + 3) + (v8 & v7 + 3) * 2 | ~g_f03930) + 1 & 0xff) != (char)(v13 + (v13 ^ v14) - (v14 + (v13 & ~v14) * 2)))
        return v16;
    v15 = (72 & (char)v0 * 2) - (char)v0 - (char)v0 + ((unsigned int)(36 - ((72 & (char)v0 * 2) - (char)v0)) & (char)v0) * 2 + 91 | 1;
    g_f03930 = (((char)v15 + 1 + (char)~v15 * 2 | 1) ^ (char)v15 + 1) + ((char)v15 + 1 + (char)~v15 * 2 & (char)v15 + 1) * 2;
    g_f03928 = sub_3fbbf4(&v2);
    return g_f03928;
}
