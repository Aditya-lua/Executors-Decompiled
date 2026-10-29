/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3b5f4..0x3b720 (300 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3b5f4_1 {
    uint128_t field_0;
    unsigned short field_10;
    char padding_12[6];
    uint128_t field_18;
    unsigned long long field_28;
} st_3b5f4_1;

typedef struct st_3b5f4_0 {
    char field_0;
} st_3b5f4_0;


long long sub_3b5f4(void* a0, st_3b5f4_1 *a1)
{
    long long v11;  // x0
    uint128_t v12;  // q0
    long long v13;  // x20
    long long v14;  // x8
    unsigned long v15;  // x9
    uint128_t v0;  // [bp-0x90]
    st_3b5f4_0 **v1;  // [bp-0x78], Other Possible Types: char
    st_3b5f4_0 *v2;  // [bp-0x70]
    char v3;  // [bp-0x68], Other Possible Types: long long
    long long v4;  // [bp-0x60]
    st_3b5f4_1 *idx;  // [bp-0x58], Other Possible Types: long long, uint128_t
    unsigned long v6;  // [bp-0x50]
    st_3b5f4_0 **v7;  // [bp-0x40], Other Possible Types: char
    st_3b5f4_0 *v8;  // [bp-0x38]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v2 = &v1;
    v1 = &v2;
    v11 = sub_13bcc();
    sub_10900(&v3, v11, 12297829382473034411 * ((long long)a0[8] - *(long long *)a0 >> 4), a0);
    v12 = a1->field_0;
    idx->field_10 = a1->field_10;
    idx->field_0 = v12;
    memset((idx->padding_12)[1], 0, 24);
    *(int128_t *)(idx->padding_12)[1] = *(int128_t *)(a1->padding_12)[1];
    *(long long *)((char *)&idx->field_18 + 8) = *(long long *)((char *)&a1->field_18 + 8);
    memset((a1->padding_12)[1], 0, 24);
    idx = _INSERT(CONCAT(idx, 0), 0, &idx->field_28);
    v8 = &v7;
    v7 = &v8;
    v13 = v4 + *(long long *)a0 - (long long)a0[8];
    sub_48468(a0, *(long long *)a0, (long long)a0[8], v13);
    v14 = *(long long *)a0;
    *(long long *)a0 = v13;
    v15 = (long long)a0[16];
    v0 = idx;
    *(uint128_t *)&a0[8] = idx;
    idx = v14;
    v6 = v15;
    v3 = v14;
    v4 = v14;
    sub_409a0(&v3);
    return (unsigned long long)v0;
}
