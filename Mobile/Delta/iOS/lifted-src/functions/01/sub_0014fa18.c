/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x14fa18..0x14fb54 (316 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_14fa18_1 {
    unsigned long long field_0;
    struct st_14fa18_2 *field_8;
    char *field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    char padding_28[8];
    unsigned int field_30;
    unsigned int field_34;
} st_14fa18_1;

typedef struct st_14fa18_2 {
    unsigned long long field_0;
} st_14fa18_2;

typedef struct st_14fa18_0 {
    char field_0;
} st_14fa18_0;


st_14fa18_1 * sub_14fa18(st_14fa18_1 *a0, unsigned long long *a1)
{
    st_14fa18_1 *v4;  // x0
    unsigned long v5;  // x8
    unsigned long long v14;  // x10
    unsigned long long *v15;  // x23
    unsigned long long v6;  // x9
    unsigned long v7;  // x10
    unsigned long long v8;  // x22
    unsigned long long idx;  // x21
    char *v10;  // x9
    unsigned long long i;  // w11
    unsigned long long v12;  // x10
    unsigned long long v13;  // x10
    st_14fa18_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_14fa18_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0;
    if (!v4->padding_28)
    {
        v4 = sub_d6f78(a0);
        if (!(v4 & 0x1))
            v4 = sub_e2504(a0);
    }
    v5 = *a1;
    v6 = a0->field_0 * (0xff51afd7ed558ccd * (v5 ^ v5 >> 33) ^ 0xff51afd7ed558ccd * (v5 ^ v5 >> 33) >> 33) ^ a0->field_0 * (0xff51afd7ed558ccd * (v5 ^ v5 >> 33) ^ 0xff51afd7ed558ccd * (v5 ^ v5 >> 33) >> 33) >> 33;
    v7 = a0->field_30;
    v8 = v7 + ((v6 & 31) >> ((char)a0->field_34 & 63));
    idx = a0->field_20 & v6 >> 5;
    v10 = a0->field_10;
    i = v10[idx];
    if (i >= (unsigned int)v8)
    {
        do
        {
            v8 += v7;
            i = v10[1 + idx];
            idx += 1;
        } while ((unsigned int)v8 <= i);
    }
    if ((unsigned int)v7 + ((unsigned int)v8 & 0xff) >= 0x100)
    {
        *(unsigned long long *)a0->padding_28 = 0;
        i = v10[idx];
    }
    if (i)
    {
        v12 = 0;
        do
        {
            v13 = v12;
            v14 = v13 + 1;
            v12 = v14;
        } while (v10[1 + v13 + idx]);
        v15 = a0->field_8;
        if (v14)
        {
            v4 = sub_153928(a0, idx + v14, idx);
            v5 = *a1;
            v10 = a0->field_10;
        }
    }
    else
    {
        v15 = a0->field_8;
    }
    v15[idx] = v5;
    v10[idx] = v8;
    a0->field_18 = a0->field_18 + 1;
    return v4;
}
