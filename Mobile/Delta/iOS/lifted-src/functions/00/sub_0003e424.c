/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3e424..0x3e658 (564 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3e424_1 {
    struct st_3e424_1 *field_0;
    long long field_8;
    unsigned int field_10;
    char padding_14[4];
    struct st_3e424_1 *field_18;
} st_3e424_1;

typedef struct st_3e424_2 {
    unsigned int field_0;
} st_3e424_2;

typedef struct st_3e424_3 {
    struct st_3e424_4 *field_0;
    struct st_3e424_1 *field_8;
    struct st_3e424_1 *field_10;
    unsigned long long field_18;
    unsigned int field_20;
    char padding_24[4];
    struct st_3e424_1 *field_28;
} st_3e424_3;

typedef struct st_3e424_4 {
    struct st_3e424_1 *field_0;
} st_3e424_4;

typedef struct st_3e424_0 {
    char field_0;
} st_3e424_0;


st_3e424_1 * sub_3e424(st_3e424_3 *a0, int *a1, unsigned long a2, st_3e424_2 **a3)
{
    unsigned long v10;  // x21
    st_3e424_1 *v11;  // x20
    st_3e424_1 **v20;  // x8
    st_3e424_1 *v21;  // x9
    unsigned int v22;  // w0
    st_3e424_1 *v23;  // x24
    st_3e424_3 *v24;  // x9
    st_3e424_1 *v25;  // x9
    unsigned long long index;  // x0
    unsigned long long idx;  // x22
    st_3e424_1 *v13;  // x24
    st_3e424_1 *v14;  // x24
    st_3e424_1 *v15;  // x8
    unsigned long v16;  // x8
    float v17;  // s0
    float v18;  // s1
    unsigned long long v19;  // 4171
    st_3e424_0 **v0;  // [bp-0x88], Other Possible Types: char
    st_3e424_0 *v1;  // [bp-0x80]
    st_3e424_1 *v2;  // [bp-0x78]
    st_3e424_3 *v3;  // [bp-0x70]
    st_3e424_1 *v4;  // [bp-0x68], Other Possible Types: long long
    char v5;  // [bp-0x67]
    st_3e424_0 **v6;  // [bp-0x60], Other Possible Types: char
    st_3e424_0 *v7;  // [bp-0x58]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v1 = &v0;
    v0 = &v1;
    v10 = *a1;
    v11 = a0->field_8;
    if (v11)
    {
        idx = sub_10c04(v10, v11);
        if (*(long long *)&a0->field_0[idx])
        {
            v13 = *(long long *)*(long long *)&a0->field_0[idx];
            if (*(long long *)*(long long *)&a0->field_0[idx])
            {
                do
                {
                    v14 = v13;
                    if (v14->field_8 != v10)
                    {
                        if (sub_10c04(v14->field_8, v11) != idx)
                            break;
                        if (v14->field_8 != v10)
                            continue;
                    }
                    if (v14->field_10 == *a1)
                        return v14;
                } while ((v13 = v14->field_0, v14->field_0));
            }
        }
    }
    v7 = &v6;
    v6 = &v7;
    v2 = sub_1e5a4(a0, 1);
    v3 = a0;
    v4 = (st_3e424_1 *)0;
    sub_16f34(&v5);
    v15 = v2;
    v15->field_0 = 0;
    v15->field_8 = v10;
    v15->field_10 = *(int *)*a3;
    v15->field_18 = 0;
    v4 = 1;
    if (v11 && (v16 = a0->field_18, v17 = (float)(a0->field_18 + 1), v18 = *(float *)&a0->field_20 * (float)(unsigned long long)v11, v19 = arm64g_calculate_condition(64, (((((char)(CmpF(__float_as_int(v18), __float_as_int((float)(a0->field_18 + 1)))) >> 5 & 3 | v18 < (float)(a0->field_18 + 1)) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isunordered(v18, (float)(a0->field_18 + 1))) * 0x10000000, 0, 0), !(v19 & 1)))
    {
        v20 = a0->field_0;
        v21 = v20[idx];
        if (!v21)
            goto LABEL_3e5c0;
LABEL_3e554:
        v23 = v2;
        v23->field_0 = v21->field_0;
        v21->field_0 = v23;
    }
    else
    {
        v22 = sub_10884(v11);
        sub_13538();
        v11 = a0->field_8;
        idx = sub_10c04(v10, v11);
        v20 = a0->field_0;
        v21 = v20[idx];
        if (v21)
            goto LABEL_3e554;
LABEL_3e5c0:
        v24 = a0;
        v25 = &v24->field_10;
        v23 = v2;
        v23->field_0 = v24->field_10;
        v25->field_0 = v23;
        v20[idx] = v25;
        if (v23->field_0)
        {
            index = sub_10c04(v23->field_0->field_8, v11);
            *(st_3e424_1 **)&a0->field_0[index] = v23;
            v23 = v2;
        }
    }
    v2 = 0;
    a0->field_18 = a0->field_18 + 1;
    sub_3b024(&v2, 0);
    return v23;
}
