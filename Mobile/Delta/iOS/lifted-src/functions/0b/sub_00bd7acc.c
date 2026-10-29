/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbd7acc..0xbd83e4 (2328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bd7acc_0 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    void* field_40;
} st_bd7acc_0;

extern long long g_efa3c0;
extern long long g_efa3d8;

void* sub_bd7acc(void* dst, unsigned long long a1, void* ptr, unsigned long long a3, unsigned long long a4, unsigned long long a5)
{
    unsigned long long i;  // x21
    void* iter;  // x20
    void* v17;  // x26
    uint128_t v107;  // q1
    uint128_t v108;  // q2
    uint128_t v109;  // q3
    uint128_t v110;  // q1
    uint128_t v111;  // q0
    uint128_t v112;  // q2
    unsigned long long v113;  // x13
    void* v114;  // x14
    void* v115;  // x16
    void* v116;  // x10
    unsigned long long j;  // x28
    void* v117;  // x15
    unsigned long long v118;  // 4109
    unsigned long long v119;  // 4109
    void* v120;  // x11
    unsigned long v121;  // x17
    unsigned long v122;  // x0
    void* v123;  // x1
    unsigned long v124;  // cc_dep1
    unsigned long v125;  // cc_dep2
    void* v126;  // x12
    void* iter1;  // x8
    unsigned long long v127;  // 4105
    unsigned long long v128;  // 4105
    void* v129;  // x14
    unsigned long long v130;  // 4105
    unsigned long long v131;  // 4105
    unsigned long v132;  // cc_dep1
    unsigned long v133;  // cc_dep2
    void* v134;  // x13
    void* v135;  // x10
    unsigned long long v136;  // 4105
    void* iter2;  // x9
    unsigned long long v137;  // 4105
    void* v138;  // x15
    unsigned long long v139;  // 4105
    unsigned long long v140;  // 4105
    uint128_t v141;  // q0
    uint128_t v142;  // q1
    uint128_t v143;  // q0
    uint128_t v144;  // q1
    uint128_t v145;  // q0
    uint128_t v146;  // q2
    unsigned long long l;  // x10
    uint128_t v147;  // q0
    uint128_t v148;  // q1
    uint128_t v149;  // q2
    uint128_t v150;  // q3
    uint128_t v151;  // q1
    uint128_t v152;  // q0
    uint128_t v153;  // q2
    unsigned long long v154;  // x10
    unsigned long long v155;  // x11
    uint128_t v156;  // q0
    void* v22;  // x11
    uint128_t v157;  // q1
    uint128_t v158;  // q2
    uint128_t v159;  // q3
    unsigned long long v160;  // x10
    void* v161;  // x11
    void* v162;  // x12
    uint128_t v163;  // q0
    uint128_t v164;  // q1
    uint128_t v165;  // q0
    unsigned long long v166;  // x12
    st_bd7acc_0 *v23;  // x10
    unsigned long long v167;  // x13
    unsigned long long v168;  // x14
    void* v169;  // x16
    void* v170;  // x15
    uint128_t v171;  // q0
    uint128_t v172;  // q1
    uint128_t v173;  // q2
    uint128_t v174;  // q3
    unsigned long v175;  // x14
    unsigned long long v176;  // x15
    uint128_t v24;  // q1
    void* v177;  // x16
    uint128_t v178;  // q0
    uint128_t v179;  // q2
    unsigned long long v180;  // x15
    void* v181;  // x15
    unsigned long long v182;  // x12
    void* v183;  // x9
    unsigned long long v184;  // x14
    unsigned long long v185;  // x13
    void* v186;  // x14
    uint128_t v25;  // q0
    unsigned long long v187;  // x15
    st_bd7acc_0 *v188;  // x17
    void* v189;  // x16
    uint128_t v190;  // q0
    uint128_t v191;  // q1
    uint128_t v192;  // q2
    uint128_t v193;  // q3
    unsigned long v194;  // x15
    void* v195;  // x16
    unsigned long long v196;  // x17
    unsigned long v26;  // x12
    void* v197;  // x16
    uint128_t v198;  // q0
    uint128_t v199;  // q2
    unsigned long long v200;  // x14
    void* v201;  // x13
    void* v202;  // x15
    void* v203;  // x11
    void* v204;  // x10
    void* v205;  // x16
    unsigned long v206;  // x17
    unsigned long long v9;  // x25
    unsigned long v27;  // x13
    unsigned long v207;  // x0
    void* v208;  // x1
    uint128_t v209;  // q0
    uint128_t v210;  // q1
    uint128_t v211;  // q0
    unsigned long v212;  // cc_dep1
    unsigned long v213;  // cc_dep2
    void* v214;  // x17
    uint128_t v215;  // q0
    uint128_t v216;  // q1
    void* v28;  // x12
    void* v217;  // x0
    uint128_t v218;  // q0
    unsigned long long v219;  // 4144
    unsigned long long v220;  // 4109
    unsigned long long v221;  // 4109
    unsigned long long v222;  // x16
    void* v223;  // x8
    void* v224;  // x12
    void* v225;  // x15
    uint128_t v226;  // q0
    st_bd7acc_0 *v29;  // x12
    uint128_t v227;  // q1
    uint128_t v228;  // q2
    uint128_t v229;  // q3
    unsigned long long v231;  // 4110
    unsigned long long v232;  // 4102
    unsigned long long v233;  // 4110
    unsigned long long v234;  // 4102
    long long v235;  // x0
    uint128_t v30;  // q0
    uint128_t v31;  // q1
    uint128_t v32;  // q0
    unsigned long long v33;  // 4151
    unsigned long long v34;  // x1
    void* v35;  // x8
    char *v36;  // x10
    unsigned long long v10;  // x23
    unsigned long long m;  // x9
    unsigned long long v38;  // x9
    uint128_t v39;  // q1
    uint128_t v40;  // q0
    unsigned long long v42;  // x25
    void* v43;  // x8
    void* node;  // x9
    void* v45;  // x10
    void* v46;  // x10
    unsigned long long v11;  // x24
    uint128_t v47;  // q0
    uint128_t v48;  // q1
    uint128_t v49;  // q2
    uint128_t v50;  // q3
    unsigned long v51;  // x11
    unsigned long v52;  // x12
    void* v53;  // x11
    st_bd7acc_0 *v54;  // x11
    uint128_t v55;  // q0
    uint128_t v56;  // q1
    unsigned long long v12;  // x3
    uint128_t v57;  // q0
    unsigned long long v58;  // 4151
    char *v59;  // x8
    unsigned long long k;  // x9
    void* v61;  // x10
    unsigned long long v62;  // x9
    uint128_t v63;  // q1
    uint128_t v64;  // q0
    unsigned long long v66;  // x8
    void* v13;  // x1
    unsigned long long v67;  // x9
    unsigned long long v68;  // x11
    unsigned long long v69;  // x15
    void* v70;  // x15
    void* v71;  // x14
    void* v72;  // x13
    unsigned long long v73;  // 4135
    unsigned long long v74;  // x0
    void* v75;  // x0
    unsigned long v76;  // x1
    void* v14;  // x2
    unsigned long v77;  // x2
    void* v78;  // x3
    unsigned long v79;  // cc_dep1
    unsigned long v80;  // cc_dep2
    void* v81;  // x16
    unsigned long long v82;  // 4105
    unsigned long long v83;  // 4105
    void* v84;  // x14
    unsigned long long v85;  // 4105
    unsigned long long v86;  // 4105
    unsigned long v15;  // x9
    unsigned long v87;  // cc_dep1
    unsigned long v88;  // cc_dep2
    void* v89;  // x15
    unsigned long v90;  // x17
    unsigned long v91;  // x1
    unsigned long long v92;  // 4113
    unsigned long long v93;  // 4113
    unsigned long v94;  // cc_dep1
    unsigned long v95;  // cc_dep2
    uint128_t v96;  // q0
    unsigned long v16;  // x8
    uint128_t v97;  // q1
    void* v98;  // x17
    unsigned long long v99;  // 4105
    unsigned long long v100;  // 4105
    uint128_t v101;  // q0
    uint128_t v102;  // q0
    uint128_t v103;  // q1
    void* v104;  // x15
    uint128_t v105;  // q3
    uint128_t v106;  // q0
    uint128_t v0;  // [bp-0xb0]
    uint128_t v1;  // [bp-0xa0]
    uint128_t v2;  // [bp-0x90]
    uint128_t v3;  // [bp-0x80]
    void* v4;  // [bp-0x70]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    i = a1;
    iter = dst;
    if (33 <= a1)
    {
        v9 = a5;
        v10 = a4;
        do
        {
            v11 = i;
            while (1)
            {
                if (!(unsigned int)v10)
                    return sub_bd749c(iter, v11, ptr, a3, 1);
                v12 = v11 >> 3;
                v13 = iter + 288 * v12;
                v14 = iter + 504 * v12;
                if (64 > v11)
                {
                    v15 = *(long long *)iter;
                    v16 = *(long long *)v13;
                    v17 = iter;
                    if (!(v16 > v15 ^ (unsigned long long)*(long long *)v14 > v15))
                    {
                        if (v16 > v15 ^ (unsigned long long)*(long long *)v14 > v16)
                            v17 = v14;
                        else
                            v17 = v13;
                    }
                }
                else
                {
                    v17 = sub_bd83e4(iter);
                }
                v10 = (unsigned int)v10 - 1;
                j = 10248191152060862009 * (v17 - iter >> 3);
                v2 = (int128_t)v17[32];
                v3 = (int128_t)v17[48];
                v4 = (long long)v17[64];
                v0 = *(int128_t *)v17;
                v1 = (int128_t)v17[16];
                if (v9 && (unsigned long long)*(long long *)v17 <= (unsigned long long)*(long long *)v9)
                    break;
                if (a3 < v11)
                    __debugbreak();
                i = 0;
                iter1 = ptr + 72 * v11;
                iter2 = iter;
                l = j;
                v22 = iter + 72 * j;
                if (v22 <= iter)
                    goto LABEL_bd7e70;
                do
                {
                    iter1 -= 72;
                    v23 = iter1 + 72 * i;
                    v24 = (int128_t)iter2[48];
                    v23->field_20 = (int128_t)iter2[32];
                    v23->field_30 = v24;
                    v23->field_40 = (long long)iter2[64];
                    v25 = (int128_t)iter2[16];
                    v23->field_0 = *(int128_t *)iter2;
                    v23->field_10 = v25;
                    iter2 += 72;
                    l = v11;
                    v22 = iter + 72 * v11;
                    if (iter2 < v22)
                    {
                        do
                        {
                            v26 = *(long long *)iter2;
                            v27 = *(long long *)v17;
                            iter1 -= 72;
                            if ((unsigned long long)*(long long *)iter2 < (unsigned long long)*(long long *)v17)
                                v28 = ptr;
                            else
                                v28 = iter1;
                            v29 = v28 + 72 * i;
                            v30 = (int128_t)iter2[32];
                            v31 = (int128_t)iter2[48];
                            v29->field_40 = (long long)iter2[64];
                            v29->field_20 = v30;
                            v29->field_30 = v31;
                            v32 = (int128_t)iter2[16];
                            v29->field_0 = *(int128_t *)iter2;
                            v29->field_10 = v32;
                            v33 = arm64g_calculate_condition(36, v26, v27, 0);
                            if (!(v33 & 1))
                                i += 1;
                            iter2 += 72;
                        } while (iter2 < v22);
                    }
LABEL_bd7e70:
                } while (l != v11);
                _memcpy(iter, ptr, i * 72);
                v34 = v11 - i;
                if (v11 != i)
                {
                    v35 = iter + 72 * i;
                    v36 = ptr - 72 + 72 * v11;
                    m = v34;
                    do
                    {
                        v38 = m;
                        v39 = *(int128_t *)&v36[48];
                        *(int128_t *)&v35[32] = *(int128_t *)&v36[32];
                        *(uint128_t *)&v35[48] = v39;
                        *(long long *)&v35[64] = *(long long *)&v36[64];
                        v40 = *(int128_t *)&v36[16];
                        *(int128_t *)v35 = *(int128_t *)v36;
                        *(uint128_t *)&v35[16] = v40;
                        v35 += 72;
                        v36 -= 72;
                        m = v38 - 1;
                    } while (m);
                }
                if (!i)
                    break;
                if (v11 < i)
                {
                    sub_c73b38("mid > lencalled `Result::unwrap()` on an `Err` valueContents/Resources/DWARFinvalid timestampfailed to create dispatch semaphore for thread synchronizationRUST_BACKTRACEpermission deniedconnection refusednetwork unreachableconnection abortednot connectedaddress in useaddress not availablenetwork downbroken pipeentity already existsoperation would blocknot a directoryis a directorydirectory not emptyread-only filesystem or storage mediumfilesystem loop or indirection limit (e.g. symlink loop)stale network file handleinvalid input parameterinvalid datatimed outwrite zeroseek on unseekable filequota exceededfile too largeresource busyexecutable file busycross-device link or renametoo many linksargument list too longoperation interruptedunsupportedunexpected end of fileout of memoryin progressother erroruncategorized error.debug_abbrev.debug_addr.debug_aranges.debug_info.debug_line.debug_line_str.debug_loc.debug_loclists.debug_macinfo.debug_macro.debug_ranges.debug_rnglists.debug_str.debug_str_offsets.debug_types", 19, &g_efa3c0);
                    sub_c73e74();
                    __debugbreak();
                }
                dst = sub_bd7acc(iter + 72 * i, v34, ptr, a3, v10, &v0);
                v11 = i;
                goto LABEL_bd7b04;
            }
            if (a3 < v11)
                __debugbreak();
            v42 = 0;
            v43 = ptr + 72 * v11;
            node = iter;
            v45 = iter + 72 * j;
            if (v45 <= iter)
                goto LABEL_bd7f98;
            do
            {
                v43 -= 72;
                v46 = ptr + 72 * v42;
                v47 = *(int128_t *)node;
                v48 = (int128_t)node[16];
                v49 = (int128_t)node[32];
                v50 = (int128_t)node[48];
                *(long long *)&v46[64] = (long long)node[64];
                *(uint128_t *)&v46[32] = v49;
                *(uint128_t *)&v46[48] = v50;
                *(uint128_t *)v46 = v47;
                *(uint128_t *)&v46[16] = v48;
                v42 += 1;
                node += 72;
                j = v11;
                v45 = iter + 72 * v11;
                if (node < v45)
                {
                    do
                    {
                        v51 = *(long long *)v17;
                        v52 = *(long long *)node;
                        v43 -= 72;
                        if ((unsigned long long)*(long long *)node <= (unsigned long long)*(long long *)v17)
                            v53 = ptr;
                        else
                            v53 = v43;
                        v54 = v53 + 72 * v42;
                        v55 = (int128_t)node[32];
                        v56 = (int128_t)node[48];
                        v54->field_40 = (long long)node[64];
                        v54->field_20 = v55;
                        v54->field_30 = v56;
                        v57 = (int128_t)node[16];
                        v54->field_0 = *(int128_t *)node;
                        v54->field_10 = v57;
                        v58 = arm64g_calculate_condition(52, v51, v52, 0);
                        if (!(v58 & 1))
                            v42 += 1;
                        node += 72;
                    } while (node < v45);
                }
LABEL_bd7f98:
            } while (j != v11);
            dst = _memcpy(iter, ptr, v42 * 72);
            i = v11 - v42;
            if (v11 == v42)
                return dst;
            iter += 72 * v42;
            v59 = ptr - 72 + 72 * v11;
            k = i;
            v61 = iter;
            do
            {
                v62 = k;
                v63 = *(int128_t *)&v59[48];
                *(int128_t *)&v61[32] = *(int128_t *)&v59[32];
                *(uint128_t *)&v61[48] = v63;
                *(long long *)&v61[64] = *(long long *)&v59[64];
                v64 = *(int128_t *)&v59[16];
                *(int128_t *)v61 = *(int128_t *)v59;
                *(uint128_t *)&v61[16] = v64;
                v61 += 72;
                v59 -= 72;
                k = v62 - 1;
            } while (k);
            if (v11 < v42)
            {
                v235 = sub_c73bb0(v42, v11, v11, &g_efa3d8);
                _memcpy(iter, ptr, i * 72);
                __Unwind_Resume(v235);
            }
            v9 = 0;
        } while (33 <= i);
    }
LABEL_bd7b04:
    if (i < 2)
    {
        return dst;
    }
    else if (a3 >= i + 16)
    {
        v66 = i >> 1;
        v67 = v66 * 9;
        if (i > 7)
        {
            v68 = 144;
            if ((unsigned long long)(long long)iter[216] < (unsigned long long)(long long)iter[144])
                v69 = 216;
            else
                v69 = 144;
            v70 = iter + v69;
            v71 = iter + ((unsigned long long)*(long long *)iter > (unsigned long long)(long long)iter[72]) * 72;
            v72 = iter + ((unsigned long long)(long long)iter[72] >= (unsigned long long)*(long long *)iter) * 72;
            v73 = arm64g_calculate_condition(52, (long long)iter[216], (long long)iter[144], 0);
            if (v73 & 1)
                v74 = 144;
            else
                v74 = 216;
            v75 = iter + v74;
            v76 = *(long long *)v75;
            v77 = *(long long *)v72;
            if (v76 < v77)
                v78 = v70;
            else
                v78 = v72;
            v79 = *(long long *)v70;
            v80 = *(long long *)v71;
            if ((unsigned long long)*(long long *)v70 < (unsigned long long)*(long long *)v71)
            {
                v81 = v70;
                v82 = arm64g_calculate_condition(52, v79, v80, 0);
                if (!(v82 & 1))
                    goto LABEL_bd7b8e;
LABEL_bd7b8d:
                v84 = v71;
                v85 = arm64g_calculate_condition(52, v79, v80, 0);
                if (!(v85 & 1))
                    goto LABEL_bd7b92;
LABEL_bd7b91:
                v70 = v72;
            }
            else
            {
                v81 = v71;
                v83 = arm64g_calculate_condition(52, v79, v80, 0);
                if (v83 & 1)
                    goto LABEL_bd7b8d;
LABEL_bd7b8e:
                v84 = v78;
                v86 = arm64g_calculate_condition(52, v79, v80, 0);
                if (v86 & 1)
                    goto LABEL_bd7b91;
LABEL_bd7b92:
            }
            v87 = v76;
            v88 = v77;
            if (v76 < v77)
            {
                v89 = v75;
                v90 = *(long long *)v89;
                v91 = *(long long *)v84;
                v92 = arm64g_calculate_condition(52, v87, v88, 0);
                if (!(v92 & 1))
                    goto LABEL_bd7ba6;
LABEL_bd7ba5:
            }
            else
            {
                v89 = v70;
                v90 = *(long long *)v89;
                v91 = *(long long *)v84;
                v93 = arm64g_calculate_condition(52, v87, v88, 0);
                if (v93 & 1)
                    goto LABEL_bd7ba5;
LABEL_bd7ba6:
                v72 = v75;
            }
            v94 = v90;
            v95 = v91;
            v96 = (int128_t)v81[32];
            v97 = (int128_t)v81[48];
            if (v90 < v91)
            {
                v98 = v89;
                v99 = arm64g_calculate_condition(52, v94, v95, 0);
                if (!(v99 & 1))
                    goto LABEL_bd7bb6;
LABEL_bd7bb5:
            }
            else
            {
                v98 = v84;
                v100 = arm64g_calculate_condition(52, v94, v95, 0);
                if (v100 & 1)
                    goto LABEL_bd7bb5;
LABEL_bd7bb6:
                v84 = v89;
            }
            *(long long *)&ptr[64] = (long long)v81[64];
            *(uint128_t *)&ptr[32] = v96;
            *(uint128_t *)&ptr[48] = v97;
            v101 = (int128_t)v81[16];
            *(int128_t *)ptr = *(int128_t *)v81;
            *(uint128_t *)&ptr[16] = v101;
            v102 = (int128_t)v98[32];
            v103 = (int128_t)v98[48];
            v104 = (long long)v98[64];
            v105 = *(int128_t *)v98;
            *(int128_t *)&ptr[88] = (int128_t)v98[16];
            *(void* *)&ptr[0x88] = v104;
            *(uint128_t *)&ptr[120] = v103;
            *(uint128_t *)&ptr[104] = v102;
            *(uint128_t *)&ptr[72] = v105;
            v106 = *(int128_t *)v84;
            v107 = (int128_t)v84[16];
            v108 = (int128_t)v84[32];
            v109 = (int128_t)v84[48];
            *(long long *)&ptr[208] = (long long)v84[64];
            *(uint128_t *)&ptr[176] = v108;
            *(uint128_t *)&ptr[192] = v109;
            *(uint128_t *)&ptr[144] = v106;
            *(uint128_t *)&ptr[160] = v107;
            v110 = (int128_t)v72[16];
            *(int128_t *)&ptr[216] = *(int128_t *)v72;
            v111 = (int128_t)v72[32];
            v112 = (int128_t)v72[48];
            *(long long *)&ptr[280] = (long long)v72[64];
            *(uint128_t *)&ptr[264] = v112;
            *(uint128_t *)&ptr[248] = v111;
            *(uint128_t *)&ptr[232] = v110;
            v113 = v67 * 8;
            v114 = iter + v113;
            v115 = v114 + ((unsigned long long)*(long long *)v114 > (unsigned long long)(long long)v114[72]) * 72;
            v116 = v114 + ((unsigned long long)(long long)v114[72] >= (unsigned long long)*(long long *)v114) * 72;
            if ((unsigned long long)(long long)v114[216] < (unsigned long long)(long long)v114[144])
            {
                v117 = v114 + 216;
                v118 = arm64g_calculate_condition(52, (long long)v114[216], (long long)v114[144], 0);
                if (!(v118 & 1))
                    goto LABEL_bd7c62;
LABEL_bd7c61:
            }
            else
            {
                v117 = v114 + 144;
                v119 = arm64g_calculate_condition(52, (long long)v114[216], (long long)v114[144], 0);
                if (v119 & 1)
                    goto LABEL_bd7c61;
LABEL_bd7c62:
                v68 = 216;
            }
            v120 = v114 + v68;
            v121 = *(long long *)v120;
            v122 = *(long long *)v116;
            if (v121 < v122)
                v123 = v117;
            else
                v123 = v116;
            v124 = *(long long *)v117;
            v125 = *(long long *)v115;
            if ((unsigned long long)*(long long *)v117 < (unsigned long long)*(long long *)v115)
            {
                v126 = v117;
                v127 = arm64g_calculate_condition(52, v124, v125, 0);
                if (!(v127 & 1))
                    goto LABEL_bd7c8a;
LABEL_bd7c89:
                v129 = v115;
                v130 = arm64g_calculate_condition(52, v124, v125, 0);
                if (!(v130 & 1))
                    goto LABEL_bd7c8e;
LABEL_bd7c8d:
                v117 = v116;
            }
            else
            {
                v126 = v115;
                v128 = arm64g_calculate_condition(52, v124, v125, 0);
                if (v128 & 1)
                    goto LABEL_bd7c89;
LABEL_bd7c8a:
                v129 = v123;
                v131 = arm64g_calculate_condition(52, v124, v125, 0);
                if (v131 & 1)
                    goto LABEL_bd7c8d;
LABEL_bd7c8e:
            }
            v132 = v121;
            v133 = v122;
            v134 = ptr + v113;
            if (v121 < v122)
            {
                v135 = v116;
                v136 = arm64g_calculate_condition(52, v132, v133, 0);
                if (!(v136 & 1))
                    goto LABEL_bd7c9e;
LABEL_bd7c9d:
            }
            else
            {
                v135 = v120;
                v137 = arm64g_calculate_condition(52, v132, v133, 0);
                if (v137 & 1)
                    goto LABEL_bd7c9d;
LABEL_bd7c9e:
                v120 = v117;
            }
            if ((unsigned long long)*(long long *)v120 < (unsigned long long)*(long long *)v129)
            {
                v138 = v120;
                v139 = arm64g_calculate_condition(52, *(long long *)v120, *(long long *)v129, 0);
                if (!(v139 & 1))
                    goto LABEL_bd7cb2;
LABEL_bd7cb1:
                v120 = v129;
            }
            else
            {
                v138 = v129;
                v140 = arm64g_calculate_condition(52, *(long long *)v120, *(long long *)v129, 0);
                if (v140 & 1)
                    goto LABEL_bd7cb1;
LABEL_bd7cb2:
            }
            v141 = (int128_t)v126[32];
            v142 = (int128_t)v126[48];
            *(long long *)&v134[64] = (long long)v126[64];
            *(uint128_t *)&v134[32] = v141;
            *(uint128_t *)&v134[48] = v142;
            v143 = (int128_t)v126[16];
            *(int128_t *)v134 = *(int128_t *)v126;
            *(uint128_t *)&v134[16] = v143;
            v144 = (int128_t)v138[16];
            *(int128_t *)&v134[72] = *(int128_t *)v138;
            v145 = (int128_t)v138[32];
            v146 = (int128_t)v138[48];
            *(long long *)&v134[0x88] = (long long)v138[64];
            *(uint128_t *)&v134[120] = v146;
            *(uint128_t *)&v134[104] = v145;
            *(uint128_t *)&v134[88] = v144;
            v147 = *(int128_t *)v120;
            v148 = (int128_t)v120[16];
            v149 = (int128_t)v120[32];
            v150 = (int128_t)v120[48];
            *(long long *)&v134[208] = (long long)v120[64];
            *(uint128_t *)&v134[176] = v149;
            *(uint128_t *)&v134[192] = v150;
            *(uint128_t *)&v134[144] = v147;
            *(uint128_t *)&v134[160] = v148;
            v151 = (int128_t)v135[16];
            *(int128_t *)&v134[216] = *(int128_t *)v135;
            v152 = (int128_t)v135[32];
            v153 = (int128_t)v135[48];
            *(long long *)&v134[280] = (long long)v135[64];
            *(uint128_t *)&v134[264] = v153;
            *(uint128_t *)&v134[248] = v152;
            v154 = 4;
            *(uint128_t *)&v134[232] = v151;
            v155 = i - v66;
            if (4 < v66)
                goto LABEL_bd80b4;
        }
        else
        {
            v156 = *(int128_t *)iter;
            v157 = (int128_t)iter[16];
            v158 = (int128_t)iter[32];
            v159 = (int128_t)iter[48];
            *(long long *)&ptr[64] = (long long)iter[64];
            *(uint128_t *)&ptr[32] = v158;
            *(uint128_t *)&ptr[48] = v159;
            *(uint128_t *)ptr = v156;
            *(uint128_t *)&ptr[16] = v157;
            v160 = v67 * 8;
            v161 = iter + v160;
            v162 = ptr + v160;
            v163 = (int128_t)v161[32];
            v164 = (int128_t)v161[48];
            *(long long *)&v162[64] = (long long)v161[64];
            *(uint128_t *)&v162[32] = v163;
            *(uint128_t *)&v162[48] = v164;
            v165 = (int128_t)v161[16];
            v154 = 1;
            *(int128_t *)v162 = *(int128_t *)v161;
            *(uint128_t *)&v162[16] = v165;
            v155 = i - v66;
            if (v66 > 1)
            {
LABEL_bd80b4:
                v166 = v154 * 8 | v154 * 64;
                v167 = v154;
                do
                {
                    v168 = v167 * 72;
                    v169 = iter + v168;
                    v170 = ptr + v168;
                    v171 = *(int128_t *)v169;
                    v172 = (int128_t)v169[16];
                    v173 = (int128_t)v169[32];
                    v174 = (int128_t)v169[48];
                    *(long long *)&v170[64] = (long long)v169[64];
                    *(uint128_t *)&v170[32] = v173;
                    *(uint128_t *)&v170[48] = v174;
                    *(uint128_t *)v170 = v171;
                    *(uint128_t *)&v170[16] = v172;
                    v175 = *(long long *)v170;
                    if ((unsigned long long)*(long long *)((char *)v170 - 72) > v175)
                    {
                        v0 = (int128_t)v170[8];
                        v1 = (int128_t)v170[24];
                        v2 = (int128_t)v170[40];
                        v3 = (int128_t)v170[56];
                        v176 = v166;
                        do
                        {
                            v177 = ptr + v176;
                            v178 = *(int128_t *)((char *)v177 - 56);
                            v179 = *(int128_t *)((char *)v177 - 24);
                            *(int128_t *)&v177[32] = *(int128_t *)((char *)v177 - 40);
                            *(uint128_t *)&v177[48] = v179;
                            *(long long *)&v177[64] = *(long long *)((char *)v177 - 8);
                            *(int128_t *)v177 = *(int128_t *)((char *)v177 - 72);
                            *(uint128_t *)&v177[16] = v178;
                            v180 = v176 - 72;
                            if (v176 == 72)
                            {
                                v181 = ptr;
                                goto LABEL_bd80c8;
                            }
                        } while ((v176 = v180, v175 < (unsigned long long)*(long long *)((char *)v177 - 144)));
                        v181 = ptr + v180;
LABEL_bd80c8:
                        *(unsigned long *)v181 = v175;
                        *(uint128_t *)&v181[8] = v0;
                        *(uint128_t *)&v181[24] = v1;
                        *(uint128_t *)&v181[40] = v2;
                        *(uint128_t *)&v181[56] = v3;
                    }
                } while ((v167 += 1, v166 += 72, v167 != v66));
            }
        }
        v182 = v67 * 8;
        v183 = ptr + v182;
        if (v155 > v154)
        {
            v184 = v154 * 8 | v154 * 64;
            v185 = 72 - v184;
            v186 = ptr + v184 + 72 * v66;
            do
            {
                v187 = v154 * 72;
                v188 = iter + v182 + v187;
                v189 = v183 + v187;
                v190 = v188->field_0;
                v191 = v188->field_10;
                v192 = v188->field_20;
                v193 = v188->field_30;
                *(void* *)&v189[64] = v188->field_40;
                *(uint128_t *)&v189[32] = v192;
                *(uint128_t *)&v189[48] = v193;
                *(uint128_t *)v189 = v190;
                *(uint128_t *)&v189[16] = v191;
                v194 = *(long long *)v189;
                if ((unsigned long long)*(long long *)((char *)v189 - 72) > v194)
                {
                    v0 = (int128_t)v189[8];
                    v1 = (int128_t)v189[24];
                    v2 = (int128_t)v189[40];
                    v3 = (int128_t)v189[56];
                    v195 = v186;
                    v196 = v185;
                    do
                    {
                        v197 = v195;
                        v198 = *(int128_t *)((char *)v197 - 56);
                        v199 = *(int128_t *)((char *)v197 - 24);
                        *(int128_t *)&v197[32] = *(int128_t *)((char *)v197 - 40);
                        *(uint128_t *)&v197[48] = v199;
                        *(long long *)&v197[64] = *(long long *)((char *)v197 - 8);
                        *(int128_t *)v197 = *(int128_t *)((char *)v197 - 72);
                        *(uint128_t *)&v197[16] = v198;
                        if (!v196)
                        {
                            v195 = v183;
                            break;
                        }
                    } while ((v196 += 72, v195 = v197 - 72, v194 < (unsigned long long)*(long long *)((char *)v197 - 144)));
                    *(unsigned long *)v195 = v194;
                    *(uint128_t *)&v195[8] = v0;
                    *(uint128_t *)&v195[56] = v3;
                    *(uint128_t *)&v195[40] = v2;
                    *(uint128_t *)&v195[24] = v1;
                }
            } while ((v154 += 1, v185 -= 72, v186 += 72, v154 != v155));
        }
        v200 = 0xffffffffffffffb8 + 72 * i;
        v201 = ptr + v200;
        v202 = v183 - 72;
        v203 = iter;
        v204 = ptr;
        do
        {
            v205 = iter + v200;
            v206 = *(long long *)v183;
            v207 = *(long long *)v204;
            if (v206 < v207)
                v208 = v183;
            else
                v208 = v204;
            v209 = (int128_t)v208[32];
            v210 = (int128_t)v208[48];
            *(long long *)&v203[64] = (long long)v208[64];
            *(uint128_t *)&v203[32] = v209;
            *(uint128_t *)&v203[48] = v210;
            v211 = (int128_t)v208[16];
            *(int128_t *)v203 = *(int128_t *)v208;
            *(uint128_t *)&v203[16] = v211;
            v203 += 72;
            v204 += (v206 >= v207) * 72;
            v183 += (v207 > v206) * 72;
            v212 = *(long long *)v201;
            v213 = *(long long *)v202;
            if ((unsigned long long)*(long long *)v201 < (unsigned long long)*(long long *)v202)
                v214 = v202;
            else
                v214 = v201;
            v215 = (int128_t)v214[32];
            v216 = (int128_t)v214[48];
            v217 = (long long)v214[64];
            *(void* *)&v205[64] = v217;
            *(uint128_t *)&v205[32] = v215;
            *(uint128_t *)&v205[48] = v216;
            v218 = (int128_t)v214[16];
            *(int128_t *)v205 = *(int128_t *)v214;
            *(uint128_t *)&v205[16] = v218;
            v219 = arm64g_calculate_condition(52, v212, v213, 0);
            if (v219 & 1)
            {
                v220 = arm64g_calculate_condition(36, v212, v213, 0);
                if (!(v220 & 1))
                    goto LABEL_bd830e;
                goto LABEL_bd830d;
            }
            else
            {
                v201 += 0xffffffffffffffb8;
                v221 = arm64g_calculate_condition(36, v212, v213, 0);
                if (v221 & 1)
                {
LABEL_bd830d:
                    v222 = 0;
                    continue;
                }
                else
                {
LABEL_bd830e:
                    v222 = 0xffffffffffffffff;
                }
            }
        } while ((v202 += 72 * v222, v200 -= 72, v66 -= 1, v66));
        v223 = v202 + 72;
        v224 = v201 + 72;
        if (i & 1)
        {
            v212 = v204;
            v213 = v223;
            if (v204 < v223)
                v225 = v204;
            else
                v225 = v183;
            v226 = *(int128_t *)v225;
            v227 = (int128_t)v225[16];
            v228 = (int128_t)v225[32];
            v229 = (int128_t)v225[48];
            *(long long *)&v203[64] = (long long)v225[64];
            *(uint128_t *)&v203[32] = v228;
            *(uint128_t *)&v203[48] = v229;
            *(uint128_t *)v203 = v226;
            *(uint128_t *)&v203[16] = v227;
            v183 += (v204 >= v223) * 72;
            v204 += (v223 > v204) * 72;
        }
        if (v204 == v223)
        {
            v231 = arm64g_calculate_condition(4, v212, v213, 0);
            v232 = arm64g_calculate_condition(20, (v231 & 1 ? v183 : 0), (v231 & 1 ? v224 : 0), 0);
            if (!(v232 & 1))
                return v217;
            sub_c73e74();
            __debugbreak();
        }
        else
        {
            v233 = arm64g_calculate_condition(4, v212, v213, 0);
            v234 = arm64g_calculate_condition(16, (v233 & 1 ? v183 : 0), (v233 & 1 ? v224 : 0), 0);
            if (!(v234 & 1))
                return v217;
            sub_c73e74();
            __debugbreak();
        }
    }
    else
    {
        __debugbreak();
    }
}
