/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1fb7dc..0x1fbbfc (1056 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1fb7dc_1 {
    unsigned int field_0;
} st_1fb7dc_1;

typedef struct st_1fb7dc_2 {
    char padding_0[4];
    unsigned int field_4;
} st_1fb7dc_2;

typedef struct st_1fb7dc_0 {
    char field_0;
} st_1fb7dc_0;

extern unsigned long long g_e78760;

long long sub_1fb7dc(unsigned long a0, unsigned long long *a1, st_1fb7dc_2 *a2, st_1fb7dc_1 **a3)
{
    unsigned long long v15;  // x28
    unsigned long long v16;  // x27
    unsigned long long v25;  // x30
    unsigned long v68;  // cc_ndep
    unsigned long v69;  // 4112
    unsigned long v70;  // cc_op
    unsigned long v71;  // cc_dep1
    unsigned long v72;  // cc_dep2
    unsigned long long v73;  // 4125
    unsigned long long v74;  // x10
    unsigned long long v75;  // x9
    unsigned int v26;  // w9
    unsigned int v27;  // w10
    unsigned long v28;  // 4112
    unsigned long v29;  // cc_op
    unsigned long v30;  // cc_dep1
    unsigned long long v17;  // x26
    unsigned long v31;  // cc_dep2
    unsigned long long v32;  // 4113
    unsigned long v33;  // 4112
    unsigned long long v34;  // 4113
    unsigned long long v18;  // x25
    unsigned long v35;  // 4112
    unsigned long v36;  // cc_op
    unsigned long v37;  // cc_dep1
    unsigned long v38;  // cc_dep2
    unsigned long long v39;  // 4113
    unsigned long long v19;  // x24
    unsigned long v40;  // 4112
    unsigned long long v41;  // 4113
    unsigned long v42;  // 4112
    unsigned long v43;  // cc_op
    unsigned long v44;  // cc_dep1
    unsigned long long v20;  // x23
    unsigned long v45;  // cc_dep2
    unsigned long long v46;  // 4113
    unsigned long v47;  // 4112
    unsigned long long v48;  // 4113
    unsigned long long v21;  // x22
    unsigned long v49;  // 4112
    unsigned long v50;  // cc_op
    unsigned long v51;  // cc_dep1
    unsigned long v52;  // cc_dep2
    unsigned int v53;  // w10
    unsigned long long v54;  // 4118
    unsigned long long v22;  // x21
    unsigned long v55;  // 4112
    unsigned long long v56;  // 4118
    unsigned long v57;  // 4112
    unsigned long v58;  // cc_op
    unsigned long long v23;  // x20
    unsigned long v59;  // cc_dep1
    unsigned long v60;  // cc_dep2
    unsigned long long v61;  // 4113
    unsigned long v62;  // 4112
    unsigned long long v63;  // 4113
    unsigned long long v24;  // x19
    unsigned long v64;  // 4112
    unsigned long v65;  // cc_op
    unsigned long v66;  // cc_dep1
    unsigned long v67;  // cc_dep2
    st_1fb7dc_0 **v0;  // [bp-0x128], Other Possible Types: char
    st_1fb7dc_0 *v1;  // [bp-0x120]
    unsigned long long v2;  // [bp-0x60]
    unsigned long long v3;  // [bp-0x58]
    unsigned long long v4;  // [bp-0x50]
    unsigned long long v5;  // [bp-0x48]
    unsigned long long v6;  // [bp-0x40]
    unsigned long long v7;  // [bp-0x38]
    unsigned long long v8;  // [bp-0x30]
    unsigned long long v9;  // [bp-0x28]
    unsigned long long v10;  // [bp-0x20]
    unsigned long long v11;  // [bp-0x18]
    char *v12;  // [bp-0x10]
    unsigned long long v13;  // [bp-0x8]
    char v14;  // [bp+0x0]

    v2 = v15;
    v3 = v16;
    v4 = v17;
    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = &v14;
    v13 = v25;
    v1 = &v0;
    v0 = &v1;
    a1[1] = 0;
    a1[4] = 0;
    a1[7] = 0;
    a1[9] = 4294967297;
    v26 = *(int *)*a3;
    *a3 = *a3 + 1;
    a2->field_4 = v26;
    v27 = v26 & 0xfffffffe;
    if (v26 != 91)
    {
        v28 = arm64g_calculate_condition(v70 | 16, v71, v72, v68);
        v29 = 3;
        v30 = (v28 & 1 ? v27 : 0x40000000);
        v31 = (v28 & 1 ? 40 : 0);
        v32 = arm64g_calculate_condition(19, v30, v31, 0);
        if (!(v32 & 1))
            goto LABEL_1fb846;
LABEL_1fb845:
        v35 = arm64g_calculate_condition(v29 | 16, v30, v31, 0);
        v36 = 3;
        v37 = (v35 & 1 ? v26 : 0x40000000);
        v38 = (v35 & 1 ? 93 : 0);
        v39 = arm64g_calculate_condition(19, v37, v38, 0);
        if (!(v39 & 1))
            goto LABEL_1fb84e;
LABEL_1fb84d:
        v42 = arm64g_calculate_condition(v36 | 16, v37, v38, 0);
        v43 = 3;
        v44 = (v42 & 1 ? v26 : 0x40000000);
        v45 = (v42 & 1 ? 123 : 0);
        v46 = arm64g_calculate_condition(19, v44, v45, 0);
        if (!(v46 & 1))
            goto LABEL_1fb856;
LABEL_1fb855:
        v49 = arm64g_calculate_condition(v43 | 16, v44, v45, 0);
        v50 = 3;
        v51 = (v49 & 1 ? v26 : 0x40000000);
        v52 = (v49 & 1 ? 125 : 0);
        v53 = v26 & 0xfffffffd;
        v54 = arm64g_calculate_condition(19, v51, v52, 0);
        if (!(v54 & 1))
            goto LABEL_1fb862;
        goto LABEL_1fb861;
    }
    else
    {
        v33 = arm64g_calculate_condition(v70 | 16, v71, v72, v68);
        v29 = 0;
        v30 = (v33 & 1 ? v27 : 0x40000000);
        v31 = (v33 & 1 ? 40 : 0);
        v34 = arm64g_calculate_condition(16, v30, v31, 0);
        if (v34 & 1)
            goto LABEL_1fb845;
LABEL_1fb846:
        v40 = arm64g_calculate_condition(v29 | 16, v30, v31, 0);
        v36 = 0;
        v37 = (v40 & 1 ? v26 : 0x40000000);
        v38 = (v40 & 1 ? 93 : 0);
        v41 = arm64g_calculate_condition(16, v37, v38, 0);
        if (v41 & 1)
            goto LABEL_1fb84d;
LABEL_1fb84e:
        v47 = arm64g_calculate_condition(v36 | 16, v37, v38, 0);
        v43 = 0;
        v44 = (v47 & 1 ? v26 : 0x40000000);
        v45 = (v47 & 1 ? 123 : 0);
        v48 = arm64g_calculate_condition(16, v44, v45, 0);
        if (v48 & 1)
            goto LABEL_1fb855;
LABEL_1fb856:
        v55 = arm64g_calculate_condition(v43 | 16, v44, v45, 0);
        v50 = 0;
        v51 = (v55 & 1 ? v26 : 0x40000000);
        v52 = (v55 & 1 ? 125 : 0);
        v53 = v26 & 0xfffffffd;
        v56 = arm64g_calculate_condition(16, v51, v52, 0);
        if (v56 & 1)
        {
LABEL_1fb861:
            v57 = arm64g_calculate_condition(v50 | 16, v51, v52, 0);
            v58 = 3;
            v59 = (v57 & 1 ? v53 : 0x40000000);
            v60 = (v57 & 1 ? 45 : 0);
            v61 = arm64g_calculate_condition(19, v59, v60, 0);
            if (!(v61 & 1))
                goto LABEL_1fb86a;
            goto LABEL_1fb869;
        }
        else
        {
LABEL_1fb862:
            v62 = arm64g_calculate_condition(v50 | 16, v51, v52, 0);
            v58 = 0;
            v59 = (v62 & 1 ? v53 : 0x40000000);
            v60 = (v62 & 1 ? 45 : 0);
            v63 = arm64g_calculate_condition(16, v59, v60, 0);
            if (v63 & 1)
            {
LABEL_1fb869:
                v64 = arm64g_calculate_condition(v58 | 16, v59, v60, 0);
                v65 = 3;
                v66 = (v64 & 1 ? v26 : 0x40000000);
                v67 = (v64 & 1 ? 124 : 0);
            }
            else
            {
LABEL_1fb86a:
                v69 = arm64g_calculate_condition(v58 | 16, v59, v60, 0);
                v65 = 0;
                v66 = (v69 & 1 ? v26 : 0x40000000);
                v67 = (v69 & 1 ? 124 : 0);
            }
        }
    }
    v73 = arm64g_calculate_condition(v65 | 16, v66, v67, 0);
    v74 = 0x100;
    if (!(v73 & 1))
        v74 = 296;
    v75 = 56;
    if (v26 != 92)
        v75 = v74;
    goto *((void *)(*(long long *)((char *)&g_e78760 + v75)));
}
