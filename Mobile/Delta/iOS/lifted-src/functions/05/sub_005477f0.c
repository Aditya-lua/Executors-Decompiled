/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5477f0..0x5479d8 (488 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5477f0_0 {
    char field_0;
} st_5477f0_0;


unsigned int sub_5477f0(unsigned int a0, unsigned int a1)
{
    unsigned int v2;  // w8
    unsigned int v3;  // w9
    unsigned int v12;  // w8
    unsigned int v13;  // w9
    unsigned int v14;  // w10
    unsigned int v15;  // w9
    unsigned int v16;  // w9
    unsigned int v17;  // w8
    unsigned int v18;  // w8
    char v19;  // x9
    char v20;  // x10
    unsigned int v4;  // w10
    unsigned int v5;  // w10
    unsigned int v6;  // w10
    unsigned int v7;  // w16
    unsigned int v8;  // w8
    unsigned int v9;  // w8
    unsigned int v10;  // w9
    unsigned int v11;  // w8
    st_5477f0_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned int
    st_5477f0_0 *v1;  // [bp-0x8], Other Possible Types: unsigned int

    v1 = &v0;
    v0 = &v1;
    v2 = (unsigned int)v1;
    v3 = (unsigned int)v0;
    v4 = (v2 ^ 1) + v2 * 2 + ~v2 * 4 + (v2 * 2 & 2) + 2;
    v5 = (v4 + v3 & -(v4 | v3)) * 4 + (v4 + v3 ^ -(v4 | v3)) * 2 | 1;
    v6 = (v5 ^ v2 - v3) + (v5 & v2 - v3) * 2;
    v7 = v3 + 1;
    v8 = v7 + ~v3 * 2 | v2;
    v9 = v3 - v2 + (v3 & v2) + (v2 & ~v3) * 2 + (v8 ^ (unsigned int)(0xfffffffe - v3)) - (v8 & v7) * 2;
    v10 = v6 + v9 + (unsigned int)((v6 - 1 & v9) - (v6 + v9)) * 2;
    v11 = ((-v6 | ~v9) & v6) * 4 + ((-v6 | ~v9) ^ v6) * 2;
    v12 = (v11 | ~v10) + v11 + (~v10 | ~v11);
    v13 = v12 + v10 * 2;
    v14 = v13 + 2;
    v15 = v13 + 3;
    v16 = v15 + ~v14 * 2;
    v17 = (v14 | 1) + (v12 & 1) + (v16 | 0xffffffa7) + 88;
    v0 = v15 + (93 | ~v14) + (v14 ^ 93) + (v13 + 95 ^ -(v14 | 93)) + (v13 + 95 & -(v14 | 93)) * 2;
    v1 = ((v16 | 88) ^ -v16) + ((v16 | 88) & -v16) * 2 + (v17 | ~(((v16 | 88) ^ -v16) + ((v16 | 88) & -v16) * 2)) + (((v16 | 88) ^ -v16) + ((v16 | 88) & -v16) * 2 | v17) + 1;
    v18 = a1 * ((v1 | ~v0) + (v0 + 1) * 2 + (v1 ^ v0) + (v0 + 1 + ~v0 * 2 | v1));
    v19 = (char)v18 | (char)~a0;
    v20 = (char)a0 + 1;
    return v20 + v18 + (v19 ^ v20) + (v19 & v20) * 2 + (v18 + ~v18 * 2 + 1 | ~a0) & 0xff;
}
