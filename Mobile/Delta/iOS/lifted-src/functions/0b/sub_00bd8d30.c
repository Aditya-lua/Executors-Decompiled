/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbd8d30..0xbd8e7c (332 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bd8d30_3 {
    char padding_0[24];
    char field_18;
} st_bd8d30_3;

typedef struct st_bd8d30_1 {
    char padding_0[24];
    unsigned int field_18;
} st_bd8d30_1;

typedef struct st_bd8d30_0 {
    unsigned long long field_0;
    char padding_8[16];
    double field_18;
} st_bd8d30_0;

typedef struct st_bd8d30_2 {
    struct st_bd8d30_1 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    struct st_bd8d30_1 *field_18;
    unsigned long long field_20;
    unsigned long long field_28;
} st_bd8d30_2;

extern long long g_efa448;
extern long long g_efa460;

unsigned long long sub_bd8d30(st_bd8d30_2 *a0, unsigned long long *a1, unsigned int a2)
{
    unsigned long v10;  // x10
    st_bd8d30_0 *v11;  // x10
    unsigned long v20;  // x16
    unsigned long long v21;  // 4113
    unsigned long long v22;  // 4113
    unsigned long v23;  // x9
    unsigned long long v24;  // 4105
    unsigned long long v25;  // 4105
    st_bd8d30_1 *v26;  // x10
    unsigned long long v27;  // 4105
    unsigned long long v28;  // 4105
    unsigned long v29;  // x11
    double v12;  // d0
    unsigned long long v30;  // 4105
    unsigned long long v31;  // 4105
    unsigned long v32;  // x12
    unsigned long long v33;  // 4105
    unsigned long long v34;  // 4105
    long long v35;  // x2
    long long v36;  // x0
    unsigned long long v13;  // x0
    st_bd8d30_2 *v14;  // x20
    st_bd8d30_3 *v15;  // x13
    unsigned int v16;  // w8
    unsigned long v17;  // cc_dep1
    unsigned long v18;  // x8
    st_bd8d30_1 *v19;  // x15
    st_bd8d30_3 *v0;  // [bp-0x60], Other Possible Types: char
    st_bd8d30_2 *v1;  // [bp-0x58]
    unsigned int v2;  // [bp-0x50]
    st_bd8d30_3 *v3;  // [bp-0x48]
    unsigned long v4;  // [bp-0x40]
    unsigned long v5;  // [bp-0x38]
    double v6;  // [bp-0x30]
    unsigned int v7;  // [bp-0x28]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v10 = a2;
    if (a1[5] <= v10 || (v11 = a1[4] + v10 * 32, v11->field_0 == 0x8000000000000000))
        v12 = nan;
    else
        v12 = v11->field_18;
    v7 = a2;
    v4 = a1[7];
    v5 = a1[8];
    v6 = v12;
    v3 = 0;
    v13 = sub_b9b9f0(&v0, &v3);
    if (v2 == 2)
    {
        v14 = v1;
        v15 = v14->field_18;
        v16 = v15->field_18;
        v17 = v16 & 0xff;
        if (v16 == 1)
        {
            v18 = v14->field_10;
            v19 = v14->field_0;
            v20 = v14->field_8;
            v21 = arm64g_calculate_condition(3, v17, 1, 0);
            if (!(v21 & 1))
                goto LABEL_bd8dc2;
LABEL_bd8dc1:
            v23 = v20;
            v24 = arm64g_calculate_condition(3, v17, 1, 0);
            if (!(v24 & 1))
                goto LABEL_bd8dc6;
LABEL_bd8dc5:
            v26 = v19;
            v27 = arm64g_calculate_condition(3, v17, 1, 0);
            if (!(v27 & 1))
                goto LABEL_bd8dca;
LABEL_bd8dc9:
            v29 = v14->field_28;
            v30 = arm64g_calculate_condition(3, v17, 1, 0);
            if (!(v30 & 1))
                goto LABEL_bd8dce;
            goto LABEL_bd8dcd;
        }
        else
        {
            v18 = v14->field_28;
            v19 = v14->field_0;
            v20 = v14->field_8;
            v22 = arm64g_calculate_condition(3, v17, 1, 0);
            if (v22 & 1)
                goto LABEL_bd8dc1;
LABEL_bd8dc2:
            v23 = v14->field_20;
            v25 = arm64g_calculate_condition(3, v17, 1, 0);
            if (v25 & 1)
                goto LABEL_bd8dc5;
LABEL_bd8dc6:
            v26 = v15;
            v28 = arm64g_calculate_condition(3, v17, 1, 0);
            if (v28 & 1)
                goto LABEL_bd8dc9;
LABEL_bd8dca:
            v29 = v14->field_10;
            v31 = arm64g_calculate_condition(3, v17, 1, 0);
            if (v31 & 1)
            {
LABEL_bd8dcd:
                v32 = v14->field_20;
                v33 = arm64g_calculate_condition(3, v17, 1, 0);
                if (!(v33 & 1))
                    goto LABEL_bd8dd2;
                goto LABEL_bd8dd1;
            }
            else
            {
LABEL_bd8dce:
                v32 = v20;
                v34 = arm64g_calculate_condition(3, v17, 1, 0);
                if (v34 & 1)
                {
LABEL_bd8dd1:
                    v19 = v15;
                }
                else
                {
LABEL_bd8dd2:
                }
            }
        }
        if ((char)v19->field_18 == 1)
        {
            if ((char)v26->field_18 == 2)
            {
                a0->field_0 = v19;
                a0->field_8 = v32;
                a0->field_10 = v29;
                a0->field_18 = v26;
                a0->field_20 = v23;
                a0->field_28 = v18;
                if (v0)
                    return _free();
                return v13;
            }
            v35 = &g_efa448;
            v36 = "assertion failed: res.1.weight().branch_type == BranchType::Else";
        }
        else
        {
            v35 = &g_efa460;
            v36 = "assertion failed: res.0.weight().branch_type == BranchType::ThenPre-condition of set_entry violated: self.has_block(new_entry)Graph::add_edge: node indices out of boundsIndexSet: index out of bounds (exhausted)";
        }
        sub_c73c80(v36, 64, v35);
        __debugbreak();
    }
    else
    {
        a0->field_0 = 0;
        if (v0)
            return _free();
        return v13;
    }
}
