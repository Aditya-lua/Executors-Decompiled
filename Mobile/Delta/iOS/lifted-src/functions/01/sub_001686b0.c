/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1686b0..0x1687b0 (256 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1686b0_1 {
    unsigned long long field_0;
    unsigned int field_8;
    char padding_c[4];
    uint128_t field_10;
} st_1686b0_1;

typedef struct st_1686b0_0 {
    char field_0;
} st_1686b0_0;


long long sub_1686b0(void* a0, void* a1)
{
    long long v11;  // x0
    unsigned int v12;  // w9
    long long v13;  // x20
    long long v14;  // x8
    unsigned long v15;  // x9
    uint128_t v0;  // [bp-0x80]
    st_1686b0_0 **v1;  // [bp-0x68], Other Possible Types: char
    st_1686b0_0 *v2;  // [bp-0x60]
    char v3;  // [bp-0x58], Other Possible Types: long long
    long long v4;  // [bp-0x50]
    st_1686b0_1 *idx;  // [bp-0x48], Other Possible Types: long long, uint128_t
    unsigned long v6;  // [bp-0x40]
    st_1686b0_0 **v7;  // [bp-0x30], Other Possible Types: char
    st_1686b0_0 *v8;  // [bp-0x28]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v2 = &v1;
    v1 = &v2;
    v11 = sub_19300();
    sub_12854(&v3, v11, (long long)a0[8] - *(long long *)a0 >> 5, a0);
    v12 = (int)a1[8];
    idx->field_0 = *(long long *)a1;
    idx->field_8 = v12;
    idx->field_10 = (int128_t)a1[16];
    *(unsigned long long *)&a1[16] = 0;
    *(unsigned long long *)&a1[24] = 0;
    idx = _INSERT(CONCAT(idx, 0), 0, idx + 1);
    v8 = &v7;
    v7 = &v8;
    v13 = v4 + *(long long *)a0 - (long long)a0[8];
    sub_165a10(a0, *(long long *)a0, (long long)a0[8], v13);
    v14 = *(long long *)a0;
    *(long long *)a0 = v13;
    v15 = (long long)a0[16];
    v0 = idx;
    *(uint128_t *)&a0[8] = idx;
    idx = v14;
    v6 = v15;
    v3 = v14;
    v4 = v14;
    sub_164824(&v3);
    return (unsigned long long)v0;
}
