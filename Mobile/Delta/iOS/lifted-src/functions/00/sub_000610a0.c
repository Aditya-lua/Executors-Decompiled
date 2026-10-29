/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x610a0..0x611d8 (312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_610a0_0 {
    char padding_0[56];
    uint128_t field_38;
} st_610a0_0;


char * sub_610a0(st_610a0_0 *a0, long long a1, unsigned long a2, unsigned long a3)
{
    uint128_t v0;  // [bp-0x80], Other Possible Types: char
    unsigned long v1;  // [bp-0x80]
    unsigned long v2;  // [bp-0x78]
    unsigned long v3;  // [bp-0x68]
    char v4;  // [bp-0x58]
    unsigned long v5;  // [bp-0x48]
    unsigned long v6;  // [bp-0x40]
    unsigned long v7;  // [bp-0x38]
    uint128_t v8;  // [bp-0x30]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v5 = 0;
    v6 = 0;
    v7 = 0;
    sub_60c30();
    sub_614bc(a1);
    if (v3)
    {
        sub_61070(&v0, &v4);
        std::__1::mutex::lock((char *)&a0->field_38 + 8);
        v1 = 0;
        v2 = 0;
        v8 = *(int128_t *)&(a0->padding_0)[1];
        *(uint128_t *)&(a0->padding_0)[1] = v0;
        sub_60b78(&v8);
        std::__1::mutex::unlock((char *)&a0->field_38 + 8);
        sub_60b78(&v1);
        std::__1::mutex::lock(a0 + 2);
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=((a0[1].padding_0)[1], &v5);
        std::__1::mutex::unlock(a0 + 2);
        sub_60b20(&a0[2].field_38, 1, 5);
    }
    sub_60b78(&v3);
    sub_60b78(&v4);
    return &v5;
}
