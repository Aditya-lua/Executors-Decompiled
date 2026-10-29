/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc384..0xc52c (424 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c384_1 {
    struct st_c384_0 *field_0;
    unsigned long long field_8;
    unsigned int field_10;
    unsigned int field_14;
    unsigned int field_18;
} st_c384_1;

typedef struct st_c384_3 {
    unsigned int field_0;
    unsigned long long field_4;
    unsigned long long field_c;
    unsigned int field_14;
    unsigned long long field_18;
} st_c384_3;

typedef struct st_c384_2 {
    struct st_c384_0 *field_0;
} st_c384_2;

typedef struct st_c384_0 {
    char field_0;
} st_c384_0;

extern unsigned long long g_e61b58;

st_c384_1 * sub_c384(st_c384_1 *a0)
{
    unsigned long v7;  // x19
    unsigned long v8;  // x13
    unsigned int v17;  // w12
    unsigned long v18;  // cc_dep1
    unsigned long v19;  // cc_dep2
    unsigned int v20;  // w11
    unsigned long v21;  // 4112
    unsigned long v22;  // cc_op
    unsigned long v23;  // cc_dep1
    unsigned long v24;  // cc_dep2
    unsigned long long v25;  // 4112
    unsigned long v26;  // 4112
    unsigned long v9;  // x22
    unsigned long long v27;  // 4112
    unsigned long long v28;  // 4112
    unsigned long long v29;  // 4105
    unsigned long long v30;  // 4112
    unsigned long long v31;  // 4105
    unsigned long long v32;  // x12
    unsigned long long v33;  // x11
    unsigned long v35;  // cc_op
    unsigned long v36;  // cc_dep1
    unsigned long v10;  // x9
    unsigned long v37;  // cc_dep2
    unsigned long v39;  // 4112
    unsigned long long v40;  // 4112
    unsigned long long v41;  // 4112
    unsigned long long v42;  // 4105
    unsigned long long v43;  // 4112
    unsigned long long v44;  // 4105
    unsigned long long v45;  // x12
    unsigned long long v46;  // x11
    unsigned int v11;  // w27
    unsigned long v47;  // x9
    unsigned long v48;  // x10
    unsigned long long v49;  // x9
    st_c384_3 *v50;  // x8
    unsigned int v12;  // w10
    unsigned long v13;  // x10
    unsigned long v14;  // cc_dep1
    unsigned long v15;  // cc_dep2
    char *v16;  // x11
    unsigned int v0;  // [bp-0x84]
    st_c384_0 **v1;  // [bp-0x80], Other Possible Types: char
    st_c384_0 *v2;  // [bp-0x78]
    st_c384_0 *v3;  // [bp-0x70], Other Possible Types: st_c384_2 **
    st_c384_0 **v4;  // [bp-0x68], Other Possible Types: st_c384_2 **, char
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v2 = &v1;
    v1 = &v2;
    v7 = a0->field_10;
    v8 = a0->field_14;
    v9 = a0->field_18;
    v3 = &v4;
    v4 = &v3;
    v10 = a0->field_8;
    if (v10 > v7)
        v11 = *(char *)&a0->field_0[v7];
    else
        v11 = 0;
    v12 = (unsigned int)v7 + 1;
    a0->field_10 = v12;
    v0 = v12;
    v3 = &v4;
    v4 = &v3;
    v13 = v0;
    v14 = v10;
    v15 = v13;
    if (v10 > v13)
    {
        v16 = a0->field_0;
        v17 = v16[v13];
        v18 = v17 & 0xff;
        v19 = v11;
        if (v17 != v11)
        {
            v3 = &v4;
            v4 = &v3;
            v20 = v16[v13];
            if (v16[v13])
            {
                v21 = arm64g_calculate_condition(19, v18, v19, 0);
                v22 = 3;
                v23 = (v21 & 1 ? v20 : 0x40000000);
                v24 = (v21 & 1 ? 13 : 0);
                v25 = arm64g_calculate_condition(19, v23, v24, 0);
                if (!(v25 & 1))
                    goto LABEL_c452;
LABEL_c451:
                v28 = arm64g_calculate_condition(v22 | 16, v23, v24, 0);
                v29 = arm64g_calculate_condition(3, (v28 & 1 ? v20 : 0x40000000), (v28 & 1 ? 10 : 0), 0);
                if (!(v29 & 1))
                    goto LABEL_c456;
LABEL_c455:
                v32 = 32;
            }
            else
            {
                v26 = arm64g_calculate_condition(19, v18, v19, 0);
                v22 = 0;
                v23 = (v26 & 1 ? v20 : 0x40000000);
                v24 = (v26 & 1 ? 13 : 0);
                v27 = arm64g_calculate_condition(16, v23, v24, 0);
                if (v27 & 1)
                    goto LABEL_c451;
LABEL_c452:
                v30 = arm64g_calculate_condition(v22 | 16, v23, v24, 0);
                v31 = arm64g_calculate_condition(0, (v30 & 1 ? v20 : 0x40000000), (v30 & 1 ? 10 : 0), 0);
                if (v31 & 1)
                    goto LABEL_c455;
LABEL_c456:
                v32 = 16;
            }
            if (v20 == 92)
                v33 = 24;
            else
                v33 = v32;
            goto *((void *)(*(long long *)((char *)&g_e61b58 + v33)));
        }
    }
    else if (v11)
    {
        v39 = arm64g_calculate_condition(20, v14, v15, 0);
        v35 = 0;
        v36 = (v39 & 1 ? 0 : 0x40000000);
        v37 = (v39 & 1 ? 13 : 0);
        v40 = arm64g_calculate_condition(16, v36, v37, 0);
        if (v40 & 1)
        {
            v41 = arm64g_calculate_condition(v35 | 16, v36, v37, 0);
            v42 = arm64g_calculate_condition(3, (v41 & 1 ? 0 : 0x40000000), (v41 & 1 ? 10 : 0), 0);
            if (!(v42 & 1))
                goto LABEL_c47a;
LABEL_c479:
            v45 = 32;
        }
        else
        {
            v43 = arm64g_calculate_condition(v35 | 16, v36, v37, 0);
            v44 = arm64g_calculate_condition(0, (v43 & 1 ? 0 : 0x40000000), (v43 & 1 ? 10 : 0), 0);
            if (v44 & 1)
                goto LABEL_c479;
LABEL_c47a:
            v45 = 16;
        }
        v46 = v45;
        goto *((void *)(*(long long *)((char *)&g_e61b58 + v46)));
    }
    else
    {
        v16 = a0->field_0;
    }
    v47 = (unsigned int)v13 + 1;
    a0->field_10 = v47;
    v48 = a0->field_14;
    v49 = v47 - a0->field_18;
    v50->field_0 = 279;
    *(unsigned long long *)&(&v50->field_0)[1] = v8 | (v7 - v9) * 0x100000000;
    *(unsigned long long *)((char *)&v50->field_4 + 4) = v48 | v49 * 0x100000000;
    *(unsigned int *)((char *)&v50->field_c + 4) = ~(unsigned int)v7 + v0;
    *(char **)&v50->field_14 = &v16[v0];
    return a0;
}
