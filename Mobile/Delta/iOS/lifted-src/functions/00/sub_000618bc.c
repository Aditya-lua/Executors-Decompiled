/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x618bc..0x61a54 (408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_618bc_1 {
    unsigned long long *field_0;
    char padding_8[32];
    unsigned long long field_28;
} st_618bc_1;

typedef struct st_618bc_0 {
    char field_0;
} st_618bc_0;

extern unsigned long long g_e69ce8;
extern unsigned long long g_e69cf8;

st_618bc_1 * sub_618bc(st_618bc_1 *a0, long long a1, char a2)
{
    unsigned int v5;  // w0
    unsigned long long v6;  // 4112
    unsigned long long v7;  // x22
    unsigned long long v8;  // x0
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned long long v11;  // 4108
    unsigned long long v12;  // 4108
    unsigned long long *v13;  // x8
    st_618bc_0 **v0;  // [bp-0x78], Other Possible Types: char
    st_618bc_0 *v1;  // [bp-0x70]
    char v2;  // [bp-0x61]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    std::__1::basic_istream<char, std::__1::char_traits<char>>::sentry::sentry(&v2, a0, 1);
    if (v2 != 1)
        return a0;
    sub_30d84(a1);
    v5 = sub_62ed0(*(long long *)((char *)a0 + *(long long *)((char *)a0->field_0 - 24) + 40));
    v6 = arm64g_calculate_condition(1, v5, 1, 0);
    if (v6 & 1)
    {
        goto *((void *)(g_e69cf8));
    }
    else if ((v5 & 0xff) == a2)
    {
        goto *((void *)(g_e69cf8));
    }
    else
    {
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(a1, (char)v5);
        v7 = sub_6b08(a1);
        v8 = sub_1dcb8(a1);
        v9 = v7;
        v10 = v8;
        if (v7 == v8)
        {
            v11 = arm64g_calculate_condition(4, v9, v10, 0);
            if (!(v11 & 1))
                goto LABEL_619aa;
            v13 = &g_e69cf8;
LABEL_619a9:
        }
        else
        {
            v12 = arm64g_calculate_condition(4, v9, v10, 0);
            if (v12 & 1)
                goto LABEL_619a9;
LABEL_619aa:
            v13 = &g_e69ce8;
        }
        goto *((void *)(*v13));
    }
}
