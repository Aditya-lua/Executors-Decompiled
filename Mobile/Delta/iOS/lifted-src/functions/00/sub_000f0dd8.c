/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xf0dd8..0xf10f4 (796 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_f0dd8_2 {
    char padding_0[40];
    struct st_f0dd8_3 *field_28;
    char padding_30[100];
    unsigned int field_94;
    char padding_98[4];
    unsigned int field_9c;
} st_f0dd8_2;

typedef struct st_f0dd8_5 {
    struct st_f0dd8_4 *field_0;
    char padding_8[4];
    unsigned int field_c;
} st_f0dd8_5;

typedef struct st_f0dd8_4 {
    char padding_0[16];
    unsigned int field_10;
} st_f0dd8_4;

typedef struct st_f0dd8_6 {
    char padding_0[24];
    char field_18;
} st_f0dd8_6;

typedef struct st_f0dd8_1 {
    char padding_0[3];
    char field_3;
    char padding_4[20];
    struct st_f0dd8_2 *field_18;
} st_f0dd8_1;

typedef struct st_f0dd8_3 {
    unsigned int field_0;
} st_f0dd8_3;

typedef struct st_f0dd8_0 {
    char field_0;
} st_f0dd8_0;

extern long long g_c7c2eb;

st_f0dd8_1 * sub_f0dd8(st_f0dd8_1 *a0)
{
    st_f0dd8_2 *v9;  // x20
    long long v18;  // x0
    long long v20;  // x0
    long long v22;  // x0
    long long v24;  // x0
    long long v26;  // x0
    char i;  // x22
    st_f0dd8_6 *v28;  // x8
    long long v11;  // x0
    char v13;  // x21
    st_f0dd8_5 *v14;  // x22
    long long v16;  // x0
    st_f0dd8_0 **v0;  // [bp-0x90], Other Possible Types: char
    st_f0dd8_0 *v1;  // [bp-0x88]
    char v2;  // [bp-0x80]
    st_f0dd8_1 v3;  // [bp-0x68]
    st_f0dd8_0 **v4;  // [bp-0x50], Other Possible Types: char
    st_f0dd8_0 *v5;  // [bp-0x48]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v1 = &v0;
    v0 = &v1;
    if (a0->field_3 & 1)
    {
        v28->padding_0[0] = 0;
        v28->field_18 = 0;
        return a0;
    }
    v9 = a0->field_18;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v3, &g_c7c2eb, 0);
    if (v9->field_94)
    {
        i = 0;
        do
        {
            std::__1::to_string(*(int *)&v9->field_28[i]);
            v11 = sub_a0c8(&v2);
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v3, v11, sub_6b08(&v2));
            i += 1;
        } while (i < v9->field_94);
    }
    if (v9->padding_98)
    {
        v13 = 0;
        do
        {
            v14 = sub_efa18(v9, v13);
            std::__1::to_string(sub_106ec0(v14->field_c));
            v16 = sub_a0c8(&v2);
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v3, v16, sub_6b08(&v2));
            if (v14->field_c != 3)
            {
                if (v14->field_c != 6)
                    continue;
                std::__1::to_string(v14->field_0->field_10);
                v18 = sub_a0c8(&v2);
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v3, v18, sub_6b08(&v2));
            }
            else
            {
                std::__1::to_string();
                v20 = sub_a0c8(&v2);
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v3, v20, sub_6b08(&v2));
            }
        } while ((v13 += 1, v9->padding_98 > v13));
    }
    std::__1::to_string(v9->field_9c);
    v22 = sub_a0c8(&v2);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v3, v22, sub_6b08(&v2));
    std::__1::to_string(v9->field_94);
    v24 = sub_a0c8(&v2);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v3, v24, sub_6b08(&v2));
    std::__1::to_string((unsigned long long)v9->padding_98);
    v26 = sub_a0c8(&v2);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v3, v26, sub_6b08(&v2));
    sub_2b1d1c(&v3);
    v5 = &v4;
    v4 = &v5;
    sub_5c38(v28, &v2);
    v28->field_18 = 1;
    return &v3;
}
