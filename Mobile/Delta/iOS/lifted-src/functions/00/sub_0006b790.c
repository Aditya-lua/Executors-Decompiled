/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6b790..0x6b904 (372 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6b790_3 {
    char padding_0[1472];
    long long field_5c0;
} st_6b790_3;

typedef struct st_6b790_0 {
    char field_0;
} st_6b790_0;

typedef struct st_6b790_1 {
    st_6b790_0 field_0;
} st_6b790_1;

extern st_6b790_1 *g_e6a6d0;
extern char g_10002b0;

unsigned long long sub_6b790(st_6b790_3 *a0)
{
    unsigned long long v9;  // x0
    long long v11;  // x0
    long long v12;  // x0
    long long v13;  // x0
    st_6b790_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_6b790_0 *v1;  // [bp-0x68]
    char *v2;  // [bp-0x60]
    st_6b790_1 **v3;  // [bp-0x58], Other Possible Types: char
    st_6b790_3 *v4;  // [bp-0x50]
    char *v5;  // [bp-0x40]
    unsigned long v6;  // [bp-0x38]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    if ((char)a0->field_5c0 == 1)
    {
        std::__1::mutex::lock(&a0->padding_0[1096]);
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v3, &a0->padding_0[904]);
        std::__1::mutex::unlock(&a0->padding_0[1096]);
        sub_c044(&v3);
    }
    sub_6b164(a0, 1);
    v9 = sub_6ac74(a0);
    if ((unsigned int)v9 != 3)
    {
        do
        {
            if (sub_60768(&a0->padding_0[1192], 5) && !(v2 = &v3, v3 = &v2, v9 = sub_6ac74(a0), (unsigned int)v9 == 2))
                break;
            v3 = &g_e6a6d0;
            v4 = a0;
            v5 = &v3;
            sub_75958(a0, sub_7518c(a0), &v3);
            sub_181a8(&v3);
            sub_6b164(a0, 0);
            v9 = sub_6ac74(a0);
        } while ((unsigned int)v9 != 3);
    }
    if (*(long long *)&g_10002b0 == v6)
        return v9;
    v11 = __Unwind_Resume(___stack_chk_fail());
    std::__1::mutex::unlock(&a0->padding_0[1096]);
    v12 = __Unwind_Resume(v11);
    sub_181a8(&v3);
    v13 = __Unwind_Resume(v12);
    __Unwind_Resume(v13);
}
