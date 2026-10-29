/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc1390c..0xc13a2c (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c1390c_0 {
    char padding_0[1240];
    unsigned long long field_4d8;
    char padding_4e0[82];
    unsigned short field_532;
} st_c1390c_0;

typedef struct st_c1390c_1 {
    struct st_c1390c_0 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
} st_c1390c_1;


double sub_c1390c(st_c1390c_1 *a0, st_c1390c_1 *a1, unsigned long a2, uint128_t *a3)
{
    st_c1390c_0 *v9;  // x23
    unsigned long v10;  // x25
    unsigned long long *v11;  // x27
    unsigned long long idx;  // x24
    unsigned long v13;  // x26
    uint128_t *v14;  // x9
    unsigned long long v15;  // x8
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
    v9 = a1->field_0;
    v10 = v9->field_532;
    v11 = &v9->field_4d8;
    idx = a1->field_10;
    v13 = idx + 1;
    if (v13 > v10)
    {
        v11[idx] = a2;
        v4 = a3[4];
        v5 = a3[5];
        v6 = a3[6];
        v0 = *a3;
        v1 = a3[1];
        v2 = a3[2];
        v3 = a3[3];
    }
    else
    {
        _memmove(&v11[v13]);
        v11[idx] = a2;
        v4 = a3[4];
        v5 = a3[5];
        v6 = a3[6];
        v0 = *a3;
        v1 = a3[1];
        v2 = a3[2];
        v3 = a3[3];
        _memmove(&v9->padding_0[112 * v13], &v9->padding_0[112 * idx], (v10 - idx) * 112);
    }
    v14 = &v9->padding_0[112 * idx];
    v14[4] = v4;
    v14[5] = v5;
    v14[6] = v6;
    *v14 = v0;
    v14[1] = v1;
    v14[2] = v2;
    v14[3] = v3;
    v9->field_532 = (unsigned short)v10 + 1;
    v15 = a1->field_8;
    a0->field_0 = v9;
    a0->field_8 = v15;
    a0->field_10 = idx;
    return *(unsigned long long *)&v3;
}
