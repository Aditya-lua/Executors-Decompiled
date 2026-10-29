/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc59d90..0xc5a048 (696 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_c59d90(void* a0, uint128_t *a1, void* a2)
{
    void* v3;  // x9
    void* v4;  // x8
    void* v13;  // x3
    void* v103;  // x14
    void* v104;  // x10
    unsigned long v105;  // cc_dep1
    unsigned long v106;  // cc_dep2
    void* v107;  // x12
    uint128_t v108;  // q0
    unsigned long long v109;  // 4112
    void* v110;  // x9
    unsigned long long v111;  // 4108
    unsigned long long v112;  // 4108
    unsigned long v14;  // cc_dep1
    unsigned long long v113;  // x12
    unsigned long v114;  // x9
    unsigned long long v115;  // 4110
    unsigned long long v116;  // 4102
    unsigned long long v117;  // 4110
    unsigned long long v118;  // 4102
    unsigned long long v119;  // x30
    unsigned long v15;  // cc_dep2
    void* v16;  // x14
    unsigned long long v17;  // 4105
    unsigned long long v18;  // 4105
    void* v19;  // x9
    unsigned long long v20;  // 4105
    unsigned long long v21;  // 4105
    unsigned long v22;  // cc_dep1
    unsigned long long v5;  // x10
    unsigned long v23;  // cc_dep2
    void* v24;  // x8
    unsigned long long v25;  // 4105
    unsigned long long v26;  // 4105
    void* v27;  // x13
    unsigned long long v28;  // 4105
    unsigned long long v29;  // 4105
    void* v30;  // x0
    void* v31;  // x9
    void* v32;  // x8
    unsigned long long v6;  // x11
    void* v33;  // x12
    unsigned long long v34;  // 4109
    unsigned long long v35;  // 4109
    void* v36;  // x10
    unsigned long v37;  // x14
    unsigned long v38;  // x15
    void* v39;  // x16
    unsigned long v40;  // cc_dep1
    unsigned long v41;  // cc_dep2
    void* v42;  // x11
    void* v7;  // x12
    unsigned long long v43;  // 4105
    unsigned long long v44;  // 4105
    void* v45;  // x9
    unsigned long long v46;  // 4105
    unsigned long long v47;  // 4105
    unsigned long v48;  // cc_dep1
    unsigned long v49;  // cc_dep2
    void* v50;  // x13
    void* v51;  // x14
    void* v52;  // x8
    unsigned long long v8;  // 4109
    unsigned long long v53;  // 4105
    unsigned long long v54;  // 4105
    void* v55;  // x12
    unsigned long long v56;  // 4105
    unsigned long long v57;  // 4105
    void* v58;  // x9
    unsigned long v59;  // x8
    unsigned long v60;  // x10
    void* v61;  // x11
    void* v62;  // x10
    unsigned long long v9;  // 4109
    void* v63;  // x8
    unsigned long v64;  // cc_dep1
    unsigned long v65;  // cc_dep2
    void* v66;  // x11
    unsigned long long v67;  // 4112
    void* v68;  // x9
    unsigned long long v69;  // 4108
    unsigned long long v70;  // 4108
    unsigned long long v71;  // x11
    void* v72;  // x11
    void* v10;  // x13
    unsigned long v73;  // x12
    unsigned long v74;  // x13
    void* v75;  // x14
    void* v76;  // x10
    void* v77;  // x8
    unsigned long v78;  // cc_dep1
    unsigned long v79;  // cc_dep2
    void* v80;  // x12
    unsigned long long v81;  // 4112
    void* v82;  // x9
    unsigned long v11;  // x16
    unsigned long long v83;  // 4108
    unsigned long long v84;  // 4108
    unsigned long long v85;  // x12
    void* v86;  // x11
    unsigned long v87;  // x12
    unsigned long v88;  // x13
    void* v89;  // x14
    void* v90;  // x10
    void* v91;  // x8
    unsigned long v92;  // cc_dep1
    unsigned long v12;  // x17
    unsigned long v93;  // cc_dep2
    void* v94;  // x12
    unsigned long long v95;  // 4112
    void* v96;  // x9
    unsigned long long v97;  // 4108
    unsigned long long v98;  // 4108
    unsigned long long v99;  // x12
    void* v100;  // x11
    unsigned long v101;  // x12
    unsigned long v102;  // x13
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    v3 = a0 + ((unsigned long long)*(long long *)a0 > (unsigned long long)(long long)a0[16]) * 16;
    v4 = a0 + ((unsigned long long)(long long)a0[16] >= (unsigned long long)*(long long *)a0) * 16;
    v5 = 32;
    v6 = 48;
    if ((unsigned long long)(long long)a0[48] < (unsigned long long)(long long)a0[32])
    {
        v7 = a0 + 48;
        v8 = arm64g_calculate_condition(52, (long long)a0[48], (long long)a0[32], 0);
        if (!(v8 & 1))
            goto LABEL_c59dca;
LABEL_c59dc9:
        v6 = 32;
    }
    else
    {
        v7 = a0 + 32;
        v9 = arm64g_calculate_condition(52, (long long)a0[48], (long long)a0[32], 0);
        if (v9 & 1)
            goto LABEL_c59dc9;
LABEL_c59dca:
    }
    v10 = a0 + v6;
    v11 = *(long long *)v10;
    v12 = *(long long *)v4;
    if (v11 < v12)
        v13 = v7;
    else
        v13 = v4;
    v14 = *(long long *)v7;
    v15 = *(long long *)v3;
    if ((unsigned long long)*(long long *)v7 < (unsigned long long)*(long long *)v3)
    {
        v16 = v7;
        v17 = arm64g_calculate_condition(52, v14, v15, 0);
        if (!(v17 & 1))
            goto LABEL_c59df2;
LABEL_c59df1:
        v19 = v3;
        v20 = arm64g_calculate_condition(52, v14, v15, 0);
        if (!(v20 & 1))
            goto LABEL_c59df6;
LABEL_c59df5:
        v7 = v4;
    }
    else
    {
        v16 = v3;
        v18 = arm64g_calculate_condition(52, v14, v15, 0);
        if (v18 & 1)
            goto LABEL_c59df1;
LABEL_c59df2:
        v19 = v13;
        v21 = arm64g_calculate_condition(52, v14, v15, 0);
        if (v21 & 1)
            goto LABEL_c59df5;
LABEL_c59df6:
    }
    v22 = v11;
    v23 = v12;
    if (v11 < v12)
    {
        v24 = v4;
        v25 = arm64g_calculate_condition(52, v22, v23, 0);
        if (!(v25 & 1))
            goto LABEL_c59e02;
LABEL_c59e01:
        v7 = v10;
    }
    else
    {
        v24 = v10;
        v26 = arm64g_calculate_condition(52, v22, v23, 0);
        if (v26 & 1)
            goto LABEL_c59e01;
LABEL_c59e02:
    }
    if ((unsigned long long)*(long long *)v7 < (unsigned long long)*(long long *)v19)
    {
        v27 = v7;
        v28 = arm64g_calculate_condition(52, *(long long *)v7, *(long long *)v19, 0);
        if (!(v28 & 1))
            goto LABEL_c59e16;
LABEL_c59e15:
    }
    else
    {
        v27 = v19;
        v29 = arm64g_calculate_condition(52, *(long long *)v7, *(long long *)v19, 0);
        if (v29 & 1)
            goto LABEL_c59e15;
LABEL_c59e16:
        v19 = v7;
    }
    *(int128_t *)a2 = *(int128_t *)v16;
    *(int128_t *)&a2[16] = *(int128_t *)v27;
    *(int128_t *)&a2[32] = *(int128_t *)v19;
    *(int128_t *)&a2[48] = *(int128_t *)v24;
    v30 = a0 + 64;
    v31 = v30 + ((unsigned long long)(long long)a0[64] > (unsigned long long)(long long)v30[16]) * 16;
    v32 = v30 + ((unsigned long long)(long long)v30[16] >= (unsigned long long)(long long)a0[64]) * 16;
    if ((unsigned long long)(long long)v30[48] < (unsigned long long)(long long)v30[32])
    {
        v33 = v30 + 48;
        v34 = arm64g_calculate_condition(52, (long long)v30[48], (long long)v30[32], 0);
        if (!(v34 & 1))
            goto LABEL_c59e6a;
LABEL_c59e69:
    }
    else
    {
        v33 = v30 + 32;
        v35 = arm64g_calculate_condition(52, (long long)v30[48], (long long)v30[32], 0);
        if (v35 & 1)
            goto LABEL_c59e69;
LABEL_c59e6a:
        v5 = 48;
    }
    v36 = v30 + v5;
    v37 = *(long long *)v36;
    v38 = *(long long *)v32;
    if (v37 < v38)
        v39 = v33;
    else
        v39 = v32;
    v40 = *(long long *)v33;
    v41 = *(long long *)v31;
    if ((unsigned long long)*(long long *)v33 < (unsigned long long)*(long long *)v31)
    {
        v42 = v33;
        v43 = arm64g_calculate_condition(52, v40, v41, 0);
        if (!(v43 & 1))
            goto LABEL_c59e92;
LABEL_c59e91:
        v45 = v31;
        v46 = arm64g_calculate_condition(52, v40, v41, 0);
        if (!(v46 & 1))
            goto LABEL_c59e96;
LABEL_c59e95:
        v33 = v32;
    }
    else
    {
        v42 = v31;
        v44 = arm64g_calculate_condition(52, v40, v41, 0);
        if (v44 & 1)
            goto LABEL_c59e91;
LABEL_c59e92:
        v45 = v39;
        v47 = arm64g_calculate_condition(52, v40, v41, 0);
        if (v47 & 1)
            goto LABEL_c59e95;
LABEL_c59e96:
    }
    v48 = v37;
    v49 = v38;
    v50 = a2 + 48;
    v51 = a2 + 64;
    if (v37 < v38)
    {
        v52 = v32;
        v53 = arm64g_calculate_condition(52, v48, v49, 0);
        if (!(v53 & 1))
            goto LABEL_c59eaa;
LABEL_c59ea9:
    }
    else
    {
        v52 = v36;
        v54 = arm64g_calculate_condition(52, v48, v49, 0);
        if (v54 & 1)
            goto LABEL_c59ea9;
LABEL_c59eaa:
        v36 = v33;
    }
    if ((unsigned long long)*(long long *)v36 < (unsigned long long)*(long long *)v45)
    {
        v55 = v36;
        v56 = arm64g_calculate_condition(52, *(long long *)v36, *(long long *)v45, 0);
        if (!(v56 & 1))
            goto LABEL_c59ebe;
LABEL_c59ebd:
    }
    else
    {
        v55 = v45;
        v57 = arm64g_calculate_condition(52, *(long long *)v36, *(long long *)v45, 0);
        if (v57 & 1)
            goto LABEL_c59ebd;
LABEL_c59ebe:
        v45 = v36;
    }
    *(int128_t *)&a2[64] = *(int128_t *)v42;
    *(int128_t *)&a2[80] = *(int128_t *)v55;
    *(int128_t *)&a2[96] = *(int128_t *)v45;
    v58 = a2 + 112;
    *(int128_t *)&a2[112] = *(int128_t *)v52;
    v59 = (long long)a2[64];
    v60 = *(long long *)a2;
    if (v59 < v60)
        v61 = v51;
    else
        v61 = a2;
    *a1 = *(int128_t *)v61;
    v62 = v51 + (v60 > v59) * 16;
    v63 = a2 + (v59 >= v60) * 16;
    v64 = (long long)a2[112];
    v65 = (long long)a2[48];
    if ((unsigned long long)(long long)a2[112] < (unsigned long long)(long long)a2[48])
        v66 = v50;
    else
        v66 = v58;
    a1[7] = *(int128_t *)v66;
    v67 = arm64g_calculate_condition(52, v64, v65, 0);
    if (v67 & 1)
    {
        v68 = v58;
        v69 = arm64g_calculate_condition(36, v64, v65, 0);
        if (!(v69 & 1))
            goto LABEL_c59f2e;
LABEL_c59f2d:
        v71 = 0;
    }
    else
    {
        v68 = v58 + 0xfffffffffffffff0;
        v70 = arm64g_calculate_condition(36, v64, v65, 0);
        if (v70 & 1)
            goto LABEL_c59f2d;
LABEL_c59f2e:
        v71 = 0xffffffffffffffff;
    }
    v72 = v50 + v71 * 16;
    v73 = *(long long *)v62;
    v74 = *(long long *)v63;
    if (v73 < v74)
        v75 = v62;
    else
        v75 = v63;
    a1[1] = *(int128_t *)v75;
    v76 = v62 + (v74 > v73) * 16;
    v77 = v63 + (v73 >= v74) * 16;
    v78 = *(long long *)v68;
    v79 = *(long long *)v72;
    if ((unsigned long long)*(long long *)v68 < (unsigned long long)*(long long *)v72)
        v80 = v72;
    else
        v80 = v68;
    a1[6] = *(int128_t *)v80;
    v81 = arm64g_calculate_condition(52, v78, v79, 0);
    if (v81 & 1)
    {
        v82 = v68;
        v83 = arm64g_calculate_condition(36, v78, v79, 0);
        if (!(v83 & 1))
            goto LABEL_c59f7e;
LABEL_c59f7d:
        v85 = 0;
    }
    else
    {
        v82 = v68 + 0xfffffffffffffff0;
        v84 = arm64g_calculate_condition(36, v78, v79, 0);
        if (v84 & 1)
            goto LABEL_c59f7d;
LABEL_c59f7e:
        v85 = 0xffffffffffffffff;
    }
    v86 = v72 + v85 * 16;
    v87 = *(long long *)v76;
    v88 = *(long long *)v77;
    if (v87 < v88)
        v89 = v76;
    else
        v89 = v77;
    a1[2] = *(int128_t *)v89;
    v90 = v76 + (v88 > v87) * 16;
    v91 = v77 + (v87 >= v88) * 16;
    v92 = *(long long *)v82;
    v93 = *(long long *)v86;
    if ((unsigned long long)*(long long *)v82 < (unsigned long long)*(long long *)v86)
        v94 = v86;
    else
        v94 = v82;
    a1[5] = *(int128_t *)v94;
    v95 = arm64g_calculate_condition(52, v92, v93, 0);
    if (v95 & 1)
    {
        v96 = v82;
        v97 = arm64g_calculate_condition(36, v92, v93, 0);
        if (!(v97 & 1))
            goto LABEL_c59fce;
LABEL_c59fcd:
        v99 = 0;
    }
    else
    {
        v96 = v82 + 0xfffffffffffffff0;
        v98 = arm64g_calculate_condition(36, v92, v93, 0);
        if (v98 & 1)
            goto LABEL_c59fcd;
LABEL_c59fce:
        v99 = 0xffffffffffffffff;
    }
    v100 = v86 + v99 * 16;
    v101 = *(long long *)v90;
    v102 = *(long long *)v91;
    if (v101 < v102)
        v103 = v90;
    else
        v103 = v91;
    a1[3] = *(int128_t *)v103;
    v104 = v90 + (v102 > v101) * 16;
    v105 = *(long long *)v96;
    v106 = *(long long *)v100;
    if ((unsigned long long)*(long long *)v96 < (unsigned long long)*(long long *)v100)
        v107 = v100;
    else
        v107 = v96;
    v108 = *(int128_t *)v107;
    a1[4] = v108;
    v109 = arm64g_calculate_condition(52, v105, v106, 0);
    if (v109 & 1)
    {
        v110 = v96;
        v111 = arm64g_calculate_condition(36, v105, v106, 0);
        if (!(v111 & 1))
            goto LABEL_c5a01e;
LABEL_c5a01d:
        v113 = 0;
    }
    else
    {
        v110 = v96 + 0xfffffffffffffff0;
        v112 = arm64g_calculate_condition(36, v105, v106, 0);
        if (v112 & 1)
            goto LABEL_c5a01d;
LABEL_c5a01e:
        v113 = 0xffffffffffffffff;
    }
    v114 = v110 + 16;
    if (v91 + (v101 >= v102) * 16 == v100 + v113 * 16 + 16)
    {
        v115 = arm64g_calculate_condition(4, v105, v106, 0);
        v116 = arm64g_calculate_condition(20, (v115 & 1 ? v104 : 0), (v115 & 1 ? v114 : 0), 0);
        if (v116 & 1)
        {
            v0 = &v2;
            v1 = v119;
            sub_c73e74();
        }
    }
    else
    {
        v117 = arm64g_calculate_condition(4, v105, v106, 0);
        v118 = arm64g_calculate_condition(16, (v117 & 1 ? v104 : 0), (v117 & 1 ? v114 : 0), 0);
        if (v118 & 1)
        {
            v0 = &v2;
            v1 = v119;
            sub_c73e74();
        }
    }
    return *(unsigned long long *)&v108;
}
