/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x12604..0x12738 (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_12604_1 {
    unsigned long long field_0;
    uint128_t field_8;
} st_12604_1;

typedef struct st_12604_0 {
    char field_0;
} st_12604_0;

extern char g_e61f08;

long long sub_12604(void* a0, uint128_t *a1, long long a2)
{
    long long v11;  // x0
    long long v12;  // x20
    long long v13;  // x8
    unsigned long v14;  // x9
    uint128_t v0;  // [bp-0xa0]
    st_12604_0 **v1;  // [bp-0x88], Other Possible Types: char
    st_12604_0 *v2;  // [bp-0x80]
    char v3;  // [bp-0x78], Other Possible Types: long long
    long long v4;  // [bp-0x70]
    st_12604_1 *v5;  // [bp-0x68], Other Possible Types: long long, uint128_t
    unsigned long v6;  // [bp-0x60]
    st_12604_0 *v7;  // [bp-0x50], Other Possible Types: char
    st_12604_0 **v8;  // [bp-0x38], Other Possible Types: char
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v2 = &v1;
    v1 = &v2;
    v11 = sub_13bcc();
    sub_10900(&v3, v11, 12297829382473034411 * ((long long)a0[8] - *(long long *)a0 >> 4), a0);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v7, a2);
    v5->field_0 = &g_e61f08;
    *(uint128_t *)&(&v5->field_0)[1] = *a1;
    sub_5c38((char *)&v5->field_8 + 8, &v7);
    v5 = _INSERT(CONCAT(v5, 0), 0, &v5[1].field_8);
    v7 = &v8;
    v8 = &v7;
    v12 = v4 + *(long long *)a0 - (long long)a0[8];
    sub_21f38(a0, *(long long *)a0, (long long)a0[8], v12);
    v13 = *(long long *)a0;
    *(long long *)a0 = v12;
    v14 = (long long)a0[16];
    v0 = v5;
    *(uint128_t *)&a0[8] = v5;
    v5 = v13;
    v6 = v14;
    v3 = v13;
    v4 = v13;
    sub_139b8(&v3);
    return (unsigned long long)v0;
}
