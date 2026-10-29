/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3e963c..0x3e9d14 (1752 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3e963c_0 {
    char field_0;
} st_3e963c_0;

extern unsigned long long g_e803b0;
extern unsigned long long g_e803b8;

void sub_3e963c(unsigned long a0, unsigned long a1)
{
    unsigned long long v15;  // x28
    unsigned long long v16;  // x27
    unsigned long long v25;  // x30
    st_3e963c_0 *v26;  // x8
    st_3e963c_0 **v27;  // x9
    unsigned long long v28;  // x10
    unsigned long v29;  // x10
    unsigned long long v30;  // x11
    unsigned long long v31;  // x8
    unsigned long long v32;  // x9
    unsigned long long v33;  // x11
    unsigned long long v17;  // x26
    unsigned long long v18;  // x25
    unsigned long long v19;  // x24
    unsigned long long v20;  // x23
    unsigned long long v21;  // x22
    unsigned long long v22;  // x21
    unsigned long long v23;  // x20
    unsigned long long v24;  // x19
    st_3e963c_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_3e963c_0 *v1;  // [bp-0x68]
    unsigned long long v2;  // [bp-0x60]
    unsigned long long v3;  // [bp-0x58]
    unsigned long long v4;  // [bp-0x50]
    unsigned long long v5;  // [bp-0x48]
    unsigned long long v6;  // [bp-0x40]
    unsigned long long v7;  // [bp-0x38]
    unsigned long long v8;  // [bp-0x30]
    unsigned long long v9;  // [bp-0x28]
    unsigned long long v10;  // [bp-0x20]
    unsigned long long v11;  // [bp-0x18]
    char *v12;  // [bp-0x10]
    unsigned long long v13;  // [bp-0x8]
    char v14;  // [bp+0x0]

    v2 = v15;
    v3 = v16;
    v4 = v17;
    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = &v14;
    v13 = v25;
    v1 = &v0;
    v0 = &v1;
    v26 = v1;
    v27 = v0;
    v28 = (char *)v26 + 0x2 * ~v26 + 1;
    v29 = (v28 + (v27 | ~v28)) * 2 + 2;
    v30 = v26 - v27 + v29;
    v31 = v29 - (char *)v27 + 2 * (v26 & ~v30);
    v32 = (v30 + (v27 | ~v30) ^ ~(v30 | v27)) + ((v30 | v27) & ~(v30 + (v27 | ~v30))) * 2;
    v33 = v32 | v31;
    if (((v33 ^ -(v32 & v31)) + (v33 & -(v32 & v31)) * 2 ^ (v31 | ~v32) + v32 - v33 + 1) + ((v33 ^ -(v32 & v31)) + (v33 & -(v32 & v31)) * 2 & (v31 | ~v32) + v32 - v33 + 1) * 2 != a1)
        (g_e803b8 - 0x60149800)();
    (g_e803b0 - 0x18df9300)();
}
