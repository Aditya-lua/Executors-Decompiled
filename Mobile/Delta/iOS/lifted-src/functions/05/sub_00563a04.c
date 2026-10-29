/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x563a04..0x563cd8 (724 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_563a04_0 {
    char field_0;
} st_563a04_0;

extern unsigned long long g_551ccc;

void sub_563a04(void)
{
    unsigned long long v8;  // x30
    st_563a04_0 *v9;  // x9
    unsigned long long v18;  // x11
    unsigned long long v19;  // x12
    unsigned long long v20;  // x9
    unsigned long long v21;  // x11
    unsigned long long v22;  // x16
    unsigned long long v23;  // x12
    unsigned long long v24;  // x11
    unsigned long long v25;  // x11
    unsigned long long v26;  // x9
    unsigned long long v27;  // x10
    st_563a04_0 **v10;  // x10
    unsigned long long v28;  // x9
    unsigned long long v29;  // x10
    st_563a04_0 *v30;  // x11
    st_563a04_0 **v31;  // x12
    unsigned long long v32;  // x13
    unsigned long long v33;  // x12
    unsigned long long v34;  // x11
    unsigned long long v35;  // x12
    unsigned long long v36;  // x11
    unsigned long long v37;  // x13
    unsigned long long v11;  // x12
    unsigned long long v38;  // x14
    unsigned long long v39;  // x11
    unsigned long long v12;  // x13
    unsigned long long v13;  // x15
    unsigned long long v14;  // x16
    unsigned long long v15;  // x17
    unsigned long long v16;  // x15
    unsigned long long v17;  // x17
    st_563a04_0 **v1;  // [bp-0x30], Other Possible Types: char
    st_563a04_0 *v2;  // [bp-0x28], Other Possible Types: unsigned long long
    unsigned long long v3;  // [bp-0x20]
    unsigned long long *v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    unsigned long long v6;  // [bp-0x8]
    char v7;  // [bp+0x0]

    v5 = &v7;
    v6 = v8;
    v2 = &v1;
    v1 = &v2;
    v3 = &g_551ccc;
    v9 = v2;
    v10 = v1;
    v11 = (v10 - v9 + (v9 & ~v10)) * 2;
    v12 = v11 + v9 - v10;
    v13 = v9 | ~v12;
    v14 = v12 + 1;
    v15 = (v13 ^ v14) + (v13 & v14) * 2;
    v16 = v13 - (char *)v9 + v15 + 3;
    v17 = v16 + ((v9 | v12) + ~v15) * 2;
    v18 = (char *)v10 + 0x2 * ~v10 + 1;
    v19 = v14 + ~v12 * 2 & ~v18;
    v20 = (-((&v9[v11] ^ -(v12 | v10)) + (&v9[v11] & -(v12 | v10)) * 2) ^ &v9[v11 + v18 + v19 + 1]) + (-((&v9[v11] ^ -(v12 | v10)) + (&v9[v11] & -(v12 | v10)) * 2) & &v9[v11 + v18 + v19 + 1]) * 2;
    v21 = (v17 ^ 1) + ~v17 * 2 + ((v16 * 2 | v16 >> 63) & 2 & 3);
    v22 = v20 + v17;
    v23 = v22 + (-v20 & ~v17) * 2 + (v17 + (-v20 | ~v17)) * 2 + 2;
    v24 = (v20 + v21 & -(v21 | v20)) * 4 + (v20 + v21 ^ -(v21 | v20)) * 2 | 1;
    v25 = ~((v24 ^ v23) + (v24 & v23) * 2) + ((v24 ^ v23) + (v24 & v23) * 2) * 2;
    v26 = (~v20 & ~v17) + (v17 | v20) * 2 + 1;
    v27 = v22 + (v20 + 1 - (v20 + 1) * 2 & ~v17);
    v28 = ((v26 & ~v27) * 2 + (v27 ^ ~v26)) * 3 + ((v27 ^ v26) - (v26 & ~v27) * 2) * 4 + 4;
    v29 = (v25 ^ v28 | 0xfffffffffffffffe) + (-((v25 ^ v28) + (v25 & v28) * 2) | 1) + ((v25 ^ v28) + (v25 & v28) * 2) * 2 + 1;
    v30 = v2;
    v31 = v1;
    v32 = v31 + v30;
    v33 = -(v31 | v30);
    v34 = (char *)~v31 + 0x2 * v30 + (v32 ^ v33) + (v31 & ~v30) + 3;
    v35 = v34 + (~(v31 & v30) - (v30 & ~v31) + (v32 & v33)) * 2;
    v36 = (~v35 + v35 * 2 ^ 1) - (v34 | 0xfffffffffffffffe) + v35 - (~v35 + v35 * 2 | 1);
    v37 = v36 - 1;
    v38 = ((~(unsigned int)v37 & 5) + (v37 ^ 0xfffffffffffffffa) ^ v36) + ((~(unsigned int)v37 & 5) + (v37 ^ 0xfffffffffffffffa) & v36) * 2;
    v39 = (v36 + 27 + (-v36 & 0xffffffffffffffe4) ^ v36 + 27 - (v37 & 27)) + (v36 + 27 + (-v36 & 0xffffffffffffffe4) & v36 + 27 - (v37 & 27)) * 2;
    v1 = (v38 ^ (v37 | 5) + 1) + (v38 & (v37 | 5) + 1) * 2 - 1;
    v2 = ~v39 + v39 * 2;
    v4 = (char *)&g_551ccc + (v1 - (v2 + 1) | 0xfffffffffffffffe) + (v1 - (v2 + 1) + (v2 + 1) * 2 & 0xfffffffffffffffe) + (v29 | ~&g_551ccc) + (v29 | 5577932) + 2;
    v4();
}
