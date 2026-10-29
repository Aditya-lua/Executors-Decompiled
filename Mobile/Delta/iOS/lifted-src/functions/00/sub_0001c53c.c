/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c53c..0x1c5e4 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c53c_0 {
    uint128_t field_0;
} st_1c53c_0;


uint128_t * sub_1c53c(unsigned long a0, uint128_t *i, uint128_t *a2, uint128_t *a3)
{
    uint128_t *v8;  // x19
    unsigned long v0;  // [bp-0x60]
    st_1c53c_0 **v1;  // [bp-0x58]
    char *v2;  // [bp-0x50]
    char v3;  // [bp-0x48]
    uint128_t *v4;  // [bp-0x40]
    uint128_t *v5;  // [bp-0x38]
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
            *v8 = *i;
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(v8 + 1, i + 1);
            v8 = (char *)&v5[2] + 8;
            v5 = v8;
            i = (char *)&i[2] + 8;
        } while (i != a2);
    }
    v3 = 1;
    sub_1d90c(&v0);
    return v8;
}
