/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc189c..0xc3340 (6820 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c189c_2 {
    char field_0;
    char padding_1[1];
    char field_2;
} st_c189c_2;

typedef struct st_c189c_1 {
    unsigned short field_0;
    char field_2;
    char field_3;
} st_c189c_1;

typedef struct st_c189c_3 {
    struct st_c189c_0 *field_0;
} st_c189c_3;

typedef struct st_c189c_0 {
    char field_0;
} st_c189c_0;

extern unsigned long long g_cc0ea0;

unsigned long long sub_c189c(void* a0, unsigned long long a1, unsigned short *a2, long long a3, unsigned int *a4, unsigned long long a5)
{
    void* iter;  // x21
    unsigned int v39;  // x0
    void* v48;  // x28
    st_c189c_1 *v138;  // x16
    void* v139;  // x16
    st_c189c_1 *v140;  // x9
    void* v141;  // x9
    st_c189c_1 *v142;  // x16
    void* v143;  // x9
    st_c189c_1 *v144;  // x16
    void* v145;  // x16
    st_c189c_1 *v146;  // x17
    char v147;  // x13
    unsigned long v49;  // x20
    unsigned long long *v148;  // x17
    unsigned long long *v149;  // x16
    unsigned long long v150;  // x0
    unsigned long long *v151;  // x1
    unsigned int v152;  // w16
    unsigned long v153;  // x0
    unsigned long long v154;  // x17
    st_c189c_1 *v155;  // x16
    void* v156;  // x16
    st_c189c_1 *v157;  // x9
    unsigned long v50;  // x23
    void* v158;  // x9
    st_c189c_1 *v159;  // x16
    void* v160;  // x16
    st_c189c_1 *v161;  // x17
    unsigned long long *v162;  // x10
    unsigned long long *v163;  // x11
    unsigned long long v164;  // x12
    unsigned long v165;  // x11
    unsigned long long *v166;  // x10
    void* v167;  // x10
    unsigned long long v51;  // x0
    char v168;  // x11
    unsigned long long *v169;  // x17
    unsigned long long *v170;  // x16
    unsigned long long v171;  // x0
    unsigned long long *v172;  // x1
    unsigned long long v173;  // x16
    unsigned long v174;  // x0
    unsigned long long v175;  // x17
    st_c189c_1 *v176;  // x16
    st_c189c_1 *v177;  // x12
    unsigned long long v52;  // 4106
    st_c189c_2 *v178;  // x9
    unsigned int v179;  // w9
    unsigned int v180;  // w9
    unsigned long v181;  // x9
    char v182;  // x13
    unsigned long long *v183;  // x17
    unsigned long long *v184;  // x16
    unsigned long long v185;  // x0
    unsigned long long *v186;  // x1
    unsigned int v187;  // w16
    long long v53;  // x23
    unsigned long v188;  // x0
    unsigned long long v189;  // x17
    st_c189c_1 *v190;  // x16
    void* v191;  // x16
    st_c189c_1 *v192;  // x9
    void* v193;  // x9
    st_c189c_1 *v194;  // x16
    void* v195;  // x9
    st_c189c_1 *v196;  // x16
    void* v197;  // x16
    unsigned long long v54;  // x0
    st_c189c_1 *v198;  // x17
    char v199;  // x13
    unsigned long long *v200;  // x17
    unsigned long long *v201;  // x16
    unsigned long long v202;  // x0
    unsigned long long *v203;  // x1
    unsigned int v204;  // w16
    unsigned long v205;  // x0
    unsigned long long v206;  // x17
    st_c189c_1 *v207;  // x16
    unsigned long long v55;  // 4106
    void* v208;  // x16
    st_c189c_1 *v209;  // x9
    void* v210;  // x9
    st_c189c_1 *v211;  // x16
    void* v212;  // x16
    st_c189c_1 *v213;  // x17
    unsigned long long *v214;  // x10
    unsigned long long *v215;  // x11
    unsigned long long v216;  // x12
    unsigned long v217;  // x11
    long long v56;  // x23
    unsigned long long *v218;  // x10
    void* v219;  // x10
    char v220;  // x11
    unsigned long long *v221;  // x17
    unsigned long long *v222;  // x16
    unsigned long long v223;  // x0
    unsigned long long *v224;  // x1
    unsigned int v225;  // x16
    unsigned long v226;  // x0
    unsigned long long v227;  // x17
    unsigned long long v57;  // x0
    st_c189c_1 *v228;  // x16
    st_c189c_1 *v229;  // x12
    st_c189c_2 *v230;  // x9
    unsigned int v231;  // w9
    unsigned int v232;  // w9
    unsigned long v233;  // x9
    char v234;  // x13
    unsigned long long *v235;  // x17
    unsigned long long *v236;  // x16
    unsigned long long v237;  // x0
    unsigned long v40;  // x26
    unsigned long long v58;  // 4106
    unsigned long long *v238;  // x1
    unsigned int v239;  // w16
    unsigned long v240;  // x0
    unsigned long long v241;  // x17
    st_c189c_1 *v242;  // x16
    void* v243;  // x16
    st_c189c_1 *v244;  // x9
    void* v245;  // x9
    st_c189c_1 *v246;  // x16
    void* v247;  // x9
    unsigned long long v59;  // x0
    st_c189c_1 *v248;  // x16
    void* v249;  // x16
    st_c189c_1 *v250;  // x17
    char v251;  // x13
    unsigned long long *v252;  // x17
    unsigned long long *v253;  // x16
    unsigned long long v254;  // x0
    unsigned long long *v255;  // x1
    unsigned int v256;  // w16
    unsigned long v257;  // x0
    unsigned long long v60;  // 4106
    unsigned long long v258;  // x17
    st_c189c_1 *v259;  // x16
    void* v260;  // x16
    st_c189c_1 *v261;  // x9
    void* v262;  // x9
    st_c189c_1 *v263;  // x16
    void* v264;  // x16
    st_c189c_1 *v265;  // x17
    unsigned long long *v266;  // x10
    unsigned long long *v267;  // x11
    void* v61;  // x5
    unsigned long long v268;  // x12
    unsigned long v269;  // x11
    unsigned long long *v270;  // x10
    void* v271;  // x10
    char v272;  // x11
    unsigned long long *v273;  // x17
    unsigned long long *v274;  // x16
    unsigned long long v275;  // x0
    unsigned long long *v276;  // x1
    unsigned int v277;  // x16
    void* node;  // x23
    unsigned long v278;  // x0
    unsigned long long v279;  // x17
    st_c189c_1 *v280;  // x16
    st_c189c_1 *v281;  // x12
    st_c189c_2 *v282;  // x9
    unsigned int v283;  // w9
    unsigned int v284;  // w9
    unsigned long v285;  // x8
    char v286;  // x12
    unsigned long long *v287;  // x16
    void* iter1;  // x26
    unsigned long long *v288;  // x15
    unsigned long long v289;  // x17
    unsigned long long *v290;  // x0
    unsigned int v291;  // w15
    unsigned long v292;  // x17
    unsigned long long v293;  // x16
    st_c189c_1 *v294;  // x15
    void* v295;  // x15
    st_c189c_1 *v296;  // x8
    void* v297;  // x8
    char v64;  // x25
    st_c189c_1 *v298;  // x15
    void* v299;  // x8
    st_c189c_1 *v300;  // x15
    void* v301;  // x15
    st_c189c_1 *v302;  // x16
    char v303;  // x11
    unsigned long long *v304;  // x15
    unsigned long long *v305;  // x14
    unsigned long long v306;  // x16
    unsigned long long *v307;  // x17
    void* iter2;  // x24
    unsigned int v308;  // w14
    unsigned long v309;  // x16
    unsigned long long v310;  // x15
    st_c189c_1 *v311;  // x14
    void* v312;  // x14
    st_c189c_1 *v313;  // x8
    void* v314;  // x8
    st_c189c_1 *v315;  // x14
    void* v316;  // x14
    st_c189c_1 *v317;  // x15
    unsigned long long v66;  // x9
    unsigned long long *v318;  // x9
    unsigned long long *v319;  // x10
    unsigned long long v320;  // x11
    unsigned long v321;  // x10
    unsigned long long *v322;  // x9
    void* v323;  // x9
    char v324;  // x10
    unsigned long long *v325;  // x16
    unsigned long long *v326;  // x15
    unsigned long long v327;  // x17
    unsigned int v67;  // w8
    unsigned long long *v328;  // x0
    unsigned int v329;  // x15
    unsigned long v330;  // x17
    unsigned long long v331;  // x16
    st_c189c_1 *v332;  // x15
    st_c189c_1 *v333;  // x11
    st_c189c_2 *v334;  // x8
    unsigned int v335;  // w8
    unsigned int v336;  // w8
    unsigned int v337;  // w0
    unsigned long v41;  // x25
    st_c189c_1 *v68;  // x10
    unsigned int v338;  // w0
    unsigned int v339;  // w0
    unsigned long long v340;  // x0
    unsigned int v69;  // w13
    unsigned long long v70;  // x8
    void* v71;  // x12
    unsigned int v72;  // w10
    st_c189c_1 *v73;  // x11
    unsigned int v74;  // w14
    unsigned long long v75;  // x10
    unsigned int v76;  // w15
    void* v77;  // x16
    unsigned long v42;  // x22
    st_c189c_1 *v78;  // x11
    unsigned int v79;  // w15
    unsigned long long v80;  // x11
    unsigned int v81;  // w0
    void* v82;  // x17
    st_c189c_1 *v83;  // x1
    unsigned int v84;  // w0
    st_c189c_1 *v85;  // x2
    void* v86;  // x1
    unsigned long v87;  // x2
    long long v43;  // x8
    unsigned int v88;  // w13
    st_c189c_1 *v89;  // x3
    unsigned int v90;  // w14
    void* v91;  // x16
    st_c189c_1 *v92;  // x3
    unsigned int v93;  // w15
    void* v94;  // x17
    st_c189c_1 *v95;  // x3
    unsigned int v96;  // w0
    void* v97;  // x12
    void* v44;  // x27
    st_c189c_1 *v98;  // x2
    void* v99;  // x1
    unsigned int v100;  // w13
    void* v101;  // x12
    st_c189c_1 *v102;  // x2
    unsigned int v103;  // w14
    st_c189c_1 *v104;  // x3
    unsigned long v105;  // x4
    void* v106;  // x16
    unsigned int v107;  // w15
    unsigned long long v45;  // x8
    void* v108;  // x17
    st_c189c_1 *v109;  // x2
    unsigned int v110;  // w0
    st_c189c_1 *v111;  // x9
    unsigned long v112;  // x3
    void* v113;  // x1
    unsigned long v114;  // x2
    st_c189c_1 *v115;  // x8
    st_c189c_1 *v116;  // x8
    st_c189c_1 *v117;  // x8
    void* v46;  // x10
    void* v118;  // x28
    unsigned int v119;  // w0
    unsigned int v120;  // w27
    unsigned int v121;  // w0
    unsigned long long v122;  // 4167
    void* v123;  // x22
    void* v124;  // x7
    void* v125;  // x6
    unsigned long long v126;  // 4162
    unsigned long long v127;  // 4167
    void* v47;  // x9
    unsigned int v128;  // w8
    unsigned long v129;  // x9
    char v130;  // x13
    unsigned long long *v131;  // x17
    unsigned long long *v132;  // x16
    unsigned long long v133;  // x0
    unsigned long long *v134;  // x1
    unsigned int v135;  // w16
    unsigned long v136;  // x0
    unsigned long long v137;  // x17
    unsigned int v0;  // [bp-0x184]
    void* v1;  // [bp-0x180]
    void* v2;  // [bp-0x178]
    unsigned int v3;  // [bp-0x16c]
    void* v4;  // [bp-0x168]
    void* v5;  // [bp-0x160]
    st_c189c_0 **v6;  // [bp-0x158], Other Possible Types: char
    st_c189c_0 *v7;  // [bp-0x150]
    st_c189c_0 **v8;  // [bp-0x148], Other Possible Types: char
    st_c189c_0 *v9;  // [bp-0x140]
    unsigned long long v10;  // [bp-0x138]
    unsigned int v11;  // [bp-0x130]
    unsigned long long *v12;  // [bp-0x128]
    unsigned long long *v13;  // [bp-0x120]
    unsigned long long *v14;  // [bp-0x118]
    unsigned long long v15;  // [bp-0x110]
    unsigned int v16;  // [bp-0x108]
    unsigned long long *v17;  // [bp-0x100]
    unsigned long long *v18;  // [bp-0xf8]
    unsigned long long *v19;  // [bp-0xf0]
    unsigned long long v20;  // [bp-0xe8]
    unsigned int v21;  // [bp-0xe0]
    unsigned long long *v22;  // [bp-0xd8]
    unsigned long long *v23;  // [bp-0xd0]
    unsigned long long *v24;  // [bp-0xc8]
    unsigned long long v25;  // [bp-0xc0]
    unsigned int v26;  // [bp-0xb8]
    unsigned long long *v27;  // [bp-0xb0]
    unsigned long long *v28;  // [bp-0xa8]
    unsigned long long *v29;  // [bp-0xa0]
    st_c189c_0 **v30;  // [bp-0x98], Other Possible Types: st_c189c_3 **, char
    st_c189c_0 *v31;  // [bp-0x90], Other Possible Types: st_c189c_3 **
    st_c189c_3 **v32;  // [bp-0x88]
    st_c189c_3 **v33;  // [bp-0x80]
    char *v34;  // [bp-0x78]
    st_c189c_0 **v35;  // [bp-0x70]
    char *v36;  // [bp-0x10]
    char v37;  // [bp+0x0]

    v36 = &v37;
    iter = a0;
    v7 = &v6;
    v6 = &v7;
    if (!(a5 >> 5 & 1))
    {
        v39 = sub_c0504(iter, a1, a2, a3, a4);
        if (v39)
            return v39;
    }
    v9 = &v8;
    v8 = &v9;
    if (a1 < 6)
    {
        return 0xffffffffffffffec;
    }
    else if ((unsigned long long)a3 >= 10)
    {
        v40 = *a2;
        v41 = a2[1];
        v42 = a2[2];
        v43 = v40 + v41 + v42 + 6;
        if ((unsigned long long)a3 < (unsigned long long)v43)
            return 0xffffffffffffffec;
        v44 = iter + a1;
        v45 = a1 + 3 >> 2;
        v46 = iter + v45;
        v47 = v46 + v45;
        v48 = v47 + v45;
        if (v44 < v48)
            return 0xffffffffffffffec;
        v4 = v46;
        v5 = v47;
        v49 = a4 + 1;
        v3 = *a4;
        v50 = a2 + 3;
        v51 = sub_c02c0(&v25, v50, v40);
        v52 = arm64g_calculate_condition(130, v51, 120, 0);
        if (v52 & 1)
            return v51;
        v53 = v50 + v40;
        v54 = sub_c02c0(&v20, v53, v41);
        v55 = arm64g_calculate_condition(130, v54, 120, 0);
        if (v55 & 1)
            return v54;
        v56 = v53 + v41;
        v57 = sub_c02c0(&v15, v56, v42);
        v58 = arm64g_calculate_condition(130, v57, 120, 0);
        if (v58 & 1)
            return v57;
        v59 = sub_c02c0(&v10, v56 + v42, a3 - v43);
        v60 = arm64g_calculate_condition(130, v59, 120, 0);
        if (v60 & 1)
            return v59;
        v61 = v44 - 7;
        v1 = v44;
        v2 = v48;
        v0 = v3 >> 16;
        if (v44 - v48 >= 8)
        {
            node = v4;
            iter1 = v5;
            if (v61 <= v48)
                goto LABEL_c1cd4;
            v64 = (char)-v0 & 63;
            iter2 = v48;
            do
            {
                v66 = v25;
                v67 = v26;
                v68 = v49 + (v66 << ((char)v67 & 63) >> (v64 & 63)) * 4;
                *(unsigned short *)iter = v68->field_0;
                v69 = v67 + v68->field_2;
                v70 = v20;
                v71 = iter + v68->field_3;
                v72 = v21;
                v73 = v49 + (v70 << ((char)v72 & 63) >> (v64 & 63)) * 4;
                *(unsigned short *)node = v73->field_0;
                v74 = v72 + v73->field_2;
                v75 = v15;
                v76 = v16;
                v77 = node + v73->field_3;
                v78 = v49 + (v75 << ((char)v76 & 63) >> (v64 & 63)) * 4;
                *(unsigned short *)iter1 = v78->field_0;
                v79 = v76 + v78->field_2;
                v80 = v10;
                v81 = v11;
                v82 = iter1 + v78->field_3;
                v83 = v49 + (v80 << ((char)v81 & 63) >> (v64 & 63)) * 4;
                *(unsigned short *)iter2 = v83->field_0;
                v84 = v81 + v83->field_2;
                v85 = v49 + (v66 << ((char)v69 & 63) >> (v64 & 63)) * 4;
                v86 = iter2 + v83->field_3;
                *(unsigned short *)v71 = v85->field_0;
                v87 = v85->field_3;
                v88 = v69 + v85->field_2;
                v89 = v49 + (v70 << ((char)v74 & 63) >> (v64 & 63)) * 4;
                *(unsigned short *)v77 = v89->field_0;
                v90 = v74 + v89->field_2;
                v91 = v77 + v89->field_3;
                v92 = v49 + (v75 << ((char)v79 & 63) >> (v64 & 63)) * 4;
                *(unsigned short *)v82 = v92->field_0;
                v93 = v79 + v92->field_2;
                v94 = v82 + v92->field_3;
                v95 = v49 + (v80 << ((char)v84 & 63) >> (v64 & 63)) * 4;
                *(unsigned short *)v86 = v95->field_0;
                v96 = v84 + v95->field_2;
                v97 = v71 + v87;
                v98 = v49 + (v66 << ((char)v88 & 63) >> (v64 & 63)) * 4;
                v99 = v86 + v95->field_3;
                *(unsigned short *)v97 = v98->field_0;
                v100 = v88 + v98->field_2;
                v101 = v97 + v98->field_3;
                v102 = v49 + (v70 << ((char)v90 & 63) >> (v64 & 63)) * 4;
                *(unsigned short *)v91 = v102->field_0;
                v103 = v90 + v102->field_2;
                v104 = v49 + (v75 << ((char)v93 & 63) >> (v64 & 63)) * 4;
                v105 = v104->field_0;
                v106 = v91 + v102->field_3;
                *(unsigned short *)v94 = v105;
                v107 = v93 + v104->field_2;
                v108 = v94 + v104->field_3;
                v109 = v49 + (v80 << ((char)v96 & 63) >> (v64 & 63)) * 4;
                *(unsigned short *)v99 = v109->field_0;
                v110 = v96 + v109->field_2;
                v111 = v49 + (v66 << ((char)v100 & 63) >> (v64 & 63)) * 4;
                v112 = v111->field_0;
                v113 = v99 + v109->field_3;
                *(unsigned short *)v101 = v112;
                v114 = v111->field_2;
                iter = v101 + v111->field_3;
                v26 = v100 + (unsigned int)v114;
                v115 = v49 + (v70 << ((char)v103 & 63) >> (v64 & 63)) * 4;
                *(unsigned short *)v106 = v115->field_0;
                node = v106 + v115->field_3;
                v21 = v103 + v115->field_2;
                v116 = v49 + (v75 << ((char)v107 & 63) >> (v64 & 63)) * 4;
                *(unsigned short *)v108 = v116->field_0;
                iter1 = v108 + v116->field_3;
                v117 = v49 + (v80 << ((char)v110 & 63) >> (v64 & 63)) * 4;
                v16 = v107 + v116->field_2;
                *(unsigned short *)v113 = v117->field_0;
                iter2 = v113 + v117->field_3;
                v11 = v110 + v117->field_2;
                v118 = v61;
                v119 = sub_c4538(&v25, v113, v114, v112, v105);
                v120 = sub_c4538(&v20) | v119;
                v121 = sub_c4538(&v15);
                v61 = v118;
                v122 = arm64g_calculate_condition((iter2 < v118 ? 3 : 0), (iter2 < v118 ? v120 | v121 | sub_c4538(&v10) : 0), 0, 0);
            } while (v122 & 1);
        }
        else
        {
            iter1 = v5;
            node = v4;
LABEL_c1cd4:
            iter2 = v48;
        }
        v123 = v4;
        v124 = v5;
        v125 = v2;
        v126 = arm64g_calculate_condition((iter <= v123 ? 4 : 0) | 144, (iter <= v123 ? node : 0x20000000), (iter <= v123 ? v124 : 0), 0);
        v127 = arm64g_calculate_condition((v126 & 1 ? 4 : 0) | 144, (v126 & 1 ? iter1 : 0x20000000), (v126 & 1 ? v125 : 0), 0);
        if (!(v127 & 1))
            return 0xffffffffffffffec;
        v128 = (v3 * 0x10000 | v3 >> 16) & 0xffff00ff & 0xff;
        v31 = &v30;
        v30 = &v31;
        if (v123 - iter >= 8)
        {
            v0 = v0;
            if (12 > v128)
            {
                v32 = &v33;
                v33 = &v32;
                v129 = v26;
                if (64 >= (unsigned int)v129)
                {
                    v130 = (char)-v0 & 63;
                    do
                    {
                        v131 = v27;
                        if (v29 > v131)
                        {
                            v132 = v28;
                            if (v131 == v132)
                                goto LABEL_c20dc;
                            v133 = (unsigned int)v129 >> 3;
                            v134 = (char *)v131 - v133;
                            v135 = v134 >= v132;
                            v136 = (v132 <= v134 ? (unsigned int)v133 : (unsigned int)(v131 - v132));
                            v27 = (char *)v131 - v136;
                            v129 = (unsigned int)v129 - (unsigned int)v136 * 8;
                            v26 = v129;
                            v137 = *v27;
                            v25 = v137;
                        }
                        else
                        {
                            v34 = &v35;
                            v35 = &v34;
                            v27 = (char *)v131 - ((unsigned int)v129 >> 3);
                            v129 = (unsigned int)v129 & 7;
                            v26 = v129;
                            v137 = *v27;
                            v25 = v137;
                            v135 = 1;
                        }
                        if (v123 - 9 <= iter || !v135)
                            goto LABEL_c20dc;
                        v138 = v49 + (v137 << ((char)v129 & 63) >> (v130 & 63)) * 4;
                        *(unsigned short *)iter = v138->field_0;
                        v26 = (unsigned int)v129 + v138->field_2;
                        v139 = iter + v138->field_3;
                        v140 = v49 + (v25 << ((char)v26 & 63) >> (v130 & 63)) * 4;
                        *(unsigned short *)v139 = v140->field_0;
                        v26 += v140->field_2;
                        v141 = v139 + v140->field_3;
                        v142 = v49 + (v25 << ((char)v26 & 63) >> (v130 & 63)) * 4;
                        *(unsigned short *)v141 = v142->field_0;
                        v26 += v142->field_2;
                        v143 = v141 + v142->field_3;
                        v144 = v49 + (v25 << ((char)v26 & 63) >> (v130 & 63)) * 4;
                        *(unsigned short *)v143 = v144->field_0;
                        v26 += v144->field_2;
                        v145 = v143 + v144->field_3;
                        v146 = v49 + (v25 << ((char)v26 & 63) >> (v130 & 63)) * 4;
                        *(unsigned short *)v145 = v146->field_0;
                        v129 = v26 + v146->field_2;
                        v26 = v129;
                        iter = v145 + v146->field_3;
                        v32 = &v33;
                        v33 = &v32;
                    } while ((unsigned int)v129 <= 64);
                }
            }
            else
            {
                v32 = &v33;
                v33 = &v32;
                v129 = v26;
                if (64 >= (unsigned int)v129)
                {
                    v147 = (char)-v0 & 63;
                    do
                    {
                        v148 = v27;
                        if (v29 > v148)
                        {
                            v149 = v28;
                            if (v148 == v149)
                                goto LABEL_c20dc;
                            v150 = (unsigned int)v129 >> 3;
                            v151 = (char *)v148 - v150;
                            v152 = v151 >= v149;
                            v153 = (v149 <= v151 ? (unsigned int)v150 : (unsigned int)(v148 - v149));
                            v27 = (char *)v148 - v153;
                            v129 = (unsigned int)v129 - (unsigned int)v153 * 8;
                            v26 = v129;
                            v154 = *v27;
                            v25 = v154;
                        }
                        else
                        {
                            v34 = &v35;
                            v35 = &v34;
                            v27 = (char *)v148 - ((unsigned int)v129 >> 3);
                            v129 = (unsigned int)v129 & 7;
                            v26 = v129;
                            v154 = *v27;
                            v25 = v154;
                            v152 = 1;
                        }
                        if (v123 - 7 <= iter || !v152)
                            goto LABEL_c20dc;
                        v155 = v49 + (v154 << ((char)v129 & 63) >> (v147 & 63)) * 4;
                        *(unsigned short *)iter = v155->field_0;
                        v26 = (unsigned int)v129 + v155->field_2;
                        v156 = iter + v155->field_3;
                        v157 = v49 + (v25 << ((char)v26 & 63) >> (v147 & 63)) * 4;
                        *(unsigned short *)v156 = v157->field_0;
                        v26 += v157->field_2;
                        v158 = v156 + v157->field_3;
                        v159 = v49 + (v25 << ((char)v26 & 63) >> (v147 & 63)) * 4;
                        *(unsigned short *)v158 = v159->field_0;
                        v26 += v159->field_2;
                        v160 = v158 + v159->field_3;
                        v161 = v49 + (v25 << ((char)v26 & 63) >> (v147 & 63)) * 4;
                        *(unsigned short *)v160 = v161->field_0;
                        v129 = v26 + v161->field_2;
                        v26 = v129;
                        iter = v160 + v161->field_3;
                        v32 = &v33;
                        v33 = &v32;
                    } while ((unsigned int)v129 <= 64);
                }
            }
            v27 = &g_cc0ea0;
        }
        else
        {
            v33 = &v32;
            v32 = &v33;
            v129 = v26;
            if (65 > (unsigned int)v129)
            {
                v162 = v27;
                if (v29 > v162)
                {
                    v163 = v28;
                    if (v162 == v163)
                        goto LABEL_c20dc;
                    v164 = v129 >> 3;
                    v165 = ((char *)v162 - v164 < v163 ? (unsigned int)(v162 - v163) : (unsigned int)v164);
                    v166 = (char *)v162 - v165;
                    v27 = v166;
                    v129 = (unsigned int)v129 - (unsigned int)v165 * 8;
                }
                else
                {
                    v35 = &v34;
                    v34 = &v35;
                    v166 = (char *)v162 - (v129 >> 3);
                    v27 = v166;
                    v129 = (unsigned int)v129 & 7;
                }
                v26 = v129;
                v25 = *v166;
            }
            else
            {
                v27 = &g_cc0ea0;
            }
        }
LABEL_c20dc:
        if (v123 - iter >= 2)
        {
            v167 = v123 - 2;
            v168 = (char)-v0 & 63;
            v32 = &v33;
            v33 = &v32;
            if (64 >= (unsigned int)v129)
            {
                do
                {
                    v169 = v27;
                    if (v29 > v169)
                    {
                        v170 = v28;
                        if (v169 == v170)
                            goto LABEL_c21dc;
                        v171 = (unsigned int)v129 >> 3;
                        v172 = (char *)v169 - v171;
                        v173 = v172 >= v170;
                        v174 = (v170 <= v172 ? (unsigned int)v171 : (unsigned int)(v169 - v170));
                        v27 = (char *)v169 - v174;
                        v129 = (unsigned int)v129 - (unsigned int)v174 * 8;
                        v26 = v129;
                        v175 = *v27;
                        v25 = v175;
                    }
                    else
                    {
                        v34 = &v35;
                        v35 = &v34;
                        v27 = (char *)v169 - ((unsigned int)v129 >> 3);
                        v129 = (unsigned int)v129 & 7;
                        v26 = v129;
                        v175 = *v27;
                        v25 = v175;
                        v173 = 1;
                    }
                    if (v167 < iter || !(v173 & 1))
LABEL_c21dc:
                    v176 = v49 + (v175 << ((char)v129 & 63) >> (v168 & 63)) * 4;
                    *(unsigned short *)iter = v176->field_0;
                    v129 = v26 + v176->field_2;
                    v26 = v129;
                    iter += v176->field_3;
                    v32 = &v33;
                    v33 = &v32;
                } while ((unsigned int)v129 <= 64);
            }
            for (v27 = &g_cc0ea0; iter <= v167; iter += v177->field_3)
            {
                v177 = v49 + (v25 << ((char)v129 & 63) >> (v168 & 63)) * 4;
                *(unsigned short *)iter = v177->field_0;
                v26 += v177->field_2;
            }
        }
        if (v123 > iter)
        {
            v178 = v49 + (v25 << ((char)v129 & 63) >> ((char)-v0 & 63)) * 4;
            *(char *)iter = v178->field_0;
            if (v178[1].field_0 == 1)
            {
                v179 = v26 + v178->field_2;
            }
            else
            {
                if (63 < v26)
                    goto LABEL_c227c;
                v180 = v26 + v178->field_2;
                v179 = (v180 < 64 ? v180 : 64);
            }
            v26 = v179;
        }
LABEL_c227c:
        v31 = &v30;
        v30 = &v31;
        if (v124 - node >= 8)
        {
            if (12 > v128)
            {
                v32 = &v33;
                v33 = &v32;
                v181 = v21;
                if (64 >= (unsigned int)v181)
                {
                    v182 = (char)-v0 & 63;
                    do
                    {
                        v183 = v22;
                        if (v24 > v183)
                        {
                            v184 = v23;
                            if (v183 == v184)
                                goto LABEL_c2644;
                            v185 = (unsigned int)v181 >> 3;
                            v186 = (char *)v183 - v185;
                            v187 = v186 >= v184;
                            v188 = (v184 <= v186 ? (unsigned int)v185 : (unsigned int)(v183 - v184));
                            v22 = (char *)v183 - v188;
                            v181 = (unsigned int)v181 - (unsigned int)v188 * 8;
                            v21 = v181;
                            v189 = *v22;
                            v20 = v189;
                        }
                        else
                        {
                            v34 = &v35;
                            v35 = &v34;
                            v22 = (char *)v183 - ((unsigned int)v181 >> 3);
                            v181 = (unsigned int)v181 & 7;
                            v21 = v181;
                            v189 = *v22;
                            v20 = v189;
                            v187 = 1;
                        }
                        if (v124 - 9 <= node || !v187)
                            goto LABEL_c2644;
                        v190 = v49 + (v189 << ((char)v181 & 63) >> (v182 & 63)) * 4;
                        *(unsigned short *)node = v190->field_0;
                        v21 = (unsigned int)v181 + v190->field_2;
                        v191 = node + v190->field_3;
                        v192 = v49 + (v20 << ((char)v21 & 63) >> (v182 & 63)) * 4;
                        *(unsigned short *)v191 = v192->field_0;
                        v21 += v192->field_2;
                        v193 = v191 + v192->field_3;
                        v194 = v49 + (v20 << ((char)v21 & 63) >> (v182 & 63)) * 4;
                        *(unsigned short *)v193 = v194->field_0;
                        v21 += v194->field_2;
                        v195 = v193 + v194->field_3;
                        v196 = v49 + (v20 << ((char)v21 & 63) >> (v182 & 63)) * 4;
                        *(unsigned short *)v195 = v196->field_0;
                        v21 += v196->field_2;
                        v197 = v195 + v196->field_3;
                        v198 = v49 + (v20 << ((char)v21 & 63) >> (v182 & 63)) * 4;
                        *(unsigned short *)v197 = v198->field_0;
                        v181 = v21 + v198->field_2;
                        v21 = v181;
                        node = v197 + v198->field_3;
                        v32 = &v33;
                        v33 = &v32;
                    } while ((unsigned int)v181 <= 64);
                }
            }
            else
            {
                v32 = &v33;
                v33 = &v32;
                v181 = v21;
                if (64 >= (unsigned int)v181)
                {
                    v199 = (char)-v0 & 63;
                    do
                    {
                        v200 = v22;
                        if (v24 > v200)
                        {
                            v201 = v23;
                            if (v200 == v201)
                                goto LABEL_c2644;
                            v202 = (unsigned int)v181 >> 3;
                            v203 = (char *)v200 - v202;
                            v204 = v203 >= v201;
                            v205 = (v201 <= v203 ? (unsigned int)v202 : (unsigned int)(v200 - v201));
                            v22 = (char *)v200 - v205;
                            v181 = (unsigned int)v181 - (unsigned int)v205 * 8;
                            v21 = v181;
                            v206 = *v22;
                            v20 = v206;
                        }
                        else
                        {
                            v34 = &v35;
                            v35 = &v34;
                            v22 = (char *)v200 - ((unsigned int)v181 >> 3);
                            v181 = (unsigned int)v181 & 7;
                            v21 = v181;
                            v206 = *v22;
                            v20 = v206;
                            v204 = 1;
                        }
                        if (v124 - 7 <= node || !v204)
                            goto LABEL_c2644;
                        v207 = v49 + (v206 << ((char)v181 & 63) >> (v199 & 63)) * 4;
                        *(unsigned short *)node = v207->field_0;
                        v21 = (unsigned int)v181 + v207->field_2;
                        v208 = node + v207->field_3;
                        v209 = v49 + (v20 << ((char)v21 & 63) >> (v199 & 63)) * 4;
                        *(unsigned short *)v208 = v209->field_0;
                        v21 += v209->field_2;
                        v210 = v208 + v209->field_3;
                        v211 = v49 + (v20 << ((char)v21 & 63) >> (v199 & 63)) * 4;
                        *(unsigned short *)v210 = v211->field_0;
                        v21 += v211->field_2;
                        v212 = v210 + v211->field_3;
                        v213 = v49 + (v20 << ((char)v21 & 63) >> (v199 & 63)) * 4;
                        *(unsigned short *)v212 = v213->field_0;
                        v181 = v21 + v213->field_2;
                        v21 = v181;
                        node = v212 + v213->field_3;
                        v32 = &v33;
                        v33 = &v32;
                    } while ((unsigned int)v181 <= 64);
                }
            }
            v22 = &g_cc0ea0;
        }
        else
        {
            v33 = &v32;
            v32 = &v33;
            v181 = v21;
            if (65 > (unsigned int)v181)
            {
                v214 = v22;
                if (v24 > v214)
                {
                    v215 = v23;
                    if (v214 == v215)
                        goto LABEL_c2644;
                    v216 = v181 >> 3;
                    v217 = ((char *)v214 - v216 < v215 ? (unsigned int)(v214 - v215) : (unsigned int)v216);
                    v218 = (char *)v214 - v217;
                    v22 = v218;
                    v181 = (unsigned int)v181 - (unsigned int)v217 * 8;
                }
                else
                {
                    v35 = &v34;
                    v34 = &v35;
                    v218 = (char *)v214 - (v181 >> 3);
                    v22 = v218;
                    v181 = (unsigned int)v181 & 7;
                }
                v21 = v181;
                v20 = *v218;
            }
            else
            {
                v22 = &g_cc0ea0;
            }
        }
LABEL_c2644:
        if (v124 - node >= 2)
        {
            v219 = v124 - 2;
            v220 = (char)-v0 & 63;
            v32 = &v33;
            v33 = &v32;
            if (64 >= (unsigned int)v181)
            {
                do
                {
                    v221 = v22;
                    if (v24 > v221)
                    {
                        v222 = v23;
                        if (v221 == v222)
                            goto LABEL_c2744;
                        v223 = (unsigned int)v181 >> 3;
                        v224 = (char *)v221 - v223;
                        v225 = v224 >= v222;
                        v226 = (v222 <= v224 ? (unsigned int)v223 : (unsigned int)(v221 - v222));
                        v22 = (char *)v221 - v226;
                        v181 = (unsigned int)v181 - (unsigned int)v226 * 8;
                        v21 = v181;
                        v227 = *v22;
                        v20 = v227;
                    }
                    else
                    {
                        v34 = &v35;
                        v35 = &v34;
                        v22 = (char *)v221 - ((unsigned int)v181 >> 3);
                        v181 = (unsigned int)v181 & 7;
                        v21 = v181;
                        v227 = *v22;
                        v20 = v227;
                        v225 = 1;
                    }
                    if (v219 < node || !(v225 & 1))
LABEL_c2744:
                    v228 = v49 + (v227 << ((char)v181 & 63) >> (v220 & 63)) * 4;
                    *(unsigned short *)node = v228->field_0;
                    v181 = v21 + v228->field_2;
                    v21 = v181;
                    node += v228->field_3;
                    v32 = &v33;
                    v33 = &v32;
                } while ((unsigned int)v181 <= 64);
            }
            for (v22 = &g_cc0ea0; node <= v219; node += v229->field_3)
            {
                v229 = v49 + (v20 << ((char)v181 & 63) >> (v220 & 63)) * 4;
                *(unsigned short *)node = v229->field_0;
                v21 += v229->field_2;
            }
        }
        if (v124 > node)
        {
            v230 = v49 + (v20 << ((char)v181 & 63) >> ((char)-v0 & 63)) * 4;
            *(char *)node = v230->field_0;
            if (v230[1].field_0 == 1)
            {
                v231 = v21 + v230->field_2;
            }
            else
            {
                if (63 < v21)
                    goto LABEL_c27e4;
                v232 = v21 + v230->field_2;
                v231 = (v232 < 64 ? v232 : 64);
            }
            v21 = v231;
        }
LABEL_c27e4:
        v31 = &v30;
        v30 = &v31;
        if (v125 - iter1 >= 8)
        {
            if (12 > v128)
            {
                v32 = &v33;
                v33 = &v32;
                v233 = v16;
                if (64 >= (unsigned int)v233)
                {
                    v234 = (char)-v0 & 63;
                    do
                    {
                        v235 = v17;
                        if (v19 > v235)
                        {
                            v236 = v18;
                            if (v235 == v236)
                                goto LABEL_c2bac;
                            v237 = (unsigned int)v233 >> 3;
                            v238 = (char *)v235 - v237;
                            v239 = v238 >= v236;
                            v240 = (v236 <= v238 ? (unsigned int)v237 : (unsigned int)(v235 - v236));
                            v17 = (char *)v235 - v240;
                            v233 = (unsigned int)v233 - (unsigned int)v240 * 8;
                            v16 = v233;
                            v241 = *v17;
                            v15 = v241;
                        }
                        else
                        {
                            v34 = &v35;
                            v35 = &v34;
                            v17 = (char *)v235 - ((unsigned int)v233 >> 3);
                            v233 = (unsigned int)v233 & 7;
                            v16 = v233;
                            v241 = *v17;
                            v15 = v241;
                            v239 = 1;
                        }
                        if (v125 - 9 <= iter1 || !v239)
                            goto LABEL_c2bac;
                        v242 = v49 + (v241 << ((char)v233 & 63) >> (v234 & 63)) * 4;
                        *(unsigned short *)iter1 = v242->field_0;
                        v16 = (unsigned int)v233 + v242->field_2;
                        v243 = iter1 + v242->field_3;
                        v244 = v49 + (v15 << ((char)v16 & 63) >> (v234 & 63)) * 4;
                        *(unsigned short *)v243 = v244->field_0;
                        v16 += v244->field_2;
                        v245 = v243 + v244->field_3;
                        v246 = v49 + (v15 << ((char)v16 & 63) >> (v234 & 63)) * 4;
                        *(unsigned short *)v245 = v246->field_0;
                        v16 += v246->field_2;
                        v247 = v245 + v246->field_3;
                        v248 = v49 + (v15 << ((char)v16 & 63) >> (v234 & 63)) * 4;
                        *(unsigned short *)v247 = v248->field_0;
                        v16 += v248->field_2;
                        v249 = v247 + v248->field_3;
                        v250 = v49 + (v15 << ((char)v16 & 63) >> (v234 & 63)) * 4;
                        *(unsigned short *)v249 = v250->field_0;
                        v233 = v16 + v250->field_2;
                        v16 = v233;
                        iter1 = v249 + v250->field_3;
                        v32 = &v33;
                        v33 = &v32;
                    } while ((unsigned int)v233 <= 64);
                }
            }
            else
            {
                v32 = &v33;
                v33 = &v32;
                v233 = v16;
                if (64 >= (unsigned int)v233)
                {
                    v251 = (char)-v0 & 63;
                    do
                    {
                        v252 = v17;
                        if (v19 > v252)
                        {
                            v253 = v18;
                            if (v252 == v253)
                                goto LABEL_c2bac;
                            v254 = (unsigned int)v233 >> 3;
                            v255 = (char *)v252 - v254;
                            v256 = v255 >= v253;
                            v257 = (v253 <= v255 ? (unsigned int)v254 : (unsigned int)(v252 - v253));
                            v17 = (char *)v252 - v257;
                            v233 = (unsigned int)v233 - (unsigned int)v257 * 8;
                            v16 = v233;
                            v258 = *v17;
                            v15 = v258;
                        }
                        else
                        {
                            v34 = &v35;
                            v35 = &v34;
                            v17 = (char *)v252 - ((unsigned int)v233 >> 3);
                            v233 = (unsigned int)v233 & 7;
                            v16 = v233;
                            v258 = *v17;
                            v15 = v258;
                            v256 = 1;
                        }
                        if (v125 - 7 <= iter1 || !v256)
                            goto LABEL_c2bac;
                        v259 = v49 + (v258 << ((char)v233 & 63) >> (v251 & 63)) * 4;
                        *(unsigned short *)iter1 = v259->field_0;
                        v16 = (unsigned int)v233 + v259->field_2;
                        v260 = iter1 + v259->field_3;
                        v261 = v49 + (v15 << ((char)v16 & 63) >> (v251 & 63)) * 4;
                        *(unsigned short *)v260 = v261->field_0;
                        v16 += v261->field_2;
                        v262 = v260 + v261->field_3;
                        v263 = v49 + (v15 << ((char)v16 & 63) >> (v251 & 63)) * 4;
                        *(unsigned short *)v262 = v263->field_0;
                        v16 += v263->field_2;
                        v264 = v262 + v263->field_3;
                        v265 = v49 + (v15 << ((char)v16 & 63) >> (v251 & 63)) * 4;
                        *(unsigned short *)v264 = v265->field_0;
                        v233 = v16 + v265->field_2;
                        v16 = v233;
                        iter1 = v264 + v265->field_3;
                        v32 = &v33;
                        v33 = &v32;
                    } while ((unsigned int)v233 <= 64);
                }
            }
            v17 = &g_cc0ea0;
        }
        else
        {
            v33 = &v32;
            v32 = &v33;
            v233 = v16;
            if (65 > (unsigned int)v233)
            {
                v266 = v17;
                if (v19 > v266)
                {
                    v267 = v18;
                    if (v266 == v267)
                        goto LABEL_c2bac;
                    v268 = v233 >> 3;
                    v269 = ((char *)v266 - v268 < v267 ? (unsigned int)(v266 - v267) : (unsigned int)v268);
                    v270 = (char *)v266 - v269;
                    v17 = v270;
                    v233 = (unsigned int)v233 - (unsigned int)v269 * 8;
                }
                else
                {
                    v35 = &v34;
                    v34 = &v35;
                    v270 = (char *)v266 - (v233 >> 3);
                    v17 = v270;
                    v233 = (unsigned int)v233 & 7;
                }
                v16 = v233;
                v15 = *v270;
            }
            else
            {
                v17 = &g_cc0ea0;
            }
        }
LABEL_c2bac:
        if (v125 - iter1 >= 2)
        {
            v271 = v125 - 2;
            v272 = (char)-v0 & 63;
            v32 = &v33;
            v33 = &v32;
            if (64 >= (unsigned int)v233)
            {
                do
                {
                    v273 = v17;
                    if (v19 > v273)
                    {
                        v274 = v18;
                        if (v273 == v274)
                            goto LABEL_c2cac;
                        v275 = (unsigned int)v233 >> 3;
                        v276 = (char *)v273 - v275;
                        v277 = v276 >= v274;
                        v278 = (v274 <= v276 ? (unsigned int)v275 : (unsigned int)(v273 - v274));
                        v17 = (char *)v273 - v278;
                        v233 = (unsigned int)v233 - (unsigned int)v278 * 8;
                        v16 = v233;
                        v279 = *v17;
                        v15 = v279;
                    }
                    else
                    {
                        v34 = &v35;
                        v35 = &v34;
                        v17 = (char *)v273 - ((unsigned int)v233 >> 3);
                        v233 = (unsigned int)v233 & 7;
                        v16 = v233;
                        v279 = *v17;
                        v15 = v279;
                        v277 = 1;
                    }
                    if (v271 < iter1 || !(v277 & 1))
LABEL_c2cac:
                    v280 = v49 + (v279 << ((char)v233 & 63) >> (v272 & 63)) * 4;
                    *(unsigned short *)iter1 = v280->field_0;
                    v233 = v16 + v280->field_2;
                    v16 = v233;
                    iter1 += v280->field_3;
                    v32 = &v33;
                    v33 = &v32;
                } while ((unsigned int)v233 <= 64);
            }
            for (v17 = &g_cc0ea0; iter1 <= v271; iter1 += v281->field_3)
            {
                v281 = v49 + (v15 << ((char)v233 & 63) >> (v272 & 63)) * 4;
                *(unsigned short *)iter1 = v281->field_0;
                v16 += v281->field_2;
            }
        }
        if (v125 > iter1)
        {
            v282 = v49 + (v15 << ((char)v233 & 63) >> ((char)-v0 & 63)) * 4;
            *(char *)iter1 = v282->field_0;
            if (v282[1].field_0 == 1)
            {
                v283 = v16 + v282->field_2;
            }
            else
            {
                if (63 < v16)
                    goto LABEL_c2d4c;
                v284 = v16 + v282->field_2;
                v283 = (v284 < 64 ? v284 : 64);
            }
            v16 = v283;
        }
LABEL_c2d4c:
        v31 = &v30;
        v30 = &v31;
        if (v1 - iter2 >= 8)
        {
            if (12 > v128)
            {
                v32 = &v33;
                v33 = &v32;
                v285 = v11;
                if (64 >= (unsigned int)v285)
                {
                    v286 = (char)-v0 & 63;
                    do
                    {
                        v287 = v12;
                        if (v14 > v287)
                        {
                            v288 = v13;
                            if (v287 == v288)
                                goto LABEL_c3100;
                            v289 = (unsigned int)v285 >> 3;
                            v290 = (char *)v287 - v289;
                            v291 = v290 >= v288;
                            v292 = (v288 <= v290 ? (unsigned int)v289 : (unsigned int)(v287 - v288));
                            v12 = (char *)v287 - v292;
                            v285 = (unsigned int)v285 - (unsigned int)v292 * 8;
                            v11 = v285;
                            v293 = *v12;
                            v10 = v293;
                        }
                        else
                        {
                            v34 = &v35;
                            v35 = &v34;
                            v12 = (char *)v287 - ((unsigned int)v285 >> 3);
                            v285 = (unsigned int)v285 & 7;
                            v11 = v285;
                            v293 = *v12;
                            v10 = v293;
                            v291 = 1;
                        }
                        if (v1 - 9 <= iter2 || !v291)
                            goto LABEL_c3100;
                        v294 = v49 + (v293 << ((char)v285 & 63) >> (v286 & 63)) * 4;
                        *(unsigned short *)iter2 = v294->field_0;
                        v11 = (unsigned int)v285 + v294->field_2;
                        v295 = iter2 + v294->field_3;
                        v296 = v49 + (v10 << ((char)v11 & 63) >> (v286 & 63)) * 4;
                        *(unsigned short *)v295 = v296->field_0;
                        v11 += v296->field_2;
                        v297 = v295 + v296->field_3;
                        v298 = v49 + (v10 << ((char)v11 & 63) >> (v286 & 63)) * 4;
                        *(unsigned short *)v297 = v298->field_0;
                        v11 += v298->field_2;
                        v299 = v297 + v298->field_3;
                        v300 = v49 + (v10 << ((char)v11 & 63) >> (v286 & 63)) * 4;
                        *(unsigned short *)v299 = v300->field_0;
                        v11 += v300->field_2;
                        v301 = v299 + v300->field_3;
                        v302 = v49 + (v10 << ((char)v11 & 63) >> (v286 & 63)) * 4;
                        *(unsigned short *)v301 = v302->field_0;
                        v285 = v11 + v302->field_2;
                        v11 = v285;
                        iter2 = v301 + v302->field_3;
                        v32 = &v33;
                        v33 = &v32;
                    } while ((unsigned int)v285 <= 64);
                }
            }
            else
            {
                v32 = &v33;
                v33 = &v32;
                v285 = v11;
                if (64 >= (unsigned int)v285)
                {
                    v303 = (char)-v0 & 63;
                    do
                    {
                        v304 = v12;
                        if (v14 > v304)
                        {
                            v305 = v13;
                            if (v304 == v305)
                                goto LABEL_c3100;
                            v306 = (unsigned int)v285 >> 3;
                            v307 = (char *)v304 - v306;
                            v308 = v307 >= v305;
                            v309 = (v305 <= v307 ? (unsigned int)v306 : (unsigned int)(v304 - v305));
                            v12 = (char *)v304 - v309;
                            v285 = (unsigned int)v285 - (unsigned int)v309 * 8;
                            v11 = v285;
                            v310 = *v12;
                            v10 = v310;
                        }
                        else
                        {
                            v34 = &v35;
                            v35 = &v34;
                            v12 = (char *)v304 - ((unsigned int)v285 >> 3);
                            v285 = (unsigned int)v285 & 7;
                            v11 = v285;
                            v310 = *v12;
                            v10 = v310;
                            v308 = 1;
                        }
                        if (v61 <= iter2 || !v308)
                            goto LABEL_c3100;
                        v311 = v49 + (v310 << ((char)v285 & 63) >> (v303 & 63)) * 4;
                        *(unsigned short *)iter2 = v311->field_0;
                        v11 = (unsigned int)v285 + v311->field_2;
                        v312 = iter2 + v311->field_3;
                        v313 = v49 + (v10 << ((char)v11 & 63) >> (v303 & 63)) * 4;
                        *(unsigned short *)v312 = v313->field_0;
                        v11 += v313->field_2;
                        v314 = v312 + v313->field_3;
                        v315 = v49 + (v10 << ((char)v11 & 63) >> (v303 & 63)) * 4;
                        *(unsigned short *)v314 = v315->field_0;
                        v11 += v315->field_2;
                        v316 = v314 + v315->field_3;
                        v317 = v49 + (v10 << ((char)v11 & 63) >> (v303 & 63)) * 4;
                        *(unsigned short *)v316 = v317->field_0;
                        v285 = v11 + v317->field_2;
                        v11 = v285;
                        iter2 = v316 + v317->field_3;
                        v32 = &v33;
                        v33 = &v32;
                    } while ((unsigned int)v285 <= 64);
                }
            }
            v12 = &g_cc0ea0;
        }
        else
        {
            v35 = &v34;
            v34 = &v35;
            v285 = v11;
            if (65 > (unsigned int)v285)
            {
                v318 = v12;
                if (v14 > v318)
                {
                    v319 = v13;
                    if (v318 == v319)
                        goto LABEL_c3100;
                    v320 = v285 >> 3;
                    v321 = ((char *)v318 - v320 < v319 ? (unsigned int)(v318 - v319) : (unsigned int)v320);
                    v322 = (char *)v318 - v321;
                    v12 = v322;
                    v285 = (unsigned int)v285 - (unsigned int)v321 * 8;
                }
                else
                {
                    v322 = (char *)v318 - (v285 >> 3);
                    v12 = v322;
                    v285 = (unsigned int)v285 & 7;
                }
                v11 = v285;
                v10 = *v322;
            }
            else
            {
                v12 = &g_cc0ea0;
            }
        }
LABEL_c3100:
        if (v1 - iter2 >= 2)
        {
            v323 = v1 - 2;
            v324 = (char)-v0 & 63;
            v32 = &v33;
            v33 = &v32;
            if (64 >= (unsigned int)v285)
            {
                do
                {
                    v325 = v12;
                    if (v14 > v325)
                    {
                        v326 = v13;
                        if (v325 == v326)
                            goto LABEL_c3200;
                        v327 = (unsigned int)v285 >> 3;
                        v328 = (char *)v325 - v327;
                        v329 = v328 >= v326;
                        v330 = (v326 <= v328 ? (unsigned int)v327 : (unsigned int)(v325 - v326));
                        v12 = (char *)v325 - v330;
                        v285 = (unsigned int)v285 - (unsigned int)v330 * 8;
                        v11 = v285;
                        v331 = *v12;
                        v10 = v331;
                    }
                    else
                    {
                        v34 = &v35;
                        v35 = &v34;
                        v12 = (char *)v325 - ((unsigned int)v285 >> 3);
                        v285 = (unsigned int)v285 & 7;
                        v11 = v285;
                        v331 = *v12;
                        v10 = v331;
                        v329 = 1;
                    }
                    if (v323 < iter2 || !(v329 & 1))
LABEL_c3200:
                    v332 = v49 + (v331 << ((char)v285 & 63) >> (v324 & 63)) * 4;
                    *(unsigned short *)iter2 = v332->field_0;
                    v285 = v11 + v332->field_2;
                    v11 = v285;
                    iter2 += v332->field_3;
                    v32 = &v33;
                    v33 = &v32;
                } while ((unsigned int)v285 <= 64);
            }
            for (v12 = &g_cc0ea0; iter2 <= v323; iter2 += v333->field_3)
            {
                v333 = v49 + (v10 << ((char)v285 & 63) >> (v324 & 63)) * 4;
                *(unsigned short *)iter2 = v333->field_0;
                v11 += v333->field_2;
            }
        }
        if (v1 > iter2)
        {
            v334 = v49 + (v10 << ((char)v285 & 63) >> ((char)-v0 & 63)) * 4;
            *(char *)iter2 = v334->field_0;
            if (v334[1].field_0 == 1)
            {
                v335 = v11 + v334->field_2;
            }
            else
            {
                if (63 < v11)
                    goto LABEL_c32a0;
                v336 = v11 + v334->field_2;
                v335 = (v336 < 64 ? v336 : 64);
            }
            v11 = v335;
        }
LABEL_c32a0:
        v337 = sub_bfed0(&v25);
        v338 = sub_bfed0(&v20);
        v339 = sub_bfed0(&v15);
        v340 = (!(v338 & v337 & v339 & sub_bfed0(&v10)) ? 0xffffffffffffffec : a1);
        return v340;
    }
    else
    {
        return 0xffffffffffffffec;
    }
}
