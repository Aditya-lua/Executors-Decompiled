/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d4694..0x1d5de0 (5964 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1d4694_0 {
    char field_0;
} st_1d4694_0;

typedef struct st_1d4694_2 {
    unsigned long long field_0;
} st_1d4694_2;

typedef struct st_1d4694_1 {
    char padding_0[64];
    struct st_1d4694_2 *field_40;
} st_1d4694_1;

extern st_1d4694_1 *g_f0d3d8;
extern char g_f10ba8;
extern long long g_f10bc0;
extern char g_1000090;
extern char g_10002b0;

void sub_1d4694(unsigned long a0)
{
    unsigned long long v15;  // x22
    unsigned long long v16;  // x21
    unsigned long long v17;  // x20
    unsigned long long v18;  // x19
    unsigned long long v19;  // x30
    st_1d4694_0 **v0;  // [bp-0xb0], Other Possible Types: char
    st_1d4694_0 *v1;  // [bp-0xa8]
    st_1d4694_0 **v2;  // [bp-0xa0], Other Possible Types: char, uint128_t
    unsigned long long v3;  // [bp-0x90]
    unsigned long long v4;  // [bp-0x88]
    st_1d4694_0 *v5;  // [bp-0x60], Other Possible Types: uint128_t
    uint128_t v6;  // [bp-0x50]
    unsigned long v7;  // [bp-0x38]
    unsigned long long v8;  // [bp-0x30]
    unsigned long long v9;  // [bp-0x28]
    unsigned long long v10;  // [bp-0x20]
    unsigned long long v11;  // [bp-0x18]
    char *v12;  // [bp-0x10]
    unsigned long long v13;  // [bp-0x8]
    char v14;  // [bp+0x0]

    v8 = v15;
    v9 = v16;
    v10 = v17;
    v11 = v18;
    v12 = &v14;
    v13 = v19;
    v7 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    /* unsupported instruction */;
    if (!(g_f10ba8 & 1) && ___cxa_guard_acquire(&g_f10ba8))
    {
        v2 = CONCAT(0xa1a351ffd46f89bd, 11244316950852617988);
        v3 = 17406804304866096756;
        v4 = 0xa77fe9b394508a3e;
        v5 = CONCAT(14249991279768698332, 17329494954401931875);
        v6 = CONCAT(0xa77fe9b394508a3e, 17406804304865248029);
        v2 ^= v5;
        *(uint128_t *)(&v2 | 16) = *(int128_t *)(&v2 | 16) ^ v6;
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&g_f10bc0, &v2, _strlen(&v2));
        ___cxa_atexit(&g_1000090, &g_f10bc0, 0);
        ___cxa_guard_release(&g_f10ba8);
    }
    v5 = &v2;
    v2 = &v5;
    sub_a0c8(&g_f10bc0);
    g_f0d3d8->field_40();
}
