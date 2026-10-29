/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ef3a4..0x1ef4ec (328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ef3a4_2 {
    char padding_0[120];
    struct st_1ef3a4_0 *field_78;
    unsigned long long field_80;
} st_1ef3a4_2;

typedef struct st_1ef3a4_1 {
    char padding_0[32];
    unsigned long long field_20;
    struct st_1ef3a4_0 *field_28;
    char padding_30[72];
    unsigned long long field_78;
    char padding_80[24];
    struct st_1ef3a4_0 *field_98;
    struct st_1ef3a4_0 *field_a0;
    struct st_1ef3a4_0 *field_a8;
    unsigned long long field_b0;
} st_1ef3a4_1;

typedef struct st_1ef3a4_0 {
    char field_0;
} st_1ef3a4_0;

extern char g_e76f60;
extern unsigned long long g_e76fb0;
extern unsigned long long g_e76fd0;

void sub_1ef3a4(st_1ef3a4_2 *a0, st_1ef3a4_1 *a1)
{
    unsigned long long v17;  // x28
    unsigned long long v18;  // x27
    unsigned long long v27;  // x30
    char *v28;  // x8
    char *v29;  // x9
    unsigned long v30;  // cc_op
    unsigned long v31;  // cc_dep1
    unsigned long v32;  // cc_dep2
    unsigned long v33;  // cc_ndep
    unsigned long v34;  // x9
    unsigned long long v35;  // w22
    unsigned long long v36;  // x9
    unsigned long long v19;  // x26
    unsigned long long *v38;  // x8
    unsigned long long v39;  // 4112
    unsigned long long v40;  // 4105
    unsigned long long v41;  // 4112
    unsigned long long v42;  // 4105
    unsigned long long v43;  // x8
    unsigned long long *v44;  // x8
    unsigned long long v20;  // x25
    unsigned long long v21;  // x24
    unsigned long long v22;  // x23
    unsigned long long v23;  // x22
    unsigned long long v24;  // x21
    unsigned long long v25;  // x20
    unsigned long long v26;  // x19
    st_1ef3a4_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_1ef3a4_0 *v1;  // [bp-0x78]
    st_1ef3a4_0 *v2;  // [bp-0x70]
    st_1ef3a4_0 **v3;  // [bp-0x68], Other Possible Types: char
    unsigned long long v4;  // [bp-0x60]
    unsigned long long v5;  // [bp-0x58]
    unsigned long long v6;  // [bp-0x50]
    unsigned long long v7;  // [bp-0x48]
    unsigned long long v8;  // [bp-0x40]
    unsigned long long v9;  // [bp-0x38]
    unsigned long long v10;  // [bp-0x30]
    unsigned long long v11;  // [bp-0x28]
    unsigned long long v12;  // [bp-0x20]
    unsigned long long v13;  // [bp-0x18]
    char *v14;  // [bp-0x10]
    unsigned long long v15;  // [bp-0x8]
    char v16;  // [bp+0x0]

    v4 = v17;
    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = v25;
    v13 = v26;
    v14 = &v16;
    v15 = v27;
    v1 = &v0;
    v0 = &v1;
    v28 = a1->field_a0;
    v29 = a1->field_a8;
    a1->field_28 = v28;
    v30 = 4;
    v31 = v28;
    v32 = v29;
    v33 = 0;
    if (v28 != v29)
    {
        v2 = &v3;
        v3 = &v2;
        v34 = *(char *)&a0->field_78[*v28];
        a1->field_a0 = v28 + 1;
        if (!(v34 & 1))
        {
            v35 = 3;
        }
        else
        {
            v35 = 0;
LABEL_1ef43c:
            v36 = a0->field_80;
            a1->field_20 = a1->field_b0;
            a1->field_98 = v28;
            a1->field_78 = v36;
            if (sub_1eda40(a0, a1))
            {
                v38 = &g_e76fd0;
                goto *((void *)(*v38));
            }
        }
        if (v35)
        {
            v39 = arm64g_calculate_condition(v30 | 16, v31, v32, v33);
            v40 = arm64g_calculate_condition(3, (v39 & 1 ? v35 : 0x40000000), (v39 & 1 ? 3 : 0), 0);
            if (!(v40 & 1))
                goto LABEL_1ef48a;
LABEL_1ef489:
            v43 = 24;
        }
        else
        {
            v41 = arm64g_calculate_condition(v30 | 16, v31, v32, v33);
            v42 = arm64g_calculate_condition(0, (v41 & 1 ? v35 : 0x40000000), (v41 & 1 ? 3 : 0), 0);
            if (v42 & 1)
                goto LABEL_1ef489;
LABEL_1ef48a:
            v43 = 104;
        }
        v44 = &(&g_e76f60)[v43];
        if (v35 == 2)
            v44 = &g_e76fb0;
        goto *((void *)(*v44));
    }
    else
    {
        v35 = 2;
        goto LABEL_1ef43c;
    }
}
