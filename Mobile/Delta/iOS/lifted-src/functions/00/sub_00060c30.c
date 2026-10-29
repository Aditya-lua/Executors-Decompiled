/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x60c30..0x60dec (444 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_60c30_1 {
    unsigned long long field_0;
    struct st_60c30_2 *field_8;
} st_60c30_1;

typedef struct st_60c30_2 {
    unsigned long long field_0;
    char padding_8[16];
    unsigned long long field_18;
    unsigned long long field_20;
} st_60c30_2;

typedef struct st_60c30_0 {
    char field_0;
} st_60c30_0;

extern char g_e69a08;
extern char g_1000300;

char * sub_60c30(unsigned long a0, long long a1, long long a2, long long a3)
{
    unsigned long long v11;  // w23
    unsigned int v12;  // w24
    unsigned long long v13;  // w0
    long long v14;  // x0
    unsigned long long v15;  // w0
    unsigned long long v16;  // x8
    long long v17;  // x0
    st_60c30_1 *v19;  // x8
    st_60c30_2 *v20;  // x0
    st_60c30_0 **v0;  // [bp-0xb0], Other Possible Types: char
    st_60c30_0 *v1;  // [bp-0xa8]
    unsigned long long v2;  // [bp-0xa0]
    char v3;  // [bp-0x98]
    char v4;  // [bp-0x80]
    unsigned long long v5;  // [bp-0x70], Other Possible Types: unsigned int
    unsigned long long v6;  // [bp-0x68]
    unsigned long long v7;  // [bp-0x60]
    unsigned long long v8;  // [bp-0x50]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v1 = &v0;
    v0 = &v1;
    v7 = 0;
    v8 = 0;
    v5 = 0;
    v11 = 1;
    v6 = 1;
    v12 = 4100;
    if (sub_65528(2, sub_a0c8(a1), &v4) != 1)
    {
        v13 = (unsigned int)sub_65528(30, sub_a0c8(a1), &v4);
        v11 = v13 == 1;
        if (v13 == 1)
            v12 = 4100;
        else
            v12 = 0x1400;
    }
    v5 = v12;
    std::__1::to_string(a2);
    v2 = 0;
    v14 = sub_a0c8(a1);
    v15 = (unsigned int)_getaddrinfo(v14, sub_a0c8(&v3), &v5, &v2);
    if (v15)
        v16 = v11;
    else
        v16 = 1;
    if (!(v16 & 1))
    {
        v5 &= 0xfffffbff;
        v17 = sub_a0c8(a1);
        v15 = (unsigned int)_getaddrinfo(v17, sub_a0c8(&v3), &v5, &v2);
    }
    if (v15)
    {
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign(a3, _gai_strerror());
        v2 = 0;
        v2 = 0;
    }
    v19->field_0 = v2;
    v20 = operatornew(40);
    v20->field_0 = &g_e69a08;
    *(unsigned long long *)&v20->padding_8[0] = 0;
    *(unsigned long long *)&v20->padding_8[8] = 0;
    v20->field_18 = v2;
    v20->field_20 = &g_1000300;
    v19->field_8 = v20;
    return &v3;
}
