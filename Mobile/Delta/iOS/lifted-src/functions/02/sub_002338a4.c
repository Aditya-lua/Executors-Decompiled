/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2338a4..0x2339b0 (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2338a4_1 {
    long long field_0;
    uint128_t field_8;
} st_2338a4_1;

typedef struct st_2338a4_0 {
    char field_0;
} st_2338a4_0;


long long sub_2338a4(long long a0, void* a1)
{
    long long v7;  // x21
    st_2338a4_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_2338a4_0 *v1;  // [bp-0x48]
    st_2338a4_1 *v2;  // [bp-0x40], Other Possible Types: unsigned long
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
    v2 = operatornew(24);
    v4 = 0;
    v2->field_0 = v3;
    *(int128_t *)&(&v2->field_0)[1] = *(int128_t *)a1;
    *(unsigned long long *)a1 = 0;
    *(unsigned long long *)&a1[8] = 0;
    if (!_pthread_create(a0, 0, 0x237b38, v2))
    {
        v2 = 0;
        sub_233ee4(&v2, 0);
        sub_61304(&v4, 0);
        return a0;
    }
    std::__1::__throw_system_error();
    __debugbreak();
}
