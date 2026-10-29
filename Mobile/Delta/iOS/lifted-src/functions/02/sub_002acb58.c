/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2acb58..0x2accac (340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2acb58_0 {
    char field_0;
} st_2acb58_0;

extern unsigned long long g_e7cbb0;
extern long long g_e7f620;

int sub_2acb58(st_2acb58_0 **a0, st_2acb58_0 **a1)
{
    char *v5;  // x8
    unsigned int v6;  // w8
    unsigned long long v7;  // x9
    unsigned long long v8;  // x8
    long long v9;  // x0
    st_2acb58_0 **v0;  // [bp-0x58], Other Possible Types: char
    st_2acb58_0 *v1;  // [bp-0x50]
    char v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    v5 = *a0;
    if (v5 != *a1)
    {
        v9 = ___cxa_allocate_exception(32);
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v2, "cannot compare iterators of different containers", 48);
        sub_2aab3c(212, &v2, *a0);
        ___cxa_throw(v9, &g_e7f620, 0x2aede8);
        __debugbreak();
    }
    else if (v5)
    {
        v6 = *v5;
        v7 = 56;
        if (v6 == 1)
            v7 = 80;
        v8 = 40;
        if (v6 == 2)
            v7 = v8;
        goto *((void *)(*(long long *)((char *)&g_e7cbb0 + v7)));
    }
    else
    {
        return 1;
    }
}
