/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x561368..0x5617b8 (1104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_561368_0 {
    char field_0;
} st_561368_0;

typedef struct st_561368_1 {
    char padding_0[4];
    char field_4;
    char padding_5[3];
    unsigned long long field_8;
} st_561368_1;

extern unsigned long long g_e829c0;
extern st_561368_1 *g_f0d538;

void sub_561368(void)
{
    unsigned long long v5;  // x30
    unsigned int v6;  // w9
    unsigned int v15;  // w10
    unsigned int v16;  // w12
    unsigned int v17;  // w14
    unsigned int v18;  // w11
    unsigned int v19;  // w13
    unsigned int v20;  // w11
    unsigned int v21;  // w10
    unsigned int v22;  // w9
    unsigned int v23;  // w10
    unsigned int v24;  // w9
    unsigned int v7;  // w10
    char v25;  // x10
    char v26;  // x12
    char v27;  // x9
    char v28;  // x10
    st_561368_0 *v29;  // x9
    st_561368_0 **v30;  // x10
    unsigned long long v31;  // x11
    unsigned long long v32;  // x9
    unsigned long long v33;  // x12
    unsigned long long v34;  // x10
    unsigned int v8;  // w11
    unsigned long long v35;  // x11
    unsigned long long v36;  // x13
    unsigned long long v37;  // x11
    unsigned long long v38;  // x11
    unsigned long long v39;  // x9
    unsigned int v9;  // w12
    unsigned int v10;  // w9
    unsigned int v11;  // w13
    unsigned int v12;  // w14
    unsigned int v13;  // w9
    unsigned int v14;  // w13
    st_561368_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_561368_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v2 = &v4;
    v3 = v5;
    v1 = &v0;
    v0 = &v1;
    v6 = (char)v1;
    v7 = (char)v0;
    v8 = v6 + v7 + (-(v7 & v6) & ~(v7 | v6)) * 2 + ((v7 | v6) + (-(v7 & v6) | ~(v7 | v6))) * 2;
    v9 = v8 + 2;
    v10 = v9 | v6;
    v11 = -((v9 + v6 ^ -v10) + (v9 + v6 & -v10) * 2);
    v12 = v11 ^ v10;
    v13 = v12 + (v11 & v10) * 2;
    v14 = v13 + 1;
    v15 = (v9 & ~v7) - v8 + (v9 | v7);
    v16 = v15 - 2;
    v17 = (v13 ^ 1) - v14 * 2 + (__ROL__(v12, 1) & 2 & 3);
    v18 = (v15 - 3 ^ ~v13) + ((~v13 | ~(v15 - 3)) + v14) * 2;
    v19 = (v16 + v17 & -(v17 | v16)) * 4 + (v16 + v17 ^ -(v17 | v16)) * 2;
    v20 = v18 + v19 + (v19 | ~v18) + (v18 & ~v19) + 1;
    v21 = v13 & (unsigned int)(1 - v15);
    v22 = (-v13 ^ v16) + (unsigned int)(v16 - v13 - (-v13 | v16)) * 2;
    v23 = (0xffffffff ^ v21 * 2) + v21 * 4 + 2;
    v24 = ~((v22 ^ v23) + (v22 & v23) * 2) + ((v22 ^ v23) + (v22 & v23) * 2) * 2;
    v25 = -v24;
    v26 = (v20 & v24 - 1) - v24;
    v27 = (v26 ^ (char)(v24 - v20) + ((char)v20 | v25)) + (v26 & (char)(v24 - v20) + ((char)v20 | v25)) * 2;
    v28 = ((v25 | (char)~v20) + (char)v20) * 2 + 3;
    g_f0d538->field_4 = (v27 ^ v28) + (v27 & v28) * 2 - 1;
    v29 = v1;
    v30 = v0;
    v31 = v29 + v30 + ~v30 * 2 + (v30 & ~v29) * 2 + 2;
    v32 = ((v31 | v29) - ((v29 | ~v31) + v31) | 1) + ((v31 | v29) - ((v29 | ~v31) + v31) & 1);
    v33 = v32 - 2;
    v34 = v31 - (char *)v30 + 2 * v31 + 0x2 * v30 + 2 * (0xffffffffffffffff ^ v31 * 2) + 0x2 * ~(st_561368_0 **)(v31 + (char *)v30 + (0xffffffffffffffff ^ v31 * 2) + (v31 | ~v30));
    v35 = ~v33;
    v36 = (v35 & ~v34) + (v34 | v33) * 2 + 1;
    v37 = (v33 + v35 * 2 + 1 | v34) + v33;
    v38 = (v36 & ~v37) * 2 - (v37 ^ v36);
    v39 = ((v34 ^ 2 - v32) + (v34 + 1 + (2 - v32 | ~v34)) * 2 | (v34 + 1 + ~v34 * 2 + 1 & v33 - (v34 + 1 + ~v34 * 2) + (v34 + 1 + ~v34 * 2 | ~v33)) * 4 + (v34 + 1 + ~v34 * 2 + 1 ^ v33 - (v34 + 1 + ~v34 * 2) + (v34 + 1 + ~v34 * 2 | ~v33)) * 2) + ((v34 + 1 + ~v34 * 2 + 1 & v33 - (v34 + 1 + ~v34 * 2) + (v34 + 1 + ~v34 * 2 | ~v33)) * 4 + (v34 + 1 + ~v34 * 2 + 1 ^ v33 - (v34 + 1 + ~v34 * 2) + (v34 + 1 + ~v34 * 2 | ~v33)) * 2 & (v34 ^ 2 - v32) + (v34 + 1 + (2 - v32 | ~v34)) * 2);
    g_f0d538->field_8 = v39 + v38 - 1 + (v38 - 1 - v39 & -(v38 - 1 | -v39)) * 4 + ((v38 - 1 - v39 ^ -(v38 - 1 | -v39)) + (-v39 & -v38)) * 2;
    (g_e829c0 - 0x9d5f7b00)();
}
