/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x180a0..0x1815c (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_180a0_1 {
    char padding_0[8];
    uint128_t field_8;
} st_180a0_1;

typedef struct st_180a0_0 {
    unsigned long long field_0;
    uint128_t field_8;
} st_180a0_0;

extern char g_e61f08;

st_180a0_0 * sub_180a0(unsigned long a0, st_180a0_1 *i, st_180a0_1 *a2, st_180a0_0 *a3)
{
    st_180a0_0 *v8;  // x19
    unsigned long v0;  // [bp-0x60]
    st_180a0_0 **v1;  // [bp-0x58]
    char *v2;  // [bp-0x50]
    char v3;  // [bp-0x48]
    st_180a0_0 *v4;  // [bp-0x40]
    st_180a0_0 *v5;  // [bp-0x38]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v8 = a3;
    v4 = a3;
    v5 = a3;
    v0 = a0;
    v1 = &v4;
    v2 = &v5;
    v3 = 0;
    if (i != a2)
    {
        do
        {
            v8->field_0 = &g_e61f08;
            *(int128_t *)&(&v8->field_0)[1] = *(int128_t *)(i->padding_0)[1];
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string((char *)&v8->field_8 + 8, (char *)&i->field_8 + 8);
            v8 = &v5[1].field_8;
            v5 = v8;
            i = &i[1].field_8;
        } while (i != a2);
    }
    v3 = 1;
    sub_1815c(&v0);
    return v8;
}
