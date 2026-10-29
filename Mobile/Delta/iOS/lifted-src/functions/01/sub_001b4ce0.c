/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b4ce0..0x1b4fc4 (740 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b4ce0_0 {
    char field_0;
} st_1b4ce0_0;


unsigned long long sub_1b4ce0(char *a0, char *a1, long long a2)
{
    char *v9;  // x20
    char *v10;  // x21
    char *v19;  // x25
    char *v20;  // x9
    char *v21;  // x8
    char *v22;  // x9
    char *v23;  // x9
    unsigned long long v25;  // x0
    char *v11;  // x20
    char *v13;  // x23
    char *v14;  // x8
    char *v15;  // x8
    char *v16;  // x24
    unsigned int v17;  // w0
    unsigned long long v18;  // x8
    st_1b4ce0_0 **v0;  // [bp-0xd8], Other Possible Types: char
    st_1b4ce0_0 *v1;  // [bp-0xd0]
    char v2;  // [bp-0xc8]
    char v3;  // [bp-0xb0]
    char v4;  // [bp-0x98]
    char v5;  // [bp-0x80]
    char v6;  // [bp-0x68]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v9 = a1;
    v10 = a0;
    v1 = &v0;
    v0 = &v1;
    v11 = v9;
    if (a1 > a0)
    {
        v11 = v9;
        while (1)
        {
            v9 -= 1;
            if (*(v9 - 1) != 9 && *(v9 - 1) != 32)
                break;
            v11 = v9;
            if (v11 <= v10)
            {
                v11 = v10;
                break;
            }
        }
    }
    v13 = v10;
    if (v11 > v13)
    {
        v14 = v11 - v10;
        v13 = v10;
        while (1)
        {
            v15 = v14;
            if (*v13 == 58)
                break;
            v13 += 1;
            v14 = v15 - 1;
            if (v15 == 1)
            {
                v13 = v11;
                break;
            }
        }
    }
    v16 = v13 - v10;
    sub_181f0(&v6, v10, v13, v16);
    v17 = sub_1b5648(&v6);
    if (v13 == v11)
        v18 = 0;
    else
        v18 = v17;
    if (!(v18 & 1) || *v13 != 58)
        return 0;
    v19 = v13 + 1;
    if (v11 > v19)
    {
        v20 = v11 - v13;
        v21 = v13 + v20;
        v22 = v20 - 1;
        while (1)
        {
            v23 = v22;
            if (*v19 != 9 && *v19 != 32)
                break;
            v19 += 1;
            v22 = v23 - 1;
            if (v23 == 1)
            {
                v19 = v21;
                break;
            }
        }
    }
    if (v13 == v10)
    {
        return 0;
    }
    else if (v11 < v19)
    {
        return 0;
    }
    else
    {
        sub_181f0(&v5, v10, v13, v16);
        sub_181f0(&v4, v19, v11, v11 - v19);
        v25 = sub_1a2a58(&v4);
        if (!(v25 & 1))
            return v25;
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v3, "Location", 8);
        if (sub_1b01e8(&v5, &v3))
        {
LABEL_1b4edc:
            sub_1a51b4(a2 + 56, &v5, &v4);
        }
        else
        {
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v2, "Referer", 7);
            if (sub_1b01e8(&v5, &v2))
                goto LABEL_1b4edc;
            sub_1a9c08(&v4, 0);
            sub_1a51b4(a2 + 56, &v5, &v3);
        }
        return v25;
    }
    return 0;
}
