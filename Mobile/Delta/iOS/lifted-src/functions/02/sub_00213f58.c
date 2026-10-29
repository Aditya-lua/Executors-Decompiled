/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x213f58..0x2141b8 (608 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_213f58_4 {
    struct st_213f58_0 *field_0;
    unsigned long long field_8;
    struct st_213f58_5 *field_10;
    struct st_213f58_5 *field_18;
    struct st_213f58_5 *field_20;
    struct st_213f58_6 *field_28;
    struct st_213f58_6 *field_30;
    struct st_213f58_6 *field_38;
    struct st_213f58_6 *field_40;
    struct st_213f58_6 *field_48;
    struct st_213f58_6 *field_50;
    struct st_213f58_7 *field_58;
    struct st_213f58_0 *field_60;
    struct st_213f58_5 *field_68;
    struct st_213f58_6 *field_70;
    struct st_213f58_6 *field_78;
    struct st_213f58_6 *field_80;
} st_213f58_4;

typedef struct st_213f58_2 {
    struct st_213f58_1 *field_0;
    char padding_8[4];
    unsigned int field_c;
} st_213f58_2;

typedef struct st_213f58_1 {
    char field_0;
    char padding_1[2];
    char field_3;
    char padding_4[20];
    unsigned long long field_18;
} st_213f58_1;

typedef struct st_213f58_5 {
    unsigned int field_0;
} st_213f58_5;

typedef struct st_213f58_6 {
    long long field_0;
} st_213f58_6;

typedef struct st_213f58_7 {
    struct st_213f58_3 *field_0;
} st_213f58_7;

typedef struct st_213f58_3 {
    char padding_0[88];
    struct st_213f58_2 *field_58;
} st_213f58_3;

typedef struct st_213f58_0 {
    char field_0;
} st_213f58_0;

typedef struct st_213f58_8 {
    char padding_0[192];
    struct st_213f58_6 *field_c0;
} st_213f58_8;

extern st_213f58_8 *g_f0d3d8;

unsigned long long sub_213f58(st_213f58_4 *a0, st_213f58_1 *a1)
{
    unsigned int v6;  // w21
    char v7;  // w8
    unsigned long long v12;  // 4102
    unsigned long v13;  // cc_op
    unsigned long v14;  // cc_dep1
    unsigned long v15;  // cc_dep2
    unsigned long v16;  // cc_ndep
    unsigned long v17;  // 4112
    unsigned long long v18;  // 4102
    unsigned long long v19;  // 4112
    unsigned long long v20;  // 4102
    unsigned long long v21;  // 4112
    unsigned long long v22;  // 4102
    unsigned long long v23;  // x0
    unsigned long long v24;  // x0
    unsigned long long v25;  // x0
    st_213f58_3 *v26;  // x8
    unsigned long long v27;  // x0
    unsigned long long v28;  // x0
    unsigned long long v29;  // x0
    unsigned long long v30;  // x0
    unsigned long long v31;  // x0
    unsigned long long v32;  // x0
    unsigned long long v33;  // x0
    unsigned long long v34;  // x0
    unsigned long long v35;  // x0
    st_213f58_3 *v36;  // x8
    unsigned long v8;  // 4112
    unsigned long v9;  // cc_op
    unsigned long v10;  // cc_dep1
    unsigned long v11;  // cc_dep2
    st_213f58_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_213f58_0 *v1;  // [bp-0x48]
    st_213f58_0 **v2;  // [bp-0x40], Other Possible Types: char
    st_213f58_0 *v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v6 = a1->field_0;
    v7 = *(char *)a0->field_0;
    if (!v7)
    {
        v8 = arm64g_calculate_condition(v13, v14, v15, v16);
        v9 = 3;
        v10 = (v8 & 1 ? v6 & 0xff : 0);
        v11 = (v8 & 1 ? 8 : 0);
        v12 = arm64g_calculate_condition(3, v10, v11, 0);
        if (v12 & 1)
            goto LABEL_214034;
LABEL_213f9c:
        if (v7 == 1)
        {
            v19 = arm64g_calculate_condition(v9, v10, v11, 0);
            v20 = arm64g_calculate_condition(19, (v19 & 1 ? v6 & 0xff : 0), (v19 & 1 ? 7 : 0), 0);
            if (!(v20 & 1))
                goto LABEL_213fa8;
        }
        else
        {
            v21 = arm64g_calculate_condition(v9, v10, v11, 0);
            v22 = arm64g_calculate_condition(16, (v21 & 1 ? v6 & 0xff : 0), (v21 & 1 ? 7 : 0), 0);
            if (!(v22 & 1))
            {
LABEL_213fa8:
                v23 = sub_213ca0(*(long long *)a0->field_70, a1);
                if (!(unsigned int)v23)
                    return v23;
                v24 = sub_2006a0(*(long long *)a0->field_78, a1);
                if (!(unsigned int)v24)
                    return v24;
                v25 = sub_1ffc48(*(long long *)a0->field_80, a1);
                if (!(unsigned int)v25)
                    return v25;
                *(st_213f58_1 **)*(long long *)(*(long long *)a0->field_58 + 88) = a1;
                v26 = *(long long *)a0->field_58;
                v26->field_58->field_c = v6;
                v26->field_58 = v26->field_58 + 1;
                if (*(char *)a0->field_60 & 1)
                    return 1;
                goto LABEL_214184;
            }
        }
    }
    else
    {
        v17 = arm64g_calculate_condition(v13, v14, v15, v16);
        v9 = 0;
        v10 = (v17 & 1 ? v6 & 0xff : 0);
        v11 = (v17 & 1 ? 8 : 0);
        v18 = arm64g_calculate_condition(0, v10, v11, 0);
        if (!(v18 & 1))
            goto LABEL_213f9c;
LABEL_214034:
        if (!(a1->field_3 & 1) && (*(char *)a0->field_8 != 1 || (v3 = &v2, v2 = &v3, *(char *)(a1->field_18 + 2) >= 0)))
        {
            v27 = sub_2009ec(*(int *)a0->field_10, a1);
            if (!(unsigned int)v27)
                return v27;
            v28 = sub_213c60(*(int *)a0->field_18, a1);
            if (!(unsigned int)v28)
                return v28;
            v29 = sub_20faf8(*(int *)a0->field_20, a1);
            if (!(unsigned int)v29)
                return v29;
            v30 = sub_1ff558(*(long long *)a0->field_28, a1);
            if (!(unsigned int)v30)
                return v30;
            v31 = sub_200988(*(long long *)a0->field_30, a1);
            if (!(unsigned int)v31)
                return v31;
            v32 = sub_211e1c(*(long long *)a0->field_38, a1);
            if (!(unsigned int)v32)
                return v32;
            v33 = sub_1feb30(*(long long *)a0->field_40, a1);
            if (!(unsigned int)v33)
                return v33;
            v34 = sub_200834(*(long long *)a0->field_48, a1);
            if (!(unsigned int)v34)
                return v34;
            v35 = sub_1ff5a0(*(long long *)a0->field_50, a1);
            if (!(unsigned int)v35)
                return v35;
            *(st_213f58_1 **)*(long long *)(*(long long *)a0->field_58 + 88) = a1;
            v36 = *(long long *)a0->field_58;
            v36->field_58->field_c = v6;
            v36->field_58 = v36->field_58 + 1;
            if (*(char *)a0->field_60 & 1)
                return 1;
LABEL_214184:
            *(int *)a0->field_68 = *(int *)a0->field_68 + 1;
            g_f0d3d8->field_c0();
        }
    }
    return 0;
}
