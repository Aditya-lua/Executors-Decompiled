/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xcb4f4..0xccdec (6392 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_cb4f4_2 {
    struct st_cb4f4_3 *field_0;
} st_cb4f4_2;

typedef struct st_cb4f4_3 {
    struct st_cb4f4_2 *field_0;
} st_cb4f4_3;

typedef struct st_cb4f4_0 {
    char field_0;
} st_cb4f4_0;


unsigned int sub_cb4f4(unsigned long a0, void* a1, void* a2, unsigned long long a3, unsigned int a4, unsigned int a5)
{
    void* v23;  // x26
    void* v24;  // x21
    void* v33;  // x19
    unsigned int v123;  // w17
    void* v124;  // x27
    void* v125;  // x23
    unsigned int v126;  // w11
    void* v127;  // x12
    unsigned long long v128;  // x13
    unsigned long v129;  // x9
    unsigned int v130;  // w14
    void* v131;  // x26
    void* v132;  // x10
    void* v34;  // x23
    void* v133;  // x9
    void* v134;  // x10
    void* v135;  // x8
    void* v136;  // x11
    void* v137;  // x9
    unsigned int v138;  // w10
    void* iter;  // x0
    unsigned long v140;  // x12
    unsigned int v141;  // w9
    unsigned long long v142;  // x10
    void* v35;  // x20
    void* v143;  // x8
    void* v144;  // x9
    unsigned long long v145;  // x9
    unsigned long long v146;  // x11
    unsigned long long v147;  // x12
    unsigned long long v148;  // x10
    void* iter1;  // x9
    void* v150;  // x10
    void* iter2;  // x13
    uint128_t *v152;  // x14
    void* v36;  // x8
    unsigned long long m;  // x15
    unsigned long long v154;  // x15
    uint128_t v155;  // q1
    void* v157;  // x10
    void* v158;  // x9
    void* v159;  // x23
    void* v160;  // x10
    void* v161;  // x12
    void* v162;  // x11
    unsigned int v37;  // w10
    unsigned long v163;  // x10
    unsigned long long v164;  // 4158
    unsigned long long v165;  // 4160
    unsigned long v166;  // x10
    unsigned long long v167;  // x10
    unsigned int v168;  // w22
    unsigned int v169;  // w13
    unsigned long v170;  // x10
    unsigned long long v171;  // 4156
    unsigned long long v172;  // 4158
    void* v38;  // x8
    unsigned long v173;  // x10
    void* v174;  // x11
    unsigned int v175;  // w13
    unsigned int v176;  // w14
    void* v177;  // x13
    unsigned int v178;  // w10
    unsigned int v179;  // w26
    unsigned int v180;  // w24
    long long v181;  // x20
    unsigned long long v182;  // x8
    void* v183;  // x23
    unsigned int v184;  // w9
    unsigned long long v185;  // x10
    unsigned long v186;  // x8
    void* v187;  // x8
    void* v188;  // x22
    unsigned int v189;  // x8
    void* v190;  // x0
    void* ptr;  // x0
    unsigned long long v192;  // x19
    void* v40;  // x24
    long long v193;  // x20
    unsigned long v194;  // x9
    unsigned long long v195;  // x12
    void* v196;  // x11
    void* v197;  // x13
    void* v198;  // x25
    void* v199;  // x1
    void* v200;  // x11
    void* v201;  // x20
    void* v202;  // x23
    void* v203;  // x8
    unsigned int v204;  // w10
    void* v205;  // x8
    unsigned int v206;  // w15
    void* i0;  // x28
    unsigned int v208;  // w12
    unsigned int v209;  // w9
    void* v210;  // x22
    unsigned int v211;  // w13
    unsigned long v212;  // x11
    void* v213;  // x19
    void* v214;  // x10
    void* v215;  // x9
    void* v216;  // x10
    void* v217;  // x8
    void* v218;  // x11
    void* v219;  // x9
    unsigned long long v220;  // x11
    void* v221;  // x0
    unsigned int v222;  // w9
    void* v25;  // x22
    unsigned long long v223;  // x10
    void* v224;  // x8
    void* v225;  // x9
    unsigned long long v226;  // x9
    unsigned long long v227;  // x11
    unsigned long long v228;  // x12
    unsigned long long v229;  // x10
    void* j;  // x9
    void* v231;  // x10
    void* v232;  // x13
    uint128_t *v233;  // x14
    unsigned long long i;  // x15
    unsigned long long v235;  // x15
    uint128_t v236;  // q1
    void* v238;  // x10
    void* v239;  // x9
    void* v240;  // x9
    void* v241;  // x10
    void* v242;  // x12
    void* v243;  // x11
    unsigned long v244;  // x8
    unsigned long long v245;  // 4145
    unsigned long long v246;  // 4147
    unsigned long v247;  // x8
    unsigned long long v248;  // x8
    unsigned int v249;  // w10
    unsigned long v250;  // x12
    unsigned long long v251;  // 4136
    unsigned long long v252;  // 4138
    unsigned long v253;  // x12
    void* v254;  // x11
    unsigned int v255;  // w13
    unsigned int v256;  // w14
    void* v257;  // x13
    unsigned int v258;  // w11
    unsigned long v259;  // x19
    unsigned int v260;  // w25
    unsigned int v261;  // w26
    long long v262;  // x24
    unsigned long long v263;  // x8
    void* v264;  // x9
    unsigned int v265;  // w8
    void* v266;  // x8
    void* v267;  // x8
    unsigned int v268;  // x8
    void* v269;  // x0
    void* ptr1;  // x0
    unsigned long long v271;  // x19
    long long v272;  // x20
    unsigned long v273;  // x10
    void* v274;  // x12
    unsigned int *v275;  // x27
    void* v276;  // x13
    void* v277;  // x28
    void* v278;  // x9
    void* v279;  // x9
    void* v280;  // x22
    unsigned long v281;  // x8
    void* v282;  // x22
    unsigned int v283;  // w16
    void* i1;  // x20
    void* v285;  // x23
    void* v286;  // x26
    unsigned int v287;  // w11
    void* v288;  // x12
    unsigned long long v289;  // x13
    unsigned long v290;  // x9
    unsigned int v291;  // w14
    void* v292;  // x19
    void* v293;  // x10
    void* v294;  // x9
    void* v295;  // x10
    void* v296;  // x8
    void* v297;  // x11
    void* v298;  // x9
    unsigned long long v299;  // x11
    void* v300;  // x0
    unsigned int v301;  // w9
    unsigned long long v302;  // x10
    void* v303;  // x8
    void* v304;  // x9
    unsigned long long v305;  // x9
    unsigned long long v306;  // x11
    unsigned long long v307;  // x12
    unsigned long long v308;  // x10
    void* l;  // x9
    void* v310;  // x10
    uint128_t *v311;  // x13
    uint128_t *v312;  // x14
    unsigned long long k;  // x15
    unsigned long long v314;  // x15
    uint128_t v315;  // q1
    void* v317;  // x10
    void* v318;  // x9
    void* v319;  // x23
    void* v320;  // x10
    void* v321;  // x12
    void* node;  // x11
    unsigned int v26;  // w8
    unsigned long v323;  // x8
    unsigned long long v324;  // 4145
    unsigned long long v325;  // 4147
    unsigned long v326;  // x8
    unsigned long long v327;  // x8
    unsigned int v328;  // w10
    unsigned long v329;  // x12
    unsigned long long v330;  // 4136
    unsigned long long v331;  // 4138
    unsigned long v332;  // x12
    void* v333;  // x11
    unsigned int v334;  // w13
    unsigned int v335;  // w14
    void* v336;  // x13
    unsigned int v337;  // w11
    unsigned long v338;  // x23
    unsigned int v339;  // w19
    unsigned int v340;  // w22
    long long v341;  // x25
    unsigned long long v342;  // x8
    void* v343;  // x23
    unsigned int v344;  // w9
    unsigned long long v345;  // x10
    unsigned long v346;  // x8
    void* v347;  // x8
    void* v348;  // x22
    unsigned int n;  // x21
    unsigned int v350;  // x8
    void* v351;  // x0
    void* ptr2;  // x0
    unsigned long long v353;  // x19
    long long v354;  // x20
    unsigned int v27;  // w19
    unsigned long v28;  // x9
    unsigned long long v29;  // x13
    void* v30;  // x15
    void* v31;  // x14
    unsigned int v103;  // x21
    unsigned int v104;  // x8
    void* v105;  // x0
    void* v106;  // x0
    unsigned long long v107;  // x20
    long long v108;  // x22
    void* v109;  // x20
    void* v110;  // x0
    unsigned long v111;  // x10
    void* v112;  // x25
    unsigned long long v32;  // x25
    void* v113;  // x28
    void* v114;  // x13
    unsigned int v115;  // w12
    void* v116;  // x16
    void* v117;  // x9
    void* v118;  // x9
    void* v119;  // x22
    unsigned long v120;  // x8
    void* v121;  // x22
    unsigned long long v122;  // x19
    void* v0;  // [bp-0x118]
    unsigned long long v1;  // [bp-0x110]
    unsigned int v2;  // [bp-0x108], Other Possible Types: unsigned long long
    unsigned int v3;  // [bp-0x100], Other Possible Types: unsigned long long
    void* v4;  // [bp-0xf8], Other Possible Types: unsigned int, unsigned long
    void* v5;  // [bp-0xf0], Other Possible Types: unsigned long long
    void* v6;  // [bp-0xe8], Other Possible Types: unsigned int
    void* v7;  // [bp-0xe0]
    void* v8;  // [bp-0xd8], Other Possible Types: unsigned int
    void* v9;  // [bp-0xd0], Other Possible Types: unsigned int
    void* v10;  // [bp-0xc8]
    void* v11;  // [bp-0xc0], Other Possible Types: unsigned long long
    void* v12;  // [bp-0xb8], Other Possible Types: unsigned long, unsigned long long
    st_cb4f4_0 **v13;  // [bp-0xa8], Other Possible Types: char
    st_cb4f4_0 *v14;  // [bp-0xa0]
    st_cb4f4_0 **v15;  // [bp-0x98], Other Possible Types: char
    st_cb4f4_0 *v16;  // [bp-0x90]
    st_cb4f4_0 **v17;  // [bp-0x88], Other Possible Types: char
    st_cb4f4_0 *v18;  // [bp-0x80]
    st_cb4f4_3 **v19;  // [bp-0x78]
    st_cb4f4_3 **v20;  // [bp-0x70]
    char *v21;  // [bp-0x10]
    char v22;  // [bp+0x0]

    v21 = &v22;
    v23 = a2;
    v14 = &v13;
    v13 = &v14;
    v24 = sub_ccdec();
    v25 = v24 + 0x4000;
    v26 = (1 < (int)a5 ? a5 : 1);
    v27 = ((int)v26 <= 0x10000 ? v26 : 65537);
    if ((int)sub_cb4c4(a3) <= (int)a4)
    {
        if (65546 >= (int)a3)
        {
            v16 = &v15;
            v15 = &v16;
            if (0x7e000000 >= (unsigned int)a3)
            {
                if (!(unsigned int)a3)
                    goto LABEL_ccc44;
                v18 = &v17;
                v17 = &v18;
                v194 = (int)v25[16];
                v195 = a3 & 0xffffffff;
                v196 = a1;
                v197 = v196 + v195;
                *(unsigned int *)&v25[24] = (int)v25[24] + (unsigned int)a3;
                *(unsigned int *)&v25[16] = (unsigned int)v194 + (unsigned int)a3;
                *(unsigned int *)&v25[20] = 3;
                v198 = v23;
                v199 = v196;
                if ((unsigned int)a3 >= 13)
                {
                    v11 = v197;
                    v12 = v195;
                    v200 = a1;
                    v201 = v200 - v194;
                    v202 = v197 - 11;
                    v8 = v197 - 5;
                    *(unsigned short *)((char *)v24 + 2 * (2654435761 * *(int *)v200 >> 19)) = v194;
                    v203 = v200;
                    v204 = (int)v203[1];
                    v205 = v203 + 1;
                    v206 = v27 * 64;
                    i0 = v197 - 12;
                    v6 = v197 - 6;
                    v7 = v197 - 8;
                    v5 = ~v194 + v200;
                    v199 = v200;
                    v198 = v23;
                    v9 = v206;
                    while (1)
                    {
                        v208 = 1;
                        v209 = v206;
                        do
                        {
                            v210 = v205;
                            v205 += v208;
                            if (v202 < v205)
                                goto LABEL_ccc58;
                            v211 = 2654435761 * v204 >> 19;
                            v212 = *(short *)((char *)v24 + 2 * v211);
                            v208 = v209 >> 6;
                            v209 += 1;
                            v19 = &v20;
                            v20 = &v19;
                            v204 = *(int *)v205;
                            *(unsigned short *)((char *)v24 + 2 * v211) = v210 - v201;
                        } while (*(int *)((char *)v201 + v212) != *(int *)v210);
                        v213 = v201 + v212;
                        if (v213 <= a1 || *((char *)v210 - 1) != *((char *)v213 - 1))
                        {
                            v217 = v210;
                        }
                        else
                        {
                            v214 = v210 - 1;
                            v215 = v5 + v212;
                            v216 = v214;
                            do
                            {
                                v210 = v214;
                                v217 = v216;
                                v213 = v215;
                                if (v214 <= v199 || v213 <= a1)
                                    break;
                            } while ((v218 = v210, v214 = v218 - 1, v219 = v213, v215 = v219 - 1, v216 = v217 - 1, *((char *)v218 - 1) == *((char *)v219 - 1)));
                        }
                        v220 = v217 - v199;
                        v221 = v198 + 1;
                        v222 = (unsigned int)v220 - 15;
                        if ((unsigned int)v220 >= 15)
                        {
                            *(char *)v198 = 240;
                            if (v222 >= 0xff)
                            {
                                v2 = (unsigned int)(v217 - v199) - 270;
                                v1 = v2 / 0xff;
                                v3 = v220;
                                v4 = v199;
                                _memset();
                                v220 = v3;
                                v199 = v4;
                                v223 = v1;
                                v222 = v2 + (unsigned int)v223 - (unsigned int)v223 * 0x100;
                                v221 = v198 + v223 + 2;
                            }
                            *(char *)v221 = v222;
                            v221 += 1;
                        }
                        else
                        {
                            *(char *)v198 = (char)v220 * 16;
                        }
                        v224 = v221 + (v220 & 0xffffffff);
                        v225 = v221 + 8;
                        v226 = (v225 < v224 ? v224 : v225) + ~v221;
                        if (v226 >= 24 && v221 - v199 >= 32)
                        {
                            v227 = (v226 >> 3) + 1;
                            v228 = v227 & 0x3ffffffffffffffc;
                            v229 = v228 * 8;
                            j = v221 + v229;
                            v231 = v199 + v229;
                            v232 = v199 + 16;
                            v233 = v221 + 16;
                            i = v228;
                            do
                            {
                                v235 = i;
                                v236 = *(int128_t *)v232;
                                *(int128_t *)((char *)v233 - 16) = *(int128_t *)((char *)v232 - 16);
                                *v233 = v236;
                                v232 += 32;
                                v233 += 2;
                                i = v235 - 4;
                            } while (i);
                            if (v227 == v228)
                                goto LABEL_cbd40;
                        }
                        else
                        {
                            j = v221;
                            v231 = v199;
                        }
                        do
                        {
                            v238 = v231 + 8;
                            *(long long *)j = *(long long *)v231;
                            j += 8;
                            v231 = v238;
                        } while (j < v224);
                        while (1)
                        {
LABEL_cbd40:
                            v239 = v224;
                            *(unsigned short *)v239 = v210 - v213;
                            v240 = v239 + 2;
                            v241 = v210 + 4;
                            v242 = v213 + 4;
                            v19 = &v20;
                            v20 = &v19;
                            if (i0 <= v241)
                            {
                                v243 = v241;
                                while (i0 > v243)
                                {
                                    if (*(long long *)v242 == *(long long *)v243)
                                    {
                                        v243 += 8;
                                        v242 += 8;
                                    }
                                    else
                                    {
                                        v250 = *(long long *)v243 ^ *(long long *)v242;
                                        v251 = ((((((v250 & 0xaaaaaaaaaaaaaaaa) >> 1 | v250 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v250 & 0xaaaaaaaaaaaaaaaa) >> 1 | v250 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v250 & 0xaaaaaaaaaaaaaaaa) >> 1 | v250 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v250 & 0xaaaaaaaaaaaaaaaa) >> 1 | v250 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                        v252 = (((((((v250 & 0xaaaaaaaaaaaaaaaa) >> 1 | v250 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v250 & 0xaaaaaaaaaaaaaaaa) >> 1 | v250 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v250 & 0xaaaaaaaaaaaaaaaa) >> 1 | v250 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v250 & 0xaaaaaaaaaaaaaaaa) >> 1 | v250 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                        v253 = ((((v252 | v251) & 0xffff0000ffff0000) >> 16 | (v252 | v251) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v252 | v251) & 0xffff0000ffff0000) >> 16 | (v252 | v251) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                        v243 += (!v253 ? 64 : Clz(v253)) >> 3;
                                        goto LABEL_cbdc8;
                                    }
                                }
                                if (v7 > v243)
                                {
                                    v254 = (*(int *)v242 != *(int *)v243 ? v243 : v243 + 4);
                                    v242 = (*(int *)v242 != *(int *)v243 ? v242 : v242 + 4);
                                    v243 = v254;
                                    if (v243 < v6)
                                        goto LABEL_cbf28;
                                }
                                else
                                {
                                    v254 = v243;
                                    if (v6 > v254)
                                    {
LABEL_cbf28:
                                        v255 = *(short *)v242;
                                        v256 = *(short *)v254;
                                        v243 = (v255 != v256 ? v254 : v254 + 2);
                                        v242 = (v255 != v256 ? v242 : v242 + 2);
                                        if (v8 <= v243)
                                            goto LABEL_cbdc8;
LABEL_cbf50:
                                        v257 = v243;
                                        v243 = (*(char *)v242 != *(char *)v257 ? v243 : v257 + 1);
                                        goto LABEL_cbdc8;
                                    }
                                }
                                if (v8 > v243)
                                    goto LABEL_cbf50;
LABEL_cbdc8:
                                v249 = v243 - v241;
                                v210 = v210 + v249 + 4;
                                v258 = v249 - 15;
                                if (v249 >= 15)
                                {
                                    *(char *)v198 = *(char *)v198 + 15;
                                    *(unsigned int *)v240 = 0xffffffff;
                                    if (v258 >= 0x3fc)
                                    {
                                        v259 = v224 + 6;
                                        v260 = v249 - 1035;
                                        v261 = v260 / 0x3fc;
                                        v262 = v261 * 4;
                                        _memset(v259, 0xff, v262 + 4);
                                        v258 = v260 - 0x3fc * v261;
                                        v240 = v259 + v262;
                                    }
                                    v263 = 32897 * (v258 & 0xffff) >> 23;
                                    v264 = v240 + v263;
                                    *(char *)v264 = (char)v258 + (char)v263;
                                    v240 = v264 + 1;
                                    goto LABEL_cbe74;
                                }
                                goto LABEL_cbe68;
                            }
                            if (*(long long *)v242 == *(long long *)v241)
                            {
                                v243 = v210 + 12;
                                v242 = v213 + 12;
                                goto LABEL_0xcbd78;
                            }
                            v244 = *(long long *)v241 ^ *(long long *)v242;
                            v245 = ((((((v244 & 0xaaaaaaaaaaaaaaaa) >> 1 | v244 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v244 & 0xaaaaaaaaaaaaaaaa) >> 1 | v244 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v244 & 0xaaaaaaaaaaaaaaaa) >> 1 | v244 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v244 & 0xaaaaaaaaaaaaaaaa) >> 1 | v244 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                            v246 = (((((((v244 & 0xaaaaaaaaaaaaaaaa) >> 1 | v244 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v244 & 0xaaaaaaaaaaaaaaaa) >> 1 | v244 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v244 & 0xaaaaaaaaaaaaaaaa) >> 1 | v244 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v244 & 0xaaaaaaaaaaaaaaaa) >> 1 | v244 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                            v247 = ((((v246 | v245) & 0xffff0000ffff0000) >> 16 | (v246 | v245) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v246 | v245) & 0xffff0000ffff0000) >> 16 | (v246 | v245) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                            v248 = (!v247 ? 64 : Clz(v247));
                            v249 = ((unsigned int)v248 * 0 | (unsigned int)(v248 >> 3)) & 0x1fffffff;
                            v210 += v249 + 4;
LABEL_cbe68:
                            *(char *)v198 = *(char *)v198 + (char)v249;
LABEL_cbe74:
                            if (v202 <= v210)
                            {
                                v198 = v240;
                                v199 = v210;
LABEL_ccc58:
                                v197 = v11;
                                v195 = v12;
                                goto LABEL_ccc5c;
                            }
                            v19 = &v20;
                            v20 = &v19;
                            *(unsigned short *)((char *)v24 + 2 * (2654435761 * *(int *)((char *)v210 - 2) >> 19)) = v210 - 2 - v201;
                            v19 = &v20;
                            v20 = &v19;
                            v265 = 2654435761 * *(int *)v210 >> 19;
                            v213 = v201 + *(short *)((char *)v24 + 2 * v265);
                            *(unsigned short *)((char *)v24 + 2 * v265) = v210 - v201;
                            if (*(int *)v213 != *(int *)v210)
                                break;
                            v266 = v240;
                            *(char *)v266 = 0;
                            v224 = v266 + 1;
                            v198 = v240;
                        }
                        v19 = &v20;
                        v20 = &v19;
                        v267 = v210;
                        v204 = (int)v267[1];
                        v205 = v267 + 1;
                        v199 = v210;
                        v198 = v240;
                        v206 = v9;
                    }
                }
LABEL_ccc5c:
                v103 = v197 - v199;
                v268 = v103 - 15;
                if (v103 >= 15)
                {
                    v269 = v198;
                    *(char *)v269 = 240;
                    ptr1 = v269 + 1;
                    if (v268 >= 0xff)
                    {
                        v271 = a1 + v195 - v199 - 270;
                        v272 = v271 / 0xff;
                        _memset(ptr1, 0xff, v272 + 1);
                        v268 = v272 - v272 * 0x100 + v271;
                        ptr1 = v272 + v198 + 2;
                    }
                    *(char *)ptr1 = v268;
                    v198 = ptr1;
                }
                else
                {
                    *(char *)v198 = (char)v103 * 16;
                }
                v109 = v198 + 1;
                v110 = v109;
                goto LABEL_ccdbc;
            }
        }
        else
        {
            v16 = &v15;
            v15 = &v16;
            if (0x7e000000 >= (unsigned int)a3)
            {
                v18 = &v17;
                v17 = &v18;
                v273 = (int)v25[16];
                v274 = a1;
                v275 = v274 - v273;
                v2 = a3 & 0xffffffff;
                v276 = v274 + v2;
                v277 = v276 - 11;
                *(unsigned int *)&v25[24] = (int)v25[24] + (unsigned int)a3;
                *(unsigned int *)&v25[16] = (unsigned int)v273 + (unsigned int)a3;
                *(unsigned int *)&v25[20] = 2;
                v278 = v274;
                v279 = v278 + 2;
                *(unsigned int *)((char *)v24 + (0xcf1bbcdcbb000000 * *(long long *)v278 >> 50 & 0x3ffc)) = v273;
                v280 = v274;
                v281 = (long long)v280[1];
                v282 = v280 + 1;
                v11 = v276 - 5;
                v12 = v276;
                v283 = 1 | v27 * 64;
                i1 = v276 - 12;
                v8 = v276 - 8;
                v7 = v276 - 6;
                v1 = ~v273 + v274;
                v10 = v23;
                v285 = v23;
                v286 = v274;
                v9 = v27;
                while (1)
                {
                    v287 = v283;
                    while (1)
                    {
                        v288 = v279;
                        v289 = 0xcf1bbcdcbb000000 * v281 >> 50 & 0x3ffc;
                        v290 = *(int *)((char *)v24 + v289);
                        v291 = v282 - v275;
                        v19 = &v20;
                        v20 = &v19;
                        v281 = *(long long *)v288;
                        *(unsigned int *)((char *)v24 + v289) = v291;
                        if ((unsigned int)v290 + 0xffff >= v291 && *(int *)((char *)v275 + v290) == *(int *)v282)
                            break;
                        v279 = v288 + v27;
                        v27 = v287 >> 6;
                        v287 += 1;
                        v282 = v288;
                        if (v277 < v279)
                        {
LABEL_ccb08:
                            n = v12 - v286;
                            v350 = n - 15;
                            if (n >= 15)
                            {
                                v351 = v285;
                                *(char *)v351 = 240;
                                ptr2 = v351 + 1;
                                if (v350 >= 0xff)
                                {
                                    v353 = a1 + v2 - v286 - 270;
                                    v354 = v353 / 0xff;
                                    _memset(ptr2, 0xff, v354 + 1);
                                    v350 = v354 - v354 * 0x100 + v353;
                                    ptr2 = v354 + v285 + 2;
                                }
                                *(char *)ptr2 = v350;
                                v285 = ptr2;
                            }
                            else
                            {
                                *(char *)v285 = (char)n * 16;
                            }
                            _memcpy(v285 + 1, v286, n);
                            return v285 + 1 + n - v10;
                        }
                    }
                    v292 = (char *)v275 + v290;
                    if (v292 <= a1 || *((char *)v282 - 1) != *((char *)v292 - 1))
                    {
                        v296 = v282;
                    }
                    else
                    {
                        v293 = v282 - 1;
                        v294 = v1 + v290;
                        v295 = v293;
                        do
                        {
                            v282 = v293;
                            v296 = v295;
                            v292 = v294;
                            if (v293 <= v286 || v292 <= a1)
                                break;
                        } while ((v297 = v282, v293 = v297 - 1, v298 = v292, v294 = v298 - 1, v295 = v296 - 1, *((char *)v297 - 1) == *((char *)v298 - 1)));
                    }
                    v299 = v296 - v286;
                    v300 = v285 + 1;
                    v301 = (unsigned int)v299 - 15;
                    if ((unsigned int)v299 >= 15)
                    {
                        *(char *)v285 = 240;
                        if (v301 >= 0xff)
                        {
                            v4 = (unsigned int)(v296 - v286) - 270;
                            v3 = v4 / 0xff;
                            v6 = v283;
                            v5 = v299;
                            _memset();
                            v299 = v5;
                            v283 = v6;
                            v302 = v3;
                            v301 = v4 + (unsigned int)v302 - (unsigned int)v302 * 0x100;
                            v300 = v285 + v302 + 2;
                        }
                        *(char *)v300 = v301;
                        v300 += 1;
                    }
                    else
                    {
                        *(char *)v285 = (char)v299 * 16;
                    }
                    v303 = v300 + (v299 & 0xffffffff);
                    v304 = v300 + 8;
                    v305 = (v304 < v303 ? v303 : v304) + ~v300;
                    if (v305 >= 24 && v300 - v286 >= 32)
                    {
                        v306 = (v305 >> 3) + 1;
                        v307 = v306 & 0x3ffffffffffffffc;
                        v308 = v307 * 8;
                        l = v300 + v308;
                        v310 = v286 + v308;
                        v311 = v286 + 16;
                        v312 = v300 + 16;
                        k = v307;
                        do
                        {
                            v314 = k;
                            v315 = *v311;
                            *(int128_t *)((char *)v312 - 16) = *(int128_t *)((char *)v311 - 16);
                            *v312 = v315;
                            v311 += 2;
                            v312 += 2;
                            k = v314 - 4;
                        } while (k);
                        if (v306 == v307)
                            goto LABEL_cc35c;
                    }
                    else
                    {
                        l = v300;
                        v310 = v286;
                    }
                    do
                    {
                        v317 = v310 + 8;
                        *(long long *)l = *(long long *)v310;
                        l += 8;
                        v310 = v317;
                    } while (l < v303);
LABEL_cc35c:
                    v286 = v282;
                    while (1)
                    {
                        v318 = v285;
                        v319 = v303;
                        *(unsigned short *)v319 = v286 - v292;
                        v285 = v319 + 2;
                        v320 = v286 + 4;
                        v321 = v292 + 4;
                        v19 = &v20;
                        v20 = &v19;
                        if (i1 <= v320)
                        {
                            node = v320;
                            while (i1 > node)
                            {
                                if (*(long long *)v321 == *(long long *)node)
                                {
                                    node += 8;
                                    v321 += 8;
                                }
                                else
                                {
                                    v329 = *(long long *)node ^ *(long long *)v321;
                                    v330 = ((((((v329 & 0xaaaaaaaaaaaaaaaa) >> 1 | v329 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v329 & 0xaaaaaaaaaaaaaaaa) >> 1 | v329 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v329 & 0xaaaaaaaaaaaaaaaa) >> 1 | v329 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v329 & 0xaaaaaaaaaaaaaaaa) >> 1 | v329 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                    v331 = (((((((v329 & 0xaaaaaaaaaaaaaaaa) >> 1 | v329 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v329 & 0xaaaaaaaaaaaaaaaa) >> 1 | v329 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v329 & 0xaaaaaaaaaaaaaaaa) >> 1 | v329 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v329 & 0xaaaaaaaaaaaaaaaa) >> 1 | v329 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                    v332 = ((((v331 | v330) & 0xffff0000ffff0000) >> 16 | (v331 | v330) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v331 | v330) & 0xffff0000ffff0000) >> 16 | (v331 | v330) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                    node += (!v332 ? 64 : Clz(v332)) >> 3;
                                    goto LABEL_cc3ec;
                                }
                            }
                            if (v8 > node)
                            {
                                v333 = (*(int *)v321 != *(int *)node ? node : node + 4);
                                v321 = (*(int *)v321 != *(int *)node ? v321 : v321 + 4);
                                node = v333;
                                if (node < v7)
                                    goto LABEL_cc56c;
                            }
                            else
                            {
                                v333 = node;
                                if (v7 > v333)
                                {
LABEL_cc56c:
                                    v334 = *(short *)v321;
                                    v335 = *(short *)v333;
                                    node = (v334 != v335 ? v333 : v333 + 2);
                                    v321 = (v334 != v335 ? v321 : v321 + 2);
                                    if (v11 <= node)
                                        goto LABEL_cc3ec;
LABEL_cc594:
                                    v336 = node;
                                    node = (*(char *)v321 != *(char *)v336 ? node : v336 + 1);
                                    goto LABEL_cc3ec;
                                }
                            }
                            if (v11 > node)
                                goto LABEL_cc594;
LABEL_cc3ec:
                            v328 = node - v320;
                            v286 = v286 + v328 + 4;
                            v337 = v328 - 15;
                            if (v328 >= 15)
                            {
                                *(char *)v318 = *(char *)v318 + 15;
                                *(unsigned int *)v285 = 0xffffffff;
                                if (v337 >= 0x3fc)
                                {
                                    v338 = v303 + 6;
                                    v339 = v328 - 1035;
                                    v340 = v339 / 0x3fc;
                                    v341 = v340 * 4;
                                    _memset(v338, 0xff, v341 + 4);
                                    v337 = v339 - 0x3fc * v340;
                                    v285 = v338 + v341;
                                }
                                v342 = 32897 * (v337 & 0xffff) >> 23;
                                v343 = v285 + v342;
                                *(char *)v343 = (char)v337 + (char)v342;
                                v285 = v343 + 1;
                                if (v286 >= v277)
                                    goto LABEL_ccb08;
                                goto LABEL_cc4b0;
                            }
                            goto LABEL_cc49c;
                        }
                        else if (*(long long *)v321 == *(long long *)v320)
                        {
                            node = v286 + 12;
                            v321 = v292 + 12;
                            goto LABEL_0xcc39c;
                        }
                        else
                        {
                            v323 = *(long long *)v320 ^ *(long long *)v321;
                            v324 = ((((((v323 & 0xaaaaaaaaaaaaaaaa) >> 1 | v323 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v323 & 0xaaaaaaaaaaaaaaaa) >> 1 | v323 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v323 & 0xaaaaaaaaaaaaaaaa) >> 1 | v323 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v323 & 0xaaaaaaaaaaaaaaaa) >> 1 | v323 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                            v325 = (((((((v323 & 0xaaaaaaaaaaaaaaaa) >> 1 | v323 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v323 & 0xaaaaaaaaaaaaaaaa) >> 1 | v323 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v323 & 0xaaaaaaaaaaaaaaaa) >> 1 | v323 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v323 & 0xaaaaaaaaaaaaaaaa) >> 1 | v323 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                            v326 = ((((v325 | v324) & 0xffff0000ffff0000) >> 16 | (v325 | v324) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v325 | v324) & 0xffff0000ffff0000) >> 16 | (v325 | v324) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                            v327 = (!v326 ? 64 : Clz(v326));
                            v328 = ((unsigned int)v327 * 0 | (unsigned int)(v327 >> 3)) & 0x1fffffff;
                            v286 += v328 + 4;
LABEL_cc49c:
                            *(char *)v318 = *(char *)v318 + (char)v328;
                            if (v277 <= v286)
                                goto LABEL_ccb08;
LABEL_cc4b0:
                            v19 = &v20;
                            v20 = &v19;
                            *(unsigned int *)((char *)v24 + (0xcf1bbcdcbb000000 * *(long long *)((char *)v286 - 2) >> 50 & 0x3ffc)) = v286 - 2 - v275;
                            v19 = &v20;
                            v20 = &v19;
                            v344 = v286 - v275;
                            v345 = 0xcf1bbcdcbb000000 * *(long long *)v286 >> 50 & 0x3ffc;
                            v346 = *(int *)((char *)v24 + v345);
                            *(unsigned int *)((char *)v24 + v345) = v344;
                            if ((unsigned int)v346 + 0xffff < v344 || !(v292 = (char *)v275 + v346, *(int *)v292 == *(int *)v286))
                            {
                                v19 = &v20;
                                v20 = &v19;
                                v348 = v286;
                                v281 = (long long)v348[1];
                                v282 = v348 + 1;
                                v279 = v282 + 1;
                                v27 = v9;
                                if (v277 < v279)
                                    goto LABEL_ccb08;
                                break;
                            }
                            else
                            {
                                v347 = v285;
                                *(char *)v347 = 0;
                                v303 = v347 + 1;
                            }
                        }
                    }
                }
            }
        }
        goto LABEL_ccd1c;
    }
    if (65546 < (int)a3)
    {
        v16 = &v15;
        v15 = &v16;
        if (0x7e000000 >= (unsigned int)a3)
        {
            v18 = &v17;
            v17 = &v18;
            v111 = (int)v25[16];
            v112 = a1;
            v113 = v112 - v111;
            v1 = a3 & 0xffffffff;
            v114 = v112 + v1;
            v115 = v27;
            v116 = v114 - 11;
            v7 = v114 - 5;
            v8 = v114;
            *(unsigned int *)&v25[24] = (int)v25[24] + (unsigned int)a3;
            *(unsigned int *)&v25[16] = (unsigned int)v111 + (unsigned int)a3;
            *(unsigned int *)&v25[20] = 2;
            v117 = v112;
            v118 = v117 + 2;
            *(unsigned int *)((char *)v24 + (0xcf1bbcdcbb000000 * *(long long *)v117 >> 50 & 0x3ffc)) = v111;
            v119 = v112;
            v120 = (long long)v119[1];
            v121 = v119 + 1;
            v122 = v23 + a4;
            v123 = 1 | v115 * 64;
            v124 = v114 - 12;
            v6 = v114 - 8;
            v5 = v114 - 6;
            v0 = ~v111 + v112;
            v125 = v23;
            v10 = v23;
            v11 = v122;
            v9 = v115;
            while (1)
            {
                v126 = v123;
                while (1)
                {
                    v127 = v118;
                    v128 = 0xcf1bbcdcbb000000 * v120 >> 50 & 0x3ffc;
                    v129 = *(int *)((char *)v24 + v128);
                    v130 = v121 - v113;
                    v19 = &v20;
                    v20 = &v19;
                    v120 = *(long long *)v127;
                    *(unsigned int *)((char *)v24 + v128) = v130;
                    if ((unsigned int)v129 + 0xffff >= v130 && *(int *)((char *)v113 + v129) == *(int *)v121)
                        break;
                    v118 = v127 + v115;
                    v115 = v126 >> 6;
                    v126 += 1;
                    v121 = v127;
                    if (v116 < v118)
                        goto LABEL_ccb7c;
                }
                v131 = v113 + v129;
                if (v131 <= a1 || *((char *)v121 - 1) != *((char *)v131 - 1))
                {
                    v135 = v121;
                }
                else
                {
                    v132 = v121 - 1;
                    v133 = v0 + v129;
                    v134 = v132;
                    do
                    {
                        v121 = v132;
                        v135 = v134;
                        v131 = v133;
                        if (v132 <= v112 || v131 <= a1)
                            break;
                    } while ((v136 = v121, v132 = v136 - 1, v137 = v131, v133 = v137 - 1, v134 = v135 - 1, *((char *)v136 - 1) == *((char *)v137 - 1)));
                }
                v138 = v135 - v112;
                iter = v125 + 1;
                v140 = v138;
                if (v122 < iter + v140 + (unsigned int)v140 / 0xff + 8)
                    goto LABEL_ccd1c;
                v141 = v138 - 15;
                if (v138 >= 15)
                {
                    *(char *)v125 = 240;
                    if (v141 >= 0xff)
                    {
                        v3 = (unsigned int)(v135 - v112) - 270;
                        v2 = v3 / 0xff;
                        v12 = v116;
                        v4 = v140;
                        _memset();
                        v140 = v4;
                        v116 = v12;
                        v142 = v2;
                        v141 = v3 + (unsigned int)v142 - (unsigned int)v142 * 0x100;
                        iter = v125 + v142 + 2;
                    }
                    *(char *)iter = v141;
                    iter += 1;
                }
                else
                {
                    *(char *)v125 = (char)v138 * 16;
                }
                v143 = iter + v140;
                v144 = iter + 8;
                v145 = (v144 < v143 ? v143 : v144) + ~iter;
                if (v145 >= 24 && iter - v112 >= 32)
                {
                    v146 = (v145 >> 3) + 1;
                    v147 = v146 & 0x3ffffffffffffffc;
                    v148 = v147 * 8;
                    iter1 = iter + v148;
                    v150 = v112 + v148;
                    iter2 = v112 + 16;
                    v152 = iter + 16;
                    m = v147;
                    do
                    {
                        v154 = m;
                        v155 = *(int128_t *)iter2;
                        *(int128_t *)((char *)v152 - 16) = *(int128_t *)((char *)iter2 - 16);
                        *v152 = v155;
                        iter2 += 32;
                        v152 += 2;
                        m = v154 - 4;
                    } while (m);
                    if (v146 == v147)
                        goto LABEL_cc7ec;
                }
                else
                {
                    iter1 = iter;
                    v150 = v112;
                }
                do
                {
                    v157 = v150 + 8;
                    *(long long *)iter1 = *(long long *)v150;
                    iter1 += 8;
                    v150 = v157;
                } while (iter1 < v143);
LABEL_cc7ec:
                v112 = v121;
                while (1)
                {
                    v158 = v125;
                    v159 = v143;
                    *(unsigned short *)v159 = v112 - v131;
                    v125 = v159 + 2;
                    v160 = v112 + 4;
                    v161 = v131 + 4;
                    v19 = &v20;
                    v20 = &v19;
                    if (v124 <= v160)
                    {
                        v162 = v160;
                        if (v160 >= v124)
                            goto LABEL_cc860;
LABEL_cc834:
                        v169 = (unsigned int)(v162 - v112) - 4;
                        do
                        {
                            if (*(long long *)v161 != *(long long *)v162)
                            {
                                v170 = *(long long *)v162 ^ *(long long *)v161;
                                v171 = ((((((v170 & 0xaaaaaaaaaaaaaaaa) >> 1 | v170 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v170 & 0xaaaaaaaaaaaaaaaa) >> 1 | v170 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v170 & 0xaaaaaaaaaaaaaaaa) >> 1 | v170 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v170 & 0xaaaaaaaaaaaaaaaa) >> 1 | v170 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                v172 = (((((((v170 & 0xaaaaaaaaaaaaaaaa) >> 1 | v170 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v170 & 0xaaaaaaaaaaaaaaaa) >> 1 | v170 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v170 & 0xaaaaaaaaaaaaaaaa) >> 1 | v170 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v170 & 0xaaaaaaaaaaaaaaaa) >> 1 | v170 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                v173 = ((((v172 | v171) & 0xffff0000ffff0000) >> 16 | (v172 | v171) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v172 | v171) & 0xffff0000ffff0000) >> 16 | (v172 | v171) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                v168 = (unsigned int)((!v173 ? 64 : Clz(v173)) >> 3) + v169;
                                if (v122 < v143 + (v168 + 240) / 0xff + 8)
                                    goto LABEL_ccd1c;
                                goto LABEL_cc92c;
                            }
                        } while ((v162 += 8, v161 += 8, v169 += 8, v162 < v124));
LABEL_cc860:
                        if (v6 > v162)
                        {
                            v174 = (*(int *)v161 != *(int *)v162 ? v162 : v162 + 4);
                            v161 = (*(int *)v161 != *(int *)v162 ? v161 : v161 + 4);
                            v162 = v174;
                            if (v162 < v5)
                                goto LABEL_cca7c;
                        }
                        else
                        {
                            v174 = v162;
                            if (v5 > v174)
                            {
LABEL_cca7c:
                                v175 = *(short *)v161;
                                v176 = *(short *)v174;
                                v162 = (v175 != v176 ? v174 : v174 + 2);
                                v161 = (v175 != v176 ? v161 : v161 + 2);
                                if (v162 >= v7)
                                    goto LABEL_cc8b4;
LABEL_cc8a0:
                                v177 = v162;
                                v162 = (*(char *)v161 != *(char *)v177 ? v162 : v177 + 1);
LABEL_cc8b4:
                                v168 = v162 - v160;
                                if (v143 + (v168 + 240) / 0xff + 8 > v122)
                                    goto LABEL_ccd1c;
                                goto LABEL_cc92c;
                            }
                        }
                        if (v7 <= v162)
                            goto LABEL_cc8b4;
                        goto LABEL_cc8a0;
                    }
                    if (*(long long *)v161 == *(long long *)v160)
                    {
                        v162 = v112 + 12;
                        v161 = v131 + 12;
                        if (v124 <= v162)
                            goto LABEL_cc860;
                        goto LABEL_cc834;
                    }
                    v163 = *(long long *)v160 ^ *(long long *)v161;
                    v164 = ((((((v163 & 0xaaaaaaaaaaaaaaaa) >> 1 | v163 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v163 & 0xaaaaaaaaaaaaaaaa) >> 1 | v163 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v163 & 0xaaaaaaaaaaaaaaaa) >> 1 | v163 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v163 & 0xaaaaaaaaaaaaaaaa) >> 1 | v163 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v165 = (((((((v163 & 0xaaaaaaaaaaaaaaaa) >> 1 | v163 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v163 & 0xaaaaaaaaaaaaaaaa) >> 1 | v163 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v163 & 0xaaaaaaaaaaaaaaaa) >> 1 | v163 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v163 & 0xaaaaaaaaaaaaaaaa) >> 1 | v163 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v166 = ((((v165 | v164) & 0xffff0000ffff0000) >> 16 | (v165 | v164) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v165 | v164) & 0xffff0000ffff0000) >> 16 | (v165 | v164) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    v167 = (!v166 ? 64 : Clz(v166));
                    v168 = ((unsigned int)v167 * 0 | (unsigned int)(v167 >> 3)) & 0x1fffffff;
                    if (v143 + (v168 + 240) / 0xff + 8 > v122)
                        goto LABEL_ccd1c;
LABEL_cc92c:
                    v178 = v168 - 15;
                    if (v168 >= 15)
                    {
                        *(char *)v158 = *(char *)v158 + 15;
                        *(unsigned int *)v125 = 0xffffffff;
                        if (v178 >= 0x3fc)
                        {
                            v12 = v143 + 6;
                            v179 = v168 - 1035;
                            v180 = v179 / 0x3fc;
                            v181 = v180 * 4;
                            _memset(v12, 0xff, v181 + 4);
                            v178 = v179 - 0x3fc * v180;
                            v122 = v11;
                            v125 = v12 + v181;
                        }
                        v182 = 32897 * (v178 & 0xffff) >> 23;
                        v183 = v125 + v182;
                        *(char *)v183 = (char)v178 + (char)v182;
                        v125 = v183 + 1;
                        v112 = v112 + v168 + 4;
                        if (v112 >= v116)
                            goto LABEL_ccb78;
                        goto LABEL_cca04;
                    }
                    *(char *)v158 = *(char *)v158 + (char)v168;
                    v112 = v112 + v168 + 4;
                    if (v116 > v112)
                    {
LABEL_cca04:
                        v19 = &v20;
                        v20 = &v19;
                        *(unsigned int *)((char *)v24 + (0xcf1bbcdcbb000000 * *(long long *)((char *)v112 - 2) >> 50 & 0x3ffc)) = v112 - 2 - v113;
                        v19 = &v20;
                        v20 = &v19;
                        v184 = v112 - v113;
                        v185 = 0xcf1bbcdcbb000000 * *(long long *)v112 >> 50 & 0x3ffc;
                        v186 = *(int *)((char *)v24 + v185);
                        *(unsigned int *)((char *)v24 + v185) = v184;
                        if ((unsigned int)v186 + 0xffff < v184 || !(v131 = v113 + v186, *(int *)v131 == *(int *)v112))
                        {
                            v19 = &v20;
                            v20 = &v19;
                            v188 = v112;
                            v120 = (long long)v188[1];
                            v121 = v188 + 1;
                            v118 = v121 + 1;
                            v23 = v10;
                            v115 = v9;
                            if (v116 < v118)
                                goto LABEL_ccb7c;
                            break;
                        }
                        else
                        {
                            v187 = v125;
                            *(char *)v187 = 0;
                            v143 = v187 + 1;
                        }
                    }
                    else
                    {
LABEL_ccb78:
                        v23 = v10;
LABEL_ccb7c:
                        v103 = v8 - v112;
                        if (v122 < v125 + v103 + (v103 + 240) / 0xff + 1)
                            goto LABEL_ccd1c;
                        v189 = v103 - 15;
                        if (v103 >= 15)
                        {
                            v190 = v125;
                            *(char *)v190 = 240;
                            ptr = v190 + 1;
                            if (v189 >= 0xff)
                            {
                                v192 = a1 + v1 - v112 - 270;
                                v193 = v192 / 0xff;
                                _memset(ptr, 0xff, v193 + 1);
                                v189 = v193 - v193 * 0x100 + v192;
                                ptr = v193 + v125 + 2;
                            }
                            *(char *)ptr = v189;
                            v125 = ptr;
                        }
                        else
                        {
                            *(char *)v125 = (char)v103 * 16;
                        }
                        v109 = v125 + 1;
                        v110 = v109;
                        goto LABEL_ccdbc;
                    }
                }
            }
        }
        goto LABEL_ccd1c;
    }
    v16 = &v15;
    v15 = &v16;
    if (0x7e000000 < (unsigned int)a3)
        goto LABEL_ccd1c;
    if ((unsigned int)a3)
    {
        v18 = &v17;
        v17 = &v18;
        v28 = (int)v25[16];
        v29 = a3 & 0xffffffff;
        v30 = a1;
        v31 = v30 + v29;
        v32 = v23 + a4;
        *(unsigned int *)&v25[24] = (int)v25[24] + (unsigned int)a3;
        *(unsigned int *)&v25[16] = (unsigned int)v28 + (unsigned int)a3;
        *(unsigned int *)&v25[20] = 3;
        v33 = v23;
        if ((unsigned int)a3 >= 13)
        {
            v11 = v29;
            v30 = a1;
            v34 = v30 - v28;
            v35 = v31 - 11;
            *(unsigned short *)((char *)v24 + 2 * (2654435761 * *(int *)v30 >> 19)) = v28;
            v36 = v30;
            v37 = (int)v36[1];
            v38 = v36 + 1;
            v40 = v31 - 12;
            v6 = v31 - 8;
            v7 = v31 - 5;
            v9 = v31;
            v10 = v23;
            v4 = ~v28 + v30;
            v5 = v31 - 6;
            v33 = v23;
            v12 = v34;
            v8 = v27 * 64;
        }
        else
        {
            v103 = v31 - v30;
            if (v33 + v103 + (v103 + 240) / 0xff + 1 <= v32)
            {
                v104 = v103 - 15;
                if (v103 >= 15)
                {
                    v105 = v33;
                    *(char *)v105 = 240;
                    v106 = v105 + 1;
                    if (v104 >= 0xff)
                    {
                        v107 = a1 + v29 - v30 - 270;
                        v108 = v107 / 0xff;
                        _memset(v106, 0xff, v108 + 1);
                        v104 = v108 - v108 * 0x100 + v107;
                        v106 = v108 + v33 + 2;
                    }
                    *(char *)v106 = v104;
                    v33 = v106;
                }
                else
                {
                    *(char *)v33 = (char)v103 * 16;
                }
                v109 = v33 + 1;
                v110 = v109;
LABEL_ccdbc:
                _memcpy(v110);
                return v109 + v103 - v23;
            }
LABEL_ccd1c:
            return 0;
        }
    }
    else
    {
        if ((int)a4 >= 1)
        {
LABEL_ccc44:
            *(char *)v23 = 0;
            return 1;
        }
        goto LABEL_ccd1c;
    }
}
