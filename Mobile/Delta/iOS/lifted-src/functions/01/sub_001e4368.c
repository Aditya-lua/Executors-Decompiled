/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1e4368..0x1e45c4 (604 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1e4368_1 {
    struct st_1e4368_1 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_1e4368_1;

typedef struct st_1e4368_2 {
    struct st_1e4368_1 *field_0;
} st_1e4368_2;

typedef struct st_1e4368_0 {
    char field_0;
} st_1e4368_0;

extern st_1e4368_2 *g_f10d00;
extern st_1e4368_1 *g_f10d08;
extern st_1e4368_1 *g_f10d10;
extern unsigned long long g_f10d18;
extern float g_f10d20;

st_1e4368_1 * sub_1e4368(unsigned long a0, unsigned long long *a1, unsigned long long *a2, unsigned long long *a3)
{
    long long v10;  // x20
    st_1e4368_1 *v11;  // x19
    st_1e4368_1 **v20;  // x8
    st_1e4368_1 *v21;  // x9
    st_1e4368_1 *v22;  // x24
    unsigned int v23;  // w0
    unsigned long long index;  // x0
    unsigned long long idx;  // x21
    st_1e4368_1 *v13;  // x24
    st_1e4368_1 *v14;  // x24
    st_1e4368_1 *v15;  // x8
    unsigned long long v16;  // x10
    float v17;  // s0
    float v18;  // s1
    unsigned long long v19;  // 4171
    st_1e4368_0 **v0;  // [bp-0x98], Other Possible Types: char
    st_1e4368_0 *v1;  // [bp-0x90]
    st_1e4368_1 *v2;  // [bp-0x88], Other Possible Types: unsigned long
    st_1e4368_2 **v3;  // [bp-0x80]
    char v4;  // [bp-0x78]
    char v5;  // [bp-0x77]
    st_1e4368_0 **v6;  // [bp-0x70], Other Possible Types: char
    st_1e4368_0 *v7;  // [bp-0x68], Other Possible Types: char
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v1 = &v0;
    v0 = &v1;
    v2 = *a1;
    v10 = sub_1a1bc(&v7, &v2, 8);
    v11 = g_f10d08;
    if (g_f10d08)
    {
        idx = sub_10c04(v10, g_f10d08);
        if (*(long long *)&g_f10d00[idx])
        {
            v13 = *(long long *)*(long long *)&g_f10d00[idx];
            if (*(long long *)*(long long *)&g_f10d00[idx])
            {
                do
                {
                    v14 = v13;
                    if (v14->field_8 != v10)
                    {
                        if (sub_10c04(v14->field_8, g_f10d08) != idx)
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
    v2 = sub_607c4();
    v3 = &g_f10d00;
    sub_16f34(&v5);
    v15 = v2;
    v15->field_0 = 0;
    v15->field_8 = v10;
    v16 = *a3;
    v15->field_10 = *a2;
    v15->field_18 = v16;
    v4 = 1;
    if (g_f10d08 && (v17 = (float)(g_f10d18 + 1), v18 = g_f10d20 * (float)(unsigned long long)g_f10d08, v19 = arm64g_calculate_condition(64, (((((char)(CmpF(__float_as_int(v18), __float_as_int((float)(g_f10d18 + 1)))) >> 5 & 3 | v18 < (float)(g_f10d18 + 1)) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isunordered(v18, (float)(g_f10d18 + 1))) * 0x10000000, 0, 0), !(v19 & 1)))
    {
        v20 = g_f10d00;
        v21 = *(long long *)&g_f10d00[idx];
        v22 = v2;
        if (!v21)
            goto LABEL_1e4528;
LABEL_1e44b8:
        v22->field_0 = v21->field_0;
        v21->field_0 = v22;
    }
    else
    {
        v23 = sub_10884(g_f10d08);
        sub_1da644();
        v11 = g_f10d08;
        idx = sub_10c04(v10, g_f10d08);
        v20 = g_f10d00;
        v21 = *(long long *)&g_f10d00[idx];
        v22 = v2;
        if (v21)
            goto LABEL_1e44b8;
LABEL_1e4528:
        v22->field_0 = g_f10d10;
        g_f10d10 = v22;
        v20[idx] = &g_f10d10;
        if (v22->field_0)
        {
            index = sub_10c04(v22->field_0->field_8, v11);
            *(st_1e4368_1 **)&g_f10d00[index] = v22;
            v22 = v2;
        }
    }
    v2 = 0;
    g_f10d18 = g_f10d18 + 1;
    sub_1d6950(&v2);
    return v22;
}
