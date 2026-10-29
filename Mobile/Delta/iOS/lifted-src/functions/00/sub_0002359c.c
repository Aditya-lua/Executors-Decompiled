/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2359c..0x23628 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2359c_0 {
    uint128_t field_0;
} st_2359c_0;


uint128_t * sub_2359c(st_2359c_0 **a0, uint128_t *a1, long long a2)
{
    uint128_t *v2;  // x21
    uint128_t *v4;  // x0
    uint128_t *v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0[1];
    if (a0[2] <= v2)
    {
        v5 = sub_1365c(a0);
        a0[1] = v5;
        return (char *)v5 - 40;
    }
    *v2 = *a1;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(v2 + 1, a2, _strlen(a2));
    v4 = (char *)&v2[2] + 8;
    a0[1] = v4;
    a0[1] = v4;
    return (char *)v4 - 40;
}
