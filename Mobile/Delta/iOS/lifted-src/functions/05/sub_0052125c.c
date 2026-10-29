/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x52125c..0x5213d4 (376 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_52125c_0 {
    char field_0;
} st_52125c_0;

extern unsigned long long g_51f328;

void sub_52125c(void)
{
    unsigned long long v7;  // x30
    st_52125c_0 *v8;  // x9
    unsigned long long v17;  // x8
    st_52125c_0 *v18;  // x10
    unsigned long long v19;  // x12
    unsigned long long v20;  // x10
    st_52125c_0 **v9;  // x10
    unsigned long long v10;  // x11
    unsigned long long v11;  // x12
    unsigned long long v12;  // x13
    unsigned long long v13;  // x9
    unsigned long long v14;  // x10
    unsigned long long v15;  // x11
    unsigned long long v16;  // x9
    st_52125c_0 **v0;  // [bp-0x30], Other Possible Types: char, unsigned long long
    st_52125c_0 *v1;  // [bp-0x28], Other Possible Types: unsigned long long
    unsigned long long v2;  // [bp-0x20]
    unsigned long long *v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v4 = &v6;
    v5 = v7;
    v1 = &v0;
    v0 = &v1;
    v2 = &g_51f328;
    v8 = v1;
    v9 = v0;
    v10 = v9 | v8;
    v11 = &v8[v9 | ~v8];
    v12 = v10 + ~v11;
    v13 = ((v12 | v8) ^ -(v12 & v8)) + ((v12 | v8) & -(v12 & v8)) * 2;
    v14 = (v11 - v10 - (v11 - v10 | v9) ^ (v12 | v9)) + (v11 - v10 - (v11 - v10 | v9) & (v12 | v9)) * 2;
    v15 = (v13 ^ -v14) + (v13 & -v14) * 2 + (v13 + ~v13 * 2 + 1 & v14) * 2 + 1;
    v16 = v14 - v13 + (v14 + ~v14 * 2 + 1 & v13) * 2;
    v17 = (v16 - v15 + (v15 - v16) * 2 ^ 5370664) + (v16 - v15 + (v15 - v16) * 2 & 5370664) * 2;
    v18 = v1;
    v19 = (char *)v18 + 0x2 * ~v18 + 1;
    v20 = (v18 ^ -v0) - (v18 | ~v0) - (char *)v0 + (v0 | v18) + 2 * v19 + 2 * (v18 & -v0) + 2 * (v0 | ~v19) + 2 * (v18 | ~v0) + 0x2 * v0 + -2 * (v0 | v18);
    v0 = ~(((v20 + 3) * 2 & 32) + (v20 + 3 ^ 16)) + (((v20 + 3) * 2 & 32) + (v20 + 3 ^ 16)) * 2;
    v1 = v20 + 20;
    v3 = v1 + v0 + ~v17 + v17 * 2;
    v3();
}
