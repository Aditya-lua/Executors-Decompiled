/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x63c70..0x63d8c (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_63c70_0 {
    char padding_0[16];
    long long field_10;
} st_63c70_0;

typedef struct st_63c70_1 {
    char field_0;
} st_63c70_1;


st_63c70_0 * sub_63c70(st_63c70_0 *a0, st_63c70_0 *a1, st_63c70_0 *a2)
{
    st_63c70_0 *i;  // x21
    st_63c70_0 *v9;  // x0
    unsigned long v13;  // cc_dep1
    unsigned long v14;  // cc_dep2
    unsigned long v15;  // cc_ndep
    unsigned long long v16;  // 4110
    unsigned long long v17;  // 4102
    unsigned long v18;  // cc_op
    long long v10;  // x22
    unsigned long long v11;  // 4110
    unsigned long long v12;  // 4102
    st_63c70_1 **v0;  // [bp-0x60], Other Possible Types: char
    st_63c70_1 *v1;  // [bp-0x58]
    st_63c70_0 *v2;  // [bp-0x50]
    unsigned long long v3;  // [bp-0x48]
    long long v4;  // [bp-0x40]
    char v5;  // [bp-0x38]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    i = a1;
    v1 = &v0;
    v0 = &v1;
    v9 = a0;
    if (v9->field_10)
    {
        v2 = a0;
        v3 = sub_638b4(a0);
        sub_63b98(&v2);
        v10 = v4;
        if (v10)
        {
            v11 = arm64g_calculate_condition(v18 | 16, v13, v14, v15);
            v12 = arm64g_calculate_condition(4, (v11 & 1 ? i : 0x40000000), (v11 & 1 ? a2 : 0), 0);
            if (!(v12 & 1))
                goto LABEL_63cd0;
        }
        else
        {
            v16 = arm64g_calculate_condition(v18 | 16, v13, v14, v15);
            v17 = arm64g_calculate_condition(0, (v16 & 1 ? i : 0x40000000), (v16 & 1 ? a2 : 0), 0);
            if (!(v17 & 1))
            {
                do
                {
LABEL_63cd0:
                    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(v10 + 32, &i[1].padding_0[8]);
                    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(v10 + 56, &i[2].padding_0[8]);
                    sub_626e0(a0, v5, sub_638e0(a0, &v5, v4 + 32), v4);
                    sub_63b98(&v2);
                    i = sub_62b88(i);
                    v10 = v4;
                } while (v10 && i != a2);
            }
        }
        v9 = sub_63860(&v2);
    }
    if (i == a2)
        return v9;
    do
    {
        sub_63610(a0, &i[1].padding_0[8]);
        i = sub_62b88(i);
    } while (i != a2);
    return i;
}
