/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13160..0x13538 (984 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_13160_1 {
    char padding_0[88];
    char field_58;
    char padding_59[39];
    char field_80;
    char padding_81[3];
    uint128_t field_84;
    char padding_94[4];
    long long field_98;
    char padding_a0[56];
    long long field_d8;
} st_13160_1;

typedef struct st_13160_2 {
    long long field_0;
    char field_1;
} st_13160_2;

typedef struct st_13160_0 {
    char field_0;
} st_13160_0;

extern char g_f0c9f0;

long long sub_13160(st_13160_1 *a0)
{
    unsigned int v10;  // w0
    long long v11;  // x0
    unsigned long long v20;  // x0
    st_13160_2 *v21;  // x0
    st_13160_2 *v22;  // x0
    unsigned int v23;  // w20
    st_13160_2 *v24;  // x0
    st_13160_2 *v25;  // x0
    unsigned long v26;  // x21
    long long v27;  // x0
    unsigned long long v28;  // x20
    long long v12;  // x0
    unsigned long long v13;  // 4106
    long long v14;  // x0
    unsigned long long v15;  // x0
    unsigned long long v16;  // x0
    unsigned long long v17;  // x0
    unsigned long long v18;  // x0
    st_13160_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_13160_0 *v1;  // [bp-0x78]
    st_13160_0 *v2;  // [bp-0x70], Other Possible Types: char, unsigned long
    unsigned long v3;  // [bp-0x68]
    unsigned long v4;  // [bp-0x60]
    unsigned long v5;  // [bp-0x58], Other Possible Types: unsigned long long
    uint128_t v6;  // [bp-0x50]
    st_13160_0 **v7;  // [bp-0x38], Other Possible Types: char
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v1 = &v0;
    v0 = &v1;
    v6 = *(int128_t *)(a0->padding_81)[1];
    v10 = sub_b19c(&a0->field_80);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign(&a0[4].padding_a0[24], *(long long *)((char *)&a0->field_84 + 8), v10);
    v4 = 0;
    v5 = 0;
    if (a0->field_58 == 1)
    {
        v2 = &v7;
        v7 = &v2;
        v11 = sub_a0c8(&a0[4].padding_a0[24]);
        v4 = sub_201a0(a0, v11, sub_6b08(&a0[4].padding_a0[24]) + 1);
        v5 = sub_6b08(&a0[4].padding_a0[24]);
    }
    v12 = sub_a0c8(&a0[4].padding_a0[24]);
    v13 = arm64g_calculate_condition(2, sub_c854(v12, sub_6b08(&a0[4].padding_a0[24]), 95, 0), 1, 0);
    if (!(v13 & 1))
    {
        v14 = sub_a0c8(&a0[4].padding_a0[24]);
        v15 = sub_a0c8(&a0[4].padding_a0[24]);
        v2 = 95;
        v16 = sub_10ce8(v14, v15 + sub_6b08(&a0[4].padding_a0[24]), &v2);
        v17 = sub_a0c8(&a0[4].padding_a0[24]);
        v18 = sub_6b08(&a0[4].padding_a0[24]);
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::erase(&a0[4].padding_a0[24], v16 - sub_a0c8(&a0[4].padding_a0[24]), v17 + v18 - v16);
    }
    if (g_f0c9f0 != 1 || (v20 = sub_a0c8(&a0[4].padding_a0[24]), *(char *)(sub_a0c8(&a0[4].padding_a0[24]) + sub_6b08(&a0[4].padding_a0[24]) - 1) != 105))
    {
        v7 = 0;
        v28 = sub_12204(&v7, sub_a0c8(&a0[4].padding_a0[24]));
        sub_f8d0(a0);
        if ((unsigned int)v28 == 2)
        {
            v2 = 0;
            v3 = 0;
            v2 = v2;
            return sub_11094(a0, &v6, &v2);
        }
        v26 = sub_404c(*(long long *)&a0->padding_a0[40], 48);
        sub_5428(v26, &v6, v28);
        if (a0->field_58 != 1)
            return v26;
        v27 = sub_404c(*(long long *)&a0->padding_a0[40], 24);
        sub_8630(v27, &v4);
        goto LABEL_133f4;
    }
    v7 = 0;
    v21 = sub_a0c8(&a0[4].padding_a0[24]);
    if ((char)v21->field_0 == 48 && *((char *)&v21->field_0 + 1) == 120 || !(v22 = sub_a0c8(&a0[4].padding_a0[24]), (char)v22->field_0 != 48 || *((char *)&v22->field_0 + 1) != 88))
    {
        v23 = sub_f3c4(&v7, sub_a0c8(&a0[4].padding_a0[24]), 16);
        sub_f8d0(a0);
        if (!v23)
            goto LABEL_134d8;
    }
    else
    {
        v24 = sub_a0c8(&a0[4].padding_a0[24]);
        if ((char)v24->field_0 == 48 && *((char *)&v24->field_0 + 1) == 98 || !(v25 = sub_a0c8(&a0[4].padding_a0[24]), (char)v25->field_0 != 48 || *((char *)&v25->field_0 + 1) != 66))
        {
            v23 = sub_f3c4(&v7, sub_a0c8(&a0[4].padding_a0[24]) + 2, 2);
            sub_f8d0(a0);
            if (!v23)
                goto LABEL_134d8;
        }
        else
        {
            v23 = sub_f3c4(&v7, sub_a0c8(&a0[4].padding_a0[24]), 10);
            sub_f8d0(a0);
            if (!v23)
            {
LABEL_134d8:
                v26 = sub_404c(*(long long *)&a0->padding_a0[40], 48);
                sub_5b48(v26, &v6, v7, 0);
                if (a0->field_58 != 1)
                    return v26;
                v27 = sub_404c(*(long long *)&a0->padding_a0[40], 24);
                sub_8788(v27, &v4);
LABEL_133f4:
                v2 = v26;
                sub_1c9f0(&a0[4].padding_a0[48], &v2);
                *(long long *)(sub_12484(&a0[4].padding_a0[48], &v2) + 8) = v27;
                return v26;
            }
        }
    }
    if (v23 != 2)
    {
        v2 = 0;
        v3 = 0;
        v2 = v2;
        return sub_11094(a0, &v6, &v2);
    }
    v2 = 0;
    v3 = 0;
    v2 = v2;
    return sub_11094(a0, &v6, &v2);
}
