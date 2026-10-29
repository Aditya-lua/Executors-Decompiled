/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x60dec..0x61064 (632 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_60dec_1 {
    char padding_0[16];
    char field_10;
    char padding_11[23];
    unsigned int field_28;
    char padding_2c[4];
    unsigned long long field_30;
} st_60dec_1;

typedef struct st_60dec_0 {
    char field_0;
} st_60dec_0;

extern char g_e69a58;
extern char g_10002b0;

unsigned long long sub_60dec(st_60dec_1 *a0, long long a1, long long a2)
{
    unsigned long long v17;  // x0
    long long idx;  // x8
    unsigned long long *v19;  // x8
    long long v20;  // x0
    st_60dec_0 **v0;  // [bp-0xd8], Other Possible Types: char
    st_60dec_0 *v1;  // [bp-0xd0]
    st_60dec_1 *v2;  // [bp-0xc8]
    unsigned long v3;  // [bp-0xc0]
    unsigned long long v4;  // [bp-0xb8]
    unsigned long long *v5;  // [bp-0xb0]
    unsigned long long *v6;  // [bp-0xa8]
    char v7;  // [bp-0xa0]
    unsigned int v8;  // [bp-0x84]
    char v9;  // [bp-0x80]
    char v10;  // [bp-0x70]
    char v11;  // [bp-0x60], Other Possible Types: unsigned long long
    long long v12;  // [bp-0x58]
    unsigned long long *v13;  // [bp-0x50], Other Possible Types: unsigned long long
    unsigned long v14;  // [bp-0x48]
    char *v15;  // [bp-0x10]
    char v16;  // [bp+0x0]

    v15 = &v16;
    v14 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign(a1, "no error");
    v17 = sub_60768(a0 + 4, 5);
    if ((unsigned int)v17)
    {
        *(unsigned long long *)idx = 0;
        *(unsigned long long *)(idx + 8) = 0;
    }
    else
    {
        sub_61514(&v10, a0);
        sub_611d8(&v9, &v10);
        v8 = a0->field_28;
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v7, &a0->field_10);
        v3 = 397472;
        v4 = 0;
        v2 = a0;
        v12 = 1;
        v13 = sub_1e5a4(&v11, 1);
        v13[2] = 0;
        *v13 = &g_e69a58;
        v13[1] = 0;
        sub_615d4(v13 + 3, &v3, &v2, &v9, &v7, &v8);
        v19 = v13;
        v13 = 0;
        v5 = v19 + 3;
        v6 = v19;
        sub_60c14(&v11);
        std::__1::thread::detach(v5);
        while (!(sub_60768(a0 + 4, 5) & 1))
        {
            v11 = a0->field_30;
            sub_6131c(&v11);
            if (sub_60b58(a2))
            {
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign(a1, "cancellation requested");
                goto LABEL_60f5c;
            }
        }
        if (sub_60b58(a2))
        {
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign(a1, "cancellation requested");
LABEL_60f5c:
            *(unsigned long long *)idx = 0;
            *(unsigned long long *)(idx + 8) = 0;
        }
        else
        {
            std::__1::mutex::lock(&a0[2].field_30);
            std::__1::mutex::unlock(&a0[2].field_30);
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(a1, &a0[2].padding_11[7]);
            std::__1::mutex::lock(&a0[1].field_10);
            sub_61070(idx, a0 + 1);
            std::__1::mutex::unlock(&a0[1].field_10);
        }
        sub_60b78(&v5);
        sub_611fc(&v9);
        v17 = sub_60b78(&v10);
    }
    if (*(long long *)&g_10002b0 == v14)
        return v17;
    v20 = ___stack_chk_fail();
    sub_60c14(&v11);
    sub_611fc(&v9);
    sub_60b78(&v10);
    __Unwind_Resume(v20);
}
