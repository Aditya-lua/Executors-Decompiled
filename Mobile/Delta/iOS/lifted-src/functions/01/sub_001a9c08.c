/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a9c08..0x1a9e00 (504 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a9c08_0 {
    char field_0;
} st_1a9c08_0;


long long sub_1a9c08(long long a0, unsigned int a1)
{
    unsigned long v6;  // x8
    unsigned long v7;  // x0
    unsigned long iter;  // x22
    unsigned long v9;  // x23
    unsigned long v10;  // x0
    char *v11;  // x0
    char *v12;  // x0
    char v13;  // x8
    unsigned long v14;  // x0
    st_1a9c08_0 **v0;  // [bp-0x58], Other Possible Types: char
    st_1a9c08_0 *v1;  // [bp-0x50]
    char v2;  // [bp-0x48]
    unsigned int v3;  // [bp-0x44]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    memset(v6, 0, 24);
    v7 = sub_6b08();
    if (!v7)
        return v7;
    iter = 0;
    do
    {
        if (*(char *)sub_2fa10(a0, iter) != 37 || (v9 = iter + 1, sub_6b08(a0) <= v9))
        {
            if (!a1 || *(char *)sub_2fa10(a0, iter) != 43)
                v13 = *(char *)sub_2fa10(a0, iter);
            else
                v13 = 32;
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(v6, v13);
        }
        else if (*(char *)sub_2fa10(a0, v9) == 117)
        {
            v3 = 0;
            if (sub_1bf204(a0, iter + 2, 4, &v3))
            {
                v10 = sub_1b27ac(v3, &v2);
                if (v10)
                    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(v6, &v2, v10);
                iter += 5;
            }
            else
            {
                v11 = sub_2fa10(a0, iter);
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(v6, *v11);
            }
        }
        else
        {
            v3 = 0;
            if (sub_1bf204(a0, v9, 2, &v3))
            {
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(v6, (char)v3);
                iter += 2;
            }
            else
            {
                v12 = sub_2fa10(a0, iter);
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(v6, *v12);
            }
        }
    } while ((iter += 1, v14 = sub_6b08(a0), v14 > iter));
    return v14;
}
