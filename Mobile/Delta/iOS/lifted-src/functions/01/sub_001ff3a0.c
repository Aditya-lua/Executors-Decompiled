/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ff3a0..0x1ff558 (440 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ff3a0_2 {
    unsigned long long field_0;
    char padding_8[64];
    char field_48;
    char padding_49[719];
    struct st_1ff3a0_0 *field_318;
    char padding_320[736];
    struct st_1ff3a0_0 *field_600;
} st_1ff3a0_2;

typedef struct st_1ff3a0_0 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[16];
    unsigned int field_20;
    int field_24;
    char padding_28[8];
    int field_30;
} st_1ff3a0_0;

typedef struct st_1ff3a0_4 {
    char padding_0[66];
    char field_42;
} st_1ff3a0_4;

typedef struct st_1ff3a0_3 {
    char padding_0[80];
    struct st_1ff3a0_2 *field_50;
} st_1ff3a0_3;

typedef struct st_1ff3a0_1 {
    char field_0;
} st_1ff3a0_1;


unsigned long long sub_1ff3a0(st_1ff3a0_3 *a0, unsigned long a1)
{
    st_1ff3a0_2 *v8;  // x20
    unsigned long long v9;  // x21
    st_1ff3a0_0 *iter;  // x22
    unsigned long v19;  // x24
    unsigned long v20;  // x9
    unsigned long v21;  // x25
    unsigned long long v22;  // x26
    unsigned long long v23;  // x27
    st_1ff3a0_4 *v24;  // x8
    st_1ff3a0_2 *v10;  // x8
    st_1ff3a0_0 *node;  // x22
    unsigned long v12;  // x24
    unsigned long v13;  // x9
    unsigned long v14;  // x25
    unsigned long long v15;  // x26
    unsigned long long v16;  // x27
    st_1ff3a0_4 *v17;  // x8
    char *v0;  // [bp-0x90]
    unsigned long long *v1;  // [bp-0x88]
    unsigned long long v2;  // [bp-0x80]
    unsigned long v3;  // [bp-0x78]
    st_1ff3a0_1 **v4;  // [bp-0x70], Other Possible Types: char
    st_1ff3a0_1 *v5;  // [bp-0x68]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v2 = 0;
    v3 = a1;
    v0 = &v3;
    v1 = &v2;
    v5 = &v4;
    v4 = &v5;
    v8 = a0->field_50;
    v9 = v8->field_0;
    v8->field_0 = 0xffffffffffffffff;
    v10 = a0->field_50;
    node = a0->field_50->field_318;
    if (a0->field_50->field_318)
    {
        do
        {
            v12 = node->field_24;
            v13 = (char *)&node[1].field_8 + 4;
            v14 = node->field_30;
            v15 = v13 + (unsigned int)v12 * (unsigned int)((node->field_20 - 64) / v12);
            if (v13 + v14 + v12 != v15)
            {
                v16 = &node->padding_0[v12];
                do
                {
                    v17 = v16 + v14;
                    if (v17->padding_0[64] && (a0->field_50->field_48 & 3 ^ v17->field_42 & 11) != 3 && sub_1fec08(&v0) & 1)
                        goto LABEL_1ff530;
                } while ((v16 += v12, v16 + v14 + 64 != v15));
            }
        } while ((node = node->field_8, node));
        v10 = a0->field_50;
    }
    iter = v10->field_600;
    if (v10->field_600)
    {
        do
        {
            v19 = iter->field_24;
            v20 = (char *)&iter[1].field_8 + 4;
            v21 = iter->field_30;
            v22 = v20 + (unsigned int)v19 * (unsigned int)((iter->field_20 - 64) / v19);
            if (v20 + v21 + v19 != v22)
            {
                v23 = &iter->padding_0[v19];
                do
                {
                    v24 = v23 + v21;
                    if (v24->padding_0[64] && (a0->field_50->field_48 & 3 ^ v24->field_42 & 11) != 3 && sub_1fec08(&v0) & 1)
                        goto LABEL_1ff530;
                } while ((v23 += v19, v23 + v21 + 64 != v22));
            }
        } while ((iter = iter->field_8, iter));
    }
LABEL_1ff530:
    v8->field_0 = v9;
    return v2;
}
