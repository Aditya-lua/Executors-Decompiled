/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac0d40..0xac1b80 (3648 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ac0d40_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
    unsigned long long field_38;
} st_ac0d40_0;

extern char g_df8380;
extern unsigned int g_f0d568;

st_ac0d40_0 * sub_ac0d40(st_ac0d40_0 *a0, unsigned long long *i, unsigned long a2)
{
    unsigned long long v21;  // x30
    unsigned long long v22;  // x19
    unsigned long long v31;  // x28
    unsigned long long v121;  // x2
    unsigned long long v122;  // x21
    unsigned long long v123;  // x28
    unsigned long v124;  // x20
    unsigned long long v125;  // x24
    unsigned int v126;  // x19
    unsigned long long v127;  // x20
    unsigned long long v128;  // x3
    unsigned long long v129;  // x8
    unsigned long v130;  // x19
    unsigned long long v32;  // x20
    unsigned long v131;  // x27
    unsigned long long v132;  // x23
    unsigned long long v133;  // x27
    unsigned long long v134;  // x4
    unsigned long long v135;  // x9
    unsigned long v136;  // x28
    unsigned long v137;  // x26
    unsigned long long v138;  // x22
    unsigned long long v139;  // x26
    unsigned long long v140;  // x5
    unsigned long long v33;  // x21
    unsigned long long v141;  // x10
    unsigned long v142;  // x19
    unsigned long v143;  // x25
    unsigned long long v144;  // x21
    unsigned long long v145;  // x25
    unsigned long long v146;  // x6
    unsigned long long v147;  // x11
    unsigned long v148;  // x28
    unsigned long v149;  // x24
    unsigned long long v150;  // x20
    unsigned long long v34;  // x22
    unsigned long long v151;  // x24
    unsigned long long v152;  // x7
    unsigned long long v153;  // x12
    unsigned long v154;  // x19
    unsigned long v155;  // x23
    unsigned long long v156;  // x27
    unsigned long long v157;  // x23
    unsigned long long v158;  // x8
    unsigned long long v159;  // x13
    unsigned long v160;  // x28
    unsigned long long v35;  // x23
    unsigned long v161;  // x22
    unsigned long long v162;  // x26
    unsigned long long v163;  // x22
    unsigned long long v164;  // x9
    unsigned long long v165;  // x14
    unsigned long v166;  // x19
    unsigned long v167;  // x21
    unsigned long long v168;  // x25
    unsigned long long v169;  // x21
    unsigned long long v170;  // x10
    unsigned long long v36;  // x24
    unsigned long long v171;  // x15
    unsigned long v172;  // x28
    unsigned long v173;  // x20
    unsigned long long v174;  // x24
    unsigned long long v175;  // x20
    unsigned long long v176;  // x0
    unsigned long v177;  // x19
    unsigned long v178;  // x27
    unsigned long long v179;  // x23
    unsigned long long v180;  // x27
    unsigned long long v37;  // x25
    unsigned long long v181;  // x1
    unsigned long v182;  // x28
    unsigned long v183;  // x26
    unsigned long long v184;  // x22
    unsigned long long v185;  // x26
    unsigned long long v186;  // x2
    unsigned long v187;  // x19
    unsigned long v188;  // x25
    unsigned long long v189;  // x21
    unsigned long long v190;  // x25
    unsigned long long v38;  // x26
    unsigned long long v191;  // x3
    unsigned long v192;  // x28
    unsigned long v193;  // x24
    unsigned long long v194;  // x20
    unsigned long long v195;  // x24
    unsigned long v196;  // x19
    unsigned long v197;  // x23
    unsigned long v198;  // x28
    unsigned long v199;  // x22
    unsigned long v200;  // x19
    unsigned long long v39;  // x27
    unsigned long v201;  // x21
    unsigned long v202;  // x20
    unsigned long long v203;  // x7
    unsigned long long v204;  // x8
    unsigned long long v205;  // x9
    unsigned long long v206;  // x10
    unsigned long long *v40;  // x1
    unsigned long long v23;  // x20
    unsigned long long v41;  // x3
    unsigned long v42;  // x19
    unsigned long v43;  // x27
    unsigned long long v44;  // x23
    unsigned long long v45;  // x4
    unsigned long long *v46;  // x1
    unsigned long long v47;  // x27
    unsigned long v48;  // x28
    unsigned long v49;  // x26
    unsigned long long v50;  // x22
    unsigned long long v24;  // x21
    unsigned long long v51;  // x5
    unsigned long long v52;  // x26
    unsigned long v53;  // x19
    unsigned long v54;  // x25
    unsigned long long v55;  // x21
    unsigned long long v56;  // x6
    unsigned long long *v57;  // x1
    unsigned long long v58;  // x25
    unsigned long v59;  // x28
    unsigned long v60;  // x24
    unsigned long long v25;  // x22
    unsigned long long v61;  // x20
    unsigned long long v62;  // x7
    unsigned long long v63;  // x24
    unsigned long v64;  // x19
    unsigned long v65;  // x23
    unsigned long long v66;  // x27
    unsigned long long v67;  // x8
    unsigned long long *v68;  // x1
    unsigned long long v69;  // x23
    unsigned long v70;  // x28
    unsigned long long v26;  // x23
    unsigned long v71;  // x22
    unsigned long long v72;  // x26
    unsigned long long v73;  // x9
    unsigned long long v74;  // x22
    unsigned long v75;  // x19
    unsigned long v76;  // x21
    unsigned long long v77;  // x25
    unsigned long long v78;  // x10
    unsigned long long *v79;  // x1
    unsigned long long v80;  // x21
    unsigned long long v27;  // x24
    unsigned long v81;  // x28
    unsigned long v82;  // x20
    unsigned long long v83;  // x24
    unsigned long long v84;  // x11
    unsigned long long v85;  // x20
    unsigned long v86;  // x19
    unsigned long v87;  // x27
    unsigned long long v88;  // x23
    unsigned long long v89;  // x12
    unsigned long long *v90;  // x1
    unsigned long long v28;  // x25
    unsigned long long v91;  // x27
    unsigned long v92;  // x28
    unsigned long v93;  // x26
    unsigned long long v94;  // x22
    unsigned long long v95;  // x13
    unsigned long long v96;  // x26
    unsigned long v97;  // x19
    unsigned long v98;  // x25
    unsigned long long v99;  // x21
    unsigned long long v100;  // x14
    unsigned long long v29;  // x26
    unsigned long long *v101;  // x1
    unsigned long long v102;  // x25
    unsigned long v103;  // x28
    unsigned long v104;  // x24
    unsigned long long v105;  // x20
    unsigned long long v106;  // x15
    unsigned long long v107;  // x24
    unsigned long v108;  // x19
    unsigned long v109;  // x23
    unsigned long long v110;  // x27
    unsigned long long v30;  // x27
    unsigned long long v111;  // x0
    unsigned long long v112;  // x23
    unsigned long v113;  // x28
    unsigned long v114;  // x22
    unsigned long long v115;  // x26
    unsigned long long v116;  // x1
    unsigned long long v117;  // x22
    unsigned long v118;  // x19
    unsigned long v119;  // x21
    unsigned long long v120;  // x25
    unsigned long long v0;  // [bp-0xa0]
    unsigned long long v1;  // [bp-0xa0]
    unsigned long long v2;  // [bp-0x98]
    unsigned long long v3;  // [bp-0x90]
    unsigned long long v4;  // [bp-0x88]
    unsigned long long v5;  // [bp-0x88]
    char *v6;  // [bp-0x80]
    unsigned long long v7;  // [bp-0x78]
    unsigned long long v8;  // [bp-0x70]
    unsigned long long v9;  // [bp-0x68]
    unsigned long long v10;  // [bp-0x60]
    unsigned long long v11;  // [bp-0x58]
    unsigned long long v12;  // [bp-0x50]
    unsigned long long v13;  // [bp-0x48]
    unsigned long long v14;  // [bp-0x40]
    unsigned long long v15;  // [bp-0x38]
    unsigned long long v16;  // [bp-0x30]
    unsigned long long v17;  // [bp-0x28]
    unsigned long long *v18;  // [bp-0x18]
    unsigned long long *v19;  // [bp-0x10]
    char v20;  // [bp+0x0]

    if (g_f0d568 & 64)
        goto LABEL_0xac1b80;
    v6 = &v20;
    v7 = v21;
    v8 = v22;
    v9 = v23;
    v10 = v24;
    v11 = v25;
    v12 = v26;
    v13 = v27;
    v14 = v28;
    v15 = v29;
    v16 = v30;
    v17 = v31;
    v32 = a0->field_0;
    v33 = a0->field_8;
    v34 = a0->field_10;
    v35 = a0->field_18;
    v36 = a0->field_20;
    v37 = a0->field_28;
    v38 = a0->field_30;
    v39 = a0->field_38;
    x30 = (int)&g_df8380;
    v18 = &i[16 * a2];
    do
    {
        v40 = i + 2;
        x30 = x30 + 8;
        v19 = v40;
        v41 = __builtin_bswap64(*i);
        v42 = v32 ^ v33;
        v43 = v39 + *(long long *)x30 + v41 + (v37 & v36 | v38 & ~v36) + (__ROL__(v36, 50) ^ __ROL__(v36 ^ __ROL__(v36, 41), 46));
        v44 = v35 + v43;
        x30 = x30 + 8;
        v45 = __builtin_bswap64(i[1]);
        v46 = v40 + 2;
        v47 = v43 + ((v33 ^ v34) & v42 ^ v33) + (__ROL__(v32, 36) ^ __ROL__(v32 ^ __ROL__(v32, 59), 30));
        v48 = v47 ^ v32;
        v49 = v38 + *(long long *)x30 + v45 + (v36 & v44 | v37 & ~v44) + (__ROL__(v44, 50) ^ __ROL__(v44 ^ __ROL__(v44, 41), 46));
        v50 = v34 + v49;
        x30 = x30 + 8;
        v51 = __builtin_bswap64(*v40);
        v52 = v49 + (v42 & v48 ^ v32) + (__ROL__(v47, 36) ^ __ROL__(v47 ^ __ROL__(v47, 59), 30));
        v53 = v52 ^ v47;
        v54 = v37 + *(long long *)x30 + v51 + (v44 & v50 | v36 & ~v50) + (__ROL__(v50, 50) ^ __ROL__(v50 ^ __ROL__(v50, 41), 46));
        v55 = v33 + v54;
        x30 = x30 + 8;
        v56 = __builtin_bswap64(v40[1]);
        v57 = v46 + 2;
        v58 = v54 + (v48 & v53 ^ v47) + (__ROL__(v52, 36) ^ __ROL__(v52 ^ __ROL__(v52, 59), 30));
        v59 = v58 ^ v52;
        v60 = v36 + *(long long *)x30 + v56 + (v50 & v55 | v44 & ~v55) + (__ROL__(v55, 50) ^ __ROL__(v55 ^ __ROL__(v55, 41), 46));
        v61 = v32 + v60;
        x30 = x30 + 8;
        v62 = __builtin_bswap64(*v46);
        v63 = v60 + (v53 & v59 ^ v52) + (__ROL__(v58, 36) ^ __ROL__(v58 ^ __ROL__(v58, 59), 30));
        v64 = v63 ^ v58;
        v65 = v44 + *(long long *)x30 + v62 + (v55 & v61 | v50 & ~v61) + (__ROL__(v61, 50) ^ __ROL__(v61 ^ __ROL__(v61, 41), 46));
        v66 = v47 + v65;
        x30 = x30 + 8;
        v67 = __builtin_bswap64(v46[1]);
        v68 = v57 + 2;
        v69 = v65 + (v59 & v64 ^ v58) + (__ROL__(v63, 36) ^ __ROL__(v63 ^ __ROL__(v63, 59), 30));
        v70 = v69 ^ v63;
        v71 = v50 + *(long long *)x30 + v67 + (v61 & v66 | v55 & ~v66) + (__ROL__(v66, 50) ^ __ROL__(v66 ^ __ROL__(v66, 41), 46));
        v72 = v52 + v71;
        x30 = x30 + 8;
        v73 = __builtin_bswap64(*v57);
        v74 = v71 + (v64 & v70 ^ v63) + (__ROL__(v69, 36) ^ __ROL__(v69 ^ __ROL__(v69, 59), 30));
        v75 = v74 ^ v69;
        v76 = v55 + *(long long *)x30 + v73 + (v66 & v72 | v61 & ~v72) + (__ROL__(v72, 50) ^ __ROL__(v72 ^ __ROL__(v72, 41), 46));
        v77 = v58 + v76;
        x30 = x30 + 8;
        v78 = __builtin_bswap64(v57[1]);
        v79 = v68 + 2;
        v80 = v76 + (v70 & v75 ^ v69) + (__ROL__(v74, 36) ^ __ROL__(v74 ^ __ROL__(v74, 59), 30));
        v81 = v80 ^ v74;
        v82 = v61 + *(long long *)x30 + v78 + (v72 & v77 | v66 & ~v77) + (__ROL__(v77, 50) ^ __ROL__(v77 ^ __ROL__(v77, 41), 46));
        v83 = v63 + v82;
        x30 = x30 + 8;
        v84 = __builtin_bswap64(*v68);
        v85 = v82 + (v75 & v81 ^ v74) + (__ROL__(v80, 36) ^ __ROL__(v80 ^ __ROL__(v80, 59), 30));
        v86 = v85 ^ v80;
        v87 = v66 + *(long long *)x30 + v84 + (v77 & v83 | v72 & ~v83) + (__ROL__(v83, 50) ^ __ROL__(v83 ^ __ROL__(v83, 41), 46));
        v88 = v69 + v87;
        x30 = x30 + 8;
        v89 = __builtin_bswap64(v68[1]);
        v90 = v79 + 2;
        v91 = v87 + (v81 & v86 ^ v80) + (__ROL__(v85, 36) ^ __ROL__(v85 ^ __ROL__(v85, 59), 30));
        v92 = v91 ^ v85;
        v93 = v72 + *(long long *)x30 + v89 + (v83 & v88 | v77 & ~v88) + (__ROL__(v88, 50) ^ __ROL__(v88 ^ __ROL__(v88, 41), 46));
        v94 = v74 + v93;
        x30 = x30 + 8;
        v95 = __builtin_bswap64(*v79);
        v96 = v93 + (v86 & v92 ^ v85) + (__ROL__(v91, 36) ^ __ROL__(v91 ^ __ROL__(v91, 59), 30));
        v97 = v96 ^ v91;
        v98 = v77 + *(long long *)x30 + v95 + (v88 & v94 | v83 & ~v94) + (__ROL__(v94, 50) ^ __ROL__(v94 ^ __ROL__(v94, 41), 46));
        v99 = v80 + v98;
        x30 = x30 + 8;
        v100 = __builtin_bswap64(v79[1]);
        v101 = v90 + 2;
        v102 = v98 + (v92 & v97 ^ v91) + (__ROL__(v96, 36) ^ __ROL__(v96 ^ __ROL__(v96, 59), 30));
        v4 = v56;
        v103 = v102 ^ v96;
        v104 = v83 + *(long long *)x30 + v100 + (v94 & v99 | v88 & ~v99) + (__ROL__(v99, 50) ^ __ROL__(v99 ^ __ROL__(v99, 41), 46));
        v105 = v85 + v104;
        x30 = x30 + 8;
        v106 = __builtin_bswap64(*v90);
        v107 = v104 + (v97 & v103 ^ v96) + (__ROL__(v102, 36) ^ __ROL__(v102 ^ __ROL__(v102, 59), 30));
        v0 = v62;
        v108 = v107 ^ v102;
        v109 = v88 + *(long long *)x30 + v106 + (v99 & v105 | v94 & ~v105) + (__ROL__(v105, 50) ^ __ROL__(v105 ^ __ROL__(v105, 41), 46));
        v110 = v91 + v109;
        x30 = x30 + 8;
        v111 = __builtin_bswap64(v90[1]);
        v112 = v109 + (v103 & v108 ^ v102) + (__ROL__(v107, 36) ^ __ROL__(v107 ^ __ROL__(v107, 59), 30));
        v2 = v67;
        v113 = v112 ^ v107;
        v114 = v94 + *(long long *)x30 + v111 + (v105 & v110 | v99 & ~v110) + (__ROL__(v110, 50) ^ __ROL__(v110 ^ __ROL__(v110, 41), 46));
        v115 = v96 + v114;
        x30 = x30 + 8;
        v116 = __builtin_bswap64(*v101);
        v117 = v114 + (v108 & v113 ^ v107) + (__ROL__(v112, 36) ^ __ROL__(v112 ^ __ROL__(v112, 59), 30));
        v3 = v73;
        v118 = v117 ^ v112;
        v119 = v99 + *(long long *)x30 + v116 + (v110 & v115 | v105 & ~v115) + (__ROL__(v115, 50) ^ __ROL__(v115 ^ __ROL__(v115, 41), 46));
        v120 = v102 + v119;
        x30 = x30 + 8;
        v121 = __builtin_bswap64(v101[1]);
        v122 = v119 + (v113 & v118 ^ v112) + (__ROL__(v117, 36) ^ __ROL__(v117 ^ __ROL__(v117, 59), 30));
        v5 = v78;
        v123 = v122 ^ v117;
        v124 = v105 + *(long long *)x30 + v121 + (v115 & v120 | v110 & ~v120) + (__ROL__(v120, 50) ^ __ROL__(v120, 46) ^ __ROL__(v120, 23));
        v125 = v107 + v124;
        v126 = *(long long *)x30;
        x30 = x30 + 8;
        v127 = v124 + (v118 & v123 ^ v117) + (__ROL__(v122, 36) ^ __ROL__(v122, 30) ^ __ROL__(v122, 25));
        v128 = v41 + v89 + (__ROL__(v45, 63) ^ __ROL__(v45, 56) ^ v45 >> 7) + (__ROL__(v116, 45) ^ __ROL__(v116, 3) ^ v116 >> 6);
        do
        {
            v129 = v2;
            v1 = v84;
            v130 = v127 ^ v122;
            v131 = v110 + v126 + v128 + (v120 & v125 | v115 & ~v125) + (__ROL__(v125, 50) ^ __ROL__(v125, 46) ^ __ROL__(v125, 23));
            v132 = v112 + v131;
            x30 = x30 + 8;
            v133 = v131 + (v123 & v130 ^ v122) + (__ROL__(v127, 36) ^ __ROL__(v127, 30) ^ __ROL__(v127, 25));
            v134 = v45 + v95 + (__ROL__(v51, 63) ^ __ROL__(v51, 56) ^ v51 >> 7) + (__ROL__(v121, 45) ^ __ROL__(v121, 3) ^ v121 >> 6);
            v135 = v3;
            v2 = v89;
            v136 = v133 ^ v127;
            v137 = v115 + *(long long *)x30 + v134 + (v125 & v132 | v120 & ~v132) + (__ROL__(v132, 50) ^ __ROL__(v132, 46) ^ __ROL__(v132, 23));
            v138 = v117 + v137;
            x30 = x30 + 8;
            v139 = v137 + (v130 & v136 ^ v127) + (__ROL__(v133, 36) ^ __ROL__(v133, 30) ^ __ROL__(v133, 25));
            v140 = v51 + v100 + (__ROL__(v4, 63) ^ __ROL__(v4, 56) ^ v4 >> 7) + (__ROL__(v128, 45) ^ __ROL__(v128, 3) ^ v128 >> 6);
            v141 = v5;
            v3 = v95;
            v142 = v139 ^ v133;
            v143 = v120 + *(long long *)x30 + v140 + (v132 & v138 | v125 & ~v138) + (__ROL__(v138, 50) ^ __ROL__(v138, 46) ^ __ROL__(v138, 23));
            v144 = v122 + v143;
            x30 = x30 + 8;
            v145 = v143 + (v136 & v142 ^ v133) + (__ROL__(v139, 36) ^ __ROL__(v139, 30) ^ __ROL__(v139, 25));
            v146 = v4 + v106 + (__ROL__(v0, 63) ^ __ROL__(v0, 56) ^ v0 >> 7) + (__ROL__(v134, 45) ^ __ROL__(v134, 3) ^ v134 >> 6);
            v147 = v1;
            v4 = v100;
            v148 = v145 ^ v139;
            v149 = v125 + *(long long *)x30 + v146 + (v138 & v144 | v132 & ~v144) + (__ROL__(v144, 50) ^ __ROL__(v144, 46) ^ __ROL__(v144, 23));
            v150 = v127 + v149;
            x30 = x30 + 8;
            v151 = v149 + (v142 & v148 ^ v139) + (__ROL__(v145, 36) ^ __ROL__(v145, 30) ^ __ROL__(v145, 25));
            v152 = v0 + v111 + (__ROL__(v129, 63) ^ __ROL__(v129, 56) ^ v129 >> 7) + (__ROL__(v140, 45) ^ __ROL__(v140, 3) ^ v140 >> 6);
            v153 = v2;
            v0 = v106;
            v154 = v151 ^ v145;
            v155 = v132 + *(long long *)x30 + v152 + (v144 & v150 | v138 & ~v150) + (__ROL__(v150, 50) ^ __ROL__(v150, 46) ^ __ROL__(v150, 23));
            v156 = v133 + v155;
            x30 = x30 + 8;
            v157 = v155 + (v148 & v154 ^ v145) + (__ROL__(v151, 36) ^ __ROL__(v151, 30) ^ __ROL__(v151, 25));
            v158 = v129 + v116 + (__ROL__(v135, 63) ^ __ROL__(v135, 56) ^ v135 >> 7) + (__ROL__(v146, 45) ^ __ROL__(v146, 3) ^ v146 >> 6);
            v159 = v3;
            v2 = v111;
            v160 = v157 ^ v151;
            v161 = v138 + *(long long *)x30 + v158 + (v150 & v156 | v144 & ~v156) + (__ROL__(v156, 50) ^ __ROL__(v156, 46) ^ __ROL__(v156, 23));
            v162 = v139 + v161;
            x30 = x30 + 8;
            v163 = v161 + (v154 & v160 ^ v151) + (__ROL__(v157, 36) ^ __ROL__(v157, 30) ^ __ROL__(v157, 25));
            v164 = v135 + v121 + (__ROL__(v141, 63) ^ __ROL__(v141, 56) ^ v141 >> 7) + (__ROL__(v152, 45) ^ __ROL__(v152, 3) ^ v152 >> 6);
            v165 = v4;
            v3 = v116;
            v166 = v163 ^ v157;
            v167 = v144 + *(long long *)x30 + v164 + (v156 & v162 | v150 & ~v162) + (__ROL__(v162, 50) ^ __ROL__(v162, 46) ^ __ROL__(v162, 23));
            v168 = v145 + v167;
            x30 = x30 + 8;
            v169 = v167 + (v160 & v166 ^ v157) + (__ROL__(v163, 36) ^ __ROL__(v163, 30) ^ __ROL__(v163, 25));
            v170 = v141 + v128 + (__ROL__(v147, 63) ^ __ROL__(v147, 56) ^ v147 >> 7) + (__ROL__(v158, 45) ^ __ROL__(v158, 3) ^ v158 >> 6);
            v171 = v0;
            v4 = v121;
            v172 = v169 ^ v163;
            v173 = v150 + *(long long *)x30 + v170 + (v162 & v168 | v156 & ~v168) + (__ROL__(v168, 50) ^ __ROL__(v168, 46) ^ __ROL__(v168, 23));
            v174 = v151 + v173;
            x30 = x30 + 8;
            v175 = v173 + (v166 & v172 ^ v163) + (__ROL__(v169, 36) ^ __ROL__(v169, 30) ^ __ROL__(v169, 25));
            v84 = v147 + v134 + (__ROL__(v153, 63) ^ __ROL__(v153, 56) ^ v153 >> 7) + (__ROL__(v164, 45) ^ __ROL__(v164, 3) ^ v164 >> 6);
            v176 = v2;
            v0 = v128;
            v177 = v175 ^ v169;
            v178 = v156 + *(long long *)x30 + v84 + (v168 & v174 | v162 & ~v174) + (__ROL__(v174, 50) ^ __ROL__(v174, 46) ^ __ROL__(v174, 23));
            v179 = v157 + v178;
            x30 = x30 + 8;
            v180 = v178 + (v172 & v177 ^ v169) + (__ROL__(v175, 36) ^ __ROL__(v175, 30) ^ __ROL__(v175, 25));
            v89 = v153 + v140 + (__ROL__(v159, 63) ^ __ROL__(v159, 56) ^ v159 >> 7) + (__ROL__(v170, 45) ^ __ROL__(v170, 3) ^ v170 >> 6);
            v181 = v3;
            v2 = v134;
            v182 = v180 ^ v175;
            v183 = v162 + *(long long *)x30 + v89 + (v174 & v179 | v168 & ~v179) + (__ROL__(v179, 50) ^ __ROL__(v179, 46) ^ __ROL__(v179, 23));
            v184 = v163 + v183;
            x30 = x30 + 8;
            v185 = v183 + (v177 & v182 ^ v175) + (__ROL__(v180, 36) ^ __ROL__(v180, 30) ^ __ROL__(v180, 25));
            v95 = v159 + v146 + (__ROL__(v165, 63) ^ __ROL__(v165, 56) ^ v165 >> 7) + (__ROL__(v84, 45) ^ __ROL__(v84, 3) ^ v84 >> 6);
            v186 = v4;
            v3 = v140;
            v187 = v185 ^ v180;
            v188 = v168 + *(long long *)x30 + v95 + (v179 & v184 | v174 & ~v184) + (__ROL__(v184, 50) ^ __ROL__(v184, 46) ^ __ROL__(v184, 23));
            v189 = v169 + v188;
            x30 = x30 + 8;
            v190 = v188 + (v182 & v187 ^ v180) + (__ROL__(v185, 36) ^ __ROL__(v185, 30) ^ __ROL__(v185, 25));
            v100 = v165 + v152 + (__ROL__(v171, 63) ^ __ROL__(v171, 56) ^ v171 >> 7) + (__ROL__(v89, 45) ^ __ROL__(v89, 3) ^ v89 >> 6);
            v191 = v0;
            v4 = v146;
            v192 = v190 ^ v185;
            v193 = v174 + *(long long *)x30 + v100 + (v184 & v189 | v179 & ~v189) + (__ROL__(v189, 50) ^ __ROL__(v189, 46) ^ __ROL__(v189, 23));
            v194 = v175 + v193;
            x30 = x30 + 8;
            v195 = v193 + (v187 & v192 ^ v185) + (__ROL__(v190, 36) ^ __ROL__(v190, 30) ^ __ROL__(v190, 25));
            v106 = v171 + v158 + (__ROL__(v176, 63) ^ __ROL__(v176, 56) ^ v176 >> 7) + (__ROL__(v95, 45) ^ __ROL__(v95, 3) ^ v95 >> 6);
            v45 = v2;
            v0 = v152;
            v196 = v195 ^ v190;
            v197 = v179 + *(long long *)x30 + v106 + (v189 & v194 | v184 & ~v194) + (__ROL__(v194, 50) ^ __ROL__(v194, 46) ^ __ROL__(v194, 23));
            v110 = v180 + v197;
            x30 = x30 + 8;
            v112 = v197 + (v192 & v196 ^ v190) + (__ROL__(v195, 36) ^ __ROL__(v195, 30) ^ __ROL__(v195, 25));
            v111 = v176 + v164 + (__ROL__(v181, 63) ^ __ROL__(v181, 56) ^ v181 >> 7) + (__ROL__(v100, 45) ^ __ROL__(v100, 3) ^ v100 >> 6);
            v51 = v3;
            v2 = v158;
            v198 = v112 ^ v195;
            v199 = v184 + *(long long *)x30 + v111 + (v194 & v110 | v189 & ~v110) + (__ROL__(v110, 50) ^ __ROL__(v110, 46) ^ __ROL__(v110, 23));
            v115 = v185 + v199;
            x30 = x30 + 8;
            v117 = v199 + (v196 & v198 ^ v195) + (__ROL__(v112, 36) ^ __ROL__(v112, 30) ^ __ROL__(v112, 25));
            v116 = v181 + v170 + (__ROL__(v186, 63) ^ __ROL__(v186, 56) ^ v186 >> 7) + (__ROL__(v106, 45) ^ __ROL__(v106, 3) ^ v106 >> 6);
            v3 = v164;
            v200 = v117 ^ v112;
            v201 = v189 + *(long long *)x30 + v116 + (v110 & v115 | v194 & ~v115) + (__ROL__(v115, 50) ^ __ROL__(v115, 46) ^ __ROL__(v115, 23));
            v120 = v190 + v201;
            x30 = x30 + 8;
            v122 = v201 + (v198 & v200 ^ v112) + (__ROL__(v117, 36) ^ __ROL__(v117, 30) ^ __ROL__(v117, 25));
            v121 = v186 + v84 + (__ROL__(v191, 63) ^ __ROL__(v191, 56) ^ v191 >> 7) + (__ROL__(v111, 45) ^ __ROL__(v111, 3) ^ v111 >> 6);
            v5 = v170;
            v123 = v122 ^ v117;
            v202 = v194 + *(long long *)x30 + v121 + (v115 & v120 | v110 & ~v120) + (__ROL__(v120, 50) ^ __ROL__(v120, 46) ^ __ROL__(v120, 23));
            v125 = v195 + v202;
            v126 = *(long long *)x30;
            x30 = x30 + 8;
            v127 = v202 + (v200 & v123 ^ v117) + (__ROL__(v122, 36) ^ __ROL__(v122, 30) ^ __ROL__(v122, 25));
        } while ((v128 = v191 + v89 + (__ROL__(v45, 63) ^ __ROL__(v45, 56) ^ v45 >> 7) + (__ROL__(v116, 45) ^ __ROL__(v116, 3) ^ v116 >> 6), v126));
        x30 = x30 - 648;
        i = v19 + 14;
        v203 = a0->field_20;
        v204 = a0->field_28;
        v32 = v127 + a0->field_0;
        v205 = a0->field_30;
        v206 = a0->field_38;
        v33 = v122 + a0->field_8;
        v34 = v117 + a0->field_10;
        v35 = v112 + a0->field_18;
        a0->field_0 = v32;
        a0->field_8 = v33;
        v36 = v125 + v203;
        v37 = v120 + v204;
        a0->field_10 = v34;
        a0->field_18 = v35;
        v38 = v115 + v205;
        v39 = v110 + v206;
        a0->field_20 = v36;
        a0->field_28 = v37;
        a0->field_30 = v38;
        a0->field_38 = v39;
    } while (i != v18);
    return a0;
}
