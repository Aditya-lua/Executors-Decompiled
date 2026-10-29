/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xd2b24..0xd2c48 (292 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_d2b24_4 {
    uint128_t field_0;
    unsigned long long field_10;
} st_d2b24_4;

typedef struct st_d2b24_5 {
    struct st_d2b24_3 *field_0;
    uint128_t field_8;
    uint128_t field_18;
    unsigned long long field_28;
} st_d2b24_5;

typedef struct st_d2b24_0 {
    char padding_0[64];
    uint128_t field_40;
} st_d2b24_0;

typedef struct st_d2b24_3 {
    struct st_d2b24_0 *field_0;
} st_d2b24_3;

typedef struct st_d2b24_1 {
    char field_0;
} st_d2b24_1;

typedef struct st_d2b24_2 {
    char padding_0[67];
    char field_43;
    char padding_44[4];
    struct st_d2b24_3 *field_48;
    uint128_t field_50;
    uint128_t field_60;
    unsigned long long field_70;
} st_d2b24_2;

extern long long g_f01360;

st_d2b24_2 * sub_d2b24(st_d2b24_2 *a0)
{
    st_d2b24_0 **iter;  // x20
    uint128_t v13;  // q1
    uint128_t v14;  // q2
    st_d2b24_0 *v15;  // x8
    st_d2b24_1 **v0;  // [bp-0x80], Other Possible Types: char
    st_d2b24_1 *v1;  // [bp-0x78]
    uint128_t v2;  // [bp-0x70], Other Possible Types: unsigned long long *
    unsigned long long v3;  // [bp-0x70]
    unsigned long long v4;  // [bp-0x68]
    unsigned long v5;  // [bp-0x60], Other Possible Types: unsigned long long
    st_d2b24_4 *v6;  // [bp-0x58], Other Possible Types: st_d2b24_5 *, unsigned long long
    uint128_t v7;  // [bp-0x50], Other Possible Types: unsigned long long
    unsigned long long v8;  // [bp-0x48]
    char *v9;  // [bp-0x40], Other Possible Types: uint128_t
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v1 = &v0;
    v3 = 0;
    v0 = &v1;
    v6 = 0;
    v7 = 0;
    v8 = 0;
    v4 = 0;
    v5 = 0;
    std::__1::mutex::lock(&g_f01360);
    if (!(sub_e6a04(&a0->field_43, 1, 4) & 1))
    {
        iter = a0->field_48;
        v13 = a0->field_50;
        v14 = a0->field_60;
        *(uint128_t *)&a0->field_48 = 0;
        v7 = v13;
        *(uint128_t *)((char *)&a0->field_50 + 8) = 0;
        v2 = v14;
        v5 = a0->field_70;
        v6 = iter;
        for (*(uint128_t *)((char *)&a0->field_60 + 8) = 0; iter != *(unsigned long long *)&*(unsigned long long *)(void*)&v7; iter += 2)
        {
            v15 = *iter;
            if (v15)
            {
                v9 = v15->field_40;
                *(unsigned long long *)&v15->field_40 = 0;
                *(unsigned long long *)((char *)&v15->field_40 + 8) = 0;
                sub_611fc(&v9);
                (*iter)[1].padding_0[0] = 0;
            }
        }
    }
    std::__1::mutex::unlock(&g_f01360);
    v9 = &v2;
    sub_d7bcc(&v9);
    v2 = &v6;
    sub_d62c4(&v2);
    v6 = &a0->field_60;
    sub_d7bcc(&v6);
    v6 = &a0->field_48;
    sub_d62c4(&v6);
    return a0;
}
