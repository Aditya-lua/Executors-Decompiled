/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa211f0..0xa21360 (368 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_a211f0(unsigned long long *a0, unsigned long a1, unsigned long a2, unsigned long a3, uint128_t a4, uint128_t a5, uint128_t a6, uint128_t a7)
{
    uint128_t v0;  // x15
    unsigned long v1;  // x9
    uint128_t v10;  // x10
    unsigned long long v100;  // x14
    unsigned long v101;  // 4680
    unsigned long long v102;  // x15
    unsigned long v103;  // 4687
    unsigned long long v104;  // x16
    unsigned long v105;  // 4694
    unsigned long long v106;  // x17
    unsigned long long v107;  // 4701
    unsigned long long v108;  // x19
    unsigned long long v109;  // 4708
    unsigned long v11;  // 4389
    unsigned long v110;  // x12
    unsigned long long v111;  // 4716
    unsigned long long v112;  // x10
    unsigned long long v113;  // 4724
    unsigned long v114;  // x13
    unsigned long v115;  // 4732
    unsigned long v116;  // cc_dep1
    unsigned long v117;  // cc_ndep
    unsigned long long v118;  // 4745
    unsigned long long v119;  // x14
    unsigned long long v12;  // x19
    unsigned long long v120;  // 4105
    unsigned long long v121;  // 4105
    unsigned long long v122;  // x15
    unsigned long long v123;  // 4105
    unsigned long long v124;  // 4105
    unsigned long long v125;  // 4113
    uint128_t v13;  // x20
    unsigned long long v14;  // x9
    uint128_t v15;  // x14
    unsigned long v16;  // 4408
    unsigned long long v17;  // x10
    unsigned long long v18;  // x17
    unsigned long v19;  // x4
    uint128_t v2;  // x16
    unsigned long v20;  // 4419
    unsigned long long v21;  // x19
    uint128_t v22;  // x9
    unsigned long v23;  // 4430
    unsigned long long v24;  // x20
    unsigned long v25;  // x5
    unsigned long v26;  // 4441
    unsigned long long v27;  // x1
    unsigned long long v28;  // x15
    uint128_t v29;  // x10
    unsigned long v3;  // x10
    unsigned long v30;  // 4452
    unsigned long long v31;  // x16
    unsigned long v32;  // x6
    unsigned long v33;  // 4463
    unsigned long long v34;  // x17
    uint128_t v35;  // x11
    unsigned long v36;  // 4474
    unsigned long long v37;  // x19
    unsigned long v38;  // 4485
    unsigned long long v39;  // x20
    uint128_t v4;  // x17
    unsigned long v40;  // 4492
    unsigned long long v41;  // x1
    unsigned long v42;  // 4499
    unsigned long long v43;  // x15
    unsigned long v44;  // 4506
    unsigned long long v45;  // x16
    unsigned long v46;  // 4513
    unsigned long long v47;  // x17
    unsigned long v48;  // 4520
    unsigned long long v49;  // x19
    unsigned long long v5;  // x16
    unsigned long v50;  // 4527
    unsigned long long v51;  // x20
    unsigned long long v52;  // x8
    unsigned long v53;  // 4536
    unsigned long long v54;  // x1
    unsigned long long v55;  // x9
    unsigned long v56;  // 4545
    unsigned long long v57;  // x2
    unsigned long long v58;  // x10
    unsigned long long v59;  // 4552
    uint128_t v6;  // x8
    unsigned long long v60;  // x14
    unsigned long v61;  // 4560
    unsigned long long v62;  // x15
    unsigned long long v63;  // x8
    unsigned long v64;  // 4569
    unsigned long long v65;  // x16
    unsigned long long v66;  // x9
    unsigned long v67;  // 4578
    unsigned long long v68;  // x17
    unsigned long long v69;  // x10
    unsigned long v7;  // x9
    unsigned long long v70;  // 4585
    unsigned long long v71;  // x14
    unsigned long v72;  // 4593
    unsigned long long v73;  // x15
    unsigned long long v74;  // x8
    unsigned long v75;  // 4602
    unsigned long long v76;  // x16
    unsigned long long v77;  // x9
    unsigned long v78;  // 4611
    unsigned long long v79;  // x17
    unsigned long v8;  // 4374
    unsigned long long v80;  // x10
    unsigned long long v81;  // 4618
    unsigned long long v82;  // x14
    unsigned long v83;  // 4626
    unsigned long long v84;  // x15
    unsigned long long v85;  // x8
    unsigned long v86;  // 4635
    unsigned long long v87;  // x16
    unsigned long long v88;  // x9
    unsigned long v89;  // 4644
    unsigned long long v9;  // x17
    unsigned long long v90;  // x17
    unsigned long long v91;  // x10
    unsigned long long v92;  // 4651
    unsigned long long v93;  // x14
    unsigned long v94;  // 4659
    unsigned long long v95;  // x15
    unsigned long v96;  // 4666
    unsigned long long v97;  // x16
    unsigned long v98;  // 4673
    unsigned long long v99;  // x17

    v0 = a4 * a5;
    v1 = a5 * a4 >> 64;
    v2 = a4 * a6;
    v3 = a6 * a4 >> 64;
    v4 = a4 * a7;
    v5 = v2 + v1;
    v6 = a5 * a6;
    v7 = a6 * a5 >> 64;
    v8 = arm64g_calculate_flag_c(2, v2, v1, 0);
    v9 = v4 + v3 + v8;
    v10 = a5 * a7;
    v11 = arm64g_calculate_flag_c(6, v4, v3, v8);
    v12 = (unsigned long long)(a7 * a4 >> 64) + v11;
    v13 = a6 * a7;
    v14 = v7 + v10;
    v15 = a4 * a4;
    v16 = arm64g_calculate_flag_c(2, v7, v10, 0);
    v17 = (unsigned long long)(a7 * a5 >> 64) + v16;
    v18 = v9 + v6;
    v19 = a4 * a4 >> 64;
    v20 = arm64g_calculate_flag_c(2, v9, v6, 0);
    v21 = v12 + v14 + v20;
    v22 = a5 * a5;
    v23 = arm64g_calculate_flag_c(6, v12, v14, v20);
    v24 = v13 + v17 + v23;
    v25 = a5 * a5 >> 64;
    v26 = arm64g_calculate_flag_c(6, v13, v17, v23);
    v27 = (unsigned long long)(a7 * a6 >> 64) + v26;
    v28 = v0 * 2;
    v29 = a6 * a6;
    v30 = arm64g_calculate_flag_c(2, v0, v0, 0);
    v31 = v5 * 2 + v30;
    v32 = a6 * a6 >> 64;
    v33 = arm64g_calculate_flag_c(6, v5, v5, v30);
    v34 = v18 * 2 + v33;
    v35 = a7 * a7;
    v36 = arm64g_calculate_flag_c(6, v18, v18, v33);
    v37 = v21 * 2 + v36;
    v38 = arm64g_calculate_flag_c(6, v21, v21, v36);
    v39 = v24 * 2 + v38;
    v40 = arm64g_calculate_flag_c(6, v24, v24, v38);
    v41 = v27 * 2 + v40;
    v42 = arm64g_calculate_flag_c(6, v27, v27, v40);
    v43 = v28 + v19;
    v44 = arm64g_calculate_flag_c(2, v28, v19, 0);
    v45 = v31 + v22 + v44;
    v46 = arm64g_calculate_flag_c(6, v31, v22, v44);
    v47 = v34 + v25 + v46;
    v48 = arm64g_calculate_flag_c(6, v34, v25, v46);
    v49 = v37 + v29 + v48;
    v50 = arm64g_calculate_flag_c(6, v37, v29, v48);
    v51 = v39 + v32 + v50;
    v52 = v15 * 0x100000000;
    v53 = arm64g_calculate_flag_c(6, v39, v32, v50);
    v54 = v41 + v35 + v53;
    v55 = v15 >> 32;
    v56 = arm64g_calculate_flag_c(6, v41, v35, v53);
    v57 = v42 + (unsigned long long)(a7 * a7 >> 64) + v56;
    v58 = v15 - v52;
    v59 = arm64g_calculate_flag_c(4, v15, v52, 0);
    v60 = v43 + v52;
    v61 = arm64g_calculate_flag_c(2, v43, v52, 0);
    v62 = v45 + v55 + v61;
    v63 = v60 * 0x100000000;
    v64 = arm64g_calculate_flag_c(6, v45, v55, v61);
    v65 = v47 + v58 + v64;
    v66 = v60 >> 32;
    v67 = arm64g_calculate_flag_c(6, v47, v58, v64);
    v68 = v15 - v55 - (v59 ^ 1) + v67;
    v69 = v60 - v63;
    v70 = arm64g_calculate_flag_c(4, v60, v63, 0);
    v71 = v62 + v63;
    v72 = arm64g_calculate_flag_c(2, v62, v63, 0);
    v73 = v65 + v66 + v72;
    v74 = v71 * 0x100000000;
    v75 = arm64g_calculate_flag_c(6, v65, v66, v72);
    v76 = v68 + v69 + v75;
    v77 = v71 >> 32;
    v78 = arm64g_calculate_flag_c(6, v68, v69, v75);
    v79 = v60 - v66 - (v70 ^ 1) + v78;
    v80 = v71 - v74;
    v81 = arm64g_calculate_flag_c(4, v71, v74, 0);
    v82 = v73 + v74;
    v83 = arm64g_calculate_flag_c(2, v73, v74, 0);
    v84 = v76 + v77 + v83;
    v85 = v82 * 0x100000000;
    v86 = arm64g_calculate_flag_c(6, v76, v77, v83);
    v87 = v79 + v80 + v86;
    v88 = v82 >> 32;
    v89 = arm64g_calculate_flag_c(6, v79, v80, v86);
    v90 = v71 - v77 - (v81 ^ 1) + v89;
    v91 = v82 - v85;
    v92 = arm64g_calculate_flag_c(4, v82, v85, 0);
    v93 = v84 + v85;
    v94 = arm64g_calculate_flag_c(2, v84, v85, 0);
    v95 = v87 + v88 + v94;
    v96 = arm64g_calculate_flag_c(6, v87, v88, v94);
    v97 = v90 + v91 + v96;
    v98 = arm64g_calculate_flag_c(6, v90, v91, v96);
    v99 = v82 - v88 - (v92 ^ 1) + v98;
    v100 = v93 + v49;
    v101 = arm64g_calculate_flag_c(2, v93, v49, 0);
    v102 = v95 + v51 + v101;
    v103 = arm64g_calculate_flag_c(6, v95, v51, v101);
    v104 = v97 + v54 + v103;
    v105 = arm64g_calculate_flag_c(6, v97, v54, v103);
    v106 = v99 + v57 + v105;
    v107 = arm64g_calculate_flag_c(6, v99, v57, v105);
    v108 = v107;
    v109 = arm64g_calculate_flag_c(2, v100, 1, 0);
    v111 = arm64g_calculate_flag_c(8, v102, v110, v109);
    v112 = v104 - (v111 ^ 1);
    v113 = arm64g_calculate_flag_c(8, v104, 0, v111);
    v115 = arm64g_calculate_flag_c(8, v106, v114, v113);
    v116 = v108;
    v117 = v115;
    v118 = arm64g_calculate_condition(56, v108, 0, v115);
    if (v118 & 1)
    {
        v119 = v100;
        v120 = arm64g_calculate_condition(56, v116, 0, v117);
        if (!(v120 & 1))
            goto LABEL_a2134a;
LABEL_a21349:
        v122 = v102;
        v123 = arm64g_calculate_condition(56, v116, 0, v117);
        if (!(v123 & 1))
            goto LABEL_a2134e;
LABEL_a2134d:
    }
    else
    {
        v119 = v100 + 1;
        v121 = arm64g_calculate_condition(56, v116, 0, v117);
        if (v121 & 1)
            goto LABEL_a21349;
LABEL_a2134a:
        v122 = v102 - v110 - (v109 ^ 1);
        v124 = arm64g_calculate_condition(56, v116, 0, v117);
        if (v124 & 1)
            goto LABEL_a2134d;
LABEL_a2134e:
        v104 = v112;
    }
    *a0 = v119;
    a0[1] = v122;
    v125 = arm64g_calculate_condition(56, v116, 0, v117);
    if (!(v125 & 1))
        v106 = v106 - v114 - (v113 ^ 1);
    a0[2] = v104;
    a0[3] = v106;
    return a0;
}
