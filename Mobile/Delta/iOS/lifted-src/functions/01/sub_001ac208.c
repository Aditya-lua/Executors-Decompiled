/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ac208..0x1ac480 (632 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ac208_1 {
    long long field_0;
    long long field_8;
    unsigned long long field_10;
    long long field_18;
    struct st_1ac208_2 *field_20;
} st_1ac208_1;

typedef struct st_1ac208_2 {
    unsigned int field_0;
} st_1ac208_2;

typedef struct st_1ac208_0 {
    char field_0;
} st_1ac208_0;

extern char g_10002b0;

unsigned long long sub_1ac208(st_1ac208_1 *a0, long long a1)
{
    unsigned long long v12;  // x0
    unsigned long long v13;  // x21
    long long v22;  // x0
    unsigned int v14;  // w8
    unsigned long long v15;  // x0
    unsigned long long v16;  // x0
    unsigned long long v17;  // w0
    long long v18;  // x0
    long long v19;  // x0
    long long v20;  // x0
    long long v21;  // x0
    st_1ac208_0 **v0;  // [bp-0xf0], Other Possible Types: char
    st_1ac208_0 *v1;  // [bp-0xe8]
    char v2;  // [bp-0xe0]
    st_1ac208_0 **v3;  // [bp-0xc8], Other Possible Types: char
    st_1ac208_0 *v4;  // [bp-0xc0], Other Possible Types: unsigned long long
    char v5;  // [bp-0xb8]
    char v6;  // [bp-0x98]
    char v7;  // [bp-0x78]
    char v8;  // [bp-0x58]
    unsigned long v9;  // [bp-0x38]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v9 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    if (sub_1bd928(a0->field_0 + 56))
    {
        sub_1e524(&v8, a1);
        v12 = sub_1c6ce4(a0->field_8, a0->field_0, &v8);
        sub_181a8(&v8);
        if (!(v12 & 1))
            goto LABEL_1ac3bc;
        goto LABEL_1ac3b4;
    }
    else
    {
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v2, "Content-Length", 14);
        v4 = &v3;
        v3 = &v4;
        if (sub_1bf324(a0->field_0 + 56, &v2))
        {
            v4 = 0;
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v2, "Content-Length", 14);
            v13 = sub_1c2fb4(a0->field_0 + 56, &v2, -0x1, 0, &v4);
            if (v4 & 1)
                goto LABEL_1ac3bc;
            if (v13 > (unsigned long long)*(long long *)a0->field_10)
            {
                sub_1acad0(a0->field_8, v13);
                v14 = 413;
                goto LABEL_1ac3c0;
            }
            if (v13)
            {
                sub_1a3d18(&v6, a0->field_18);
                sub_1e524(&v5, a1);
                v15 = sub_1c6438(a0->field_8, v13, &v6, &v5);
                sub_181a8(&v5);
                sub_181a8(&v6);
                if (!(v15 & 1))
                    goto LABEL_1ac3bc;
            }
LABEL_1ac3b4:
            v17 = 1;
        }
        else
        {
            sub_1e524(&v7, a1);
            v16 = sub_1b5880(a0->field_8, &v7);
            sub_181a8(&v7);
            if (v16 & 1)
                goto LABEL_1ac3b4;
LABEL_1ac3bc:
            v14 = 400;
LABEL_1ac3c0:
            v17 = 0;
            *(unsigned int *)a0->field_20 = v14;
        }
    }
    if (*(long long *)&g_10002b0 == v9)
        return v17;
    v18 = ___stack_chk_fail();
    sub_181a8(&v5);
    sub_181a8(&v6);
    v19 = __Unwind_Resume(v18);
    sub_181a8(&v6);
    v20 = __Unwind_Resume(v19);
    sub_181a8(&v7);
    v21 = __Unwind_Resume(__Unwind_Resume(__Unwind_Resume(v20)));
    sub_181a8(&v8);
    v22 = __Unwind_Resume(v21);
    __Unwind_Resume(v22);
}
