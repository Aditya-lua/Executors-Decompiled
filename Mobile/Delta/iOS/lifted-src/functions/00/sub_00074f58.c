/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x74f58..0x7512c (468 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_74f58_2 {
    char padding_0[64];
    unsigned short field_40;
    char padding_42[6];
    unsigned long long field_48;
    char padding_50[280];
    unsigned long long field_168;
} st_74f58_2;

typedef struct st_74f58_3 {
    char padding_0[256];
    unsigned short field_100;
    char padding_102[6];
    unsigned long long field_108;
    char padding_110[280];
    unsigned long long field_228;
} st_74f58_3;

typedef struct st_74f58_0 {
    char padding_0[208];
    long long field_d0;
    char field_d8;
    char padding_d9[63];
    char field_118;
    char padding_119[103];
    char field_180;
    char padding_181[23];
    char field_198;
    char padding_199[63];
    unsigned short field_1d8;
    char padding_1da[6];
    long long field_1e0;
    char field_1e8;
    char padding_1e9[207];
    char field_2b8;
    char padding_2b9[7];
    char field_2c0;
    char padding_2c1[63];
    unsigned long long field_300;
} st_74f58_0;

typedef struct st_74f58_1 {
    char field_0;
} st_74f58_1;


unsigned long long sub_74f58(st_74f58_0 *a0, unsigned long long a1, long long a2, long long a3, long long a4)
{
    long long v4;  // x24
    st_74f58_2 *v5;  // x20
    st_74f58_3 *v6;  // x20
    long long v7;  // w0
    unsigned long long v8;  // x0
    st_74f58_1 **v0;  // [bp-0x50], Other Possible Types: char
    st_74f58_1 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a3;
    v1 = &v0;
    v0 = &v1;
    sub_60b20(&a0->field_2b8, 1, 5);
    if (!sub_740a4(&a0->field_118, 5) || sub_740a4(&a0->field_118, 5) == 1)
    {
        v6 = &a0->field_d8;
        std::__1::mutex::lock(v6);
        if (a0->field_d0)
        {
            v7 = (unsigned int)sub_66848(a0->field_d0);
            v8 = std::__1::mutex::unlock(v6);
            if (!v7)
                return v8;
            std::__1::mutex::lock(v6);
            sub_66100(a0->field_d0, 2);
        }
    }
    else
    {
        if (!v4)
            v4 = sub_6b08(a2);
        v5 = &a0->field_198;
        std::__1::mutex::lock(v5);
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&a0->field_180, a2);
        std::__1::mutex::unlock(v5);
        /* unsupported instruction */;
        a0->field_1d8 = a1;
        /* unsupported instruction */;
        a0->field_1e0 = v4;
        sub_60b20(&a0->field_1e8, a4, 5);
        a0->field_300 = std::__1::chrono::steady_clock::now(std::__1::mutex::lock(&a0->field_2c0));
        std::__1::mutex::unlock(&a0->field_2c0);
        sub_72ecc(a0, 0);
        sub_762b4(a0, a1, a2);
        v6 = &a0->field_d8;
        std::__1::mutex::lock(v6);
        sub_66100(a0->field_d0, 1);
    }
    return std::__1::mutex::unlock(v6);
}
