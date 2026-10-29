/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xabd100..0xabe100 (4096 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_abd100_0 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
    unsigned int field_10;
} st_abd100_0;

extern unsigned int g_f0d568;

st_abd100_0 * sub_abd100(st_abd100_0 *a0, unsigned long long *iter, unsigned int i)
{
    unsigned long long v13;  // x30
    unsigned long long v14;  // x19
    unsigned long long v23;  // x28
    unsigned int v113;  // w13
    unsigned int v114;  // w21
    unsigned int v115;  // w24
    unsigned int v116;  // w14
    unsigned int v117;  // w20
    unsigned int v118;  // w23
    unsigned int v119;  // w15
    unsigned int v120;  // w24
    unsigned int v121;  // w22
    unsigned int v122;  // w16
    unsigned int v24;  // w20
    unsigned int v123;  // w23
    unsigned int v124;  // w21
    unsigned int v125;  // w17
    unsigned int v126;  // w22
    unsigned int v127;  // w20
    unsigned int v128;  // w19
    unsigned int v129;  // w21
    unsigned int v130;  // w24
    unsigned int v131;  // w3
    unsigned int v132;  // w20
    unsigned int v25;  // w21
    unsigned int v133;  // w23
    unsigned int v134;  // w4
    unsigned int v135;  // w24
    unsigned int v136;  // w22
    unsigned int v137;  // w5
    unsigned int v138;  // w23
    unsigned int v139;  // w21
    unsigned int v140;  // w6
    unsigned int v141;  // w22
    unsigned int v142;  // w20
    unsigned int v26;  // w22
    unsigned int v143;  // w7
    unsigned int v144;  // w21
    unsigned int v145;  // w24
    unsigned int v146;  // w8
    unsigned int v147;  // w20
    unsigned int v148;  // w23
    unsigned int v149;  // w9
    unsigned int v150;  // w24
    unsigned int v151;  // w22
    unsigned int v152;  // w10
    unsigned int v27;  // w23
    unsigned int v153;  // w23
    unsigned int v154;  // w21
    unsigned int v155;  // w11
    unsigned int v156;  // w22
    unsigned int v157;  // w20
    unsigned int v158;  // w12
    unsigned int v159;  // w21
    unsigned int v160;  // w24
    unsigned int v161;  // w13
    unsigned int v162;  // w20
    unsigned int v28;  // w24
    unsigned int v163;  // w23
    unsigned int v164;  // w14
    unsigned int v165;  // w24
    unsigned int v166;  // w22
    unsigned int v167;  // w15
    unsigned int v168;  // w23
    unsigned int v169;  // w21
    unsigned int v170;  // w16
    unsigned int v171;  // w22
    unsigned int v172;  // w20
    unsigned long v29;  // x3
    unsigned int v173;  // w17
    unsigned int v174;  // w21
    unsigned int v175;  // w24
    unsigned int v176;  // w19
    unsigned int v177;  // w20
    unsigned int v178;  // w23
    unsigned int v179;  // w3
    unsigned int v180;  // w24
    unsigned int v181;  // w22
    unsigned int v182;  // w4
    unsigned long long v30;  // x3
    unsigned int v183;  // w23
    unsigned int v184;  // w21
    unsigned int v185;  // w5
    unsigned int v186;  // w22
    unsigned int v187;  // w20
    unsigned int v188;  // w6
    unsigned int v189;  // w21
    unsigned int v190;  // w24
    unsigned int v191;  // w7
    unsigned int v192;  // w20
    unsigned int v31;  // w4
    unsigned int v193;  // w23
    unsigned int v194;  // w8
    unsigned int v195;  // w24
    unsigned int v196;  // w22
    unsigned int v197;  // w9
    unsigned int v198;  // w23
    unsigned int v199;  // w21
    unsigned int v200;  // w10
    unsigned int v201;  // w22
    unsigned int v202;  // w20
    unsigned long v32;  // x5
    unsigned int v203;  // w11
    unsigned int v204;  // w21
    unsigned int v205;  // w24
    unsigned int v206;  // w12
    unsigned int v207;  // w20
    unsigned int v208;  // w23
    unsigned int v209;  // w13
    unsigned int v210;  // w24
    unsigned int v211;  // w22
    unsigned int v212;  // w14
    unsigned long long v15;  // x20
    unsigned int v33;  // w21
    unsigned int v213;  // w23
    unsigned int v214;  // w21
    unsigned int v215;  // w15
    unsigned int v216;  // w22
    unsigned int v217;  // w20
    unsigned int v218;  // w16
    unsigned int v219;  // w21
    unsigned int v220;  // w24
    unsigned int v221;  // w17
    unsigned int v222;  // w20
    unsigned int v34;  // w24
    unsigned int v223;  // w23
    unsigned int v224;  // w19
    unsigned int v225;  // w24
    unsigned int v226;  // w22
    unsigned int v227;  // w3
    unsigned int v228;  // w23
    unsigned int v229;  // w21
    unsigned int v230;  // w4
    unsigned int v231;  // w22
    unsigned int v232;  // w20
    unsigned long long v35;  // x5
    unsigned int v233;  // w5
    unsigned int v234;  // w21
    unsigned int v235;  // w24
    unsigned int v236;  // w6
    unsigned int v237;  // w20
    unsigned int v238;  // w23
    unsigned int v239;  // w7
    unsigned int v240;  // w24
    unsigned int v241;  // w22
    unsigned int v242;  // w8
    unsigned int v36;  // w20
    unsigned int v243;  // w23
    unsigned int v244;  // w21
    unsigned int v245;  // w9
    unsigned int v246;  // w22
    unsigned int v247;  // w20
    unsigned int v248;  // w10
    unsigned int v249;  // w21
    unsigned int v250;  // w24
    unsigned int v251;  // w11
    unsigned int v252;  // w20
    unsigned int v37;  // w23
    unsigned int v253;  // w23
    unsigned int v254;  // w12
    unsigned int v255;  // w24
    unsigned int v256;  // w22
    unsigned int v257;  // w13
    unsigned int v258;  // w23
    unsigned int v259;  // w21
    unsigned int v260;  // w14
    unsigned int v261;  // w22
    unsigned int v262;  // w20
    unsigned int v38;  // w6
    unsigned int v263;  // w15
    unsigned int v264;  // w21
    unsigned int v265;  // w24
    unsigned int v266;  // w20
    unsigned int v267;  // w23
    unsigned int v268;  // w24
    unsigned int v269;  // w22
    unsigned int v270;  // w23
    unsigned int v271;  // w21
    unsigned long v39;  // x7
    unsigned int v40;  // w24
    unsigned int v41;  // w22
    unsigned long long v42;  // x7
    unsigned long long v16;  // x21
    unsigned int v43;  // w23
    unsigned int v44;  // w21
    unsigned int v45;  // w8
    unsigned long v46;  // x9
    unsigned int v47;  // w22
    unsigned int v48;  // w20
    unsigned long long v49;  // x9
    unsigned int v50;  // w21
    unsigned int v51;  // w24
    unsigned int v52;  // w10
    unsigned long long v17;  // x22
    unsigned long v53;  // x11
    unsigned int v54;  // w20
    unsigned int v55;  // w23
    unsigned long long v56;  // x11
    unsigned int v57;  // w24
    unsigned int v58;  // w22
    unsigned int v59;  // w12
    unsigned long v60;  // x13
    unsigned int v61;  // w23
    unsigned int v62;  // w21
    unsigned long long v18;  // x23
    unsigned long long v63;  // x13
    unsigned int v64;  // w22
    unsigned int v65;  // w20
    unsigned int v66;  // w14
    unsigned long v67;  // x15
    unsigned int v68;  // w21
    unsigned int v69;  // w24
    unsigned long long v70;  // x15
    unsigned int v71;  // w20
    unsigned int v72;  // w23
    unsigned long long v19;  // x24
    unsigned int v73;  // w16
    unsigned long v74;  // x17
    unsigned int v75;  // w24
    unsigned int v76;  // w22
    unsigned long long v77;  // x17
    unsigned int v78;  // w23
    unsigned int v79;  // w21
    unsigned int v80;  // w19
    unsigned int v81;  // w22
    unsigned int v82;  // w20
    unsigned long long v20;  // x25
    unsigned int v83;  // w3
    unsigned int v84;  // w21
    unsigned int v85;  // w24
    unsigned int v86;  // w4
    unsigned int v87;  // w20
    unsigned int v88;  // w23
    unsigned int v89;  // w5
    unsigned int v90;  // w24
    unsigned int v91;  // w22
    unsigned int v92;  // w6
    unsigned long long v21;  // x26
    unsigned int v93;  // w23
    unsigned int v94;  // w21
    unsigned int v95;  // w7
    unsigned int v96;  // w22
    unsigned int v97;  // w20
    unsigned int v98;  // w8
    unsigned int v99;  // w21
    unsigned int v100;  // w24
    unsigned int v101;  // w9
    unsigned int v102;  // w20
    unsigned long long v22;  // x27
    unsigned int v103;  // w23
    unsigned int v104;  // w10
    unsigned int v105;  // w24
    unsigned int v106;  // w22
    unsigned int v107;  // w11
    unsigned int v108;  // w23
    unsigned int v109;  // w21
    unsigned int v110;  // w12
    unsigned int v111;  // w22
    unsigned int v112;  // w20
    char *v0;  // [bp-0x60]
    unsigned long long v1;  // [bp-0x58]
    unsigned long long v2;  // [bp-0x50]
    unsigned long long v3;  // [bp-0x48]
    unsigned long long v4;  // [bp-0x40]
    unsigned long long v5;  // [bp-0x38]
    unsigned long long v6;  // [bp-0x30]
    unsigned long long v7;  // [bp-0x28]
    unsigned long long v8;  // [bp-0x20]
    unsigned long long v9;  // [bp-0x18]
    unsigned long long v10;  // [bp-0x10]
    unsigned long long v11;  // [bp-0x8]
    char v12;  // [bp+0x0]

    if (g_f0d568 & 8)
        goto LABEL_0xabe100;
    v0 = &v12;
    v1 = v13;
    v2 = v14;
    v3 = v15;
    v4 = v16;
    v5 = v17;
    v6 = v18;
    v7 = v19;
    v8 = v20;
    v9 = v21;
    v10 = v22;
    v11 = v23;
    v24 = a0->field_0;
    v25 = a0->field_4;
    v26 = a0->field_8;
    v27 = a0->field_c;
    v28 = a0->field_10;
    do
    {
        v29 = *iter;
        iter += 8;
        i -= 1;
        v30 = (((v29 & 0xff00ff00ff00ff00) >> 8 | v29 * 0x100 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v29 & 0xff00ff00ff00ff00) >> 8 | v29 * 0x100 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000;
        v31 = v30 >> 32;
        v32 = *(long long *)((char *)iter - 56);
        v33 = __ROL__(v25, 30);
        v34 = v28 + 1518500249 + (unsigned int)v30 + (v24 * 32 | v24 >> 27) + (v27 & ~v25 | v26 & v25);
        v35 = (((v32 & 0xff00ff00ff00ff00) >> 8 | v32 * 0x100 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v32 & 0xff00ff00ff00ff00) >> 8 | v32 * 0x100 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000;
        v36 = __ROL__(v24, 30);
        v37 = v27 + 1518500249 + v31 + (v34 * 32 | v34 >> 27) + (v26 & ~v24 | v33 & v24);
        v38 = v35 >> 32;
        v39 = *(long long *)((char *)iter - 48);
        v40 = __ROL__(v34, 30);
        v41 = v26 + 1518500249 + (unsigned int)v35 + (v37 * 32 | v37 >> 27) + (v33 & ~v34 | v36 & v34);
        v42 = (((v39 & 0xff00ff00ff00ff00) >> 8 | v39 * 0x100 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v39 & 0xff00ff00ff00ff00) >> 8 | v39 * 0x100 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000;
        v43 = __ROL__(v37, 30);
        v44 = v33 + 1518500249 + v38 + (v41 * 32 | v41 >> 27) + (v36 & ~v37 | v40 & v37);
        v45 = v42 >> 32;
        v46 = *(long long *)((char *)iter - 40);
        v47 = __ROL__(v41, 30);
        v48 = v36 + 1518500249 + (unsigned int)v42 + (v44 * 32 | v44 >> 27) + (v40 & ~v41 | v43 & v41);
        v49 = (((v46 & 0xff00ff00ff00ff00) >> 8 | v46 * 0x100 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v46 & 0xff00ff00ff00ff00) >> 8 | v46 * 0x100 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000;
        v50 = __ROL__(v44, 30);
        v51 = v40 + 1518500249 + v45 + (v48 * 32 | v48 >> 27) + (v43 & ~v44 | v47 & v44);
        v52 = v49 >> 32;
        v53 = *(long long *)((char *)iter - 32);
        v54 = __ROL__(v48, 30);
        v55 = v43 + 1518500249 + (unsigned int)v49 + (v51 * 32 | v51 >> 27) + (v47 & ~v48 | v50 & v48);
        v56 = (((v53 & 0xff00ff00ff00ff00) >> 8 | v53 * 0x100 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v53 & 0xff00ff00ff00ff00) >> 8 | v53 * 0x100 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000;
        v57 = __ROL__(v51, 30);
        v58 = v47 + 1518500249 + v52 + (v55 * 32 | v55 >> 27) + (v50 & ~v51 | v54 & v51);
        v59 = v56 >> 32;
        v60 = *(long long *)((char *)iter - 24);
        v61 = __ROL__(v55, 30);
        v62 = v50 + 1518500249 + (unsigned int)v56 + (v58 * 32 | v58 >> 27) + (v54 & ~v55 | v57 & v55);
        v63 = (((v60 & 0xff00ff00ff00ff00) >> 8 | v60 * 0x100 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v60 & 0xff00ff00ff00ff00) >> 8 | v60 * 0x100 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000;
        v64 = __ROL__(v58, 30);
        v65 = v54 + 1518500249 + v59 + (v62 * 32 | v62 >> 27) + (v57 & ~v58 | v61 & v58);
        v66 = v63 >> 32;
        v67 = *(long long *)((char *)iter - 16);
        v68 = __ROL__(v62, 30);
        v69 = v57 + 1518500249 + (unsigned int)v63 + (v65 * 32 | v65 >> 27) + (v61 & ~v62 | v64 & v62);
        v70 = (((v67 & 0xff00ff00ff00ff00) >> 8 | v67 * 0x100 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v67 & 0xff00ff00ff00ff00) >> 8 | v67 * 0x100 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000;
        v71 = __ROL__(v65, 30);
        v72 = v61 + 1518500249 + v66 + (v69 * 32 | v69 >> 27) + (v64 & ~v65 | v68 & v65);
        v73 = v70 >> 32;
        v74 = *(long long *)((char *)iter - 8);
        v75 = __ROL__(v69, 30);
        v76 = v64 + 1518500249 + (unsigned int)v70 + (v72 * 32 | v72 >> 27) + (v68 & ~v69 | v71 & v69);
        v77 = (((v74 & 0xff00ff00ff00ff00) >> 8 | v74 * 0x100 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v74 & 0xff00ff00ff00ff00) >> 8 | v74 * 0x100 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000;
        v78 = __ROL__(v72, 30);
        v79 = v68 + 1518500249 + v73 + (v76 * 32 | v76 >> 27) + (v71 & ~v72 | v75 & v72);
        v80 = v77 >> 32;
        v81 = __ROL__(v76, 30);
        v82 = v71 + 1518500249 + (unsigned int)v77 + (v79 * 32 | v79 >> 27) + (v75 & ~v76 | v78 & v76);
        v83 = __ROL__((unsigned int)v30 ^ (unsigned int)v35 ^ (unsigned int)v56 ^ v73, 1);
        v84 = __ROL__(v79, 30);
        v85 = v75 + 1518500249 + v80 + (v82 * 32 | v82 >> 27) + (v78 & ~v79 | v81 & v79);
        v86 = __ROL__(v31 ^ v38 ^ v59 ^ (unsigned int)v77, 1);
        v87 = __ROL__(v82, 30);
        v88 = v78 + 1518500249 + v83 + (v85 * 32 | v85 >> 27) + (v81 & ~v82 | v84 & v82);
        v89 = __ROL__((unsigned int)v35 ^ (unsigned int)v42 ^ (unsigned int)v63 ^ v80, 1);
        v90 = __ROL__(v85, 30);
        v91 = v81 + 1518500249 + v86 + (v88 * 32 | v88 >> 27) + (v84 & ~v85 | v87 & v85);
        v92 = __ROL__(v38 ^ v45 ^ v66 ^ v83, 1);
        v93 = __ROL__(v88, 30);
        v94 = v84 + 1518500249 + v89 + (v91 * 32 | v91 >> 27) + (v87 & ~v88 | v90 & v88);
        v95 = __ROL__((unsigned int)v42 ^ (unsigned int)v49 ^ (unsigned int)v70 ^ v86, 1);
        v96 = __ROL__(v91, 30);
        v97 = v87 + 1518500249 + v92 + (v94 * 32 | v94 >> 27) + (v90 & ~v91 | v93 & v91);
        v98 = __ROL__(v45 ^ v52 ^ v73 ^ v89, 1);
        v99 = __ROL__(v94, 30);
        v100 = v90 + 1859775393 + v95 + (v97 * 32 | v97 >> 27) + (v93 ^ v94 ^ v96);
        v101 = __ROL__((unsigned int)v49 ^ (unsigned int)v56 ^ (unsigned int)v77 ^ v92, 1);
        v102 = __ROL__(v97, 30);
        v103 = v93 + 1859775393 + v98 + (v100 * 32 | v100 >> 27) + (v96 ^ v97 ^ v99);
        v104 = __ROL__(v52 ^ v59 ^ v80 ^ v95, 1);
        v105 = __ROL__(v100, 30);
        v106 = v96 + 1859775393 + v101 + (v103 * 32 | v103 >> 27) + (v99 ^ v100 ^ v102);
        v107 = __ROL__((unsigned int)v56 ^ (unsigned int)v63 ^ v83 ^ v98, 1);
        v108 = __ROL__(v103, 30);
        v109 = v99 + 1859775393 + v104 + (v106 * 32 | v106 >> 27) + (v102 ^ v103 ^ v105);
        v110 = __ROL__(v59 ^ v66 ^ v86 ^ v101, 1);
        v111 = __ROL__(v106, 30);
        v112 = v102 + 1859775393 + v107 + (v109 * 32 | v109 >> 27) + (v105 ^ v106 ^ v108);
        v113 = __ROL__((unsigned int)v63 ^ (unsigned int)v70 ^ v89 ^ v104, 1);
        v114 = __ROL__(v109, 30);
        v115 = v105 + 1859775393 + v110 + (v112 * 32 | v112 >> 27) + (v108 ^ v109 ^ v111);
        v116 = __ROL__(v66 ^ v73 ^ v92 ^ v107, 1);
        v117 = __ROL__(v112, 30);
        v118 = v108 + 1859775393 + v113 + (v115 * 32 | v115 >> 27) + (v111 ^ v112 ^ v114);
        v119 = __ROL__((unsigned int)v70 ^ (unsigned int)v77 ^ v95 ^ v110, 1);
        v120 = __ROL__(v115, 30);
        v121 = v111 + 1859775393 + v116 + (v118 * 32 | v118 >> 27) + (v114 ^ v115 ^ v117);
        v122 = __ROL__(v73 ^ v80 ^ v98 ^ v113, 1);
        v123 = __ROL__(v118, 30);
        v124 = v114 + 1859775393 + v119 + (v121 * 32 | v121 >> 27) + (v117 ^ v118 ^ v120);
        v125 = __ROL__((unsigned int)v77 ^ v83 ^ v101 ^ v116, 1);
        v126 = __ROL__(v121, 30);
        v127 = v117 + 1859775393 + v122 + (v124 * 32 | v124 >> 27) + (v120 ^ v121 ^ v123);
        v128 = __ROL__(v80 ^ v86 ^ v104 ^ v119, 1);
        v129 = __ROL__(v124, 30);
        v130 = v120 + 1859775393 + v125 + (v127 * 32 | v127 >> 27) + (v123 ^ v124 ^ v126);
        v131 = __ROL__(v83 ^ v89 ^ v107 ^ v122, 1);
        v132 = __ROL__(v127, 30);
        v133 = v123 + 1859775393 + v128 + (v130 * 32 | v130 >> 27) + (v126 ^ v127 ^ v129);
        v134 = __ROL__(v86 ^ v92 ^ v110 ^ v125, 1);
        v135 = __ROL__(v130, 30);
        v136 = v126 + 1859775393 + v131 + (v133 * 32 | v133 >> 27) + (v129 ^ v130 ^ v132);
        v137 = __ROL__(v89 ^ v95 ^ v113 ^ v128, 1);
        v138 = __ROL__(v133, 30);
        v139 = v129 + 1859775393 + v134 + (v136 * 32 | v136 >> 27) + (v132 ^ v133 ^ v135);
        v140 = __ROL__(v92 ^ v98 ^ v116 ^ v131, 1);
        v141 = __ROL__(v136, 30);
        v142 = v132 + 1859775393 + v137 + (v139 * 32 | v139 >> 27) + (v135 ^ v136 ^ v138);
        v143 = __ROL__(v95 ^ v101 ^ v119 ^ v134, 1);
        v144 = __ROL__(v139, 30);
        v145 = v135 + 1859775393 + v140 + (v142 * 32 | v142 >> 27) + (v138 ^ v139 ^ v141);
        v146 = __ROL__(v98 ^ v104 ^ v122 ^ v137, 1);
        v147 = __ROL__(v142, 30);
        v148 = v138 + 1859775393 + v143 + (v145 * 32 | v145 >> 27) + (v141 ^ v142 ^ v144);
        v149 = __ROL__(v101 ^ v107 ^ v125 ^ v140, 1);
        v150 = __ROL__(v145, 30);
        v151 = v141 + 1859775393 + v146 + (v148 * 32 | v148 >> 27) + (v144 ^ v145 ^ v147);
        v152 = __ROL__(v104 ^ v110 ^ v128 ^ v143, 1);
        v153 = __ROL__(v148, 30);
        v154 = v144 + 1859775393 + v149 + (v151 * 32 | v151 >> 27) + (v147 ^ v148 ^ v150);
        v155 = __ROL__(v107 ^ v113 ^ v131 ^ v146, 1);
        v156 = __ROL__(v151, 30);
        v157 = v147 + 1859775393 + v152 + (v154 * 32 | v154 >> 27) + (v150 ^ v151 ^ v153);
        v158 = __ROL__(v110 ^ v116 ^ v134 ^ v149, 1);
        v159 = __ROL__(v154, 30);
        v160 = v150 + 2400959708 + v155 + (v157 * 32 | v157 >> 27) + ((v154 | v156) & v153 | v154 & v156);
        v161 = __ROL__(v113 ^ v119 ^ v137 ^ v152, 1);
        v162 = __ROL__(v157, 30);
        v163 = v153 + 2400959708 + v158 + (v160 * 32 | v160 >> 27) + ((v157 | v159) & v156 | v157 & v159);
        v164 = __ROL__(v116 ^ v122 ^ v140 ^ v155, 1);
        v165 = __ROL__(v160, 30);
        v166 = v156 + 2400959708 + v161 + (v163 * 32 | v163 >> 27) + ((v160 | v162) & v159 | v160 & v162);
        v167 = __ROL__(v119 ^ v125 ^ v143 ^ v158, 1);
        v168 = __ROL__(v163, 30);
        v169 = v159 + 2400959708 + v164 + (v166 * 32 | v166 >> 27) + ((v163 | v165) & v162 | v163 & v165);
        v170 = __ROL__(v122 ^ v128 ^ v146 ^ v161, 1);
        v171 = __ROL__(v166, 30);
        v172 = v162 + 2400959708 + v167 + (v169 * 32 | v169 >> 27) + ((v166 | v168) & v165 | v166 & v168);
        v173 = __ROL__(v125 ^ v131 ^ v149 ^ v164, 1);
        v174 = __ROL__(v169, 30);
        v175 = v165 + 2400959708 + v170 + (v172 * 32 | v172 >> 27) + ((v169 | v171) & v168 | v169 & v171);
        v176 = __ROL__(v128 ^ v134 ^ v152 ^ v167, 1);
        v177 = __ROL__(v172, 30);
        v178 = v168 + 2400959708 + v173 + (v175 * 32 | v175 >> 27) + ((v172 | v174) & v171 | v172 & v174);
        v179 = __ROL__(v131 ^ v137 ^ v155 ^ v170, 1);
        v180 = __ROL__(v175, 30);
        v181 = v171 + 2400959708 + v176 + (v178 * 32 | v178 >> 27) + ((v175 | v177) & v174 | v175 & v177);
        v182 = __ROL__(v134 ^ v140 ^ v158 ^ v173, 1);
        v183 = __ROL__(v178, 30);
        v184 = v174 + 2400959708 + v179 + (v181 * 32 | v181 >> 27) + ((v178 | v180) & v177 | v178 & v180);
        v185 = __ROL__(v137 ^ v143 ^ v161 ^ v176, 1);
        v186 = __ROL__(v181, 30);
        v187 = v177 + 2400959708 + v182 + (v184 * 32 | v184 >> 27) + ((v181 | v183) & v180 | v181 & v183);
        v188 = __ROL__(v140 ^ v146 ^ v164 ^ v179, 1);
        v189 = __ROL__(v184, 30);
        v190 = v180 + 2400959708 + v185 + (v187 * 32 | v187 >> 27) + ((v184 | v186) & v183 | v184 & v186);
        v191 = __ROL__(v143 ^ v149 ^ v167 ^ v182, 1);
        v192 = __ROL__(v187, 30);
        v193 = v183 + 2400959708 + v188 + (v190 * 32 | v190 >> 27) + ((v187 | v189) & v186 | v187 & v189);
        v194 = __ROL__(v146 ^ v152 ^ v170 ^ v185, 1);
        v195 = __ROL__(v190, 30);
        v196 = v186 + 2400959708 + v191 + (v193 * 32 | v193 >> 27) + ((v190 | v192) & v189 | v190 & v192);
        v197 = __ROL__(v149 ^ v155 ^ v173 ^ v188, 1);
        v198 = __ROL__(v193, 30);
        v199 = v189 + 2400959708 + v194 + (v196 * 32 | v196 >> 27) + ((v193 | v195) & v192 | v193 & v195);
        v200 = __ROL__(v152 ^ v158 ^ v176 ^ v191, 1);
        v201 = __ROL__(v196, 30);
        v202 = v192 + 2400959708 + v197 + (v199 * 32 | v199 >> 27) + ((v196 | v198) & v195 | v196 & v198);
        v203 = __ROL__(v155 ^ v161 ^ v179 ^ v194, 1);
        v204 = __ROL__(v199, 30);
        v205 = v195 + 2400959708 + v200 + (v202 * 32 | v202 >> 27) + ((v199 | v201) & v198 | v199 & v201);
        v206 = __ROL__(v158 ^ v164 ^ v182 ^ v197, 1);
        v207 = __ROL__(v202, 30);
        v208 = v198 + 2400959708 + v203 + (v205 * 32 | v205 >> 27) + ((v202 | v204) & v201 | v202 & v204);
        v209 = __ROL__(v161 ^ v167 ^ v185 ^ v200, 1);
        v210 = __ROL__(v205, 30);
        v211 = v201 + 2400959708 + v206 + (v208 * 32 | v208 >> 27) + ((v205 | v207) & v204 | v205 & v207);
        v212 = __ROL__(v164 ^ v170 ^ v188 ^ v203, 1);
        v213 = __ROL__(v208, 30);
        v214 = v204 + 2400959708 + v209 + (v211 * 32 | v211 >> 27) + ((v208 | v210) & v207 | v208 & v210);
        v215 = __ROL__(v167 ^ v173 ^ v191 ^ v206, 1);
        v216 = __ROL__(v211, 30);
        v217 = v207 + 2400959708 + v212 + (v214 * 32 | v214 >> 27) + ((v211 | v213) & v210 | v211 & v213);
        v218 = __ROL__(v170 ^ v176 ^ v194 ^ v209, 1);
        v219 = __ROL__(v214, 30);
        v220 = v210 + 3395469782 + v215 + (v217 * 32 | v217 >> 27) + (v213 ^ v214 ^ v216);
        v221 = __ROL__(v173 ^ v179 ^ v197 ^ v212, 1);
        v222 = __ROL__(v217, 30);
        v223 = v213 + 3395469782 + v218 + (v220 * 32 | v220 >> 27) + (v216 ^ v217 ^ v219);
        v224 = __ROL__(v176 ^ v182 ^ v200 ^ v215, 1);
        v225 = __ROL__(v220, 30);
        v226 = v216 + 3395469782 + v221 + (v223 * 32 | v223 >> 27) + (v219 ^ v220 ^ v222);
        v227 = __ROL__(v179 ^ v185 ^ v203 ^ v218, 1);
        v228 = __ROL__(v223, 30);
        v229 = v219 + 3395469782 + v224 + (v226 * 32 | v226 >> 27) + (v222 ^ v223 ^ v225);
        v230 = __ROL__(v182 ^ v188 ^ v206 ^ v221, 1);
        v231 = __ROL__(v226, 30);
        v232 = v222 + 3395469782 + v227 + (v229 * 32 | v229 >> 27) + (v225 ^ v226 ^ v228);
        v233 = __ROL__(v185 ^ v191 ^ v209 ^ v224, 1);
        v234 = __ROL__(v229, 30);
        v235 = v225 + 3395469782 + v230 + (v232 * 32 | v232 >> 27) + (v228 ^ v229 ^ v231);
        v236 = __ROL__(v188 ^ v194 ^ v212 ^ v227, 1);
        v237 = __ROL__(v232, 30);
        v238 = v228 + 3395469782 + v233 + (v235 * 32 | v235 >> 27) + (v231 ^ v232 ^ v234);
        v239 = __ROL__(v191 ^ v197 ^ v215 ^ v230, 1);
        v240 = __ROL__(v235, 30);
        v241 = v231 + 3395469782 + v236 + (v238 * 32 | v238 >> 27) + (v234 ^ v235 ^ v237);
        v242 = __ROL__(v194 ^ v200 ^ v218 ^ v233, 1);
        v243 = __ROL__(v238, 30);
        v244 = v234 + 3395469782 + v239 + (v241 * 32 | v241 >> 27) + (v237 ^ v238 ^ v240);
        v245 = __ROL__(v197 ^ v203 ^ v221 ^ v236, 1);
        v246 = __ROL__(v241, 30);
        v247 = v237 + 3395469782 + v242 + (v244 * 32 | v244 >> 27) + (v240 ^ v241 ^ v243);
        v248 = __ROL__(v200 ^ v206 ^ v224 ^ v239, 1);
        v249 = __ROL__(v244, 30);
        v250 = v240 + 3395469782 + v245 + (v247 * 32 | v247 >> 27) + (v243 ^ v244 ^ v246);
        v251 = __ROL__(v203 ^ v209 ^ v227 ^ v242, 1);
        v252 = __ROL__(v247, 30);
        v253 = v243 + 3395469782 + v248 + (v250 * 32 | v250 >> 27) + (v246 ^ v247 ^ v249);
        v254 = __ROL__(v206 ^ v212 ^ v230 ^ v245, 1);
        v255 = __ROL__(v250, 30);
        v256 = v246 + 3395469782 + v251 + (v253 * 32 | v253 >> 27) + (v249 ^ v250 ^ v252);
        v257 = __ROL__(v209 ^ v215 ^ v233 ^ v248, 1);
        v258 = __ROL__(v253, 30);
        v259 = v249 + 3395469782 + v254 + (v256 * 32 | v256 >> 27) + (v252 ^ v253 ^ v255);
        v260 = __ROL__(v212 ^ v218 ^ v236 ^ v251, 1);
        v261 = __ROL__(v256, 30);
        v262 = v252 + 3395469782 + v257 + (v259 * 32 | v259 >> 27) + (v255 ^ v256 ^ v258);
        v263 = __ROL__(v215 ^ v221 ^ v239 ^ v254, 1);
        v264 = __ROL__(v259, 30);
        v265 = v255 + 3395469782 + v260 + (v262 * 32 | v262 >> 27) + (v258 ^ v259 ^ v261);
        v266 = __ROL__(v262, 30);
        v267 = v258 + 3395469782 + v263 + (v265 * 32 | v265 >> 27) + (v261 ^ v262 ^ v264);
        v268 = __ROL__(v265, 30);
        v269 = v261 + 3395469782 + ((v218 ^ v224 ^ v242 ^ v257) * 2 | (v218 ^ v224 ^ v242 ^ v257) >> 31) + (v267 * 32 | v267 >> 27) + (v264 ^ v265 ^ v266);
        v270 = __ROL__(v267, 30);
        v271 = v264 + 3395469782 + ((v221 ^ v227 ^ v245 ^ v260) * 2 | (v221 ^ v227 ^ v245 ^ v260) >> 31) + (v269 * 32 | v269 >> 27) + (v266 ^ v267 ^ v268);
        v25 = v271 + a0->field_4;
        v26 = (v269 * 0x40000000 | v269 >> 2) + a0->field_8;
        v24 = v266 + 3395469782 + ((v224 ^ v230 ^ v248 ^ v263) * 2 | (v224 ^ v230 ^ v248 ^ v263) >> 31) + (v271 * 32 | v271 >> 27) + (v268 ^ v269 ^ v270) + a0->field_0;
        v27 = v270 + a0->field_c;
        v28 = v268 + a0->field_10;
        a0->field_0 = v24;
        a0->field_4 = v25;
        a0->field_8 = v26;
        a0->field_c = v27;
        a0->field_10 = v28;
    } while (i);
    return a0;
}
