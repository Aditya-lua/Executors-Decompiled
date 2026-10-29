/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x41f164..0x41f3fc (664 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_41f164_0 {
    char field_0;
} st_41f164_0;

extern unsigned long long g_43ff2c;
extern unsigned long long g_fffffffffffffff0;

void sub_41f164(void)
{
    unsigned long long v8;  // x30
    st_41f164_0 *v9;  // x9
    unsigned long long v18;  // x14
    unsigned long long v19;  // x9
    unsigned long v20;  // x13
    unsigned long long v21;  // x13
    unsigned long long v22;  // x10
    unsigned long long v23;  // x9
    unsigned long long v24;  // x10
    unsigned long long v25;  // x10
    st_41f164_0 *v26;  // x12
    st_41f164_0 **v27;  // x13
    st_41f164_0 **v10;  // x10
    unsigned long long v28;  // x14
    unsigned long long v29;  // x15
    unsigned long long v30;  // x12
    unsigned long long v31;  // x12
    unsigned long long v32;  // x13
    unsigned long long v33;  // x12
    unsigned long long v34;  // x12
    unsigned long long v35;  // x13
    unsigned long long v36;  // x14
    unsigned long long v37;  // x15
    st_41f164_0 **v11;  // x11
    unsigned long long v12;  // x12
    unsigned long long v13;  // x15
    unsigned long long v14;  // x12
    unsigned long long v15;  // x13
    unsigned long long v16;  // x12
    unsigned long long v17;  // x13
    st_41f164_0 **v1;  // [bp-0x30], Other Possible Types: char, unsigned long long
    st_41f164_0 *v2;  // [bp-0x28], Other Possible Types: unsigned long long
    unsigned long long v3;  // [bp-0x20]
    unsigned long long *v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    unsigned long long v6;  // [bp-0x8]
    char v7;  // [bp+0x0]

    v5 = &v7;
    v6 = v8;
    v2 = &v1;
    v1 = &v2;
    v3 = &g_43ff2c;
    v9 = v2;
    v10 = v1;
    v11 = -v10;
    v12 = &v9[0xffffffffffffffff ^ v9 * 2] & v10;
    v13 = v12 * 2;
    v14 = (v9 ^ v11) + (v9 - v10 - (v9 | v11)) * 2 + v12 * 4 + 2;
    v15 = v14 + ~v13;
    v16 = v13 - v14 + v15 * 2;
    v17 = (v15 - 1 | v9) - v15 + v16;
    v18 = v17 + 1;
    v19 = -(v16 & v9);
    v20 = (v17 + (0x7ffffffffffffffe - v17 | v19)) * 2 + 4;
    v21 = (v18 ^ v19) + v20;
    v22 = (v16 ^ v11) + ((v16 | v10) ^ -v16) * 2 + ((v16 | v10) & -v16) * 4 + (v16 - (char *)v10 - (v16 | v11)) * 2;
    v23 = (((v18 ^ ~v19) - v20 | v22) + v21 ^ ~(v21 | v22)) + ((v21 | v22) & ~(((v18 ^ ~v19) - v20 | v22) + v21)) * 2;
    v24 = v21 + (v21 & v22) - (v22 + (v21 & v22) + (v21 & ~v22) * 2);
    v25 = (v24 ^ v23 | 0xfffffffffffffffe) + (v24 ^ v23) + (v24 & v23) * 2 + (v24 ^ v23) + (v24 & v23) * 2 - ((v24 ^ v23) + (v24 & v23) * 2 - 1 | 1) + 1;
    v26 = v2;
    v27 = v1;
    v28 = v27 + v26;
    v29 = v28 + ((char *)v27 + 0x2 * ~v27 + 1 | (char *)v26 + 0x2 * ~v26 + 1);
    v30 = -((v28 ^ -(v27 | v26)) + (v28 & -(v27 | v26)) * 2);
    v31 = (-((v29 + 1 ^ v30) + (v29 + 2 + (v30 | ~(v29 + 1))) * 2) ^ (v29 + 1 ^ -(v27 & v26)) + (v29 + 2 + (-(v27 & v26) | ~(v29 + 1))) * 2) + (-((v29 + 1 ^ v30) + (v29 + 2 + (v30 | ~(v29 + 1))) * 2) & (v29 + 1 ^ -(v27 & v26)) + (v29 + 2 + (-(v27 & v26) | ~(v29 + 1))) * 2) * 2;
    v32 = ((v31 | 0xffffffffffffffec) + 20 ^ v31 + (v31 & 19) - (0xffffffffffffffd9 | v31 * 2) - 19) + ((v31 | 0xffffffffffffffec) + 20 & v31 + (v31 & 19) - (0xffffffffffffffd9 | v31 * 2) - 19) * 2;
    v33 = (v31 + 14 + ((char *)&g_fffffffffffffff0 + 2 & ~v31) ^ v31 + 14 - (v31 & 13)) + (v31 + 14 + ((char *)&g_fffffffffffffff0 + 2 & ~v31) & v31 + 14 - (v31 & 13)) * 2;
    v1 = ~v32 + v32 * 2;
    v2 = ~v33 + v33 * 2;
    v34 = v1;
    v35 = v2;
    v36 = v34 + 1;
    v37 = ((v35 | ~v34) ^ v36) + ((v35 | ~v34) & v36) * 2;
    v4 = (v37 ^ v35 + v36 - (v35 & v34)) + (char *)&g_43ff2c + 2 * (v37 & v35 + v36 - (v35 & v34)) + v25 + (0x43ff2c & ~v25) + (v25 | ~&g_43ff2c);
    v4();
}
