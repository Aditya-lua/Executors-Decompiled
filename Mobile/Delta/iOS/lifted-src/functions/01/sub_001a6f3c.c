/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a6f3c..0x1a6ff4 (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a6f3c_0 {
    char field_0;
} st_1a6f3c_0;


int sub_1a6f3c(void* a0)
{
    st_1a6f3c_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_1a6f3c_0 *v1;  // [bp-0x48]
    st_1a6f3c_0 **v2;  // [bp-0x40], Other Possible Types: char
    st_1a6f3c_0 *v3;  // [bp-0x38]
    unsigned int v4;  // [bp-0x2c]
    unsigned int v5;  // [bp-0x28]
    unsigned short v6;  // [bp-0x24]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v1 = &v0;
    v0 = &v1;
    v3 = &v2;
    v2 = &v3;
    v5 = (int)a0[8];
    v6 = 4;
    v4 = (int)((unsigned long long)((long long)a0[40] * 2361183241434822607) >> 71) + (int)((unsigned long long)((long long)a0[40] * 2361183241434822607) >> 127) + 1000 * (int)a0[32];
    if (sub_1ac480(&v5, &v4) < 1)
        return 0;
    return sub_1a5924((int)a0[8]);
}
