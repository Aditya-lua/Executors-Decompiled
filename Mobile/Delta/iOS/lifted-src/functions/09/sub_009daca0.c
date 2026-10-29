/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9daca0..0x9db29c (1532 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_9daca0(unsigned long long *a0, void* a1, unsigned long long *a2, void* a3, unsigned long long *a4, unsigned long a5)
{
    unsigned long long v5;  // x30
    unsigned long long v6;  // x5
    unsigned long long v15;  // x22
    unsigned long long v105;  // x11
    unsigned long v106;  // 4286
    unsigned long long v107;  // x22
    unsigned long long v108;  // x12
    unsigned long v109;  // 4297
    unsigned long long v110;  // x23
    unsigned long long v111;  // x13
    unsigned long v112;  // x10
    unsigned long v113;  // 4312
    unsigned long long v114;  // x20
    unsigned long v16;  // x14
    unsigned long v115;  // x11
    unsigned long v116;  // 4323
    unsigned long long v117;  // x21
    unsigned long v118;  // x12
    unsigned long v119;  // 4334
    unsigned long long v120;  // x22
    unsigned long v121;  // 4341
    unsigned long long v122;  // x23
    unsigned long v123;  // x13
    unsigned long long v124;  // 4352
    unsigned long v17;  // x15
    unsigned long v125;  // 4364
    unsigned long v126;  // 4371
    unsigned long v127;  // 4378
    void* v128;  // x11
    unsigned long v129;  // x24
    unsigned long long *iter;  // x2
    unsigned long v131;  // 4159
    unsigned long v132;  // x6
    unsigned long v133;  // x7
    void* v134;  // x3
    unsigned long v18;  // x16
    unsigned long v135;  // x8
    unsigned long v136;  // x9
    unsigned long idx;  // x1
    unsigned long v138;  // x19
    unsigned long v139;  // x20
    unsigned long v140;  // x21
    unsigned long v141;  // x22
    unsigned long v142;  // x14
    unsigned long v143;  // x15
    unsigned long long *node;  // x26
    unsigned long v19;  // x17
    unsigned long v145;  // x16
    unsigned long v146;  // x17
    unsigned long iter1;  // x3
    unsigned long v148;  // cc_op
    unsigned long v149;  // cc_dep1
    unsigned long v150;  // cc_dep2
    unsigned long v151;  // cc_ndep
    unsigned long long v152;  // x0
    unsigned long v153;  // x10
    unsigned long v154;  // 4196
    unsigned long long *v20;  // x3
    unsigned long long v155;  // x0
    unsigned long v156;  // x11
    unsigned long v157;  // x12
    unsigned long v158;  // x13
    unsigned long long v159;  // x19
    unsigned long v160;  // x10
    unsigned long v161;  // 4221
    unsigned long long v162;  // x20
    unsigned long long v163;  // x25
    unsigned long v164;  // 4232
    unsigned long v21;  // cc_op
    unsigned long long v165;  // x21
    unsigned long v166;  // x11
    unsigned long v167;  // 4243
    unsigned long long v168;  // x22
    unsigned long v169;  // x12
    unsigned long v170;  // 4254
    unsigned long v171;  // x24
    unsigned long long v172;  // x20
    unsigned long v173;  // 4270
    unsigned long long v174;  // x21
    unsigned long v22;  // cc_dep2
    unsigned long long v175;  // x11
    unsigned long v176;  // 4281
    unsigned long long v177;  // x22
    unsigned long long v178;  // x12
    unsigned long v179;  // 4292
    unsigned long long v180;  // x23
    unsigned long long v181;  // x13
    unsigned long v182;  // x10
    unsigned long v183;  // 4307
    unsigned long long v184;  // x19
    unsigned long v23;  // cc_ndep
    unsigned long v185;  // x11
    unsigned long v186;  // 4318
    unsigned long long v187;  // x20
    unsigned long v188;  // x12
    unsigned long v189;  // 4329
    unsigned long long v190;  // x21
    unsigned long v191;  // x13
    unsigned long v192;  // 4340
    unsigned long long v193;  // x22
    unsigned long long v194;  // 4347
    unsigned long long v24;  // x0
    unsigned long v195;  // 4354
    unsigned long v196;  // 4361
    unsigned long v197;  // 4368
    unsigned long v198;  // 4153
    unsigned long long v199;  // x0
    unsigned long v200;  // x13
    unsigned long v201;  // x6
    unsigned long v202;  // x7
    unsigned long v203;  // x8
    unsigned long v204;  // x9
    unsigned long long v7;  // x4
    unsigned long long i;  // x28
    unsigned long long *iter2;  // x1
    unsigned long long v206;  // x19
    unsigned long v207;  // 4176
    unsigned long long v208;  // x20
    unsigned long v209;  // 4183
    unsigned long long v210;  // x21
    unsigned long v211;  // 4190
    unsigned long long v212;  // x22
    unsigned long long v213;  // x25
    unsigned long v214;  // x14
    unsigned long long *v26;  // x26
    unsigned long v215;  // x15
    unsigned long v216;  // x16
    unsigned long v217;  // x17
    unsigned long v218;  // x3
    unsigned long v219;  // x10
    unsigned long v220;  // 4202
    unsigned long long v221;  // x0
    unsigned long v222;  // x11
    unsigned long v223;  // x12
    unsigned long v224;  // x13
    unsigned long long v27;  // x10
    unsigned long long v225;  // x19
    unsigned long v226;  // x10
    unsigned long v227;  // 4227
    unsigned long long v228;  // x20
    unsigned long v229;  // x11
    unsigned long v230;  // 4238
    unsigned long long v231;  // x21
    unsigned long v232;  // x12
    unsigned long v233;  // 4249
    unsigned long long v234;  // x22
    unsigned long v28;  // 4200
    unsigned long v235;  // 4260
    unsigned long v236;  // x24
    unsigned long long v237;  // x20
    unsigned long long v238;  // x10
    unsigned long v239;  // 4275
    unsigned long long v240;  // x21
    unsigned long long v241;  // x11
    unsigned long v242;  // 4286
    unsigned long long v243;  // x22
    unsigned long long v244;  // x12
    unsigned long long v29;  // x0
    unsigned long v245;  // 4297
    unsigned long long v246;  // x23
    unsigned long long v247;  // x13
    unsigned long v248;  // x10
    unsigned long v249;  // 4312
    unsigned long long v250;  // x20
    unsigned long v251;  // x11
    unsigned long v252;  // 4323
    unsigned long long v253;  // x21
    unsigned long v254;  // x12
    unsigned long long v30;  // x11
    unsigned long v255;  // 4334
    unsigned long long v256;  // x22
    unsigned long v257;  // x13
    unsigned long v258;  // 4345
    unsigned long long v259;  // x23
    unsigned long long v260;  // 4356
    unsigned long v261;  // 4364
    unsigned long v262;  // 4371
    unsigned long v263;  // 4378
    void* v264;  // x11
    unsigned long long v31;  // x12
    unsigned long v265;  // 4108
    unsigned long long v266;  // x19
    unsigned long v267;  // 4163
    unsigned long long v268;  // x20
    unsigned long v269;  // 4170
    unsigned long long v270;  // x21
    unsigned long v271;  // 4177
    unsigned long long v272;  // x22
    unsigned long long *v273;  // x12
    unsigned long v274;  // 4223
    unsigned long long v32;  // x13
    void* v275;  // x1
    unsigned long v276;  // 4224
    unsigned long v277;  // 4225
    unsigned long v278;  // 4226
    unsigned long long *v279;  // x27
    unsigned long long v280;  // x10
    unsigned long long *v281;  // x26
    unsigned long long v282;  // 4123
    unsigned long long v283;  // x11
    unsigned long long j;  // x28
    unsigned long long v33;  // x19
    unsigned long long v285;  // 4152
    unsigned long v286;  // x14
    unsigned long v287;  // x15
    unsigned long v288;  // x19
    unsigned long v289;  // x20
    unsigned long long v290;  // 4168
    unsigned long v291;  // x16
    unsigned long v292;  // x17
    unsigned long v293;  // x21
    unsigned long v294;  // x22
    unsigned long v34;  // x10
    unsigned long long v295;  // 4188
    unsigned long long v296;  // 4200
    unsigned long long v297;  // 4147
    unsigned long long v298;  // x26
    unsigned long long *v299;  // x1
    unsigned long long v300;  // x6
    unsigned long long v301;  // x7
    unsigned long long v302;  // 4159
    unsigned long long v303;  // x8
    unsigned long long v304;  // x9
    void* v8;  // x27
    unsigned long v35;  // 4225
    unsigned long long v305;  // x19
    unsigned long long v306;  // x20
    unsigned long long v307;  // x21
    unsigned long long v308;  // x22
    unsigned long v309;  // 4187
    unsigned long v310;  // cc_dep1
    unsigned long v311;  // cc_ndep
    unsigned long long v312;  // x28
    unsigned long long v313;  // 4108
    unsigned long long v314;  // x10
    unsigned long long v36;  // x20
    unsigned long long v315;  // 4111
    unsigned long long v316;  // x11
    unsigned long long v317;  // 4121
    unsigned long long v318;  // 4121
    unsigned long long v319;  // x12
    unsigned long long v320;  // 4114
    unsigned long long v321;  // x13
    unsigned long long v322;  // 4108
    unsigned long long v323;  // 4105
    unsigned long long v324;  // x10
    unsigned long long v37;  // x25
    unsigned long long v325;  // 4111
    unsigned long long v326;  // x11
    unsigned long long v327;  // 4111
    unsigned long long v328;  // x12
    unsigned long long v329;  // 4111
    unsigned long long v330;  // x13
    unsigned long v331;  // 4145
    unsigned long long v332;  // x0
    unsigned long long *v333;  // x1
    unsigned long long v334;  // 4156
    unsigned long v38;  // 4236
    unsigned long long v335;  // 4166
    unsigned long long v336;  // 4176
    unsigned long long v337;  // x9
    unsigned long v338;  // 4186
    unsigned long v339;  // cc_dep1
    unsigned long v340;  // cc_ndep
    unsigned long long v341;  // 4201
    unsigned long long v342;  // x6
    unsigned long long v343;  // 4105
    unsigned long long v344;  // 4105
    unsigned long long v39;  // x21
    unsigned long long v345;  // x7
    unsigned long long v346;  // 4105
    unsigned long long v347;  // 4105
    unsigned long long v348;  // x8
    unsigned long long v349;  // 4105
    unsigned long long v350;  // 4105
    unsigned long v40;  // x11
    unsigned long v41;  // 4247
    unsigned long long v42;  // x22
    unsigned long v43;  // x12
    unsigned long v44;  // 4258
    unsigned long long v9;  // x24
    unsigned long long v45;  // x24
    unsigned long long v46;  // x20
    unsigned long v47;  // 4274
    unsigned long long v48;  // x21
    unsigned long long v49;  // x11
    unsigned long v50;  // 4285
    unsigned long long v51;  // x22
    unsigned long long v52;  // x12
    unsigned long v53;  // 4296
    unsigned long long v54;  // x23
    unsigned long v10;  // x9
    unsigned long long v55;  // x13
    unsigned long v56;  // x10
    unsigned long v57;  // 4311
    unsigned long long v58;  // x19
    unsigned long v59;  // x11
    unsigned long v60;  // 4322
    unsigned long long v61;  // x20
    unsigned long v62;  // x12
    unsigned long v63;  // 4333
    unsigned long long v64;  // x21
    unsigned long long *v11;  // x1
    unsigned long v65;  // x13
    unsigned long v66;  // 4344
    unsigned long long v67;  // x22
    unsigned long long v68;  // 4351
    unsigned long v69;  // 4358
    unsigned long v70;  // 4365
    unsigned long v71;  // 4372
    unsigned long v72;  // x6
    unsigned long v73;  // x7
    unsigned long v74;  // x8
    unsigned long long v12;  // x19
    unsigned long v75;  // x9
    unsigned long long *v76;  // x1
    unsigned long long v77;  // x25
    unsigned long v78;  // x14
    unsigned long v79;  // x15
    unsigned long v80;  // x16
    unsigned long v81;  // x17
    unsigned long long *v82;  // x3
    unsigned long long v83;  // x10
    unsigned long v84;  // 4202
    unsigned long long v13;  // x20
    unsigned long long v85;  // x0
    unsigned long long v86;  // x11
    unsigned long long v87;  // x12
    unsigned long long v88;  // x13
    unsigned long long v89;  // x19
    unsigned long v90;  // x10
    unsigned long v91;  // 4227
    unsigned long long v92;  // x20
    unsigned long v93;  // x11
    unsigned long v94;  // 4238
    unsigned long long v14;  // x21
    unsigned long long v95;  // x21
    unsigned long v96;  // x12
    unsigned long v97;  // 4249
    unsigned long long v98;  // x22
    unsigned long v99;  // 4260
    unsigned long long v100;  // x24
    unsigned long long v101;  // x20
    unsigned long long v102;  // x10
    unsigned long v103;  // 4275
    unsigned long long v104;  // x21
    char v0;  // [bp-0xa0]
    char *v1;  // [bp-0x80]
    unsigned long long v2;  // [bp-0x78]
    unsigned long long *v3;  // [bp-0x18]
    char v4;  // [bp+0x0]

    v1 = &v4;
    v2 = v5;
    v6 = a5 * 8;
    v7 = *a4;
    xsp = (int)&(&v0)[-8 * a5];
    v8 = a1 + v6;
    v3 = (char *)a2 + v6;
    v9 = *a2;
    v10 = (long long)a1[24];
    v11 = a1 + 32;
    v12 = 0;
    v13 = 0;
    v14 = 0;
    v15 = 0;
    v16 = *(long long *)a3;
    v17 = (long long)a3[8];
    v18 = (long long)a3[16];
    v19 = (long long)a3[24];
    v20 = a3 + 32;
    v21 = 2;
    v22 = 32;
    v23 = 0;
    v24 = 0;
    i = 0;
    v26 = (unsigned long long *)xsp;
    do
    {
        v27 = v9 * *(long long *)a1;
        v28 = arm64g_calculate_flag_c(v21, a3, v22, v23);
        v29 = v24 + v28;
        v30 = v9 * (long long)a1[8];
        v31 = v9 * (long long)a1[16];
        i = i + 8 & 31;
        v32 = v9 * (long long)a1[24];
        v33 = v12 + v27;
        v34 = *(long long *)a1 * v9 >> 64;
        v35 = arm64g_calculate_flag_c(2, v12, v27, 0);
        v36 = v13 + v30 + v35;
        v37 = v7 * v33;
        v38 = arm64g_calculate_flag_c(6, v13, v30, v35);
        v39 = v14 + v31 + v38;
        v40 = (long long)a1[8] * v9 >> 64;
        v41 = arm64g_calculate_flag_c(6, v14, v31, v38);
        v42 = v15 + v32 + v41;
        v43 = (long long)a1[16] * v9 >> 64;
        v44 = arm64g_calculate_flag_c(6, v15, v32, v41);
        v45 = *(long long *)((char *)a2 + i);
        v46 = v36 + v34;
        *v26 = v37;
        v26 += 1;
        v47 = arm64g_calculate_flag_c(2, v36, v34, 0);
        v48 = v39 + v40 + v47;
        v49 = v37 * v17;
        v50 = arm64g_calculate_flag_c(6, v39, v40, v47);
        v51 = v42 + v43 + v50;
        v52 = v37 * v18;
        v53 = arm64g_calculate_flag_c(6, v42, v43, v50);
        v54 = v44 + (v10 * v9 >> 64) + v53;
        v55 = v37 * v19;
        v56 = v16 * v37 >> 64;
        v57 = arm64g_calculate_flag_c(4, v33, 1, 0);
        v58 = v46 + v49 + v57;
        v59 = v17 * v37 >> 64;
        v60 = arm64g_calculate_flag_c(6, v46, v49, v57);
        v61 = v48 + v52 + v60;
        v62 = v18 * v37 >> 64;
        v63 = arm64g_calculate_flag_c(6, v48, v52, v60);
        v64 = v51 + v55 + v63;
        v65 = v19 * v37 >> 64;
        v66 = arm64g_calculate_flag_c(6, v51, v55, v63);
        v67 = v54 + v29 + v66;
        v68 = arm64g_calculate_flag_c(6, v54, v29, v66);
        v24 = v68;
        v12 = v58 + v56;
        v69 = arm64g_calculate_flag_c(2, v58, v56, 0);
        v13 = v61 + v59 + v69;
        v70 = arm64g_calculate_flag_c(6, v61, v59, v69);
        v14 = v64 + v62 + v70;
        v71 = arm64g_calculate_flag_c(6, v64, v62, v70);
        v15 = v67 + v65 + v71;
        v21 = 6;
        a3 = v67;
        v22 = v65;
        v23 = v71;
        v9 = v45;
    } while (i);
    if (v8 - v11)
    {
        v72 = *v11;
        v73 = v11[1];
        v74 = v11[2];
        v75 = v11[3];
        v76 = v11 + 4;
        v77 = *(long long *)xsp;
        v78 = *v20;
        v79 = v20[1];
        v80 = v20[2];
        v81 = v20[3];
        v82 = v20 + 4;
        while (1)
        {
            do
            {
                v83 = v45 * v72;
                v84 = arm64g_calculate_flag_c(6, a3, v22, v23);
                v85 = v24 + v84;
                v86 = v45 * v73;
                v87 = v45 * v74;
                i = i + 8 & 31;
                v88 = v45 * v75;
                v89 = v12 + v83;
                v90 = v72 * v45 >> 64;
                v91 = arm64g_calculate_flag_c(2, v12, v83, 0);
                v92 = v13 + v86 + v91;
                v93 = v73 * v45 >> 64;
                v94 = arm64g_calculate_flag_c(6, v13, v86, v91);
                v95 = v14 + v87 + v94;
                v96 = v74 * v45 >> 64;
                v97 = arm64g_calculate_flag_c(6, v14, v87, v94);
                v98 = v15 + v88 + v97;
                v99 = arm64g_calculate_flag_c(6, v15, v88, v97);
                v100 = *(long long *)((char *)a2 + i);
                v101 = v92 + v90;
                v102 = v77 * v78;
                v103 = arm64g_calculate_flag_c(2, v92, v90, 0);
                v104 = v95 + v93 + v103;
                v105 = v77 * v79;
                v106 = arm64g_calculate_flag_c(6, v95, v93, v103);
                v107 = v98 + v96 + v106;
                v108 = v77 * v80;
                v109 = arm64g_calculate_flag_c(6, v98, v96, v106);
                v110 = v99 + (v75 * v45 >> 64) + v109;
                v111 = v77 * v81;
                v112 = v78 * v77 >> 64;
                v113 = arm64g_calculate_flag_c(2, v89, v102, 0);
                v114 = v101 + v105 + v113;
                v115 = v79 * v77 >> 64;
                v116 = arm64g_calculate_flag_c(6, v101, v105, v113);
                v117 = v104 + v108 + v116;
                v118 = v80 * v77 >> 64;
                v119 = arm64g_calculate_flag_c(6, v104, v108, v116);
                v120 = v107 + v111 + v119;
                v121 = arm64g_calculate_flag_c(6, v107, v111, v119);
                v122 = v110 + v85 + v121;
                v123 = v81 * v77 >> 64;
                v124 = arm64g_calculate_flag_c(6, v110, v85, v121);
                v24 = v124;
                v77 = *(long long *)(xsp + i);
                *v26 = v89 + v102;
                v26 += 1;
                v12 = v114 + v112;
                v125 = arm64g_calculate_flag_c(2, v114, v112, 0);
                v13 = v117 + v115 + v125;
                v126 = arm64g_calculate_flag_c(6, v117, v115, v125);
                v14 = v120 + v118 + v126;
                v127 = arm64g_calculate_flag_c(6, v120, v118, v126);
                v15 = v122 + v123 + v127;
                a3 = v122;
                v22 = v123;
                v23 = v127;
                v45 = v100;
            } while (i);
            v128 = v8 - v6;
            if (!(v8 - v76))
                break;
            v72 = *v76;
            v73 = v76[1];
            v74 = v76[2];
            v75 = v76[3];
            v76 += 4;
            v78 = *v82;
            v79 = v82[1];
            v80 = v82[2];
            v81 = v82[3];
            v82 += 4;
            v45 = v100;
        }
        v129 = a2[4];
        iter = a2 + 4;
        v131 = arm64g_calculate_flag_c(6, a3, v22, v23);
        v24 += v131;
        v132 = *(long long *)v128;
        v133 = (long long)v128[8];
        v134 = (char *)v82 - v6;
        v135 = (long long)v128[16];
        v136 = (long long)v128[24];
        idx = v128 + 32;
        *v26 = v12;
        v26[1] = v13;
        v138 = *(long long *)(xsp + 32);
        v139 = *(long long *)(xsp + 40);
        v26[2] = v14;
        v26[3] = v15;
        v140 = *(long long *)(xsp + 48);
        v141 = *(long long *)(xsp + 56);
        v142 = *(long long *)v134;
        v143 = (long long)v134[8];
        node = (unsigned long long *)xsp;
        v145 = (long long)v134[16];
        v146 = (long long)v134[24];
        iter1 = v134 + 32;
        v148 = 2;
        v149 = v134;
        v150 = 32;
        v151 = 0;
        v152 = 0;
        while (1)
        {
            do
            {
                v153 = v129 * v132;
                v154 = arm64g_calculate_flag_c(v148, v149, v150, v151);
                v155 = v152 + v154;
                v156 = v129 * v133;
                v157 = v129 * v135;
                i = i + 8 & 31;
                v158 = v129 * v136;
                v159 = v138 + v153;
                v160 = v132 * v129 >> 64;
                v161 = arm64g_calculate_flag_c(2, v138, v153, 0);
                v162 = v139 + v156 + v161;
                v163 = v7 * v159;
                v164 = arm64g_calculate_flag_c(6, v139, v156, v161);
                v165 = v140 + v157 + v164;
                v166 = v133 * v129 >> 64;
                v167 = arm64g_calculate_flag_c(6, v140, v157, v164);
                v168 = v141 + v158 + v167;
                v169 = v135 * v129 >> 64;
                v170 = arm64g_calculate_flag_c(6, v141, v158, v167);
                v171 = *(long long *)((char *)iter + i);
                v172 = v162 + v160;
                *node = v163;
                node += 1;
                v173 = arm64g_calculate_flag_c(2, v162, v160, 0);
                v174 = v165 + v166 + v173;
                v175 = v163 * v143;
                v176 = arm64g_calculate_flag_c(6, v165, v166, v173);
                v177 = v168 + v169 + v176;
                v178 = v163 * v145;
                v179 = arm64g_calculate_flag_c(6, v168, v169, v176);
                v180 = v170 + (v136 * v129 >> 64) + v179;
                v181 = v163 * v146;
                v182 = v142 * v163 >> 64;
                v183 = arm64g_calculate_flag_c(4, v159, 1, 0);
                v184 = v172 + v175 + v183;
                v185 = v143 * v163 >> 64;
                v186 = arm64g_calculate_flag_c(6, v172, v175, v183);
                v187 = v174 + v178 + v186;
                v188 = v145 * v163 >> 64;
                v189 = arm64g_calculate_flag_c(6, v174, v178, v186);
                v190 = v177 + v181 + v189;
                v191 = v146 * v163 >> 64;
                v192 = arm64g_calculate_flag_c(6, v177, v181, v189);
                v193 = v180 + v155 + v192;
                v194 = arm64g_calculate_flag_c(6, v180, v155, v192);
                v152 = v194;
                v138 = v184 + v182;
                v195 = arm64g_calculate_flag_c(2, v184, v182, 0);
                v139 = v187 + v185 + v195;
                v196 = arm64g_calculate_flag_c(6, v187, v185, v195);
                v140 = v190 + v188 + v196;
                v197 = arm64g_calculate_flag_c(6, v190, v188, v196);
                v141 = v193 + v191 + v197;
                v148 = 6;
                v149 = v193;
                v150 = v191;
                v151 = v197;
                v129 = v171;
            } while (i);
            v198 = arm64g_calculate_flag_c(6, v149, v150, v151);
            v199 = v152 + v198;
            v200 = node[7];
            v201 = *(long long *)idx;
            v202 = *(long long *)(idx + 8);
            v203 = *(long long *)(idx + 16);
            v204 = *(long long *)(idx + 24);
            iter2 = idx + 32;
            v206 = v138 + node[4];
            v207 = arm64g_calculate_flag_c(2, v138, node[4], 0);
            v208 = v139 + node[5] + v207;
            v209 = arm64g_calculate_flag_c(6, v139, node[5], v207);
            v210 = v140 + node[6] + v209;
            v211 = arm64g_calculate_flag_c(6, v140, node[6], v209);
            v212 = v141 + node[7] + v211;
            v213 = *(long long *)xsp;
            v214 = *(long long *)iter1;
            v215 = *(long long *)(iter1 + 8);
            v216 = *(long long *)(iter1 + 16);
            v217 = *(long long *)(iter1 + 24);
            v218 = iter1 + 32;
            while (1)
            {
                do
                {
                    v219 = v171 * v201;
                    v220 = arm64g_calculate_flag_c(6, v141, v200, v211);
                    v221 = v199 + v220;
                    v222 = v171 * v202;
                    v223 = v171 * v203;
                    i = i + 8 & 31;
                    v224 = v171 * v204;
                    v225 = v206 + v219;
                    v226 = v201 * v171 >> 64;
                    v227 = arm64g_calculate_flag_c(2, v206, v219, 0);
                    v228 = v208 + v222 + v227;
                    v229 = v202 * v171 >> 64;
                    v230 = arm64g_calculate_flag_c(6, v208, v222, v227);
                    v231 = v210 + v223 + v230;
                    v232 = v203 * v171 >> 64;
                    v233 = arm64g_calculate_flag_c(6, v210, v223, v230);
                    v234 = v212 + v224 + v233;
                    v235 = arm64g_calculate_flag_c(6, v212, v224, v233);
                    v236 = *(long long *)((char *)iter + i);
                    v237 = v228 + v226;
                    v238 = v213 * v214;
                    v239 = arm64g_calculate_flag_c(2, v228, v226, 0);
                    v240 = v231 + v229 + v239;
                    v241 = v213 * v215;
                    v242 = arm64g_calculate_flag_c(6, v231, v229, v239);
                    v243 = v234 + v232 + v242;
                    v244 = v213 * v216;
                    v245 = arm64g_calculate_flag_c(6, v234, v232, v242);
                    v246 = v235 + (v204 * v171 >> 64) + v245;
                    v247 = v213 * v217;
                    v248 = v214 * v213 >> 64;
                    v249 = arm64g_calculate_flag_c(2, v225, v238, 0);
                    v250 = v237 + v241 + v249;
                    v251 = v215 * v213 >> 64;
                    v252 = arm64g_calculate_flag_c(6, v237, v241, v249);
                    v253 = v240 + v244 + v252;
                    v254 = v216 * v213 >> 64;
                    v255 = arm64g_calculate_flag_c(6, v240, v244, v252);
                    v256 = v243 + v247 + v255;
                    v257 = v217 * v213 >> 64;
                    v258 = arm64g_calculate_flag_c(6, v243, v247, v255);
                    v259 = v246 + v221 + v258;
                    v213 = *(long long *)(xsp + i);
                    v260 = arm64g_calculate_flag_c(6, v246, v221, v258);
                    v199 = v260;
                    *node = v225 + v238;
                    node += 1;
                    v206 = v250 + v248;
                    v261 = arm64g_calculate_flag_c(2, v250, v248, 0);
                    v208 = v253 + v251 + v261;
                    v262 = arm64g_calculate_flag_c(6, v253, v251, v261);
                    v210 = v256 + v254 + v262;
                    v263 = arm64g_calculate_flag_c(6, v256, v254, v262);
                    v212 = v259 + v257 + v263;
                    v141 = v259;
                    v200 = v257;
                    v211 = v263;
                    v171 = v236;
                } while (i);
                v264 = v218 - v6;
                v265 = arm64g_calculate_flag_c(6, v141, v200, v211);
                v199 += v265;
                if (!(v8 - iter2))
                    break;
                v201 = *iter2;
                v202 = iter2[1];
                v203 = iter2[2];
                v204 = iter2[3];
                iter2 += 4;
                v266 = v206 + node[4];
                v267 = arm64g_calculate_flag_c(2, v206, node[4], 0);
                v268 = v208 + node[5] + v267;
                v269 = arm64g_calculate_flag_c(6, v208, node[5], v267);
                v270 = v210 + node[6] + v269;
                v271 = arm64g_calculate_flag_c(6, v210, node[6], v269);
                v272 = v212 + node[7] + v271;
                v141 = v212;
                v200 = node[7];
                v211 = v271;
                v214 = *(long long *)v218;
                v215 = *(long long *)(v218 + 8);
                v216 = *(long long *)(v218 + 16);
                v217 = *(long long *)(v218 + 24);
                v218 += 32;
                v206 = v266;
                v208 = v268;
                v210 = v270;
                v212 = v272;
                v171 = v236;
            }
            v273 = a0;
            iter += 4;
            v274 = arm64g_calculate_flag_c(2, v206, v24, 0);
            v275 = (char *)iter2 - v6;
            v276 = arm64g_calculate_flag_c(6, v208, 0, v274);
            *node = v206 + v24;
            node[1] = v208 + v274;
            v277 = arm64g_calculate_flag_c(6, v210, 0, v276);
            v138 = *(long long *)(xsp + 32);
            v139 = *(long long *)(xsp + 40);
            v278 = arm64g_calculate_flag_c(6, v212, 0, v277);
            v24 = v199 + v278;
            node[2] = v210 + v276;
            node[3] = v212 + v277;
            v140 = *(long long *)(xsp + 48);
            v141 = *(long long *)(xsp + 56);
            v142 = *(long long *)v264;
            v143 = (long long)v264[8];
            v145 = (long long)v264[16];
            v146 = (long long)v264[24];
            iter1 = v264 + 32;
            if (iter == v3)
                break;
            v129 = *iter;
            v132 = *(long long *)v275;
            v133 = (long long)v275[8];
            v135 = (long long)v275[16];
            v136 = (long long)v275[24];
            idx = v275 + 32;
            v148 = 2;
            v149 = v275;
            v150 = 32;
            v151 = 0;
            v152 = 0;
            node = (unsigned long long *)xsp;
        }
        v279 = v273;
        v280 = v138 - v142;
        v281 = xsp + 64;
        v282 = arm64g_calculate_flag_c(4, v138, v142, 0);
        v283 = v139 - v143 - (v282 ^ 1);
        j = v6 - 32;
        do
        {
            v285 = arm64g_calculate_flag_c(8, v139, v143, v282);
            v286 = *(long long *)iter1;
            v287 = *(long long *)(iter1 + 8);
            j -= 32;
            v288 = *v281;
            v289 = v281[1];
            v290 = arm64g_calculate_flag_c(8, v140, v145, v285);
            v291 = *(long long *)(iter1 + 16);
            v292 = *(long long *)(iter1 + 24);
            iter1 += 32;
            v293 = v281[2];
            v294 = v281[3];
            v281 += 4;
            *v273 = v280;
            v273[1] = v283;
            v295 = arm64g_calculate_flag_c(8, v141, v146, v290);
            v280 = v288 - v286 - (v295 ^ 1);
            v273[2] = v140 - v145 - (v285 ^ 1);
            v273[3] = v141 - v146 - (v290 ^ 1);
            v273 += 4;
            v296 = arm64g_calculate_flag_c(8, v288, v286, v295);
            v283 = v289 - v287 - (v296 ^ 1);
            v139 = v289;
            v143 = v287;
            v282 = v296;
            v140 = v293;
            v141 = v294;
            v145 = v291;
            v146 = v292;
        } while (j);
        v297 = arm64g_calculate_flag_c(8, v139, v143, v282);
        v298 = xsp;
        v299 = xsp + 32;
        v300 = *v279;
        v301 = v279[1];
        v302 = arm64g_calculate_flag_c(8, v293, v291, v297);
        *v273 = v280;
        v273[1] = v283;
        v303 = v279[2];
        v304 = v279[3];
        v273[2] = v293 - v291 - (v297 ^ 1);
        v273[3] = v294 - v292 - (v302 ^ 1);
        v305 = *v299;
        v306 = v299[1];
        v307 = v299[2];
        v308 = v299[3];
        v309 = arm64g_calculate_flag_c(8, v294, v292, v302);
        v310 = v24;
        v311 = v309;
        v312 = v6 - 64;
        v313 = arm64g_calculate_condition(56, v310, 0, v311);
        if (!(v313 & 1))
            goto LABEL_9db1be;
        while (1)
        {
            v314 = v305;
            while (1)
            {
                *(unsigned long long *)v298 = 0;
                *(unsigned long long *)(v298 + 8) = 0;
                v315 = arm64g_calculate_condition(56, v310, 0, v311);
                if (v315 & 1)
                {
                    v316 = v306;
                    v300 = v279[4];
                    v301 = v279[5];
                    v305 = v299[4];
                    v306 = v299[5];
                    v317 = arm64g_calculate_condition(56, v310, 0, v311);
                    if (!(v317 & 1))
                        goto LABEL_9db1d2;
                    goto LABEL_9db1d1;
                }
                else
                {
                    v316 = v301;
                    v300 = v279[4];
                    v301 = v279[5];
                    v305 = v299[4];
                    v306 = v299[5];
                    v318 = arm64g_calculate_condition(56, v310, 0, v311);
                    if (v318 & 1)
                    {
LABEL_9db1d1:
                        v319 = v307;
                        goto LABEL_9db1d4;
                    }
                    else
                    {
LABEL_9db1d2:
                        v319 = v303;
LABEL_9db1d4:
                        *(unsigned long long *)(v298 + 16) = 0;
                        *(unsigned long long *)(v298 + 24) = 0;
                        v298 += 32;
                        v320 = arm64g_calculate_condition(56, v310, 0, v311);
                        if (v320 & 1)
                            v321 = v308;
                        else
                            v321 = v304;
                        v303 = v279[6];
                        v304 = v279[7];
                        v307 = v299[6];
                        v308 = v299[7];
                        v299 += 4;
                        *v279 = v314;
                        v279[1] = v316;
                        v279[2] = v319;
                        v279[3] = v321;
                        v279 += 4;
                        if (!v312)
                        {
                            v323 = arm64g_calculate_condition(56, v310, 0, v311);
                            if (v323 & 1)
                                v324 = v305;
                            else
                                v324 = v300;
                            *(unsigned long long *)v298 = 0;
                            *(unsigned long long *)(v298 + 8) = 0;
                            v325 = arm64g_calculate_condition(56, v310, 0, v311);
                            if (v325 & 1)
                                v326 = v306;
                            else
                                v326 = v301;
                            *(unsigned long long *)(v298 + 16) = 0;
                            *(unsigned long long *)(v298 + 24) = 0;
                            v327 = arm64g_calculate_condition(56, v310, 0, v311);
                            if (v327 & 1)
                                v328 = v307;
                            else
                                v328 = v303;
                            *(unsigned long long *)(v298 + 24) = 0;
                            *(unsigned long long *)(v298 + 32) = 0;
                            v329 = arm64g_calculate_condition(56, v310, 0, v311);
                            if (v329 & 1)
                                v330 = v308;
                            else
                                v330 = v304;
                            *(unsigned long long *)(v298 + 32) = 0;
                            *(unsigned long long *)(v298 + 40) = 0;
                            *v279 = v324;
                            v279[1] = v326;
                            v279[2] = v328;
                            v279[3] = v330;
                            return 1;
                        }
                        v312 -= 32;
                        v322 = arm64g_calculate_condition(56, v310, 0, v311);
                        if (v322 & 1)
                            break;
LABEL_9db1be:
                        v314 = v300;
                    }
                }
            }
        }
    }
    else
    {
        v331 = arm64g_calculate_flag_c(6, a3, v22, v23);
        v332 = v24 + v331;
        v333 = a0;
        v334 = arm64g_calculate_flag_c(4, v12, v16, 0);
        *(unsigned long long *)xsp = 0;
        *(unsigned long long *)(xsp + 8) = 0;
        v335 = arm64g_calculate_flag_c(8, v13, v17, v334);
        *(unsigned long long *)(xsp + 16) = 0;
        *(unsigned long long *)(xsp + 24) = 0;
        v336 = arm64g_calculate_flag_c(8, v14, v18, v335);
        v337 = v15 - v19 - (v336 ^ 1);
        *(unsigned long long *)(xsp + 32) = 0;
        *(unsigned long long *)(xsp + 40) = 0;
        v338 = arm64g_calculate_flag_c(8, v15, v19, v336);
        v339 = v332;
        v340 = v338;
        *(unsigned long long *)(xsp + 48) = 0;
        *(unsigned long long *)(xsp + 56) = 0;
        v341 = arm64g_calculate_condition(56, v332, 0, v338);
        if (v341 & 1)
        {
            v342 = v12;
            v343 = arm64g_calculate_condition(56, v339, 0, v340);
            if (!(v343 & 1))
                goto LABEL_9db266;
LABEL_9db265:
            v345 = v13;
            v346 = arm64g_calculate_condition(56, v339, 0, v340);
            if (!(v346 & 1))
                goto LABEL_9db26a;
LABEL_9db269:
            v348 = v14;
            v349 = arm64g_calculate_condition(56, v339, 0, v340);
            if (!(v349 & 1))
                goto LABEL_9db26e;
LABEL_9db26d:
            v337 = v15;
        }
        else
        {
            v342 = v12 - v16;
            v344 = arm64g_calculate_condition(56, v339, 0, v340);
            if (v344 & 1)
                goto LABEL_9db265;
LABEL_9db266:
            v345 = v13 - v17 - (v334 ^ 1);
            v347 = arm64g_calculate_condition(56, v339, 0, v340);
            if (v347 & 1)
                goto LABEL_9db269;
LABEL_9db26a:
            v348 = v14 - v18 - (v335 ^ 1);
            v350 = arm64g_calculate_condition(56, v339, 0, v340);
            if (v350 & 1)
                goto LABEL_9db26d;
LABEL_9db26e:
        }
        *v333 = v342;
        v333[1] = v345;
        v333[2] = v348;
        v333[3] = v337;
        return 1;
    }
}
