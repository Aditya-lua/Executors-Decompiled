/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c0994..0x1c0ae8 (340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c0994_1 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    unsigned long long field_30;
    uint128_t field_38;
    unsigned long long field_48;
    unsigned long long field_50;
    char field_55;
} st_1c0994_1;

typedef struct st_1c0994_0 {
    char field_0;
} st_1c0994_0;


long long sub_1c0994(void* a0, st_1c0994_1 *a1)
{
    long long v11;  // x0
    uint128_t v12;  // q1
    unsigned long long v13;  // x9
    long long v14;  // x20
    long long v15;  // x8
    unsigned long v16;  // x9
    uint128_t v0;  // [bp-0x90]
    st_1c0994_0 **v1;  // [bp-0x78], Other Possible Types: char
    st_1c0994_0 *v2;  // [bp-0x70]
    char v3;  // [bp-0x68], Other Possible Types: long long
    long long v4;  // [bp-0x60]
    st_1c0994_1 *idx;  // [bp-0x58], Other Possible Types: long long, uint128_t
    unsigned long v6;  // [bp-0x50]
    st_1c0994_0 **v7;  // [bp-0x40], Other Possible Types: char
    st_1c0994_0 *v8;  // [bp-0x38]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v2 = &v1;
    v1 = &v2;
    v11 = sub_1b59e8();
    sub_1a9350(&v3, v11, 12297829382473034411 * ((long long)a0[8] - *(long long *)a0 >> 5), a0);
    v12 = a1->field_10;
    idx->field_0 = a1->field_0;
    idx->field_10 = v12;
    memset(&idx->field_20, 0, 24);
    idx->field_20 = a1->field_20;
    idx->field_30 = a1->field_30;
    memset(&a1->field_20, 0, 24);
    memset(&(&idx->field_30)[1], 0, 24);
    *(int128_t *)&(&idx->field_30)[1] = *(int128_t *)&(&a1->field_30)[1];
    *(long long *)((char *)&idx->field_38 + 8) = *(long long *)((char *)&a1->field_38 + 8);
    memset(&(&a1->field_30)[1], 0, 24);
    v13 = a1->field_48;
    *(long long *)((char *)&idx->field_48 + 5) = *(long long *)((char *)&a1->field_48 + 5);
    idx->field_48 = v13;
    idx = _INSERT(CONCAT(idx, 0), 0, &idx->field_55);
    v8 = &v7;
    v7 = &v8;
    v14 = v4 + *(long long *)a0 - (long long)a0[8];
    sub_1a3e10(a0, *(long long *)a0, (long long)a0[8], v14);
    v15 = *(long long *)a0;
    *(long long *)a0 = v14;
    v16 = (long long)a0[16];
    v0 = idx;
    *(uint128_t *)&a0[8] = idx;
    idx = v15;
    v6 = v16;
    v3 = v15;
    v4 = v15;
    sub_1a7fb0(&v3);
    return (unsigned long long)v0;
}
