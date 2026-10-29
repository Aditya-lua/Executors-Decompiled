/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x67f54..0x68110 (444 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_67f54_1 {
    char padding_0[88];
    long long field_58;
} st_67f54_1;

typedef struct st_67f54_0 {
    char field_0;
} st_67f54_0;


long long sub_67f54(st_67f54_1 *a0, unsigned int a1)
{
    long long v4;  // x8
    long long v5;  // x19
    unsigned int v6;  // w0
    unsigned long v7;  // x0
    long long v8;  // x0
    long long v9;  // x0
    long long v10;  // x0
    st_67f54_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_67f54_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v5 = v4;
    v1 = &v0;
    v0 = &v1;
    v6 = sub_9625a4(a0->field_58);
    if (1 >= v6 - 7)
    {
        goto LABEL_680dc;
    }
    else
    {
        switch (v6)
        {
        case 6:
            break;
        case 0:
            break;
        case 5:
            v7 = sub_a35cc4();
            if (v7)
            {
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(v5, "OpenSSL failed - ", 0x11);
                v8 = sub_a362b8(v7, 0);
                return std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(v5, v8, _strlen(v8, 0));
            }
            if (a1)
            {
                break;
            }
            else
            {
LABEL_680dc:
                break;
            }
        case 1:
            v9 = sub_a35cc4();
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(v5, "OpenSSL failed - ", 0x11);
            v10 = sub_a362b8(v9, 0);
            return std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(v5, v10, _strlen(v10, 0));
        case 4:
            break;
        default:
            break;
        }
        return std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(v5);
    }
}
