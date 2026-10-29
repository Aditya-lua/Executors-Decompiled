/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a5924..0x1a59fc (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a5924_0 {
    char field_0;
} st_1a5924_0;


long long sub_1a5924(unsigned int a0)
{
    unsigned long v14;  // x0
    st_1a5924_0 **v0;  // [bp-0x78], Other Possible Types: char
    st_1a5924_0 *v1;  // [bp-0x70]
    char v2;  // [bp-0x61]
    char *v3;  // [bp-0x60], Other Possible Types: unsigned int
    unsigned short v4;  // [bp-0x5c]
    st_1a5924_0 **v5;  // [bp-0x58]
    char *v6;  // [bp-0x50]
    char *v7;  // [bp-0x48]
    unsigned int v8;  // [bp-0x3c]
    st_1a5924_0 **v9;  // [bp-0x38], Other Possible Types: char
    st_1a5924_0 *v10;  // [bp-0x30]
    unsigned int v11;  // [bp-0x24]
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v1 = &v0;
    v0 = &v1;
    v10 = &v9;
    v9 = &v10;
    v3 = a0;
    v4 = 1;
    v11 = 0;
    v14 = sub_1ac480(&v3, &v11);
    if (!v14)
        return 1;
    if ((long long)v14 < 0 && *(int *)___error() == 9)
        return 0;
    v11 = a0;
    v10 = &v2;
    v9 = 1;
    v8 = 2;
    v3 = &v11;
    v5 = &v10;
    v6 = &v9;
    v7 = &v8;
    return sub_1b5e8c(&v3) > 0;
}
