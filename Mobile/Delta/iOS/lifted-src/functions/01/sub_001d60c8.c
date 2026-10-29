/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d60c8..0x1d6254 (396 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1d60c8_4 {
    struct st_1d60c8_4 *field_0;
    char field_1;
    char padding_2[6];
    unsigned long long field_8;
    char padding_10[8];
    struct st_1d60c8_1 *field_18;
    char padding_20[120];
    struct st_1d60c8_5 *field_98;
} st_1d60c8_4;

typedef struct st_1d60c8_6 {
    char padding_0[12];
    struct st_1d60c8_4 *field_c;
} st_1d60c8_6;

typedef struct st_1d60c8_3 {
    char padding_0[32];
    struct st_1d60c8_4 *field_20;
} st_1d60c8_3;

typedef struct st_1d60c8_2 {
    unsigned int field_0;
} st_1d60c8_2;

typedef struct st_1d60c8_1 {
    char padding_0[480];
    struct st_1d60c8_2 *field_1e0;
    unsigned long long field_1e8;
    unsigned int field_1f0;
    unsigned int field_1f4;
} st_1d60c8_1;

typedef struct st_1d60c8_5 {
    struct st_1d60c8_3 *field_0;
} st_1d60c8_5;

typedef struct st_1d60c8_7 {
    char padding_0[88];
    struct st_1d60c8_6 *field_58;
} st_1d60c8_7;

typedef struct st_1d60c8_0 {
    char field_0;
} st_1d60c8_0;


int sub_1d60c8(st_1d60c8_7 *a0)
{
    st_1d60c8_4 *v10;  // x0
    st_1d60c8_4 *v11;  // w21
    unsigned int v20;  // w11
    st_1d60c8_6 *v21;  // x8
    st_1d60c8_6 **v22;  // x19
    st_1d60c8_4 *v23;  // w9
    st_1d60c8_1 *v12;  // x22
    unsigned long long v13;  // 4121
    st_1d60c8_4 **v14;  // x8
    st_1d60c8_4 *v15;  // x28
    char *v16;  // x0
    st_1d60c8_4 *i;  // w8
    char *v18;  // x9
    unsigned int v19;  // w10
    st_1d60c8_0 **v0;  // [bp-0xa0], Other Possible Types: char
    st_1d60c8_0 *v1;  // [bp-0x98]
    st_1d60c8_0 **v2;  // [bp-0x90], Other Possible Types: char
    st_1d60c8_0 *v3;  // [bp-0x88]
    st_1d60c8_0 **v4;  // [bp-0x80], Other Possible Types: char
    st_1d60c8_0 *v5;  // [bp-0x78]
    st_1d60c8_5 **v6;  // [bp-0x70]
    st_1d60c8_5 **v7;  // [bp-0x68]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v1 = &v0;
    v0 = &v1;
    v10 = sub_3c78b8(0);
    if (v10)
    {
        v11 = (st_1d60c8_4 *)0;
        v3 = &v2;
        v2 = &v3;
        v12 = (st_1d60c8_1 *)v10->padding_10;
        v5 = &v4;
        v4 = &v5;
        do
        {
            v13 = arm64g_calculate_condition(1, *(int *)((char *)v12->field_1e0 + 0x4 * v11), 1, 0);
            if (v13 & 1 || !(v14 = v12->field_1e8 + (v12->field_1f0 & *(int *)((char *)v12->field_1e0 + 0x4 * v11)) * 16, !(int)v14[1]))
                continue;
            v15 = *v14;
            v16 = sub_a0c8(*(long long *)&v15->field_1);
            v6 = &v7;
            v7 = &v6;
            i = (st_1d60c8_4 *)*v16;
            if (!i)
                continue;
            v18 = v16 + 1;
            v19 = 3760312;
            v20 = 23;
            do
            {
                v19 = (v19 ^ i) * v20;
                i = (st_1d60c8_4 *)*v18;
                v18 += 1;
                v20 += 23;
            } while (i);
            if (v19 == 3163873344 && v15)
            {
                v7 = &v6;
                v6 = &v7;
                if (*(long long *)(*(long long *)*(long long *)&v15->padding_20[112] + 32))
                    (*(long long *)(*(long long *)*(long long *)&v15->padding_20[112] + 32))();
            }
        } while ((v11 = (char *)&v11->field_0 + 1, !(v11 >> ((char)v12->field_1f4 & 31))));
        v21 = a0->field_58;
        v22 = &a0->field_58;
        *(double *)&v21->padding_0[0] = 0.0;
        v23 = (st_1d60c8_4 *)3;
    }
    else
    {
        v23 = (st_1d60c8_4 *)0;
        v21 = a0->field_58;
        v22 = &a0->field_58;
    }
    *(unsigned int *)&(v21->padding_0)[1] = (unsigned int)v23;
    *v22 = &*v22->field_c;
    return 1;
}
