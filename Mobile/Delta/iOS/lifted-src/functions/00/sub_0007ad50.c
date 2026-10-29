/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7ad50..0x7c2a8 (5464 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7ad50_0 {
    char field_0;
} st_7ad50_0;


unsigned int sub_7ad50(long long a0, unsigned long long a1, char *a2, unsigned long long a3, unsigned long long *a4)
{
    unsigned long long node;  // x21
    char v13;  // x23
    unsigned long long v22;  // 4102
    char *v112;  // x11
    unsigned int m;  // w12
    unsigned long long v115;  // x13
    unsigned long long v116;  // x10
    unsigned long long *v117;  // x8
    unsigned long v118;  // x10
    char *v119;  // x11
    unsigned long long v120;  // x12
    unsigned long long v121;  // x12
    unsigned long long v23;  // 4131
    unsigned long long v122;  // x13
    unsigned long long v123;  // x11
    unsigned long long v124;  // x10
    unsigned long long v125;  // x9
    unsigned long long v126;  // x10
    unsigned long long v127;  // x8
    unsigned long long v128;  // x10
    char *v129;  // x8
    unsigned long long v130;  // x10
    unsigned long long v131;  // x13
    unsigned long long v24;  // x10
    unsigned long long v132;  // x13
    unsigned long long v133;  // x14
    unsigned long long v134;  // x13
    unsigned long long v135;  // x14
    unsigned long long v136;  // x11
    unsigned long long v137;  // x12
    unsigned long long v138;  // x13
    unsigned long long v139;  // x14
    unsigned long long v140;  // x15
    unsigned long long v141;  // x15
    unsigned long long v25;  // x8
    unsigned long long v142;  // x17
    unsigned long long v143;  // x17
    unsigned long long *v144;  // x9
    unsigned long long v145;  // x14
    unsigned long long v146;  // x13
    unsigned long long v147;  // x12
    unsigned long long v148;  // x15
    unsigned long v150;  // x10
    unsigned long long v151;  // x8
    unsigned long long v26;  // x9
    unsigned long long v152;  // x9
    char *v153;  // x11
    unsigned int l;  // w12
    unsigned long long v156;  // x13
    unsigned long long v157;  // x10
    unsigned long long *v158;  // x8
    unsigned long v159;  // x8
    char *v160;  // x9
    unsigned long long v161;  // x10
    char *v27;  // x11
    unsigned long long v162;  // x13
    unsigned long long v163;  // x11
    unsigned long long v164;  // x12
    unsigned long long v165;  // x13
    unsigned long long v166;  // x9
    unsigned long long v167;  // x8
    unsigned long long v168;  // x8
    unsigned long long v169;  // x9
    unsigned long long v170;  // x8
    unsigned long long v171;  // x9
    unsigned int i;  // w12
    char *v172;  // x8
    unsigned long long v173;  // x9
    unsigned long long v174;  // x13
    unsigned long long v175;  // x14
    unsigned long long v176;  // x12
    unsigned long long v177;  // x13
    unsigned long long v178;  // x14
    unsigned long long v179;  // x13
    unsigned long long v180;  // x14
    unsigned long long v181;  // x12
    unsigned long long v182;  // x11
    unsigned long long v183;  // x13
    unsigned long long v184;  // x15
    unsigned long long v185;  // x16
    unsigned long long v186;  // x15
    unsigned long long v187;  // x17
    unsigned long long v188;  // x15
    unsigned long long *v189;  // x10
    unsigned long long v190;  // x17
    unsigned long long v191;  // x13
    unsigned long long v30;  // x13
    unsigned long long v192;  // x14
    unsigned long long v193;  // x11
    unsigned long long v194;  // x15
    unsigned int v196;  // w8
    unsigned long long v197;  // x10
    unsigned long long v198;  // x8
    unsigned long long v199;  // x9
    char *v200;  // x11
    unsigned int k;  // w12
    unsigned long long v31;  // x10
    unsigned long long v203;  // x13
    unsigned long long v204;  // x10
    unsigned long long *v205;  // x8
    unsigned long v206;  // x8
    char *v207;  // x9
    unsigned long long v208;  // x10
    unsigned long long v209;  // x13
    unsigned long long v210;  // x12
    unsigned long long v211;  // x11
    unsigned long long *v14;  // x19
    unsigned long long *v32;  // x8
    unsigned long long v212;  // x13
    unsigned long long v213;  // x12
    unsigned long long v214;  // x9
    unsigned long long v215;  // x8
    unsigned long long v216;  // x8
    unsigned long long v217;  // x9
    unsigned long long v218;  // x8
    unsigned long long v219;  // x9
    char *v220;  // x8
    unsigned long long v221;  // x9
    unsigned long long *v33;  // x8
    unsigned long long v222;  // x13
    unsigned long long v223;  // x14
    unsigned long long v224;  // x13
    unsigned long long v225;  // x12
    unsigned long long v226;  // x14
    unsigned long long v227;  // x13
    unsigned long long v228;  // x14
    unsigned long long v229;  // x14
    unsigned long long v230;  // x12
    unsigned long long v231;  // x11
    unsigned long long *v34;  // x9
    unsigned long long v232;  // x13
    unsigned long long v233;  // x15
    unsigned long long v234;  // x15
    unsigned long long v235;  // x16
    unsigned long long v236;  // x17
    unsigned long long v237;  // x15
    unsigned long long v238;  // x17
    unsigned long long *v239;  // x10
    unsigned long long v240;  // x17
    unsigned long long v241;  // x11
    unsigned long v35;  // x10
    unsigned long long v242;  // x15
    unsigned long long v244;  // x11
    unsigned long long v245;  // x9
    unsigned long long v246;  // x10
    char *v247;  // x12
    unsigned int i0;  // w13
    unsigned long long v250;  // x14
    unsigned long long v251;  // x11
    char *v36;  // x11
    unsigned long long *v252;  // x9
    unsigned long v253;  // x10
    char *v254;  // x11
    unsigned long long v255;  // x12
    unsigned long long v256;  // x12
    unsigned long long v257;  // x13
    unsigned long long v258;  // x12
    unsigned long long v259;  // x13
    unsigned long long v260;  // x8
    unsigned long long v261;  // x14
    unsigned long long v37;  // x12
    unsigned long long v262;  // x12
    unsigned long long v263;  // x11
    unsigned long long v264;  // x10
    unsigned long long v265;  // x9
    unsigned long long v266;  // x10
    unsigned long long v267;  // x11
    unsigned long long v268;  // x12
    unsigned long long *v269;  // x10
    unsigned long long v270;  // x8
    unsigned long long v271;  // x9
    unsigned long long v38;  // x12
    char *v272;  // x8
    unsigned long long v273;  // x9
    unsigned long long v274;  // x13
    unsigned long long v275;  // x13
    unsigned long long v276;  // x14
    unsigned long long v277;  // x13
    unsigned long long v278;  // x14
    unsigned long long v279;  // x11
    unsigned long long v280;  // x14
    unsigned long long v281;  // x13
    unsigned long long v39;  // x11
    unsigned long long v282;  // x14
    unsigned long long v283;  // x14
    unsigned long long v284;  // x11
    unsigned long long v285;  // x12
    unsigned long long v286;  // x13
    unsigned long long v287;  // x14
    unsigned long long v288;  // x15
    unsigned long long v289;  // x15
    unsigned long long v290;  // x17
    unsigned long long v291;  // x15
    unsigned long long v40;  // x10
    unsigned long long v292;  // x16
    unsigned long long v293;  // x17
    unsigned long long v294;  // x17
    unsigned long long v295;  // x15
    unsigned long long *v296;  // x10
    unsigned long long v297;  // x17
    unsigned long long v298;  // x13
    unsigned long long v299;  // x12
    unsigned long long v300;  // x15
    unsigned long long v301;  // 4147
    unsigned long long v41;  // x9
    unsigned long long v302;  // x10
    unsigned long long v303;  // x8
    unsigned long long v304;  // x9
    char *v305;  // x11
    unsigned int n;  // w12
    unsigned long long v308;  // x13
    unsigned long long v309;  // x10
    unsigned long long *v310;  // x8
    unsigned long v311;  // x8
    unsigned long long v15;  // x0
    unsigned long long v42;  // x10
    char *v312;  // x9
    unsigned long long v313;  // x10
    unsigned long long v314;  // x13
    unsigned long long v315;  // x12
    unsigned long long v316;  // x13
    unsigned long long v317;  // x11
    unsigned long long v318;  // x12
    unsigned long long v319;  // x13
    unsigned long long v320;  // x9
    unsigned long long v321;  // x8
    unsigned long long *v43;  // x8
    unsigned long long v322;  // x8
    unsigned long long v323;  // x9
    unsigned long long v324;  // x8
    unsigned long long v325;  // x9
    char *v326;  // x8
    unsigned long long v327;  // x9
    unsigned long long v328;  // x13
    unsigned long long v329;  // x14
    unsigned long long v330;  // x13
    unsigned long long v331;  // x14
    unsigned long long *v44;  // x9
    unsigned long long v332;  // x12
    unsigned long long v333;  // x13
    unsigned long long v334;  // x14
    unsigned long long v335;  // x14
    unsigned long long v336;  // x13
    unsigned long long v337;  // x12
    unsigned long long v338;  // x11
    unsigned long long v339;  // x13
    unsigned long long v340;  // x15
    unsigned long long v341;  // x15
    unsigned long long v45;  // x12
    unsigned long long v342;  // x17
    unsigned long long v343;  // x16
    unsigned long long v344;  // x15
    unsigned long long v345;  // x17
    unsigned long long v346;  // x17
    unsigned long long *v347;  // x10
    unsigned long long v348;  // x13
    unsigned long long v349;  // x11
    unsigned long long v350;  // x15
    unsigned long long v46;  // x13
    unsigned long long v47;  // x9
    unsigned long long *v48;  // x11
    unsigned long long *v49;  // x8
    unsigned long long v50;  // x10
    char *v51;  // x9
    unsigned long v16;  // cc_dep1
    unsigned long long v52;  // x10
    unsigned long long v53;  // x14
    unsigned long long v54;  // x14
    unsigned long long v55;  // x15
    unsigned long long v56;  // x14
    unsigned long long v57;  // x12
    unsigned long long v58;  // x13
    unsigned long long v59;  // x14
    unsigned long long *v60;  // x11
    unsigned long long v61;  // x15
    unsigned long long v17;  // 4106
    unsigned long long v62;  // x17
    unsigned long long v63;  // x16
    unsigned long long v64;  // x14
    unsigned long long v65;  // x15
    unsigned long long v66;  // x13
    unsigned long long v67;  // x16
    unsigned long long v68;  // x10
    unsigned long long v69;  // x8
    unsigned long long v70;  // x9
    char *v71;  // x11
    unsigned long long v18;  // w8
    unsigned int j;  // w12
    unsigned long long v74;  // x13
    unsigned long long v75;  // x10
    unsigned long long *v76;  // x8
    unsigned long v77;  // x8
    char *v78;  // x9
    unsigned long long v79;  // x10
    unsigned long long v80;  // x13
    unsigned long long v81;  // x12
    unsigned long long v19;  // 4112
    unsigned long long v82;  // x9
    unsigned long long v83;  // x8
    unsigned long long v84;  // x8
    unsigned long long v85;  // x9
    unsigned long long v86;  // x8
    unsigned long long v87;  // x9
    char *v88;  // x8
    unsigned long long v89;  // x9
    unsigned long long v90;  // x13
    unsigned long long v91;  // x14
    unsigned long long v20;  // 4102
    unsigned long long v92;  // x13
    unsigned long long v93;  // x14
    unsigned long long v94;  // x13
    unsigned long long v95;  // x12
    unsigned long long v96;  // x11
    unsigned long long v97;  // x13
    unsigned long long v98;  // x14
    unsigned long long v99;  // x15
    unsigned long long v100;  // x15
    unsigned long long v101;  // x17
    unsigned long long v21;  // 4112
    unsigned long long *v102;  // x10
    unsigned long long v103;  // x13
    unsigned long long v104;  // x14
    unsigned long long v105;  // x13
    unsigned long long v106;  // x11
    unsigned long long v107;  // x15
    unsigned long long v109;  // x10
    unsigned long long v110;  // x8
    unsigned long long v111;  // x9
    st_7ad50_0 **v0;  // [bp-0x98], Other Possible Types: char
    st_7ad50_0 *v1;  // [bp-0x90]
    char v2;  // [bp-0x88], Other Possible Types: unsigned long long
    unsigned long long v3;  // [bp-0x80]
    unsigned long long v4;  // [bp-0x78]
    unsigned long long v5;  // [bp-0x70]
    unsigned long long *iter;  // [bp-0x60]
    unsigned long long *v7;  // [bp-0x58]
    st_7ad50_0 **v8;  // [bp-0x50], Other Possible Types: char
    st_7ad50_0 *v9;  // [bp-0x48]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v1 = &v0;
    v0 = &v1;
    if (a1 < 8)
        return 0;
    node = a3;
    v13 = *a4;
    v14 = a4 + 1;
    v15 = sub_7c884(&v2, a0, a1);
    v16 = v15;
    v17 = arm64g_calculate_condition(130, v15, 120, 0);
    if (v17 & 1)
        return 0;
    v18 = v13;
    if ((node * v13 >> 3) + 8 <= a1)
    {
        v19 = arm64g_calculate_condition(146, v16, 120, 0);
        v20 = arm64g_calculate_condition(0x33, (v19 & 1 ? v18 : 0x20000000), (v19 & 1 ? 12 : 0), 0);
        if (v20 & 1)
            goto LABEL_7b044;
LABEL_7adcc:
        v23 = arm64g_calculate_condition(67, 0, node & 0xffffffff, 0);
        if (v23 & 1)
            v24 = (unsigned int)node & 3;
        else
            v24 = -(-(unsigned int)node & 3);
        if ((int)v24 >= 1)
        {
            v25 = v2;
            v26 = v4;
            v27 = &a2[(int)node] - 1;
            i = (unsigned int)v24 + 1;
            do
            {
                v30 = v14[*v27];
                v25 = v25 >> ((char)v30 & 63) | v30 & 0xffffffffffffff00;
                v26 += v30;
                i -= 1;
                v27 -= 1;
            } while (1 < i);
            node -= v24;
            v31 = v26 & 0xff;
            v2 = v25;
            v4 = v26 & 7;
            v32 = iter;
            *v32 = v25 >> ((char)-v31 & 63);
            v33 = (char *)v32 + (v31 >> 3);
            v34 = v7;
            if (v34 < v33)
                v33 = v34;
            iter = v33;
        }
        if (node & 7)
        {
            v35 = (int)node;
            v36 = &a2[v35];
            v37 = v14[*(v36 - 1)];
            v38 = v14[*(v36 - 2)];
            v39 = v14[*(v36 - 3)];
            node = v35 - 4;
            v40 = v14[a2[node]];
            v41 = v4 + v37 + v38 + v39 + v40;
            v42 = v41 & 0xff;
            v2 = (((v2 >> ((char)v37 & 63) | v37) >> ((char)v38 & 63) | v38) >> ((char)v39 & 63) | v39) >> ((char)v40 & 63) | v40 & 0xffffffffffffff00;
            v4 = v41 & 7;
            *iter = v2 >> ((char)-v42 & 63);
            v43 = (char *)iter + (v42 >> 3);
            v44 = v7;
            if (v44 < v43)
                v43 = v44;
            iter = v43;
        }
        if ((int)node >= 1)
        {
            v45 = v2;
            v46 = v4;
            v47 = node & 0xffffffff;
            v48 = iter;
            v49 = v7;
            v50 = v47 - 8;
            v51 = &a2[v47] - 4;
            do
            {
                v52 = v50;
                v53 = v14[v51[3]];
                v54 = v14[v51[2]];
                v55 = v14[v51[1]];
                v56 = v14[*v51];
                v57 = (((v45 >> ((char)v53 & 63) | v53) >> ((char)v54 & 63) | v54) >> ((char)v55 & 63) | v55) >> ((char)v56 & 63) | v56 & 0xffffffffffffff00;
                v58 = v46 + v53 + v54 + v55 + v56;
                v59 = v58 & 0xff;
                *v48 = v57 >> ((char)-v59 & 63);
                v60 = (char *)v48 + (v59 >> 3);
                if (v49 < v60)
                    v60 = v49;
                v61 = v14[*(v51 - 2)];
                v62 = v14[*(v51 - 3)];
                v63 = v14[*(v51 - 4)];
                v64 = ((v14[*(v51 - 1)] >> ((char)v61 & 63) | v61) >> ((char)v62 & 63) | v62) >> ((char)v63 & 63) | v63 & 0xffffffffffffff00;
                v65 = v14[*(v51 - 1)] + v61 + v62 + v63;
                v45 = v57 >> ((char)v65 & 63) | v64;
                v66 = v65 + (v58 & 7);
                v67 = v66 & 0xff;
                v46 = v66 & 7;
                *v60 = v45 >> ((char)-v67 & 63);
                v48 = (char *)v60 + (v67 >> 3);
                if (v49 < v48)
                    v48 = v49;
                iter = v48;
                v50 = v52 - 8;
                v51 -= 8;
            } while (8 < v52 + 8);
            v2 = v45;
            v3 = v64;
            v4 = v46;
            v5 = v65;
        }
    }
    else
    {
        v21 = arm64g_calculate_condition(146, v16, 120, 0);
        v22 = arm64g_calculate_condition(48, (v21 & 1 ? v18 : 0x20000000), (v21 & 1 ? 12 : 0), 0);
        if (!(v22 & 1))
            goto LABEL_7adcc;
LABEL_7b044:
        if (v18 > 8)
        {
            if (v18 == 9)
            {
                v9 = &v8;
                v8 = &v9;
                v150 = (unsigned int)node - 6 * (((unsigned int)node * 715827883 >> 32) + ((unsigned int)node * 715827883 >> 63));
                if ((int)v150 >= 1)
                {
                    v151 = v2;
                    v152 = v4;
                    v153 = &a2[(int)node] - 1;
                    l = (unsigned int)v150 + 1;
                    do
                    {
                        v156 = v14[*v153];
                        v151 = v151 >> ((char)v156 & 63) | v156 & 0xffffffffffffff00;
                        v152 += v156;
                        l -= 1;
                        v153 -= 1;
                    } while (1 < l);
                    node -= v150;
                    v157 = v152 & 0xff;
                    v2 = v151;
                    v4 = v152 & 7;
                    v158 = iter;
                    *v158 = v151 >> ((char)-v157 & 63);
                    iter = (char *)v158 + (v157 >> 3);
                }
                if ((((unsigned int)node * 2863311531 + 715827880) * 0x40000000 | (unsigned int)node * 2863311531 + 715827880 >> 2) >= 357913941)
                {
                    v159 = (int)node;
                    v160 = &a2[v159];
                    v161 = v14[*(v160 - 1)];
                    v162 = v14[*(v160 - 2)];
                    v163 = (v2 >> ((char)v161 & 63) | v161) >> ((char)v162 & 63) | v162;
                    v164 = v14[*(v160 - 3)];
                    v165 = v14[*(v160 - 4)];
                    v166 = v14[*(v160 - 5)];
                    node = v159 - 6;
                    v167 = v14[a2[node]];
                    v168 = v4 + v161 + v162 + v164 + v165 + v166 + v167;
                    v169 = v168 & 0xff;
                    v2 = (((v163 >> ((char)v164 & 63) | v164) >> ((char)v165 & 63) | v165) >> ((char)v166 & 63) | v166) >> ((char)v167 & 63) | v167 & 0xffffffffffffff00;
                    v4 = v168 & 7;
                    *iter = v2 >> ((char)-v169 & 63);
                    iter = (char *)iter + (v169 >> 3);
                }
                if ((int)node < 1)
                {
                    v2 = v2;
                    return sub_79738(&v2);
                }
                v170 = node & 0xffffffff;
                v171 = v170 - 12;
                v172 = &a2[v170] - 6;
                do
                {
                    v173 = v171;
                    v174 = v14[v172[5]];
                    v175 = v14[v172[4]];
                    v176 = (v2 >> ((char)v174 & 63) | v174) >> ((char)v175 & 63) | v175;
                    v177 = v14[v172[3]];
                    v178 = v14[v172[2]];
                    v179 = v14[v172[1]];
                    v180 = v14[*v172];
                    v181 = (((v176 >> ((char)v177 & 63) | v177) >> ((char)v178 & 63) | v178) >> ((char)v179 & 63) | v179) >> ((char)v180 & 63) | v180 & 0xffffffffffffff00;
                    v182 = v4 + v174 + v175 + v177 + v178 + v179 + v180;
                    v183 = v182 & 0xff;
                    *iter = v181 >> ((char)-v183 & 63);
                    v184 = v14[*(v172 - 2)];
                    v185 = v14[*(v172 - 1)] >> ((char)v184 & 63) | v184;
                    v186 = v14[*(v172 - 3)];
                    v187 = v14[*(v172 - 4)];
                    v188 = v14[*(v172 - 5)];
                    v189 = (char *)iter + (v183 >> 3);
                    v190 = v14[*(v172 - 6)];
                    v191 = (((v185 >> ((char)v186 & 63) | v186) >> ((char)v187 & 63) | v187) >> ((char)v188 & 63) | v188) >> ((char)v190 & 63) | v190 & 0xffffffffffffff00;
                    v192 = v14[*(v172 - 1)] + v184 + v186 + v187 + v188 + v190;
                    v2 = v181 >> ((char)v192 & 63) | v191;
                    v193 = v192 + (v182 & 7);
                    v194 = v193 & 0xff;
                    v4 = v193 & 7;
                    *v189 = v2 >> ((char)-v194 & 63);
                    iter = (char *)v189 + (v194 >> 3);
                    v172 -= 12;
                    v171 = v173 - 12;
                } while (12 < v173 + 12);
LABEL_7b914:
                v3 = v191;
                goto LABEL_7c284;
            }
            else if (v18 != 10)
            {
                if (v18 == 11)
                {
                    v9 = &v8;
                    v8 = &v9;
                    v68 = node - (((int)((unsigned int)node * 1717986919) >> 33) + ((unsigned int)node * 1717986919 >> 63)) * 5;
                    if ((int)v68 >= 1)
                    {
                        v69 = v2;
                        v70 = v4;
                        v71 = &a2[(int)node] - 1;
                        j = (unsigned int)v68 + 1;
                        do
                        {
                            v74 = v14[*v71];
                            v69 = v69 >> ((char)v74 & 63) | v74 & 0xffffffffffffff00;
                            v70 += v74;
                            j -= 1;
                            v71 -= 1;
                        } while (1 < j);
                        node -= v68;
                        v75 = v70 & 0xff;
                        v2 = v69;
                        v4 = v70 & 7;
                        v76 = iter;
                        *v76 = v69 >> ((char)-v75 & 63);
                        iter = (char *)v76 + (v75 >> 3);
                    }
                    if ((((unsigned int)node * 3435973837 + 429496728) * 0x80000000 | (unsigned int)node * 3435973837 + 429496728 >> 1) >= 429496729)
                    {
                        v77 = (int)node;
                        v78 = &a2[v77];
                        v79 = v14[*(v78 - 1)];
                        v80 = v14[*(v78 - 2)];
                        v81 = v14[*(v78 - 3)];
                        v82 = v14[*(v78 - 4)];
                        node = v77 - 5;
                        v83 = v14[a2[node]];
                        v84 = v4 + v79 + v80 + v81 + v82 + v83;
                        v85 = v84 & 0xff;
                        v2 = ((((v2 >> ((char)v79 & 63) | v79) >> ((char)v80 & 63) | v80) >> ((char)v81 & 63) | v81) >> ((char)v82 & 63) | v82) >> ((char)v83 & 63) | v83 & 0xffffffffffffff00;
                        v4 = v84 & 7;
                        *iter = v2 >> ((char)-v85 & 63);
                        iter = (char *)iter + (v85 >> 3);
                    }
                    if ((int)node < 1)
                    {
                        v2 = v2;
                        return sub_79738(&v2);
                    }
                    v86 = node & 0xffffffff;
                    v87 = v86 - 10;
                    v88 = &a2[v86] - 5;
                    do
                    {
                        v89 = v87;
                        v90 = v14[v88[4]];
                        v91 = v14[v88[3]];
                        v92 = v14[v88[2]];
                        v93 = v14[v88[1]];
                        v94 = v14[*v88];
                        v95 = ((((v2 >> ((char)v90 & 63) | v90) >> ((char)v91 & 63) | v91) >> ((char)v92 & 63) | v92) >> ((char)v93 & 63) | v93) >> ((char)v94 & 63) | v94 & 0xffffffffffffff00;
                        v96 = v4 + v90 + v91 + v92 + v93 + v94;
                        v97 = v96 & 0xff;
                        *iter = v95 >> ((char)-v97 & 63);
                        v98 = v14[*(v88 - 1)];
                        v99 = v14[*(v88 - 2)];
                        v100 = v14[*(v88 - 3)];
                        v101 = v14[*(v88 - 4)];
                        v102 = (char *)iter + (v97 >> 3);
                        v103 = v14[*(v88 - 5)];
                        v104 = (((v98 >> ((char)v99 & 63) | v99) >> ((char)v100 & 63) | v100) >> ((char)v101 & 63) | v101) >> ((char)v103 & 63) | v103 & 0xffffffffffffff00;
                        v105 = v14[*(v88 - 1)] + v99 + v100 + v101 + v103;
                        v2 = v95 >> ((char)v105 & 63) | v104;
                        v106 = v105 + (v96 & 7);
                        v107 = v106 & 0xff;
                        v4 = v106 & 7;
                        *v102 = v2 >> ((char)-v107 & 63);
                        iter = (char *)v102 + (v107 >> 3);
                        v88 -= 10;
                        v87 = v89 - 10;
                    } while (10 < v89 + 10);
                    goto LABEL_7beec;
                }
                goto LABEL_7befc;
            }
            else
            {
                v9 = &v8;
                v8 = &v9;
                v109 = node - (((int)((unsigned int)node * 1717986919) >> 33) + ((unsigned int)node * 1717986919 >> 63)) * 5;
                if ((int)v109 >= 1)
                {
                    v110 = v2;
                    v111 = v4;
                    v112 = &a2[(int)node] - 1;
                    m = (unsigned int)v109 + 1;
                    do
                    {
                        v115 = v14[*v112];
                        v110 = v110 >> ((char)v115 & 63) | v115 & 0xffffffffffffff00;
                        v111 += v115;
                        m -= 1;
                        v112 -= 1;
                    } while (1 < m);
                    node -= v109;
                    v116 = v111 & 0xff;
                    v2 = v110;
                    v4 = v111 & 7;
                    v117 = iter;
                    *v117 = v110 >> ((char)-v116 & 63);
                    iter = (char *)v117 + (v116 >> 3);
                }
                if ((((unsigned int)node * 3435973837 + 429496728) * 0x80000000 | (unsigned int)node * 3435973837 + 429496728 >> 1) >= 429496729)
                {
                    v118 = (int)node;
                    v119 = &a2[v118];
                    v120 = v14[*(v119 - 1)];
                    v121 = v14[*(v119 - 2)];
                    v122 = v14[*(v119 - 3)];
                    v123 = v14[*(v119 - 4)];
                    node = v118 - 5;
                    v124 = v14[a2[node]];
                    v125 = v4 + v120 + v121 + v122 + v123 + v124;
                    v126 = v125 & 0xff;
                    v2 = ((((v2 >> ((char)v120 & 63) | v120) >> ((char)v121 & 63) | v121) >> ((char)v122 & 63) | v122) >> ((char)v123 & 63) | v123) >> ((char)v124 & 63) | v124;
                    v4 = v125 & 7;
                    *iter = v2 >> ((char)-v126 & 63);
                    iter = (char *)iter + (v126 >> 3);
                }
                if ((int)node >= 1)
                {
                    v127 = node & 0xffffffff;
                    v128 = v127 - 10;
                    v129 = &a2[v127] - 5;
                    do
                    {
                        v130 = v128;
                        v131 = v14[v129[4]];
                        v132 = v14[v129[3]];
                        v133 = v14[v129[2]];
                        v134 = v14[v129[1]];
                        v135 = v14[*v129];
                        v136 = ((((v2 >> ((char)v131 & 63) | v131) >> ((char)v132 & 63) | v132) >> ((char)v133 & 63) | v133) >> ((char)v134 & 63) | v134) >> ((char)v135 & 63) | v135;
                        v137 = v4 + v131 + v132 + v133 + v134 + v135;
                        v138 = v137 & 0xff;
                        *iter = v136 >> ((char)-v138 & 63);
                        v139 = v14[*(v129 - 1)];
                        v140 = v14[*(v129 - 2)];
                        v141 = v14[*(v129 - 3)];
                        v142 = v14[*(v129 - 4)];
                        v143 = v14[*(v129 - 5)];
                        v144 = (char *)iter + (v138 >> 3);
                        v145 = (((v139 >> ((char)v140 & 63) | v140) >> ((char)v141 & 63) | v141) >> ((char)v142 & 63) | v142) >> ((char)v143 & 63) | v143;
                        v146 = v14[*(v129 - 1)] + v140 + v141 + v142 + v143;
                        v2 = v136 >> ((char)v146 & 63) | v145;
                        v147 = v146 + (v137 & 7);
                        v148 = v147 & 0xff;
                        v4 = v147 & 7;
                        *v144 = v2 >> ((char)-v148 & 63);
                        iter = (char *)v144 + (v148 >> 3);
                        v129 -= 10;
                        v128 = v130 - 10;
                    } while (10 < v130 + 10);
                    v3 = v145;
                    v5 = v146;
                }
            }
        }
        else
        {
            if (v18 == 7)
            {
                v9 = &v8;
                v8 = &v9;
                v301 = arm64g_calculate_condition(67, 0, node & 0xffffffff, 0);
                if (v301 & 1)
                    v302 = (unsigned int)node & 7;
                else
                    v302 = -(-(unsigned int)node & 7);
                if ((int)v302 >= 1)
                {
                    v303 = v2;
                    v304 = v4;
                    v305 = &a2[(int)node] - 1;
                    n = (unsigned int)v302 + 1;
                    do
                    {
                        v308 = v14[*v305];
                        v303 = v303 >> ((char)v308 & 63) | v308 & 0xffffffffffffff00;
                        v304 += v308;
                        n -= 1;
                        v305 -= 1;
                    } while (1 < n);
                    node -= v302;
                    v309 = v304 & 0xff;
                    v2 = v303;
                    v4 = v304 & 7;
                    v310 = iter;
                    *v310 = v303 >> ((char)-v309 & 63);
                    iter = (char *)v310 + (v309 >> 3);
                }
                if (node & 15)
                {
                    v311 = (int)node;
                    v312 = &a2[v311];
                    v313 = v14[*(v312 - 1)];
                    v314 = v14[*(v312 - 2)];
                    v315 = v14[*(v312 - 3)];
                    v316 = v14[*(v312 - 4)];
                    v317 = (((v2 >> ((char)v313 & 63) | v313) >> ((char)v314 & 63) | v314) >> ((char)v315 & 63) | v315) >> ((char)v316 & 63) | v316;
                    v318 = v14[*(v312 - 5)];
                    v319 = v14[*(v312 - 6)];
                    v320 = v14[*(v312 - 7)];
                    node = v311 - 8;
                    v321 = v14[a2[node]];
                    v322 = v4 + v313 + v314 + v315 + v316 + v318 + v319 + v320 + v321;
                    v323 = v322 & 0xff;
                    v2 = (((v317 >> ((char)v318 & 63) | v318) >> ((char)v319 & 63) | v319) >> ((char)v320 & 63) | v320) >> ((char)v321 & 63) | v321 & 0xffffffffffffff00;
                    v4 = v322 & 7;
                    *iter = v2 >> ((char)-v323 & 63);
                    iter = (char *)iter + (v323 >> 3);
                }
                if ((int)node >= 1)
                {
                    v324 = node & 0xffffffff;
                    v325 = v324 - 16;
                    v326 = &a2[v324] - 8;
                    do
                    {
                        v327 = v325;
                        v328 = v14[v326[7]];
                        v329 = v14[v326[6]];
                        v330 = v14[v326[5]];
                        v331 = v14[v326[4]];
                        v332 = (((v2 >> ((char)v328 & 63) | v328) >> ((char)v329 & 63) | v329) >> ((char)v330 & 63) | v330) >> ((char)v331 & 63) | v331;
                        v333 = v14[v326[3]];
                        v334 = v14[v326[2]];
                        v335 = v14[v326[1]];
                        v336 = v14[*v326];
                        v337 = (((v332 >> ((char)v333 & 63) | v333) >> ((char)v334 & 63) | v334) >> ((char)v335 & 63) | v335) >> ((char)v336 & 63) | v336 & 0xffffffffffffff00;
                        v338 = v4 + v328 + v329 + v330 + v331 + v333 + v334 + v335 + v336;
                        v339 = v338 & 0xff;
                        *iter = v337 >> ((char)-v339 & 63);
                        v340 = v14[*(v326 - 2)];
                        v341 = v14[*(v326 - 3)];
                        v342 = v14[*(v326 - 4)];
                        v343 = ((v14[*(v326 - 1)] >> ((char)v340 & 63) | v340) >> ((char)v341 & 63) | v341) >> ((char)v342 & 63) | v342;
                        v344 = v14[*(v326 - 5)];
                        v345 = v14[*(v326 - 6)];
                        v346 = v14[*(v326 - 7)];
                        v347 = (char *)iter + (v339 >> 3);
                        v348 = v14[*(v326 - 8)];
                        v104 = (((v343 >> ((char)v344 & 63) | v344) >> ((char)v345 & 63) | v345) >> ((char)v346 & 63) | v346) >> ((char)v348 & 63) | v348 & 0xffffffffffffff00;
                        v105 = v14[*(v326 - 1)] + v340 + v341 + v342 + v344 + v345 + v346 + v348;
                        v2 = v337 >> ((char)v105 & 63) | v104;
                        v349 = v105 + (v338 & 7);
                        v350 = v349 & 0xff;
                        v4 = v349 & 7;
                    } while ((*v347 = v2 >> ((char)-v350 & 63), iter = (char *)v347 + (v350 >> 3), v325 = v327 - 16, v326 -= 16, 16 < v327 + 16));
LABEL_7beec:
                    v3 = v104;
                    v5 = v105;
                }
            }
            else if (v18 == 8)
            {
                v9 = &v8;
                v8 = &v9;
                v196 = ((int)(((unsigned int)node * -1840700269 >> 32) + (unsigned int)node) >> 2) + (((unsigned int)node * -1840700269 >> 32) + (unsigned int)node >> 31);
                v197 = node + v196 - v196 * 8;
                if ((int)v197 >= 1)
                {
                    v198 = v2;
                    v199 = v4;
                    v200 = &a2[(int)node] - 1;
                    k = (unsigned int)v197 + 1;
                    do
                    {
                        v203 = v14[*v200];
                        v198 = v198 >> ((char)v203 & 63) | v203 & 0xffffffffffffff00;
                        v199 += v203;
                        k -= 1;
                        v200 -= 1;
                    } while (1 < k);
                    node -= v197;
                    v204 = v199 & 0xff;
                    v2 = v198;
                    v4 = v199 & 7;
                    v205 = iter;
                    *v205 = v198 >> ((char)-v204 & 63);
                    iter = (char *)v205 + (v204 >> 3);
                }
                if ((((unsigned int)node * 3067833783 + 306783378) * 0x80000000 | (unsigned int)node * 3067833783 + 306783378 >> 1) >= 306783379)
                {
                    v206 = (int)node;
                    v207 = &a2[v206];
                    v208 = v14[*(v207 - 1)];
                    v209 = v14[*(v207 - 2)];
                    v210 = v14[*(v207 - 3)];
                    v211 = ((v2 >> ((char)v208 & 63) | v208) >> ((char)v209 & 63) | v209) >> ((char)v210 & 63) | v210;
                    v212 = v14[*(v207 - 4)];
                    v213 = v14[*(v207 - 5)];
                    v214 = v14[*(v207 - 6)];
                    node = v206 - 7;
                    v215 = v14[a2[node]];
                    v216 = v4 + v208 + v209 + v210 + v212 + v213 + v214 + v215;
                    v217 = v216 & 0xff;
                    v2 = (((v211 >> ((char)v212 & 63) | v212) >> ((char)v213 & 63) | v213) >> ((char)v214 & 63) | v214) >> ((char)v215 & 63) | v215 & 0xffffffffffffff00;
                    v4 = v216 & 7;
                    *iter = v2 >> ((char)-v217 & 63);
                    iter = (char *)iter + (v217 >> 3);
                }
                if ((int)node < 1)
                {
                    v2 = v2;
                    return sub_79738(&v2);
                }
                v218 = node & 0xffffffff;
                v219 = v218 - 14;
                v220 = &a2[v218] - 7;
                do
                {
                    v221 = v219;
                    v222 = v14[v220[6]];
                    v223 = v14[v220[5]];
                    v224 = v14[v220[4]];
                    v225 = ((v2 >> ((char)v222 & 63) | v222) >> ((char)v223 & 63) | v223) >> ((char)v224 & 63) | v224;
                    v226 = v14[v220[3]];
                    v227 = v14[v220[2]];
                    v228 = v14[v220[1]];
                    v229 = v14[*v220];
                    v230 = (((v225 >> ((char)v226 & 63) | v226) >> ((char)v227 & 63) | v227) >> ((char)v228 & 63) | v228) >> ((char)v229 & 63) | v229 & 0xffffffffffffff00;
                    v231 = v4 + v222 + v223 + v224 + v226 + v227 + v228 + v229;
                    v232 = v231 & 0xff;
                    *iter = v230 >> ((char)-v232 & 63);
                    v233 = v14[*(v220 - 2)];
                    v234 = v14[*(v220 - 3)];
                    v235 = (v14[*(v220 - 1)] >> ((char)v233 & 63) | v233) >> ((char)v234 & 63) | v234;
                    v236 = v14[*(v220 - 4)];
                    v237 = v14[*(v220 - 5)];
                    v238 = v14[*(v220 - 6)];
                    v239 = (char *)iter + (v232 >> 3);
                    v240 = v14[*(v220 - 7)];
                    v191 = (((v235 >> ((char)v236 & 63) | v236) >> ((char)v237 & 63) | v237) >> ((char)v238 & 63) | v238) >> ((char)v240 & 63) | v240 & 0xffffffffffffff00;
                    v192 = v14[*(v220 - 1)] + v233 + v234 + v236 + v237 + v238 + v240;
                    v2 = v230 >> ((char)v192 & 63) | v191;
                    v241 = v192 + (v231 & 7);
                    v242 = v241 & 0xff;
                    v4 = v241 & 7;
                    *v239 = v2 >> ((char)-v242 & 63);
                    iter = (char *)v239 + (v242 >> 3);
                    v220 -= 14;
                    v219 = v221 - 14;
                } while (14 < v221 + 14);
                goto LABEL_7b914;
            }
            else
            {
LABEL_7befc:
                v9 = &v8;
                v8 = &v9;
                v244 = node - (((int)((unsigned int)node * 954437177) >> 33) + ((unsigned int)node * 954437177 >> 63)) * 9;
                if ((int)v244 >= 1)
                {
                    v245 = v2;
                    v246 = v4;
                    v247 = &a2[(int)node] - 1;
                    i0 = (unsigned int)v244 + 1;
                    do
                    {
                        v250 = v14[*v247];
                        v245 = v245 >> ((char)v250 & 63) | v250 & 0xffffffffffffff00;
                        v246 += v250;
                        i0 -= 1;
                        v247 -= 1;
                    } while (1 < i0);
                    node -= v244;
                    v251 = v246 & 0xff;
                    v2 = v245;
                    v4 = v246 & 7;
                    v252 = iter;
                    *v252 = v245 >> ((char)-v251 & 63);
                    iter = (char *)v252 + (v251 >> 3);
                }
                if ((((unsigned int)node * 954437177 + 238609294) * 0x80000000 | (unsigned int)node * 954437177 + 238609294 >> 1) >= 238609295)
                {
                    v253 = (int)node;
                    v254 = &a2[v253];
                    v255 = v14[*(v254 - 1)];
                    v256 = v14[*(v254 - 2)];
                    v257 = v14[*(v254 - 3)];
                    v258 = v14[*(v254 - 4)];
                    v259 = v14[*(v254 - 5)];
                    v260 = ((((v2 >> ((char)v255 & 63) | v255) >> ((char)v256 & 63) | v256) >> ((char)v257 & 63) | v257) >> ((char)v258 & 63) | v258) >> ((char)v259 & 63) | v259;
                    v261 = v14[*(v254 - 6)];
                    v262 = v14[*(v254 - 7)];
                    v263 = v14[*(v254 - 8)];
                    node = v253 - 9;
                    v264 = v14[a2[node]];
                    v265 = v4 + v255 + v256 + v257 + v258 + v259 + v261 + v262 + v263 + v264;
                    v266 = v265 & 0xff;
                    v2 = (((v260 >> ((char)v261 & 63) | v261) >> ((char)v262 & 63) | v262) >> ((char)v263 & 63) | v263) >> ((char)v264 & 63) | v264;
                    v4 = v265 & 7;
                    *iter = v2 >> ((char)-v266 & 63);
                    iter = (char *)iter + (v266 >> 3);
                }
                if ((int)node >= 1)
                {
                    v267 = v2;
                    v268 = v4;
                    v269 = iter;
                    v270 = node & 0xffffffff;
                    v271 = v270 - 18;
                    v272 = &a2[v270] - 9;
                    do
                    {
                        v273 = v271;
                        v274 = v14[v272[8]];
                        v275 = v14[v272[7]];
                        v276 = v14[v272[6]];
                        v277 = v14[v272[5]];
                        v278 = v14[v272[4]];
                        v279 = ((((v267 >> ((char)v274 & 63) | v274) >> ((char)v275 & 63) | v275) >> ((char)v276 & 63) | v276) >> ((char)v277 & 63) | v277) >> ((char)v278 & 63) | v278;
                        v280 = v14[v272[3]];
                        v281 = v14[v272[2]];
                        v282 = v14[v272[1]];
                        v283 = v14[*v272];
                        v284 = (((v279 >> ((char)v280 & 63) | v280) >> ((char)v281 & 63) | v281) >> ((char)v282 & 63) | v282) >> ((char)v283 & 63) | v283;
                        v285 = v268 + v274 + v275 + v276 + v277 + v278 + v280 + v281 + v282 + v283;
                        v286 = v285 & 0xff;
                        *v269 = v284 >> ((char)-v286 & 63);
                        v287 = v14[*(v272 - 1)];
                        v288 = v14[*(v272 - 2)];
                        v289 = v14[*(v272 - 3)];
                        v290 = v14[*(v272 - 4)];
                        v291 = v14[*(v272 - 5)];
                        v292 = (((v287 >> ((char)v288 & 63) | v288) >> ((char)v289 & 63) | v289) >> ((char)v290 & 63) | v290) >> ((char)v291 & 63) | v291;
                        v293 = v14[*(v272 - 6)];
                        v294 = v14[*(v272 - 7)];
                        v295 = v14[*(v272 - 8)];
                        v296 = (char *)v269 + (v286 >> 3);
                        v297 = v14[*(v272 - 9)];
                        v298 = (((v292 >> ((char)v293 & 63) | v293) >> ((char)v294 & 63) | v294) >> ((char)v295 & 63) | v295) >> ((char)v297 & 63) | v297;
                        v192 = v14[*(v272 - 1)] + v288 + v289 + v290 + v291 + v293 + v294 + v295 + v297;
                        v267 = v284 >> ((char)v192 & 63) | v298;
                        v299 = v192 + (v285 & 7);
                        v300 = v299 & 0xff;
                    } while ((v268 = v299 & 7, *v296 = v267 >> ((char)-v300 & 63), v269 = (char *)v296 + (v300 >> 3), v271 = v273 - 18, v272 -= 18, 18 < v273 + 18));
                    iter = v269;
                    v2 = v267;
                    v3 = v298;
                    v4 = v268;
LABEL_7c284:
                    v5 = v192;
                }
            }
        }
    }
    return sub_79738(&v2);
}
