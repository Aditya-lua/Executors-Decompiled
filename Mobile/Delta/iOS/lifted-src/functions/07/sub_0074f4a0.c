/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x74f4a0..0x74f814 (884 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_74f4a0_0 {
    char field_0;
} st_74f4a0_0;

extern unsigned long long g_e82a08;
extern char g_f04960;

long long sub_74f4a0(void)
{
    unsigned int v4;  // w11
    unsigned int v5;  // w12
    unsigned int v14;  // w13
    unsigned int v15;  // w14
    char v16;  // x10
    unsigned int v18;  // w12
    unsigned int v19;  // w13
    unsigned int v20;  // w15
    unsigned int v21;  // w14
    unsigned int v22;  // w15
    unsigned int v23;  // w14
    unsigned int v6;  // w13
    unsigned int v24;  // w12
    unsigned int v25;  // w16
    unsigned int v26;  // w13
    unsigned int v27;  // w13
    unsigned int v28;  // w14
    unsigned int v29;  // w15
    unsigned int v30;  // w17
    unsigned int v31;  // w15
    unsigned long v32;  // x0
    unsigned int v33;  // w1
    unsigned int v7;  // w12
    unsigned int v34;  // w12
    unsigned int v36;  // w11
    unsigned int v38;  // w10
    unsigned int v39;  // w9
    unsigned int v40;  // w9
    unsigned int v41;  // w9
    unsigned int v42;  // w10
    unsigned int v43;  // w10
    unsigned int v8;  // w13
    unsigned int v44;  // w9
    unsigned int v45;  // w10
    unsigned int v9;  // w11
    unsigned int v10;  // w12
    unsigned int v11;  // w14
    unsigned int v12;  // w11
    unsigned int v13;  // w12
    st_74f4a0_0 **v0;  // [bp-0x28], Other Possible Types: char
    st_74f4a0_0 *v1;  // [bp-0x20]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = (char)v0;
    v5 = (v4 + ~v4 * 2 + 1 & 47) + v4;
    v6 = v4 + (47 | ~v4) - 47;
    v7 = (v6 * 2 & 96) + (v6 ^ 48) + v5 + (-((v6 * 2 & 96) + (v6 ^ 48)) & ~v5) * 2 + (unsigned int)(v5 - ((v6 * 2 & 96) + (v6 ^ 48)) - (v5 | -((v6 * 2 & 96) + (v6 ^ 48)))) * 2;
    v8 = v7 | v4;
    v9 = v7 & v4;
    v10 = -v9;
    v11 = v8 ^ v10;
    v12 = v11 + (unsigned int)(v8 - v9 - (v8 | v10)) * 2 - 2;
    v13 = ((v12 ^ -(v11 | 0xfffffffe)) + 1 | 0xfffffffe) + ((unsigned int)(((v12 ^ -(v11 | 0xfffffffe)) + 1 + (v12 & -(v11 | 0xfffffffe)) * 2 ^ 0xfffffffd) + ((v12 ^ -(v11 | 0xfffffffe)) + 1 + (v12 & -(v11 | 0xfffffffe)) * 2 | 1) - (((v12 ^ -(v11 | 0xfffffffe)) + 1 + (v12 & -(v11 | 0xfffffffe)) * 2) * 2 & 4)) + 2 & 0xfffffffe);
    v14 = 0xfffffffe - v13;
    v15 = v14 + g_f04960;
    v16 = (char)v13 + ((char)v14 | ~g_f04960) + ((char)v14 | g_f04960) * 2;
    v18 = (char)v1;
    v19 = (char)v0;
    v20 = v19 | v18;
    v21 = (~v18 & ~v19) + v20 * 2 + 1;
    v22 = (v19 + v18 ^ -v20) + (v19 + v18 & -v20) * 2;
    v23 = v22 + v21 + (-v22 & ~v21) * 2 + (v21 + (-v22 | ~v21)) * 2 + 2;
    v24 = v23 - v18 + ((v18 & ~v23) * 2 | ~(v23 - v18)) + ((v18 & ~v23) * 2 | v23 - v18) + 1;
    v25 = v23 - v19 + (v23 & v19) + (v19 & ~v23) * 2;
    v26 = (v23 + ~v23 * 2 + 1 | v19) + v23;
    v27 = v26 + v25 + (v25 & ~v26) * 2 + (~v25 & ~v26) * 2;
    v28 = v27 + 2;
    v29 = v27 + 1;
    v30 = v29 + v24;
    v31 = v29 | v24;
    v32 = -v31;
    v33 = (v30 & (unsigned int)v32) * 2;
    v34 = v28 + v24;
    v36 = v34 + (v24 + ~v24 * 2 + 1 | (unsigned int)(0xfffffffe - v27));
    if (...)
        return v32;
    v38 = (char)v0;
    v39 = v38 + (-(v38 * 2) & 94) + (-(v38 * 2) & 0xffffffa0) + ((0x22 & (v38 | 47) * 2) + ((v38 | 47) ^ 81)) * 2 + 48;
    v40 = ~v39 + v39 * 2;
    v41 = v40 - v38;
    v42 = (v40 + (0xffffffff ^ v40 * 2) & v38) * 2;
    v43 = (v41 | v42) + (v42 & v41);
    v44 = v43 - (__ROL__(v41, 1) & 2 & 3) + 1;
    v45 = (v43 + 1 ^ -(v43 | 1)) + (v43 + 1 & -(v43 | 1)) * 2 + 1;
    g_f04960 = (char)((-((v45 ^ v44) + (v45 & v44) * 2) | 1) + ((v45 ^ v44) + (v45 & v44) * 2 - 1) * 2 + ((v45 ^ v44) + (v45 & v44) * 2 - 1 ^ 254) - (((v45 ^ v44) + (v45 & v44) * 2 - 1) * 2 & 2)) + 3;
    (g_e82a08 - 0x55645800)();
}
