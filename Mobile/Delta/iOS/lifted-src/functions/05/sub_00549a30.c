/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x549a30..0x549b5c (300 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_549a30_0 {
    char field_0;
} st_549a30_0;


int sub_549a30(void)
{
    unsigned int v2;  // w8
    unsigned int v3;  // w9
    unsigned int v12;  // w10
    unsigned int v13;  // w8
    unsigned int v4;  // w10
    unsigned int v5;  // w11
    unsigned int v6;  // w9
    unsigned int v7;  // w8
    unsigned int v8;  // w9
    unsigned int v9;  // w8
    unsigned int v10;  // w8
    unsigned int v11;  // w9
    st_549a30_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_549a30_0 *v1;  // [bp-0x8], Other Possible Types: unsigned int

    v1 = &v0;
    v0 = &v1;
    v2 = (unsigned int)v1;
    v3 = (unsigned int)v0;
    v4 = v2 + (v3 | ~v2) + (v3 ^ v2) + (v2 & v3) + ~(v2 & v3) * 2 + 3;
    v5 = v3 + ~v3 * 2 + 1;
    v6 = (v5 + v2 & -(v5 | v2)) * 4 + (v5 + v2 ^ -(v5 | v2)) * 2;
    v7 = (v3 - v2 | v6) + (v6 & v3 - v2);
    v8 = v7 - v4;
    v9 = (v8 | 1) + (v8 | 0xfffffffe) + (v4 - v7) * 2 + 1;
    v0 = (v9 | 1059989887) + ((v9 | 3234977408) + 1059989887) * 2 + ((unsigned int)(0xfffffffe - ((v9 | 3234977408) + 1059989887)) | v9 | 1059989887) + ((unsigned int)(0xfffffffe - ((v9 | 3234977408) + 1059989887)) | ~(v9 | 1059989887)) + 4;
    v1 = ((v9 | 1) + (v8 & 1) + 1030901170 | 1) + ((v9 | 1) + (v8 & 1) + 1030901170 & 1) - 2;
    v10 = v0;
    v11 = v1;
    v12 = v11 & v10;
    v13 = (v11 | v10) + 1;
    return (v13 ^ v12) + (v13 & v12) * 2 - 1;
}
