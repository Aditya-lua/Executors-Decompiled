/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x539c0..0x53b8c (460 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_539c0_2 {
    unsigned long long field_0;
} st_539c0_2;

typedef struct st_539c0_1 {
    char padding_0[48];
    char field_30;
    char padding_31[31];
    unsigned long long field_50;
    struct st_539c0_2 *field_58;
    unsigned int field_60;
} st_539c0_1;

typedef struct st_539c0_0 {
    char field_0;
} st_539c0_0;

extern char g_10002b0;

unsigned long long * sub_539c0(st_539c0_1 *a0, long long a1, long long a2, long long a3, long long a4)
{
    unsigned long long v10;  // x25
    unsigned long long v11;  // x26
    unsigned long long *v12;  // x25
    unsigned long long i;  // x27
    unsigned long long v14;  // x27
    unsigned int v15;  // w0
    void* v16;  // x8
    long long v17;  // x0
    st_539c0_0 **v0;  // [bp-0xc0], Other Possible Types: char
    st_539c0_0 *v1;  // [bp-0xb8]
    unsigned long long v2;  // [bp-0xb0]
    unsigned long long v3;  // [bp-0xa8]
    unsigned long long v4;  // [bp-0xa0]
    unsigned long long v5;  // [bp-0x98]
    char v6;  // [bp-0x90]
    unsigned long v7;  // [bp-0x68]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v7 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v10 = a0->field_50;
    v3 = 0;
    v4 = 0;
    v5 = 0;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::reserve();
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(&v3, 5);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(&v3, (char)a0->field_60 + (v10 != 0));
    if (v10)
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(&v3, 4);
    if (*(long long *)&a0->field_60)
    {
        v11 = 0;
        v12 = a0->field_58;
        i = *(long long *)&a0->field_60 * 8;
        do
        {
            v14 = i;
            v2 = 0;
            sub_f6e8(&v6, &v2, 0);
            if (!*(long long *)(*v12 + 56) || (v15 = sub_534d0(*(long long *)(*v12 + 56), &a0->field_30, a1, a2, a3, a4, &v6), v15 == 15))
                v15 = 15;
            else
                v11 = 1;
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(&v3, (char)v15);
            sub_a070(&v6);
            v12 += 1;
            i = v14 - 8;
        } while (i);
        if (!(v11 & 1))
            goto LABEL_53b0c;
        sub_5c38(v16, &v3);
    }
    else
    {
LABEL_53b0c:
        memset(v16, 0, 24);
    }
    if (*(long long *)&g_10002b0 == v7)
        return &v3;
    v17 = __Unwind_Resume(___stack_chk_fail());
    sub_a070(&v6);
    __Unwind_Resume(v17);
}
