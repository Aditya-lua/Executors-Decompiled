/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5cc..0xc84c (640 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c5cc_1 {
    struct st_c5cc_0 *field_0;
    unsigned long long field_8;
    unsigned int field_10;
    unsigned int field_14;
    unsigned int field_18;
} st_c5cc_1;

typedef struct st_c5cc_3 {
    unsigned int field_0;
    unsigned long long field_4;
    unsigned long long field_c;
    unsigned int field_14;
    unsigned long long field_18;
} st_c5cc_3;

typedef struct st_c5cc_2 {
    struct st_c5cc_0 *field_0;
} st_c5cc_2;

typedef struct st_c5cc_0 {
    char field_0;
} st_c5cc_0;

extern unsigned long long g_e61b98;

st_c5cc_1 * sub_c5cc(st_c5cc_1 *a0, unsigned long a1, unsigned int a2, unsigned int a3)
{
    unsigned long v7;  // x24
    unsigned long long v8;  // x8
    unsigned long v17;  // cc_dep2
    unsigned long long v18;  // 4112
    unsigned long v19;  // 4112
    unsigned long long v20;  // 4112
    unsigned long long v21;  // 4112
    unsigned long long v22;  // 4105
    unsigned long long v23;  // 4112
    unsigned long long v24;  // 4105
    unsigned long long v25;  // x11
    unsigned long v26;  // x9
    unsigned long v9;  // cc_dep2
    unsigned long v27;  // x11
    unsigned long long v28;  // x9
    st_c5cc_3 *v29;  // x8
    unsigned long v31;  // cc_op
    unsigned long v32;  // cc_dep1
    unsigned long v33;  // cc_dep2
    unsigned long v35;  // 4112
    unsigned long long v36;  // 4112
    char *v10;  // x10
    unsigned long long v37;  // 4112
    unsigned long long v38;  // 4105
    unsigned long long v39;  // 4112
    unsigned long long v40;  // 4105
    unsigned long long v41;  // x11
    unsigned long long v11;  // w11
    unsigned long v12;  // cc_dep1
    unsigned int v13;  // w10
    unsigned long v14;  // 4112
    unsigned long v15;  // cc_op
    unsigned long v16;  // cc_dep1
    unsigned int v0;  // [bp-0x90]
    st_c5cc_0 **v1;  // [bp-0x80], Other Possible Types: char
    st_c5cc_0 *v2;  // [bp-0x78]
    st_c5cc_0 *v3;  // [bp-0x70], Other Possible Types: st_c5cc_2 **
    st_c5cc_0 **v4;  // [bp-0x68], Other Possible Types: st_c5cc_2 **, char
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v0 = a2;
    v2 = &v1;
    v1 = &v2;
    v7 = a0->field_10;
    v3 = &v4;
    v4 = &v3;
    v8 = v7 & 0xffffffff;
    v9 = v8;
    if (a0->field_8 > v8)
    {
        v10 = a0->field_0;
        v11 = v10[v8];
        v12 = v11 & 0xff;
        if (v11 == 96)
        {
            v26 = (unsigned int)v8 + 1;
            a0->field_10 = v26;
            v27 = a0->field_14;
            v28 = v26 - a0->field_18;
            v29->field_0 = a3;
            *(unsigned long *)&(&v29->field_0)[1] = a1;
            *(unsigned long long *)((char *)&v29->field_4 + 4) = v27 | v28 * 0x100000000;
            *(unsigned int *)((char *)&v29->field_c + 4) = v8 - v7;
            *(char **)&v29->field_14 = &v10[v7];
            return a0;
        }
        v3 = &v4;
        v4 = &v3;
        v13 = v10[v8];
        if (v10[v8])
        {
            v14 = arm64g_calculate_condition(19, v12, 96, 0);
            v15 = 3;
            v16 = (v14 & 1 ? v13 : 0x40000000);
            v17 = (v14 & 1 ? 13 : 0);
            v18 = arm64g_calculate_condition(19, v16, v17, 0);
            if (!(v18 & 1))
                goto LABEL_c672;
LABEL_c671:
            v21 = arm64g_calculate_condition(v15 | 16, v16, v17, 0);
            v22 = arm64g_calculate_condition(3, (v21 & 1 ? v13 : 0x40000000), (v21 & 1 ? 10 : 0), 0);
            if (!(v22 & 1))
                goto LABEL_c676;
LABEL_c675:
            v25 = 40;
        }
        else
        {
            v19 = arm64g_calculate_condition(19, v12, 96, 0);
            v15 = 0;
            v16 = (v19 & 1 ? v13 : 0x40000000);
            v17 = (v19 & 1 ? 13 : 0);
            v20 = arm64g_calculate_condition(16, v16, v17, 0);
            if (v20 & 1)
                goto LABEL_c671;
LABEL_c672:
            v23 = arm64g_calculate_condition(v15 | 16, v16, v17, 0);
            v24 = arm64g_calculate_condition(0, (v23 & 1 ? v13 : 0x40000000), (v23 & 1 ? 10 : 0), 0);
            if (v24 & 1)
                goto LABEL_c675;
LABEL_c676:
            v25 = 16;
        }
        if (v13 == 92)
            v25 = 96;
        if (v13 == 123)
            v25 = 56;
        goto *((void *)(*(long long *)((char *)&g_e61b98 + v25)));
    }
    else
    {
        v35 = arm64g_calculate_condition(20, a0->field_8, v9, 0);
        v31 = 0;
        v32 = (v35 & 1 ? 0 : 0x40000000);
        v33 = (v35 & 1 ? 13 : 0);
        v36 = arm64g_calculate_condition(16, v32, v33, 0);
        if (v36 & 1)
        {
            v37 = arm64g_calculate_condition(v31 | 16, v32, v33, 0);
            v38 = arm64g_calculate_condition(3, (v37 & 1 ? 0 : 0x40000000), (v37 & 1 ? 10 : 0), 0);
            if (!(v38 & 1))
                goto LABEL_c69e;
LABEL_c69d:
            v41 = 40;
        }
        else
        {
            v39 = arm64g_calculate_condition(v31 | 16, v32, v33, 0);
            v40 = arm64g_calculate_condition(0, (v39 & 1 ? 0 : 0x40000000), (v39 & 1 ? 10 : 0), 0);
            if (v40 & 1)
                goto LABEL_c69d;
LABEL_c69e:
            v41 = 16;
        }
        goto *((void *)(*(long long *)((char *)&g_e61b98 + v41)));
    }
}
