/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x41b264..0x41b3b0 (332 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_41b264_0 {
    char field_0;
} st_41b264_0;

extern unsigned long long g_43d7d0;

void sub_41b264(void)
{
    unsigned long long v7;  // x30
    st_41b264_0 *v8;  // x9
    unsigned long long v17;  // x16
    unsigned long long v18;  // x11
    unsigned long long v19;  // x11
    st_41b264_0 **v9;  // x10
    unsigned long long v10;  // x11
    unsigned long long v11;  // x9
    unsigned long long v12;  // x12
    unsigned long long v13;  // x10
    unsigned long long v14;  // x9
    st_41b264_0 *v15;  // x11
    st_41b264_0 **v16;  // x12
    st_41b264_0 **v0;  // [bp-0x30], Other Possible Types: char, unsigned long long
    st_41b264_0 *v1;  // [bp-0x28], Other Possible Types: unsigned long long
    unsigned long long v2;  // [bp-0x20]
    unsigned long long *v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v4 = &v6;
    v5 = v7;
    v1 = &v0;
    v0 = &v1;
    v2 = &g_43d7d0;
    v8 = v1;
    v9 = v0;
    v10 = (v8 ^ -v9) + (v8 & -v9) * 2 + ((char *)v8 + 0x2 * ~v8 + 1 & v9) * 2;
    v11 = (v10 ^ -v8) + (v8 & ~v10 | v10 & -v8) * 2;
    v12 = v10 ^ v9;
    v13 = v12 + (v10 ^ ~v9) * 2 + 1;
    v14 = v12 - v11 + (v13 + (v11 | ~v13)) * 2 + 2;
    v15 = v1;
    v16 = v0;
    v17 = ((v16 | v15) ^ -(v16 & v15)) + ((v16 | v15) & -(v16 & v15)) * 2;
    v18 = v16 - v15 + (v15 & ~v16) * 2;
    v19 = v17 + 1 + v18 + (-v18 & ~v17) * 2 + (v17 + 1 + (-v18 | ~v17)) * 2;
    v0 = v19 + 11;
    v1 = v19 + 19;
    v3 = (char *)&g_43d7d0 + (v1 + 1 ^ v0) + (v11 ^ -v12) + v14 + 2 * (v12 & ~v11) + 2 * (v1 + 1 & v0) + 2 * (v11 & -v12) + 2 * ~v14 + 1;
    v3();
}
