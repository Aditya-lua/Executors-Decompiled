/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c3e90..0x3c42cc (1084 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c3e90_3 {
    char padding_0[20];
    unsigned int field_14;
} st_3c3e90_3;

typedef struct st_3c3e90_1 {
    unsigned long long field_0;
} st_3c3e90_1;

typedef struct st_3c3e90_2 {
    struct st_3c3e90_1 *field_0;
} st_3c3e90_2;

typedef struct st_3c3e90_0 {
    char field_0;
} st_3c3e90_0;

extern char g_10002b0;

unsigned int sub_3c3e90(unsigned long a0, long long a1)
{
    long long *i;  // x20
    unsigned long long v28;  // x0
    unsigned int v37;  // w28
    unsigned int n;  // w28
    long long v39;  // x0
    unsigned int v40;  // w21
    unsigned int l;  // w21
    unsigned int v42;  // w20
    unsigned int m;  // w20
    unsigned long long v44;  // w19
    long long v45;  // x0
    long long v46;  // x0
    unsigned long long v29;  // x23
    long long v31;  // x0
    long long v32;  // x0
    unsigned int v33;  // w21
    unsigned int j;  // w21
    st_3c3e90_3 **iter;  // x21
    st_3c3e90_3 *v36;  // x27
    st_3c3e90_0 **v0;  // [bp-0x2c8], Other Possible Types: char
    st_3c3e90_0 *v1;  // [bp-0x2c0]
    unsigned long long v2;  // [bp-0x2b8]
    unsigned long long v3;  // [bp-0x2b0]
    unsigned long long v4;  // [bp-0x2a8]
    st_3c3e90_1 **v5;  // [bp-0x2a0], Other Possible Types: st_3c3e90_2 **, unsigned long long
    unsigned long long v6;  // [bp-0x290]
    unsigned int v7;  // [bp-0x280]
    unsigned long v8;  // [bp-0x278]
    st_3c3e90_2 **v9;  // [bp-0x270]
    st_3c3e90_2 **v10;  // [bp-0x268]
    long long *v11;  // [bp-0x260]
    long long *v12;  // [bp-0x258]
    char v13;  // [bp-0x248]
    long long v14;  // [bp-0x238]
    st_3c3e90_3 **v15;  // [bp-0x220]
    st_3c3e90_3 **v16;  // [bp-0x218]
    char v17;  // [bp-0x208]
    long long v18;  // [bp-0x1f8]
    char v19;  // [bp-0x1e0]
    long long v20;  // [bp-0x1d0]
    char v21;  // [bp-0x1b8]
    long long v22;  // [bp-0x1a8]
    char v23;  // [bp-0x190]
    unsigned long v24;  // [bp-0x70]
    char *v25;  // [bp-0x10]
    char v26;  // [bp+0x0]

    v25 = &v26;
    v24 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v8 = a0;
    sub_30d84(a1);
    if (a0)
    {
        sub_3be6a4(&v11);
        if (sub_3c2490(&v11))
        {
            v5 = 0;
            v6 = 0;
            v7 = 0x3f800000;
            sub_3c1cf4(&v11, v8, &v5);
            if (!(v23 & 1) && !(i = v11, i == v12))
            {
                v2 = 0;
                v3 = 0;
                v4 = 0;
                do
                {
                    sub_3c3594(&v2, &v11, *i, 0, 0);
                    i += 1;
                } while (i != v12);
                v28 = sub_3c1888(&v13, &v8);
                v29 = v23 | !v28;
                if (!(v29 & 1))
                {
                    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::reserve(a1, sub_6b08(&v2) + 0x100);
                    v9 = &v10;
                    v10 = &v9;
                    v31 = sub_6b08(a1);
                    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::resize(a1, v31 + 1, 0);
                    *(char *)sub_9c78(a1, v31) = 9;
                    v9 = &v10;
                    v10 = &v9;
                    v32 = sub_6b08(a1);
                    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::resize(a1, v32 + 1, 0);
                    *(char *)sub_9c78(a1, v32) = 3;
                    v33 = v16 - v15 >> 3;
                    v10 = &v9;
                    v9 = &v10;
                    do
                    {
                        j = v33;
                        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(a1, (char)j & 127 | (j > 127) * 128);
                        v33 = j >> 7;
                    } while (127 < j);
                    iter = v15;
                    if (v15 != v16)
                    {
                        do
                        {
                            v36 = *iter;
                            v37 = v36->field_14;
                            v9 = &v10;
                            v10 = &v9;
                            do
                            {
                                n = v37;
                                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(a1, (char)n & 127 | (n > 127) * 128);
                                v37 = n >> 7;
                            } while (127 < n);
                            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(a1, v36 + 1, v36->field_14);
                            iter += 1;
                        } while (iter != v16);
                    }
                    v9 = &v10;
                    v10 = &v9;
                    v39 = sub_6b08(a1);
                    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::resize(a1, v39 + 1, 0);
                    *(char *)sub_9c78(a1, v39) = 0;
                    v40 = v12 - v11 >> 3;
                    v9 = &v10;
                    v10 = &v9;
                    do
                    {
                        l = v40;
                        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(a1, (char)l & 127 | (l > 127) * 128);
                        v40 = l >> 7;
                    } while (127 < l);
                    sub_3c15d4(a1, &v2);
                    v42 = *(int *)(v28 + 24);
                    v10 = &v9;
                    v9 = &v10;
                    do
                    {
                        m = v42;
                        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(a1, (char)m & 127 | (m > 127) * 128);
                        v42 = m >> 7;
                    } while (127 < m);
                }
                v44 = (unsigned int)v29 ^ 1;
            }
            else
            {
                v44 = 0;
            }
            sub_43360(&v5, v6);
            sub_2219c(&v5, 0);
        }
        else
        {
            v44 = 0;
        }
        sub_3be804(&v21, v22);
        sub_2219c(&v21, 0);
        sub_3be718(&v19, v20);
        sub_2219c(&v19, 0);
        sub_43360(&v17, v18);
        sub_2219c(&v17, 0);
        v5 = &v15;
        sub_10344(&v5);
        sub_43360(&v13, v14);
        sub_2219c(&v13, 0);
        v5 = &v11;
        sub_10344(&v5);
    }
    else
    {
        v44 = 0;
    }
    if (*(long long *)&g_10002b0 == v24)
        return v44 & 1;
    v45 = ___stack_chk_fail();
    sub_e1830(&v5);
    sub_3c26c4(&v11);
    v46 = __Unwind_Resume(v45);
    sub_e1830(&v5);
    sub_3c26c4(&v11);
    __Unwind_Resume(v46);
}
