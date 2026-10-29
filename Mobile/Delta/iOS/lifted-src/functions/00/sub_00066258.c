/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x66258..0x663f0 (408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_66258_0 {
    char field_0;
} st_66258_0;


unsigned long long * sub_66258(long long a0, long long a1)
{
    long long v8;  // x22
    long long *v9;  // x8
    st_66258_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_66258_0 *v1;  // [bp-0x58]
    unsigned long long v2;  // [bp-0x50]
    unsigned long long v3;  // [bp-0x48]
    unsigned long long v4;  // [bp-0x40]
    char v5;  // [bp-0x31]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v1 = &v0;
    v2 = 0;
    v0 = &v1;
    v3 = 0;
    v4 = 0;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::reserve(&v2, 64);
    if (sub_66170(a0, &v5, a1) && !(std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(&v2, v5), !sub_66170(a0, &v5, a1)))
    {
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(&v2, v5);
        v8 = 1;
        if (*(char *)sub_9c78(&v2, 0) != 13)
        {
            while (*(char *)sub_9c78(&v2, v8) != 10)
            {
                if (!(sub_66170(a0, &v5, a1) & 1))
                    goto LABEL_66360;
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(&v2, v5);
                v8 += 1;
                if (*(char *)sub_9c78(&v2, v8 - 1) == 13)
                    break;
            }
        }
        *(char *)v9 = 1;
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(v9 + 1, &v2);
    }
    else
    {
LABEL_66360:
        *(char *)v9 = 0;
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(v9 + 1, &v2);
    }
    return &v2;
}
