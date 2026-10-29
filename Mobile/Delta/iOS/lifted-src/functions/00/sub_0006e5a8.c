/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6e5a8..0x6e784 (476 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6e5a8_0 {
    char field_0;
} st_6e5a8_0;

extern char g_cbee18;

char * sub_6e5a8(long long a0)
{
    uint128_t v4;  // x22
    long long v5;  // x8
    char *v14;  // x0
    char *v15;  // x0
    unsigned long v16;  // x8
    unsigned long long v17;  // x22
    char v18;  // x8
    char *v19;  // x0
    unsigned long v20;  // x8
    char *v6;  // x0
    char *iter;  // x20
    uint128_t i;  // x21
    char *v9;  // x0
    unsigned long v10;  // x25
    unsigned long v11;  // x8
    unsigned long v12;  // x25
    unsigned long v13;  // x8
    st_6e5a8_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_6e5a8_0 *v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_6b08();
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(v5, (unsigned long long)((v4 + 2) * 12297829382473034411 >> 64) * 2 & 0xfffffffffffffffc, 0);
    v6 = sub_a0c8(v5);
    iter = v6;
    i = 0;
    if (v4 != 2)
    {
        do
        {
            v9 = sub_2fa10(a0, i);
            *iter = (&g_cbee18)[*v9 >> 2];
            v10 = *(char *)sub_2fa10(a0, i);
            v11 = *(char *)sub_2fa10(a0, i + 1);
            iter[1] = (&g_cbee18)[v11 >> 4 & 0xffffffffffffffc0 | (v11 >> 4 & 0xffffffffffffffcf | (v10 * 16 | v10 >> 60) & 48) & 63];
            v12 = *(char *)sub_2fa10(a0, i + 1);
            v13 = *(char *)sub_2fa10(a0, i + 2);
            iter[2] = (&g_cbee18)[v13 >> 6 & 0xffffffffffffffc0 | (v13 >> 6 & 0xffffffffffffffc3 | (v12 * 4 | v12 >> 62) & 60) & 63];
            v6 = sub_2fa10(a0, i + 2);
            iter[3] = (&g_cbee18)[*v6 & 63];
            i += 3;
            iter += 4;
        } while (i < v4 - 2);
    }
    if (v4 <= i)
        return v6;
    v14 = sub_2fa10(a0, i);
    *iter = (&g_cbee18)[*v14 >> 2];
    v15 = sub_2fa10(a0, i);
    v16 = *v15;
    v17 = (v16 * 16 | v16 >> 60) & 48 & 63;
    if (i == v4 - 1)
    {
        iter[1] = (&g_cbee18)[v17];
        v18 = 61;
    }
    else
    {
        v19 = sub_2fa10(a0, i + 1);
        iter[1] = (&g_cbee18)[v17 & 0xffffffff | *v19 >> 4];
        v15 = sub_2fa10(a0, i + 1);
        v20 = *v15;
        v18 = (&g_cbee18)[(v20 * 4 | v20 >> 62) & 60 & 63];
    }
    iter[2] = v18;
    iter[3] = 61;
    return v15;
}
