/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1e820..0x1e8b8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1e820_0 {
    char padding_0[8];
    char *field_8;
    struct st_1e820_1 *field_10;
} st_1e820_0;

typedef struct st_1e820_2 {
    char padding_0[8];
    uint128_t field_8;
} st_1e820_2;

typedef struct st_1e820_1 {
    unsigned long long field_0;
    uint128_t field_8;
} st_1e820_1;

extern char g_e61f08;

char * sub_1e820(st_1e820_0 *a0, st_1e820_2 *a1)
{
    char *v2;  // x20
    char *v3;  // x0
    char *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_8;
    if (a0->field_10 <= v2)
    {
        v4 = sub_fc18(a0);
        a0->field_8 = v4;
        return v4 - 48;
    }
    *(char **)v2 = &g_e61f08;
    *(int128_t *)&v2[8] = *(int128_t *)(a1->padding_0)[1];
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(v2 + 24, (char *)&a1->field_8 + 8);
    v3 = v2 + 48;
    a0->field_8 = v3;
    a0->field_8 = v3;
    return v3 - 48;
}
