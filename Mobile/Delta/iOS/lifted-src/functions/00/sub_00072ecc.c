/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x72ecc..0x73058 (396 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_72ecc_2 {
    unsigned int field_0;
    char padding_4[92];
    unsigned long long field_60;
    char padding_68[88];
    unsigned short field_c0;
    char padding_c2[6];
    unsigned long long field_c8;
    char padding_d0[408];
    unsigned long long field_268;
} st_72ecc_2;

typedef struct st_72ecc_1 {
    char padding_0[280];
    unsigned int field_118;
    char padding_11c[4];
    char field_120;
    char padding_121[63];
    char field_160;
    char padding_161[23];
    long long field_178;
    char field_180;
    char padding_181[23];
    char field_198;
    char padding_199[63];
    unsigned short field_1d8;
    char padding_1da[6];
    long long field_1e0;
    char field_1e8;
    char padding_1e9[343];
    char field_340;
    char padding_341[63];
    unsigned long long field_380;
} st_72ecc_1;

typedef struct st_72ecc_0 {
    char field_0;
} st_72ecc_0;


long long sub_72ecc(st_72ecc_1 *a0, unsigned int a1)
{
    st_72ecc_2 *v7;  // x21
    unsigned short v8;  // x0
    unsigned long long v9;  // x8
    st_72ecc_0 **v0;  // [bp-0x68], Other Possible Types: char
    st_72ecc_0 *v1;  // [bp-0x60]
    char v2;  // [bp-0x51]
    unsigned long v3;  // [bp-0x50]
    unsigned short v4;  // [bp-0x42]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v0 = &v1;
    std::__1::mutex::lock(&a0->field_120);
    v7 = &a0->field_118;
    if (sub_740a4(v7, 5) == a1)
        return std::__1::mutex::unlock(&a0->field_120);
    switch (a1)
    {
    case 3:
        a0->field_380 = std::__1::chrono::steady_clock::now(std::__1::mutex::lock(&a0->field_340));
        std::__1::mutex::unlock(&a0->field_340);
        v9 = 784;
        break;
    case 1:
        if (a0->field_178)
        {
            v8 = sub_724dc(&a0->field_1d8, 5);
            std::__1::mutex::lock(&a0->field_198);
            std::__1::mutex::unlock(&a0->field_198);
            v4 = v8;
            v3 = sub_75138(&a0->field_1e0, 5);
            v2 = sub_60768(&a0->field_1e8, 5);
            sub_74cd0(&a0->field_160, &v4, &a0->field_180, &v3, &v2);
        }
        std::__1::mutex::lock(&a0->field_198);
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&a0->field_180, "Internal error");
        std::__1::mutex::unlock(&a0->field_198);
        /* unsupported instruction */;
        a0->field_1d8 = 1011;
        /* unsupported instruction */;
        a0->field_1e0 = 0;
        v9 = 488;
        break;
    default:
        goto LABEL_73004;
    }
    sub_60b20(&a0->padding_0[v9], 0, 5);
LABEL_73004:
    /* unsupported instruction */;
    v7->field_0 = a1;
    return std::__1::mutex::unlock(&a0->field_120);
}
