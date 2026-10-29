/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7d6c4..0x7d960 (668 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7d6c4_2 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[24];
    unsigned int field_28;
    unsigned int field_2c;
    char padding_30[88];
    unsigned int field_88;
} st_7d6c4_2;

typedef struct st_7d6c4_1 {
    char padding_0[8];
    unsigned int field_8;
    unsigned int field_c;
    char padding_10[12];
    unsigned int field_1c;
    char padding_20[64];
    char field_60;
    char padding_61[67];
    unsigned int field_a4;
} st_7d6c4_1;

typedef struct st_7d6c4_0 {
    char field_0;
} st_7d6c4_0;

extern unsigned long long g_e6b8f0;

unsigned long long sub_7d6c4(st_7d6c4_2 *a0, unsigned int a1, long long a2, st_7d6c4_1 *a3, unsigned long long a4, long long a5, unsigned int a6, unsigned int a7)
{
    long long v5;  // x20
    unsigned long v6;  // cc_op
    unsigned long v11;  // cc_dep1
    unsigned long v12;  // cc_dep2
    unsigned long v13;  // cc_ndep
    unsigned long v14;  // 4112
    unsigned long long v15;  // 4153
    unsigned int v16;  // w24
    unsigned int v17;  // w8
    long long v18;  // x8
    unsigned long long v19;  // x9
    unsigned long long v20;  // 4111
    unsigned long v21;  // cc_dep1
    unsigned long v22;  // cc_dep2
    long long v23;  // x27
    unsigned long long v24;  // 4105
    unsigned long long v25;  // 4105
    unsigned long long v26;  // x0
    unsigned int v27;  // w8
    unsigned int v28;  // w8
    char v29;  // x8
    long long v30;  // x8
    unsigned long v31;  // cc_dep1
    unsigned long v32;  // cc_dep2
    long long v33;  // x8
    unsigned long long v34;  // 4105
    unsigned long long v35;  // 4105
    unsigned int v36;  // w3
    unsigned int v37;  // w9
    unsigned int v38;  // w9
    unsigned int v39;  // w8
    unsigned long long v40;  // x9
    unsigned int v41;  // w10
    unsigned long v42;  // cc_dep1
    unsigned int v43;  // w8
    unsigned long long v44;  // 4112
    unsigned long long v45;  // 4106
    unsigned long long v46;  // 4112
    unsigned long v7;  // 4112
    unsigned long long v47;  // 4106
    unsigned long long v48;  // x8
    unsigned long v8;  // cc_op
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned int v0;  // [bp-0x7c]
    st_7d6c4_0 **v1;  // [bp-0x70], Other Possible Types: char
    st_7d6c4_0 *v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v0 = a6;
    v2 = &v1;
    v1 = &v2;
    v5 = a4 + a5;
    if (a1)
    {
        v7 = arm64g_calculate_condition(v6 | 16, v11, v12, v13);
        v8 = 3;
        v9 = (v7 & 1 ? *(int *)&a3->field_60 : 0);
        v10 = v7 & 1;
    }
    else
    {
        v14 = arm64g_calculate_condition(v6 | 16, v11, v12, v13);
        v8 = 0;
        v9 = (v14 & 1 ? *(int *)&a3->field_60 : 0);
        v10 = v14 & 1;
    }
    v15 = arm64g_calculate_condition(v8 | 16, v9, v10, 0);
    v16 = a7 == 1;
    v17 = sub_7cf2c() != 0;
    v18 = 0xdabffffe;
    if (v16 & v17)
        v18 = 0xfffffe;
    v19 = 0xffffffff25400002;
    v20 = arm64g_calculate_condition(25, v16 & v17, 0, 0);
    if (v20 & 1)
        v19 = 0xffffffffff000002;
    v21 = v18;
    v22 = a5;
    if ((unsigned long long)v18 < (unsigned long long)a5)
    {
        v23 = v18;
        v24 = arm64g_calculate_condition(52, v21, v22, 0);
        if (!(v24 & 1))
            goto LABEL_7d776;
LABEL_7d775:
        a4 = v5 + v19;
    }
    else
    {
        v23 = a5;
        v25 = arm64g_calculate_condition(52, v21, v22, 0);
        if (v25 & 1)
            goto LABEL_7d775;
LABEL_7d776:
    }
    v26 = sub_8144c();
    if (!(v15 & 1))
    {
        sub_8144c(a1, a4, v23, 0);
        v27 = 0;
        if (!*(int *)&a3->padding_20[16])
            v27 = v5 - *(int *)(a1 + 8);
        *(unsigned int *)(a1 + 48) = v27;
        v26 = sub_b53d4(a1, a4, v5, &a3->field_60);
    }
    v28 = a3->field_c + 3;
    if (a3->field_8 + 1 >= v28)
        v28 = a3->field_8 + 1;
    if (v28 < 31)
        v29 = v28;
    else
        v29 = 31;
    v30 = 1 << (v29 & 31);
    v31 = v23;
    v32 = v30;
    if ((unsigned long long)v23 <= (unsigned long long)v30)
    {
        v33 = v23;
        v34 = arm64g_calculate_condition(148, v31, v32, 0);
        if (!(v34 & 1))
            goto LABEL_7d806;
LABEL_7d805:
        v36 = a4;
    }
    else
    {
        v33 = v30;
        v35 = arm64g_calculate_condition(148, v31, v32, 0);
        if (v35 & 1)
            goto LABEL_7d805;
LABEL_7d806:
        v36 = v5 - v30;
    }
    v37 = a0->field_8;
    if (*(int *)&a3->padding_20[16])
        v38 = 0;
    else
        v38 = v5 - v37;
    a0->field_28 = v38;
    a0->field_2c = v36 - v37;
    a0->field_88 = a3->field_a4;
    if ((unsigned long long)v33 < 9)
        return v26;
    sub_81e80(a0, a2, a3);
    v39 = a3->field_1c;
    v40 = 32;
    if (v39 == 1)
        v40 = 24;
    if (v39 == 2)
        v40 = 80;
    v41 = v39 - 3;
    v42 = v41;
    if (v41 < 3)
        v40 = 48;
    v43 = v39 & 0xfffffffe;
    if (v43 != 6)
    {
        v44 = arm64g_calculate_condition(19, v42, 3, 0);
        v45 = arm64g_calculate_condition(3, (v44 & 1 ? v43 : 0x40000000), (v44 & 1 ? 8 : 0), 0);
        if (!(v45 & 1))
            goto LABEL_7d88a;
        v48 = 16;
LABEL_7d889:
    }
    else
    {
        v46 = arm64g_calculate_condition(19, v42, 3, 0);
        v47 = arm64g_calculate_condition(0, (v46 & 1 ? v43 : 0x40000000), (v46 & 1 ? 8 : 0), 0);
        if (v47 & 1)
            goto LABEL_7d889;
LABEL_7d88a:
        v48 = v40;
    }
    goto *((void *)(*(long long *)((char *)&g_e6b8f0 + v48)));
}
