/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x974ed8..0x9752f4 (1052 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_974ed8_3 {
    char padding_0[8];
    unsigned long long field_8;
} st_974ed8_3;

typedef struct st_974ed8_5 {
    char padding_0[24];
    unsigned long long field_18;
} st_974ed8_5;

typedef struct st_974ed8_2 {
    char field_0;
    char padding_1[7];
    char field_8;
    char padding_9[7];
    unsigned long long field_10;
    long long field_18;
    char padding_20[8];
    unsigned long long field_28;
    char padding_30[192];
    struct st_974ed8_1 *field_f0;
    char padding_f8[16];
    struct st_974ed8_0 *field_108;
    char padding_110[16];
    unsigned long long field_120;
    char padding_128[104];
    unsigned long long field_190;
    unsigned long long field_198;
    char padding_1a0[16];
    unsigned long long field_1b0;
    char padding_1b8[18];
    int field_1ca;
} st_974ed8_2;

typedef struct st_974ed8_6 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned long long field_10;
    char padding_18[8];
    char field_20;
    char padding_21[7];
    struct st_974ed8_1 *field_28;
} st_974ed8_6;

typedef struct st_974ed8_4 {
    struct st_974ed8_3 *field_0;
    char padding_8[32];
    unsigned long long field_28;
    char field_30;
} st_974ed8_4;

typedef struct st_974ed8_1 {
    unsigned long long field_0;
} st_974ed8_1;

typedef struct st_974ed8_0 {
    char padding_0[80];
    struct st_974ed8_1 *field_50;
    char padding_58[16];
    struct st_974ed8_1 *field_68;
} st_974ed8_0;


int sub_974ed8(st_974ed8_2 *a0, st_974ed8_4 *a1, unsigned long long a2)
{
    st_974ed8_2 *v7;  // x24
    st_974ed8_3 *v8;  // x8
    unsigned long v17;  // cc_dep1
    unsigned long long v18;  // 4105
    unsigned long v19;  // x25
    unsigned long long v20;  // 4112
    unsigned long v21;  // 4112
    unsigned long v22;  // cc_dep1
    unsigned long long v23;  // 4105
    unsigned long long v24;  // 4112
    char idx;  // x0
    char v26;  // x26
    unsigned long long v9;  // x9
    void* v27;  // x27
    char i;  // x28
    unsigned long v29;  // x9
    unsigned long long *iter;  // x10
    unsigned long v31;  // x11
    char idx1;  // x0
    char v33;  // x8
    char v34;  // x9
    unsigned long v35;  // x0
    char index;  // x22
    unsigned long idx2;  // x23
    char node;  // x8
    unsigned long long *v38;  // x9
    char v39;  // x0
    char v40;  // x0
    st_974ed8_6 *v41;  // x20
    unsigned long v42;  // x8
    unsigned long v43;  // x9
    unsigned long v44;  // x8
    unsigned long v45;  // x20
    unsigned long v46;  // x24
    st_974ed8_2 *v11;  // x10
    unsigned long long v47;  // 4110
    st_974ed8_5 *v48;  // x20
    unsigned long long v12;  // x11
    unsigned long long v13;  // x12
    unsigned long v14;  // cc_dep1
    unsigned long long v15;  // 4109
    unsigned long v16;  // 4112
    char v0;  // [bp-0x148]
    uint128_t v1;  // [bp-0x140], Other Possible Types: char, unsigned long
    unsigned long v2;  // [bp-0x138], Other Possible Types: char
    char v3;  // [bp-0xd0], Other Possible Types: unsigned long, unsigned long long
    unsigned long v4;  // [bp-0xc8]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v7 = &(&a0->field_0)[(unsigned int)a2 * 48];
    v8 = a1->field_0;
    v9 = v8->field_8;
    if (v9 > v7->field_28)
        return 0;
    idx2 = (int)a2;
    v11 = &(&a0->field_0)[8 * idx2];
    v12 = v11->field_120;
    if (v9 < v12)
        v13 = v12;
    else
        v13 = v9;
    v14 = v12;
    v15 = arm64g_calculate_condition(2, v12, 1, 0);
    if (v15 & 1)
        v13 = v9;
    v11->field_120 = v13;
    if ((unsigned int)a2 == 1)
    {
        v16 = arm64g_calculate_condition(2, v14, 1, 0);
        v17 = (v16 & 1 ? (a0->padding_1b8)[1] : 0);
        v18 = arm64g_calculate_condition(3, v17, 0, 0);
        v19 = !(v18 & 1);
        v20 = arm64g_calculate_condition(19, v17, 0, 0);
        if (!(v20 & 1))
            goto LABEL_974f5c;
    }
    else
    {
        v21 = arm64g_calculate_condition(2, v14, 1, 0);
        v22 = (v21 & 1 ? (a0->padding_1b8)[1] : 0);
        v23 = arm64g_calculate_condition(0, v22, 0, 0);
        v19 = !(v23 & 1);
        v24 = arm64g_calculate_condition(16, v22, 0, 0);
        if (!(v24 & 1))
        {
LABEL_974f5c:
            (a0->padding_1b8)[1] = 1;
        }
    }
    v0 = 0;
    v3 = v8->field_8;
    idx = sub_a66b6c(v7->field_18, &v3);
    if (idx || (idx = *(long long *)&v7->field_8, idx))
    {
        v26 = 0;
        v27 = &v0;
        do
        {
            if ((unsigned long long)*(long long *)&a1->padding_8[0] <= v26)
                break;
            i = *(long long *)(idx + 80);
            v29 = *(long long *)idx;
            iter = &a1->field_0[v26].field_8;
            while (1)
            {
                if ((unsigned long long)*(long long *)((char *)iter - 8) > v29)
                {
                    v31 = *iter;
                    goto LABEL_974fd4;
                }
                v31 = *iter;
                if (v29 <= v31)
                    break;
LABEL_974fd4:
                if (v31 < v29)
                    goto LABEL_97506c;
                v26 += 1;
                iter += 2;
                if (*(long long *)&a1->padding_8[0] == v26)
                    goto LABEL_975074;
            }
            v1 = v29;
            v3 = v29;
            idx1 = sub_a66b6c(v7->field_18, &v3);
            if (idx1)
            {
                if (*(long long *)&v7->field_0 == idx1)
                    *(long long *)&v7->field_0 = *(long long *)(idx1 + 72);
                v33 = *(long long *)(idx1 + 80);
                if (*(long long *)&v7->field_8 == idx1)
                    *(unsigned long long *)&v7->field_8 = v33;
                v34 = *(long long *)(idx1 + 72);
                v35 = idx1 + 72;
                if (v33)
                    *(unsigned long long *)(v33 + 72) = v34;
                if (v34)
                    *(unsigned long long *)(v34 + 80) = v33;
                v7->field_10 = v7->field_10 - 1;
                *(unsigned long long *)v35 = 0;
                *(unsigned long long *)(v35 + 8) = 0;
                sub_a66994(v7->field_18, &v1);
            }
            *(unsigned long long *)v27 = idx;
            *(unsigned long long *)(idx + 88) = 0;
            v27 = idx + 88;
LABEL_97506c:
            idx = i;
        } while (i);
    }
LABEL_975074:
    index = v0;
    if (index)
    {
        if (*(long long *)index == a1->field_0->field_8)
        {
            node = index;
            do
            {
                if ((char)(*(char *)(node + 32)) >> 3 & 1)
                    a0->field_f0();
            } while ((node = *(long long *)(node + 88), node));
        }
        if (a1->field_30 & 1)
        {
            v38 = &a0->field_1b0;
            if (a1->field_28 > v38[idx2])
            {
                v38[idx2] = a1->field_28;
                v3 = a1->field_0->field_8;
                v39 = sub_a66b6c(*(long long *)&(&a0->field_0)[(unsigned int)idx2 * 48 + 24], &v3);
                if (v39)
                {
                    v3 = *(long long *)(v39 + 16);
                    a0->field_108->field_68();
                }
            }
        }
        v40 = sub_9752f4(a0, a2);
        if (v40)
        {
            v41 = (st_974ed8_6 *)v40;
            v1 = 0;
            v2 = 0;
            if (!(v41->field_20 >> 2 & 1))
                v41->field_28();
            v42 = v41->field_8;
            a0->field_190 = a0->field_190 - v42;
            v43 = v41->field_20;
            if (v43 >> 3 & 1)
                (&a0->field_198)[v43 & 3] = (&a0->field_198)[v43 & 3] - v42;
            v1 = v41->field_10;
            v2 = v42;
            a0->field_108->field_50();
        }
        else
        {
            v1 = 0;
            v2 = 0;
            if ((char)(*(char *)(index + 32)) >> 2 & 1)
            {
                v44 = *(long long *)(index + 8);
                a0->field_190 = a0->field_190 - v44;
                v45 = *(char *)(index + 32);
                if (v45 >> 3 & 1)
                {
                    (&a0->field_198)[v45 & 3] = (&a0->field_198)[v45 & 3] - v44;
                    v45 = *(char *)(index + 32);
                }
                v46 = *(long long *)(index + 24);
                v47 = arm64g_calculate_condition(2, v46, 1, 0);
                if (!(v47 & 1))
                {
                    v48 = &a0->padding_30[96 + 32 * ((unsigned int)v45 & 3)];
                    if (v46 >= v48->field_18)
                    {
                        v3 = 0;
                        v4 = v46;
                        if (sub_c64058(v48, &v3) == 1)
                            v48->field_18 = v46 + 1;
                    }
                }
            }
            v1 = __dirty_unsupported_Iop_SliceV128(*(int128_t *)(index + 8), *(int128_t *)(index + 8), 8);
            (*(long long *)(index + 48))();
        }
    }
    else
    {
        if (v19 & 1)
            return 1;
        sub_974dcc(a0);
        return 1;
    }
}
