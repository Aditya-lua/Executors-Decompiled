/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x61b54..0x61cac (344 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_61b54_1 {
    char padding_0[16];
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
    unsigned long long field_38;
    char field_40;
    char padding_41[23];
    unsigned long long field_58;
    char field_60;
} st_61b54_1;

typedef struct st_61b54_0 {
    char field_0;
} st_61b54_0;


unsigned long long sub_61b54(st_61b54_1 *a0, unsigned long long a1)
{
    unsigned long long v4;  // 4172
    unsigned long long v5;  // x22
    unsigned long long v14;  // x8
    unsigned long long v15;  // x0
    unsigned long long v16;  // x8
    unsigned long long v6;  // x21
    unsigned long long v7;  // x23
    unsigned long long v8;  // x8
    unsigned long long v10;  // x25
    unsigned long long v11;  // x20
    unsigned long long v12;  // x0
    unsigned long long v13;  // x23
    st_61b54_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_61b54_0 *v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = arm64g_calculate_condition(1, a1 & 0xffffffff, 1, 0);
    if (v4 & 1)
        return sub_6312c(0xffffffff);
    v5 = a0->field_10;
    v6 = a0->field_18;
    v7 = a0->field_30;
    if (v7 != a0->field_38)
    {
        v8 = a0->field_58;
        if (v7 + 1 >= a0->field_58)
            v8 = v7 + 1;
        a0->field_58 = v8;
        if (a0->field_60 >> 3 & 1)
            goto LABEL_61bb8;
    }
    else
    {
        if (!(a0->field_60 >> 4 & 1))
            return 0xffffffff;
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(&a0->field_40, 0);
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::resize(&a0->field_40, sub_62e44(&a0->field_40), 0);
        v10 = a0->field_58 - a0->field_28;
        v11 = sub_a0c8(&a0->field_40);
        v12 = sub_6b08(&a0->field_40);
        v13 = v11 + v7 - a0->field_28;
        a0->field_28 = v11;
        a0->field_30 = v13;
        a0->field_38 = v11 + v12;
        v14 = v11 + v10;
        if (v13 + 1 >= v14)
            v14 = v13 + 1;
        a0->field_58 = v14;
        if (a0->field_60 >> 3 & 1)
        {
LABEL_61bb8:
            v15 = sub_a0c8(&a0->field_40);
            v16 = a0->field_58;
            a0->field_10 = v15;
            a0->field_18 = v15 + v6 - v5;
            a0->field_20 = v16;
        }
    }
    return sub_63138(a0, (char)a1);
}
