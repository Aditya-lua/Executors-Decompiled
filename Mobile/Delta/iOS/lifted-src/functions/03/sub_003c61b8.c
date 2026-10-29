/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c61b8..0x3c640c (596 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c61b8_4 {
    char padding_0[64];
    uint128_t field_40;
} st_3c61b8_4;

typedef struct st_3c61b8_1 {
    unsigned long long field_0;
    char padding_8[16];
    unsigned long long field_18;
    char field_20;
    char padding_21[55];
    unsigned int field_58;
} st_3c61b8_1;

typedef struct st_3c61b8_0 {
    char field_0;
} st_3c61b8_0;

extern char g_e6dc30;
extern long long g_f01360;
extern long long g_f03840;
extern void g_f11d30;
extern unsigned long long g_f11d38;
extern char g_10002b0;

unsigned long long sub_3c61b8(void)
{
    st_3c61b8_1 *v21;  // x20
    unsigned long long idx;  // x19
    st_3c61b8_4 **iter;  // x20
    uint128_t v25;  // q1
    uint128_t v26;  // q2
    unsigned long long idx1;  // x8
    unsigned long long v28;  // x0
    long long v29;  // x19
    long long v30;  // x0
    uint128_t v0;  // [bp-0xc0]
    st_3c61b8_0 **v1;  // [bp-0xb0], Other Possible Types: char
    st_3c61b8_0 *v2;  // [bp-0xa8]
    uint128_t v3;  // [bp-0xa0], Other Possible Types: uint128_t
    st_3c61b8_1 *v4;  // [bp-0x90]
    unsigned long long v5;  // [bp-0x90]
    st_3c61b8_1 *v6;  // [bp-0x88]
    st_3c61b8_0 **v7;  // [bp-0x80], Other Possible Types: char
    st_3c61b8_0 *v8;  // [bp-0x78]
    unsigned long long *v9;  // [bp-0x70], Other Possible Types: unsigned long long
    unsigned long long v10;  // [bp-0x70]
    uint128_t v11;  // [bp-0x70]
    unsigned long long v12;  // [bp-0x68]
    unsigned long v13;  // [bp-0x60], Other Possible Types: unsigned long long
    char *v14;  // [bp-0x50], Other Possible Types: uint128_t
    char v15;  // [bp-0x40], Other Possible Types: uint128_t, unsigned long long
    uint128_t v16;  // [bp-0x38], Other Possible Types: long long, unsigned long long
    st_3c61b8_1 *index;  // [bp-0x30], Other Possible Types: unsigned long long
    unsigned long v18;  // [bp-0x28]
    char *v19;  // [bp-0x10]
    char v20;  // [bp+0x0]

    v19 = &v20;
    v18 = *(long long *)&g_10002b0;
    v2 = &v1;
    v1 = &v2;
    v16 = 1;
    index = sub_e3cdc(&v15, 1);
    index->field_0 = &g_e6dc30;
    *(unsigned long long *)&index->padding_8[0] = 0;
    *(unsigned long long *)&index->padding_8[8] = 0;
    index->field_18 = 850045863;
    memset(&index->field_20, 0, 56);
    index->field_58 = (unsigned int)(3.2506e-319 >> 0);
    memset((char *)&index[1].field_0 + 4, 0, 48);
    v21 = index;
    index = 0;
    v4 = &v21->field_18;
    v6 = v21;
    sub_60c14(&v15);
    v3 = 0;
    std::__1::mutex::lock(&g_f03840);
    v5 = 0;
    v15 = 0;
    v0 = *(int128_t *)&g_f11d30;
    *(st_3c61b8_1 **)&g_f11d30 = v4;
    g_f11d38 = v6;
    v9 = 0;
    v15 = v3;
    v3 = v0;
    sub_60b78(sub_60b78(&v15));
    sub_60b78(&v9);
    std::__1::mutex::unlock(&g_f03840);
    idx = *(unsigned long long *)&v3;
    if (idx)
    {
        v8 = &v7;
        v10 = 0;
        v7 = &v8;
        v15 = 0;
        v16 = 0;
        index = 0;
        v12 = 0;
        v13 = 0;
        std::__1::mutex::lock(&g_f01360);
        if (!(sub_e6a04(idx + 67, 1, 4) & 1))
        {
            v15 = *(long long *)(idx + 72);
            v25 = *(int128_t *)(idx + 80);
            v26 = *(int128_t *)(idx + 96);
            *(uint128_t *)(idx + 72) = 0;
            v16 = v25;
            *(uint128_t *)(idx + 88) = 0;
            v11 = v26;
            v13 = *(long long *)(idx + 112);
            for (*(uint128_t *)(idx + 104) = 0; iter != *(unsigned long long *)&*(unsigned long long *)(void*)&v16; iter += 2)
            {
                idx1 = *iter;
                if (idx1)
                {
                    v14 = *(int128_t *)(idx1 + 64);
                    *(unsigned long long *)(idx1 + 64) = 0;
                    *(unsigned long long *)(idx1 + 72) = 0;
                    sub_611fc(&v14);
                    (*iter)[1].padding_0[0] = 0;
                }
            }
        }
        std::__1::mutex::unlock(&g_f01360);
        v14 = &v11;
        sub_d7bcc(&v14);
        v9 = &v15;
        sub_d62c4(&v9);
    }
    sub_60b78(&v3);
    v28 = sub_60b78(&v5);
    if (*(long long *)&g_10002b0 == v18)
        return v28;
    v29 = ___stack_chk_fail();
    v30 = sub_6138(v29);
    sub_60b78(&v3);
    sub_60b78(&v5);
    v29 = __Unwind_Resume(v30);
    __Unwind_Resume(v29);
}
