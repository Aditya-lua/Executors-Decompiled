/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x23758..0x237f0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_23758_0 {
    unsigned long long field_0;
    uint128_t field_8;
} st_23758_0;

extern char g_e61f08;

st_23758_0 * sub_23758(st_23758_0 **a0, uint128_t *a1, long long a2)
{
    st_23758_0 *v3;  // x21
    st_23758_0 *v4;  // x0
    char v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a0[1];
    if (a0[2] > v3)
    {
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v0, a2);
        v3->field_0 = &g_e61f08;
        *(uint128_t *)&(&v3->field_0)[1] = *a1;
        sub_5c38((char *)&v3->field_8 + 8, &v0);
        v4 = &v3[1].field_8;
        a0[1] = v4;
    }
    else
    {
        v4 = sub_12604(a0, a1);
    }
    a0[1] = v4;
    return (char *)v4 - 48;
}
