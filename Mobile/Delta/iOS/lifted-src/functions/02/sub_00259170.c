/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x259170..0x25928c (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_259170_2 {
    char padding_0[24];
    char field_18;
} st_259170_2;

typedef struct st_259170_0 {
    char field_0;
} st_259170_0;

typedef struct st_259170_1 {
    char padding_0[1152];
    unsigned long long field_480;
} st_259170_1;

extern unsigned long long g_e7a8c8;
extern unsigned long long g_e7a8f0;
extern st_259170_1 *g_f0d198;

void sub_259170(long long a0, unsigned long a1)
{
    unsigned long long v13;  // x22
    unsigned long long v14;  // x21
    unsigned long long v15;  // x20
    unsigned long long v16;  // x19
    unsigned long long v17;  // x30
    long long *v18;  // x0
    st_259170_2 *v19;  // x8
    uint128_t v0;  // [bp-0x70]
    st_259170_0 **v1;  // [bp-0x60], Other Possible Types: char
    st_259170_0 *v2;  // [bp-0x58]
    uint128_t v3;  // [bp-0x50]
    st_259170_0 **v4;  // [bp-0x40], Other Possible Types: char
    st_259170_0 *v5;  // [bp-0x38]
    unsigned long long v6;  // [bp-0x30]
    unsigned long long v7;  // [bp-0x28]
    unsigned long long v8;  // [bp-0x20]
    unsigned long long v9;  // [bp-0x18]
    char *v10;  // [bp-0x10]
    unsigned long long v11;  // [bp-0x8]
    char v12;  // [bp+0x0]

    v6 = v13;
    v7 = v14;
    v8 = v15;
    v9 = v16;
    v10 = &v12;
    v11 = v17;
    v2 = &v1;
    v1 = &v2;
    v18 = sub_1a8a90(g_f0d198->field_480 + 89712);
    v3 = CONCAT(a1, v18);
    if (*(long long *)(g_f0d198->field_480 + 89728) != v18)
    {
        v0 = 0x10000000000000030;
        do
        {
            if (!(sub_1a587c(v18[3], v18[4], a0) & 1))
            {
                v5 = &v4;
                v4 = &v5;
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(v19, v18);
                v19->field_18 = 1;
                goto *((void *)(g_e7a8c8));
            }
        } while ((v3 = _mm_add_epi64(v3, v0), sub_1acea4(&v3), v18 = (unsigned long long)v3, v18 != *(long long *)(g_f0d198->field_480 + 89728)));
    }
    goto *((void *)(g_e7a8f0));
}
