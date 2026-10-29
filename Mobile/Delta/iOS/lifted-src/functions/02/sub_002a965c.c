/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a965c..0x2a97b0 (340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a965c_1 {
    char field_0;
    char padding_1[7];
    unsigned long long *field_8;
} st_2a965c_1;

typedef struct st_2a965c_0 {
    char field_0;
} st_2a965c_0;

extern long long g_e7f640;

long long sub_2a965c(st_2a965c_1 *a0, long long a1)
{
    unsigned int v7;  // w8
    unsigned long long *v8;  // x0
    unsigned long long *v9;  // x8
    long long v10;  // x0
    st_2a965c_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_2a965c_0 *v1;  // [bp-0x58]
    char v2;  // [bp-0x50], Other Possible Types: unsigned long
    unsigned long v3;  // [bp-0x48]
    char *v4;  // [bp-0x40]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v0 = &v1;
    v7 = a0->field_0;
    if (!v7)
    {
        a0->field_0 = 1;
        v8 = sub_10a00(&v2, 1);
        v4 = &v2;
        v8[2] = 0;
        v9 = v8;
        v9[1] = 0;
        *v9 = v9 + 1;
        v3 = 0;
        sub_2a5b30(&v3, 0);
        a0->field_8 = v9;
        v7 = a0->field_0;
    }
    if (v7 == 1)
    {
        v3 = 0;
        return sub_2ac368(a0->field_8, a1, a1, &v3) + 56;
    }
    v10 = ___cxa_allocate_exception(32);
    v2 = sub_2aeb88(a0);
    sub_2a7d2c("cannot use operator[] with a string argument with ", &v2);
    sub_2acd44(305, &v3, a0);
    ___cxa_throw(v10, &g_e7f640, 0x2aedb8);
    __debugbreak();
}
