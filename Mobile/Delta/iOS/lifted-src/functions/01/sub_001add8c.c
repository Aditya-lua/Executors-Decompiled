/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1add8c..0x1ae448 (1724 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1add8c_0 {
    char padding_0[584];
    long long field_248;
} st_1add8c_0;

typedef struct st_1add8c_3 {
    struct st_1add8c_1 *field_0;
} st_1add8c_3;

typedef struct st_1add8c_1 {
    char field_0;
} st_1add8c_1;

typedef struct st_1add8c_2 {
    unsigned long long field_0;
} st_1add8c_2;

extern long long g_c7c2eb;
extern st_1add8c_2 *g_f0b0c0;
extern char g_10002b0;

long long sub_1add8c(unsigned long a0, st_1add8c_0 *a1, long long a2, unsigned int *a3)
{
    long long v8;  // x0
    long long v10;  // x0
    long long v11;  // x0
    st_1add8c_1 **v0;  // [bp-0x5e0], Other Possible Types: char
    st_1add8c_1 *v1;  // [bp-0x5d8]
    st_1add8c_1 **v2;  // [bp-0x540], Other Possible Types: char
    char v3;  // [bp-0x4c8]
    char *v4;  // [bp-0x468], Other Possible Types: st_1add8c_3 **, char
    unsigned long v5;  // [bp-0x68]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    if (a1->field_248)
    {
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v4, "location", 8);
        v8 = sub_1bc900(a2 + 56, &v4, &g_c7c2eb, 0);
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v3, v8, _strlen(v8, &v4, &g_c7c2eb, 0));
        v4 = &v2;
        v2 = &v4;
        if (sub_6b08(&v3))
            g_f0b0c0();
    }
    else
    {
        *a3 = 6;
    }
    if (*(long long *)&g_10002b0 == v5)
        return 0;
    v10 = ___stack_chk_fail();
    v4 = &v2;
    sub_127c0(&v4);
    v11 = __Unwind_Resume(__Unwind_Resume(v10));
    __Unwind_Resume(v11);
}
