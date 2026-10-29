/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8b2670..0x8b2d1c (1708 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8b2670_7 {
    unsigned long long field_0;
    char padding_8[4];
    unsigned int field_c;
} st_8b2670_7;

typedef struct st_8b2670_1 {
    char padding_0[24];
    struct st_8b2670_2 *field_18;
} st_8b2670_1;

typedef struct st_8b2670_5 {
    struct st_8b2670_1 *field_0;
    char field_1;
    char field_2;
    char padding_3[5];
    unsigned long long field_8;
    char padding_10[8];
    struct st_8b2670_3 *field_18;
} st_8b2670_5;

typedef struct st_8b2670_4 {
    unsigned int field_0;
} st_8b2670_4;

typedef struct st_8b2670_3 {
    char padding_0[480];
    struct st_8b2670_4 *field_1e0;
    unsigned long long field_1e8;
    unsigned int field_1f0;
    unsigned int field_1f4;
} st_8b2670_3;

typedef struct st_8b2670_2 {
    unsigned long long field_0;
} st_8b2670_2;

typedef struct st_8b2670_9 {
    struct st_8b2670_10 *field_0;
} st_8b2670_9;

typedef struct st_8b2670_10 {
    struct st_8b2670_9 *field_0;
} st_8b2670_10;

typedef struct st_8b2670_8 {
    char padding_0[88];
    struct st_8b2670_7 *field_58;
} st_8b2670_8;

typedef struct st_8b2670_0 {
    char field_0;
} st_8b2670_0;

typedef struct st_8b2670_6 {
    struct st_8b2670_5 *field_0;
    unsigned int field_8;
} st_8b2670_6;


st_8b2670_5 * sub_8b2670(st_8b2670_8 *a0)
{
    st_8b2670_5 *v9;  // x0
    st_8b2670_5 *v10;  // w22
    unsigned int v19;  // w12
    st_8b2670_7 *v20;  // x8
    st_8b2670_3 *v11;  // x24
    unsigned long long v12;  // 4121
    st_8b2670_6 *v13;  // x8
    st_8b2670_5 *v14;  // x21
    st_8b2670_5 *i;  // w10
    st_8b2670_5 *v16;  // w8
    st_8b2670_5 *v17;  // x9
    unsigned int v18;  // w11
    st_8b2670_5 *v0;  // [bp-0xb8]
    st_8b2670_0 **v1;  // [bp-0xb0], Other Possible Types: char
    st_8b2670_0 *v2;  // [bp-0xa8]
    st_8b2670_0 **v3;  // [bp-0xa0], Other Possible Types: char
    st_8b2670_0 *v4;  // [bp-0x98]
    st_8b2670_10 **v5;  // [bp-0x90]
    st_8b2670_10 **v6;  // [bp-0x88]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v2 = &v1;
    v1 = &v2;
    v9 = sub_3c4464();
    if (!v9)
        return v9;
    v10 = (st_8b2670_5 *)0;
    v0 = v9;
    v11 = (st_8b2670_3 *)v9->padding_10;
    v4 = &v3;
    v3 = &v4;
    while (1)
    {
        v12 = arm64g_calculate_condition(1, *(int *)((char *)v11->field_1e0 + 0x4 * v10), 1, 0);
        if (!(v12 & 1) && !(v13 = v11->field_1e8 + (v11->field_1f0 + (*(int *)((char *)v11->field_1e0 + 0x4 * v10) | ~v11->field_1f0) + 1) * 16, v13->field_8 != 2))
        {
            v14 = v13->field_0;
            v9 = sub_a0c8(*(long long *)&v14->field_1);
            v5 = &v6;
            v6 = &v5;
            i = (st_8b2670_5 *)(char)v9->field_0;
            if (i)
            {
                v16 = (st_8b2670_5 *)0;
                v17 = (char *)&v9->field_0 + 1;
                v18 = 3760312;
                do
                {
                    v19 = v18 + ~v18 * 2 + 1;
                    v16 = (char *)&v16->field_0 + 1;
                    v18 = 23 * ((v18 ^ -i) + (v19 + (v18 & -i) + (i | ~v19)) * 2 + 2) * v16;
                    i = (st_8b2670_5 *)(char)v17->field_0;
                    v17 = (char *)&v17->field_0 + 1;
                } while (i);
                if (v18 == 1881569176)
                    break;
            }
        }
        v10 = (char *)&v10->field_0 + 1;
        if (v10 >> ((char)v11->field_1f4 & 31))
            return v9;
    }
    if (!v14)
        return v9;
    v20 = a0->field_58;
    v20->field_0 = 0x3ff0000000000000;
    v20->field_c = 3;
    a0->field_58 = a0->field_58 + 1;
    v14->field_0->field_18();
}
