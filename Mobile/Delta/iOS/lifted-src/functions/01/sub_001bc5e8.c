/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1bc5e8..0x1bc7bc (468 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1bc5e8_1 {
    unsigned long long field_0;
    struct st_1bc5e8_1 *field_8;
    struct st_1bc5e8_1 *field_10;
} st_1bc5e8_1;

typedef struct st_1bc5e8_2 {
    char padding_0[56];
    struct st_1bc5e8_1 *field_38;
} st_1bc5e8_2;

typedef struct st_1bc5e8_0 {
    char field_0;
} st_1bc5e8_0;

extern unsigned long long g_e6fa38;
extern unsigned long long g_e6fdf8;
extern unsigned long long g_e6fe28;

long long sub_1bc5e8(st_1bc5e8_2 *a0, long long a1, long long a2)
{
    st_1bc5e8_1 *v7;  // x23
    long long iter;  // x21
    st_1bc5e8_1 *v17;  // x9
    st_1bc5e8_1 *v18;  // x0
    st_1bc5e8_1 *v19;  // x22
    st_1bc5e8_1 *v20;  // x8
    st_1bc5e8_1 *v21;  // x0
    st_1bc5e8_1 *v22;  // x8
    st_1bc5e8_1 *v9;  // x0
    st_1bc5e8_1 *v10;  // x8
    st_1bc5e8_1 *v11;  // x9
    long long v12;  // x21
    st_1bc5e8_1 *v13;  // x26
    st_1bc5e8_1 *v14;  // x0
    st_1bc5e8_1 *v15;  // x9
    st_1bc5e8_1 *v16;  // x0
    unsigned long long v0;  // [bp-0x80]
    st_1bc5e8_0 **v1;  // [bp-0x78], Other Possible Types: char
    st_1bc5e8_0 *v2;  // [bp-0x70]
    char v3;  // [bp-0x62]
    char v4;  // [bp-0x61]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v2 = &v1;
    v1 = &v2;
    v7 = a0->field_38;
    v3 = 10;
    iter = sub_18494(a1, a2, &v3, &v4);
    if (iter != a1)
    {
        sub_1ae5c8(a0);
        if (iter != a2)
            iter += 1;
        if (iter == a2)
            return iter;
    }
    else
    {
        v9 = operatornew(16);
        v10 = a0->field_38;
        v11 = v10->field_8;
        v9->field_0 = &g_e6fa38;
        v9->field_8 = v11;
        v10->field_8 = v9;
        a0->field_38 = v9;
        if (iter == a2)
            iter = iter;
        else
            iter += 1;
        if (iter == a2)
            return iter;
    }
    v0 = &g_e6fa38;
    do
    {
        v3 = 10;
        v12 = sub_18494(iter, a2, &v3, &v4);
        v13 = a0->field_38;
        if (v12 == iter)
        {
            v14 = operatornew(16);
            v15 = v13->field_8;
            v14->field_0 = v0;
            v14->field_8 = v15;
            v13->field_8 = v14;
            a0->field_38 = v14;
        }
        else
        {
            sub_1ae5c8(a0, iter, v12);
        }
        v16 = operatornew(24);
        v17 = v13->field_8;
        v16->field_8 = v7->field_8;
        v16->field_10 = v17;
        v16->field_0 = &g_e6fdf8;
        v7->field_8 = v16;
        v13->field_8 = 0;
        v18 = operatornew(16);
        v19 = a0->field_38;
        v20 = v19->field_8;
        v18->field_0 = &g_e6fa38;
        v18->field_8 = v20;
        v13->field_8 = v18;
        v19->field_8 = 0;
        v21 = operatornew(16);
        v22 = v13->field_8;
        v21->field_0 = &g_e6fe28;
        v21->field_8 = v22;
        v19->field_8 = v21;
        a0->field_38 = v13->field_8;
        if (v12 == a2)
            iter = v12;
        else
            iter = v12 + 1;
    } while (iter != a2);
    return iter;
}
