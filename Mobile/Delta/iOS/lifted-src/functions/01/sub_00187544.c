/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x187544..0x187774 (560 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_187544_1 {
    struct st_187544_1 *field_0;
    unsigned long long field_8;
} st_187544_1;

typedef struct st_187544_2 {
    struct st_187544_3 *field_0;
    char padding_8[8];
    struct st_187544_1 *field_10;
    long long field_18;
    unsigned int field_20;
} st_187544_2;

typedef struct st_187544_3 {
    struct st_187544_1 *field_0;
} st_187544_3;

typedef struct st_187544_0 {
    char field_0;
} st_187544_0;


st_187544_1 * sub_187544(st_187544_2 *a0, long long a1, long long a2)
{
    long long v5;  // x0
    unsigned long long v6;  // x0
    float v15;  // s1
    unsigned long long v16;  // 4171
    st_187544_1 **v17;  // x8
    st_187544_1 *v18;  // x9
    unsigned int v19;  // w0
    st_187544_1 *v20;  // x24
    st_187544_1 *v21;  // x9
    unsigned long long index;  // x0
    long long v7;  // x21
    unsigned long long v8;  // x20
    unsigned long long idx;  // x23
    st_187544_1 *v10;  // x8
    st_187544_1 *v11;  // x24
    st_187544_1 *v12;  // x24
    long long v13;  // x8
    float v14;  // s0
    st_187544_0 **v0;  // [bp-0x78], Other Possible Types: char
    st_187544_0 *v1;  // [bp-0x70]
    st_187544_1 *v2;  // [bp-0x68], Other Possible Types: unsigned long long
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    v5 = sub_a0c8(a1);
    v6 = sub_a0c8(a1);
    v7 = sub_1a1bc(&v2, v5, v6 + sub_6b08(a1) - v5);
    v8 = (unsigned long long)a0->padding_8;
    if (v8)
    {
        idx = sub_10c04(v7, v8);
        v10 = *(long long *)&a0->field_0[idx];
        if (v10)
        {
            v11 = v10->field_0;
            if (v10->field_0)
            {
                do
                {
                    v12 = v11;
                    if (v12->field_8 != v7)
                    {
                        if (sub_10c04(v12->field_8, v8) != idx)
                            break;
                        if (v12->field_8 != v7)
                            continue;
                    }
                    if (sub_20b98(v12 + 1, a1) & 1)
                        return v12;
                } while ((v11 = v12->field_0, v12->field_0));
            }
        }
    }
    sub_18a3f8(a0, v7, a2);
    if (v8 && (v13 = a0->field_18, v14 = (float)(unsigned long long)(a0->field_18 + 1), v15 = *(float *)&a0->field_20 * (float)v8, v16 = arm64g_calculate_condition(64, (((((char)(CmpF(__float_as_int(v15), __float_as_int((float)(unsigned long long)(a0->field_18 + 1)))) >> 5 & 3 | v15 < (float)(unsigned long long)(a0->field_18 + 1)) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isunordered(v15, (float)(unsigned long long)(a0->field_18 + 1))) * 0x10000000, 0, 0), !(v16 & 1)))
    {
        v17 = a0->field_0;
        v18 = *(long long *)&a0->field_0[idx];
        if (!*(long long *)&a0->field_0[idx])
            goto LABEL_1876d8;
LABEL_18766c:
        v20 = v2;
        v20->field_0 = v18->field_0;
        v18->field_0 = v20;
    }
    else
    {
        v19 = sub_10884(v8);
        sub_13538();
        v8 = (unsigned long long)a0->padding_8;
        idx = sub_10c04(v7, a0->padding_8);
        v17 = a0->field_0;
        v18 = *(long long *)&a0->field_0[idx];
        if (*(long long *)&a0->field_0[idx])
            goto LABEL_18766c;
LABEL_1876d8:
        v21 = &a0->field_10;
        v20 = v2;
        v20->field_0 = a0->field_10;
        v21->field_0 = v20;
        v17[idx] = v21;
        if (v20->field_0)
        {
            index = sub_10c04(v20->field_0->field_8, v8);
            *(st_187544_1 **)&a0->field_0[index] = v20;
            v20 = v2;
        }
    }
    v2 = 0;
    a0->field_18 = a0->field_18 + 1;
    sub_175b0c(&v2, 0);
    return v20;
}
