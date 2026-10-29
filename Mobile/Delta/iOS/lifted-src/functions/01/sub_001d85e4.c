/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d85e4..0x1d8858 (628 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1d85e4_3 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    unsigned long long field_30;
} st_1d85e4_3;

typedef struct st_1d85e4_2 {
    struct st_1d85e4_1 *field_0;
} st_1d85e4_2;

typedef struct st_1d85e4_1 {
    struct st_1d85e4_1 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    uint128_t field_18;
    uint128_t field_28;
    uint128_t field_38;
    unsigned long long field_48;
} st_1d85e4_1;

typedef struct st_1d85e4_0 {
    char field_0;
} st_1d85e4_0;

extern st_1d85e4_2 *g_f10da0;
extern st_1d85e4_1 *g_f10da8;
extern st_1d85e4_1 *g_f10db0;
extern unsigned long long g_f10db8;
extern float g_f10dc0;

st_1d85e4_1 * sub_1d85e4(unsigned long a0, unsigned long long *a1, unsigned long long *a2, st_1d85e4_3 *a3)
{
    long long v10;  // x20
    st_1d85e4_1 *v11;  // x19
    float v20;  // s1
    unsigned long long v21;  // 4171
    st_1d85e4_1 **v22;  // x8
    st_1d85e4_1 *v23;  // x9
    st_1d85e4_1 *v24;  // x24
    unsigned int v25;  // w0
    unsigned long long index;  // x0
    unsigned long long idx;  // x21
    st_1d85e4_1 *v13;  // x24
    st_1d85e4_1 *v14;  // x24
    st_1d85e4_1 *v15;  // x8
    uint128_t v16;  // q0
    uint128_t v17;  // q1
    uint128_t v18;  // q2
    float v19;  // s0
    st_1d85e4_0 **v0;  // [bp-0x98], Other Possible Types: char
    st_1d85e4_0 *v1;  // [bp-0x90]
    st_1d85e4_1 *v2;  // [bp-0x88], Other Possible Types: unsigned long
    st_1d85e4_2 **v3;  // [bp-0x80]
    char v4;  // [bp-0x78]
    char v5;  // [bp-0x77]
    st_1d85e4_0 **v6;  // [bp-0x70], Other Possible Types: char
    st_1d85e4_0 *v7;  // [bp-0x68], Other Possible Types: char
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v1 = &v0;
    v0 = &v1;
    v2 = *a1;
    v10 = sub_1a1bc(&v7, &v2, 8);
    v11 = g_f10da8;
    if (g_f10da8)
    {
        idx = sub_10c04(v10, g_f10da8);
        if (*(long long *)&g_f10da0[idx])
        {
            v13 = *(long long *)*(long long *)&g_f10da0[idx];
            if (*(long long *)*(long long *)&g_f10da0[idx])
            {
                do
                {
                    v14 = v13;
                    if (v14->field_8 != v10)
                    {
                        if (sub_10c04(v14->field_8, g_f10da8) != idx)
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
    v2 = sub_1dcad4();
    v3 = &g_f10da0;
    sub_16f34(&v5);
    v15 = v2;
    v15->field_0 = 0;
    v15->field_8 = v10;
    v15->field_10 = *a2;
    v16 = a3->field_0;
    v17 = a3->field_10;
    v18 = a3->field_20;
    *(unsigned long long *)((char *)&v15->field_38 + 8) = a3->field_30;
    *(uint128_t *)((char *)&v15->field_28 + 8) = v18;
    *(uint128_t *)((char *)&v15->field_18 + 8) = v17;
    *(uint128_t *)&(&v15->field_10)[1] = v16;
    v4 = 1;
    if (g_f10da8 && (v19 = (float)(g_f10db8 + 1), v20 = g_f10dc0 * (float)(unsigned long long)g_f10da8, v21 = arm64g_calculate_condition(64, (((((char)(CmpF(__float_as_int(v20), __float_as_int((float)(g_f10db8 + 1)))) >> 5 & 3 | v20 < (float)(g_f10db8 + 1)) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isunordered(v20, (float)(g_f10db8 + 1))) * 0x10000000, 0, 0), !(v21 & 1)))
    {
        v22 = g_f10da0;
        v23 = *(long long *)&g_f10da0[idx];
        v24 = v2;
        if (!v23)
            goto LABEL_1d87bc;
LABEL_1d874c:
        v24->field_0 = v23->field_0;
        v23->field_0 = v24;
    }
    else
    {
        v25 = sub_10884(g_f10da8);
        sub_1da244();
        v11 = g_f10da8;
        idx = sub_10c04(v10, g_f10da8);
        v22 = g_f10da0;
        v23 = *(long long *)&g_f10da0[idx];
        v24 = v2;
        if (v23)
            goto LABEL_1d874c;
LABEL_1d87bc:
        v24->field_0 = g_f10db0;
        g_f10db0 = v24;
        v22[idx] = &g_f10db0;
        if (v24->field_0)
        {
            index = sub_10c04(v24->field_0->field_8, v11);
            *(st_1d85e4_1 **)&g_f10da0[index] = v24;
            v24 = v2;
        }
    }
    v2 = 0;
    g_f10db8 = g_f10db8 + 1;
    sub_1d6950(&v2);
    return v24;
}
