/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x66e64..0x670d8 (628 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_66e64_1 {
    char padding_0[4];
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
    unsigned int field_10;
    char padding_14[12];
    long long field_20;
} st_66e64_1;

typedef struct st_66e64_0 {
    char field_0;
} st_66e64_0;


unsigned long long sub_66e64(st_66e64_1 *a0, long long a1, unsigned long a2)
{
    unsigned long long sock;  // x0
    unsigned long long v10;  // x20
    unsigned long long v11;  // 4112
    unsigned int i;  // w22
    unsigned long long v14;  // x0
    long long msg1;  // x0
    long long msg2;  // x0
    long long v0;  // [bp-0x90]
    st_66e64_0 **v1;  // [bp-0x88], Other Possible Types: char
    st_66e64_0 *v2;  // [bp-0x80]
    st_66e64_0 **v3;  // [bp-0x78], Other Possible Types: char
    char *v4;  // [bp-0x60], Other Possible Types: unsigned long long
    unsigned int v5;  // [bp-0x48]
    unsigned int v6;  // [bp-0x44]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v2 = &v1;
    v1 = &v2;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign(a1, "no error");
    sock = _socket(a0->field_4, a0->field_8, a0->field_c);
    if (!(sock >> 31 & 1))
    {
        v10 = sock;
        v4 = &v3;
        v3 = &v4;
        v6 = 1;
        _setsockopt();
        v0 = 4;
        _fcntl(v10, 4);
        v5 = 1;
        _setsockopt(v10, 0xffff, 0x1022, &v5, 4);
        v11 = arm64g_calculate_condition(0x11, _connect(v10, a0->field_20, a0->field_10) & 0xffffffff, 1, 0);
        if (v11 & 1 || sub_668c0() & 1)
        {
            do
            {
                if (*(long long *)(a2 + 24) && sub_60b58(a2))
                {
                    sub_66844(v10);
                    goto LABEL_66fd8;
                }
                v4 = 0;
                i = sub_65dac(0, 10, v10, &v4);
                sub_63c08(&v4, 0);
            } while (i == 2);
            if (i == 1)
                return v10;
            v14 = v10;
            if (i == 3)
            {
                sub_66844(v14);
                msg1 = _strerror(sub_66158(std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v3, "Connect error: ", 15), "Connect error: ", 15));
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v3, msg1, _strlen(msg1));
            }
            else
            {
                sub_66844(v14);
                msg2 = _strerror(sub_66158(std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v3, "Connect error: ", 15), "Connect error: ", 15));
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v3, msg2, _strlen(msg2));
            }
            sub_5c38(&v4);
            sub_5ccc(a1, &v4);
        }
        else
        {
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign(a1, _strerror(sub_66158()));
            sub_66844(v10);
        }
    }
    else
    {
LABEL_66fd8:
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign(a1);
    }
    return 0xffffffff;
}
