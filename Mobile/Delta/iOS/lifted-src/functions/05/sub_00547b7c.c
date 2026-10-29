/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x547b7c..0x547d0c (400 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_547b7c_0 {
    char field_0;
} st_547b7c_0;


int sub_547b7c(void)
{
    unsigned int v2;  // w8
    unsigned int v3;  // w9
    unsigned int v12;  // w12
    unsigned int v13;  // w8
    unsigned int v14;  // w8
    unsigned int v15;  // w8
    unsigned int v16;  // w9
    unsigned int v17;  // w11
    unsigned int v18;  // w10
    unsigned int v19;  // w12
    unsigned int v20;  // w8
    unsigned int v4;  // w10
    unsigned int v5;  // w12
    unsigned int v6;  // w11
    unsigned int v7;  // w14
    unsigned int v8;  // w10
    unsigned int v9;  // w11
    unsigned int v10;  // w8
    unsigned int v11;  // w8
    st_547b7c_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned int
    st_547b7c_0 *v1;  // [bp-0x8], Other Possible Types: unsigned int

    v1 = &v0;
    v0 = &v1;
    v2 = (unsigned int)v1;
    v3 = (unsigned int)v0;
    v4 = v2 + (v3 | ~v2) + (v3 ^ v2) + 1;
    v5 = v3 | v2;
    v6 = -((v3 + v2 ^ -v5) + (v3 + v2 & -v5) * 2);
    v7 = (v6 & v4) * 2;
    v8 = (v6 ^ ~v4) - v7;
    v9 = (v6 ^ v4) + v7;
    v10 = (v3 ^ -v2) + (v3 + (-v2 | ~v3)) * 2 + 2;
    v11 = v10 + ((v5 & -v3) * 4 + (v5 ^ -v3) * 2 | ~v10) + (v10 | (v5 & -v3) * 4 + (v5 ^ -v3) * 2);
    v12 = v8 - v11;
    v13 = ((v8 | ~v11) + v9) * 2;
    v14 = (v12 + (v9 & v11) * 2 & (unsigned int)(0xfffffffd - v13)) + v13 + 2 + (v12 + (v9 & v11) * 2 & v13 + 2);
    v0 = ~((v14 | 1) + (v12 & 1) + 525052334) + ((v14 | 1) + (v12 & 1) + 525052334) * 2;
    v1 = v14 + (664536436 & ~(v14 * 2)) + (v14 + (332268218 | ~v14)) * 2 + 3962699079;
    v15 = v0;
    v16 = v1;
    v17 = v15 + 1;
    v18 = ((v17 + ~v15 * 2 | v16) ^ -(v17 + ~v15 * 2)) + ((v17 + ~v15 * 2 | v16) & -(v17 + ~v15 * 2)) * 2;
    v19 = v16 + ~v16 * 2 + 1;
    v20 = v17 + v16 + v19 + ~(v19 | v15);
    return v18 + (v20 | ~v18) + (v18 | v20) + 1;
}
