/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x60524..0x60658 (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_60524_3 {
    char padding_0[24];
    struct st_60524_4 *field_18;
} st_60524_3;

typedef struct st_60524_2 {
    unsigned long long field_0;
} st_60524_2;

typedef struct st_60524_4 {
    struct st_60524_1 *field_0;
} st_60524_4;

typedef struct st_60524_1 {
    char padding_0[96];
    struct st_60524_2 *field_60;
} st_60524_1;

typedef struct st_60524_0 {
    char field_0;
} st_60524_0;


st_60524_1 ** sub_60524(st_60524_1 **a0, unsigned long a1, unsigned long a2, unsigned long a3, st_60524_3 *a4, long long a5)
{
    st_60524_1 **v5;  // x8
    st_60524_1 **v6;  // x8
    st_60524_0 **v0;  // [bp-0x78], Other Possible Types: char
    st_60524_0 *v1;  // [bp-0x70]
    char v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    if (!a0)
        return a0;
    v5 = a3 - a1;
    v6 = a4->field_18 - v5;
    if (v5 >= a4->field_18)
        v6 = 0;
    if ((long long)(a2 - a1) >= 1)
    {
        *a0->field_60();
    }
    else if (v6 >= 1)
    {
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v2, v6, a5);
        sub_a0c8(&v2);
        *a0->field_60();
    }
    else if ((long long)(a3 - a2) >= 1)
    {
        *a0->field_60();
    }
    else
    {
        a4->field_18 = 0;
        return a0;
    }
}
