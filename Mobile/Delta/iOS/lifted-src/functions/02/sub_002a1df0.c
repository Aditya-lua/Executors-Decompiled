/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a1df0..0x2a3478 (5768 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a1df0_0 {
    char field_0;
} st_2a1df0_0;

typedef struct st_2a1df0_2 {
    unsigned long long field_0;
} st_2a1df0_2;

typedef struct st_2a1df0_1 {
    char padding_0[64];
    struct st_2a1df0_2 *field_40;
} st_2a1df0_1;

extern st_2a1df0_1 *g_f0d3d8;
extern char g_f11bf8;
extern long long g_f11c10;
extern char g_1000090;
extern char g_10002b0;

void sub_2a1df0(unsigned long a0)
{
    unsigned long long v12;  // x22
    unsigned long long v13;  // x21
    unsigned long long v14;  // x20
    unsigned long long v15;  // x19
    unsigned long long v16;  // x30
    st_2a1df0_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_2a1df0_0 *v1;  // [bp-0x78]
    st_2a1df0_0 **v2;  // [bp-0x70], Other Possible Types: char, uint128_t
    st_2a1df0_0 *v3;  // [bp-0x50], Other Possible Types: uint128_t
    unsigned long v4;  // [bp-0x38]
    unsigned long long v5;  // [bp-0x30]
    unsigned long long v6;  // [bp-0x28]
    unsigned long long v7;  // [bp-0x20]
    unsigned long long v8;  // [bp-0x18]
    char *v9;  // [bp-0x10]
    unsigned long long v10;  // [bp-0x8]
    char v11;  // [bp+0x0]

    v5 = v12;
    v6 = v13;
    v7 = v14;
    v8 = v15;
    v9 = &v11;
    v10 = v16;
    v4 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    /* unsupported instruction */;
    if (!(g_f11bf8 & 1) && ___cxa_guard_acquire(&g_f11bf8))
    {
        v2 = CONCAT(17168632223062190764, 2905152202778611547);
        v3 = CONCAT(17168632223062190764, 2892799623169342259);
        v2 ^= v3;
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&g_f11c10, &v2, _strlen(&v2));
        ___cxa_atexit(&g_1000090, &g_f11c10, 0);
        ___cxa_guard_release(&g_f11bf8);
    }
    v3 = &v2;
    v2 = &v3;
    sub_a0c8(&g_f11c10);
    g_f0d3d8->field_40();
}
