/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc13a74..0xc13be0 (364 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c13a74_0 {
    char padding_0[1232];
    struct st_c13a74_1 *field_4d0;
    char padding_4d8[88];
    unsigned short field_530;
} st_c13a74_0;

typedef struct st_c13a74_1 {
    struct st_c13a74_0 *field_0;
    char padding_8[8];
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    uint128_t field_60;
    char padding_70[1128];
    unsigned long long field_4d8;
    char padding_4e0[82];
    unsigned short field_532;
    char padding_534[4];
    unsigned long long field_538;
} st_c13a74_1;


st_c13a74_1 * sub_c13a74(st_c13a74_1 *a0, unsigned long idx, unsigned long a2, uint128_t *a3, unsigned long a4)
{
    unsigned long v9;  // x24
    unsigned long long *v10;  // x27
    unsigned long index;  // x26
    st_c13a74_1 *dst;  // x0
    st_c13a74_1 *v13;  // x8
    unsigned long v14;  // x22
    unsigned long long *v15;  // x23
    unsigned long v16;  // x8
    unsigned long idx1;  // x8
    st_c13a74_0 *v18;  // x10
    uint128_t v0;  // [bp-0xd0]
    uint128_t v1;  // [bp-0xc0]
    uint128_t v2;  // [bp-0xb0]
    uint128_t v3;  // [bp-0xa0]
    uint128_t v4;  // [bp-0x90]
    uint128_t v5;  // [bp-0x80]
    uint128_t v6;  // [bp-0x70]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v9 = a0->field_532;
    v10 = &a0->field_4d8;
    index = idx + 1;
    if (index > v9)
    {
        v10[idx] = a2;
        v4 = a3[4];
        v5 = a3[5];
        v6 = a3[6];
        v0 = *a3;
        v1 = a3[1];
        v2 = a3[2];
        v3 = a3[3];
        dst = a0;
    }
    else
    {
        _memmove(&v10[index]);
        v10[idx] = a2;
        v4 = a3[4];
        v5 = a3[5];
        v6 = a3[6];
        v0 = *a3;
        v1 = a3[1];
        v2 = a3[2];
        v3 = a3[3];
        dst = _memmove(&(&a0->field_0)[14 * index], &(&a0->field_0)[14 * idx], (v9 - idx) * 112);
    }
    v13 = &(&a0->field_0)[14 * idx];
    v13->field_40 = v4;
    v13->field_50 = v5;
    v13->field_60 = v6;
    *(uint128_t *)&v13->field_0 = v0;
    v13->field_10 = v1;
    v13->field_20 = v2;
    v13->field_30 = v3;
    v14 = v9 + 2;
    v15 = &a0->field_538;
    v16 = idx + 2;
    if (v14 > v16)
        dst = _memmove(&v15[v16], &v15[index], (v9 - idx) * 8);
    v15[index] = a4;
    a0->field_532 = (unsigned short)v9 + 1;
    if (v14 <= index)
        return dst;
    idx1 = idx + 168;
    do
    {
        v18 = (&a0->field_0)[idx1];
        v18->field_4d0 = a0;
        v18->field_530 = (unsigned int)idx1 - 167;
        idx1 += 1;
    } while (-v9 + idx1 != 169);
    return dst;
}
