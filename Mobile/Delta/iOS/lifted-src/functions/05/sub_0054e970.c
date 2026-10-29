/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x54e970..0x54eab4 (324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_54e970_0 {
    char field_0;
} st_54e970_0;


unsigned int sub_54e970(char a0, char a1)
{
    unsigned int v2;  // w8
    unsigned int v3;  // w9
    unsigned int v4;  // w10
    unsigned int v5;  // w8
    unsigned int v6;  // w8
    unsigned int v7;  // w9
    unsigned int v8;  // w8
    char v9;  // x11
    st_54e970_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned int
    st_54e970_0 *v1;  // [bp-0x8], Other Possible Types: unsigned int

    v1 = &v0;
    v0 = &v1;
    v2 = (unsigned int)v1;
    v3 = (unsigned int)v0;
    v4 = (unsigned int)(v2 - v3 + (v3 | ~v2) + (v3 ^ v2) - (v2 | ~v3)) + 1;
    v5 = (v3 ^ ~-v2) + (~v3 - (-v2 | ~v3)) * 2;
    v6 = (unsigned int)((v4 | 1) - (v2 & ~v3) * 2 + (v4 & 1) - ((v5 | (v2 & ~v3) * 2) + (v5 | ~((v2 & ~v3) * 2)))) + v5 * 2;
    v7 = v6 - 2;
    v8 = (v7 & 173) - v7 + (v6 + 171 ^ -(v7 | 173)) + ((v7 & 0x7fffff52) + (v6 + 171 & -(v7 | 173))) * 2 + 174;
    v0 = ~v8 + v8 * 2;
    v1 = ((v7 | 0xfffffff7) + 9 & (unsigned int)(0xfffffff6 - (v7 + (~v7 | 0xfffffff7)))) + v7 + (~v7 | 0xfffffff7) + 9 + ((v7 | 0xfffffff7) + 9 & v7 + (~v7 | 0xfffffff7) + 9);
    v9 = (char)v0 + 1;
    return a0 + a1 * ((v9 + (char)~v0 * 2 & (char)~v1) + (v9 + (char)v1) * 2 + ((char)v1 + (char)~v1 * 2 + 1 | (char)~v0)) & 0xff;
}
