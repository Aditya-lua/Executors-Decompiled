/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x271b04..0x271f64 (1120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_271b04_0 {
    char field_0;
} st_271b04_0;

extern uint128_t g_f11a18;
extern uint128_t g_f11a28;
extern unsigned int g_f11a38;
extern char g_10002b0;

int sub_271b04(void)
{
    char *i;  // x19
    unsigned int v33;  // w0
    unsigned int v34;  // w21
    long long v35;  // x20
    st_271b04_0 **v0;  // [bp-0x1a0], Other Possible Types: char
    st_271b04_0 *v1;  // [bp-0x198]
    uint128_t v2;  // [bp-0x190], Other Possible Types: uint128_t
    uint128_t v3;  // [bp-0x180], Other Possible Types: uint128_t
    uint128_t v4;  // [bp-0x170], Other Possible Types: uint128_t
    uint128_t v5;  // [bp-0x160], Other Possible Types: uint128_t
    char v6;  // [bp-0x150]
    char v7;  // [bp-0x138]
    uint128_t v8;  // [bp-0x120], Other Possible Types: unsigned long
    unsigned long v9;  // [bp-0x118]
    unsigned long v10;  // [bp-0x110]
    uint128_t v11;  // [bp-0x100], Other Possible Types: char *
    char v12;  // [bp-0xe8]
    uint128_t v13;  // [bp-0xd0], Other Possible Types: unsigned long
    unsigned long v14;  // [bp-0xc8]
    unsigned long v15;  // [bp-0xc0]
    char v16;  // [bp-0xb0]
    unsigned long v17;  // [bp-0x98]
    unsigned long v18;  // [bp-0x90]
    unsigned long v19;  // [bp-0x88]
    char v20;  // [bp-0x80]
    unsigned long v21;  // [bp-0x68]
    unsigned long v22;  // [bp-0x60]
    unsigned long v23;  // [bp-0x58]
    uint128_t v24;  // [bp-0x50], Other Possible Types: char *
    unsigned long v25;  // [bp-0x38]
    char *v26;  // [bp-0x10]
    char v27;  // [bp+0x0]

    v26 = &v27;
    v25 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v5 = CONCAT(14429746110317888822, 5631685738706044681);
    v13 = CONCAT(14429746110317888822, 5631685737297962585);
    v5 ^= v13;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v6, &v5, _strlen(&v5));
    v4 = CONCAT(14429746110317888822, 5639528452252109069);
    v11 = CONCAT(14429746110317888822, 5631685737297962585);
    v4 ^= v11;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v12, &v4, _strlen(&v4));
    v13 = 0;
    v14 = 0;
    v15 = 0;
    sub_273b0(&v13, &v12, &v13, 1);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v16, &v6);
    v17 = 0;
    v18 = 0;
    v19 = 0;
    sub_1754ac(&v17, v13, v14, 12297829382473034411 * ((long long)(v14 - v13) >> 3));
    v3 = CONCAT(14429746110317888858, 3117523497160738589);
    v8 = CONCAT(14429746110317888822, 5631685737297962585);
    v3 ^= v8;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v11, &v3, _strlen(&v3));
    v2 = CONCAT(14429746110317888822, 5631685579707517466);
    v24 = CONCAT(14429746110317888822, 5631685737297962585);
    v2 ^= v24;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v7, &v2, _strlen(&v2));
    v8 = 0;
    v9 = 0;
    v10 = 0;
    sub_273b0(&v8, &v7, &v8, 1);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v20, &v11);
    v21 = 0;
    v22 = 0;
    v23 = 0;
    sub_1754ac(&v21, v8, v9, 12297829382473034411 * ((long long)(v9 - v8) >> 3));
    g_f11a18 = 0;
    g_f11a28 = 0;
    g_f11a38 = 0x3f800000;
    sub_175abc(&g_f11a18, &v16, &v24);
    i = &v16;
    v24 = &v21;
    sub_271a8(&v24);
    v24 = &v17;
    sub_271a8(&v24);
    v24 = &v8;
    sub_271a8(&v24);
    v11 = &v13;
    sub_271a8(&v11);
    v33 = ___cxa_atexit(0x176574, &g_f11a18, 0);
    if (*(long long *)&g_10002b0 == v25)
        return v33;
    ___stack_chk_fail();
    sub_176450(&g_f11a18);
    sub_187288(&v20);
    sub_187288(&v16);
    v34 = 0;
    v24 = &v8;
    sub_271a8(&v24);
    while (1)
    {
        v11 = &v13;
        sub_271a8(&v11);
        if (v34 && &v16 != i)
        {
            do
            {
                i -= 48;
                sub_187288(i);
            } while (i != &v16);
        }
        __Unwind_Resume(v35);
        v34 = 1;
    }
}
