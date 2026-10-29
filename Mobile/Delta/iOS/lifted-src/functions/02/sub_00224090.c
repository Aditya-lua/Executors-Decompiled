/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x224090..0x22421c (396 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_224090_0 {
    char padding_0[8];
    struct st_224090_1 *field_8;
} st_224090_0;

typedef struct st_224090_2 {
    struct st_224090_3 *field_0;
} st_224090_2;

typedef struct st_224090_3 {
    struct st_224090_2 *field_0;
} st_224090_3;

typedef struct st_224090_1 {
    char padding_0[72];
    struct st_224090_1 *field_48;
    struct st_224090_1 *field_50;
} st_224090_1;

extern long long g_f02b48;
extern long long g_f114b8;

long long sub_224090(void)
{
    st_224090_0 *i;  // x0
    st_224090_0 *v0;  // [bp-0xf0]
    char *v1;  // [bp-0xe8]
    unsigned long v2;  // [bp-0xe0]
    char *v3;  // [bp-0xd8]
    st_224090_0 *v4;  // [bp-0xd0]
    st_224090_1 *v5;  // [bp-0xc8]
    st_224090_0 v6;  // [bp-0xc0], Other Possible Types: uint128_t
    double v7;  // [bp-0xb0]
    st_224090_3 **v8;  // [bp-0xa8]
    st_224090_3 **v9;  // [bp-0xa0]
    st_224090_1 *v10;  // [bp-0x98], Other Possible Types: char
    char v11;  // [bp-0x90]
    st_224090_3 **v12;  // [bp-0x60]
    st_224090_3 **v13;  // [bp-0x58]
    char *v14;  // [bp-0x10]
    char v15;  // [bp+0x0]

    v14 = &v15;
    v2 = 0xc4ceb9fe1a85ec53;
    v3 = &v6.padding_0[0];
    v4 = &v6;
    v5 = 0;
    v6 = __double_as_longlong(0) * 0x10000000000000000;
    v7 = 1.6e-322;
    std::__1::mutex::lock(&g_f02b48);
    sub_d6d5c(&v10, &g_f114b8);
    sub_223ab8(&g_f114b8, &v2);
    sub_223ab8(&v2, &v10);
    sub_d294c(&v10);
    std::__1::mutex::unlock(&g_f02b48);
    i = sub_d26e4(&v2);
    v0 = i;
    v1 = &v10;
    if (v4 == i)
        return sub_d294c(&v2);
    do
    {
        if (i->field_8)
        {
            v8 = &v9;
            v9 = &v8;
            v12 = &v13;
            v13 = &v12;
            v10 = i->field_8;
            v11 = 1;
            std::__1::mutex::lock(v10);
            sub_60b20(&v10[1].padding_0[24], 0, 3);
            v10->field_48 = 0;
            *(unsigned int *)&v10->field_50 = 0;
            memset(v10 + 1, 0, 24);
            sub_63c20(&v10);
            i = v0;
        }
        v0 = &i[1].field_8;
        v1 += 1;
        sub_d50b8(&v0);
        i = v0;
    } while (i != v4);
    return sub_d294c(&v2);
}
