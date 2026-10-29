/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b1ddc..0x1b1f34 (344 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b1ddc_1 {
    struct st_1b1ddc_2 *field_0;
    long long field_8;
} st_1b1ddc_1;

typedef struct st_1b1ddc_0 {
    struct st_1b1ddc_1 *field_0;
    long long field_8;
} st_1b1ddc_0;

typedef struct st_1b1ddc_4 {
    struct st_1b1ddc_2 *field_0;
    char field_8;
    char padding_9[7];
    struct st_1b1ddc_1 *field_10;
} st_1b1ddc_4;

typedef struct st_1b1ddc_2 {
    struct st_1b1ddc_0 *field_0;
} st_1b1ddc_2;

typedef struct st_1b1ddc_3 {
    char field_0;
} st_1b1ddc_3;


unsigned long long sub_1b1ddc(st_1b1ddc_4 *a0, unsigned long long a1)
{
    unsigned long long v5;  // x0
    unsigned long long v14;  // x0
    st_1b1ddc_1 **v15;  // x8
    unsigned long long v16;  // x0
    st_1b1ddc_1 *v6;  // x22
    unsigned long long index;  // x0
    st_1b1ddc_1 *v8;  // x23
    unsigned long long v9;  // x21
    unsigned long long idx;  // x0
    st_1b1ddc_2 **v11;  // x9
    st_1b1ddc_1 **v12;  // x10
    st_1b1ddc_1 *v13;  // x25
    st_1b1ddc_3 **v0;  // [bp-0x60], Other Possible Types: char
    st_1b1ddc_3 *v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a1)
    {
        v16 = sub_203f8(a0);
        *(unsigned long long *)&a0->field_8 = 0;
        return v16;
    }
    sub_203f8(a0, sub_12a38(&a0->field_8));
    *(unsigned long long *)&a0->field_8 = a1;
    v5 = _bzero(a0->field_0, a1 * 8);
    v6 = a0->field_10;
    if (!v6)
        return v5;
    index = sub_10c04(v6->field_8, a1);
    *(st_1b1ddc_4 **)&a0->field_0[index] = &a0->field_10;
    v8 = v6->field_0;
    if (!v8)
        return index;
    v9 = index;
    while (1)
    {
        idx = sub_10c04(v8->field_8, a1);
        if (idx == v9)
        {
LABEL_1b1e70:
            v6 = v8;
            v8 = v8->field_0;
            if (!v8)
                return idx;
        }
        else
        {
            v11 = a0->field_0;
            if (!v11[idx])
            {
                v11[idx] = v6;
                v9 = idx;
                goto LABEL_1b1e70;
            }
            else
            {
                v12 = v8->field_0;
                if (v12)
                {
                    v13 = v8;
                    do
                    {
                        v14 = sub_20b98(v8 + 1, v12 + 2);
                        v15 = v13->field_0;
                        if (!(v14 & 1))
                        {
                            v12 = v15;
                            v15 = v13;
                            break;
                        }
                    } while ((v12 = *v15, v13 = v15, v12));
                    v11 = a0->field_0;
                }
                else
                {
                    v15 = v8;
                }
                v6->field_0 = v12;
                *v15 = *(long long *)v11[idx];
                *(st_1b1ddc_1 **)v11[idx] = v8;
                v8 = v6->field_0;
                if (!v8)
                    return idx;
            }
        }
    }
}
