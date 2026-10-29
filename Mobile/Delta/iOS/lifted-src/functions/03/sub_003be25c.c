/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3be25c..0x3be4e4 (648 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3be25c_1 {
    char padding_0[24];
    unsigned long long field_18;
} st_3be25c_1;

typedef struct st_3be25c_2 {
    struct st_3be25c_2 *field_0;
    long long field_8;
    char field_10;
    char padding_11[23];
    unsigned long long field_28;
} st_3be25c_2;

typedef struct st_3be25c_3 {
    struct st_3be25c_4 *field_0;
    char padding_8[8];
    struct st_3be25c_2 *field_10;
    long long field_18;
    unsigned int field_20;
    char padding_24[20];
    unsigned long long field_38;
} st_3be25c_3;

typedef struct st_3be25c_4 {
    struct st_3be25c_2 *field_0;
} st_3be25c_4;

typedef struct st_3be25c_0 {
    char field_0;
} st_3be25c_0;


st_3be25c_2 * sub_3be25c(st_3be25c_3 *a0, long long a1, st_3be25c_1 *a2)
{
    long long v10;  // x0
    unsigned long long v11;  // x0
    float v20;  // s0
    float v21;  // s1
    unsigned long long v22;  // 4171
    st_3be25c_2 **v23;  // x8
    st_3be25c_2 *v24;  // x9
    unsigned int v25;  // w0
    st_3be25c_2 *v26;  // x24
    st_3be25c_3 *v27;  // x9
    st_3be25c_2 *v28;  // x9
    unsigned long long index;  // x0
    long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long idx;  // x23
    st_3be25c_2 *v15;  // x8
    st_3be25c_2 *v16;  // x24
    st_3be25c_2 *v17;  // x24
    st_3be25c_2 *v18;  // x25
    long long v19;  // x8
    st_3be25c_0 **v0;  // [bp-0x88], Other Possible Types: char
    st_3be25c_0 *v1;  // [bp-0x80]
    st_3be25c_2 *v2;  // [bp-0x78], Other Possible Types: char, unsigned long long
    st_3be25c_3 *v3;  // [bp-0x70]
    long long v4;  // [bp-0x68], Other Possible Types: unsigned long long
    char v5;  // [bp-0x67]
    st_3be25c_0 **v6;  // [bp-0x60], Other Possible Types: char
    st_3be25c_0 *v7;  // [bp-0x58]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v1 = &v0;
    v0 = &v1;
    v10 = sub_a0c8(a1);
    v11 = sub_a0c8(a1);
    v12 = sub_1a1bc(&v2, v10, v11 + sub_6b08(a1) - v10);
    v13 = (unsigned long long)a0->padding_8;
    if (v13)
    {
        idx = sub_10c04(v12, v13);
        v15 = *(long long *)&a0->field_0[idx];
        if (v15)
        {
            v16 = v15->field_0;
            if (v15->field_0)
            {
                do
                {
                    v17 = v16;
                    if (v17->field_8 != v12)
                    {
                        if (sub_10c04(v17->field_8, v13) != idx)
                            break;
                        if (v17->field_8 != v12)
                            continue;
                    }
                    if (sub_20b98(&v17->field_10, a1) & 1)
                        return v17;
                } while ((v16 = v17->field_0, v17->field_0));
            }
        }
    }
    v7 = &v6;
    v6 = &v7;
    v2 = sub_174c0(a0, 1);
    v3 = a0;
    v4 = 0;
    sub_16f34(&v5);
    v18 = v2;
    v18->field_0 = 0;
    v18->field_8 = v12;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v18->field_10, a2);
    v18->field_28 = a2->field_18;
    v4 = 1;
    if (v13 && (v19 = a0->field_18, v20 = (float)(unsigned long long)(a0->field_18 + 1), v21 = *(float *)&a0->field_20 * (float)v13, v22 = arm64g_calculate_condition(64, (((((char)(CmpF(__float_as_int(v21), __float_as_int((float)(unsigned long long)(a0->field_18 + 1)))) >> 5 & 3 | v21 < (float)(unsigned long long)(a0->field_18 + 1)) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isunordered(v21, (float)(unsigned long long)(a0->field_18 + 1))) * 0x10000000, 0, 0), !(v22 & 1)))
    {
        v23 = a0->field_0;
        v24 = v23[idx];
        if (!v24)
            goto LABEL_3be430;
LABEL_3be3c4:
        v26 = v2;
        v26->field_0 = v24->field_0;
        v24->field_0 = v26;
    }
    else
    {
        v25 = sub_10884(v13);
        sub_13538();
        v13 = (unsigned long long)a0->padding_8;
        idx = sub_10c04(v12, v13);
        v23 = a0->field_0;
        v24 = v23[idx];
        if (v24)
            goto LABEL_3be3c4;
LABEL_3be430:
        v27 = a0;
        v28 = &v27->field_10;
        v26 = v2;
        v26->field_0 = v27->field_10;
        v28->field_0 = v26;
        v23[idx] = v28;
        if (v26->field_0)
        {
            index = sub_10c04(v26->field_0->field_8, v13);
            *(st_3be25c_2 **)&a0->field_0[index] = v26;
            v26 = v2;
        }
    }
    v2 = 0;
    a0->field_18 = a0->field_18 + 1;
    sub_1f24c(&v2, 0);
    return v26;
}
