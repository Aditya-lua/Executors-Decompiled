/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x41eb58..0x41eca8 (336 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_41eb58_0 {
    char field_0;
} st_41eb58_0;


void sub_41eb58(void)
{
    unsigned long long v7;  // x30
    st_41eb58_0 *v8;  // x8
    unsigned long long v17;  // x9
    unsigned long v18;  // x10
    st_41eb58_0 **v9;  // x10
    unsigned long long v10;  // x11
    unsigned long long v11;  // x10
    unsigned long long v12;  // x8
    st_41eb58_0 *v13;  // x9
    st_41eb58_0 **v14;  // x10
    unsigned long long v15;  // x11
    unsigned long long v16;  // x9
    st_41eb58_0 **v0;  // [bp-0x30], Other Possible Types: char, unsigned long long
    st_41eb58_0 *v1;  // [bp-0x28], Other Possible Types: unsigned long long
    unsigned long long v2;  // [bp-0x20]
    unsigned long long *v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v4 = &v6;
    v5 = v7;
    v1 = &v0;
    v0 = &v1;
    v2 = 0x3fc098;
    v8 = v1;
    v9 = v0;
    v10 = (v8 ^ -v9) + (v9 & ~v8) * 2 + (v8 & -v9) * 2;
    v11 = (v10 + (v9 | ~v10) ^ ~(v10 | v9)) + ((v10 | v9) & ~(v10 + (v9 | ~v10))) * 2;
    v12 = (0x3fc098 | (v10 ^ v8) - v11 + ((v10 ^ v8 | v11) ^ -(v11 & (v10 ^ v8))) + (((v10 ^ v8 | v11) & -(v11 & (v10 ^ v8))) - ((v10 ^ v8) & ~v11)) * 2) + ((v10 ^ v8) - v11 + ((v10 ^ v8 | v11) ^ -(v11 & (v10 ^ v8))) + (((v10 ^ v8 | v11) & -(v11 & (v10 ^ v8))) - ((v10 ^ v8) & ~v11)) * 2 & 0x3fc098);
    v13 = v1;
    v14 = v0;
    v15 = (v13 ^ -v14) + (v13 & -v14 | v14 & ~v13) * 2;
    v16 = -(((v14 | v13) ^ -(v14 & v13)) + ((v14 | v13) & -(v14 & v13)) * 2);
    v17 = (v16 ^ v15) + (v15 + (v16 | ~v15)) * 2;
    v18 = (50 & (v17 + 2) * 2) + (v17 + 2 ^ 25);
    v0 = ~v18 + v18 * 2;
    v1 = v17 + 10;
    v3 = (v12 ^ (v1 + 1 ^ v0) + (v1 + 1 & v0) * 2) + (v12 & (v1 + 1 ^ v0) + (v1 + 1 & v0) * 2) * 2 - 1;
    v3();
}
