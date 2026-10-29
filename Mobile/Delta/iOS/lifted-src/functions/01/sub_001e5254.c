/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1e5254..0x1e54a0 (588 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1e5254_1 {
    struct st_1e5254_1 *field_0;
    long long field_8;
    unsigned long long field_10;
    struct st_1e5254_1 *field_18;
} st_1e5254_1;

typedef struct st_1e5254_2 {
    unsigned long long field_0;
} st_1e5254_2;

typedef struct st_1e5254_0 {
    char field_0;
} st_1e5254_0;


st_1e5254_1 * sub_1e5254(void* a0, unsigned long long *a1, unsigned long a2, st_1e5254_2 **a3)
{
    long long v10;  // x21
    st_1e5254_1 *v11;  // x20
    st_1e5254_1 **v20;  // x8
    st_1e5254_1 *v21;  // x9
    unsigned int v22;  // w0
    st_1e5254_1 *v23;  // x24
    void* v24;  // x9
    st_1e5254_1 *v25;  // x9
    unsigned long long index;  // x0
    unsigned long long idx;  // x22
    st_1e5254_1 *v13;  // x24
    st_1e5254_1 *v14;  // x24
    st_1e5254_1 *v15;  // x8
    long long v16;  // x8
    float v17;  // s0
    float v18;  // s1
    unsigned long long v19;  // 4171
    st_1e5254_0 **v0;  // [bp-0x88], Other Possible Types: char
    st_1e5254_0 *v1;  // [bp-0x80]
    st_1e5254_1 *v2;  // [bp-0x78], Other Possible Types: unsigned long
    void* v3;  // [bp-0x70]
    st_1e5254_1 *v4;  // [bp-0x68], Other Possible Types: long long
    char v5;  // [bp-0x67]
    st_1e5254_0 **v6;  // [bp-0x60], Other Possible Types: char
    st_1e5254_0 *v7;  // [bp-0x58], Other Possible Types: char
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v1 = &v0;
    v0 = &v1;
    v2 = *a1;
    v10 = sub_1a1bc(&v7, &v2, 8);
    v11 = (long long)a0[8];
    if (v11)
    {
        idx = sub_10c04(v10, v11);
        if (*(long long *)(*(long long *)a0 + idx * 8))
        {
            v13 = *(long long *)*(long long *)(*(long long *)a0 + idx * 8);
            if (*(long long *)*(long long *)(*(long long *)a0 + idx * 8))
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
    v4 = (st_1e5254_1 *)0;
    sub_16f34(&v5);
    v15 = v2;
    v15->field_0 = 0;
    v15->field_8 = v10;
    v15->field_10 = *(long long *)*a3;
    v15->field_18 = 0;
    v4 = 1;
    if (v11 && (v16 = (long long)a0[24], v17 = (float)(unsigned long long)((long long)a0[24] + 1), v18 = (int)a0[32] * (float)(unsigned long long)v11, v19 = arm64g_calculate_condition(64, (((((char)(CmpF(__float_as_int(v18), __float_as_int((float)(unsigned long long)((long long)a0[24] + 1)))) >> 5 & 3 | v18 < (float)(unsigned long long)((long long)a0[24] + 1)) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isunordered(v18, (float)(unsigned long long)((long long)a0[24] + 1))) * 0x10000000, 0, 0), !(v19 & 1)))
    {
        v20 = *(long long *)a0;
        v21 = v20[idx];
        if (!v21)
            goto LABEL_1e5404;
LABEL_1e5398:
        v23 = v2;
        v23->field_0 = v21->field_0;
        v21->field_0 = v23;
    }
    else
    {
        v22 = sub_10884(v11);
        sub_13538();
        v11 = (long long)a0[8];
        idx = sub_10c04(v10, v11);
        v20 = *(long long *)a0;
        v21 = v20[idx];
        if (v21)
            goto LABEL_1e5398;
LABEL_1e5404:
        v24 = a0;
        v25 = v24 + 16;
        v23 = v2;
        v23->field_0 = (long long)v24[16];
        v25->field_0 = v23;
        v20[idx] = v25;
        if (v23->field_0)
        {
            index = sub_10c04(v23->field_0->field_8, v11);
            *(st_1e5254_1 **)(*(long long *)a0 + index * 8) = v23;
            v23 = v2;
        }
    }
    v2 = 0;
    *(long long *)&a0[24] = (long long)a0[24] + 1;
    sub_3b024(&v2, 0);
    return v23;
}
