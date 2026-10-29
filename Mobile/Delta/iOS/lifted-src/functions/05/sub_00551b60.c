/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x551b60..0x551ccc (364 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_551b60_0 {
    char field_0;
} st_551b60_0;


unsigned int sub_551b60(unsigned int a0, unsigned int a1)
{
    unsigned int v2;  // w8
    unsigned int v3;  // w9
    unsigned int v12;  // w8
    unsigned int v4;  // w10
    unsigned int v5;  // w8
    unsigned int v6;  // w8
    unsigned int v7;  // w8
    unsigned int v8;  // w9
    unsigned int v9;  // w8
    unsigned int v10;  // w10
    unsigned int v11;  // w9
    st_551b60_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned int
    st_551b60_0 *v1;  // [bp-0x8], Other Possible Types: unsigned int

    v1 = &v0;
    v0 = &v1;
    v2 = (unsigned int)v1;
    v3 = (unsigned int)v0;
    v4 = v3 ^ v2;
    v5 = (unsigned int)(v2 + (v3 | ~v2) + v4 - (v3 & v2)) + 1;
    v6 = v5 - v4 + (v4 | ~v5) + (v5 & ~v4);
    v7 = v6 + (v6 & 1) + (~v6 | 0xfffffffe);
    v8 = v7 + 2;
    v9 = (v7 + 178 ^ -(v8 | 176)) + (v7 + 178 & -(v8 | 176)) * 2;
    v10 = (v8 + ~v8 * 2 ^ ~(v8 + ~v8 * 2 + 1 | 5)) + ((v8 + ~v8 * 2 + 1 | 5) & ~(v8 + ~v8 * 2)) * 2;
    v11 = v8 + (v8 & 5) - (0xfffffff5 | v8 * 2);
    v0 = (v9 & (v8 & 176) - ((v8 | 1) + (v8 & 1) + 176)) + (v8 | 1) + (v8 & 1) + 176 + ~(v8 & 176) + (v9 & (v8 | 1) + (v8 & 1) + 176 + ~(v8 & 176));
    v1 = v11 + v10 + (v11 - 6 | ~v10) + (v10 & (unsigned int)(5 - v11)) - 5;
    v12 = (a1 * (v1 + v0) ^ 1) + ~(a1 * (v1 + v0)) * 2 + (__ROL__(a1 * (v1 + v0), 1) & 2 & 3);
    return ((char)v12 + (char)a0 + ((char)(a0 - v12 - (-v12 | a0)) + ((char)-v12 & (char)~a0)) * 2 & 254) + (v12 + a0 | 254) + 1 & 0xff;
}
