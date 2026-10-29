/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c6440..0x3c653c (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c6440_1 {
    long long field_0;
    unsigned long long field_8;
} st_3c6440_1;

typedef struct st_3c6440_0 {
    char field_0;
} st_3c6440_0;


long long sub_3c6440(long long a0, unsigned long long *a1)
{
    long long v7;  // x21
    st_3c6440_1 *v8;  // x0
    unsigned long long v9;  // x8
    st_3c6440_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_3c6440_0 *v1;  // [bp-0x48]
    st_3c6440_1 *v2;  // [bp-0x40], Other Possible Types: unsigned long
    long long v3;  // [bp-0x38]
    unsigned long v4;  // [bp-0x38]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v0 = &v1;
    v7 = operatornew(8);
    std::__1::__thread_struct::__thread_struct(v7);
    v3 = v7;
    v8 = operatornew(16);
    v9 = *a1;
    v2 = v8;
    v4 = 0;
    v2->field_0 = v3;
    v2->field_8 = v9;
    if (!_pthread_create(a0, 0, 0x3c6edc, v2))
    {
        v2 = 0;
        sub_3c708c(&v2);
        sub_61304(&v4, 0);
        return a0;
    }
    std::__1::__throw_system_error();
    __debugbreak();
}
