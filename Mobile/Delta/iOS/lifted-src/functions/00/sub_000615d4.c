/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x615d4..0x61760 (396 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_615d4_1 {
    long long field_0;
    uint128_t field_8;
    unsigned long long field_18;
    char field_20;
    char padding_21[15];
    char field_30;
    char padding_31[23];
    unsigned int field_48;
} st_615d4_1;

typedef struct st_615d4_0 {
    char field_0;
} st_615d4_0;


long long sub_615d4(long long a0, uint128_t *a1, unsigned long long *a2, long long a3, long long a4, unsigned int *a5)
{
    long long v7;  // x26
    st_615d4_1 *v8;  // x22
    st_615d4_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_615d4_0 *v1;  // [bp-0x68]
    st_615d4_1 *v2;  // [bp-0x60], Other Possible Types: unsigned long
    long long v3;  // [bp-0x58]
    unsigned long v4;  // [bp-0x58]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v0 = &v1;
    v7 = operatornew(8);
    std::__1::__thread_struct::__thread_struct(v7);
    v3 = v7;
    v8 = operatornew(80);
    v4 = 0;
    v8->field_0 = v3;
    *(uint128_t *)&(&v8->field_0)[1] = *a1;
    *(unsigned long long *)((char *)&v8->field_8 + 8) = *a2;
    sub_611d8(&v8->field_18, a3);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v8->padding_21[7], a4);
    *(unsigned int *)&v8->padding_31[15] = *a5;
    v2 = v8;
    if (!_pthread_create(a0, 0, 0x617d0, v8))
    {
        v2 = 0;
        sub_614fc(&v2, 0);
        sub_61304(&v4, 0);
        return a0;
    }
    std::__1::__throw_system_error();
    __debugbreak();
}
