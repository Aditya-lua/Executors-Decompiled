/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x43a8c0..0x43a9fc (316 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_43a8c0_0 {
    char field_0;
} st_43a8c0_0;

extern unsigned long long g_439b98;

void sub_43a8c0(void)
{
    unsigned long long v7;  // x30
    st_43a8c0_0 *v8;  // x9
    unsigned long long v17;  // x12
    unsigned long long v18;  // x12
    st_43a8c0_0 **v9;  // x10
    st_43a8c0_0 **v10;  // x12
    unsigned long long v11;  // x11
    unsigned long long v12;  // x9
    unsigned long long v13;  // x10
    unsigned long long v14;  // x9
    st_43a8c0_0 *v15;  // x12
    st_43a8c0_0 **v16;  // x14
    st_43a8c0_0 **v0;  // [bp-0x30], Other Possible Types: char, unsigned long long
    st_43a8c0_0 *v1;  // [bp-0x28], Other Possible Types: unsigned long long
    unsigned long long v2;  // [bp-0x20]
    unsigned long long *v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v4 = &v6;
    v5 = v7;
    v1 = &v0;
    v0 = &v1;
    v2 = &g_439b98;
    v8 = v1;
    v9 = v0;
    v10 = -v9;
    v11 = (v8 ^ v10) + (v9 & ~v8) * 2 + (v8 & v10) * 2;
    v12 = (v11 | v8) + ~((v8 | ~v11) + v11);
    v13 = (v11 ^ v10) + (v9 & ~v11) * 2 + (v11 & v10) * 2;
    v14 = (v13 ^ -v12) + (v12 & ~v13 | v13 & -v12) * 2;
    v15 = v1;
    v16 = v0;
    v17 = ((v16 | v15) ^ -(v16 & v15)) + ((v16 | v15) & -(v16 & v15)) * 2;
    v18 = (v16 ^ v15) + v17 + (-v17 & ~(v16 ^ v15)) * 2 + ((v16 ^ v15) - (v17 + (v16 ^ v15 | -v17))) * 2;
    v0 = v18 + 8;
    v1 = v18 + 24;
    v3 = (char *)&g_439b98 + v1 + (v0 & ~v1) + (v1 & v0) + ((v13 | v12) ^ -(v13 & v12)) + v14 + 2 * ((v13 | v12) & -(v13 & v12)) + 2 * ~v14 + 2;
    v3();
}
