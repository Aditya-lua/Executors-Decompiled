/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x16b618..0x16bbb8 (1440 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_16b618_1 {
    char padding_0[24];
    struct st_16b618_2 *field_18;
} st_16b618_1;

typedef struct st_16b618_5 {
    struct st_16b618_1 *field_0;
    char field_1;
    char padding_2[6];
    unsigned long long field_8;
    char padding_10[8];
    struct st_16b618_3 *field_18;
} st_16b618_5;

typedef struct st_16b618_4 {
    unsigned int field_0;
} st_16b618_4;

typedef struct st_16b618_3 {
    char padding_0[480];
    struct st_16b618_4 *field_1e0;
    unsigned long long field_1e8;
    unsigned int field_1f0;
    unsigned int field_1f4;
} st_16b618_3;

typedef struct st_16b618_2 {
    unsigned long long field_0;
} st_16b618_2;

typedef struct st_16b618_8 {
    struct st_16b618_9 *field_0;
} st_16b618_8;

typedef struct st_16b618_9 {
    struct st_16b618_8 *field_0;
} st_16b618_9;

typedef struct st_16b618_0 {
    char field_0;
} st_16b618_0;

typedef struct st_16b618_6 {
    struct st_16b618_5 *field_0;
    unsigned int field_8;
} st_16b618_6;

typedef struct st_16b618_7 {
    char padding_0[376];
    struct st_16b618_2 *field_178;
} st_16b618_7;

extern st_16b618_7 *g_f0d3d8;

unsigned long long sub_16b618(unsigned long a0, st_16b618_5 *a1)
{
    st_16b618_5 *v8;  // x0
    st_16b618_5 *v9;  // w22
    unsigned int v18;  // w11
    st_16b618_3 *v10;  // x23
    unsigned long long v11;  // 4121
    st_16b618_6 *v12;  // x8
    st_16b618_5 *v13;  // x21
    char *v14;  // x0
    st_16b618_5 *i;  // w8
    char *v16;  // x9
    unsigned int v17;  // w10
    st_16b618_0 **v0;  // [bp-0xa0], Other Possible Types: char
    st_16b618_0 *v1;  // [bp-0x98]
    st_16b618_0 **v2;  // [bp-0x80], Other Possible Types: char
    st_16b618_0 *v3;  // [bp-0x78]
    st_16b618_0 **v4;  // [bp-0x70], Other Possible Types: st_16b618_9 **, char
    st_16b618_0 *v5;  // [bp-0x68], Other Possible Types: st_16b618_9 **
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v1 = &v0;
    v0 = &v1;
    if (a1)
    {
        v5 = &v4;
        v4 = &v5;
        g_f0d3d8->field_178();
    }
    v8 = sub_3c78b8(0);
    if (v8)
    {
        v9 = (st_16b618_5 *)0;
        v10 = (st_16b618_3 *)v8->padding_10;
        v3 = &v2;
        v2 = &v3;
        do
        {
            v11 = arm64g_calculate_condition(1, *(int *)((char *)v10->field_1e0 + 0x4 * v9), 1, 0);
            if (!(v11 & 1))
            {
                v12 = v10->field_1e8 + (v10->field_1f0 & *(int *)((char *)v10->field_1e0 + 0x4 * v9)) * 16;
                if (v12->field_8 == 2)
                {
                    v13 = v12->field_0;
                    v14 = sub_a0c8(*(long long *)&v13->field_1);
                    v4 = &v5;
                    v5 = &v4;
                    i = (st_16b618_5 *)*v14;
                    if (i)
                    {
                        v16 = v14 + 1;
                        v17 = 23;
                        v18 = 3760312;
                        do
                        {
                            v18 = (v18 ^ i) * v17;
                            i = (st_16b618_5 *)*v16;
                            v16 += 1;
                            v17 += 23;
                        } while (i);
                        if (v18 == 4259997968)
                        {
                            if (v13)
                                v13->field_0->field_18();
                            return v13 & 0xffffffff;
                        }
                    }
                }
            }
        } while ((v9 = (char *)&v9->field_0 + 1, !(v9 >> ((char)v10->field_1f4 & 31))));
        v8 = 0;
    }
    return v8 * 0x100000000;
}
