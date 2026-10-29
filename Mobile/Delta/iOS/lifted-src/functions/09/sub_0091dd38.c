/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x91dd38..0x91e084 (844 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_91dd38_0 {
    char field_0;
} st_91dd38_0;

extern unsigned long long g_8b06c4;

void sub_91dd38(void)
{
    unsigned long long v7;  // x30
    st_91dd38_0 *v8;  // x9
    unsigned long long v17;  // x12
    unsigned long long v18;  // x13
    unsigned long long v19;  // x15
    unsigned long long v20;  // x17
    unsigned long long v21;  // x16
    unsigned long long v22;  // x14
    unsigned long long v23;  // x9
    unsigned long long v24;  // x10
    unsigned long long v25;  // x9
    unsigned long long v26;  // x9
    st_91dd38_0 **v9;  // x11
    unsigned long long v27;  // x9
    unsigned long long v28;  // x8
    st_91dd38_0 *v29;  // x9
    st_91dd38_0 **v30;  // x10
    unsigned long long v31;  // x11
    unsigned long long v32;  // x9
    unsigned long long v33;  // x10
    unsigned long long v34;  // x9
    unsigned long long v35;  // x9
    unsigned long long v36;  // x11
    unsigned long long v10;  // x12
    unsigned long long v37;  // x11
    unsigned long long v38;  // x9
    unsigned long long v11;  // x13
    unsigned long long v12;  // x15
    unsigned long long v13;  // x13
    unsigned long long v14;  // x9
    unsigned long long v15;  // x10
    unsigned long long v16;  // x11
    st_91dd38_0 **v0;  // [bp-0x30], Other Possible Types: char, unsigned long long
    st_91dd38_0 *v1;  // [bp-0x28], Other Possible Types: unsigned long
    unsigned long long v2;  // [bp-0x20]
    unsigned long long *v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v4 = &v6;
    v5 = v7;
    v1 = &v0;
    v0 = &v1;
    v2 = &g_8b06c4;
    v8 = v1;
    v9 = v0;
    v10 = ((~v8 & ~v9) + (v8 | v9) * 2 + 1 ^ -((v9 + v8 ^ -(v8 | v9)) + (v9 + v8 & -(v8 | v9)) * 2)) + ((~v8 & ~v9) + (v8 | v9) * 2 + 1 & -((v9 + v8 ^ -(v8 | v9)) + (v9 + v8 & -(v8 | v9)) * 2)) * 2;
    v11 = v10 * 2;
    v12 = &v8[v10];
    v13 = v11 - (v12 + (v10 | ~v8));
    v14 = (((v13 & v12 + ~v11) * 4 + (v13 ^ v12 + ~v11) * 2 | 1) ^ v12 + (-v8 & ~v10) * 2 + (v10 - (char *)&v8[v10 | -v8]) * 2) + (((v13 & v12 + ~v11) * 4 + (v13 ^ v12 + ~v11) * 2 | 1) & v12 + (-v8 & ~v10) * 2 + (v10 - (char *)&v8[v10 | -v8]) * 2) * 2;
    v15 = v14 - 1;
    v16 = (v10 & v9) + (v10 | v9) + ~(v10 & v9) * 2;
    v17 = v16 + 1;
    v18 = v16 + 2;
    v19 = -v14;
    v20 = v14 + v17;
    v21 = v20 + ((v19 & ~v17) + (v19 | ~v17) + v14) * 2;
    v22 = (v15 + (0xffffffffffffffff ^ v15 * 2) & v18) * 2;
    v23 = v20 + (v17 - (v14 + (1 - v14 | v18)) + (1 - v14 & 0x7ffffffffffffffd - v16)) * 2 + 4;
    v24 = (v15 + v17 - v18 * 2 + ~(v15 + v17 - v18 * 2 + (v18 | v19))) * 2;
    v25 = v23 + (v24 | ~v23) + (v23 | v24) + 1;
    v26 = (v21 | v22) + (v22 & v21) + v25 + ~v25 * 2 + 1;
    v27 = (v26 ^ 2) + (v26 * 2 & 4) - 1;
    v28 = (char *)&g_8b06c4 + (v27 | ~&g_8b06c4) + (v27 | 9111236) + 1;
    v29 = v1;
    v30 = v0;
    v31 = &v29[(v30 | ~v29) + (v30 ^ v29) + ((v30 | v29) - 1 ^ v30 + v29) + -2 * (v30 + v29 & -(v30 | v29)) + 2];
    v32 = (((v29 - ((char *)v30 + 0x2 * ~v30 + 1) + ((char *)v30 + 0x2 * ~v30 + 1 | ~v29) & (char *)v30 + 0x2 * ~v30 + 2) * 4 + (v29 - ((char *)v30 + 0x2 * ~v30 + 1) + ((char *)v30 + 0x2 * ~v30 + 1 | ~v29) ^ (char *)v30 + 0x2 * ~v30 + 2) * 2 | 1) ^ v30 - v29) + (((v29 - ((char *)v30 + 0x2 * ~v30 + 1) + ((char *)v30 + 0x2 * ~v30 + 1 | ~v29) & (char *)v30 + 0x2 * ~v30 + 2) * 4 + (v29 - ((char *)v30 + 0x2 * ~v30 + 1) + ((char *)v30 + 0x2 * ~v30 + 1 | ~v29) ^ (char *)v30 + 0x2 * ~v30 + 2) * 2 | 1) & v30 - v29) * 2;
    v33 = (~v32 + v32 * 2 ^ v31) + ((~v32 + v32 * 2 & v31) + (~v32 + v32 * 2 - 1 & v31) - (~v32 + v32 * 2 + v31)) * 2;
    v34 = v32 + ~(v32 - 2 & v31);
    v35 = v33 + ((v34 & v31 - v32 + 1) * 4 + (v34 ^ v31 - v32 + 1) * 2 | ~v33) + (v33 | (v34 & v31 - v32 + 1) * 4 + (v34 ^ v31 - v32 + 1) * 2) + 1;
    v36 = v35 + ~v35 * 2 + 1;
    v37 = v35 + v36 + (~(unsigned int)v36 | 0xffffffffffffffe0);
    v0 = v35 + (v35 * 2 & 4) + (v35 * 2 & 4 ^ 4) - 3;
    v1 = (v35 | 31) + v37 + 33 + (0xffffffffffffffde - v37 | ~(v35 | 31)) + (v37 + 33 & (v35 | 31)) + 1;
    v38 = (v0 + v1 - (v1 & v0) + 1 ^ v1 & v0) + (v0 + v1 - (v1 & v0) + 1 & v1 & v0) * 2 - 1;
    v3 = v28 + (v38 | ~v28) + (v28 | v38) + 1;
    v3();
}
