/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3da7a4..0x3da8c0 (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3da7a4_1 {
    unsigned long long *field_0;
    char field_8;
    char padding_9[23];
    unsigned int field_20;
    char padding_24[380];
    unsigned long long field_1a0;
    char padding_1a8[40];
    unsigned long long field_1d0;
    char padding_1d8[80];
    unsigned long long field_228;
    unsigned int field_230;
} st_3da7a4_1;

typedef struct st_3da7a4_0 {
    char field_0;
} st_3da7a4_0;

extern unsigned long long g_e7f380;
extern char g_e7f3a8;
extern unsigned long long g_e7f3f0;
extern char g_e7f418;

st_3da7a4_1 * sub_3da7a4(st_3da7a4_1 *a0, long long a1, unsigned int a2)
{
    st_3da7a4_1 *v4;  // x0
    st_3da7a4_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_3da7a4_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    a0->field_1d0 = 0;
    a0->field_0 = &g_e7f3f0;
    a0->field_1a0 = &g_e7f418;
    std::__1::ios_base::init(&a0->field_1a0, &a0->field_8);
    a0->field_228 = 0;
    a0->field_230 = 0xffffffff;
    a0->field_0 = &g_e7f380;
    a0->field_1a0 = &g_e7f3a8;
    sub_647d0(&a0->field_8);
    if (sub_64e34(&a0->field_8, sub_a0c8(a1), a2 | 16))
        return a0;
    v4 = (char *)a0 + *(long long *)((char *)a0->field_0 - 24);
    std::__1::ios_base::clear(v4, v4->field_20 | 4);
    return a0;
}
