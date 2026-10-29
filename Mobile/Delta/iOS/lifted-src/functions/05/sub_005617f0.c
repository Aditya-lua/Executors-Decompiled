/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5617f0..0x5619b4 (452 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5617f0_0 {
    char field_0;
} st_5617f0_0;


unsigned int sub_5617f0(unsigned int a0, unsigned int a1)
{
    unsigned int v2;  // w8
    unsigned int v3;  // w9
    unsigned int v12;  // w10
    unsigned int v13;  // w8
    unsigned int v14;  // w8
    unsigned int v15;  // w9
    unsigned int v16;  // w8
    unsigned int v17;  // w8
    unsigned int v18;  // w8
    unsigned int v19;  // w8
    unsigned int v4;  // w10
    unsigned int v5;  // w11
    unsigned int v6;  // w11
    unsigned int v7;  // w13
    unsigned int v8;  // w10
    unsigned int v9;  // w8
    unsigned int v10;  // w9
    unsigned int v11;  // w12
    st_5617f0_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned int
    st_5617f0_0 *v1;  // [bp-0x8], Other Possible Types: unsigned int

    v1 = &v0;
    v0 = &v1;
    v2 = (unsigned int)v1;
    v3 = (unsigned int)v0;
    v4 = ~v2;
    v5 = (v3 + v4 + (v2 & ~v3)) * 2;
    v6 = v2 - v3 + v5 + 2 + ((unsigned int)(0xfffffffd - v5) & v2 - v3) + (v5 + 2 | ~(v2 - v3)) + 1;
    v7 = v3 + v2;
    v8 = v7 + (v3 + ~v3 * 2 + 1 | v2 + v4 * 2 + 1) + 1;
    v9 = v8 + (v7 ^ -(v3 | v2)) + (v7 & -(v3 | v2)) * 2 + (-((v7 ^ -(v3 | v2)) + (v7 & -(v3 | v2)) * 2) & ~v8) * 2 + (v8 + (-((v7 ^ -(v3 | v2)) + (v7 & -(v3 | v2)) * 2) | ~v8)) * 2;
    v10 = v9 + 2;
    v11 = v6 + ~v6 * 2 + 1;
    v12 = (v10 ^ v6) + (v11 + ((unsigned int)(0xfffffffe - v9) | ~v11) + (v10 & v6)) * 2 + 2;
    v13 = (v6 - v10 + (v11 & v9 + 1)) * 2;
    v14 = v12 + v13 + 2 + ((unsigned int)(0xfffffffd - v13) & v12) + (v13 + 2 | ~v12);
    v15 = v14 + 1;
    v0 = (v14 + 2 ^ (~v15 | 30)) + (v15 | 30) + (v14 + 2 & (~v15 | 30)) * 2;
    v1 = v15 + (0xffffff68 | ~v15) + (v14 + 152 ^ (unsigned int)(0xffffff68 - (v15 + (0xffffff68 | ~v15)))) + (v14 + 152 & (unsigned int)(0xffffff68 - (v15 + (0xffffff68 | ~v15)))) * 2 + 152;
    v16 = a1 * (v0 + (v1 ^ 0xfffffffe) - ~v1 * 2 - (__ROL__(v1, 1) & 2 & 3));
    v17 = v16 + 1;
    v18 = v17 + (v17 + ~v16 * 2 & a0);
    v19 = (v18 ^ v17 + (a0 | ~v16)) + (v18 & v17 + (a0 | ~v16)) * 2;
    return ~v19 + v19 * 2 & 0xff;
}
