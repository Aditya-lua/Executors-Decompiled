/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c7ae8..0x1c7bd0 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c7ae8_1 {
    char padding_0[1];
    char field_1;
    unsigned short field_2;
} st_1c7ae8_1;

typedef struct st_1c7ae8_0 {
    char field_0;
} st_1c7ae8_0;

extern char g_10002b0;

long long sub_1c7ae8(st_1c7ae8_1 *a0, long long a1, long long a2, unsigned int *a3)
{
    unsigned int v6;  // w8
    unsigned long v7;  // cc_op
    unsigned long v10;  // cc_ndep
    unsigned long long v11;  // 4112
    unsigned long long v12;  // 4102
    unsigned long v13;  // cc_dep1
    unsigned long v14;  // cc_dep2
    unsigned long v15;  // x8
    long long v16;  // w0
    long long v17;  // x0
    unsigned long long v8;  // 4112
    unsigned long long v9;  // 4102
    st_1c7ae8_0 **v0;  // [bp-0x450], Other Possible Types: char
    st_1c7ae8_0 *v1;  // [bp-0x448]
    char v2;  // [bp-0x439]
    unsigned long v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v6 = a0->field_1;
    if (v6 != 30)
    {
        v8 = arm64g_calculate_condition(v7 | 16, v13, v14, v10);
        v9 = arm64g_calculate_condition(19, (v8 & 1 ? v6 & 0xff : 0x40000000), (v8 & 1 ? 2 : 0), 0);
        if (v9 & 1)
            goto LABEL_1c7b9c;
LABEL_1c7b2c:
        v15 = a0->field_2;
        *a3 = (((((v15 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v15 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v15 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v15 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48;
        _bzero(&v2, 1025);
        v16 = (unsigned int)_getnameinfo(a0, a1, &v2, 1025, 0, 0, 2);
        v17 = !v16;
        if (!v16)
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign(a2, &v2);
    }
    else
    {
        v11 = arm64g_calculate_condition(v7 | 16, v13, v14, v10);
        v12 = arm64g_calculate_condition(16, (v11 & 1 ? v6 & 0xff : 0x40000000), (v11 & 1 ? 2 : 0), 0);
        if (!(v12 & 1))
            goto LABEL_1c7b2c;
LABEL_1c7b9c:
        v17 = 0;
    }
    if (*(long long *)&g_10002b0 == v3)
        return v17;
    ___stack_chk_fail();
}
