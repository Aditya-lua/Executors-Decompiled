/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a088..0x1a1a4 (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a088_1 {
    char padding_0[128];
    char field_80[20];
    char field_84;
    char padding_85[7];
    char field_8c[20];
    char field_90;
    char padding_91[71];
    long long field_d8;
    char padding_e0[112];
    unsigned int *field_150;
    char padding_158[56];
    unsigned long long field_190;
    unsigned long long field_198;
} st_1a088_1;

typedef struct st_1a088_2 {
    char padding_0[48];
    char field_30;
} st_1a088_2;

typedef struct st_1a088_0 {
    char field_0;
} st_1a088_0;


long long sub_1a088(st_1a088_1 *a0)
{
    unsigned long v9;  // x24
    long long v10;  // x0
    long long v11;  // x0
    st_1a088_2 *v12;  // x23
    unsigned long v13;  // x22
    st_1a088_0 **v0;  // [bp-0x90], Other Possible Types: char
    st_1a088_0 *v1;  // [bp-0x88]
    unsigned int v2;  // [bp-0x80], Other Possible Types: unsigned long
    unsigned long v3;  // [bp-0x7c]
    unsigned long v4;  // [bp-0x78]
    uint128_t v5;  // [bp-0x70]
    uint128_t v6;  // [bp-0x60]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v1 = &v0;
    v0 = &v1;
    v9 = *(long long *)&a0->field_80[4];
    sub_f8d0();
    v10 = sub_18934(a0, 0);
    v5 = *(int128_t *)&a0->field_80[0];
    v6 = *(int128_t *)&a0->field_80[16];
    v11 = sub_1f3d4(a0, 293, "while loop");
    *(int *)(*(long long *)&a0->padding_e0[80] - 4) = *(int *)(*(long long *)&a0->padding_e0[80] - 4) + 1;
    v12 = sub_10a78(a0);
    sub_16df8(a0, (unsigned long long)(*(long long *)&a0->padding_158[32] - *(long long *)&a0->padding_158[24]) >> 3);
    *(int *)(*(long long *)&a0->padding_e0[80] - 4) = *(int *)(*(long long *)&a0->padding_e0[80] - 4) - 1;
    v13 = *(long long *)&a0->field_80[12];
    v2 = *(unsigned int *)&v5;
    v3 = *(unsigned long long *)((void*)&v5 + 4);
    v12->field_30 = sub_1e5c4(a0, 296, &v2);
    v2 = v9;
    v4 = v13;
    return sub_6e2c(sub_404c(*(long long *)&a0->padding_91[39], 72), &v2, v10, v12, v11, &v5 | 4);
}
