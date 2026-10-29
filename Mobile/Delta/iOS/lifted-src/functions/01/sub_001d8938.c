/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d8938..0x1d8b84 (588 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1d8938_1 {
    struct st_1d8938_1 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
} st_1d8938_1;

typedef struct st_1d8938_2 {
    struct st_1d8938_1 *field_0;
} st_1d8938_2;

typedef struct st_1d8938_0 {
    char field_0;
} st_1d8938_0;

extern st_1d8938_2 *g_f10d50;
extern st_1d8938_1 *g_f10d58;
extern st_1d8938_1 *g_f10d60;
extern unsigned long long g_f10d68;
extern float g_f10d70;

st_1d8938_1 * sub_1d8938(unsigned long a0, unsigned long long *a1, unsigned long long *a2)
{
    long long v10;  // x20
    st_1d8938_1 *v11;  // x19
    st_1d8938_1 *v20;  // x9
    st_1d8938_1 *v21;  // x23
    unsigned int v22;  // w0
    unsigned long long index;  // x0
    unsigned long long idx;  // x21
    st_1d8938_1 *v13;  // x23
    st_1d8938_1 *v14;  // x23
    st_1d8938_1 *v15;  // x8
    float v16;  // s0
    float v17;  // s1
    unsigned long long v18;  // 4171
    st_1d8938_1 **v19;  // x8
    st_1d8938_0 **v0;  // [bp-0x88], Other Possible Types: char
    st_1d8938_0 *v1;  // [bp-0x80]
    st_1d8938_1 *v2;  // [bp-0x78], Other Possible Types: unsigned long
    st_1d8938_2 **v3;  // [bp-0x70]
    char v4;  // [bp-0x68]
    char v5;  // [bp-0x67]
    st_1d8938_0 **v6;  // [bp-0x60], Other Possible Types: char
    st_1d8938_0 *v7;  // [bp-0x58], Other Possible Types: char
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v1 = &v0;
    v0 = &v1;
    v2 = *a1;
    v10 = sub_1a1bc(&v7, &v2, 8);
    v11 = g_f10d58;
    if (g_f10d58)
    {
        idx = sub_10c04(v10, g_f10d58);
        if (*(long long *)&g_f10d50[idx])
        {
            v13 = *(long long *)*(long long *)&g_f10d50[idx];
            if (*(long long *)*(long long *)&g_f10d50[idx])
            {
                do
                {
                    v14 = v13;
                    if (v14->field_8 != v10)
                    {
                        if (sub_10c04(v14->field_8, g_f10d58) != idx)
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
    v2 = sub_1dd784();
    v3 = &g_f10d50;
    sub_16f34(&v5);
    v15 = v2;
    v15->field_0 = 0;
    v15->field_8 = v10;
    v15->field_10 = *a2;
    v4 = 1;
    if (g_f10d58 && (v16 = (float)(g_f10d68 + 1), v17 = g_f10d70 * (float)(unsigned long long)g_f10d58, v18 = arm64g_calculate_condition(64, (((((char)(CmpF(__float_as_int(v17), __float_as_int((float)(g_f10d68 + 1)))) >> 5 & 3 | v17 < (float)(g_f10d68 + 1)) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isunordered(v17, (float)(g_f10d68 + 1))) * 0x10000000, 0, 0), !(v18 & 1)))
    {
        v19 = g_f10d50;
        v20 = *(long long *)&g_f10d50[idx];
        v21 = v2;
        if (!v20)
            goto LABEL_1d8aec;
LABEL_1d8a7c:
        v21->field_0 = v20->field_0;
        v20->field_0 = v21;
    }
    else
    {
        v22 = sub_10884(g_f10d58);
        sub_1e3148();
        v11 = g_f10d58;
        idx = sub_10c04(v10, g_f10d58);
        v19 = g_f10d50;
        v20 = *(long long *)&g_f10d50[idx];
        v21 = v2;
        if (v20)
            goto LABEL_1d8a7c;
LABEL_1d8aec:
        v21->field_0 = g_f10d60;
        g_f10d60 = v21;
        v19[idx] = &g_f10d60;
        if (v21->field_0)
        {
            index = sub_10c04(v21->field_0->field_8, v11);
            *(st_1d8938_1 **)&g_f10d50[index] = v21;
            v21 = v2;
        }
    }
    v2 = 0;
    g_f10d68 = g_f10d68 + 1;
    sub_1d6950(&v2);
    return v21;
}
