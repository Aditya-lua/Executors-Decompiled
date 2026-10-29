/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4f3874..0x4f39c8 (340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4f3874_0 {
    char field_0;
} st_4f3874_0;

extern unsigned int g_f00cd0;
extern char g_f00cd8;
extern unsigned int g_f0c948;

long long sub_4f3874(void)
{
    unsigned int v2;  // w10
    unsigned int v3;  // w11
    unsigned int v12;  // w10
    unsigned int v13;  // w12
    unsigned int v14;  // w10
    unsigned int v15;  // w11
    unsigned int v16;  // w12
    unsigned int v17;  // w13
    unsigned int v18;  // w10
    unsigned long v19;  // x0
    unsigned int v4;  // w10
    char v5;  // x10
    unsigned int v6;  // w10
    unsigned int v7;  // w11
    unsigned int v8;  // w12
    unsigned int v9;  // w13
    unsigned int v10;  // w14
    unsigned int v11;  // w15
    st_4f3874_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_4f3874_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = (char)v0;
    v3 = (0xffffffa4 & v2 * 2 | 1) - v2;
    v4 = v3 - v2 + (83 - v3 & v2) * 2 + 44 | 1;
    v5 = ((char)v4 + 1 ^ (char)-v4) + ((char)v4 + 1 & (char)-v4) * 2;
    v6 = (char)v1;
    v7 = (char)v0;
    v8 = v6 | v7;
    v9 = (v7 | ~v6) + v6;
    v10 = v8 + ~v9;
    v11 = v9 - v8;
    v12 = v10 - v6;
    v13 = (v8 - v9 + v11 * 2 & v6) * 2;
    v14 = v12 + v13;
    v15 = (v10 ^ -v7) + (v11 & v7) * 2 + (v10 & -v7) * 2;
    v16 = ~v12 - v13 & v15;
    v17 = (v14 ^ -v15) + (v16 + (v14 & -v15)) * 2;
    v18 = (v16 + v14 ^ -(v14 & v15)) + (v16 + v14 & -(v14 & v15)) * 2;
    if (((unsigned int)(g_f00cd8 + v5 - (v5 | g_f00cd8)) & 0xff) == (char)v17 + (char)v18 + ((char)v17 + ((char)-v18 | (char)~v17) + ((char)-v18 & (char)~v17)) * 2 + 2)
    {
        g_f00cd8 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00cd0 = g_f0c948;
    }
    return v19;
}
