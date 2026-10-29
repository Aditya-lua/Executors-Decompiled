/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b6428..0x1b6564 (316 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b6428_2 {
    char padding_0[8];
    struct st_1b6428_0 *field_8;
} st_1b6428_2;

typedef struct st_1b6428_0 {
    struct st_1b6428_0 *field_0;
} st_1b6428_0;

typedef struct st_1b6428_1 {
    char field_0;
} st_1b6428_1;


st_1b6428_2 * sub_1b6428(st_1b6428_2 *a0, st_1b6428_0 **a1, st_1b6428_0 **a2)
{
    st_1b6428_0 **i;  // x21
    st_1b6428_2 *v6;  // x19
    st_1b6428_0 **v7;  // x0
    st_1b6428_0 **v8;  // x22
    st_1b6428_2 *v9;  // x0
    st_1b6428_1 **v0;  // [bp-0x68], Other Possible Types: char
    st_1b6428_1 *v1;  // [bp-0x60]
    st_1b6428_0 **v2;  // [bp-0x58]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    i = a1;
    v6 = a0;
    v1 = &v0;
    v0 = &v1;
    if (a0->field_8)
    {
        v7 = sub_1b6908(v6);
        if (v7)
        {
            do
            {
                v8 = v7;
                if (i == a2)
                {
                    v9 = v6;
                    goto LABEL_1b64c4;
                }
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(v8 + 2, i + 2);
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(v8 + 5, i + 5);
                v7 = *v8;
                sub_1b2ae4(v6, v8);
                i = *i;
            } while (*v8);
        }
        v8 = 0;
        v9 = v6;
LABEL_1b64c4:
        a0 = sub_1a42cc(v9, v8);
    }
    for (; i != a2; i = *i)
    {
        sub_1bed74(v6, i + 2);
        sub_1b2ae4(v6, v2);
        v2 = 0;
        a0 = sub_1adcd8(&v2, 0);
    }
    return a0;
}
