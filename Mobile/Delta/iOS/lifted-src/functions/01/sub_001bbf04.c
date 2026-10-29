/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1bbf04..0x1bc104 (512 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1bbf04_0 {
    char field_0;
} st_1bbf04_0;

extern unsigned long long g_e72398;

long long * sub_1bbf04(long long a0)
{
    unsigned long v4;  // x8
    long long *v6;  // x0
    unsigned int v7;  // w8
    unsigned long long v8;  // x9
    st_1bbf04_0 **v0;  // [bp-0x78], Other Possible Types: char
    st_1bbf04_0 *v1;  // [bp-0x70]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    memset(v4, 0, 24);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::reserve(v4, sub_6b08());
    v6 = sub_2fa10(a0, 0);
    if (!*(char *)v6)
        return v6;
    v7 = *(char *)sub_2fa10(a0, 0);
    v8 = 144;
    if (v7 == 32)
        v8 = 72;
    if (v7 == 43)
        v8 = 152;
    if (v7 == 13)
        v8 = 0x88;
    if (v7 == 10)
        v8 = 16;
    if (v7 == 39)
        v8 = 56;
    if (v7 == 44)
        v8 = 48;
    if (v7 == 59)
        v8 = 80;
    goto *((void *)(*(long long *)((char *)&g_e72398 + v8)));
}
