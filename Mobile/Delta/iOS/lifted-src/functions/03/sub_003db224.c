/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3db224..0x3db3b4 (400 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3db224_0 {
    char field_0;
} st_3db224_0;

extern unsigned int g_fffffffffffffff8;

void sub_3db224(void)
{
    unsigned long long v7;  // x30
    st_3db224_0 *v8;  // x9
    st_3db224_0 **v17;  // x10
    unsigned long long v18;  // x11
    unsigned long long v19;  // x9
    unsigned long long v20;  // x9
    unsigned long long v21;  // x8
    st_3db224_0 **v9;  // x10
    unsigned long long v10;  // x11
    unsigned long long v11;  // x9
    unsigned long long v12;  // x12
    unsigned long long v13;  // x13
    unsigned long long v14;  // x10
    unsigned long long v15;  // x9
    st_3db224_0 *v16;  // x9
    st_3db224_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_3db224_0 *v1;  // [bp-0x28], Other Possible Types: unsigned long long
    unsigned long long v2;  // [bp-0x20]
    unsigned long long *v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v4 = &v6;
    v5 = v7;
    v1 = &v0;
    v0 = &v1;
    v2 = 4042424;
    v8 = v1;
    v9 = v0;
    v10 = v8 - v9 + ((char *)v8 + 0x2 * ~v8 + 1 & v9) * 2;
    v11 = (v10 | v8) + ~((v8 | ~v10) + v10);
    v12 = v10 ^ v9;
    v13 = ((v11 | v12) ^ -(v11 & v12)) + ((v11 | v12) & -(v11 & v12)) * 2;
    v14 = v12 + (v10 ^ ~v9) * 2 + 1;
    v15 = (v12 ^ -v11) + (v14 + (v11 | ~v14) + (v12 & -v11)) * 2;
    v16 = v1;
    v17 = v0;
    v18 = (v16 ^ -v17) + (v17 & ~v16) * 2 + (v16 & -v17) * 2;
    v19 = (char *)v17 + (v16 | ~v17) - (v17 | v16) + 1;
    v20 = (v18 ^ v19) + (v18 + (v19 | ~v18)) * 2 + 2;
    v0 = v20 + (26 | ~v20) + (v20 | 26) + 1;
    v1 = v20 + (v20 & 6) + (~v20 | (char *)&g_fffffffffffffff8 + 1) + 7;
    v21 = (v15 + 2 + 4042424 + v13 + (v13 - (v15 + 2 + (v13 | 0xfffffffffffffffe - v15)) + (0xfffffffffffffffe - v15 & ~v13)) * 2 ^ (v1 + 1 ^ v0) + (v1 + 1 & v0) * 2) + (v15 + 2 + 4042424 + v13 + (v13 - (v15 + 2 + (v13 | 0xfffffffffffffffe - v15)) + (0xfffffffffffffffe - v15 & ~v13)) * 2 & (v1 + 1 ^ v0) + (v1 + 1 & v0) * 2) * 2;
    v3 = ~v21 + v21 * 2;
    v3();
}
