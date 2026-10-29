/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4158dc..0x41596c (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4158dc_0 {
    char field_0;
} st_4158dc_0;


long long sub_4158dc(char a0)
{
    unsigned int v2;  // w8
    unsigned int v3;  // w9
    unsigned int v4;  // w10
    unsigned int v5;  // w8
    unsigned int v7;  // w10
    unsigned int v8;  // w12
    st_4158dc_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_4158dc_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = (unsigned int)v1;
    v3 = (unsigned int)v0;
    v4 = (v2 ^ -v3) + (v3 & ~v2) * 2 + (v2 & -v3) * 2;
    v5 = (v4 | v2) - (v4 & v2);
    v7 = v4 - v3 + (~v4 + (v4 | v3)) * 2 + 2;
    v8 = v5 + 1;
    return (int)((unsigned int)(v8 + (v5 | 0xfffffffd - (v4 - v3 + (~v4 + (v4 | v3)) * 2)) - (v7 | v5)) + (v7 & v8 + ~v5 * 2) * 2) > a0;
}
