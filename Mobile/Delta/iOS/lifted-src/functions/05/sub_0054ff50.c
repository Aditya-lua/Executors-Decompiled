/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x54ff50..0x550174 (548 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_54ff50_0 {
    char field_0;
} st_54ff50_0;

extern unsigned long long g_e82570;
extern char g_f04890;

int sub_54ff50(void)
{
    unsigned int v4;  // w9
    unsigned int v5;  // w9
    unsigned int v14;  // w11
    unsigned int v15;  // w11
    unsigned int v16;  // w12
    unsigned int v17;  // w13
    unsigned int v18;  // w12
    unsigned int v19;  // w13
    unsigned int v20;  // w14
    unsigned int v21;  // w13
    unsigned int v22;  // w11
    char v23;  // x12
    unsigned int v6;  // w11
    unsigned int v24;  // w11
    char v25;  // x14
    char v26;  // x11
    char v7;  // x12
    unsigned int v8;  // w11
    unsigned int v9;  // w12
    unsigned int v10;  // w15
    unsigned int v11;  // w13
    unsigned int v12;  // w14
    unsigned int v13;  // w16
    st_54ff50_0 **v0;  // [bp-0x28], Other Possible Types: char
    st_54ff50_0 *v1;  // [bp-0x20]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = (-(((char)v0 + 5 ^ 0xfffffffb) + ((char)v0 + 5 & 123) * 2) ^ 5) + (char)v0;
    v5 = (v4 ^ 1) - 3 ^ -(v4 | 0xfffffffe) ^ 1;
    v6 = (v5 & 1 ^ 3) + (v5 * 2 | 0xfffffffd) | g_f04890 + ~g_f04890 * 2 + 1;
    v7 = (1 | g_f04890 * 2) - g_f04890;
    v8 = (char)v1;
    v9 = (char)v0;
    v10 = ~v9;
    v11 = (v8 & ~v9) + v10 + (v9 & v8) + (v9 & ~v8) * 2;
    v12 = v11 + 1;
    v13 = v12 | v8;
    v14 = -((v12 + v8 ^ -v13) + (v12 + v8 & -v13) * 2);
    v15 = (v14 ^ v13) + (v14 & v13) * 2;
    v16 = v9 + v10 * 2 + v12 + 2;
    v17 = ((v12 | v9) & ~v11) * 4 + (v11 ^ ~(v12 | v9)) * 2;
    v18 = (v16 | v17) + (v17 & v16);
    v19 = (v15 ^ -v18) + (unsigned int)(v15 - v18 - (v15 | -v18)) * 2;
    v20 = (v15 + (0xffffffff ^ v15 * 2) + v18 & -(v15 + (0xffffffff ^ v15 * 2) | v18)) * 4 + (v15 + (0xffffffff ^ v15 * 2) + v18 ^ -(v15 + (0xffffffff ^ v15 * 2) | v18)) * 2 | 1;
    v21 = (v20 ^ v19) + (v20 & v19) * 2 - 1;
    v22 = (v18 & ~v15) + (v15 | ~v18) + (v18 ^ v15);
    v23 = (char)v22 + 1;
    v24 = v21 | ~v22;
    v25 = ((char)((v21 & v22) - v23) ^ (char)(v23 - v21) + (char)v24) + ((char)((v21 & v22) - v23) & (char)(v23 - v21) + (char)v24) * 2;
    v26 = ((char)(v21 - v23) & (char)-v24) * 4 + ((char)(v21 - v23) ^ (char)-v24) * 2 | 1;
    if (((unsigned int)(v6 - g_f04890) + (v7 & ~v6) * 2 + (v6 + (v7 | ~v6)) * 2 + 2 & 0xff) != ((v26 ^ v25) + (v26 & v25) * 2 & 0xff))
        return v12 + v8 ^ -v13;
    g_f04890 = 1;
    (g_e82570 - 0x4bac6e00)();
}
