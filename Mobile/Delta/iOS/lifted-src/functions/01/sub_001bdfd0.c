/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1bdfd0..0x1be100 (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1bdfd0_0 {
    char field_0;
} st_1bdfd0_0;


long long sub_1bdfd0(void* a0)
{
    unsigned long long t;  // x0
    long long v10;  // x8
    long long v11;  // x10
    unsigned long long v12;  // x9
    unsigned long long v13;  // x8
    unsigned int v14;  // w8
    unsigned long long v15;  // x10
    st_1bdfd0_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_1bdfd0_0 *v1;  // [bp-0x48]
    st_1bdfd0_0 **v2;  // [bp-0x40], Other Possible Types: char
    st_1bdfd0_0 *v3;  // [bp-0x38]
    unsigned int v4;  // [bp-0x2c]
    unsigned int v5;  // [bp-0x28]
    unsigned short v6;  // [bp-0x24]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v1 = &v0;
    v0 = &v1;
    if ((long long)a0[48] > 0)
    {
        t = std::__1::chrono::steady_clock::now();
        v10 = (t - (long long)a0[56]) * -4835703278458516699 >> 64;
        v11 = (unsigned long long)((long long)a0[24] * 2361183241434822607) >> 64;
        v12 = (v11 >> 7) + ((unsigned long long)(v11) >> 63) + 1000 * (long long)a0[16];
        v13 = (v10 >> 18) + ((unsigned long long)(v10) >> 63) + (long long)a0[48];
        if ((long long)v12 >= (long long)v13)
            v12 = v13;
        v3 = &v2;
        v14 = (unsigned int)v12 & ~(unsigned int)((long long)(v12) >> 63);
        v2 = &v3;
        v5 = (int)a0[8];
        v6 = 1;
    }
    else
    {
        v3 = &v2;
        v2 = &v3;
        v5 = (int)a0[8];
        v6 = 1;
        v15 = (unsigned long long)((long long)a0[24] * 2361183241434822607) >> 64;
        v14 = (unsigned int)(v15 >> 7) + (unsigned int)(v15 >> 63) + 1000 * (int)a0[16];
    }
    v4 = v14;
    return sub_1ac480(&v5, &v4) > 0;
}
