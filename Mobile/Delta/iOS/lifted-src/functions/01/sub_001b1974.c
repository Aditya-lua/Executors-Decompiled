/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b1974..0x1b1abc (328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b1974_2 {
    struct st_1b1974_2 *field_0;
    long long field_8;
} st_1b1974_2;

typedef struct st_1b1974_3 {
    char padding_0[8];
    struct st_1b1974_2 *field_8;
} st_1b1974_3;

typedef struct st_1b1974_0 {
    struct st_1b1974_0 *field_0;
} st_1b1974_0;

typedef struct st_1b1974_1 {
    char field_0;
} st_1b1974_1;


st_1b1974_3 * sub_1b1974(st_1b1974_3 *a0, st_1b1974_0 **a1, st_1b1974_0 **a2)
{
    st_1b1974_0 **j;  // x21
    st_1b1974_3 *v5;  // x0
    st_1b1974_2 *v6;  // x0
    st_1b1974_2 *i;  // x22
    unsigned long v8;  // x24
    long long v9;  // x0
    long long v10;  // x1
    st_1b1974_1 **v0;  // [bp-0x50], Other Possible Types: char
    st_1b1974_1 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    j = a1;
    v1 = &v0;
    v0 = &v1;
    v5 = a0;
    if (v5->field_8)
    {
        v6 = sub_1b6908(a0);
        if (v6)
        {
            i = v6;
            do
            {
                if (j == a2)
                    v5 = sub_1a42cc(a0, i);
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(i + 1, j + 2);
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&i[2].field_8, j + 5);
                v8 = i->field_0;
                v9 = sub_a0c8(i + 1);
                v10 = sub_1a5cdc(a0, v9, sub_6b08(i + 1), 0);
                i->field_8 = v10;
                sub_1b08ec(a0, i, sub_1aa9f4(a0, v10, i + 1));
                j = *j;
                i = v8;
            } while (i);
        }
        v5 = sub_1a42cc(a0, 0);
    }
    for (; j != a2; j = *j)
    {
        v5 = sub_1b7524(a0, j + 2);
    }
    return v5;
}
