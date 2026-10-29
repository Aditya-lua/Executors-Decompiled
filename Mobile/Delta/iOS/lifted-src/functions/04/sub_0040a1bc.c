/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x40a1bc..0x40a340 (388 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_40a1bc_0 {
    char field_0;
} st_40a1bc_0;

extern unsigned long long g_41e3cc;

void sub_40a1bc(void)
{
    unsigned long long v7;  // x30
    st_40a1bc_0 *v8;  // x9
    unsigned long long v17;  // x8
    st_40a1bc_0 *v18;  // x9
    unsigned long long v19;  // x11
    unsigned long long v20;  // x9
    st_40a1bc_0 **v9;  // x10
    unsigned long long v10;  // x11
    unsigned long long v11;  // x11
    unsigned long long v12;  // x13
    unsigned long long v13;  // x9
    unsigned long long v14;  // x10
    unsigned long long v15;  // x12
    unsigned long long v16;  // x9
    st_40a1bc_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_40a1bc_0 *v1;  // [bp-0x28], Other Possible Types: unsigned long long
    unsigned long long v2;  // [bp-0x20]
    unsigned long long *v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v4 = &v6;
    v5 = v7;
    v1 = &v0;
    v0 = &v1;
    v2 = &g_41e3cc;
    v8 = v1;
    v9 = v0;
    v10 = (char *)v8 + 0x2 * ~v8 + 1;
    v11 = v8 - v9 + (v10 + (v9 | ~v10)) * 2 + 2;
    v12 = ~v11;
    v13 = ((v11 | v8) ^ v12 - (v8 | ~v11)) + ((v11 | v8) & v12 - (v8 | ~v11)) * 2;
    v14 = (v12 - (v9 | ~v11) ^ (v11 | v9)) + (v12 - (v9 | ~v11) & (v11 | v9)) * 2;
    v15 = v13 + ~v13 * 2 + 1;
    v16 = v13 - v14 + (v13 ^ -v14) + ((v13 & -v14) + v15 + (v14 | ~v15) + v14 - (v13 | v14)) * 2 + 2;
    v17 = (char *)&g_41e3cc + v16 + (v16 | ~&g_41e3cc) + (4318156 & ~v16) + 1;
    v18 = v1;
    v19 = (char *)v18 + 0x2 * ~v18 + 1;
    v20 = v18 - v0 - (v0 ^ -v18) + (v19 - (v18 & ~v0 | v0 & -v18) + (v0 | ~v19)) * 2;
    v0 = (v20 + 2 ^ 26) + (52 & (v20 + 2) * 2) - 1;
    v1 = v20 + 9;
    v3 = (v17 ^ (v0 | v1) + (v1 & v0) + 1) + (v17 & (v0 | v1) + (v1 & v0) + 1) * 2 - 1;
    v3();
}
