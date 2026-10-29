/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4c8cac..0x4c8e94 (488 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4c8cac_0 {
    char field_0;
} st_4c8cac_0;

extern unsigned int g_f00c10;
extern char g_f00c18;
extern unsigned int g_f0c948;

long long sub_4c8cac(void)
{
    unsigned int v2;  // w10
    unsigned int v3;  // w10
    unsigned int v12;  // w13
    unsigned int v13;  // w11
    unsigned int v14;  // w12
    unsigned int v15;  // w13
    char v16;  // x10
    unsigned int v17;  // w10
    unsigned int v18;  // w11
    unsigned int v19;  // w10
    unsigned int v20;  // w12
    unsigned int v21;  // w10
    unsigned int v4;  // w10
    unsigned int v22;  // w9
    unsigned long v23;  // x0
    char v5;  // x11
    unsigned int v7;  // w10
    unsigned int v8;  // w11
    unsigned int v9;  // w12
    unsigned int v10;  // w10
    unsigned int v11;  // w14
    st_4c8cac_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_4c8cac_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = (unsigned int)(((char)v0 ^ 41) - (char)v0) + (82 & (char)v0 * 2) + 1;
    v3 = v2 + v2 + (0xffffffff ^ v2 * 2) + (0xfffffffe - (v2 + (0xffffffff ^ v2 * 2)) | 1) + 1;
    v4 = v3 + (~v3 | 1) + 1;
    v5 = (char)v4 + g_f00c18;
    v7 = (char)v1;
    v8 = (char)v0;
    v9 = (v7 ^ -v8) + ((v7 & -v8) + (v7 + ~v7 * 2 + 1 & v8)) * 2;
    v10 = v9 - v7 + (v7 & ~v9) * 2;
    v11 = v10 + 1;
    v12 = v9 + ~v9 * 2 + 1;
    v13 = v9 - v8 + (v12 + (v8 | ~v12)) * 2;
    v14 = v13 + 2;
    v15 = ((v14 | v10) ^ -v11 - (v14 | ~v10)) + ((v14 | v10) & -v11 - (v14 | ~v10)) * 2;
    v16 = (char)(v13 - v11) + ((char)v10 & (char)~v14) * 2;
    if (((v5 ^ -(v4 | g_f00c18) & 0xff) + (v5 & -(v4 | g_f00c18) & 0xff) * 2 & 0xff) != (char)v15 + v16 + 3 + ((char)(v15 - (v16 + 3) - (v15 | 0xfffffffd - v16)) + ((char)(0xfffffffd - v16) & (char)~v15)) * 2)
        return v23;
    g_f00c18 = 1;
    v17 = (0xffffff40 & (unsigned int)v0 * 2) - (unsigned int)v0 - (unsigned int)v0 + ((unsigned int)(0x7fffffa0 - ((0xffffff40 & (unsigned int)v0 * 2) - (unsigned int)v0)) & (unsigned int)v0) * 2;
    v18 = v17 + 96;
    v19 = v17 + 95;
    v20 = v18 + (2 & ~(v19 * 2)) - 2;
    v21 = (v20 | v19 & 1) + (v19 & 1 & v18) + ((v20 | v19 & 1) + (v19 & 1 & v18) + ~((v20 | v19 & 1) + (v19 & 1 & v18)) * 2 + 1 | 1) + 2;
    v22 = (v21 ^ g_f0c948) + (v21 & g_f0c948) * 2;
    g_f0c948 = ~v22 + v22 * 2;
    g_f00c10 = g_f0c948;
    return v23;
}
