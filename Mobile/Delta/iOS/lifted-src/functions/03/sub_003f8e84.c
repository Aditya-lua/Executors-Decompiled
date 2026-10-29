/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3f8e84..0x3f8ff0 (364 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3f8e84_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_3f8e84_1;

typedef struct st_3f8e84_0 {
    char field_0;
} st_3f8e84_0;

extern st_3f8e84_1 g_d1c4e8;

long long sub_3f8e84(long long a0, long long a1, unsigned int *a2)
{
    unsigned int v16;  // w8
    unsigned int v17;  // w9
    int v18;  // w9
    int v19;  // w8
    unsigned int v20;  // w8
    unsigned int v21;  // w9
    st_3f8e84_1 *v22;  // x8
    long long v23;  // x0
    long long v24;  // x0
    unsigned long long v25;  // x0
    unsigned long long v0;  // [bp-0xe0]
    unsigned long long v1;  // [bp-0xd8]
    uint128_t v2;  // [bp-0xd0]
    uint128_t v3;  // [bp-0xc0]
    unsigned long v4;  // [bp-0xb0]
    unsigned long long v5;  // [bp-0xa8]
    st_3f8e84_0 **v6;  // [bp-0xa0], Other Possible Types: char
    st_3f8e84_0 *v7;  // [bp-0x98]
    unsigned long v8;  // [bp-0x90]
    unsigned int v9;  // [bp-0x88]
    unsigned long v10;  // [bp-0x80]
    unsigned long long v11;  // [bp-0x78]
    uint128_t v12;  // [bp-0x70]
    uint128_t v13;  // [bp-0x60]
    char *v14;  // [bp-0x10]
    char v15;  // [bp+0x0]

    v14 = &v15;
    sub_40d4c4();
    v12 = v2;
    v13 = v3;
    v7 = &v6;
    v6 = &v7;
    v10 = v4;
    v11 = v5;
    v16 = (unsigned int)v11 + (-((unsigned int)v11 * 2) & 118) + (-((unsigned int)v11 * 2) & 0xffffff88) - 61;
    v17 = 78913 * v16;
    v18 = (int)(((int)v17 < 0 ? v17 + 0x3ffff : v17)) >> 18;
    v19 = ((int)v16 <= 0 ? v18 : v18 + 1);
    v20 = v19 + ((unsigned int)(0xfffffed3 - v19) | 7) + (v19 + 300 | 7);
    v21 = v20 + 301;
    v22 = &(&g_d1c4e8.field_0)[2 * ((int)(((int)v21 < 0 ? v20 + 308 : v21)) >> 3)];
    v8 = v22->field_0;
    v9 = v22->field_8;
    v23 = sub_3f9008(&v12, &v8);
    v24 = sub_3f9008(&v13, &v8);
    v25 = sub_3f9008(&v10, &v8);
    *a2 = -(unsigned int)(v22->field_8 >> 32);
    v0 = ~v25 + v25 * 2;
    v1 = &v8 & 0xffffffff;
    return sub_414ae4(a0, a1, a2, v24 + 1, &v8 & 0xffffffff, v23, &v8 & 0xffffffff);
}
