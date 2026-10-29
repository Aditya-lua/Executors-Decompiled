/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a7c0..0x2a8e0 (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a7c0_4 {
    uint128_t field_0;
    unsigned int field_10;
} st_2a7c0_4;

typedef struct st_2a7c0_1 {
    char padding_0[776];
    char field_308;
    char padding_309[7];
    unsigned long long field_310;
    unsigned long long field_318;
} st_2a7c0_1;

typedef struct st_2a7c0_0 {
    char field_0;
} st_2a7c0_0;


long long sub_2a7c0(st_2a7c0_1 *a0, long long a1)
{
    unsigned long long *v10;  // x21
    st_2a7c0_4 *v11;  // x8
    void* iter;  // x20
    st_2a7c0_0 **v0;  // [bp-0x78], Other Possible Types: char
    st_2a7c0_0 *v1;  // [bp-0x70]
    unsigned long long *v2;  // [bp-0x68]
    unsigned long v3;  // [bp-0x60]
    unsigned long long *v4;  // [bp-0x58], Other Possible Types: void* *
    unsigned long v5;  // [bp-0x50]
    void* v6;  // [bp-0x48], Other Possible Types: char
    void* v7;  // [bp-0x40]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v1 = &v0;
    v0 = &v1;
    v10 = &a0->field_308;
    sub_2bc74(&v6, a0->field_318);
    v4 = sub_2afec(v10);
    v5 = a0->field_318;
    v2 = v10;
    v3 = a0->field_310;
    while (sub_290b8(&v4, &v2) & 1)
    {
        v11 = *v4 + 24 * v5;
        *(uint128_t *)((char *)v6 + 16 * v11->field_10 - 16) = v11->field_0;
        sub_2a8e0(&v4);
    }
    sub_30a74(a1, ((v7 - v6) * 0x1000000000000000 | v7 - v6 >> 4) & 0xf0000000ffffffff & 0xffffffff);
    iter = (void*)v6;
    if (iter != v7)
    {
        do
        {
            sub_30a74(a1, (int)iter[8]);
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(a1, *(long long *)iter, (long long)iter[8]);
            iter += 16;
        } while (iter != v7);
    }
    v4 = &v6;
    return sub_14fdc(&v4);
}
