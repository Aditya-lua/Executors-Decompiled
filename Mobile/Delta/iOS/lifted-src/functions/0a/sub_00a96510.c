/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa96510..0xa96854 (836 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_a96510(uint128_t *a0, uint128_t *a1, uint128_t *a2, unsigned long long a3)
{
    uint128_t v0;  // q22
    uint128_t v1;  // q21
    uint128_t v10;  // q6
    uint128_t v100;  // q5
    uint128_t v101;  // q4
    uint128_t v102;  // 4116
    uint128_t v103;  // q2
    uint128_t v105;  // q23
    uint128_t v106;  // q0
    uint128_t v107;  // q18
    uint128_t v108;  // 4127
    uint128_t v11;  // q7
    uint128_t v110;  // 4139
    uint128_t v111;  // q16
    uint128_t v112;  // q3
    uint128_t v113;  // 4151
    uint128_t v114;  // 4152
    uint128_t v115;  // 4153
    uint128_t v116;  // 4158
    uint128_t v117;  // 4159
    uint128_t v119;  // q1
    uint128_t v12;  // q4
    uint128_t v120;  // q4
    uint128_t v121;  // 4115
    uint128_t v122;  // q2
    uint128_t v124;  // q0
    uint128_t v125;  // q18
    uint128_t v126;  // 4123
    uint128_t v128;  // q16
    uint128_t v129;  // q3
    uint128_t v13;  // q25
    uint128_t v131;  // q1
    uint128_t v132;  // 4111
    uint128_t v133;  // q2
    uint128_t v135;  // q0
    uint128_t v136;  // q18
    uint128_t v137;  // 4119
    uint128_t v139;  // q0
    uint128_t v14;  // q24
    uint128_t v15;  // q23
    uint128_t v16;  // 4129
    uint128_t v17;  // 4134
    uint128_t v18;  // 4135
    uint128_t v19;  // 4136
    uint128_t v2;  // q20
    uint128_t v20;  // 4141
    uint128_t v21;  // 4142
    uint128_t v22;  // 4155
    uint128_t v23;  // 4160
    uint128_t v24;  // 4161
    uint128_t v25;  // q29
    uint128_t v26;  // q31
    uint128_t v27;  // q30
    unsigned long long v28;  // x3
    uint128_t *v29;  // x2
    uint128_t *v3;  // x1
    unsigned long long v30;  // x3
    unsigned long long i;  // x3
    uint128_t v32;  // q16
    uint128_t v33;  // q3
    uint128_t v34;  // q5
    uint128_t v35;  // q6
    uint128_t v36;  // q7
    uint128_t v37;  // 4113
    uint128_t v38;  // 4118
    uint128_t v39;  // q25
    uint128_t v4;  // q28
    uint128_t v40;  // 4122
    uint128_t v41;  // q0
    uint128_t v42;  // q2
    uint128_t v43;  // q24
    uint128_t v44;  // q23
    uint128_t v46;  // 4148
    uint128_t v47;  // 4157
    uint128_t v48;  // q1
    uint128_t v49;  // 4162
    uint128_t v5;  // q27
    uint128_t v50;  // 4163
    uint128_t v51;  // q2
    uint128_t v53;  // 4164
    uint128_t v54;  // 4169
    uint128_t v55;  // q0
    uint128_t v56;  // 4174
    uint128_t v57;  // q18
    uint128_t v58;  // 4190
    uint128_t v59;  // 4191
    uint128_t v6;  // q26
    uint128_t v60;  // 4200
    uint128_t v61;  // 4201
    uint128_t v62;  // q16
    uint128_t v63;  // q3
    uint128_t v64;  // 4103
    uint128_t v65;  // 4108
    uint128_t v66;  // 4109
    uint128_t v67;  // q0
    uint128_t v68;  // q2
    uint128_t v69;  // q1
    uint128_t *v7;  // x2
    unsigned long long v70;  // x3
    unsigned long long v71;  // 4145
    unsigned long long v72;  // 4102
    uint128_t v74;  // q1
    uint128_t v75;  // q5
    uint128_t v76;  // q6
    uint128_t v77;  // q4
    uint128_t v78;  // 4118
    uint128_t v79;  // q2
    uint128_t v8;  // q0
    uint128_t v81;  // q24
    uint128_t v82;  // q23
    uint128_t v83;  // q0
    uint128_t v84;  // 4129
    uint128_t v85;  // q18
    uint128_t v86;  // 4137
    uint128_t v87;  // 4142
    uint128_t v88;  // 4143
    uint128_t v89;  // 4148
    uint128_t v9;  // q5
    uint128_t v91;  // 4156
    uint128_t v92;  // q16
    uint128_t v93;  // 4161
    uint128_t v94;  // q3
    uint128_t v95;  // 4177
    uint128_t v96;  // 4182
    uint128_t v97;  // 4183
    uint128_t v99;  // q1

    v0 = a1[2];
    v1 = a1[1];
    v2 = *a1;
    v3 = a1 + 3;
    v4 = v3[2];
    v5 = v3[1];
    v6 = *v3;
    v7 = a2 + 4;
    v8 = __dirty_unsupported_Iop_Reverse8sIn64_x2(*a0);
    v9 = __dirty_unsupported_Iop_Reverse8sIn64_x2(a2[1]);
    v10 = __dirty_unsupported_Iop_Reverse8sIn64_x2(a2[2]);
    v11 = __dirty_unsupported_Iop_Reverse8sIn64_x2(a2[3]);
    v12 = __dirty_unsupported_Iop_Reverse8sIn64_x2(*a2);
    v13 = __dirty_unsupported_Iop_SliceV128(v11, v11, 8);
    v14 = __dirty_unsupported_Iop_SliceV128(v10, v10, 8);
    v15 = __dirty_unsupported_Iop_SliceV128(v9, v9, 8);
    v16 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v2, (unsigned long long)v13);
    v17 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v2 >> 64), (unsigned long long)(v13 >> 64));
    v18 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v1, (unsigned long long)v13 ^ (unsigned long long)v11);
    v19 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v0, (unsigned long long)v14);
    v20 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v0 >> 64), (unsigned long long)(v14 >> 64));
    v21 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v1 >> 64), (unsigned long long)((v14 ^ v10) >> 64));
    v22 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v6, (unsigned long long)v15);
    v23 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v6 >> 64), (unsigned long long)(v15 >> 64));
    v24 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v5, (unsigned long long)v15 ^ (unsigned long long)v9);
    v25 = v22 ^ v19 ^ v16;
    v26 = v23 ^ v20 ^ v17;
    v27 = v24 ^ v21 ^ v18;
    v28 = a3 - 128;
    v29 = v7;
    v30 = v28;
    if (a3 >= 128)
    {
        do
        {
            i = v28;
            v32 = v8 ^ v12;
            v29 = v7 + 4;
            v33 = __dirty_unsupported_Iop_SliceV128(v32, v32, 8);
            v34 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v7[1]);
            v35 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v7[2]);
            v36 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v7[3]);
            v12 = __dirty_unsupported_Iop_Reverse8sIn64_x2(*v7);
            v37 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v4, (unsigned long long)v33);
            v38 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v4 >> 64), (unsigned long long)(v33 >> 64));
            v39 = __dirty_unsupported_Iop_SliceV128(v36, v36, 8);
            v40 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v5 >> 64), (unsigned long long)((v33 ^ v32) >> 64));
            v41 = v25 ^ v37;
            v42 = v26 ^ v38;
            v43 = __dirty_unsupported_Iop_SliceV128(v35, v35, 8);
            v44 = __dirty_unsupported_Iop_SliceV128(v34, v34, 8);
            v46 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v2, (unsigned long long)v39);
            v47 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v2 >> 64), (unsigned long long)(v39 >> 64));
            v48 = v42 ^ v41 ^ __dirty_unsupported_Iop_SliceV128(v42, v41, 8) ^ v27 ^ v40;
            v49 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v1, (unsigned long long)v39 ^ (unsigned long long)v36);
            v50 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v41, 0xc200000000000000);
            v51 = _INSERT(v42, 0, *(double *)&*(unsigned long long *)((void*)&v48 + 8));
            v53 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v0, (unsigned long long)v43);
            v54 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v0 >> 64), (unsigned long long)(v43 >> 64));
            v55 = v50 ^ _INSERT(v48, 8, (unsigned long long)v41);
            v56 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v1 >> 64), (unsigned long long)((v43 ^ v35) >> 64));
            v57 = __dirty_unsupported_Iop_SliceV128(v55, v55, 8);
            v58 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v55, 0xc200000000000000);
            v59 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v6, (unsigned long long)v44);
            v60 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v6 >> 64), (unsigned long long)(v44 >> 64));
            v61 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v5, (unsigned long long)v44 ^ (unsigned long long)v34);
            v25 = v59 ^ v53 ^ v46;
            v26 = v60 ^ v54 ^ v47;
            v8 = __dirty_unsupported_Iop_SliceV128(v51 ^ v57 ^ v58, v51 ^ v57 ^ v58, 8);
            v27 = v61 ^ v56 ^ v49;
            v30 = i - 64;
            v7 = v29;
            v28 = v30;
        } while (64 <= i);
    }
    v62 = v8 ^ v12;
    v63 = __dirty_unsupported_Iop_SliceV128(v62, v62, 8);
    v64 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v4, (unsigned long long)v63);
    v65 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v4 >> 64), (unsigned long long)(v63 >> 64));
    v66 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v5 >> 64), (unsigned long long)((v63 ^ v62) >> 64));
    v67 = v25 ^ v64;
    v68 = v26 ^ v65;
    v69 = v27 ^ v66;
    v70 = v30 + 64;
    v71 = arm64g_calculate_condition(2, v30, 64, 0);
    if (!(v71 & 1))
    {
        if (v70 >= 32)
        {
            v72 = arm64g_calculate_condition(4, v70, 32, 0);
            if (!(v72 & 1))
            {
                v74 = v68 ^ v67 ^ __dirty_unsupported_Iop_SliceV128(v68, v67, 8) ^ v69;
                v75 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v29[1]);
                v76 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v29[2]);
                v77 = __dirty_unsupported_Iop_Reverse8sIn64_x2(*v29);
                v78 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v67, 0xc200000000000000);
                v79 = _INSERT(v68, 0, *(double *)&*(unsigned long long *)((void*)&v74 + 8));
                v81 = __dirty_unsupported_Iop_SliceV128(v76, v76, 8);
                v82 = __dirty_unsupported_Iop_SliceV128(v75, v75, 8);
                v83 = v78 ^ _INSERT(v74, 8, (unsigned long long)v67);
                v84 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v2, (unsigned long long)v81);
                v85 = __dirty_unsupported_Iop_SliceV128(v83, v83, 8);
                v86 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v83, 0xc200000000000000);
                v87 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v2 >> 64), (unsigned long long)(v81 >> 64));
                v88 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v1, (unsigned long long)v81 ^ (unsigned long long)v76);
                v89 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v0, (unsigned long long)v82);
                v91 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v0 >> 64), (unsigned long long)(v82 >> 64));
                v92 = __dirty_unsupported_Iop_SliceV128(v79 ^ v85 ^ v86, v79 ^ v85 ^ v86, 8) ^ v77;
                v93 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v1 >> 64), (unsigned long long)((v82 ^ v75) >> 64));
                v94 = __dirty_unsupported_Iop_SliceV128(v92, v92, 8);
                v95 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v6, (unsigned long long)v94);
                v96 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v6 >> 64), (unsigned long long)(v94 >> 64));
                v97 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v5, (unsigned long long)v94 ^ (unsigned long long)v92);
                v67 = v89 ^ v84 ^ v95;
                v68 = v91 ^ v87 ^ v96;
                v69 = v93 ^ v88 ^ v97;
            }
            else
            {
                v99 = v68 ^ v67 ^ __dirty_unsupported_Iop_SliceV128(v68, v67, 8) ^ v69;
                v100 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v29[1]);
                v101 = __dirty_unsupported_Iop_Reverse8sIn64_x2(*v29);
                v102 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v67, 0xc200000000000000);
                v103 = _INSERT(v68, 0, *(double *)&*(unsigned long long *)((void*)&v99 + 8));
                v105 = __dirty_unsupported_Iop_SliceV128(v100, v100, 8);
                v106 = v102 ^ _INSERT(v99, 8, (unsigned long long)v67);
                v107 = __dirty_unsupported_Iop_SliceV128(v106, v106, 8);
                v108 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v106, 0xc200000000000000);
                v110 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v2, (unsigned long long)v105);
                v111 = __dirty_unsupported_Iop_SliceV128(v103 ^ v107 ^ v108, v103 ^ v107 ^ v108, 8) ^ v101;
                v112 = __dirty_unsupported_Iop_SliceV128(v111, v111, 8);
                v113 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v2 >> 64), (unsigned long long)(v105 >> 64));
                v114 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v1, (unsigned long long)v105 ^ (unsigned long long)v100);
                v115 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v0, (unsigned long long)v112);
                v116 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v0 >> 64), (unsigned long long)(v112 >> 64));
                v117 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v1 >> 64), (unsigned long long)((v112 ^ v111) >> 64));
                v67 = v110 ^ v115;
                v68 = v113 ^ v116;
                v69 = v114 ^ v117;
            }
        }
        else
        {
            v119 = v68 ^ v67 ^ __dirty_unsupported_Iop_SliceV128(v68, v67, 8) ^ v69;
            v120 = __dirty_unsupported_Iop_Reverse8sIn64_x2(*v29);
            v121 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v67, 0xc200000000000000);
            v122 = _INSERT(v68, 0, *(double *)&*(unsigned long long *)((void*)&v119 + 8));
            v124 = v121 ^ _INSERT(v119, 8, (unsigned long long)v67);
            v125 = __dirty_unsupported_Iop_SliceV128(v124, v124, 8);
            v126 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v124, 0xc200000000000000);
            v128 = __dirty_unsupported_Iop_SliceV128(v122 ^ v125 ^ v126, v122 ^ v125 ^ v126, 8) ^ v120;
            v129 = __dirty_unsupported_Iop_SliceV128(v128, v128, 8);
            v67 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v2, (unsigned long long)v129);
            v68 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v2 >> 64), (unsigned long long)(v129 >> 64));
            v69 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v1, (unsigned long long)v129 ^ (unsigned long long)v128);
        }
    }
    v131 = v68 ^ v67 ^ __dirty_unsupported_Iop_SliceV128(v68, v67, 8) ^ v69;
    v132 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v67, 0xc200000000000000);
    v133 = _INSERT(v68, 0, *(double *)&*(unsigned long long *)((void*)&v131 + 8));
    v135 = v132 ^ _INSERT(v131, 8, (unsigned long long)v67);
    v136 = __dirty_unsupported_Iop_SliceV128(v135, v135, 8);
    v137 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v135, 0xc200000000000000);
    v139 = __dirty_unsupported_Iop_Reverse8sIn64_x2(__dirty_unsupported_Iop_SliceV128(v133 ^ v136 ^ v137, v133 ^ v136 ^ v137, 8));
    *a0 = v139;
    return *(unsigned long long *)&v139;
}
