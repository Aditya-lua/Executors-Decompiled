/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x54fc54..0x54ff50 (764 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_54fc54_0 {
    char field_0;
} st_54fc54_0;

extern unsigned long long g_e82568;
extern char g_f04880;

long long sub_54fc54(void)
{
    unsigned int v4;  // w10
    unsigned int v5;  // w13
    unsigned int v15;  // w10
    unsigned int v16;  // w11
    unsigned int v17;  // w13
    unsigned int v18;  // w12
    unsigned int v19;  // w14
    unsigned int v20;  // w14
    unsigned int v21;  // w10
    unsigned long v22;  // x14
    unsigned int v23;  // w11
    unsigned int v6;  // w11
    unsigned long long v24;  // x11
    unsigned int v25;  // w10
    unsigned int v26;  // w15
    unsigned int v27;  // w13
    unsigned int v28;  // w16
    unsigned int v29;  // w17
    unsigned int v30;  // w10
    unsigned int v31;  // w11
    unsigned int v32;  // w11
    unsigned int v33;  // w13
    unsigned int v7;  // w10
    char v36;  // x9
    char v37;  // x9
    unsigned int v8;  // w10
    unsigned int v9;  // w12
    unsigned int v10;  // w10
    unsigned int v11;  // w10
    unsigned int v12;  // w10
    char v13;  // x10
    st_54fc54_0 **v0;  // [bp-0x28], Other Possible Types: char
    st_54fc54_0 *v1;  // [bp-0x20]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = (char)v0;
    v5 = 58 - (v4 & 57);
    v6 = (v5 & v4 - 58) * 4 + (v5 ^ v4 - 58) * 2 - v4 + (v4 - 58 | ~((v5 & v4 - 58) * 4 + (v5 ^ v4 - 58) * 2)) + ((v5 & v4 - 58) * 4 + (v5 ^ v4 - 58) * 2 & (unsigned int)(57 - v4)) + 58;
    v7 = (v6 | v4) - v6 - (v6 + ~v6 * 2 + 1 | v4);
    v8 = (v7 | 1) + (v7 & 1) - 2;
    v9 = v8 * 2;
    v10 = (v8 ^ 1) + ~v8 * 2 + 1;
    v11 = ((v10 + (v9 & 2)) * 2 & 0xfffffffe | v10 & 1) + (-((v10 + (v9 & 2)) * 2) & 0xfffffffc);
    v12 = ((v11 ^ (v9 & 4) + (v8 ^ 2)) + (v11 & (v9 & 4) + (v8 ^ 2)) * 2 - 1 | 1) + (v11 ^ (v9 & 4) + (v8 ^ 2)) + (v11 & (v9 & 4) + (v8 ^ 2)) * 2 + (-((v11 ^ (v9 & 4) + (v8 ^ 2)) + (v11 & (v9 & 4) + (v8 ^ 2)) * 2 - 1 | 1) & ~((v11 ^ (v9 & 4) + (v8 ^ 2)) + (v11 & (v9 & 4) + (v8 ^ 2)) * 2)) * 2 + (((v11 ^ (v9 & 4) + (v8 ^ 2)) + (v11 & (v9 & 4) + (v8 ^ 2)) * 2 - 1 & 1) - ((v11 ^ (v9 & 4) + (v8 ^ 2)) + (v11 & (v9 & 4) + (v8 ^ 2)) * 2 | -((v11 ^ (v9 & 4) + (v8 ^ 2)) + (v11 & (v9 & 4) + (v8 ^ 2)) * 2 - 1 | 1))) * 2;
    v13 = (char)v12 + (char)~(v12 | g_f04880);
    v15 = (char)v1;
    v16 = (char)v0;
    v17 = v16 + ~v16 * 2 + 2;
    v18 = v17 + v15 + (v15 + (0xffffffff ^ v15 * 2) + v16 ^ -(v15 + (0xffffffff ^ v15 * 2) | v16)) * 2 + (v15 + (0xffffffff ^ v15 * 2) + v16 & -(v15 + (0xffffffff ^ v15 * 2) | v16)) * 4;
    v19 = v18 + ~v18 * 2 + 1;
    v20 = (v19 + v15 & -(v19 | v15)) * 4 + (v19 + v15 ^ -(v19 | v15)) * 2;
    v21 = v18 - v15 + ~v20 + v20 * 2;
    v22 = ~(v21 + 2) + (v21 + 2) * 2;
    v23 = ((v18 | v16) & -v18) * 4 + ((v18 | v16) ^ -v18) * 2;
    v24 = (v17 + v18 | v23) + (v23 & v17 + v18);
    v25 = 0xfffffffe - v21;
    v26 = ((unsigned int)v22 | ~(unsigned int)v24) + (unsigned int)v24;
    v27 = (unsigned int)v22 + ((unsigned int)v24 & v25);
    v28 = (v25 & ~(unsigned int)v24) + ~v26 + v27 * 2;
    v29 = v28 + 2;
    v30 = (unsigned int)(v24 - v22) + v26 + ((unsigned int)v22 & ~(unsigned int)v24) * 2;
    v31 = -(((unsigned int)v22 + (unsigned int)v24 ^ -v27) + ((unsigned int)v22 + (unsigned int)v24 & -v27) * 2);
    v32 = (v30 + 1 ^ v31) + (v30 + (v31 | 0xfffffffe - v30)) * 2;
    v33 = 0xfffffffc - v32;
    if (((v13 ^ g_f04880 + 1) + (v13 & g_f04880 + 1) * 2 & 0xff) != (v32 + v29 + (v29 - v29 * 2 + (v33 | ~(v29 - v29 * 2))) * 2 + 5 + (((char)v29 + ((char)v33 | (char)(0xfffffffe - v28))) * 2 | ~(v32 + v29 + (v29 - v29 * 2 + (v33 | ~(v29 - v29 * 2))) * 2 + 5)) + (v32 + v29 + (v29 - v29 * 2 + (v33 | ~(v29 - v29 * 2))) * 2 + 5 | ((char)v29 + ((char)v33 | (char)(0xfffffffe - v28))) * 2) + 1 & 0xff))
        return v24 - v22;
    v36 = (-(char)v0 ^ 55) - (char)v0;
    v37 = (char)((v36 | (unsigned int)(0xfffffffc - v36)) - v36) + (v36 | v36 + 3);
    g_f04880 = (v37 & 1 ^ 3) + (v37 * 2 | 253);
    (g_e82568 - 0x7ce1f300)();
}
