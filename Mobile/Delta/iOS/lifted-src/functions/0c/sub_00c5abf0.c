/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5abf0..0xc5b3e0 (2032 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c5abf0_0 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
} st_c5abf0_0;

typedef struct st_c5abf0_1 {
    uint128_t field_0;
    char field_10[24];
    unsigned long long field_18[2];
    char field_20;
} st_c5abf0_1;

extern long long g_efd048;
extern long long g_efd060;

void* sub_c5abf0(void* dst, unsigned long long a1, void* ptr, unsigned long long a3, unsigned long long a4, unsigned long long a5)
{
    unsigned long long i;  // x21
    void* iter;  // x20
    void* v15;  // x26
    unsigned long v105;  // cc_dep1
    unsigned long v106;  // cc_dep2
    void* v107;  // x12
    unsigned long long v108;  // 4105
    unsigned long long v109;  // 4105
    void* v110;  // x14
    unsigned long long v111;  // 4105
    unsigned long long v112;  // 4105
    unsigned long v113;  // cc_dep1
    unsigned long v114;  // cc_dep2
    unsigned long long j;  // x28
    void* v115;  // x13
    void* v116;  // x10
    unsigned long long v117;  // 4105
    unsigned long long v118;  // 4105
    void* v119;  // x15
    unsigned long long v120;  // 4105
    unsigned long long v121;  // 4105
    uint128_t v122;  // q0
    uint128_t v123;  // q1
    uint128_t v124;  // q0
    void* iter1;  // x8
    uint128_t v125;  // q1
    uint128_t v126;  // q0
    uint128_t v127;  // q1
    uint128_t v128;  // q0
    uint128_t v129;  // q1
    unsigned long long v130;  // x10
    unsigned long long v131;  // x11
    unsigned long long v132;  // x12
    uint128_t v133;  // q0
    uint128_t v134;  // q1
    void* iter2;  // x9
    unsigned long long v135;  // x10
    void* v136;  // x11
    void* v137;  // x10
    uint128_t v138;  // q0
    uint128_t v139;  // q1
    unsigned long long v140;  // x13
    unsigned long long v141;  // x14
    unsigned long long v142;  // x16
    void* v143;  // x15
    void* v144;  // x17
    unsigned long long m;  // x10
    uint128_t v145;  // q0
    uint128_t v146;  // q1
    void* l;  // x16
    unsigned long long v148;  // x1
    unsigned long long v149;  // x0
    void* v150;  // x17
    uint128_t v151;  // q1
    void* v152;  // x0
    unsigned long long v153;  // x13
    void* v154;  // x9
    void* v20;  // x11
    unsigned long long v155;  // x12
    unsigned long long v156;  // x14
    void* v157;  // x15
    unsigned long long v158;  // x17
    st_c5abf0_1 *v159;  // x16
    void* v160;  // x0
    uint128_t v161;  // q0
    uint128_t v162;  // q1
    void* v163;  // x17
    unsigned long long v164;  // x1
    st_c5abf0_0 *v21;  // x10
    void* v165;  // x3
    void* v166;  // x2
    void* v167;  // x0
    uint128_t v168;  // q1
    void* v169;  // x1
    unsigned long long v170;  // x14
    void* v171;  // x13
    void* v172;  // x15
    void* v173;  // x11
    void* v174;  // x10
    uint128_t v22;  // q1
    void* v175;  // x16
    void* v176;  // x17
    void* v177;  // x0
    void* v178;  // x1
    uint128_t v179;  // q0
    uint128_t v180;  // q1
    void* v181;  // x0
    unsigned long v182;  // cc_dep1
    unsigned long v183;  // cc_dep2
    void* v184;  // x17
    unsigned long v23;  // x12
    uint128_t v185;  // q0
    uint128_t v186;  // q1
    unsigned long long v187;  // 4128
    unsigned long long v188;  // 4109
    unsigned long long v189;  // 4109
    unsigned long long v190;  // x16
    void* v191;  // x8
    void* v192;  // x12
    void* v193;  // x15
    uint128_t v194;  // q0
    unsigned long v24;  // x13
    uint128_t v195;  // q1
    unsigned long long v197;  // 4110
    unsigned long long v198;  // 4102
    unsigned long long v199;  // 4110
    unsigned long long v200;  // 4102
    long long v201;  // x0
    unsigned long long v7;  // x25
    void* v25;  // x12
    st_c5abf0_0 *v26;  // x12
    uint128_t v27;  // q0
    uint128_t v28;  // q1
    unsigned long long v29;  // 4135
    unsigned long long v30;  // x1
    void* v31;  // x8
    char *v32;  // x10
    unsigned long long n;  // x9
    unsigned long long v34;  // x9
    unsigned long long v8;  // x23
    uint128_t v35;  // q1
    unsigned long long v37;  // x25
    void* v38;  // x8
    void* node;  // x9
    void* v40;  // x10
    void* v41;  // x10
    uint128_t v42;  // q0
    uint128_t v43;  // q1
    unsigned long v44;  // x11
    unsigned long long v9;  // x24
    unsigned long v45;  // x12
    void* v46;  // x11
    st_c5abf0_0 *v47;  // x11
    uint128_t v48;  // q0
    uint128_t v49;  // q1
    unsigned long long v50;  // 4135
    char *v51;  // x8
    unsigned long long k;  // x9
    void* v53;  // x10
    unsigned long long v54;  // x9
    unsigned long long v10;  // x3
    uint128_t v55;  // q1
    unsigned long long v57;  // x8
    unsigned long long v58;  // x9
    void* v59;  // x15
    void* v60;  // x16
    unsigned long long v61;  // x11
    void* v62;  // x13
    unsigned long long v63;  // 4109
    unsigned long long v64;  // 4109
    void* v11;  // x1
    unsigned long long v65;  // x14
    void* v66;  // x14
    unsigned long v67;  // x1
    unsigned long v68;  // x2
    void* v69;  // x3
    unsigned long v70;  // cc_dep1
    unsigned long v71;  // cc_dep2
    void* v72;  // x17
    unsigned long long v73;  // 4105
    unsigned long long v74;  // 4105
    void* v12;  // x2
    void* v75;  // x15
    unsigned long long v76;  // 4105
    unsigned long long v77;  // 4105
    unsigned long v78;  // cc_dep1
    unsigned long v79;  // cc_dep2
    void* v80;  // x16
    unsigned long long v81;  // 4105
    unsigned long long v82;  // 4105
    void* v83;  // x14
    unsigned long long v84;  // 4105
    unsigned int v13;  // w10
    unsigned long long v85;  // 4105
    uint128_t v86;  // q0
    uint128_t v87;  // q1
    uint128_t v88;  // q0
    uint128_t v89;  // q1
    uint128_t v90;  // q0
    uint128_t v91;  // q1
    uint128_t v92;  // q0
    uint128_t v93;  // q1
    unsigned long long v94;  // x13
    void* v14;  // x9
    void* v95;  // x14
    void* v96;  // x16
    void* v97;  // x10
    void* v98;  // x15
    unsigned long long v99;  // 4109
    unsigned long long v100;  // 4109
    void* v101;  // x11
    unsigned long v102;  // x17
    unsigned long v103;  // x0
    void* v104;  // x1
    uint128_t v0;  // [bp-0x90]
    uint128_t v1;  // [bp-0x80]
    unsigned long v2;  // [bp-0x70]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    i = a1;
    iter = dst;
    if (33 <= a1)
    {
        v7 = a5;
        v8 = a4;
        do
        {
            v9 = i;
            while (1)
            {
                if (!(unsigned int)v8)
                    return sub_c5a6c0(iter, v9, ptr, a3, 1);
                v10 = v9 >> 3;
                v11 = iter + 160 * v10;
                v12 = iter + 280 * v10;
                if (64 > v9)
                {
                    v13 = (unsigned long long)(long long)v11[16] > (unsigned long long)(long long)iter[16];
                    if (v13 ^ (unsigned long long)(long long)v12[16] > (unsigned long long)(long long)v11[16])
                        v14 = v12;
                    else
                        v14 = v11;
                    if (v13 ^ (unsigned long long)(long long)v12[16] > (unsigned long long)(long long)iter[16])
                        v15 = iter;
                    else
                        v15 = v14;
                }
                else
                {
                    v15 = sub_c5b3e0(iter);
                }
                v8 = (unsigned int)v8 - 1;
                j = 14757395258967641293 * (v15 - iter >> 3);
                v0 = *(int128_t *)v15;
                v1 = (int128_t)v15[16];
                v2 = (long long)v15[32];
                if (v7 && (unsigned long long)(long long)v15[16] <= (unsigned long long)*(long long *)(v7 + 16))
                    break;
                if (a3 < v9)
                    __debugbreak();
                i = 0;
                iter1 = ptr + 40 * v9;
                iter2 = iter;
                m = j;
                v20 = iter + 40 * j;
                if (v20 <= iter)
                    goto LABEL_c5af14;
                do
                {
                    iter1 -= 40;
                    v21 = iter1 + 40 * i;
                    v22 = (int128_t)iter2[16];
                    v21->field_0 = *(int128_t *)iter2;
                    v21->field_10 = v22;
                    v21->field_20 = (long long)iter2[32];
                    iter2 += 40;
                    m = v9;
                    v20 = iter + 40 * v9;
                    if (iter2 < v20)
                    {
                        do
                        {
                            v23 = (long long)iter2[16];
                            v24 = (long long)v15[16];
                            iter1 -= 40;
                            if ((unsigned long long)(long long)iter2[16] < (unsigned long long)(long long)v15[16])
                                v25 = ptr;
                            else
                                v25 = iter1;
                            v26 = v25 + 40 * i;
                            v27 = *(int128_t *)iter2;
                            v28 = (int128_t)iter2[16];
                            v26->field_20 = (long long)iter2[32];
                            v26->field_0 = v27;
                            v26->field_10 = v28;
                            v29 = arm64g_calculate_condition(36, v23, v24, 0);
                            if (!(v29 & 1))
                                i += 1;
                            iter2 += 40;
                        } while (iter2 < v20);
                    }
LABEL_c5af14:
                } while (m != v9);
                _memcpy(iter, ptr, i * 40);
                v30 = v9 - i;
                if (v9 != i)
                {
                    v31 = iter + 40 * i;
                    v32 = ptr - 40 + 40 * v9;
                    n = v30;
                    do
                    {
                        v34 = n;
                        v35 = *(int128_t *)&v32[16];
                        *(int128_t *)v31 = *(int128_t *)v32;
                        *(uint128_t *)&v31[16] = v35;
                        *(long long *)&v31[32] = *(long long *)&v32[32];
                        v31 += 40;
                        v32 -= 40;
                        n = v34 - 1;
                    } while (n);
                }
                if (!i)
                    break;
                if (v9 < i)
                {
                    sub_c73b38("mid > lencalled `Result::unwrap()` on an `Err` valueContents/Resources/DWARFinvalid timestampfailed to create dispatch semaphore for thread synchronizationRUST_BACKTRACEpermission deniedconnection refusednetwork unreachableconnection abortednot connectedaddress in useaddress not availablenetwork downbroken pipeentity already existsoperation would blocknot a directoryis a directorydirectory not emptyread-only filesystem or storage mediumfilesystem loop or indirection limit (e.g. symlink loop)stale network file handleinvalid input parameterinvalid datatimed outwrite zeroseek on unseekable filequota exceededfile too largeresource busyexecutable file busycross-device link or renametoo many linksargument list too longoperation interruptedunsupportedunexpected end of fileout of memoryin progressother erroruncategorized error.debug_abbrev.debug_addr.debug_aranges.debug_info.debug_line.debug_line_str.debug_loc.debug_loclists.debug_macinfo.debug_macro.debug_ranges.debug_rnglists.debug_str.debug_str_offsets.debug_types", 19, &g_efd048);
                    sub_c73e74();
                    __debugbreak();
                }
                dst = sub_c5abf0(iter + 40 * i, v30, ptr, a3, v8, &v0);
                v9 = i;
                goto LABEL_c5ac24;
            }
            if (a3 < v9)
                __debugbreak();
            v37 = 0;
            v38 = ptr + 40 * v9;
            node = iter;
            v40 = iter + 40 * j;
            if (v40 <= iter)
                goto LABEL_c5b024;
            do
            {
                v38 -= 40;
                v41 = ptr + 40 * v37;
                v42 = *(int128_t *)node;
                v43 = (int128_t)node[16];
                *(long long *)&v41[32] = (long long)node[32];
                *(uint128_t *)v41 = v42;
                *(uint128_t *)&v41[16] = v43;
                v37 += 1;
                node += 40;
                j = v9;
                v40 = iter + 40 * v9;
                if (node < v40)
                {
                    do
                    {
                        v44 = (long long)node[16];
                        v45 = (long long)v15[16];
                        v38 -= 40;
                        if ((unsigned long long)(long long)node[16] <= (unsigned long long)(long long)v15[16])
                            v46 = ptr;
                        else
                            v46 = v38;
                        v47 = v46 + 40 * v37;
                        v48 = *(int128_t *)node;
                        v49 = (int128_t)node[16];
                        v47->field_20 = (long long)node[32];
                        v47->field_0 = v48;
                        v47->field_10 = v49;
                        v50 = arm64g_calculate_condition(52, v45, v44, 0);
                        if (!(v50 & 1))
                            v37 += 1;
                        node += 40;
                    } while (node < v40);
                }
LABEL_c5b024:
            } while (j != v9);
            dst = _memcpy(iter, ptr, v37 * 40);
            i = v9 - v37;
            if (v9 == v37)
                return dst;
            iter += 40 * v37;
            v51 = ptr - 40 + 40 * v9;
            k = i;
            v53 = iter;
            do
            {
                v54 = k;
                v55 = *(int128_t *)&v51[16];
                *(int128_t *)v53 = *(int128_t *)v51;
                *(uint128_t *)&v53[16] = v55;
                *(long long *)&v53[32] = *(long long *)&v51[32];
                v53 += 40;
                v51 -= 40;
                k = v54 - 1;
            } while (k);
            if (v9 < v37)
            {
                v201 = sub_c73bb0(v37, v9, v9, &g_efd060);
                _memcpy(iter, ptr, i * 40);
                __Unwind_Resume(v201);
            }
            v7 = 0;
        } while (33 <= i);
    }
LABEL_c5ac24:
    if (i < 2)
        return dst;
    v57 = i >> 1;
    v58 = v57 * 5;
    if (i >= 8)
    {
        v59 = iter + ((unsigned long long)(long long)iter[16] > (unsigned long long)(long long)iter[56]) * 40;
        v60 = iter + ((unsigned long long)(long long)iter[56] >= (unsigned long long)(long long)iter[16]) * 40;
        v61 = 80;
        if ((unsigned long long)(long long)iter[0x88] < (unsigned long long)(long long)iter[96])
        {
            v62 = iter + 120;
            v63 = arm64g_calculate_condition(52, (long long)iter[0x88], (long long)iter[96], 0);
            if (!(v63 & 1))
                goto LABEL_c5ac7a;
LABEL_c5ac79:
            v65 = 80;
        }
        else
        {
            v62 = iter + 80;
            v64 = arm64g_calculate_condition(52, (long long)iter[0x88], (long long)iter[96], 0);
            if (v64 & 1)
                goto LABEL_c5ac79;
LABEL_c5ac7a:
            v65 = 120;
        }
        v66 = iter + v65;
        v67 = (long long)v66[16];
        v68 = (long long)v60[16];
        if (v67 < v68)
            v69 = v62;
        else
            v69 = v60;
        v70 = (long long)v62[16];
        v71 = (long long)v59[16];
        if ((unsigned long long)(long long)v62[16] < (unsigned long long)(long long)v59[16])
        {
            v72 = v62;
            v73 = arm64g_calculate_condition(52, v70, v71, 0);
            if (!(v73 & 1))
                goto LABEL_c5aca2;
LABEL_c5aca1:
            v75 = v59;
            v76 = arm64g_calculate_condition(52, v70, v71, 0);
            if (!(v76 & 1))
                goto LABEL_c5aca6;
LABEL_c5aca5:
            v62 = v60;
        }
        else
        {
            v72 = v59;
            v74 = arm64g_calculate_condition(52, v70, v71, 0);
            if (v74 & 1)
                goto LABEL_c5aca1;
LABEL_c5aca2:
            v75 = v69;
            v77 = arm64g_calculate_condition(52, v70, v71, 0);
            if (v77 & 1)
                goto LABEL_c5aca5;
LABEL_c5aca6:
        }
        v78 = v67;
        v79 = v68;
        if (v67 < v68)
        {
            v80 = v60;
            v81 = arm64g_calculate_condition(52, v78, v79, 0);
            if (!(v81 & 1))
                goto LABEL_c5acb2;
LABEL_c5acb1:
            v62 = v66;
        }
        else
        {
            v80 = v66;
            v82 = arm64g_calculate_condition(52, v78, v79, 0);
            if (v82 & 1)
                goto LABEL_c5acb1;
LABEL_c5acb2:
        }
        if ((unsigned long long)(long long)v62[16] < (unsigned long long)(long long)v75[16])
        {
            v83 = v62;
            v84 = arm64g_calculate_condition(52, (long long)v62[16], (long long)v75[16], 0);
            if (!(v84 & 1))
                goto LABEL_c5acc6;
LABEL_c5acc5:
            v62 = v75;
        }
        else
        {
            v83 = v75;
            v85 = arm64g_calculate_condition(52, (long long)v62[16], (long long)v75[16], 0);
            if (v85 & 1)
                goto LABEL_c5acc5;
LABEL_c5acc6:
        }
        v86 = *(int128_t *)v72;
        v87 = (int128_t)v72[16];
        *(long long *)&ptr[32] = (long long)v72[32];
        *(uint128_t *)ptr = v86;
        *(uint128_t *)&ptr[16] = v87;
        v88 = *(int128_t *)v83;
        v89 = (int128_t)v83[16];
        *(long long *)&ptr[72] = (long long)v83[32];
        *(uint128_t *)&ptr[56] = v89;
        *(uint128_t *)&ptr[40] = v88;
        v90 = *(int128_t *)v62;
        v91 = (int128_t)v62[16];
        *(long long *)&ptr[112] = (long long)v62[32];
        *(uint128_t *)&ptr[80] = v90;
        *(uint128_t *)&ptr[96] = v91;
        v92 = *(int128_t *)v80;
        v93 = (int128_t)v80[16];
        *(long long *)&ptr[152] = (long long)v80[32];
        *(uint128_t *)&ptr[0x88] = v93;
        *(uint128_t *)&ptr[120] = v92;
        v94 = v58 * 8;
        v95 = iter + v94;
        v96 = v95 + ((unsigned long long)(long long)v95[16] > (unsigned long long)(long long)v95[56]) * 40;
        v97 = v95 + ((unsigned long long)(long long)v95[56] >= (unsigned long long)(long long)v95[16]) * 40;
        if ((unsigned long long)(long long)v95[0x88] < (unsigned long long)(long long)v95[96])
        {
            v98 = v95 + 120;
            v99 = arm64g_calculate_condition(52, (long long)v95[0x88], (long long)v95[96], 0);
            if (!(v99 & 1))
                goto LABEL_c5ad4a;
LABEL_c5ad49:
        }
        else
        {
            v98 = v95 + 80;
            v100 = arm64g_calculate_condition(52, (long long)v95[0x88], (long long)v95[96], 0);
            if (v100 & 1)
                goto LABEL_c5ad49;
LABEL_c5ad4a:
            v61 = 120;
        }
        v101 = v95 + v61;
        v102 = (long long)v101[16];
        v103 = (long long)v97[16];
        if (v102 < v103)
            v104 = v98;
        else
            v104 = v97;
        v105 = (long long)v98[16];
        v106 = (long long)v96[16];
        if ((unsigned long long)(long long)v98[16] < (unsigned long long)(long long)v96[16])
        {
            v107 = v98;
            v108 = arm64g_calculate_condition(52, v105, v106, 0);
            if (!(v108 & 1))
                goto LABEL_c5ad72;
LABEL_c5ad71:
            v110 = v96;
            v111 = arm64g_calculate_condition(52, v105, v106, 0);
            if (!(v111 & 1))
                goto LABEL_c5ad76;
LABEL_c5ad75:
            v98 = v97;
        }
        else
        {
            v107 = v96;
            v109 = arm64g_calculate_condition(52, v105, v106, 0);
            if (v109 & 1)
                goto LABEL_c5ad71;
LABEL_c5ad72:
            v110 = v104;
            v112 = arm64g_calculate_condition(52, v105, v106, 0);
            if (v112 & 1)
                goto LABEL_c5ad75;
LABEL_c5ad76:
        }
        v113 = v102;
        v114 = v103;
        v115 = ptr + v94;
        if (v102 < v103)
        {
            v116 = v97;
            v117 = arm64g_calculate_condition(52, v113, v114, 0);
            if (!(v117 & 1))
                goto LABEL_c5ad86;
LABEL_c5ad85:
        }
        else
        {
            v116 = v101;
            v118 = arm64g_calculate_condition(52, v113, v114, 0);
            if (v118 & 1)
                goto LABEL_c5ad85;
LABEL_c5ad86:
            v101 = v98;
        }
        if ((unsigned long long)(long long)v101[16] < (unsigned long long)(long long)v110[16])
        {
            v119 = v101;
            v120 = arm64g_calculate_condition(52, (long long)v101[16], (long long)v110[16], 0);
            if (!(v120 & 1))
                goto LABEL_c5ad9a;
LABEL_c5ad99:
            v101 = v110;
        }
        else
        {
            v119 = v110;
            v121 = arm64g_calculate_condition(52, (long long)v101[16], (long long)v110[16], 0);
            if (v121 & 1)
                goto LABEL_c5ad99;
LABEL_c5ad9a:
        }
        v122 = *(int128_t *)v107;
        v123 = (int128_t)v107[16];
        *(long long *)&v115[32] = (long long)v107[32];
        *(uint128_t *)v115 = v122;
        *(uint128_t *)&v115[16] = v123;
        v124 = *(int128_t *)v119;
        v125 = (int128_t)v119[16];
        *(long long *)&v115[72] = (long long)v119[32];
        *(uint128_t *)&v115[56] = v125;
        *(uint128_t *)&v115[40] = v124;
        v126 = *(int128_t *)v101;
        v127 = (int128_t)v101[16];
        *(long long *)&v115[112] = (long long)v101[32];
        *(uint128_t *)&v115[80] = v126;
        *(uint128_t *)&v115[96] = v127;
        v128 = *(int128_t *)v116;
        v129 = (int128_t)v116[16];
        *(long long *)&v115[152] = (long long)v116[32];
        *(uint128_t *)&v115[0x88] = v129;
        *(uint128_t *)&v115[120] = v128;
        v130 = 4;
        v131 = i - v57;
        v132 = 20;
        if (4 < v57)
            goto LABEL_c5b124;
    }
    else
    {
        v133 = *(int128_t *)iter;
        v134 = (int128_t)iter[16];
        *(long long *)&ptr[32] = (long long)iter[32];
        *(uint128_t *)ptr = v133;
        *(uint128_t *)&ptr[16] = v134;
        v135 = v58 * 8;
        v136 = iter + v135;
        v137 = ptr + v135;
        v138 = *(int128_t *)v136;
        v139 = (int128_t)v136[16];
        *(long long *)&v137[32] = (long long)v136[32];
        *(uint128_t *)v137 = v138;
        *(uint128_t *)&v137[16] = v139;
        v130 = 1;
        v131 = i - v57;
        v132 = 5;
        if (v57 > 1)
        {
LABEL_c5b124:
            v140 = v132 * 8;
            v141 = v130;
            do
            {
                v142 = v141 * 40;
                v143 = iter + v142;
                v144 = ptr + v142;
                v145 = *(int128_t *)v143;
                v146 = (int128_t)v143[16];
                *(long long *)&v144[32] = (long long)v143[32];
                *(uint128_t *)v144 = v145;
                *(uint128_t *)&v144[16] = v146;
                l = (long long)v144[16];
                if ((unsigned long long)*(long long *)((char *)v144 - 24) > l)
                {
                    v148 = v140;
                    do
                    {
                        v149 = v148;
                        v150 = ptr + v148;
                        v151 = *(int128_t *)((char *)v150 - 24);
                        *(int128_t *)v150 = *(int128_t *)((char *)v150 - 40);
                        *(uint128_t *)&v150[16] = v151;
                        *(long long *)&v150[32] = *(long long *)((char *)v150 - 8);
                        v148 = v149 - 40;
                        if (v149 == 40)
                        {
                            v152 = ptr;
                            goto LABEL_c5b134;
                        }
                    } while (l < (unsigned long long)*(long long *)((char *)v150 - 64));
                    v150 = ptr + v149;
                    v152 = ptr + v148;
LABEL_c5b134:
                    *(int128_t *)v152 = *(int128_t *)v143;
                    *(void* *)((char *)v150 - 24) = l;
                    *(int128_t *)((char *)v150 - 16) = (int128_t)v143[24];
                }
            } while ((v141 += 1, v140 += 40, v141 != v57));
        }
    }
    v153 = v58 * 8;
    v154 = ptr + v153;
    if (v131 > v130)
    {
        v155 = v132 * 8;
        v156 = 40;
        v157 = v154;
        do
        {
            v158 = v130 * 40;
            v159 = iter + v153 + v158;
            v160 = v154 + v158;
            v161 = v159->field_0;
            v162 = *(int128_t *)&v159->field_10[0];
            *(long long *)&v160[32] = *(long long *)&v159->field_10[16];
            *(uint128_t *)v160 = v161;
            *(uint128_t *)&v160[16] = v162;
            v163 = (long long)v160[16];
            if ((unsigned long long)*(long long *)((char *)v160 - 24) > v163)
            {
                v164 = v156;
                v165 = v157;
                do
                {
                    v166 = v165;
                    v167 = v165 + v155;
                    v168 = *(int128_t *)((char *)v167 - 24);
                    *(int128_t *)v167 = *(int128_t *)((char *)v167 - 40);
                    *(uint128_t *)&v167[16] = v168;
                    *(long long *)&v167[32] = *(long long *)((char *)v167 - 8);
                    if (v155 == v164)
                    {
                        v169 = v154;
                        goto LABEL_c5b1f0;
                    }
                } while ((v165 = v166 - 40, v164 += 40, v163 < (unsigned long long)*(long long *)((char *)v167 - 64)));
                v167 = v166 + v155;
                v169 = v165 + v155;
LABEL_c5b1f0:
                *(uint128_t *)v169 = v159->field_0;
                *(void* *)((char *)v167 - 24) = v163;
                *(int128_t *)((char *)v167 - 16) = *(int128_t *)&v159->field_10[8];
            }
        } while ((v130 += 1, v157 += 40, v156 -= 40, v130 != v131));
    }
    v170 = 0xffffffffffffffd8 + 40 * i;
    v171 = ptr + v170;
    v172 = v154 - 40;
    v173 = iter;
    v174 = ptr;
    do
    {
        v175 = iter + v170;
        v176 = (long long)v154[16];
        v177 = (long long)v174[16];
        if (v176 < v177)
            v178 = v154;
        else
            v178 = v174;
        v179 = *(int128_t *)v178;
        v180 = (int128_t)v178[16];
        *(long long *)&v173[32] = (long long)v178[32];
        *(uint128_t *)v173 = v179;
        *(uint128_t *)&v173[16] = v180;
        v154 += (v177 > v176) * 40;
        v174 += (v176 >= v177) * 40;
        v173 += 40;
        v181 = (long long)v172[16];
        v182 = (long long)v171[16];
        v183 = v181;
        if ((unsigned long long)(long long)v171[16] < v181)
            v184 = v172;
        else
            v184 = v171;
        v185 = *(int128_t *)v184;
        v186 = (int128_t)v184[16];
        *(long long *)&v175[32] = (long long)v184[32];
        *(uint128_t *)v175 = v185;
        *(uint128_t *)&v175[16] = v186;
        v187 = arm64g_calculate_condition(52, v182, v183, 0);
        if (v187 & 1)
        {
            v188 = arm64g_calculate_condition(36, v182, v183, 0);
            if (!(v188 & 1))
                goto LABEL_c5b312;
            goto LABEL_c5b311;
        }
        else
        {
            v171 += 0xffffffffffffffd8;
            v189 = arm64g_calculate_condition(36, v182, v183, 0);
            if (v189 & 1)
            {
LABEL_c5b311:
                v190 = 0;
                continue;
            }
            else
            {
LABEL_c5b312:
                v190 = 0xffffffffffffffff;
            }
        }
    } while ((v172 += 40 * v190, v170 -= 40, v57 -= 1, v57));
    v191 = v172 + 40;
    v192 = v171 + 40;
    if (i & 1)
    {
        v182 = v174;
        v183 = v191;
        if (v174 < v191)
            v193 = v174;
        else
            v193 = v154;
        v194 = *(int128_t *)v193;
        v195 = (int128_t)v193[16];
        *(long long *)&v173[32] = (long long)v193[32];
        *(uint128_t *)v173 = v194;
        *(uint128_t *)&v173[16] = v195;
        v154 += (v174 >= v191) * 40;
        v174 += (v191 > v174) * 40;
    }
    if (v174 == v191)
    {
        v197 = arm64g_calculate_condition(4, v182, v183, 0);
        v198 = arm64g_calculate_condition(20, (v197 & 1 ? v154 : 0), (v197 & 1 ? v192 : 0), 0);
        if (!(v198 & 1))
            return v181;
        sub_c73e74();
        __debugbreak();
    }
    else
    {
        v199 = arm64g_calculate_condition(4, v182, v183, 0);
        v200 = arm64g_calculate_condition(16, (v199 & 1 ? v154 : 0), (v199 & 1 ? v192 : 0), 0);
        if (!(v200 & 1))
            return v181;
        sub_c73e74();
        __debugbreak();
    }
}
