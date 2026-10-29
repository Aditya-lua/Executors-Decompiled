/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc03ddc..0xc0461c (2112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_c03ddc(void* a0, unsigned long long a1, unsigned long long a2, unsigned long long a3)
{
    unsigned long long iter;  // x20
    void* iter1;  // x19
    void* v13;  // x8
    unsigned long long v103;  // 4105
    unsigned long long v104;  // 4105
    unsigned long v105;  // cc_dep1
    unsigned long v106;  // cc_dep2
    void* v107;  // x0
    unsigned long long v108;  // 4105
    unsigned long long v109;  // 4105
    unsigned long v110;  // cc_dep1
    unsigned long v111;  // cc_dep2
    void* v112;  // x7
    void* v14;  // x11
    unsigned long long v113;  // 4105
    unsigned long long v114;  // 4105
    unsigned long v115;  // cc_dep1
    unsigned long v116;  // cc_dep2
    void* v117;  // x5
    unsigned long long v118;  // 4105
    unsigned long long v119;  // 4105
    unsigned long v120;  // cc_dep1
    unsigned long v121;  // cc_dep2
    void* v122;  // x1
    void* v15;  // x10
    unsigned long long v123;  // 4105
    unsigned long long v124;  // 4105
    unsigned long v125;  // cc_dep1
    unsigned long v126;  // cc_dep2
    void* v127;  // x6
    unsigned long long v128;  // 4105
    unsigned long long v129;  // 4105
    unsigned long v130;  // cc_dep1
    unsigned long v131;  // cc_dep2
    void* v132;  // x15
    void* v16;  // x9
    unsigned long long v133;  // 4105
    unsigned long long v134;  // 4105
    unsigned long v135;  // cc_dep1
    unsigned long v136;  // cc_dep2
    void* v137;  // x4
    unsigned long long v138;  // 4105
    unsigned long long v139;  // 4105
    unsigned long v140;  // cc_dep1
    unsigned long v141;  // cc_dep2
    void* v142;  // x3
    void* v17;  // x10
    unsigned long long v143;  // 4105
    unsigned long long v144;  // 4105
    unsigned long v145;  // cc_dep1
    unsigned long v146;  // cc_dep2
    void* v147;  // x7
    unsigned long long v148;  // 4105
    unsigned long long v149;  // 4105
    unsigned long v150;  // cc_dep1
    unsigned long v151;  // cc_dep2
    void* v152;  // x0
    void* v18;  // x9
    unsigned long long v153;  // 4105
    unsigned long long v154;  // 4105
    unsigned long v155;  // cc_dep1
    unsigned long v156;  // cc_dep2
    void* v157;  // x1
    unsigned long long v158;  // 4105
    unsigned long long v159;  // 4105
    unsigned long v160;  // cc_dep1
    unsigned long v161;  // cc_dep2
    void* v162;  // x5
    void* v19;  // x14
    unsigned long long v163;  // 4105
    unsigned long long v164;  // 4105
    unsigned long v165;  // cc_dep1
    unsigned long v166;  // cc_dep2
    void* v167;  // x4
    unsigned long long v168;  // 4105
    unsigned long long v169;  // 4105
    unsigned long v170;  // cc_dep1
    unsigned long v171;  // cc_dep2
    void* v172;  // x4
    void* node;  // x13
    unsigned long long v173;  // 4105
    unsigned long long v174;  // 4105
    unsigned long v175;  // cc_dep1
    unsigned long v176;  // cc_dep2
    void* v177;  // x16
    unsigned long long v178;  // 4105
    unsigned long long v179;  // 4105
    unsigned long v180;  // cc_dep1
    unsigned long v181;  // cc_dep2
    void* v182;  // x2
    void* v21;  // x11
    unsigned long long v183;  // 4105
    unsigned long long v184;  // 4105
    unsigned long v185;  // cc_dep1
    unsigned long v186;  // cc_dep2
    void* v187;  // x17
    unsigned long long v188;  // 4105
    unsigned long long v189;  // 4105
    unsigned long v190;  // cc_dep1
    unsigned long v191;  // cc_dep2
    void* v192;  // x5
    unsigned long long iter2;  // x12
    unsigned long long v193;  // 4105
    unsigned long long v194;  // 4105
    unsigned long v195;  // cc_dep1
    unsigned long v196;  // cc_dep2
    void* v197;  // x3
    unsigned long long v198;  // 4105
    unsigned long long v199;  // 4105
    unsigned long v200;  // cc_dep1
    unsigned long v201;  // cc_dep2
    void* v202;  // x14
    unsigned long long v5;  // x21
    void* v23;  // x15
    unsigned long long v203;  // 4105
    unsigned long long v204;  // 4105
    unsigned long v205;  // cc_dep1
    unsigned long v206;  // cc_dep2
    void* v207;  // x6
    unsigned long long v208;  // 4105
    unsigned long long v209;  // 4105
    unsigned long v210;  // cc_dep1
    unsigned long v211;  // cc_dep2
    void* v212;  // x1
    void* v24;  // x15
    unsigned long long v213;  // 4105
    unsigned long long v214;  // 4105
    unsigned long v215;  // cc_dep1
    unsigned long v216;  // cc_dep2
    unsigned long long v217;  // 4105
    void* v218;  // x2
    unsigned long long v219;  // 4105
    unsigned long long v220;  // 4105
    unsigned long v221;  // cc_dep1
    unsigned long v222;  // cc_dep2
    void* v25;  // x14
    void* v223;  // x5
    unsigned long long v224;  // 4105
    unsigned long long v225;  // 4105
    unsigned long v226;  // cc_dep1
    unsigned long v227;  // cc_dep2
    void* v228;  // x3
    unsigned long long v229;  // 4105
    unsigned long long v230;  // 4105
    unsigned long v231;  // cc_dep1
    unsigned long v232;  // cc_dep2
    void* v26;  // x16
    void* v233;  // x4
    unsigned long long v234;  // 4105
    unsigned long long v235;  // 4105
    unsigned long v236;  // cc_dep1
    unsigned long v237;  // cc_dep2
    void* v238;  // x0
    unsigned long long v239;  // 4105
    unsigned long long v240;  // 4105
    unsigned long v241;  // cc_dep1
    unsigned long v242;  // cc_dep2
    void* v27;  // x13
    void* v243;  // x0
    unsigned long long v244;  // 4105
    unsigned long long v245;  // 4105
    unsigned long v246;  // cc_dep1
    unsigned long v247;  // cc_dep2
    void* v248;  // x12
    unsigned long long v249;  // 4105
    unsigned long long v250;  // 4105
    void* v251;  // x13
    unsigned long v252;  // cc_dep1
    unsigned long long idx;  // x8
    unsigned long v253;  // cc_dep2
    void* v254;  // x15
    unsigned long long v255;  // 4105
    unsigned long long v256;  // 4105
    unsigned long v257;  // cc_dep1
    unsigned long v258;  // cc_dep2
    void* v259;  // x16
    unsigned long long v260;  // 4105
    unsigned long long v261;  // 4105
    unsigned long v262;  // cc_dep1
    void* v29;  // x9
    unsigned long v263;  // cc_dep2
    void* v264;  // x2
    unsigned long long v265;  // 4105
    unsigned long long v266;  // 4105
    unsigned long v267;  // cc_dep1
    unsigned long v268;  // cc_dep2
    unsigned long long v269;  // 4105
    unsigned long long v270;  // 4105
    unsigned long v271;  // cc_dep1
    unsigned long v272;  // cc_dep2
    unsigned long long v30;  // x8
    void* v273;  // x14
    unsigned long long v274;  // 4105
    unsigned long long v275;  // 4105
    unsigned long v276;  // cc_dep1
    unsigned long v277;  // cc_dep2
    void* v278;  // x1
    unsigned long long v279;  // 4105
    unsigned long long v280;  // 4105
    unsigned long v281;  // cc_dep1
    unsigned long v282;  // cc_dep2
    void* v31;  // x9
    void* v283;  // x16
    unsigned long long v284;  // 4105
    unsigned long long v285;  // 4105
    void* v286;  // x12
    unsigned long long v287;  // 4113
    void* v288;  // x12
    unsigned long long v289;  // x12
    void* v290;  // x12
    void* v291;  // x13
    void* v292;  // x15
    void* v32;  // x10
    void* v293;  // x14
    unsigned long v294;  // cc_dep1
    unsigned long v295;  // cc_dep2
    void* v296;  // x16
    unsigned long long v297;  // 4105
    unsigned long long v298;  // 4105
    void* v299;  // x17
    void* v300;  // x14
    unsigned long v301;  // cc_dep1
    unsigned long v302;  // cc_dep2
    unsigned long long v6;  // x22
    void* v33;  // x9
    void* v303;  // x0
    unsigned long long v304;  // 4105
    unsigned long long v305;  // 4105
    void* v306;  // x1
    void* v307;  // x14
    unsigned long v308;  // cc_dep1
    unsigned long v309;  // cc_dep2
    void* v310;  // x2
    unsigned long long v311;  // 4105
    unsigned long long v312;  // 4105
    void* v34;  // x14
    void* v313;  // x15
    unsigned long v314;  // cc_dep1
    unsigned long v315;  // cc_dep2
    void* v316;  // x3
    unsigned long long v317;  // 4105
    unsigned long long v318;  // 4105
    unsigned long v319;  // cc_dep1
    unsigned long v320;  // cc_dep2
    void* v321;  // x1
    unsigned long long v322;  // 4105
    void* l;  // x13
    unsigned long long v323;  // 4105
    unsigned long v324;  // cc_dep1
    unsigned long v325;  // cc_dep2
    void* v326;  // x0
    unsigned long long v327;  // 4105
    unsigned long long v328;  // 4105
    unsigned long v329;  // cc_dep1
    unsigned long v330;  // cc_dep2
    void* v331;  // x15
    unsigned long long v332;  // 4105
    void* v36;  // x11
    unsigned long long v333;  // 4105
    unsigned long v334;  // cc_dep1
    unsigned long v335;  // cc_dep2
    void* v336;  // x3
    unsigned long long v337;  // 4105
    unsigned long long v338;  // 4105
    unsigned long v339;  // cc_dep1
    unsigned long v340;  // cc_dep2
    void* v341;  // x2
    unsigned long long v342;  // 4105
    unsigned long long v37;  // x12
    unsigned long long v343;  // 4105
    unsigned long v344;  // cc_dep1
    unsigned long v345;  // cc_dep2
    void* v346;  // x14
    unsigned long long v347;  // 4105
    unsigned long long v348;  // 4105
    unsigned long v349;  // cc_dep1
    unsigned long v350;  // cc_dep2
    void* v351;  // x16
    unsigned long long v352;  // 4105
    void* v38;  // x15
    unsigned long long v353;  // 4105
    unsigned long v354;  // cc_dep1
    unsigned long v355;  // cc_dep2
    void* v356;  // x0
    unsigned long long v357;  // 4105
    unsigned long long v358;  // 4105
    unsigned long v359;  // cc_dep1
    unsigned long v360;  // cc_dep2
    void* v361;  // x1
    unsigned long long v362;  // 4105
    void* v39;  // x15
    unsigned long long v363;  // 4105
    unsigned long v364;  // cc_dep1
    unsigned long v365;  // cc_dep2
    void* v366;  // x17
    unsigned long long v367;  // 4105
    unsigned long long v368;  // 4105
    unsigned long v369;  // cc_dep1
    unsigned long v370;  // cc_dep2
    void* v371;  // x3
    unsigned long long v372;  // 4105
    void* v40;  // x14
    unsigned long long v373;  // 4105
    unsigned long v374;  // cc_dep1
    unsigned long v375;  // cc_dep2
    void* v376;  // x16
    unsigned long long v377;  // 4105
    unsigned long long v378;  // 4105
    unsigned long v379;  // cc_dep1
    unsigned long v380;  // cc_dep2
    void* v381;  // x13
    unsigned long long v382;  // 4105
    void* v41;  // x16
    unsigned long long v383;  // 4105
    unsigned long v384;  // cc_dep1
    unsigned long v385;  // cc_dep2
    void* v386;  // x2
    unsigned long long v387;  // 4105
    unsigned long long v388;  // 4105
    unsigned long v389;  // cc_dep1
    unsigned long v390;  // cc_dep2
    void* v391;  // x15
    unsigned long long v392;  // 4105
    void* v42;  // x13
    unsigned long long v393;  // 4105
    unsigned long v394;  // cc_dep1
    unsigned long v395;  // cc_dep2
    void* v396;  // x15
    unsigned long long v397;  // 4105
    unsigned long long v398;  // 4105
    unsigned long v399;  // cc_dep1
    unsigned long v400;  // cc_dep2
    unsigned long long v401;  // 4105
    unsigned long long v402;  // 4105
    unsigned long long v7;  // x3
    unsigned long long v43;  // x1
    unsigned long v403;  // cc_dep1
    unsigned long v404;  // cc_dep2
    void* v405;  // x1
    unsigned long long v406;  // 4105
    unsigned long long v407;  // 4105
    unsigned long v408;  // cc_dep1
    unsigned long v409;  // cc_dep2
    void* v410;  // x2
    unsigned long long v411;  // 4105
    unsigned long long v412;  // 4105
    void* v44;  // x24
    unsigned long v413;  // cc_dep1
    unsigned long v414;  // cc_dep2
    void* v415;  // x12
    unsigned long long v416;  // 4105
    unsigned long long v417;  // 4105
    void* v418;  // x13
    unsigned long long v419;  // 4113
    void* v420;  // x12
    unsigned long long v421;  // x12
    void* v422;  // x13
    void* v45;  // x8
    void* v423;  // x15
    void* v424;  // x14
    unsigned long long v425;  // x17
    void* v426;  // x15
    unsigned long long v427;  // x13
    void* v428;  // x12
    void* v429;  // x14
    void* *v430;  // x11
    void* v431;  // x10
    void* v432;  // x16
    void* v46;  // x25
    void* v433;  // x17
    void* v434;  // x16
    void* v435;  // x16
    void* v436;  // x17
    unsigned long v437;  // cc_dep1
    unsigned long v438;  // cc_dep2
    unsigned long long v439;  // 4109
    unsigned long long v440;  // 4108
    unsigned long long v441;  // 4108
    unsigned long long v442;  // x16
    unsigned long long v47;  // x9
    void* v443;  // x9
    void* v444;  // x12
    void* v445;  // x15
    unsigned long long v447;  // 4110
    unsigned long long v448;  // 4102
    unsigned long long v449;  // 4110
    unsigned long long v450;  // 4102
    unsigned long long v48;  // x11
    void* v49;  // x8
    void* v50;  // x10
    void* i;  // x10
    void* v52;  // x16
    void* v8;  // x1
    void* v53;  // x13
    void* v54;  // x14
    void* v55;  // x15
    unsigned long v56;  // cc_dep1
    unsigned long v57;  // cc_dep2
    void* v58;  // x12
    unsigned long long v59;  // 4105
    unsigned long long v60;  // 4105
    void* v61;  // x1
    void* v62;  // x14
    void* v9;  // x2
    unsigned long v63;  // cc_dep1
    unsigned long v64;  // cc_dep2
    void* v65;  // x17
    unsigned long long v66;  // 4105
    unsigned long long v67;  // 4105
    void* v68;  // x15
    void* v69;  // x0
    unsigned long v70;  // cc_dep1
    unsigned long v71;  // cc_dep2
    void* v72;  // x3
    unsigned int v10;  // w10
    unsigned long long v73;  // 4105
    unsigned long long v74;  // 4105
    void* v75;  // x1
    void* v76;  // x2
    unsigned long v77;  // cc_dep1
    unsigned long v78;  // cc_dep2
    void* v79;  // x5
    unsigned long long v80;  // 4105
    unsigned long long v81;  // 4105
    void* v82;  // x1
    void* v11;  // x9
    void* v83;  // x4
    void* v84;  // x6
    unsigned long v85;  // cc_dep1
    unsigned long v86;  // cc_dep2
    void* v87;  // x7
    unsigned long long v88;  // 4105
    unsigned long long v89;  // 4105
    unsigned long v90;  // cc_dep1
    unsigned long v91;  // cc_dep2
    void* v92;  // x1
    unsigned long long v12;  // x9
    unsigned long long v93;  // 4105
    unsigned long long v94;  // 4105
    unsigned long v95;  // cc_dep1
    unsigned long v96;  // cc_dep2
    void* v97;  // x4
    unsigned long long v98;  // 4105
    unsigned long long v99;  // 4105
    unsigned long v100;  // cc_dep1
    unsigned long v101;  // cc_dep2
    void* v102;  // x2
    void* v0;  // [bp-0x150]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    iter = a1;
    iter1 = a0;
    if (33 <= a1)
    {
        v5 = a3;
        v6 = a2;
        do
        {
            v7 = iter >> 3;
            v8 = iter1 + v7 * 32;
            v9 = iter1 + 56 * v7;
            if (64 > iter)
            {
                v10 = (unsigned long long)*(long long *)v8 > (unsigned long long)*(long long *)iter1;
                if (v10 ^ (unsigned long long)*(long long *)v9 > (unsigned long long)*(long long *)v8)
                    v11 = v9;
                else
                    v11 = v8;
                if (v10 ^ (unsigned long long)*(long long *)v9 > (unsigned long long)*(long long *)iter1)
                    a0 = iter1;
                else
                    a0 = v11;
                v5 = (unsigned int)v5 - 1;
                v12 = a0 - iter1;
                v13 = iter1 + iter * 8;
                if (!v6)
                    goto LABEL_c04398;
                goto LABEL_c042fc;
            }
            else
            {
                a0 = sub_c0cabc(iter1);
                v5 = (unsigned int)v5 - 1;
                v12 = a0 - iter1;
                v13 = iter1 + iter * 8;
                if (v6)
                {
LABEL_c042fc:
                    v14 = *(long long *)((char *)iter1 + v12);
                    v15 = *(long long *)iter1;
                    if ((unsigned long long)*(long long *)v6 < v14)
                        goto LABEL_c043a0;
                    *(void* *)iter1 = v14;
                    *(void* *)((char *)iter1 + v12) = v15;
                    v16 = iter1;
                    v17 = (long long)v16[8];
                    v18 = v16 + 8;
                    v19 = v13 - 8;
                    node = iter1 + 16;
                    v21 = *(long long *)iter1;
                    if (v19 > node)
                    {
                        iter2 = 0;
                        do
                        {
                            v23 = *(long long *)node;
                            *(long long *)((char *)node - 8) = *(long long *)((char *)v18 + 8 * iter2);
                            *(void* *)((char *)v18 + 8 * iter2) = v23;
                            if (v21 >= v23)
                                iter2 += 1;
                            v24 = (long long)node[8];
                            *(long long *)node = *(long long *)((char *)v18 + 8 * iter2);
                            node += 16;
                            *(void* *)((char *)v18 + 8 * iter2) = v24;
                            if (v21 >= v24)
                                iter2 += 1;
                        } while (node < v19);
                        v25 = node - 8;
                        if (node == v13)
                            goto LABEL_c044e0;
                    }
                    else
                    {
                        iter2 = 0;
                        v25 = v18;
                        if (node == v13)
                            goto LABEL_c044e0;
                    }
                    do
                    {
                        v26 = *(long long *)node;
                        v27 = node + 8;
                        *(long long *)v25 = *(long long *)((char *)v18 + 8 * iter2);
                        *(void* *)((char *)v18 + 8 * iter2) = v26;
                        if (v21 >= v26)
                            iter2 += 1;
                    } while ((v25 = node, node = v27, node != v13));
                    v25 = v27 - 8;
LABEL_c044e0:
                    *(long long *)v25 = *(long long *)((char *)v18 + 8 * iter2);
                    *(void* *)((char *)v18 + 8 * iter2) = v17;
                    if (v21 < v17)
                        idx = iter2;
                    else
                        idx = iter2 + 1;
                    if (iter <= idx)
                        __debugbreak();
                    v6 = 0;
                    v29 = *(long long *)iter1;
                    *(long long *)iter1 = *(long long *)((char *)iter1 + 8 * idx);
                    *(void* *)((char *)iter1 + 8 * idx) = v29;
                    v30 = idx + 1;
                    iter -= v30;
                    iter1 += v30 * 8;
                }
                else
                {
LABEL_c04398:
                    v15 = *(long long *)iter1;
                    v14 = *(long long *)((char *)iter1 + v12);
LABEL_c043a0:
                    *(void* *)iter1 = v14;
                    *(void* *)((char *)iter1 + v12) = v15;
                    v31 = iter1;
                    v32 = (long long)v31[8];
                    v33 = v31 + 8;
                    v34 = v13 - 8;
                    l = iter1 + 16;
                    v36 = *(long long *)iter1;
                    if (v34 > l)
                    {
                        v37 = 0;
                        do
                        {
                            v38 = *(long long *)l;
                            *(long long *)((char *)l - 8) = *(long long *)((char *)v33 + 8 * v37);
                            *(void* *)((char *)v33 + 8 * v37) = v38;
                            if (v36 > v38)
                                v37 += 1;
                            v39 = (long long)l[8];
                            *(long long *)l = *(long long *)((char *)v33 + 8 * v37);
                            l += 16;
                            *(void* *)((char *)v33 + 8 * v37) = v39;
                            if (v36 > v39)
                                v37 += 1;
                        } while (l < v34);
                        v40 = l - 8;
                        if (l == v13)
                            goto LABEL_c0444c;
                    }
                    else
                    {
                        v37 = 0;
                        v40 = v33;
                        if (l == v13)
                            goto LABEL_c0444c;
                    }
                    do
                    {
                        v41 = *(long long *)l;
                        v42 = l + 8;
                        *(long long *)v40 = *(long long *)((char *)v33 + 8 * v37);
                        *(void* *)((char *)v33 + 8 * v37) = v41;
                        if (v36 > v41)
                            v37 += 1;
                    } while ((v40 = l, l = v42, l != v13));
                    v40 = v42 - 8;
LABEL_c0444c:
                    *(long long *)v40 = *(long long *)((char *)v33 + 8 * v37);
                    *(void* *)((char *)v33 + 8 * v37) = v32;
                    if (v36 <= v32)
                        v43 = v37;
                    else
                        v43 = v37 + 1;
                    if (iter <= v43)
                        __debugbreak();
                    v44 = iter1 + v43 * 8;
                    v45 = *(long long *)iter1;
                    *(long long *)iter1 = *(long long *)v44;
                    v46 = v44;
                    *(void* *)v46 = v45;
                    iter += ~v43;
                    a0 = sub_c03ddc(iter1, v43, v6, v5);
                    v6 = v46;
                    iter1 = v6 + 8;
                }
            }
        } while (iter >= 33);
    }
    if (iter < 2)
        return a0;
    v47 = iter >> 1;
    if (iter < 18)
        v48 = iter;
    else
        v48 = v47;
    v49 = iter1 + v47 * 8;
    v50 = iter1;
    do
    {
        i = v50;
        if (v48 > 12)
        {
            v52 = (long long)i[88];
            v53 = (long long)i[96];
            v54 = *(long long *)i;
            v55 = (long long)i[8];
            v56 = v53;
            v57 = v54;
            if (v54 < v53)
            {
                v58 = v53;
                v59 = arm64g_calculate_condition(52, v56, v57, 0);
                if (!(v59 & 1))
                    goto LABEL_c03e3e;
            }
            else
            {
                v58 = v54;
                v60 = arm64g_calculate_condition(52, v56, v57, 0);
                if (!(v60 & 1))
                {
LABEL_c03e3e:
                    v53 = v54;
LABEL_c03e40:
                    v61 = (long long)i[72];
                    v62 = (long long)i[80];
                    v63 = v62;
                    v64 = v55;
                    if (v55 < v62)
                    {
                        v65 = v62;
                        v66 = arm64g_calculate_condition(52, v63, v64, 0);
                        if (!(v66 & 1))
                            goto LABEL_c03e4e;
                    }
                    else
                    {
                        v65 = v55;
                        v67 = arm64g_calculate_condition(52, v63, v64, 0);
                        if (!(v67 & 1))
                        {
LABEL_c03e4e:
                            v62 = v55;
LABEL_c03e50:
                            v68 = (long long)i[16];
                            v69 = (long long)i[24];
                            v70 = v61;
                            v71 = v68;
                            if (v68 < v61)
                            {
                                v72 = v61;
                                v73 = arm64g_calculate_condition(52, v70, v71, 0);
                                if (!(v73 & 1))
                                    goto LABEL_c03e5e;
                            }
                            else
                            {
                                v72 = v68;
                                v74 = arm64g_calculate_condition(52, v70, v71, 0);
                                if (!(v74 & 1))
                                {
LABEL_c03e5e:
LABEL_c03e60:
                                    v75 = (long long)i[56];
                                    v76 = (long long)i[64];
                                    v77 = v75;
                                    v78 = v69;
                                    if (v69 < v75)
                                    {
                                        v79 = v75;
                                        v80 = arm64g_calculate_condition(52, v77, v78, 0);
                                        if (!(v80 & 1))
                                            goto LABEL_c03e6e;
                                    }
                                    else
                                    {
                                        v79 = v69;
                                        v81 = arm64g_calculate_condition(52, v77, v78, 0);
                                        if (!(v81 & 1))
                                        {
LABEL_c03e6e:
LABEL_c03e70:
                                            v82 = (long long)i[40];
                                            v83 = (long long)i[48];
                                            v84 = (long long)i[32];
                                            v85 = v52;
                                            v86 = v82;
                                            if (v82 < v52)
                                            {
                                                v87 = v52;
                                                v88 = arm64g_calculate_condition(52, v85, v86, 0);
                                                if (!(v88 & 1))
                                                    goto LABEL_c03e82;
                                            }
                                            else
                                            {
                                                v87 = v82;
                                                v89 = arm64g_calculate_condition(52, v85, v86, 0);
                                                if (!(v89 & 1))
                                                {
LABEL_c03e82:
                                                    v52 = v82;
LABEL_c03e84:
                                                    v90 = v76;
                                                    v91 = v83;
                                                    if (v83 < v76)
                                                    {
                                                        v92 = v76;
                                                        v93 = arm64g_calculate_condition(52, v90, v91, 0);
                                                        if (!(v93 & 1))
                                                            goto LABEL_c03e8e;
                                                    }
                                                    else
                                                    {
                                                        v92 = v83;
                                                        v94 = arm64g_calculate_condition(52, v90, v91, 0);
                                                        if (!(v94 & 1))
                                                        {
LABEL_c03e8e:
                                                            v76 = v83;
LABEL_c03e90:
                                                            v95 = v76;
                                                            v96 = v62;
                                                            if (v62 < v76)
                                                            {
                                                                v97 = v76;
                                                                v98 = arm64g_calculate_condition(52, v95, v96, 0);
                                                                if (!(v98 & 1))
                                                                    goto LABEL_c03e9a;
                                                            }
                                                            else
                                                            {
                                                                v97 = v62;
                                                                v99 = arm64g_calculate_condition(52, v95, v96, 0);
                                                                if (!(v99 & 1))
                                                                {
LABEL_c03e9a:
LABEL_c03e9c:
                                                                    v100 = v69;
                                                                    v101 = v68;
                                                                    if (v68 < v69)
                                                                    {
                                                                        v102 = v69;
                                                                        v103 = arm64g_calculate_condition(52, v100, v101, 0);
                                                                        if (!(v103 & 1))
                                                                            goto LABEL_c03ea6;
                                                                    }
                                                                    else
                                                                    {
                                                                        v102 = v68;
                                                                        v104 = arm64g_calculate_condition(52, v100, v101, 0);
                                                                        if (!(v104 & 1))
                                                                        {
LABEL_c03ea6:
LABEL_c03ea8:
                                                                            v105 = v87;
                                                                            v106 = v84;
                                                                            if (v84 < v87)
                                                                            {
                                                                                v107 = v87;
                                                                                v108 = arm64g_calculate_condition(52, v105, v106, 0);
                                                                                if (!(v108 & 1))
                                                                                    goto LABEL_c03eb2;
                                                                            }
                                                                            else
                                                                            {
                                                                                v107 = v84;
                                                                                v109 = arm64g_calculate_condition(52, v105, v106, 0);
                                                                                if (!(v109 & 1))
                                                                                {
LABEL_c03eb2:
LABEL_c03eb4:
                                                                                    v110 = v72;
                                                                                    v111 = v79;
                                                                                    if (v79 < v72)
                                                                                    {
                                                                                        v112 = v72;
                                                                                        v113 = arm64g_calculate_condition(52, v110, v111, 0);
                                                                                        if (!(v113 & 1))
                                                                                            goto LABEL_c03ebe;
                                                                                    }
                                                                                    else
                                                                                    {
                                                                                        v112 = v79;
                                                                                        v114 = arm64g_calculate_condition(52, v110, v111, 0);
                                                                                        if (!(v114 & 1))
                                                                                        {
LABEL_c03ebe:
                                                                                            v72 = v79;
LABEL_c03ec0:
                                                                                            v115 = v65;
                                                                                            v116 = v92;
                                                                                            if (v92 < v65)
                                                                                            {
                                                                                                v117 = v65;
                                                                                                v118 = arm64g_calculate_condition(52, v115, v116, 0);
                                                                                                if (!(v118 & 1))
                                                                                                    goto LABEL_c03eca;
                                                                                            }
                                                                                            else
                                                                                            {
                                                                                                v117 = v92;
                                                                                                v119 = arm64g_calculate_condition(52, v115, v116, 0);
                                                                                                if (!(v119 & 1))
                                                                                                {
LABEL_c03eca:
                                                                                                    v65 = v92;
LABEL_c03ecc:
                                                                                                    v120 = v84;
                                                                                                    v121 = v53;
                                                                                                    if (v53 < v84)
                                                                                                    {
                                                                                                        v122 = v84;
                                                                                                        v123 = arm64g_calculate_condition(52, v120, v121, 0);
                                                                                                        if (!(v123 & 1))
                                                                                                            goto LABEL_c03ed6;
                                                                                                    }
                                                                                                    else
                                                                                                    {
                                                                                                        v122 = v53;
                                                                                                        v124 = arm64g_calculate_condition(52, v120, v121, 0);
                                                                                                        if (!(v124 & 1))
                                                                                                        {
LABEL_c03ed6:
LABEL_c03ed8:
                                                                                                            v125 = v68;
                                                                                                            v126 = v62;
                                                                                                            if (v62 < v68)
                                                                                                            {
                                                                                                                v127 = v68;
                                                                                                                v128 = arm64g_calculate_condition(52, v125, v126, 0);
                                                                                                                if (!(v128 & 1))
                                                                                                                    goto LABEL_c03ee2;
                                                                                                            }
                                                                                                            else
                                                                                                            {
                                                                                                                v127 = v62;
                                                                                                                v129 = arm64g_calculate_condition(52, v125, v126, 0);
                                                                                                                if (!(v129 & 1))
                                                                                                                {
LABEL_c03ee2:
LABEL_c03ee4:
                                                                                                                    v130 = v97;
                                                                                                                    v131 = v102;
                                                                                                                    if (v102 < v97)
                                                                                                                    {
                                                                                                                        v132 = v97;
                                                                                                                        v133 = arm64g_calculate_condition(52, v130, v131, 0);
                                                                                                                        if (!(v133 & 1))
                                                                                                                            goto LABEL_c03eee;
                                                                                                                    }
                                                                                                                    else
                                                                                                                    {
                                                                                                                        v132 = v102;
                                                                                                                        v134 = arm64g_calculate_condition(52, v130, v131, 0);
                                                                                                                        if (!(v134 & 1))
                                                                                                                        {
LABEL_c03eee:
LABEL_c03ef0:
                                                                                                                            v135 = v65;
                                                                                                                            v136 = v72;
                                                                                                                            if (v72 < v65)
                                                                                                                            {
                                                                                                                                v137 = v65;
                                                                                                                                v138 = arm64g_calculate_condition(52, v135, v136, 0);
                                                                                                                                if (!(v138 & 1))
                                                                                                                                    goto LABEL_c03efa;
                                                                                                                            }
                                                                                                                            else
                                                                                                                            {
                                                                                                                                v137 = v72;
                                                                                                                                v139 = arm64g_calculate_condition(52, v135, v136, 0);
                                                                                                                                if (!(v139 & 1))
                                                                                                                                {
LABEL_c03efa:
                                                                                                                                    v65 = v72;
LABEL_c03efc:
                                                                                                                                    v140 = v117;
                                                                                                                                    v141 = v112;
                                                                                                                                    if (v112 < v117)
                                                                                                                                    {
                                                                                                                                        v142 = v117;
                                                                                                                                        v143 = arm64g_calculate_condition(52, v140, v141, 0);
                                                                                                                                        if (!(v143 & 1))
                                                                                                                                            goto LABEL_c03f06;
                                                                                                                                    }
                                                                                                                                    else
                                                                                                                                    {
                                                                                                                                        v142 = v112;
                                                                                                                                        v144 = arm64g_calculate_condition(52, v140, v141, 0);
                                                                                                                                        if (!(v144 & 1))
                                                                                                                                        {
LABEL_c03f06:
                                                                                                                                            v117 = v112;
LABEL_c03f08:
                                                                                                                                            v145 = v58;
                                                                                                                                            v146 = v107;
                                                                                                                                            if (v107 < v58)
                                                                                                                                            {
                                                                                                                                                v147 = v58;
                                                                                                                                                v148 = arm64g_calculate_condition(52, v145, v146, 0);
                                                                                                                                                if (!(v148 & 1))
                                                                                                                                                    goto LABEL_c03f12;
                                                                                                                                            }
                                                                                                                                            else
                                                                                                                                            {
                                                                                                                                                v147 = v107;
                                                                                                                                                v149 = arm64g_calculate_condition(52, v145, v146, 0);
                                                                                                                                                if (!(v149 & 1))
                                                                                                                                                {
LABEL_c03f12:
                                                                                                                                                    v58 = v107;
LABEL_c03f14:
                                                                                                                                                    v150 = v132;
                                                                                                                                                    v151 = v122;
                                                                                                                                                    if (v122 < v132)
                                                                                                                                                    {
                                                                                                                                                        v152 = v132;
                                                                                                                                                        v153 = arm64g_calculate_condition(52, v150, v151, 0);
                                                                                                                                                        if (!(v153 & 1))
                                                                                                                                                            goto LABEL_c03f1e;
                                                                                                                                                    }
                                                                                                                                                    else
                                                                                                                                                    {
                                                                                                                                                        v152 = v122;
                                                                                                                                                        v154 = arm64g_calculate_condition(52, v150, v151, 0);
                                                                                                                                                        if (!(v154 & 1))
                                                                                                                                                        {
LABEL_c03f1e:
                                                                                                                                                            v132 = v122;
LABEL_c03f20:
                                                                                                                                                            v155 = v117;
                                                                                                                                                            v156 = v52;
                                                                                                                                                            if (v52 < v117)
                                                                                                                                                            {
                                                                                                                                                                v157 = v117;
                                                                                                                                                                v158 = arm64g_calculate_condition(52, v155, v156, 0);
                                                                                                                                                                if (!(v158 & 1))
                                                                                                                                                                    goto LABEL_c03f2a;
                                                                                                                                                            }
                                                                                                                                                            else
                                                                                                                                                            {
                                                                                                                                                                v157 = v52;
                                                                                                                                                                v159 = arm64g_calculate_condition(52, v155, v156, 0);
                                                                                                                                                                if (!(v159 & 1))
                                                                                                                                                                {
LABEL_c03f2a:
LABEL_c03f2c:
                                                                                                                                                                    v160 = v58;
                                                                                                                                                                    v161 = v137;
                                                                                                                                                                    if (v137 < v58)
                                                                                                                                                                    {
                                                                                                                                                                        v162 = v58;
                                                                                                                                                                        v163 = arm64g_calculate_condition(52, v160, v161, 0);
                                                                                                                                                                        if (!(v163 & 1))
                                                                                                                                                                            goto LABEL_c03f36;
                                                                                                                                                                    }
                                                                                                                                                                    else
                                                                                                                                                                    {
                                                                                                                                                                        v162 = v137;
                                                                                                                                                                        v164 = arm64g_calculate_condition(52, v160, v161, 0);
                                                                                                                                                                        if (!(v164 & 1))
                                                                                                                                                                        {
LABEL_c03f36:
                                                                                                                                                                            v58 = v137;
LABEL_c03f38:
                                                                                                                                                                            v165 = v147;
                                                                                                                                                                            v166 = v142;
                                                                                                                                                                            if (v142 < v147)
                                                                                                                                                                            {
                                                                                                                                                                                v167 = v147;
                                                                                                                                                                                v168 = arm64g_calculate_condition(52, v165, v166, 0);
                                                                                                                                                                                if (!(v168 & 1))
                                                                                                                                                                                    goto LABEL_c03f42;
                                                                                                                                                                            }
                                                                                                                                                                            else
                                                                                                                                                                            {
                                                                                                                                                                                v167 = v142;
                                                                                                                                                                                v169 = arm64g_calculate_condition(52, v165, v166, 0);
                                                                                                                                                                                if (!(v169 & 1))
                                                                                                                                                                                {
LABEL_c03f42:
LABEL_c03f44:
                                                                                                                                                                                    *(void* *)&i[96] = v167;
                                                                                                                                                                                    v170 = v52;
                                                                                                                                                                                    v171 = v53;
                                                                                                                                                                                    if (v53 < v52)
                                                                                                                                                                                    {
                                                                                                                                                                                        v172 = v52;
                                                                                                                                                                                        v173 = arm64g_calculate_condition(52, v170, v171, 0);
                                                                                                                                                                                        if (!(v173 & 1))
                                                                                                                                                                                            goto LABEL_c03f52;
                                                                                                                                                                                    }
                                                                                                                                                                                    else
                                                                                                                                                                                    {
                                                                                                                                                                                        v172 = v53;
                                                                                                                                                                                        v174 = arm64g_calculate_condition(52, v170, v171, 0);
                                                                                                                                                                                        if (!(v174 & 1))
                                                                                                                                                                                        {
LABEL_c03f52:
LABEL_c03f54:
                                                                                                                                                                                            v175 = v58;
                                                                                                                                                                                            v176 = v102;
                                                                                                                                                                                            if (v102 < v58)
                                                                                                                                                                                            {
                                                                                                                                                                                                v177 = v58;
                                                                                                                                                                                                v178 = arm64g_calculate_condition(52, v175, v176, 0);
                                                                                                                                                                                                if (!(v178 & 1))
                                                                                                                                                                                                    goto LABEL_c03f5e;
                                                                                                                                                                                            }
                                                                                                                                                                                            else
                                                                                                                                                                                            {
                                                                                                                                                                                                v177 = v102;
                                                                                                                                                                                                v179 = arm64g_calculate_condition(52, v175, v176, 0);
                                                                                                                                                                                                if (!(v179 & 1))
                                                                                                                                                                                                {
LABEL_c03f5e:
                                                                                                                                                                                                    v58 = v102;
LABEL_c03f60:
                                                                                                                                                                                                    v180 = v65;
                                                                                                                                                                                                    v181 = v132;
                                                                                                                                                                                                    if (v132 < v65)
                                                                                                                                                                                                    {
                                                                                                                                                                                                        v182 = v65;
                                                                                                                                                                                                        v183 = arm64g_calculate_condition(52, v180, v181, 0);
                                                                                                                                                                                                        if (!(v183 & 1))
                                                                                                                                                                                                            goto LABEL_c03f6a;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    else
                                                                                                                                                                                                    {
                                                                                                                                                                                                        v182 = v132;
                                                                                                                                                                                                        v184 = arm64g_calculate_condition(52, v180, v181, 0);
                                                                                                                                                                                                        if (!(v184 & 1))
                                                                                                                                                                                                        {
LABEL_c03f6a:
LABEL_c03f6c:
                                                                                                                                                                                                            v185 = v162;
                                                                                                                                                                                                            v186 = v152;
                                                                                                                                                                                                            if (v152 < v162)
                                                                                                                                                                                                            {
                                                                                                                                                                                                                v187 = v162;
                                                                                                                                                                                                                v188 = arm64g_calculate_condition(52, v185, v186, 0);
                                                                                                                                                                                                                if (!(v188 & 1))
                                                                                                                                                                                                                    goto LABEL_c03f76;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            else
                                                                                                                                                                                                            {
                                                                                                                                                                                                                v187 = v152;
                                                                                                                                                                                                                v189 = arm64g_calculate_condition(52, v185, v186, 0);
                                                                                                                                                                                                                if (!(v189 & 1))
                                                                                                                                                                                                                {
LABEL_c03f76:
LABEL_c03f78:
                                                                                                                                                                                                                    v190 = v142;
                                                                                                                                                                                                                    v191 = v157;
                                                                                                                                                                                                                    if (v157 < v142)
                                                                                                                                                                                                                    {
                                                                                                                                                                                                                        v192 = v142;
                                                                                                                                                                                                                        v193 = arm64g_calculate_condition(52, v190, v191, 0);
                                                                                                                                                                                                                        if (!(v193 & 1))
                                                                                                                                                                                                                            goto LABEL_c03f82;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    else
                                                                                                                                                                                                                    {
                                                                                                                                                                                                                        v192 = v157;
                                                                                                                                                                                                                        v194 = arm64g_calculate_condition(52, v190, v191, 0);
                                                                                                                                                                                                                        if (!(v194 & 1))
                                                                                                                                                                                                                        {
LABEL_c03f82:
LABEL_c03f84:
                                                                                                                                                                                                                            v195 = v62;
                                                                                                                                                                                                                            v196 = v53;
                                                                                                                                                                                                                            if (v53 < v62)
                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                v197 = v62;
                                                                                                                                                                                                                                v198 = arm64g_calculate_condition(52, v195, v196, 0);
                                                                                                                                                                                                                                if (!(v198 & 1))
                                                                                                                                                                                                                                    goto LABEL_c03f8e;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            else
                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                v197 = v53;
                                                                                                                                                                                                                                v199 = arm64g_calculate_condition(52, v195, v196, 0);
                                                                                                                                                                                                                                if (!(v199 & 1))
                                                                                                                                                                                                                                {
LABEL_c03f8e:
LABEL_c03f90:
                                                                                                                                                                                                                                    v200 = v172;
                                                                                                                                                                                                                                    v201 = v127;
                                                                                                                                                                                                                                    if (v127 < v172)
                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                        v202 = v172;
                                                                                                                                                                                                                                        v203 = arm64g_calculate_condition(52, v200, v201, 0);
                                                                                                                                                                                                                                        if (!(v203 & 1))
                                                                                                                                                                                                                                            goto LABEL_c03f9a;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    else
                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                        v202 = v127;
                                                                                                                                                                                                                                        v204 = arm64g_calculate_condition(52, v200, v201, 0);
                                                                                                                                                                                                                                        if (!(v204 & 1))
                                                                                                                                                                                                                                        {
LABEL_c03f9a:
                                                                                                                                                                                                                                            v172 = v127;
LABEL_c03f9c:
                                                                                                                                                                                                                                            v205 = v157;
                                                                                                                                                                                                                                            v206 = v152;
                                                                                                                                                                                                                                            if (v152 < v157)
                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                                v207 = v157;
                                                                                                                                                                                                                                                v208 = arm64g_calculate_condition(52, v205, v206, 0);
                                                                                                                                                                                                                                                if (!(v208 & 1))
                                                                                                                                                                                                                                                    goto LABEL_c03fa6;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            else
                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                                v207 = v152;
                                                                                                                                                                                                                                                v209 = arm64g_calculate_condition(52, v205, v206, 0);
                                                                                                                                                                                                                                                if (!(v209 & 1))
                                                                                                                                                                                                                                                {
LABEL_c03fa6:
LABEL_c03fa8:
                                                                                                                                                                                                                                                    v210 = v177;
                                                                                                                                                                                                                                                    v211 = v182;
                                                                                                                                                                                                                                                    if (v182 < v177)
                                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                                        v212 = v177;
                                                                                                                                                                                                                                                        v213 = arm64g_calculate_condition(52, v210, v211, 0);
                                                                                                                                                                                                                                                        if (!(v213 & 1))
                                                                                                                                                                                                                                                            goto LABEL_c03fb2;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    else
                                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                                        v212 = v182;
                                                                                                                                                                                                                                                        v214 = arm64g_calculate_condition(52, v210, v211, 0);
                                                                                                                                                                                                                                                        if (!(v214 & 1))
                                                                                                                                                                                                                                                        {
LABEL_c03fb2:
                                                                                                                                                                                                                                                            v177 = v182;
LABEL_c03fb4:
                                                                                                                                                                                                                                                            v215 = v187;
                                                                                                                                                                                                                                                            v216 = v192;
                                                                                                                                                                                                                                                            v217 = arm64g_calculate_condition(132, v215, v216, 0);
                                                                                                                                                                                                                                                            if (v217 & 1)
                                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                                                v218 = v187;
                                                                                                                                                                                                                                                                v219 = arm64g_calculate_condition(52, v215, v216, 0);
                                                                                                                                                                                                                                                                if (!(v219 & 1))
                                                                                                                                                                                                                                                                    goto LABEL_c03fbe;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            else
                                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                                                v218 = v192;
                                                                                                                                                                                                                                                                v220 = arm64g_calculate_condition(52, v215, v216, 0);
                                                                                                                                                                                                                                                                if (!(v220 & 1))
                                                                                                                                                                                                                                                                {
LABEL_c03fbe:
                                                                                                                                                                                                                                                                    v187 = v192;
LABEL_c03fc0:
                                                                                                                                                                                                                                                                    v221 = v58;
                                                                                                                                                                                                                                                                    v222 = v197;
                                                                                                                                                                                                                                                                    if (v197 < v58)
                                                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                                                        v223 = v58;
                                                                                                                                                                                                                                                                        v224 = arm64g_calculate_condition(52, v221, v222, 0);
                                                                                                                                                                                                                                                                        if (!(v224 & 1))
                                                                                                                                                                                                                                                                            goto LABEL_c03fca;
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    else
                                                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                                                        v223 = v197;
                                                                                                                                                                                                                                                                        v225 = arm64g_calculate_condition(52, v221, v222, 0);
                                                                                                                                                                                                                                                                        if (!(v225 & 1))
                                                                                                                                                                                                                                                                        {
LABEL_c03fca:
                                                                                                                                                                                                                                                                            v58 = v197;
LABEL_c03fcc:
                                                                                                                                                                                                                                                                            v226 = v132;
                                                                                                                                                                                                                                                                            v227 = v172;
                                                                                                                                                                                                                                                                            if (v172 < v132)
                                                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                                                                v228 = v132;
                                                                                                                                                                                                                                                                                v229 = arm64g_calculate_condition(52, v226, v227, 0);
                                                                                                                                                                                                                                                                                if (!(v229 & 1))
                                                                                                                                                                                                                                                                                    goto LABEL_c03fd6;
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            else
                                                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                                                                v228 = v172;
                                                                                                                                                                                                                                                                                v230 = arm64g_calculate_condition(52, v226, v227, 0);
                                                                                                                                                                                                                                                                                if (!(v230 & 1))
                                                                                                                                                                                                                                                                                {
LABEL_c03fd6:
                                                                                                                                                                                                                                                                                    v132 = v172;
LABEL_c03fd8:
                                                                                                                                                                                                                                                                                    v231 = v152;
                                                                                                                                                                                                                                                                                    v232 = v202;
                                                                                                                                                                                                                                                                                    if (v202 < v152)
                                                                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                                                                        v233 = v152;
                                                                                                                                                                                                                                                                                        v234 = arm64g_calculate_condition(52, v231, v232, 0);
                                                                                                                                                                                                                                                                                        if (!(v234 & 1))
                                                                                                                                                                                                                                                                                            goto LABEL_c03fe2;
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    else
                                                                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                                                                        v233 = v202;
                                                                                                                                                                                                                                                                                        v235 = arm64g_calculate_condition(52, v231, v232, 0);
                                                                                                                                                                                                                                                                                        if (!(v235 & 1))
                                                                                                                                                                                                                                                                                        {
LABEL_c03fe2:
LABEL_c03fe4:
                                                                                                                                                                                                                                                                                            v236 = v187;
                                                                                                                                                                                                                                                                                            v237 = v207;
                                                                                                                                                                                                                                                                                            if (v207 < v187)
                                                                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                                                                                v238 = v187;
                                                                                                                                                                                                                                                                                                v239 = arm64g_calculate_condition(52, v236, v237, 0);
                                                                                                                                                                                                                                                                                                if (!(v239 & 1))
                                                                                                                                                                                                                                                                                                    goto LABEL_c03fee;
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            else
                                                                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                                                                                v238 = v207;
                                                                                                                                                                                                                                                                                                v240 = arm64g_calculate_condition(52, v236, v237, 0);
                                                                                                                                                                                                                                                                                                if (!(v240 & 1))
                                                                                                                                                                                                                                                                                                {
LABEL_c03fee:
                                                                                                                                                                                                                                                                                                    v187 = v207;
LABEL_c03ff0:
                                                                                                                                                                                                                                                                                                    *(void* *)&i[80] = v238;
                                                                                                                                                                                                                                                                                                    *(void* *)&i[88] = v218;
                                                                                                                                                                                                                                                                                                    v241 = v132;
                                                                                                                                                                                                                                                                                                    v242 = v58;
                                                                                                                                                                                                                                                                                                    if (v58 < v132)
                                                                                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                                                                                        v243 = v132;
                                                                                                                                                                                                                                                                                                        v244 = arm64g_calculate_condition(52, v241, v242, 0);
                                                                                                                                                                                                                                                                                                        if (!(v244 & 1))
                                                                                                                                                                                                                                                                                                            goto LABEL_c03ffe;
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                    else
                                                                                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                                                                                        v243 = v58;
                                                                                                                                                                                                                                                                                                        v245 = arm64g_calculate_condition(52, v241, v242, 0);
                                                                                                                                                                                                                                                                                                        if (!(v245 & 1))
                                                                                                                                                                                                                                                                                                        {
LABEL_c03ffe:
LABEL_c04000:
                                                                                                                                                                                                                                                                                                            *(void* *)i = v53;
                                                                                                                                                                                                                                                                                                            *(void* *)&i[8] = v58;
                                                                                                                                                                                                                                                                                                            v246 = v228;
                                                                                                                                                                                                                                                                                                            v247 = v223;
                                                                                                                                                                                                                                                                                                            if (v223 < v228)
                                                                                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                                                                                                v248 = v228;
                                                                                                                                                                                                                                                                                                                v249 = arm64g_calculate_condition(52, v246, v247, 0);
                                                                                                                                                                                                                                                                                                                if (!(v249 & 1))
                                                                                                                                                                                                                                                                                                                    goto LABEL_c0400e;
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                            else
                                                                                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                                                                                                v248 = v223;
                                                                                                                                                                                                                                                                                                                v250 = arm64g_calculate_condition(52, v246, v247, 0);
                                                                                                                                                                                                                                                                                                                if (!(v250 & 1))
                                                                                                                                                                                                                                                                                                                {
LABEL_c0400e:
                                                                                                                                                                                                                                                                                                                    v251 = v223;
LABEL_c04010:
                                                                                                                                                                                                                                                                                                                    v252 = v177;
                                                                                                                                                                                                                                                                                                                    v253 = v202;
                                                                                                                                                                                                                                                                                                                    if (v202 < v177)
                                                                                                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                                                                                                        v254 = v177;
                                                                                                                                                                                                                                                                                                                        v255 = arm64g_calculate_condition(52, v252, v253, 0);
                                                                                                                                                                                                                                                                                                                        if (!(v255 & 1))
                                                                                                                                                                                                                                                                                                                            goto LABEL_c0401a;
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                    else
                                                                                                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                                                                                                        v254 = v202;
                                                                                                                                                                                                                                                                                                                        v256 = arm64g_calculate_condition(52, v252, v253, 0);
                                                                                                                                                                                                                                                                                                                        if (!(v256 & 1))
                                                                                                                                                                                                                                                                                                                        {
LABEL_c0401a:
LABEL_c0401c:
                                                                                                                                                                                                                                                                                                                            v257 = v212;
                                                                                                                                                                                                                                                                                                                            v258 = v233;
                                                                                                                                                                                                                                                                                                                            if (v233 < v212)
                                                                                                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                                                                                                                v259 = v212;
                                                                                                                                                                                                                                                                                                                                v260 = arm64g_calculate_condition(52, v257, v258, 0);
                                                                                                                                                                                                                                                                                                                                if (!(v260 & 1))
                                                                                                                                                                                                                                                                                                                                    goto LABEL_c04026;
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                            else
                                                                                                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                                                                                                                v259 = v233;
                                                                                                                                                                                                                                                                                                                                v261 = arm64g_calculate_condition(52, v257, v258, 0);
                                                                                                                                                                                                                                                                                                                                if (!(v261 & 1))
                                                                                                                                                                                                                                                                                                                                {
LABEL_c04026:
                                                                                                                                                                                                                                                                                                                                    v212 = v233;
LABEL_c04028:
                                                                                                                                                                                                                                                                                                                                    v262 = v251;
                                                                                                                                                                                                                                                                                                                                    v263 = v243;
                                                                                                                                                                                                                                                                                                                                    if (v243 < v251)
                                                                                                                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                                                                                                                        v264 = v251;
                                                                                                                                                                                                                                                                                                                                        v265 = arm64g_calculate_condition(52, v262, v263, 0);
                                                                                                                                                                                                                                                                                                                                        if (!(v265 & 1))
                                                                                                                                                                                                                                                                                                                                            goto LABEL_c04032;
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                    else
                                                                                                                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                                                                                                                        v264 = v243;
                                                                                                                                                                                                                                                                                                                                        v266 = arm64g_calculate_condition(52, v262, v263, 0);
                                                                                                                                                                                                                                                                                                                                        if (!(v266 & 1))
                                                                                                                                                                                                                                                                                                                                        {
LABEL_c04032:
                                                                                                                                                                                                                                                                                                                                            v251 = v243;
LABEL_c04034:
                                                                                                                                                                                                                                                                                                                                            v267 = v202;
                                                                                                                                                                                                                                                                                                                                            v268 = v248;
                                                                                                                                                                                                                                                                                                                                            if (v248 < v202)
                                                                                                                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                                                                                                                                a0 = v202;
                                                                                                                                                                                                                                                                                                                                                v269 = arm64g_calculate_condition(52, v267, v268, 0);
                                                                                                                                                                                                                                                                                                                                                if (!(v269 & 1))
                                                                                                                                                                                                                                                                                                                                                    goto LABEL_c0403e;
                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                            else
                                                                                                                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                                                                                                                                a0 = v248;
                                                                                                                                                                                                                                                                                                                                                v270 = arm64g_calculate_condition(52, v267, v268, 0);
                                                                                                                                                                                                                                                                                                                                                if (!(v270 & 1))
                                                                                                                                                                                                                                                                                                                                                {
LABEL_c0403e:
LABEL_c04040:
                                                                                                                                                                                                                                                                                                                                                    v271 = v254;
                                                                                                                                                                                                                                                                                                                                                    v272 = v212;
                                                                                                                                                                                                                                                                                                                                                    if (v212 < v254)
                                                                                                                                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                                                                                                                                        v273 = v254;
                                                                                                                                                                                                                                                                                                                                                        v274 = arm64g_calculate_condition(52, v271, v272, 0);
                                                                                                                                                                                                                                                                                                                                                        if (!(v274 & 1))
                                                                                                                                                                                                                                                                                                                                                            goto LABEL_c0404a;
                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                    else
                                                                                                                                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                                                                                                                                        v273 = v212;
                                                                                                                                                                                                                                                                                                                                                        v275 = arm64g_calculate_condition(52, v271, v272, 0);
                                                                                                                                                                                                                                                                                                                                                        if (!(v275 & 1))
                                                                                                                                                                                                                                                                                                                                                        {
LABEL_c0404a:
                                                                                                                                                                                                                                                                                                                                                            v254 = v212;
LABEL_c0404c:
                                                                                                                                                                                                                                                                                                                                                            v276 = v187;
                                                                                                                                                                                                                                                                                                                                                            v277 = v259;
                                                                                                                                                                                                                                                                                                                                                            if (v259 < v187)
                                                                                                                                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                                                                                                                                                v278 = v187;
                                                                                                                                                                                                                                                                                                                                                                v279 = arm64g_calculate_condition(52, v276, v277, 0);
                                                                                                                                                                                                                                                                                                                                                                if (!(v279 & 1))
                                                                                                                                                                                                                                                                                                                                                                    goto LABEL_c04056;
                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                            else
                                                                                                                                                                                                                                                                                                                                                            {
                                                                                                                                                                                                                                                                                                                                                                v278 = v259;
                                                                                                                                                                                                                                                                                                                                                                v280 = arm64g_calculate_condition(52, v276, v277, 0);
                                                                                                                                                                                                                                                                                                                                                                if (!(v280 & 1))
                                                                                                                                                                                                                                                                                                                                                                {
LABEL_c04056:
LABEL_c04058:
                                                                                                                                                                                                                                                                                                                                                                    *(void* *)&i[64] = v259;
                                                                                                                                                                                                                                                                                                                                                                    *(void* *)&i[72] = v278;
                                                                                                                                                                                                                                                                                                                                                                    v281 = v248;
                                                                                                                                                                                                                                                                                                                                                                    v282 = v264;
                                                                                                                                                                                                                                                                                                                                                                    if (v264 < v248)
                                                                                                                                                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                                                                                                                                                        v283 = v248;
                                                                                                                                                                                                                                                                                                                                                                        v284 = arm64g_calculate_condition(52, v281, v282, 0);
                                                                                                                                                                                                                                                                                                                                                                        if (!(v284 & 1))
                                                                                                                                                                                                                                                                                                                                                                            goto LABEL_c04066;
                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                    else
                                                                                                                                                                                                                                                                                                                                                                    {
                                                                                                                                                                                                                                                                                                                                                                        v283 = v264;
                                                                                                                                                                                                                                                                                                                                                                        v285 = arm64g_calculate_condition(52, v281, v282, 0);
                                                                                                                                                                                                                                                                                                                                                                        if (!(v285 & 1))
                                                                                                                                                                                                                                                                                                                                                                        {
LABEL_c04066:
                                                                                                                                                                                                                                                                                                                                                                            v248 = v264;
LABEL_c04068:
                                                                                                                                                                                                                                                                                                                                                                            *(void* *)&i[16] = v251;
                                                                                                                                                                                                                                                                                                                                                                            *(void* *)&i[24] = v248;
                                                                                                                                                                                                                                                                                                                                                                            if (v254 < a0)
                                                                                                                                                                                                                                                                                                                                                                                v286 = v254;
                                                                                                                                                                                                                                                                                                                                                                            else
                                                                                                                                                                                                                                                                                                                                                                                v286 = a0;
                                                                                                                                                                                                                                                                                                                                                                            *(void* *)&i[32] = v283;
                                                                                                                                                                                                                                                                                                                                                                            *(void* *)&i[40] = v286;
                                                                                                                                                                                                                                                                                                                                                                            v287 = arm64g_calculate_condition(132, v254, a0, 0);
                                                                                                                                                                                                                                                                                                                                                                            if (v287 & 1)
                                                                                                                                                                                                                                                                                                                                                                                v288 = v254;
                                                                                                                                                                                                                                                                                                                                                                            else
                                                                                                                                                                                                                                                                                                                                                                                v288 = a0;
                                                                                                                                                                                                                                                                                                                                                                            *(void* *)&i[48] = v288;
                                                                                                                                                                                                                                                                                                                                                                            *(void* *)&i[56] = v273;
                                                                                                                                                                                                                                                                                                                                                                            v289 = 13;
                                                                                                                                                                                                                                                                                                                                                                            continue;
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                    goto LABEL_c04068;
                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                            v259 = v187;
                                                                                                                                                                                                                                                                                                                                                            goto LABEL_c04058;
                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                    goto LABEL_c0404c;
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                            v248 = v202;
                                                                                                                                                                                                                                                                                                                                            goto LABEL_c04040;
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                    goto LABEL_c04034;
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                            goto LABEL_c04028;
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                    v202 = v177;
                                                                                                                                                                                                                                                                                                                    goto LABEL_c0401c;
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                            v251 = v228;
                                                                                                                                                                                                                                                                                                            goto LABEL_c04010;
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                    v58 = v132;
                                                                                                                                                                                                                                                                                                    goto LABEL_c04000;
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            goto LABEL_c03ff0;
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    v202 = v152;
                                                                                                                                                                                                                                                                                    goto LABEL_c03fe4;
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            goto LABEL_c03fd8;
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    goto LABEL_c03fcc;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            goto LABEL_c03fc0;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    goto LABEL_c03fb4;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            v152 = v157;
                                                                                                                                                                                                                                            goto LABEL_c03fa8;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    goto LABEL_c03f9c;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            v53 = v62;
                                                                                                                                                                                                                            goto LABEL_c03f90;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    v157 = v142;
                                                                                                                                                                                                                    goto LABEL_c03f84;
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                            v152 = v162;
                                                                                                                                                                                                            goto LABEL_c03f78;
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                    v132 = v65;
                                                                                                                                                                                                    goto LABEL_c03f6c;
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                            goto LABEL_c03f60;
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    v53 = v52;
                                                                                                                                                                                    goto LABEL_c03f54;
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            v142 = v147;
                                                                                                                                                                            goto LABEL_c03f44;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    goto LABEL_c03f38;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            v52 = v117;
                                                                                                                                                            goto LABEL_c03f2c;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    goto LABEL_c03f20;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            goto LABEL_c03f14;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    goto LABEL_c03f08;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            goto LABEL_c03efc;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    v102 = v97;
                                                                                                                    goto LABEL_c03ef0;
                                                                                                                }
                                                                                                            }
                                                                                                            v62 = v68;
                                                                                                            goto LABEL_c03ee4;
                                                                                                        }
                                                                                                    }
                                                                                                    v53 = v84;
                                                                                                    goto LABEL_c03ed8;
                                                                                                }
                                                                                            }
                                                                                            goto LABEL_c03ecc;
                                                                                        }
                                                                                    }
                                                                                    goto LABEL_c03ec0;
                                                                                }
                                                                            }
                                                                            v84 = v87;
                                                                            goto LABEL_c03eb4;
                                                                        }
                                                                    }
                                                                    v68 = v69;
                                                                    goto LABEL_c03ea8;
                                                                }
                                                            }
                                                            v62 = v76;
                                                            goto LABEL_c03e9c;
                                                        }
                                                    }
                                                    goto LABEL_c03e90;
                                                }
                                            }
                                            goto LABEL_c03e84;
                                        }
                                    }
                                    v69 = v75;
                                    goto LABEL_c03e70;
                                }
                            }
                            v68 = v61;
                            goto LABEL_c03e60;
                        }
                    }
                    goto LABEL_c03e50;
                }
            }
            goto LABEL_c03e40;
        }
        else if (v48 > 8)
        {
            v290 = *(long long *)i;
            v291 = (long long)i[8];
            v292 = (long long)i[16];
            v293 = (long long)i[24];
            v294 = v293;
            v295 = v290;
            if (v290 < v293)
            {
                v296 = v293;
                v297 = arm64g_calculate_condition(52, v294, v295, 0);
                if (!(v297 & 1))
                    goto LABEL_c040a2;
            }
            else
            {
                v296 = v290;
                v298 = arm64g_calculate_condition(52, v294, v295, 0);
                if (!(v298 & 1))
                {
LABEL_c040a2:
LABEL_c040a4:
                    v299 = (long long)i[48];
                    v300 = (long long)i[56];
                    v301 = v300;
                    v302 = v291;
                    if (v291 < v300)
                    {
                        v303 = v300;
                        v304 = arm64g_calculate_condition(52, v301, v302, 0);
                        if (!(v304 & 1))
                            goto LABEL_c040b2;
                    }
                    else
                    {
                        v303 = v291;
                        v305 = arm64g_calculate_condition(52, v301, v302, 0);
                        if (!(v305 & 1))
                        {
LABEL_c040b2:
LABEL_c040b4:
                            v306 = (long long)i[32];
                            v307 = (long long)i[40];
                            v308 = v307;
                            v309 = v292;
                            if (v292 < v307)
                            {
                                v310 = v307;
                                v311 = arm64g_calculate_condition(52, v308, v309, 0);
                                if (!(v311 & 1))
                                    goto LABEL_c040c2;
                            }
                            else
                            {
                                v310 = v292;
                                v312 = arm64g_calculate_condition(52, v308, v309, 0);
                                if (!(v312 & 1))
                                {
LABEL_c040c2:
                                    v307 = v292;
LABEL_c040c4:
                                    v313 = (long long)i[64];
                                    v314 = v313;
                                    v315 = v306;
                                    if (v306 < v313)
                                    {
                                        v316 = v313;
                                        v317 = arm64g_calculate_condition(52, v314, v315, 0);
                                        if (!(v317 & 1))
                                            goto LABEL_c040d2;
                                    }
                                    else
                                    {
                                        v316 = v306;
                                        v318 = arm64g_calculate_condition(52, v314, v315, 0);
                                        if (!(v318 & 1))
                                        {
LABEL_c040d2:
                                            v313 = v306;
LABEL_c040d4:
                                            v319 = v303;
                                            v320 = v290;
                                            if (v290 < v303)
                                            {
                                                v321 = v303;
                                                v322 = arm64g_calculate_condition(52, v319, v320, 0);
                                                if (!(v322 & 1))
                                                    goto LABEL_c040de;
                                            }
                                            else
                                            {
                                                v321 = v290;
                                                v323 = arm64g_calculate_condition(52, v319, v320, 0);
                                                if (!(v323 & 1))
                                                {
LABEL_c040de:
LABEL_c040e0:
                                                    v324 = v313;
                                                    v325 = v307;
                                                    if (v307 < v313)
                                                    {
                                                        v326 = v313;
                                                        v327 = arm64g_calculate_condition(52, v324, v325, 0);
                                                        if (!(v327 & 1))
                                                            goto LABEL_c040ea;
                                                    }
                                                    else
                                                    {
                                                        v326 = v307;
                                                        v328 = arm64g_calculate_condition(52, v324, v325, 0);
                                                        if (!(v328 & 1))
                                                        {
LABEL_c040ea:
LABEL_c040ec:
                                                            v329 = v316;
                                                            v330 = v296;
                                                            if (v296 < v316)
                                                            {
                                                                v331 = v316;
                                                                v332 = arm64g_calculate_condition(52, v329, v330, 0);
                                                                if (!(v332 & 1))
                                                                    goto LABEL_c040f6;
                                                            }
                                                            else
                                                            {
                                                                v331 = v296;
                                                                v333 = arm64g_calculate_condition(52, v329, v330, 0);
                                                                if (!(v333 & 1))
                                                                {
LABEL_c040f6:
LABEL_c040f8:
                                                                    v334 = v299;
                                                                    v335 = v310;
                                                                    if (v310 < v299)
                                                                    {
                                                                        v336 = v299;
                                                                        v337 = arm64g_calculate_condition(52, v334, v335, 0);
                                                                        if (!(v337 & 1))
                                                                            goto LABEL_c04102;
                                                                    }
                                                                    else
                                                                    {
                                                                        v336 = v310;
                                                                        v338 = arm64g_calculate_condition(52, v334, v335, 0);
                                                                        if (!(v338 & 1))
                                                                        {
LABEL_c04102:
                                                                            v299 = v310;
LABEL_c04104:
                                                                            v339 = v307;
                                                                            v340 = v290;
                                                                            if (v290 < v307)
                                                                            {
                                                                                v341 = v307;
                                                                                v342 = arm64g_calculate_condition(52, v339, v340, 0);
                                                                                if (!(v342 & 1))
                                                                                    goto LABEL_c0410e;
                                                                            }
                                                                            else
                                                                            {
                                                                                v341 = v290;
                                                                                v343 = arm64g_calculate_condition(52, v339, v340, 0);
                                                                                if (!(v343 & 1))
                                                                                {
LABEL_c0410e:
LABEL_c04110:
                                                                                    v344 = v296;
                                                                                    v345 = v291;
                                                                                    if (v291 < v296)
                                                                                    {
                                                                                        v346 = v296;
                                                                                        v347 = arm64g_calculate_condition(52, v344, v345, 0);
                                                                                        if (!(v347 & 1))
                                                                                            goto LABEL_c0411a;
                                                                                    }
                                                                                    else
                                                                                    {
                                                                                        v346 = v291;
                                                                                        v348 = arm64g_calculate_condition(52, v344, v345, 0);
                                                                                        if (!(v348 & 1))
                                                                                        {
LABEL_c0411a:
LABEL_c0411c:
                                                                                            v349 = v299;
                                                                                            v350 = v326;
                                                                                            if (v326 < v299)
                                                                                            {
                                                                                                v351 = v299;
                                                                                                v352 = arm64g_calculate_condition(52, v349, v350, 0);
                                                                                                if (!(v352 & 1))
                                                                                                    goto LABEL_c04126;
                                                                                            }
                                                                                            else
                                                                                            {
                                                                                                v351 = v326;
                                                                                                v353 = arm64g_calculate_condition(52, v349, v350, 0);
                                                                                                if (!(v353 & 1))
                                                                                                {
LABEL_c04126:
                                                                                                    v299 = v326;
LABEL_c04128:
                                                                                                    v354 = v331;
                                                                                                    v355 = v321;
                                                                                                    if (v321 < v331)
                                                                                                    {
                                                                                                        v356 = v331;
                                                                                                        v357 = arm64g_calculate_condition(52, v354, v355, 0);
                                                                                                        if (!(v357 & 1))
                                                                                                            goto LABEL_c04132;
                                                                                                    }
                                                                                                    else
                                                                                                    {
                                                                                                        v356 = v321;
                                                                                                        v358 = arm64g_calculate_condition(52, v354, v355, 0);
                                                                                                        if (!(v358 & 1))
                                                                                                        {
LABEL_c04132:
                                                                                                            v331 = v321;
LABEL_c04134:
                                                                                                            v359 = v299;
                                                                                                            v360 = v291;
                                                                                                            if (v291 < v299)
                                                                                                            {
                                                                                                                v361 = v299;
                                                                                                                v362 = arm64g_calculate_condition(52, v359, v360, 0);
                                                                                                                if (!(v362 & 1))
                                                                                                                    goto LABEL_c0413e;
                                                                                                            }
                                                                                                            else
                                                                                                            {
                                                                                                                v361 = v291;
                                                                                                                v363 = arm64g_calculate_condition(52, v359, v360, 0);
                                                                                                                if (!(v363 & 1))
                                                                                                                {
LABEL_c0413e:
LABEL_c04140:
                                                                                                                    v364 = v336;
                                                                                                                    v365 = v346;
                                                                                                                    if (v346 < v336)
                                                                                                                    {
                                                                                                                        v366 = v336;
                                                                                                                        v367 = arm64g_calculate_condition(52, v364, v365, 0);
                                                                                                                        if (!(v367 & 1))
                                                                                                                            goto LABEL_c0414a;
                                                                                                                    }
                                                                                                                    else
                                                                                                                    {
                                                                                                                        v366 = v346;
                                                                                                                        v368 = arm64g_calculate_condition(52, v364, v365, 0);
                                                                                                                        if (!(v368 & 1))
                                                                                                                        {
LABEL_c0414a:
LABEL_c0414c:
                                                                                                                            v369 = v331;
                                                                                                                            v370 = v351;
                                                                                                                            if (v351 < v331)
                                                                                                                            {
                                                                                                                                v371 = v331;
                                                                                                                                v372 = arm64g_calculate_condition(52, v369, v370, 0);
                                                                                                                                if (!(v372 & 1))
                                                                                                                                    goto LABEL_c04156;
                                                                                                                            }
                                                                                                                            else
                                                                                                                            {
                                                                                                                                v371 = v351;
                                                                                                                                v373 = arm64g_calculate_condition(52, v369, v370, 0);
                                                                                                                                if (!(v373 & 1))
                                                                                                                                {
LABEL_c04156:
                                                                                                                                    v331 = v351;
LABEL_c04158:
                                                                                                                                    v374 = v291;
                                                                                                                                    v375 = v290;
                                                                                                                                    if (v290 < v291)
                                                                                                                                    {
                                                                                                                                        v376 = v291;
                                                                                                                                        v377 = arm64g_calculate_condition(52, v374, v375, 0);
                                                                                                                                        if (!(v377 & 1))
                                                                                                                                            goto LABEL_c04162;
                                                                                                                                    }
                                                                                                                                    else
                                                                                                                                    {
                                                                                                                                        v376 = v290;
                                                                                                                                        v378 = arm64g_calculate_condition(52, v374, v375, 0);
                                                                                                                                        if (!(v378 & 1))
                                                                                                                                        {
LABEL_c04162:
LABEL_c04164:
                                                                                                                                            v379 = v361;
                                                                                                                                            v380 = v341;
                                                                                                                                            if (v341 < v361)
                                                                                                                                            {
                                                                                                                                                v381 = v361;
                                                                                                                                                v382 = arm64g_calculate_condition(52, v379, v380, 0);
                                                                                                                                                if (!(v382 & 1))
                                                                                                                                                    goto LABEL_c0416e;
                                                                                                                                            }
                                                                                                                                            else
                                                                                                                                            {
                                                                                                                                                v381 = v341;
                                                                                                                                                v383 = arm64g_calculate_condition(52, v379, v380, 0);
                                                                                                                                                if (!(v383 & 1))
                                                                                                                                                {
LABEL_c0416e:
                                                                                                                                                    v361 = v341;
LABEL_c04170:
                                                                                                                                                    v384 = v331;
                                                                                                                                                    v385 = v346;
                                                                                                                                                    if (v346 < v331)
                                                                                                                                                    {
                                                                                                                                                        v386 = v331;
                                                                                                                                                        v387 = arm64g_calculate_condition(52, v384, v385, 0);
                                                                                                                                                        if (!(v387 & 1))
                                                                                                                                                            goto LABEL_c0417a;
                                                                                                                                                    }
                                                                                                                                                    else
                                                                                                                                                    {
                                                                                                                                                        v386 = v346;
                                                                                                                                                        v388 = arm64g_calculate_condition(52, v384, v385, 0);
                                                                                                                                                        if (!(v388 & 1))
                                                                                                                                                        {
LABEL_c0417a:
LABEL_c0417c:
                                                                                                                                                            v389 = v356;
                                                                                                                                                            v390 = v366;
                                                                                                                                                            if (v366 < v356)
                                                                                                                                                            {
                                                                                                                                                                v391 = v356;
                                                                                                                                                                v392 = arm64g_calculate_condition(52, v389, v390, 0);
                                                                                                                                                                if (!(v392 & 1))
                                                                                                                                                                    goto LABEL_c04186;
                                                                                                                                                            }
                                                                                                                                                            else
                                                                                                                                                            {
                                                                                                                                                                v391 = v366;
                                                                                                                                                                v393 = arm64g_calculate_condition(52, v389, v390, 0);
                                                                                                                                                                if (!(v393 & 1))
                                                                                                                                                                {
LABEL_c04186:
LABEL_c04188:
                                                                                                                                                                    *(void* *)&i[64] = v391;
                                                                                                                                                                    v394 = v346;
                                                                                                                                                                    v395 = v361;
                                                                                                                                                                    if (v361 < v346)
                                                                                                                                                                    {
                                                                                                                                                                        v396 = v346;
                                                                                                                                                                        v397 = arm64g_calculate_condition(52, v394, v395, 0);
                                                                                                                                                                        if (!(v397 & 1))
                                                                                                                                                                            goto LABEL_c04196;
                                                                                                                                                                    }
                                                                                                                                                                    else
                                                                                                                                                                    {
                                                                                                                                                                        v396 = v361;
                                                                                                                                                                        v398 = arm64g_calculate_condition(52, v394, v395, 0);
                                                                                                                                                                        if (!(v398 & 1))
                                                                                                                                                                        {
LABEL_c04196:
                                                                                                                                                                            v346 = v361;
LABEL_c04198:
                                                                                                                                                                            v399 = v386;
                                                                                                                                                                            v400 = v381;
                                                                                                                                                                            if (v381 < v386)
                                                                                                                                                                            {
                                                                                                                                                                                a0 = v386;
                                                                                                                                                                                v401 = arm64g_calculate_condition(52, v399, v400, 0);
                                                                                                                                                                                if (!(v401 & 1))
                                                                                                                                                                                    goto LABEL_c041a2;
                                                                                                                                                                            }
                                                                                                                                                                            else
                                                                                                                                                                            {
                                                                                                                                                                                a0 = v381;
                                                                                                                                                                                v402 = arm64g_calculate_condition(52, v399, v400, 0);
                                                                                                                                                                                if (!(v402 & 1))
                                                                                                                                                                                {
LABEL_c041a2:
LABEL_c041a4:
                                                                                                                                                                                    v403 = v371;
                                                                                                                                                                                    v404 = v366;
                                                                                                                                                                                    if (v366 < v371)
                                                                                                                                                                                    {
                                                                                                                                                                                        v405 = v371;
                                                                                                                                                                                        v406 = arm64g_calculate_condition(52, v403, v404, 0);
                                                                                                                                                                                        if (!(v406 & 1))
                                                                                                                                                                                            goto LABEL_c041ae;
                                                                                                                                                                                    }
                                                                                                                                                                                    else
                                                                                                                                                                                    {
                                                                                                                                                                                        v405 = v366;
                                                                                                                                                                                        v407 = arm64g_calculate_condition(52, v403, v404, 0);
                                                                                                                                                                                        if (!(v407 & 1))
                                                                                                                                                                                        {
LABEL_c041ae:
LABEL_c041b0:
                                                                                                                                                                                            v408 = v346;
                                                                                                                                                                                            v409 = v376;
                                                                                                                                                                                            if (v376 < v346)
                                                                                                                                                                                            {
                                                                                                                                                                                                v410 = v346;
                                                                                                                                                                                                v411 = arm64g_calculate_condition(52, v408, v409, 0);
                                                                                                                                                                                                if (!(v411 & 1))
                                                                                                                                                                                                    goto LABEL_c041ba;
                                                                                                                                                                                            }
                                                                                                                                                                                            else
                                                                                                                                                                                            {
                                                                                                                                                                                                v410 = v376;
                                                                                                                                                                                                v412 = arm64g_calculate_condition(52, v408, v409, 0);
                                                                                                                                                                                                if (!(v412 & 1))
                                                                                                                                                                                                {
LABEL_c041ba:
                                                                                                                                                                                                    v346 = v376;
LABEL_c041bc:
                                                                                                                                                                                                    *(void* *)i = v290;
                                                                                                                                                                                                    *(void* *)&i[8] = v346;
                                                                                                                                                                                                    v413 = v381;
                                                                                                                                                                                                    v414 = v396;
                                                                                                                                                                                                    if (v396 < v381)
                                                                                                                                                                                                    {
                                                                                                                                                                                                        v415 = v381;
                                                                                                                                                                                                        v416 = arm64g_calculate_condition(52, v413, v414, 0);
                                                                                                                                                                                                        if (!(v416 & 1))
                                                                                                                                                                                                            goto LABEL_c041ca;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    else
                                                                                                                                                                                                    {
                                                                                                                                                                                                        v415 = v396;
                                                                                                                                                                                                        v417 = arm64g_calculate_condition(52, v413, v414, 0);
                                                                                                                                                                                                        if (!(v417 & 1))
                                                                                                                                                                                                        {
LABEL_c041ca:
                                                                                                                                                                                                            v381 = v396;
LABEL_c041cc:
                                                                                                                                                                                                            *(void* *)&i[16] = v410;
                                                                                                                                                                                                            *(void* *)&i[24] = v381;
                                                                                                                                                                                                            if (v366 < a0)
                                                                                                                                                                                                                v418 = v366;
                                                                                                                                                                                                            else
                                                                                                                                                                                                                v418 = a0;
                                                                                                                                                                                                            *(void* *)&i[32] = v415;
                                                                                                                                                                                                            *(void* *)&i[40] = v418;
                                                                                                                                                                                                            v419 = arm64g_calculate_condition(132, v366, a0, 0);
                                                                                                                                                                                                            if (v419 & 1)
                                                                                                                                                                                                                v420 = v366;
                                                                                                                                                                                                            else
                                                                                                                                                                                                                v420 = a0;
                                                                                                                                                                                                            *(void* *)&i[48] = v420;
                                                                                                                                                                                                            *(void* *)&i[56] = v405;
                                                                                                                                                                                                            v289 = 9;
                                                                                                                                                                                                            continue;
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                    goto LABEL_c041cc;
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                            goto LABEL_c041bc;
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    v366 = v371;
                                                                                                                                                                                    goto LABEL_c041b0;
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            v381 = v386;
                                                                                                                                                                            goto LABEL_c041a4;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    goto LABEL_c04198;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            v366 = v356;
                                                                                                                                                            goto LABEL_c04188;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    v346 = v331;
                                                                                                                                                    goto LABEL_c0417c;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            goto LABEL_c04170;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    v290 = v291;
                                                                                                                                    goto LABEL_c04164;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            goto LABEL_c04158;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    v346 = v336;
                                                                                                                    goto LABEL_c0414c;
                                                                                                                }
                                                                                                            }
                                                                                                            v291 = v299;
                                                                                                            goto LABEL_c04140;
                                                                                                        }
                                                                                                    }
                                                                                                    goto LABEL_c04134;
                                                                                                }
                                                                                            }
                                                                                            goto LABEL_c04128;
                                                                                        }
                                                                                    }
                                                                                    v291 = v296;
                                                                                    goto LABEL_c0411c;
                                                                                }
                                                                            }
                                                                            v290 = v307;
                                                                            goto LABEL_c04110;
                                                                        }
                                                                    }
                                                                    goto LABEL_c04104;
                                                                }
                                                            }
                                                            v296 = v316;
                                                            goto LABEL_c040f8;
                                                        }
                                                    }
                                                    v307 = v313;
                                                    goto LABEL_c040ec;
                                                }
                                            }
                                            v290 = v303;
                                            goto LABEL_c040e0;
                                        }
                                    }
                                    goto LABEL_c040d4;
                                }
                            }
                            goto LABEL_c040c4;
                        }
                    }
                    v291 = v300;
                    goto LABEL_c040b4;
                }
            }
            v290 = v293;
            goto LABEL_c040a4;
        }
        else
        {
            v289 = 1;
        }
        if (v48 <= v289 - 1)
            __debugbreak();
        if (v289 != v48)
        {
            v421 = v289 * 8;
            v422 = i + v421;
            do
            {
                v423 = *(long long *)((char *)v422 - 8);
                v424 = *(long long *)v422;
                if ((unsigned long long)*(long long *)((char *)v422 - 8) > v424)
                {
                    v425 = v421;
                    do
                    {
                        *(void* *)((char *)i + v425) = v423;
                        if (v425 == 8)
                        {
                            v426 = i;
                            goto LABEL_c04234;
                        }
                    } while ((v423 = *(long long *)((char *)i + v425 - 16), v425 -= 8, v424 < v423));
                    v426 = i + v425;
LABEL_c04234:
                    *(void* *)v426 = v424;
                }
            } while ((v422 += 8, v421 += 8, v422 != i + v48 * 8));
        }
        if (iter < 18)
            return a0;
        v48 = iter - v47;
        v50 = v49;
    } while (i == iter1);
    v427 = iter * 8 - 8;
    v428 = iter1 + v427;
    v429 = v49 - 8;
    v430 = &v0;
    v431 = iter1;
    do
    {
        v432 = *(long long *)v49;
        v433 = *(long long *)v431;
        if (v432 < v433)
            v434 = v432;
        else
            v434 = v433;
        *v430 = v434;
        v430 += 1;
        v49 += (v433 > v432) * 8;
        v431 += (v432 >= v433) * 8;
        v435 = *(long long *)v428;
        v436 = *(long long *)v429;
        v437 = v435;
        v438 = v436;
        if (v436 >= v435)
            v435 = v436;
        *(void* *)((char *)&v0 + v427) = v435;
        v439 = arm64g_calculate_condition(52, v437, v438, 0);
        if (v439 & 1)
        {
            v440 = arm64g_calculate_condition(36, v437, v438, 0);
            if (!(v440 & 1))
                goto LABEL_c045a2;
            goto LABEL_c045a1;
        }
        else
        {
            v428 += 0xfffffffffffffff8;
            v441 = arm64g_calculate_condition(36, v437, v438, 0);
            if (v441 & 1)
            {
LABEL_c045a1:
                v442 = 0;
                continue;
            }
            else
            {
LABEL_c045a2:
                v442 = 0xffffffffffffffff;
            }
        }
    } while ((v429 += v442 * 8, v427 -= 8, v47 -= 1, v47));
    v443 = v429 + 8;
    v444 = v428 + 8;
    if (iter & 1)
    {
        v437 = v431;
        v438 = v443;
        if (v431 < v443)
            v445 = v431;
        else
            v445 = v49;
        *v430 = *(long long *)v445;
        v49 += (v431 >= v443) * 8;
        v431 += (v443 > v431) * 8;
    }
    if (v431 == v443)
    {
        v447 = arm64g_calculate_condition(4, v437, v438, 0);
        v448 = arm64g_calculate_condition(20, (v447 & 1 ? v49 : 0), (v447 & 1 ? v444 : 0), 0);
        if (!(v448 & 1))
            return _memcpy(iter1, &v0);
    }
    else
    {
        v449 = arm64g_calculate_condition(4, v437, v438, 0);
        v450 = arm64g_calculate_condition(16, (v449 & 1 ? v49 : 0), (v449 & 1 ? v444 : 0), 0);
        if (!(v450 & 1))
            return _memcpy(iter1, &v0);
    }
    sub_c73e74();
    __debugbreak();
}
