/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x438c9c..0x438e2c (400 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_438c9c_0 {
    char field_0;
} st_438c9c_0;

extern unsigned long long g_417304;

void sub_438c9c(void)
{
    unsigned long long v7;  // x30
    st_438c9c_0 *v8;  // x9
    st_438c9c_0 **v17;  // x10
    unsigned long long v18;  // x11
    unsigned long long v19;  // x9
    unsigned long long v20;  // x9
    unsigned long long v21;  // x11
    unsigned long long v22;  // x9
    unsigned long v23;  // x10
    st_438c9c_0 **v9;  // x10
    unsigned long long v10;  // x11
    unsigned long long v11;  // x9
    unsigned long long v12;  // x10
    unsigned long long v13;  // x11
    unsigned long long v14;  // x9
    unsigned long long v15;  // x8
    st_438c9c_0 *v16;  // x9
    st_438c9c_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_438c9c_0 *v1;  // [bp-0x28], Other Possible Types: unsigned long
    unsigned long long v2;  // [bp-0x20]
    unsigned long long *v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v4 = &v6;
    v5 = v7;
    v1 = &v0;
    v0 = &v1;
    v2 = &g_417304;
    v8 = v1;
    v9 = v0;
    v10 = (v8 ^ -v9) + (v9 & ~v8) * 2 + (v8 & -v9) * 2;
    v11 = ((v10 | v8) ^ -(v10 & v8)) + ((v10 | v8) & -(v10 & v8)) * 2;
    v12 = v10 - (char *)v9 + 2 * (v9 & ~v10);
    v13 = v11 - v12 + (v12 & ~v11) * 2;
    v14 = (v12 | v11) - ((v11 | ~v12) + v12) + v13 + (v13 - ((v12 | v11) + ~((v11 | ~v12) + v12)) - (v13 | -((v12 | v11) + ~((v11 | ~v12) + v12))) + (-((v12 | v11) + ~((v11 | ~v12) + v12)) & ~v13)) * 2;
    v15 = ~((v14 ^ 4289284) + (v14 & 4289284) * 2) + ((v14 ^ 4289284) + (v14 & 4289284) * 2) * 2;
    v16 = v1;
    v17 = v0;
    v18 = v17 | v16;
    v19 = (v18 ^ (char *)~v17 - (v16 | ~v17)) + (v18 & (char *)~v17 - (v16 | ~v17)) * 2;
    v20 = (&(~v16)[-1 * (v17 | ~v16)] ^ v18) + v19 + ((&(~v16)[-1 * (v17 | ~v16)] & v18) + ~v19) * 2;
    v21 = v20 + 2;
    v22 = 0xfffffffffffffffd - v20;
    v23 = (v20 + 1) * 2 + 2;
    v0 = v23 - (v21 & 26) + (v22 | 26) + 27;
    v1 = v23 - (v21 & 6) + (v22 | 6) + 7;
    v3 = (v15 ^ v0 + v1 + 1) + (v15 & v0 + v1 + 1) * 2 - 1;
    v3();
}
