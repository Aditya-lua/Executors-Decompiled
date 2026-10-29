/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc294..0xc384 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c294_1 {
    char field_0;
    long long field_1;
} st_c294_1;

typedef struct st_c294_0 {
    char field_0;
} st_c294_0;


long long sub_c294(long long a0)
{
    long long v6;  // x0
    st_c294_1 *v7;  // x20
    char *iter;  // x0
    long long v9;  // w8
    unsigned long long v10;  // x8
    st_c294_1 *v11;  // x8
    char *node;  // x20
    long long v13;  // w9
    unsigned long long v14;  // x10
    st_c294_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_c294_0 *v1;  // [bp-0x38]
    st_c294_0 **v2;  // [bp-0x30], Other Possible Types: char
    st_c294_0 *v3;  // [bp-0x28]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v3 = &v2;
    v2 = &v3;
    v6 = sub_6b08();
    if (!v6)
        return v6;
    v7 = sub_a0c8(a0);
    iter = sub_9c78(a0, 0);
    v9 = v7->field_0;
    if (v9 == 13 && (&v7->field_0)[1] == 10)
        v10 = 2;
    else
        v10 = v9 == 10;
    v11 = &(&v7->field_0)[v10];
    node = iter;
    while (1)
    {
        v13 = v11->field_0;
        if (v13 != 13)
        {
            if (!v13)
                break;
        }
        else
        {
            if ((&v11->field_0)[1] == 10)
            {
                v13 = 10;
                v14 = 2;
                goto LABEL_c324;
            }
        }
        v14 = 1;
LABEL_c324:
        *iter = v13;
        iter += 1;
        v11 = &(&v11->field_0)[v14];
        node += 1;
    }
    return std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::resize(a0, &node[-1 * sub_9c78(a0, 0)], 0);
}
