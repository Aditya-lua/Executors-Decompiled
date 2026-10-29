/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b2214..0x1b2438 (548 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b2214_1 {
    struct st_1b2214_2 *field_0;
    long long field_8;
    char padding_10[8];
    struct st_1b2214_2 *field_18;
} st_1b2214_1;

typedef struct st_1b2214_2 {
    char padding_0[1];
    char field_1;
    char padding_2[2];
    char field_4;
    char padding_5[3];
    char field_8;
    char field_9;
} st_1b2214_2;

typedef struct st_1b2214_0 {
    char field_0;
} st_1b2214_0;

extern char g_10002b0;

unsigned long long sub_1b2214(char *a0, long long a1)
{
    char *v15;  // x23
    st_1b2214_1 *v16;  // x23
    unsigned long long v22;  // x0
    long long v23;  // x0
    long long v24;  // x0
    char *v17;  // x8
    char *v18;  // w9
    char *v19;  // x22
    char *v20;  // x22
    long long v21;  // x8
    st_1b2214_0 **v0;  // [bp-0xe8], Other Possible Types: char
    st_1b2214_0 *v1;  // [bp-0xe0]
    st_1b2214_0 **v2;  // [bp-0xd8], Other Possible Types: char
    char *v3;  // [bp-0xc0]
    char *v4;  // [bp-0xb8]
    char *v5;  // [bp-0xb0]
    char v6;  // [bp-0xa8]
    char v7;  // [bp-0xa0]
    char *v8;  // [bp-0x90]
    char *v9;  // [bp-0x82]
    char v10;  // [bp-0x70]
    char v11;  // [bp-0x50]
    unsigned long v12;  // [bp-0x48]
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    v12 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    _getifaddrs(&v6);
    v3 = &v6;
    sub_1be858(&v7, &v3, &v2);
    v3 = &v2;
    v2 = &v3;
    sub_159d9c(&v10, &v7);
    v11 = 1;
    sub_181a8(&v7);
    v3 = 0;
    v4 = 0;
    v5 = 0;
    v15 = (char *)v6;
    if (v15)
    {
        do
        {
            v16 = v15;
            if (!v16->field_18 || !sub_9fd8(a1, v16->field_8) || !(v17 = v16->field_18, v18 = (char *)v17[1], !a0 || v18 == a0))
                continue;
            if (v18 != 30)
            {
                if (v18 != 2 || !_inet_ntop(2, v17 + 4, &v7, 16))
                    continue;
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(v21, &v7, 16);
                goto LABEL_1b22c0;
            }
            else
            {
                v19 = v17;
                v20 = v19 + 8;
                if (v19[8] == 254 && (v17[9] & 192) == 128 || !(v9 = (char *)0, v7 = 0, v8 = (char *)0, _inet_ntop(30, v20, &v7, 46)))
                    continue;
                if ((*v20 & 254) == 252)
                {
                    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v2, &v7, 46);
                    sub_5ccc(&v3, &v2);
                }
                else
                {
                    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(v21, &v7, 46);
                    goto LABEL_1b22c0;
                }
            }
        } while ((v15 = v16->field_0, v16->field_0));
    }
    sub_5c38(v21, &v3);
LABEL_1b22c0:
    v22 = sub_1b3f74(&v10);
    if (*(long long *)&g_10002b0 == v12)
        return v22;
    v23 = ___stack_chk_fail();
    sub_1b3f74(&v10);
    v24 = __Unwind_Resume(v23);
    __Unwind_Resume(v24);
}
