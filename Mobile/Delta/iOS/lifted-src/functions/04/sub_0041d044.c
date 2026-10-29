/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x41d044..0x41d508 (1220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_41d044_0 {
    char field_0;
} st_41d044_0;

extern unsigned long long g_e7fc00;

long long sub_41d044(unsigned int *a0)
{
    unsigned int v8;  // w21
    unsigned int v9;  // w8
    unsigned int v18;  // w9
    unsigned int v19;  // w8
    char v20;  // x8
    unsigned int v21;  // w8
    unsigned int v10;  // w9
    unsigned int v11;  // w10
    unsigned int v12;  // w10
    unsigned int v13;  // w8
    unsigned int v14;  // w8
    unsigned int v15;  // w9
    unsigned int v16;  // w8
    unsigned int v17;  // w8
    st_41d044_0 **v0;  // [bp-0x60], Other Possible Types: char, unsigned int
    st_41d044_0 *v1;  // [bp-0x58], Other Possible Types: unsigned int
    st_41d044_0 **v2;  // [bp-0x50], Other Possible Types: char
    st_41d044_0 *v3;  // [bp-0x48]
    unsigned long long v4;  // [bp-0x40]
    unsigned long long v5;  // [bp-0x38]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v1 = &v0;
    v0 = &v1;
    v8 = a0[12];
    v9 = (unsigned int)v1;
    v10 = (unsigned int)v0;
    v11 = v9 + ~v9 * 2 + 1;
    v12 = (v9 ^ -v10) + (v11 + (v9 & -v10) + (v10 | ~v11)) * 2 + 2;
    v13 = (~v10 - (v9 | ~v10) ^ (v10 | v9)) + (~v10 - (v9 | ~v10) & (v10 | v9)) * 2;
    v14 = v12 + v13;
    v15 = v14 + (v12 + (-v13 | ~v12) + (-v13 & ~v12)) * 2;
    v0 = (v15 + 2 & 0xfffffffe | v14 & 1) + 1;
    v1 = v15 + 3;
    v16 = (v1 + 1 ^ v0) + (v1 + 1 & v0) * 2;
    if (v8 <= ~v16 + v16 * 2)
        return v8 > ~v16 + v16 * 2;
    v17 = v0;
    v18 = (-(v17 * 2) & 54) + (-v17 ^ 27) + (v17 * 2 & 0xffffffc8);
    v19 = (v18 | v17) + ~((v17 | ~v18) + v18);
    v20 = (char)v19 + 2 & ((char)~v19 | 254);
    v21 = a0[13];
    a0[12] = v8 >> ((v20 - 1 ^ 254) + v20 + (v20 & 1) & 31) & 0xff;
    a0[13] = (v21 ^ 2) + (v21 * 2 & 4) - 1;
    v3 = &v2;
    v2 = &v3;
    v4 = 0xff;
    v5 = sub_41d6cc();
    (g_e7fc00 - 0x1cb08200)();
}
