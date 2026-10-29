/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x29e38..0x29ef0 (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_29e38_1 {
    char padding_0[48];
    struct st_29e38_2 *field_30;
    char padding_38[88];
    unsigned int *field_90;
    unsigned int *field_98;
    char padding_a0[80];
    char field_f0;
} st_29e38_1;

typedef struct st_29e38_2 {
    int field_0;
} st_29e38_2;

typedef struct st_29e38_0 {
    char field_0;
} st_29e38_0;


st_29e38_1 * sub_29e38(st_29e38_1 *a0)
{
    unsigned int *iter;  // x8
    unsigned int *v3;  // x9
    unsigned long long v12;  // 4112
    unsigned long long v13;  // 4102
    unsigned long long v14;  // 4112
    unsigned long long v15;  // 4102
    unsigned int v16;  // w14
    int *v4;  // x10
    unsigned long idx;  // x11
    unsigned int v6;  // w13
    unsigned int v7;  // w12
    unsigned int v8;  // w14
    unsigned int v9;  // w15
    unsigned long v10;  // cc_dep1
    unsigned long long v11;  // x16
    st_29e38_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_29e38_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (a0->field_f0 & 1)
        return a0;
    iter = a0->field_90;
    v3 = a0->field_98;
    if (iter == v3)
        return a0;
    v4 = a0->field_30;
    do
    {
        idx = *iter;
        v6 = v4[idx];
        v7 = (unsigned int)idx + ((int)(v6) >> 16) + 1;
        v8 = v4[v7];
        v9 = v8 & 0xff;
        v10 = v9;
        if (v9 == 23)
        {
            do
            {
                v11 = (int)(v8) >> 16;
            } while (!(v11 >> 31 & 1) && (v7 = v7 + (unsigned int)v11 + 1, v8 = v4[v7], v9 = v8 & 0xff, v10 = v9, v9 == 23));
        }
        if ((char)v6 == 23)
        {
            v12 = arm64g_calculate_condition(3, v10, 23, 0);
            v13 = arm64g_calculate_condition(3, (v12 & 1 ? v9 : 0), (v12 & 1 ? 22 : 0), 0);
            if (v13 & 1)
                goto LABEL_29e68;
        }
        else
        {
            v14 = arm64g_calculate_condition(3, v10, 23, 0);
            v15 = arm64g_calculate_condition(0, (v14 & 1 ? v9 : 0), (v14 & 1 ? 22 : 0), 0);
            if (v15 & 1)
                goto LABEL_29e68;
        }
        v16 = v7 + ~(unsigned int)idx;
        if (v16 != (short)v16)
            continue;
        v8 = v6 & 0xffff | __ROL__(v16, 16) & 0xffff0000;
LABEL_29e68:
        v4[idx] = v8;
    } while ((iter[1] = v7, iter += 2, iter != v3));
    return a0;
}
