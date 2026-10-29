/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x52d66c..0x52d7ec (384 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_52d66c_0 {
    char field_0;
} st_52d66c_0;


int sub_52d66c(void)
{
    unsigned int v2;  // w8
    unsigned int v3;  // w9
    unsigned int v12;  // w8
    unsigned int v13;  // w8
    unsigned int v14;  // w10
    unsigned int v4;  // w10
    unsigned int v5;  // w11
    unsigned int v6;  // w10
    unsigned int v7;  // w10
    unsigned int v8;  // w15
    unsigned int v9;  // w12
    unsigned int v10;  // w8
    unsigned int v11;  // w8
    st_52d66c_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_52d66c_0 *v1;  // [bp-0x8], Other Possible Types: unsigned int

    v1 = &v0;
    v0 = &v1;
    v2 = (unsigned int)v1;
    v3 = (unsigned int)v0;
    v4 = (v2 ^ 1) + ~v2 * 2 + (__ROL__(v2, 1) & 2 & 3);
    v5 = v2 - v3;
    v6 = (v4 + v3 & -(v4 | v3)) * 4 + (v4 + v3 ^ -(v4 | v3)) * 2 | 1;
    v7 = (v6 ^ v5) + (v6 & v5) * 2 - 1;
    v8 = v3 + 1;
    v9 = v3 - v2 + (v2 | ~v3) + v8 + (v2 & ~v3) * 2;
    v10 = -((v5 + (v3 | ~v2) ^ v8) + (v5 + (v3 | ~v2) & v8) * 2);
    v11 = (~v9 - (v10 | ~v9)) * 2 - (v10 ^ v9);
    v12 = (v7 ^ v11) + (v7 & v11) * 2 - 1;
    v13 = (v12 * 2 & 4) + (v12 ^ 2);
    v14 = v13 - 1;
    v0 = v13 + v14 + (v14 ^ 3695116967) + (v14 & 599850328) + (v14 & 599850328 ^ 599850328) + (1199700656 & ~(v14 * 2)) + 3695116968;
    v1 = (v13 + 2094095501 ^ -(v14 | 2094095502)) + (v13 + 2094095501 & -(v14 | 2094095502)) * 2 + (v13 + 2094095502 + (-v13 | ~2094095502) | ~((v13 + 2094095501 ^ -(v14 | 2094095502)) + (v13 + 2094095501 & -(v14 | 2094095502)) * 2)) + ((v13 + 2094095501 ^ -(v14 | 2094095502)) + (v13 + 2094095501 & -(v14 | 2094095502)) * 2 | v13 + 2094095502 + (-v13 | ~2094095502)) + 1;
    return (v0 | v1) + (v1 & v0);
}
