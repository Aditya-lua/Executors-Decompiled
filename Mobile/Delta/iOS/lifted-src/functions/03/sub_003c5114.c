/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c5114..0x3c5204 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c5114_0 {
    char field_0;
} st_3c5114_0;

extern unsigned long long g_e7d7d8;
extern unsigned long long g_e7d7f8;

void sub_3c5114(long long a0, long long a1)
{
    unsigned long long v10;  // x22
    unsigned long long v11;  // x21
    unsigned long long v12;  // x20
    unsigned long long v13;  // x19
    unsigned long long v14;  // x30
    long long v15;  // x0
    st_3c5114_0 **v0;  // [bp-0x58], Other Possible Types: char
    st_3c5114_0 *v1;  // [bp-0x50]
    char v2;  // [bp-0x48]
    unsigned long long v3;  // [bp-0x30]
    unsigned long long v4;  // [bp-0x28]
    unsigned long long v5;  // [bp-0x20]
    unsigned long long v6;  // [bp-0x18]
    char *v7;  // [bp-0x10]
    unsigned long long v8;  // [bp-0x8]
    char v9;  // [bp+0x0]

    v3 = v10;
    v4 = v11;
    v5 = v12;
    v6 = v13;
    v7 = &v9;
    v8 = v14;
    v1 = &v0;
    v0 = &v1;
    v15 = sub_3c78b8(1);
    if (v15)
    {
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v2, a1);
        sub_3c4844(a0, v15, &v2);
        sub_d5c30(a0, sub_a0c8(a1));
        goto *((void *)(g_e7d7d8));
    }
    else
    {
        goto *((void *)(g_e7d7f8));
    }
}
