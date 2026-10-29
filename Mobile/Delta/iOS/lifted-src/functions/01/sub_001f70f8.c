/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f70f8..0x1f7218 (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f70f8_1 {
    char padding_0[149];
    char field_95;
    char padding_96[1];
    char field_97;
    char padding_98[48];
    unsigned long long field_c8;
} st_1f70f8_1;

typedef struct st_1f70f8_0 {
    char field_0;
} st_1f70f8_0;

extern long long g_e730e8;

int sub_1f70f8(st_1f70f8_1 *a0, long long a1, long long a2, unsigned int a3)
{
    unsigned long v7;  // x20
    long long v9;  // x0
    st_1f70f8_0 **v0;  // [bp-0x58], Other Possible Types: char
    st_1f70f8_0 *v1;  // [bp-0x50]
    unsigned long long v2;  // [bp-0x48]
    unsigned long long v3;  // [bp-0x40]
    unsigned long long v4;  // [bp-0x38]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v2 = 0;
    v0 = &v1;
    v3 = 0;
    v4 = 0;
    sub_1f7e80();
    if (!sub_1f39a8(a0, &v2, a1, a2) || !(sub_1eccdc(a0, v2, v2 + v3 * 4, a3 & 0x1ff) & 1))
    {
        v7 = a0->field_c8;
        if (v7)
        {
            sub_1eccac(v7 + 48);
            sub_1eccac(v7 + 24);
            operatordelete(sub_1eccac(v7));
        }
        a0->field_c8 = 0;
        if (!(a0->field_95 & 1))
        {
            v9 = ___cxa_allocate_exception(24);
            sub_1f0654(v9, a0->field_97);
            ___cxa_throw(v9, &g_e730e8, 0x1ee8d0);
            __debugbreak();
        }
    }
    sub_1eccac(&v2);
    return 1;
}
