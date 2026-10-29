/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6587c..0xa65f18 (1692 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6587c_0 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
    unsigned int field_10;
    unsigned int field_14;
    unsigned int field_18;
    unsigned int field_1c;
    unsigned int field_20;
    unsigned int field_24;
    unsigned int field_28;
    unsigned int field_2c;
    unsigned int field_30;
    unsigned int field_34;
    unsigned int field_38;
    unsigned int field_3c;
    unsigned int field_40;
    unsigned int field_44;
    unsigned int field_48;
    unsigned int field_4c;
    unsigned int field_50;
    unsigned int field_54;
    unsigned int field_58;
    unsigned int field_5c;
    unsigned int field_60;
    unsigned int field_64;
    unsigned int field_68;
    unsigned int field_6c;
    unsigned int field_70;
    unsigned int field_74;
    unsigned int field_78;
    unsigned int field_7c;
    unsigned int field_80;
    unsigned int field_84;
    unsigned int field_88;
    unsigned int field_8c;
    unsigned int field_90;
    unsigned int field_94;
    unsigned int field_98;
    unsigned int field_9c;
    unsigned int field_a0;
    unsigned int field_a4;
    unsigned int field_a8;
    unsigned int field_ac;
    unsigned int field_b0;
    unsigned int field_b4;
    unsigned int field_b8;
    unsigned int field_bc;
    unsigned int field_c0;
    unsigned int field_c4;
    unsigned int field_c8;
    unsigned int field_cc;
} st_a6587c_0;


unsigned long long * sub_a6587c(unsigned long long *a0, st_a6587c_0 *a1)
{
    unsigned long long v0;  // x9
    unsigned int v1;  // w10
    unsigned short v10;  // x14
    unsigned int v100;  // w10
    unsigned long long v101;  // x15
    unsigned short v102;  // x10
    unsigned short v103;  // x11
    unsigned short v104;  // x9
    unsigned int v105;  // w11
    unsigned int v106;  // w12
    unsigned long long v107;  // x13
    unsigned short v108;  // x12
    unsigned short v109;  // x14
    unsigned long long v11;  // x13
    unsigned int v110;  // w13
    unsigned long long v111;  // x16
    unsigned short v112;  // x13
    unsigned short v113;  // x14
    unsigned int v114;  // w14
    unsigned long long v115;  // x16
    unsigned int v116;  // w14
    unsigned int v117;  // w15
    unsigned short v118;  // x13
    unsigned int v119;  // w10
    unsigned long v12;  // x14
    unsigned long long v120;  // x15
    unsigned short v121;  // x10
    unsigned short v122;  // x11
    unsigned int v123;  // w9
    unsigned short v124;  // x11
    unsigned int v125;  // w12
    unsigned long long v126;  // x13
    unsigned short v127;  // x12
    unsigned short v128;  // x14
    unsigned int v129;  // w13
    unsigned long v13;  // x15
    unsigned long long v130;  // x16
    unsigned int v131;  // w13
    unsigned int v132;  // w14
    unsigned int v133;  // w14
    unsigned long long v134;  // x16
    unsigned int v135;  // w14
    unsigned int v136;  // w15
    unsigned int v137;  // w13
    unsigned int v138;  // w10
    unsigned long long v139;  // x15
    unsigned long long v14;  // x16
    unsigned short v140;  // x10
    unsigned short v141;  // x11
    unsigned short v142;  // x9
    unsigned int v143;  // w10
    unsigned int v144;  // w12
    unsigned long long v145;  // x13
    unsigned short v146;  // x12
    unsigned short v147;  // x14
    unsigned int v148;  // w13
    unsigned long long v149;  // x16
    unsigned int v15;  // w13
    unsigned short v150;  // x13
    unsigned short v151;  // x14
    unsigned int v152;  // w14
    unsigned long long v153;  // x16
    unsigned int v154;  // w14
    unsigned int v155;  // w15
    unsigned short v156;  // x13
    unsigned long long v157;  // x11
    unsigned long v158;  // x15
    unsigned short v159;  // x16
    unsigned int v16;  // w14
    unsigned long long v160;  // x17
    unsigned long long v161;  // x11
    unsigned long long v162;  // x15
    unsigned int v163;  // w12
    unsigned long long v164;  // x1
    unsigned short v165;  // x8
    unsigned short v166;  // x12
    unsigned long v167;  // x10
    unsigned long long v17;  // x14
    unsigned long long v18;  // x16
    unsigned int v19;  // w14
    unsigned long long v2;  // x15
    unsigned int v20;  // w15
    unsigned int v21;  // w13
    unsigned int v22;  // w10
    unsigned long long v23;  // x15
    unsigned short v24;  // x10
    unsigned short v25;  // x11
    unsigned short v26;  // x9
    unsigned int v27;  // w11
    unsigned int v28;  // w12
    unsigned long long v29;  // x13
    unsigned short v3;  // x10
    unsigned short v30;  // x12
    unsigned short v31;  // x14
    unsigned int v32;  // w13
    unsigned int v33;  // w14
    unsigned int v34;  // w15
    unsigned long long v35;  // x16
    unsigned short v36;  // x13
    unsigned short v37;  // x14
    unsigned int v38;  // w14
    unsigned long long v39;  // x16
    unsigned short v4;  // x13
    unsigned int v40;  // w14
    unsigned int v41;  // w15
    unsigned short v42;  // x13
    unsigned int v43;  // w10
    unsigned long long v44;  // x15
    unsigned short v45;  // x10
    unsigned short v46;  // x11
    unsigned int v47;  // w9
    unsigned short v48;  // x11
    unsigned int v49;  // w12
    unsigned int v5;  // w9
    unsigned long long v50;  // x13
    unsigned short v51;  // x12
    unsigned short v52;  // x14
    unsigned int v53;  // w13
    unsigned long long v54;  // x16
    unsigned int v55;  // w13
    unsigned int v56;  // w14
    unsigned int v57;  // w14
    unsigned long long v58;  // x16
    unsigned int v59;  // w14
    unsigned short v6;  // x11
    unsigned int v60;  // w15
    unsigned int v61;  // w13
    unsigned int v62;  // w10
    unsigned long long v63;  // x15
    unsigned short v64;  // x10
    unsigned short v65;  // x11
    unsigned short v66;  // x9
    unsigned int v67;  // w11
    unsigned int v68;  // w12
    unsigned long long v69;  // x13
    unsigned int v7;  // w12
    unsigned short v70;  // x12
    unsigned short v71;  // x14
    unsigned int v72;  // w13
    unsigned long long v73;  // x16
    unsigned short v74;  // x13
    unsigned short v75;  // x14
    unsigned int v76;  // w14
    unsigned long long v77;  // x16
    unsigned int v78;  // w14
    unsigned int v79;  // w15
    unsigned long long v8;  // x13
    unsigned short v80;  // x13
    unsigned int v81;  // w10
    unsigned long long v82;  // x15
    unsigned short v83;  // x10
    unsigned short v84;  // x11
    unsigned int v85;  // w9
    unsigned short v86;  // x11
    unsigned int v87;  // w12
    unsigned long long v88;  // x13
    unsigned short v89;  // x12
    unsigned short v9;  // x12
    unsigned short v90;  // x14
    unsigned int v91;  // w13
    unsigned long long v92;  // x16
    unsigned int v93;  // w13
    unsigned int v94;  // w14
    unsigned int v95;  // w14
    unsigned long long v96;  // x16
    unsigned int v97;  // w14
    unsigned int v98;  // w15
    unsigned int v99;  // w13

    v0 = *a0;
    v1 = ((unsigned int)v0 * 0 | (unsigned int)(v0 >> 16)) & 0xffff;
    v2 = v1 * a1->field_0;
    v3 = 1 - a1->field_0 - v1;
    v4 = (v2 & 0xffff) - (v2 >> 16) - ((v2 & 0xffff) - (v2 >> 16) >> 16);
    if (v2)
        v3 = v4;
    v5 = (unsigned int)v0 + a1->field_4;
    v6 = (unsigned short)(a0[1] >> 16) + (unsigned short)a1->field_8;
    v7 = (unsigned int)a0[1] & 0xffff;
    v8 = v7 * a1->field_c;
    v9 = 1 - a1->field_c - v7;
    v10 = (v8 & 0xffff) - (v8 >> 16) - ((v8 & 0xffff) - (v8 >> 16) >> 16);
    if (v8)
        v9 = v10;
    v11 = (v6 ^ v3) & 0xffff;
    v12 = a1->field_10;
    v13 = a1->field_14;
    v14 = (unsigned int)v11 * (unsigned int)v12;
    v15 = 1 - v12 - v11;
    v16 = (v14 & 0xffff) - (v14 >> 16) - ((v14 & 0xffff) - (v14 >> 16) >> 16);
    if (v14)
        v15 = v16;
    v17 = v15 + (v9 ^ v5) & 0xffff;
    v18 = (unsigned int)v17 * (unsigned int)v13;
    v19 = 1 - v13 - v17;
    v20 = (v18 & 0xffff) - (v18 >> 16) - ((v18 & 0xffff) - (v18 >> 16) >> 16);
    if (v18)
        v19 = v20;
    v21 = v19 + v15;
    v22 = (v19 ^ v3) & 0xffff;
    v23 = v22 * a1->field_18;
    v24 = 1 - a1->field_18 - v22;
    v25 = (v23 & 0xffff) - (v23 >> 16) - ((v23 & 0xffff) - (v23 >> 16) >> 16);
    if (v23)
        v24 = v25;
    v26 = ((unsigned short)v19 ^ v6) + (unsigned short)a1->field_1c;
    v27 = (v21 ^ v5) + a1->field_20;
    v28 = (v21 ^ v9) & 0xffff;
    v29 = v28 * a1->field_24;
    v30 = 1 - a1->field_24 - v28;
    v31 = (v29 & 0xffff) - (v29 >> 16) - ((v29 & 0xffff) - (v29 >> 16) >> 16);
    if (v29)
        v30 = v31;
    v32 = (v27 ^ v24) & 0xffff;
    v33 = a1->field_28;
    v34 = a1->field_2c;
    v35 = v32 * v33;
    v36 = 1 - v33 - v32;
    v37 = (v35 & 0xffff) - (v35 >> 16) - ((v35 & 0xffff) - (v35 >> 16) >> 16);
    if (v35)
        v36 = v37;
    v38 = v36 + (v30 ^ v26) & 0xffff;
    v39 = v38 * v34;
    v40 = 1 - v34 - v38;
    v41 = (v39 & 0xffff) - (v39 >> 16) - ((v39 & 0xffff) - (v39 >> 16) >> 16);
    if (v39)
        v40 = v41;
    v42 = (unsigned short)v40 + v36;
    v43 = (v40 ^ v24) & 0xffff;
    v44 = v43 * a1->field_30;
    v45 = 1 - a1->field_30 - v43;
    v46 = (v44 & 0xffff) - (v44 >> 16) - ((v44 & 0xffff) - (v44 >> 16) >> 16);
    if (v44)
        v45 = v46;
    v47 = (v40 ^ v27) + a1->field_34;
    v48 = (v42 ^ v26) + (unsigned short)a1->field_38;
    v49 = (v42 ^ v30) & 0xffff;
    v50 = v49 * a1->field_3c;
    v51 = 1 - a1->field_3c - v49;
    v52 = (v50 & 0xffff) - (v50 >> 16) - ((v50 & 0xffff) - (v50 >> 16) >> 16);
    if (v50)
        v51 = v52;
    v53 = (v48 ^ v45) & 0xffff;
    v54 = v53 * a1->field_40;
    v55 = 1 - a1->field_40 - v53;
    v56 = (v54 & 0xffff) - (v54 >> 16) - ((v54 & 0xffff) - (v54 >> 16) >> 16);
    if (v54)
        v55 = v56;
    v57 = v55 + (v51 ^ v47) & 0xffff;
    v58 = v57 * a1->field_44;
    v59 = 1 - a1->field_44 - v57;
    v60 = (v58 & 0xffff) - (v58 >> 16) - ((v58 & 0xffff) - (v58 >> 16) >> 16);
    if (v58)
        v59 = v60;
    v61 = v59 + v55;
    v62 = (v59 ^ v45) & 0xffff;
    v63 = v62 * a1->field_48;
    v64 = 1 - a1->field_48 - v62;
    v65 = (v63 & 0xffff) - (v63 >> 16) - ((v63 & 0xffff) - (v63 >> 16) >> 16);
    if (v63)
        v64 = v65;
    v66 = ((unsigned short)v59 ^ v48) + (unsigned short)a1->field_4c;
    v67 = (v61 ^ v47) + a1->field_50;
    v68 = (v61 ^ v51) & 0xffff;
    v69 = v68 * a1->field_54;
    v70 = 1 - a1->field_54 - v68;
    v71 = (v69 & 0xffff) - (v69 >> 16) - ((v69 & 0xffff) - (v69 >> 16) >> 16);
    if (v69)
        v70 = v71;
    v72 = (v67 ^ v64) & 0xffff;
    v73 = v72 * a1->field_58;
    v74 = 1 - a1->field_58 - v72;
    v75 = (v73 & 0xffff) - (v73 >> 16) - ((v73 & 0xffff) - (v73 >> 16) >> 16);
    if (v73)
        v74 = v75;
    v76 = v74 + (v70 ^ v66) & 0xffff;
    v77 = v76 * a1->field_5c;
    v78 = 1 - a1->field_5c - v76;
    v79 = (v77 & 0xffff) - (v77 >> 16) - ((v77 & 0xffff) - (v77 >> 16) >> 16);
    if (v77)
        v78 = v79;
    v80 = (unsigned short)v78 + v74;
    v81 = (v78 ^ v64) & 0xffff;
    v82 = v81 * a1->field_60;
    v83 = 1 - a1->field_60 - v81;
    v84 = (v82 & 0xffff) - (v82 >> 16) - ((v82 & 0xffff) - (v82 >> 16) >> 16);
    if (v82)
        v83 = v84;
    v85 = (v78 ^ v67) + a1->field_64;
    v86 = (v80 ^ v66) + (unsigned short)a1->field_68;
    v87 = (v80 ^ v70) & 0xffff;
    v88 = v87 * a1->field_6c;
    v89 = 1 - a1->field_6c - v87;
    v90 = (v88 & 0xffff) - (v88 >> 16) - ((v88 & 0xffff) - (v88 >> 16) >> 16);
    if (v88)
        v89 = v90;
    v91 = (v86 ^ v83) & 0xffff;
    v92 = v91 * a1->field_70;
    v93 = 1 - a1->field_70 - v91;
    v94 = (v92 & 0xffff) - (v92 >> 16) - ((v92 & 0xffff) - (v92 >> 16) >> 16);
    if (v92)
        v93 = v94;
    v95 = v93 + (v89 ^ v85) & 0xffff;
    v96 = v95 * a1->field_74;
    v97 = 1 - a1->field_74 - v95;
    v98 = (v96 & 0xffff) - (v96 >> 16) - ((v96 & 0xffff) - (v96 >> 16) >> 16);
    if (v96)
        v97 = v98;
    v99 = v97 + v93;
    v100 = (v97 ^ v83) & 0xffff;
    v101 = v100 * a1->field_78;
    v102 = 1 - a1->field_78 - v100;
    v103 = (v101 & 0xffff) - (v101 >> 16) - ((v101 & 0xffff) - (v101 >> 16) >> 16);
    if (v101)
        v102 = v103;
    v104 = ((unsigned short)v97 ^ v86) + (unsigned short)a1->field_7c;
    v105 = (v99 ^ v85) + a1->field_80;
    v106 = (v99 ^ v89) & 0xffff;
    v107 = v106 * a1->field_84;
    v108 = 1 - a1->field_84 - v106;
    v109 = (v107 & 0xffff) - (v107 >> 16) - ((v107 & 0xffff) - (v107 >> 16) >> 16);
    if (v107)
        v108 = v109;
    v110 = (v105 ^ v102) & 0xffff;
    v111 = v110 * a1->field_88;
    v112 = 1 - a1->field_88 - v110;
    v113 = (v111 & 0xffff) - (v111 >> 16) - ((v111 & 0xffff) - (v111 >> 16) >> 16);
    if (v111)
        v112 = v113;
    v114 = v112 + (v108 ^ v104) & 0xffff;
    v115 = v114 * a1->field_8c;
    v116 = 1 - a1->field_8c - v114;
    v117 = (v115 & 0xffff) - (v115 >> 16) - ((v115 & 0xffff) - (v115 >> 16) >> 16);
    if (v115)
        v116 = v117;
    v118 = (unsigned short)v116 + v112;
    v119 = (v116 ^ v102) & 0xffff;
    v120 = v119 * a1->field_90;
    v121 = 1 - a1->field_90 - v119;
    v122 = (v120 & 0xffff) - (v120 >> 16) - ((v120 & 0xffff) - (v120 >> 16) >> 16);
    if (v120)
        v121 = v122;
    v123 = (v116 ^ v105) + a1->field_94;
    v124 = (v118 ^ v104) + (unsigned short)a1->field_98;
    v125 = (v118 ^ v108) & 0xffff;
    v126 = v125 * a1->field_9c;
    v127 = 1 - a1->field_9c - v125;
    v128 = (v126 & 0xffff) - (v126 >> 16) - ((v126 & 0xffff) - (v126 >> 16) >> 16);
    if (v126)
        v127 = v128;
    v129 = (v124 ^ v121) & 0xffff;
    v130 = v129 * a1->field_a0;
    v131 = 1 - a1->field_a0 - v129;
    v132 = (v130 & 0xffff) - (v130 >> 16) - ((v130 & 0xffff) - (v130 >> 16) >> 16);
    if (v130)
        v131 = v132;
    v133 = v131 + (v127 ^ v123) & 0xffff;
    v134 = v133 * a1->field_a4;
    v135 = 1 - a1->field_a4 - v133;
    v136 = (v134 & 0xffff) - (v134 >> 16) - ((v134 & 0xffff) - (v134 >> 16) >> 16);
    if (v134)
        v135 = v136;
    v137 = v135 + v131;
    v138 = (v135 ^ v121) & 0xffff;
    v139 = v138 * a1->field_a8;
    v140 = 1 - a1->field_a8 - v138;
    v141 = (v139 & 0xffff) - (v139 >> 16) - ((v139 & 0xffff) - (v139 >> 16) >> 16);
    if (v139)
        v140 = v141;
    v142 = ((unsigned short)v135 ^ v124) + (unsigned short)a1->field_ac;
    v143 = (v137 ^ v123) + a1->field_b0;
    v144 = (v137 ^ v127) & 0xffff;
    v145 = v144 * a1->field_b4;
    v146 = 1 - a1->field_b4 - v144;
    v147 = (v145 & 0xffff) - (v145 >> 16) - ((v145 & 0xffff) - (v145 >> 16) >> 16);
    if (v145)
        v146 = v147;
    v148 = (v143 ^ v140) & 0xffff;
    v149 = v148 * a1->field_b8;
    v150 = 1 - a1->field_b8 - v148;
    v151 = (v149 & 0xffff) - (v149 >> 16) - ((v149 & 0xffff) - (v149 >> 16) >> 16);
    if (v149)
        v150 = v151;
    v152 = v150 + (v146 ^ v142) & 0xffff;
    v153 = v152 * a1->field_bc;
    v154 = 1 - a1->field_bc - v152;
    v155 = (v153 & 0xffff) - (v153 >> 16) - ((v153 & 0xffff) - (v153 >> 16) >> 16);
    if (v153)
        v154 = v155;
    v156 = (unsigned short)v154 + v150;
    v157 = (v154 ^ v140) & 0xffff;
    v158 = a1->field_c0;
    v159 = a1->field_c4;
    v160 = (unsigned int)v157 * (unsigned int)v158;
    v161 = 1 - v158 - v157;
    v162 = (v160 & 0xffff) - (v160 >> 16) - ((v160 & 0xffff) - (v160 >> 16) >> 16);
    if (v160)
        v161 = v162;
    v163 = (v156 ^ v146) & 0xffff;
    v164 = v163 * a1->field_cc;
    v165 = 1 - a1->field_cc - v163;
    v166 = (v164 & 0xffff) - (v164 >> 16) - ((v164 & 0xffff) - (v164 >> 16) >> 16);
    if (v164)
        v165 = v166;
    v167 = ((v154 ^ v143) + a1->field_c8) * 0x10000;
    *a0 = (v156 ^ v142) + v159 & 0xffff & 0xffffffff00000000 | ((v156 ^ v142) + v159 & 0xffff & 0xffffffff0000ffff | (v161 * 0x10000 | v161 >> 48) & 0xffff0000) & 0xffffffff;
    a0[1] = v167 & 0xffff0000 | (v167 & 0xffff0000 | v165) & 0xffff;
    return a0;
}
