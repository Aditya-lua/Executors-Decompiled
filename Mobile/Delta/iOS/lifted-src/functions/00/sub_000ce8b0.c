/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xce8b0..0xcec7c (972 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ce8b0_1 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    unsigned long long field_50;
} st_ce8b0_1;

typedef struct st_ce8b0_0 {
    char field_0;
} st_ce8b0_0;


st_ce8b0_1 * sub_ce8b0(long long a0, st_ce8b0_1 *a1, unsigned int a2)
{
    long long v33;  // x0
    unsigned long long v34;  // 4106
    st_ce8b0_1 *v43;  // w0
    unsigned long v86;  // cc_ndep
    unsigned long long v87;  // 4130
    unsigned long long v88;  // 4158
    long long v89;  // x9
    unsigned long v90;  // cc_op
    unsigned long v91;  // cc_dep1
    unsigned long v92;  // cc_dep2
    st_ce8b0_1 *ptr;  // x0
    unsigned long v44;  // 4110
    unsigned long v45;  // cc_op
    unsigned long v46;  // cc_dep1
    unsigned long long v47;  // 4128
    unsigned int v48;  // w9
    long long v35;  // x19
    unsigned long v49;  // 4110
    unsigned long long v50;  // 4128
    st_ce8b0_1 *v36;  // w0
    unsigned long v51;  // 4110
    unsigned long v52;  // cc_op
    unsigned long v53;  // cc_dep1
    unsigned long v54;  // 4110
    st_ce8b0_1 *v37;  // w0
    unsigned long long v55;  // 4194
    unsigned long long v56;  // 4203
    st_ce8b0_1 *v57;  // w8
    long long v58;  // x9
    unsigned long long v59;  // x9
    unsigned int v60;  // w0
    unsigned int v61;  // w0
    unsigned int v62;  // w0
    st_ce8b0_1 *v38;  // w0
    st_ce8b0_1 *v63;  // x21
    unsigned long v64;  // x20
    st_ce8b0_1 *v65;  // w0
    st_ce8b0_1 *v66;  // w0
    unsigned int v67;  // w8
    unsigned long v68;  // 4112
    st_ce8b0_1 *v39;  // w0
    unsigned long v69;  // cc_op
    unsigned long v70;  // cc_dep1
    unsigned long long v71;  // 4110
    unsigned long v72;  // 4112
    unsigned long long v73;  // 4110
    unsigned long v40;  // x22
    unsigned long v74;  // 4110
    unsigned long v75;  // cc_op
    unsigned long v76;  // cc_dep1
    unsigned long v77;  // cc_dep2
    unsigned long long v78;  // 4128
    unsigned int v79;  // w8
    st_ce8b0_1 *v41;  // x23
    unsigned long v80;  // 4110
    unsigned long long v81;  // 4128
    unsigned long v82;  // 4110
    st_ce8b0_1 *v42;  // w0
    unsigned long v83;  // cc_op
    unsigned long v84;  // cc_dep1
    unsigned long v85;  // 4110
    st_ce8b0_1 *v0;  // [bp-0x218]
    st_ce8b0_1 *v1;  // [bp-0x214]
    st_ce8b0_1 *v2;  // [bp-0x210], Other Possible Types: unsigned int
    st_ce8b0_1 *v3;  // [bp-0x20c], Other Possible Types: unsigned int
    st_ce8b0_1 *v4;  // [bp-0x208], Other Possible Types: unsigned long long
    st_ce8b0_0 **v5;  // [bp-0x200], Other Possible Types: char
    st_ce8b0_0 *v6;  // [bp-0x1f8]
    char v7;  // [bp-0x1f0]
    char v8;  // [bp-0x1e8]
    char v9;  // [bp-0x1e0], Other Possible Types: unsigned long
    unsigned long v10;  // [bp-0x1d8]
    st_ce8b0_1 *v11;  // [bp-0x1d0]
    char v12;  // [bp-0x1c8], Other Possible Types: unsigned long
    uint128_t v13;  // [bp-0x1c0]
    uint128_t v14;  // [bp-0x1b0]
    uint128_t v15;  // [bp-0x1a0]
    uint128_t v16;  // [bp-0x190]
    uint128_t v17;  // [bp-0x180]
    st_ce8b0_1 *v18;  // [bp-0x178]
    st_ce8b0_1 *v19;  // [bp-0x170], Other Possible Types: unsigned long
    unsigned int v20;  // [bp-0x168]
    st_ce8b0_1 *v21;  // [bp-0x160]
    char v22;  // [bp-0x158], Other Possible Types: unsigned long
    st_ce8b0_1 *v23;  // [bp-0x150]
    unsigned long long v24;  // [bp-0x148]
    long long v25;  // [bp-0x128]
    char v26;  // [bp-0x120], Other Possible Types: unsigned long
    unsigned long v27;  // [bp-0x118]
    st_ce8b0_1 *v28;  // [bp-0x80]
    st_ce8b0_1 *v29;  // [bp-0x78]
    st_ce8b0_1 *v30;  // [bp-0x74], Other Possible Types: unsigned int
    char *v31;  // [bp-0x10]
    char v32;  // [bp+0x0]

    v31 = &v32;
    v6 = &v5;
    v5 = &v6;
    v18 = 0;
    v19 = 0;
    if (a1)
    {
        v15 = a1->field_20;
        v16 = a1->field_30;
        v17 = a1->field_40;
        v19 = a1->field_50;
        v13 = a1->field_0;
        v14 = a1->field_10;
    }
    else
    {
        sub_ccf54(&v13);
    }
    v20 = a2;
    v21 = sub_cd134(&v13, a0, 5);
    if (!v21)
        return v21;
    v33 = sub_cd39c(&v13, v21);
    v34 = arm64g_calculate_condition(2, v33, 1, 0);
    if (!(v34 & 1))
    {
        v35 = v33;
        v30 = 1;
        v4 = sub_cd068(&v13, v21, v35, 0);
        v3 = (st_ce8b0_1 *)(unsigned int)sub_ce304(&v13, v21, &v12);
        v2 = (st_ce8b0_1 *)(unsigned int)sub_ce39c(&v13, v21, &v7);
        v1 = (st_ce8b0_1 *)(unsigned int)sub_ce450(&v13, v21, &v8);
        v0 = (st_ce8b0_1 *)(unsigned int)sub_ce450(&v13, v21, &v8);
        v36 = (st_ce8b0_1 *)(unsigned int)sub_ce304(&v13, v21, &v11);
        v37 = (st_ce8b0_1 *)(unsigned int)sub_ce304(&v13, v21, &v10);
        v38 = (st_ce8b0_1 *)(unsigned int)sub_ce39c(&v13, v21, &v22);
        v39 = (st_ce8b0_1 *)(unsigned int)sub_ce39c(&v13, v21, &v9);
        v40 = v10;
        v41 = v11;
        v42 = (st_ce8b0_1 *)(unsigned int)sub_ce39c(&v13, v21, &v26);
        v43 = (st_ce8b0_1 *)(unsigned int)sub_ce39c(&v13, v21, &v27);
        if (!v39 && !v38 && !v37 && !v36 && !v0 && !v1 && !v2 && !v3)
        {
            v44 = arm64g_calculate_condition(v90, v91, v92, v86);
            v45 = 4;
            v46 = (v44 & 1 ? v4 : 0);
            v47 = arm64g_calculate_condition(4, v46, 0, 0);
            v48 = !(v47 & 1);
            if (v41)
                goto LABEL_cea86;
LABEL_cea85:
            v51 = arm64g_calculate_condition(v45, v46, 0, 0);
            v52 = 4;
            v53 = (v51 & 1 ? v40 : 0);
        }
        else
        {
            v49 = arm64g_calculate_condition(v90, v91, v92, v86);
            v45 = 0;
            v46 = (v49 & 1 ? v4 : 0);
            v50 = arm64g_calculate_condition(0, v46, 0, 0);
            v48 = !(v50 & 1);
            if (!v41)
                goto LABEL_cea85;
LABEL_cea86:
            v54 = arm64g_calculate_condition(v45, v46, 0, 0);
            v52 = 0;
            v53 = (v54 & 1 ? v40 : 0);
        }
        v55 = arm64g_calculate_condition(v52, v53, 0, 0);
        v56 = arm64g_calculate_condition((v55 & 1 ? 4 : 0) | 16, (v55 & 1 ? v9 : 0), (v55 & 1 ? v22 : 0), 0);
        v57 = (st_ce8b0_1 *)(!v43 && !v42 ? (v56 & 1 ? 0xffffff99 : (int)(v48 * 0x80000000) >> 31 & 0xfffffffe | v48 & 1) : 0xffffffff);
        v23 = 0;
        v58 = v26 + v27;
        v59 = v35 - v58;
        if ((unsigned long long)v58 <= (unsigned long long)v35)
            goto LABEL_cec08;
    }
    else
    {
        v35 = sub_cd16c(&v13, v21);
        v30 = (st_ce8b0_1 *)0;
        v4 = sub_cd068(&v13, v21, v35, 0);
        v3 = sub_ce304(&v13, v21, &v12);
        v2 = sub_ce450(&v13, v21, &v11);
        v60 = sub_ce450(&v13, v21, &v10);
        v61 = sub_ce450(&v13, v21, &v12);
        v22 = v12;
        v62 = sub_ce450(&v13, v21, &v12);
        v63 = v11;
        v64 = v10;
        v65 = (st_ce8b0_1 *)(unsigned int)sub_ce304(&v13, v21, &v12);
        v26 = v12;
        v66 = (st_ce8b0_1 *)(unsigned int)sub_ce304(&v13, v21, &v12);
        v67 = v62 | v61 | v60 | v2 | v3;
        if (!v4)
        {
            v68 = arm64g_calculate_condition(v90, v91, v92, v86);
            v69 = 3;
            v70 = (v68 & 1 ? v67 : 0);
            v71 = arm64g_calculate_condition(3, v70, 0, 0);
            if (!(v71 & 1))
                goto LABEL_cebae;
LABEL_cebad:
            v74 = arm64g_calculate_condition(v69, v70, 0, 0);
            v75 = 2;
            v76 = (v74 & 1 ? v35 : 0x40000000);
            v77 = v74 & 1;
            v78 = arm64g_calculate_condition(18, v76, v77, 0);
            v79 = !(v78 & 1);
            if (v63)
                goto LABEL_cebba;
LABEL_cebb9:
            v82 = arm64g_calculate_condition(v75, v76, v77, 0);
            v83 = 4;
            v84 = (v82 & 1 ? v64 : 0);
        }
        else
        {
            v72 = arm64g_calculate_condition(v90, v91, v92, v86);
            v69 = 0;
            v70 = (v72 & 1 ? v67 : 0);
            v73 = arm64g_calculate_condition(0, v70, 0, 0);
            if (v73 & 1)
                goto LABEL_cebad;
LABEL_cebae:
            v80 = arm64g_calculate_condition(v69, v70, 0, 0);
            v75 = 0;
            v76 = (v80 & 1 ? v35 : 0x40000000);
            v77 = v80 & 1;
            v81 = arm64g_calculate_condition(16, v76, v77, 0);
            v79 = !(v81 & 1);
            if (!v63)
                goto LABEL_cebb9;
LABEL_cebba:
            v85 = arm64g_calculate_condition(v75, v76, v77, 0);
            v83 = 0;
            v84 = (v85 & 1 ? v64 : 0);
        }
        v87 = arm64g_calculate_condition(v83, v84, 0, 0);
        v88 = arm64g_calculate_condition((v87 & 1 ? 4 : 0) | 16, (v87 & 1 ? v12 : 0), (v87 & 1 ? v22 : 0), 0);
        v27 = v12;
        if (!sub_ce450() && !v66 && !v65)
            v57 = (v88 & 1 ? 0xffffff99 : (int)(v79 * 0x80000000) >> 31 & 0xfffffffe | v79 & 1);
        else
            v57 = 0xffffffff;
        v89 = v26 + v27;
        v59 = v35 - v89;
        if ((unsigned long long)v35 >= (unsigned long long)v89)
        {
LABEL_cec08:
            if (!v57)
            {
                v24 = v59;
                v25 = v35;
                v28 = 0;
                v29 = (st_ce8b0_1 *)0;
                ptr = _malloc(336);
                if (!ptr)
                    return ptr;
                _memcpy();
                sub_cd318(ptr);
                return ptr;
            }
        }
    }
    (*(unsigned long long *)((void*)&v15 + 8))();
}
