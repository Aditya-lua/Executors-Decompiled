/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2c3e0..0xb2cbbc (2012 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2c3e0_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
    unsigned long long field_38;
    unsigned long long field_40;
    unsigned long long field_48;
    unsigned long long field_50;
    unsigned long long field_58;
    unsigned long long field_60;
    unsigned long long field_68;
    unsigned long long field_70;
    unsigned long long field_78;
} st_b2c3e0_0;

typedef struct st_b2c3e0_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[112];
    unsigned long long field_80;
    unsigned long long field_88;
    char padding_90[112];
    unsigned long long field_100;
    unsigned long long field_108;
    char padding_110[112];
    unsigned long long field_180;
    unsigned long long field_188;
    char padding_190[112];
    unsigned long long field_200;
    unsigned long long field_208;
    char padding_210[112];
    unsigned long long field_280;
    unsigned long long field_288;
    char padding_290[112];
    unsigned long long field_300;
    unsigned long long field_308;
    char padding_310[112];
    unsigned long long field_380;
    unsigned long long field_388;
} st_b2c3e0_1;


double sub_b2c3e0(uint128_t *a0, unsigned long a1, uint128_t *a2, long long a3)
{
    long long i;  // x8
    uint128_t *node;  // x9
    uint128_t v15;  // q3
    unsigned long long v105;  // x11
    unsigned long long v106;  // x13
    unsigned long long v107;  // x0
    unsigned long long v108;  // x14
    unsigned long long v109;  // x16
    unsigned long long v110;  // x11
    unsigned long long v111;  // x2
    unsigned long long v112;  // x4
    unsigned long v113;  // x5
    unsigned long v114;  // x6
    unsigned long long v115;  // x2
    unsigned long long v116;  // x20
    unsigned long long v117;  // x21
    unsigned long long v118;  // x21
    unsigned long long v119;  // x23
    unsigned long long v120;  // x17
    unsigned long long v121;  // x2
    unsigned long long v122;  // x13
    unsigned long long v123;  // x12
    unsigned long long v124;  // x4
    long long k;  // x8
    unsigned long long v125;  // x20
    unsigned long long v126;  // x5
    unsigned long long v127;  // x0
    unsigned long long v128;  // x3
    unsigned long long v129;  // x6
    unsigned long long v130;  // x15
    unsigned long long v131;  // x0
    unsigned long long v132;  // x7
    unsigned long long v133;  // x20
    unsigned long long v134;  // x4
    st_b2c3e0_0 *v18;  // x9
    unsigned long long v135;  // x21
    unsigned long long v136;  // x3
    unsigned long long v137;  // x1
    unsigned long long v138;  // x6
    unsigned long long v139;  // x5
    unsigned long long v140;  // x16
    unsigned long long v141;  // x7
    unsigned long long v142;  // x1
    unsigned long long v143;  // x20
    unsigned long long v144;  // x21
    unsigned long long v19;  // x10
    unsigned long long v145;  // x14
    unsigned long long v146;  // x4
    unsigned long long v147;  // x6
    unsigned long long v148;  // x1
    unsigned long long v149;  // x2
    unsigned long long v150;  // x11
    unsigned long long v151;  // x17
    unsigned long long v152;  // x4
    unsigned long long v153;  // x3
    unsigned long long v154;  // x2
    unsigned long long v20;  // x12
    unsigned long long v155;  // x11
    unsigned long long v156;  // x1
    unsigned long long v157;  // x11
    unsigned long long v158;  // x17
    unsigned long long v159;  // x13
    unsigned long long v160;  // x12
    unsigned long long v161;  // x15
    unsigned long long v162;  // x17
    unsigned long long v163;  // x13
    unsigned long long v164;  // x12
    unsigned long v21;  // x13
    long long m;  // x8
    uint128_t *v166;  // x10
    uint128_t v167;  // q0
    uint128_t v168;  // q1
    uint128_t *v169;  // x10
    uint128_t v170;  // q2
    uint128_t v171;  // q3
    unsigned long v22;  // x15
    unsigned long long v23;  // x16
    unsigned long long v24;  // x14
    uint128_t v7;  // q1
    unsigned long long v25;  // x10
    unsigned long long v26;  // x1
    unsigned long long v27;  // x11
    unsigned long long v28;  // x13
    unsigned long long v29;  // x12
    unsigned long long v30;  // x0
    unsigned long long v31;  // x17
    unsigned long long v32;  // x15
    unsigned long long v33;  // x16
    unsigned long long v34;  // x12
    uint128_t *v8;  // x10
    unsigned long long v35;  // x1
    unsigned long long v36;  // x3
    unsigned long v37;  // x4
    unsigned long v38;  // x2
    unsigned long long v39;  // x5
    unsigned long long v40;  // x1
    unsigned long long v41;  // x7
    unsigned long long v42;  // x20
    unsigned long long v43;  // x22
    unsigned long long v44;  // x14
    uint128_t v9;  // q3
    unsigned long long v45;  // x20
    unsigned long long v46;  // x4
    unsigned long long v47;  // x0
    unsigned long long v48;  // x17
    unsigned long long v49;  // x11
    unsigned long long v50;  // x10
    unsigned long long v51;  // x5
    unsigned long long v52;  // x3
    unsigned long long v53;  // x6
    unsigned long long v54;  // x7
    uint128_t *iter;  // x8
    unsigned long long v55;  // x2
    unsigned long long v56;  // x15
    unsigned long long v57;  // x13
    unsigned long long v58;  // x3
    unsigned long long v59;  // x20
    unsigned long long v60;  // x6
    unsigned long long v61;  // x4
    unsigned long long v62;  // x2
    unsigned long long v63;  // x7
    unsigned long long v64;  // x22
    uint128_t *iter1;  // x9
    unsigned long long v65;  // x3
    unsigned long long v66;  // x16
    unsigned long long v67;  // x20
    unsigned long long v68;  // x23
    unsigned long long v69;  // x1
    unsigned long long v70;  // x5
    unsigned long long v71;  // x12
    unsigned long long v72;  // x4
    unsigned long long v73;  // x0
    unsigned long long v74;  // x4
    long long j;  // x10
    unsigned long long v75;  // x14
    unsigned long long v76;  // x1
    unsigned long long v77;  // x17
    unsigned long long v78;  // x2
    unsigned long long v79;  // x4
    unsigned long long v80;  // x3
    unsigned long long v81;  // x14
    unsigned long long v82;  // x5
    unsigned long long v83;  // x15
    unsigned long long v84;  // x11
    long long v13;  // x10
    unsigned long long v85;  // x14
    unsigned long long v86;  // x10
    unsigned long long v87;  // x13
    unsigned long long v88;  // x15
    unsigned long long v89;  // x11
    unsigned long long v90;  // x10
    long long l;  // x8
    st_b2c3e0_1 *v92;  // x10
    unsigned long long v93;  // x11
    unsigned long long v94;  // x13
    uint128_t v14;  // q1
    unsigned long v95;  // x14
    unsigned long v96;  // x16
    unsigned long long v97;  // x11
    unsigned long long v98;  // x17
    unsigned long long v99;  // x12
    unsigned long long v100;  // x12
    unsigned long long v101;  // x15
    unsigned long long v102;  // x3
    unsigned long long v103;  // x4
    unsigned long long v104;  // x1
    uint128_t v0;  // [bp-0x850]
    char v2;  // [bp-0x450]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    _memcpy(&v2);
    i = 0;
    node = a0 + 1;
    do
    {
        v7 = *node;
        v8 = &(&v2)[i];
        v9 = v8[1];
        *v8 = *(int128_t *)((char *)node - 16) ^ *v8;
        v8[1] = v7 ^ v9;
        node += 2;
        i += 32;
    } while (i != 0x400);
    _memcpy(&v0, &v2, 0x400);
    if (a3)
    {
        iter = a2 + 1;
        iter1 = &v0 + 1;
        j = 128;
        do
        {
            v13 = j;
            v14 = *iter;
            v15 = *iter1;
            *(int128_t *)((char *)iter1 - 16) = *(int128_t *)((char *)iter - 16) ^ *(int128_t *)((char *)iter1 - 16);
            *iter1 = v14 ^ v15;
            iter += 2;
            iter1 += 2;
            j = v13 - 4;
        } while (j);
    }
    k = 0;
    do
    {
        v18 = &(&v2)[k];
        v19 = v18->field_0;
        v20 = v18->field_8;
        v21 = v18->field_20;
        v22 = v18->field_28;
        v23 = v21 + v19 + (v21 & 0xffffffff) * ((v19 * 2 | v19 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v24 = __ROL__(v23 ^ v18->field_60, 32);
        v25 = v18->field_40;
        v26 = v18->field_48;
        v27 = v24 + v25 + (v24 & 0xffffffff) * ((v25 * 2 | v25 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v28 = __ROL__(v27 ^ v21, 40);
        v29 = v22 + v20 + (v22 & 0xffffffff) * ((v20 * 2 | v20 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v30 = __ROL__(v29 ^ v18->field_68, 32);
        v31 = v30 + v26 + (v30 & 0xffffffff) * ((v26 * 2 | v26 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v32 = __ROL__(v31 ^ v22, 40);
        v33 = v28 + v23 + (v28 & 0xffffffff) * ((v23 * 2 | v23 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v34 = v32 + v29 + (v32 & 0xffffffff) * ((v29 * 2 | v29 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v35 = v18->field_10;
        v36 = v18->field_18;
        v37 = v18->field_30;
        v38 = v18->field_38;
        v39 = v37 + v35 + (v37 & 0xffffffff) * ((v35 * 2 | v35 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v40 = __ROL__(v33 ^ v24, 48);
        v41 = __ROL__(v39 ^ v18->field_70, 32);
        v42 = v18->field_50;
        v43 = v18->field_58;
        v44 = __ROL__(v34 ^ v30, 48);
        v45 = v41 + v42 + (v41 & 0xffffffff) * ((v42 * 2 | v42 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v46 = __ROL__(v45 ^ v37, 40);
        v47 = v46 + v39 + (v46 & 0xffffffff) * ((v39 * 2 | v39 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v48 = v40 + v27 + (v40 & 0xffffffff) * ((v27 * 2 | v27 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v49 = __ROL__(v47 ^ v41, 48);
        v50 = v44 + v31 + (v44 & 0xffffffff) * ((v31 * 2 | v31 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v51 = v49 + v45 + (v49 & 0xffffffff) * ((v45 * 2 | v45 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v52 = v38 + v36 + (v38 & 0xffffffff) * ((v36 * 2 | v36 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v53 = __ROL__(v52 ^ v18->field_78, 32);
        v54 = v53 + v43 + (v53 & 0xffffffff) * ((v43 * 2 | v43 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v55 = __ROL__(v54 ^ v38, 40);
        v56 = v55 + v52 + (v55 & 0xffffffff) * ((v52 * 2 | v52 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v57 = __ROL__(v48 ^ v28, 1);
        v58 = __ROL__(v56 ^ v53, 48);
        v59 = __ROL__(v50 ^ v32, 1);
        v60 = v58 + v54 + (v58 & 0xffffffff) * ((v54 * 2 | v54 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v61 = __ROL__(v51 ^ v46, 1);
        v62 = __ROL__(v60 ^ v55, 1);
        v63 = v59 + v33 + (v59 & 0xffffffff) * ((v33 * 2 | v33 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v64 = __ROL__(v58 ^ v63, 32);
        v65 = v64 + v51 + (v64 & 0xffffffff) * ((v51 * 2 | v51 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v66 = __ROL__(v65 ^ v59, 40);
        v67 = v61 + v34 + (v61 & 0xffffffff) * ((v34 * 2 | v34 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v68 = __ROL__(v67 ^ v40, 32);
        v69 = v66 + v63 + (v66 & 0xffffffff) * ((v63 * 2 | v63 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v70 = v60 + v68 + (v60 & 0xffffffff) * ((v68 * 2 | v68 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v71 = __ROL__(v70 ^ v61, 40);
        v72 = v71 + v67 + (v71 & 0xffffffff) * ((v67 * 2 | v67 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v18->field_0 = v69;
        v18->field_8 = v72;
        v73 = __ROL__(v69 ^ v64, 48);
        v74 = v62 + v47 + (v62 & 0xffffffff) * ((v47 * 2 | v47 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v75 = __ROL__(v74 ^ v44, 32);
        v76 = __ROL__(v72 ^ v68, 48);
        v77 = v75 + v48 + (v75 & 0xffffffff) * ((v48 * 2 | v48 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v78 = __ROL__(v77 ^ v62, 40);
        v79 = v78 + v74 + (v78 & 0xffffffff) * ((v74 * 2 | v74 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v80 = v73 + v65 + (v73 & 0xffffffff) * ((v65 * 2 | v65 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v81 = __ROL__(v79 ^ v75, 48);
        v18->field_60 = v76;
        v18->field_68 = v81;
        v82 = v76 + v70 + (v76 & 0xffffffff) * ((v70 * 2 | v70 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v83 = v56 + v57 + (v56 & 0xffffffff) * ((v57 * 2 | v57 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v84 = __ROL__(v83 ^ v49, 32);
        v18->field_50 = v80;
        v18->field_58 = v82;
        v85 = v81 + v77 + (v81 & 0xffffffff) * ((v77 * 2 | v77 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v86 = v84 + v50 + (v84 & 0xffffffff) * ((v50 * 2 | v50 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v87 = __ROL__(v86 ^ v57, 40);
        v88 = v87 + v83 + (v87 & 0xffffffff) * ((v83 * 2 | v83 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v18->field_10 = v79;
        v18->field_18 = v88;
        v89 = __ROL__(v88 ^ v84, 48);
        v18->field_70 = v89;
        v18->field_78 = v73;
        v90 = v89 + v86 + (v89 & 0xffffffff) * ((v86 * 2 | v86 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v18->field_40 = v85;
        v18->field_48 = v90;
        v18->field_30 = __ROL__(v82 ^ v71, 1);
        v18->field_38 = __ROL__(v85 ^ v78, 1);
        v18->field_20 = __ROL__(v90 ^ v87, 1);
        v18->field_28 = __ROL__(v80 ^ v66, 1);
        k += 128;
    } while (k != 0x400);
    l = 0;
    do
    {
        v92 = &(&v2)[l];
        v93 = v92->field_0;
        v94 = v92->field_8;
        v95 = v92->field_100;
        v96 = v92->field_108;
        v97 = v95 + v93 + (v95 & 0xffffffff) * ((v93 * 2 | v93 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v98 = __ROL__(v97 ^ v92->field_300, 32);
        v99 = v92->field_200;
        v100 = v98 + v99 + (v98 & 0xffffffff) * ((v99 * 2 | v99 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v101 = __ROL__(v100 ^ v95, 40);
        v102 = v96 + v94 + (v96 & 0xffffffff) * ((v94 * 2 | v94 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v103 = __ROL__(v102 ^ v92->field_308, 32);
        v104 = v101 + v97 + (v101 & 0xffffffff) * ((v97 * 2 | v97 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v105 = v92->field_208;
        v106 = v103 + v105 + (v103 & 0xffffffff) * ((v105 * 2 | v105 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v107 = __ROL__(v106 ^ v96, 40);
        v108 = __ROL__(v104 ^ v98, 48);
        v109 = v107 + v102 + (v107 & 0xffffffff) * ((v102 * 2 | v102 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v110 = __ROL__(v109 ^ v103, 48);
        v111 = v92->field_80;
        v112 = v92->field_88;
        v113 = v92->field_180;
        v114 = v92->field_188;
        v115 = v113 + v111 + (v113 & 0xffffffff) * ((v111 * 2 | v111 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v116 = __ROL__(v115 ^ v92->field_380, 32);
        v117 = v92->field_280;
        v118 = v116 + v117 + (v116 & 0xffffffff) * ((v117 * 2 | v117 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v119 = __ROL__(v118 ^ v113, 40);
        v120 = v108 + v100 + (v108 & 0xffffffff) * ((v100 * 2 | v100 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v121 = v119 + v115 + (v119 & 0xffffffff) * ((v115 * 2 | v115 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v122 = __ROL__(v121 ^ v116, 48);
        v123 = v110 + v106 + (v110 & 0xffffffff) * ((v106 * 2 | v106 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v124 = v114 + v112 + (v114 & 0xffffffff) * ((v112 * 2 | v112 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v125 = __ROL__(v124 ^ v92->field_388, 32);
        v126 = v122 + v118 + (v122 & 0xffffffff) * ((v118 * 2 | v118 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v127 = v92->field_288;
        v128 = v125 + v127 + (v125 & 0xffffffff) * ((v127 * 2 | v127 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v129 = __ROL__(v128 ^ v114, 40);
        v130 = __ROL__(v120 ^ v101, 1);
        v131 = v129 + v124 + (v129 & 0xffffffff) * ((v124 * 2 | v124 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v132 = __ROL__(v123 ^ v107, 1);
        v133 = __ROL__(v131 ^ v125, 48);
        v134 = __ROL__(v126 ^ v119, 1);
        v135 = v133 + v128 + (v133 & 0xffffffff) * ((v128 * 2 | v128 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v136 = __ROL__(v135 ^ v129, 1);
        v137 = v132 + v104 + (v132 & 0xffffffff) * ((v104 * 2 | v104 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v138 = __ROL__(v133 ^ v137, 32);
        v139 = v138 + v126 + (v138 & 0xffffffff) * ((v126 * 2 | v126 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v140 = __ROL__(v139 ^ v132, 40);
        v141 = v134 + v109 + (v134 & 0xffffffff) * ((v109 * 2 | v109 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v142 = v140 + v137 + (v140 & 0xffffffff) * ((v137 * 2 | v137 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v143 = __ROL__(v141 ^ v108, 32);
        v144 = v135 + v143 + (v135 & 0xffffffff) * ((v143 * 2 | v143 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v145 = __ROL__(v144 ^ v134, 40);
        v146 = __ROL__(v142 ^ v138, 48);
        v147 = v145 + v141 + (v145 & 0xffffffff) * ((v141 * 2 | v141 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v92->field_388 = v146;
        v92->field_0 = v142;
        v92->field_8 = v147;
        v148 = __ROL__(v147 ^ v143, 48);
        v92->field_300 = v148;
        v149 = v136 + v121 + (v136 & 0xffffffff) * ((v121 * 2 | v121 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v150 = __ROL__(v149 ^ v110, 32);
        v151 = v150 + v120 + (v150 & 0xffffffff) * ((v120 * 2 | v120 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v152 = v146 + v139 + (v146 & 0xffffffff) * ((v139 * 2 | v139 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v153 = __ROL__(v151 ^ v136, 40);
        v92->field_280 = v152;
        v154 = v153 + v149 + (v153 & 0xffffffff) * ((v149 * 2 | v149 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v155 = __ROL__(v154 ^ v150, 48);
        v156 = v148 + v144 + (v148 & 0xffffffff) * ((v144 * 2 | v144 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v92->field_308 = v155;
        v92->field_288 = v156;
        v157 = v155 + v151 + (v155 & 0xffffffff) * ((v151 * 2 | v151 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v158 = v131 + v130 + (v131 & 0xffffffff) * ((v130 * 2 | v130 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v159 = __ROL__(v158 ^ v122, 32);
        v92->field_200 = v157;
        v160 = v159 + v123 + (v159 & 0xffffffff) * ((v123 * 2 | v123 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v161 = __ROL__(v160 ^ v130, 40);
        v162 = v161 + v158 + (v161 & 0xffffffff) * ((v158 * 2 | v158 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v163 = __ROL__(v162 ^ v159, 48);
        v92->field_80 = v154;
        v92->field_88 = v162;
        v92->field_380 = v163;
        v164 = v163 + v160 + (v163 & 0xffffffff) * ((v160 * 2 | v160 >> 63) & 0x1fffffffe & 0x1ffffffff);
        v92->field_208 = v164;
        v92->field_180 = __ROL__(v156 ^ v145, 1);
        v92->field_188 = __ROL__(v157 ^ v153, 1);
        v92->field_100 = __ROL__(v164 ^ v161, 1);
        v92->field_108 = __ROL__(v152 ^ v140, 1);
        l += 16;
    } while (l != 128);
    _memcpy(a2, &v0, 0x400);
    m = 0;
    do
    {
        v166 = &(&v2)[m];
        v167 = *v166;
        v168 = v166[1];
        v169 = (char *)a2 + m;
        v170 = *v169;
        v171 = v169[1];
        *v169 = v167 ^ v170;
        v169[1] = v168 ^ v171;
        m += 32;
    } while (m != 0x400);
    return (unsigned long long)(v167 ^ v170);
}
