/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4ae58..0x4af70 (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4ae58_1 {
    unsigned long long field_0;
    uint128_t field_8;
    unsigned long long field_18;
} st_4ae58_1;

typedef struct st_4ae58_0 {
    char field_0;
} st_4ae58_0;


long long sub_4ae58(void* a0, st_4ae58_1 *a1)
{
    long long v11;  // x0
    long long v12;  // x20
    long long v13;  // x8
    unsigned long v14;  // x9
    uint128_t v0;  // [bp-0x90]
    st_4ae58_0 **v1;  // [bp-0x78], Other Possible Types: char
    st_4ae58_0 *v2;  // [bp-0x70]
    char v3;  // [bp-0x68], Other Possible Types: long long
    long long v4;  // [bp-0x60]
    st_4ae58_1 *idx;  // [bp-0x58], Other Possible Types: long long, uint128_t
    unsigned long v6;  // [bp-0x50]
    st_4ae58_0 **v7;  // [bp-0x40], Other Possible Types: char
    st_4ae58_0 *v8;  // [bp-0x38]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v2 = &v1;
    v1 = &v2;
    v11 = sub_1ed6c();
    sub_1acbc(&v3, v11, 14757395258967641293 * ((long long)a0[8] - *(long long *)a0 >> 3), a0);
    idx->field_0 = a1->field_0;
    *(int128_t *)&(&idx->field_0)[1] = *(int128_t *)&(&a1->field_0)[1];
    *(long long *)((char *)&idx->field_8 + 8) = *(long long *)((char *)&a1->field_8 + 8);
    memset(a1, 0, 24);
    idx = _INSERT(CONCAT(idx, 0), 0, idx + 1);
    v8 = &v7;
    v7 = &v8;
    v12 = v4 + *(long long *)a0 - (long long)a0[8];
    sub_4ac64(a0, *(long long *)a0, (long long)a0[8], v12);
    v13 = *(long long *)a0;
    *(long long *)a0 = v12;
    v14 = (long long)a0[16];
    v0 = idx;
    *(uint128_t *)&a0[8] = idx;
    idx = v13;
    v6 = v14;
    v3 = v13;
    v4 = v13;
    sub_4a334(&v3);
    return (unsigned long long)v0;
}
