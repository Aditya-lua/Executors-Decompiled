/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1078d4..0x107bd8 (772 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1078d4_2 {
    unsigned long long field_0;
    char padding_8[64];
    char field_48;
    char padding_49[719];
    struct st_1078d4_0 *field_318;
    char padding_320[736];
    struct st_1078d4_0 *field_600;
} st_1078d4_2;

typedef struct st_1078d4_6 {
    char padding_0[8];
    struct st_1078d4_5 *field_8;
} st_1078d4_6;

typedef struct st_1078d4_5 {
    unsigned long long field_0;
    char padding_8[4];
    unsigned int field_c;
} st_1078d4_5;

typedef struct st_1078d4_0 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[16];
    unsigned int field_20;
    int field_24;
    char padding_28[8];
    int field_30;
} st_1078d4_0;

typedef struct st_1078d4_4 {
    char padding_0[66];
    char field_42;
} st_1078d4_4;

typedef struct st_1078d4_3 {
    char padding_0[80];
    struct st_1078d4_2 *field_50;
} st_1078d4_3;

typedef struct st_1078d4_1 {
    char field_0;
} st_1078d4_1;


unsigned long long sub_1078d4(st_1078d4_3 *a0, unsigned long a1)
{
    st_1078d4_2 *v12;  // x20
    unsigned long long v13;  // x21
    st_1078d4_0 *node;  // x22
    unsigned long v23;  // x24
    unsigned long v24;  // x9
    unsigned long v25;  // x25
    unsigned long long v26;  // x26
    unsigned long long v27;  // x27
    st_1078d4_4 *v28;  // x8
    unsigned long long v29;  // x19
    unsigned long long iter;  // x21
    unsigned long long v31;  // x26
    st_1078d4_2 *v14;  // x8
    unsigned long long idx;  // x28
    long long v33;  // w8
    unsigned long v34;  // cc_dep1
    unsigned long long v35;  // x10
    long long v36;  // x9
    unsigned long long v37;  // 4110
    unsigned long long v38;  // 4102
    unsigned long long v39;  // 4110
    unsigned long long v40;  // 4102
    st_1078d4_6 *v41;  // x20
    st_1078d4_0 *iter1;  // x22
    unsigned long v42;  // x8
    unsigned long index;  // x9
    st_1078d4_5 *v44;  // x8
    unsigned long v16;  // x24
    unsigned long v17;  // x9
    unsigned long v18;  // x25
    unsigned long long v19;  // x26
    unsigned long long v20;  // x27
    st_1078d4_4 *v21;  // x8
    st_1078d4_1 **v0;  // [bp-0xb0], Other Possible Types: char
    st_1078d4_1 *v1;  // [bp-0xa8]
    char *v2;  // [bp-0xa0], Other Possible Types: st_1078d4_1 *, unsigned long long *
    unsigned long long *v3;  // [bp-0x98]
    unsigned long long v4;  // [bp-0x90]
    unsigned long long v5;  // [bp-0x88]
    unsigned long long v6;  // [bp-0x80]
    unsigned long v7;  // [bp-0x78]
    char *v8;  // [bp-0x70], Other Possible Types: st_1078d4_1 *
    st_1078d4_1 **v9;  // [bp-0x68]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v1 = &v0;
    v0 = &v1;
    v6 = 0;
    v7 = a1;
    v4 = 0;
    v5 = 0;
    v2 = &v7;
    v3 = &v4;
    v9 = &v8;
    v8 = &v9;
    v12 = a0->field_50;
    v13 = v12->field_0;
    v12->field_0 = 0xffffffffffffffff;
    v14 = a0->field_50;
    iter1 = a0->field_50->field_318;
    if (a0->field_50->field_318)
    {
        do
        {
            v16 = iter1->field_24;
            v17 = (char *)&iter1[1].field_8 + 4;
            v18 = iter1->field_30;
            v19 = v17 + (unsigned int)v16 * (unsigned int)((iter1->field_20 - 64) / v16);
            if (v17 + v18 + v16 != v19)
            {
                v20 = &iter1->padding_0[v16];
                do
                {
                    v21 = v20 + v18;
                    if (v21->padding_0[64] && (a0->field_50->field_48 & 3 ^ v21->field_42 & 11) != 3)
                        sub_105d20(&v2);
                } while ((v20 += v16, v20 + v18 + 64 != v19));
            }
        } while ((iter1 = iter1->field_8, iter1));
        v14 = a0->field_50;
    }
    node = v14->field_600;
    if (v14->field_600)
    {
        do
        {
            v23 = node->field_24;
            v24 = (char *)&node[1].field_8 + 4;
            v25 = node->field_30;
            v26 = v24 + (unsigned int)v23 * (unsigned int)((node->field_20 - 64) / v23);
            if (v24 + v25 + v23 != v26)
            {
                v27 = &node->padding_0[v23];
                do
                {
                    v28 = v27 + v25;
                    if (v28->padding_0[64] && (a0->field_50->field_48 & 3 ^ v28->field_42 & 11) != 3)
                        sub_105d20(&v2);
                } while ((v27 += v23, v27 + v25 + 64 != v26));
            }
        } while ((node = node->field_8, node));
    }
    v12->field_0 = v13;
    if (v4 != v5)
    {
        v29 = sub_f1fb4(a0, 1, 1, 0);
        iter = v4;
        if (iter != v5)
        {
            v31 = 0;
            do
            {
                idx = *(long long *)iter;
                v33 = *(char *)(idx + 3);
                v34 = v33 & 0xff;
                if (v33 != 1)
                    continue;
                v35 = 12297829382473034411 * (*(long long *)(idx + 64) - *(long long *)(idx + 40) >> 4);
                v36 = *(long long *)(iter + 8);
                if (1 <= v36)
                {
                    v37 = arm64g_calculate_condition(163, v34, 1, 0);
                    v38 = arm64g_calculate_condition(196, (v37 & 1 ? v36 : 0), (v37 & 1 ? v35 : 0), 0);
                    if (v38 & 1)
                        continue;
                }
                else
                {
                    v39 = arm64g_calculate_condition(163, v34, 1, 0);
                    v40 = arm64g_calculate_condition(192, (v39 & 1 ? v36 : 0), (v39 & 1 ? v35 : 0), 0);
                    if (v40 & 1)
                        continue;
                }
                v41 = *(long long *)(idx + 40) + 48 * v36;
                if (sub_1048e4(&v7, v41))
                {
                    if (v31 != idx)
                    {
                        v2 = &v9;
                        v9 = &v2;
                        v42 = *(char *)(idx + 2);
                        if (v42 >> 2 & 1)
                        {
                            index = *(long long *)(idx + 80);
                            *(char *)(idx + 2) = (char)v42 & 251;
                            *(long long *)(idx + 120) = *(long long *)(index + 32);
                            *(unsigned long long *)(index + 32) = idx;
                        }
                        v31 = idx;
                    }
                    v44 = v41->field_8;
                    v44->field_0 = v29;
                    v44->field_c = 8;
                }
            } while ((iter += 16, iter != v5));
        }
    }
    else
    {
        v29 = 0;
    }
    v2 = &v4;
    sub_14fdc(&v2);
    return v29;
}
