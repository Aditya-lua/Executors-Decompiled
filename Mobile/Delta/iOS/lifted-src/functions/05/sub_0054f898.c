/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x54f898..0x54fa30 (408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_54f898_0 {
    char field_0;
} st_54f898_0;


int sub_54f898(void)
{
    unsigned int v2;  // w8
    unsigned int v3;  // w9
    unsigned int v12;  // w14
    unsigned int v13;  // w11
    unsigned short v14;  // x8
    unsigned int v15;  // w10
    unsigned int v16;  // w11
    unsigned int v4;  // w10
    unsigned int v5;  // w10
    unsigned int v6;  // w11
    unsigned int v7;  // w8
    unsigned int v8;  // w8
    unsigned int v9;  // w8
    unsigned int v10;  // w8
    unsigned int v11;  // w13
    st_54f898_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned short
    st_54f898_0 *v1;  // [bp-0x8], Other Possible Types: unsigned short

    v1 = &v0;
    v0 = &v1;
    v2 = (unsigned short)v1;
    v3 = (unsigned short)v0;
    v4 = (v2 + (0xffffffff ^ v2 * 2) + v3 & -(v2 + (0xffffffff ^ v2 * 2) | v3)) * 4 + (v2 + (0xffffffff ^ v2 * 2) + v3 ^ -(v2 + (0xffffffff ^ v2 * 2) | v3)) * 2 | 1;
    v5 = (v4 ^ v2 - v3) + (v4 & v2 - v3) * 2 - 1;
    v6 = v3 * 3 + ~v3 * 4 + 3;
    v7 = v2 + ~v2 * 2 + v3;
    v8 = v7 + (((v6 & v2) - (v6 + v2) & v6 + v2) * 4 + ((v6 & v2) - (v6 + v2) ^ v6 + v2) * 2 | (unsigned int)(0xfffffffd - v7)) + (((v6 & v2) - (v6 + v2) & v6 + v2) * 4 + ((v6 & v2) - (v6 + v2) ^ v6 + v2) * 2 | v7 + 2);
    v9 = (v8 + 3 ^ 1) - v8 * 2 + (__ROL__(v8 + 3, 1) & 2 & 3) - 7;
    v10 = (v9 ^ v5) + (v9 & v5) * 2;
    v11 = v10 & 0xffffadfa;
    v12 = v10 + 1;
    v13 = ((v11 ^ 0xffffadfa) + (v10 ^ 20997) ^ v12) + ((v11 ^ 0xffffadfa) + (v10 ^ 20997) & v12) * 2;
    v14 = (unsigned short)v12 + (unsigned short)v11 + (23540 & (unsigned short)~(v10 * 2));
    v0 = ((unsigned short)v10 & 61332 ^ 61333 ^ (unsigned short)v10 + 4203) + ((unsigned short)v10 | 4203) + (((unsigned short)v10 & 61332 ^ 61333) & (unsigned short)v10 + 4203) * 2;
    v1 = v14 + (unsigned short)v13 + ((unsigned short)v13 & (unsigned short)(0xffffadfa - v14)) + (v14 + 20997 | (unsigned short)~v13) + 20998;
    v15 = v0 + ~v0 * 2;
    v16 = v15 + 1 | v1;
    return (v15 ^ ~v16) + (v1 | v0) + (v16 & ~v15) * 2;
}
