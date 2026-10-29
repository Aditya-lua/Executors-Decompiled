/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x186bc..0x1885c (416 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_186bc_3 {
    char padding_0[20];
    unsigned long long field_14;
} st_186bc_3;

typedef struct st_186bc_2 {
    char padding_0[88];
    char field_58;
    char padding_59[39];
    char field_80[20];
    char field_84[28];
    char field_90;
    char padding_91[71];
    long long field_d8;
    char padding_e0[72];
    unsigned long long field_128;
    char padding_130[24];
    unsigned long long field_148;
    unsigned long long field_150;
    char padding_158[8];
    long long field_160;
    char padding_168[104];
    unsigned long long field_1d0;
    unsigned long long field_1d8;
    char padding_1e0[8];
    struct st_186bc_1 *field_1e8;
} st_186bc_2;

typedef struct st_186bc_0 {
    char field_0;
} st_186bc_0;

typedef struct st_186bc_1 {
    char padding_0[1184];
    unsigned int field_4a0;
} st_186bc_1;


long long sub_186bc(st_186bc_2 *a0, unsigned long long *a1, long long a2, long long a3)
{
    unsigned long long v11;  // x9
    unsigned long long v12;  // x8
    long long v13;  // x26
    st_186bc_3 *v14;  // x23
    unsigned long v15;  // x0
    long long v16;  // x0
    st_186bc_0 **v0;  // [bp-0xb8], Other Possible Types: char
    st_186bc_0 *v1;  // [bp-0xb0]
    char v2;  // [bp-0xa8], Other Possible Types: unsigned long
    uint128_t v3;  // [bp-0xa0], Other Possible Types: char, unsigned long
    char v4;  // [bp-0x90]
    char v5;  // [bp-0x88]
    char v6;  // [bp-0x78]
    uint128_t v7;  // [bp-0x70]
    uint128_t v8;  // [bp-0x60]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v1 = &v0;
    v0 = &v1;
    v7 = *(int128_t *)&a0->field_80[0];
    v8 = *(int128_t *)&a0->field_80[16];
    sub_f8d0();
    v11 = *(long long *)&a0->padding_168[72];
    v12 = *(long long *)&a0->padding_168[80];
    sub_107a4(a0, "type function name");
    if (!(v6 & 1))
    {
        v2 = *(long long *)&a0->padding_e0[40];
        v3 = *(int128_t *)&a0->field_80[4];
        sub_19994(&v4, &v2);
    }
    *(int *)(*(long long *)&a0->padding_168[96] + 1184) = *(int *)(*(long long *)&a0->padding_168[96] + 1184) + 1;
    v13 = *(long long *)&a0->padding_130[16];
    *(unsigned long long *)&a0->padding_130[16] = (long long)(*(long long *)&a0->padding_130[0] - a0->field_128) >> 3;
    v2 = 0;
    v3 = 0;
    v14 = sub_e5f4(a0, 0, &v7, &v4, 0, &v2, 0, 0);
    *(long long *)&a0->padding_130[16] = v13;
    *(int *)(*(long long *)&a0->padding_168[96] + 1184) = *(int *)(*(long long *)&a0->padding_168[96] + 1184) - 1;
    v2 = *a1;
    v3 = *(long long *)&(v14->padding_0)[1];
    v15 = sub_404c(*(long long *)&a0->padding_91[39], 72);
    sub_5a50(v15, &v2, &v4, &v5, v14, a2, (unsigned long long)(*(long long *)&a0->padding_168[80] - *(long long *)&a0->padding_168[72]) > v12 - v11);
    if (a0->field_58 != 1)
        return v15;
    v16 = sub_404c(*(long long *)&a0->padding_91[39], 20);
    sub_87f0(v16, a3, *(unsigned long long *)((void*)&v7 + 4));
    v2 = v15;
    sub_1c9f0(a0[2].field_80, &v2);
    *(long long *)(sub_12484(a0[2].field_80, &v2) + 8) = v16;
    return v15;
}
