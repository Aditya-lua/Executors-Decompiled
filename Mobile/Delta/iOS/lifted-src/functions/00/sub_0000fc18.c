/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xfc18..0xfd50 (312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_fc18_2 {
    char padding_0[8];
    uint128_t field_8;
} st_fc18_2;

typedef struct st_fc18_1 {
    unsigned long long field_0;
    uint128_t field_8;
} st_fc18_1;

typedef struct st_fc18_0 {
    char field_0;
} st_fc18_0;

extern char g_e61f08;

long long sub_fc18(void* a0, st_fc18_2 *a1)
{
    long long v11;  // x0
    long long v12;  // x20
    long long v13;  // x8
    unsigned long v14;  // x9
    uint128_t v0;  // [bp-0x90]
    st_fc18_0 **v1;  // [bp-0x78], Other Possible Types: char
    st_fc18_0 *v2;  // [bp-0x70]
    char v3;  // [bp-0x68], Other Possible Types: long long
    long long v4;  // [bp-0x60]
    st_fc18_1 *v5;  // [bp-0x58], Other Possible Types: long long, uint128_t
    unsigned long v6;  // [bp-0x50]
    st_fc18_0 **v7;  // [bp-0x40], Other Possible Types: char
    st_fc18_0 *v8;  // [bp-0x38]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v2 = &v1;
    v1 = &v2;
    v11 = sub_13bcc();
    sub_10900(&v3, v11, 12297829382473034411 * ((long long)a0[8] - *(long long *)a0 >> 4), a0);
    v5->field_0 = &g_e61f08;
    *(int128_t *)&(&v5->field_0)[1] = *(int128_t *)(a1->padding_0)[1];
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string((char *)&v5->field_8 + 8, (char *)&a1->field_8 + 8);
    v5 = _INSERT(CONCAT(v5, 0), 0, &v5[1].field_8);
    v8 = &v7;
    v7 = &v8;
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
