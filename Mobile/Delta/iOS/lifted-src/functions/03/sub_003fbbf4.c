/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3fbbf4..0x3fc098 (1188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3fbbf4_0 {
    char field_0;
} st_3fbbf4_0;

extern unsigned short g_f043e8;
extern unsigned short g_f043ea;
extern unsigned short g_f043ec;
extern unsigned short g_f043ee;
extern unsigned short g_f043f0;
extern unsigned short g_f043f2;
extern unsigned short g_f043f4;
extern unsigned short g_f043f6;
extern unsigned long long g_f043f8;

int sub_3fbbf4(void)
{
    unsigned long long v4;  // x8
    unsigned long long v5;  // x8
    unsigned long long v14;  // x13
    unsigned long long v15;  // x12
    unsigned short v16;  // x11
    unsigned short v17;  // x12
    unsigned long long v18;  // x12
    unsigned long long v19;  // x13
    unsigned long long v20;  // x14
    unsigned long v21;  // x12
    unsigned long long v22;  // x12
    unsigned long long v23;  // x13
    st_3fbbf4_0 *v6;  // x10
    unsigned long long v24;  // x13
    unsigned long long v25;  // x14
    unsigned long long v26;  // x14
    unsigned long long v27;  // x13
    unsigned int v28;  // w15
    unsigned short v29;  // x10
    unsigned short v30;  // x11
    unsigned short v31;  // x11
    unsigned short v32;  // x12
    unsigned short v33;  // x10
    st_3fbbf4_0 **v7;  // x11
    unsigned int v34;  // w8
    unsigned int v35;  // w9
    unsigned int v36;  // w10
    unsigned int v37;  // w8
    unsigned int v38;  // w9
    unsigned long long v8;  // x12
    unsigned long long v9;  // x10
    unsigned long long v10;  // x10
    unsigned int v11;  // w11
    unsigned long long v12;  // x12
    unsigned long long v13;  // x13
    st_3fbbf4_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned long long
    unsigned long long v1;  // [bp-0x10]
    st_3fbbf4_0 *v2;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long
    unsigned long long v3;  // [bp-0x8]

    v2 = &v0;
    v0 = &v2;
    v4 = 0xff51afd7ed558ccd * ((char *)&g_f043e8 + ~(~&g_f043e8 + &g_f043e8));
    v5 = ((v4 | v4 >> 29) ^ ~v4 - (v4 >> 29 | ~v4)) + ((v4 | v4 >> 29) & ~v4 - (v4 >> 29 | ~v4)) * 2;
    v6 = v2;
    v7 = v0;
    v8 = (v6 ^ -v7) + (v6 & -v7) * 2 + ((char *)v6 + 0x2 * ~v6 + 1 & v7) * 2;
    v9 = v7 - v6 + ((char *)v7 + 0x2 * ~v7 + 1 & v6) * 2;
    v10 = v9 + v8 + (-v9 & ~v8) * 2 + (v8 - v9 - (-v9 | v8)) * 2;
    v0 = v10 + 10095;
    v2 = v10 + (55440 | ~v10) + (v10 | 55440) + 1;
    g_f043ea = ((unsigned short)v5 | (unsigned short)~((unsigned int)v2 + (unsigned int)v0)) + (unsigned short)v2 + (unsigned short)v0 + 1;
    v0 = 6;
    v2 = 10;
    v11 = v5 >> ((char)v2 + (char)v0 & 63);
    v12 = v2;
    v13 = v0;
    v14 = (v13 + ~v13 * 2 + 1 & v12) * 2;
    v15 = (v13 ^ v12) - ((v13 ^ -v12) + (v13 & -v12) * 2);
    v0 = (v15 - v14 ^ 24129) + (48258 & (v15 - v14) * 2) - 1;
    v2 = v15 + 41408 + ~v14;
    v16 = (unsigned short)v11 + 1;
    v17 = (unsigned short)v2 + (unsigned short)v0 | v16 + (unsigned short)~v11 * 2;
    g_f043ee = (v17 ^ v16) + (v17 & v16) * 2;
    v18 = v2;
    v19 = v0;
    v20 = v19 | v18;
    v21 = (~v19 - (v18 | ~v19) ^ v20) + (~v19 - (v18 | ~v19) & v20) * 2;
    v22 = v20 + ~((v19 | ~v18) + v18) + v21 + ((v19 | ~v18) + v18 - v20 & -v21) * 2 + (v20 - ((v19 | ~v18) + v18) + ((v19 | ~v18) + v18 - v20 | -v21)) * 2;
    v1 = v22 + 3;
    v2 = v22 + 29;
    v23 = ((v1 | v2) ^ -(v1 & v2)) - (v1 ^ v2) + ((v1 | v2) & -(v1 & v2)) * 2;
    v0 = ~((79192 & v23 * 2) + (v23 ^ 39596)) + ((79192 & v23 * 2) + (v23 ^ 39596)) * 2;
    v3 = v23 + 25940;
    g_f043f2 = (unsigned short)v0 + ((unsigned short)v3 | (unsigned short)~(unsigned int)v0) + ((unsigned short)v3 | (unsigned short)v0) + 1 & (unsigned short)(v5 >> ((char)v1 + ((char)v2 | (char)~v1) + ((char)v2 | (char)v1) + 1 & 63));
    v24 = v3;
    v25 = v0;
    v26 = (v25 + ~v25 * 2 + 1 & v24) * 2;
    v27 = (v25 & ~v24) * 2 + v26 + (-(v25 - v24 + v26) & ~((v25 & ~v24) * 2 + v24 - v25)) * 2 + ((v25 & ~v24) * 2 + v24 - v25 - (v25 - v24 + v26) - (-(v25 - v24 + v26) | (v25 & ~v24) * 2 + v24 - v25)) * 2;
    v0 = v27 + 9;
    v2 = (v27 ^ 40) + (80 & v27 * 2) - 1;
    g_f043f6 = v5 >> ((char)v2 + (char)v0 & 63);
    v28 = g_f043e8 + ~g_f043e8 * 2 + 1;
    v29 = -g_f043ea;
    g_f043e8 = (v29 ^ g_f043e8) + (v29 & g_f043e8) * 2 + ((unsigned short)v28 + (g_f043ea | (unsigned short)~v28)) * 2 + 2;
    v30 = -g_f043ee;
    g_f043ec = (v30 ^ g_f043ec) + (g_f043ee & ~g_f043ec) * 2 + (v30 & g_f043ec) * 2;
    v31 = -g_f043f2;
    g_f043f0 = (v31 ^ g_f043f0) + ((g_f043f0 + ~g_f043f0 * 2 + 1 & g_f043f2) + (v31 & g_f043f0)) * 2;
    v32 = g_f043f6 | g_f043f4;
    v33 = -(g_f043f6 & g_f043f4);
    g_f043f4 = (v32 ^ v33) + (v32 & v33) * 2;
    g_f043f8 = (g_f043f8 | v5) + ~((v5 | ~g_f043f8) + g_f043f8);
    v34 = v2;
    v35 = v0;
    v36 = ((v35 | v34) ^ -(v35 & v34)) + ((v35 | v34) & -(v35 & v34)) * 2;
    v37 = v36 ^ v34;
    v38 = (v36 ^ -v35) + (v35 & ~v36) * 2 + (v36 & -v35) * 2;
    return (unsigned int)(v37 + (v37 | ~v38) - (v38 | v37)) + (v38 & ~v37) * 2 + 1;
}
