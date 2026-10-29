/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc595ac..0xc59d90 (2020 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_efd048;
extern long long g_efd060;

unsigned long long sub_c595ac(unsigned long long dst, unsigned long long a1, void* ptr, unsigned long long n, unsigned long long a4, unsigned long long a5)
{
    unsigned long long iter;  // x21
    void* iter1;  // x20
    void* v13;  // x0
    void* v103;  // x13
    unsigned long v104;  // x16
    unsigned long v105;  // x17
    unsigned long v106;  // cc_dep1
    unsigned long v107;  // cc_dep2
    void* v108;  // x14
    unsigned long long v109;  // 4105
    unsigned long long v110;  // 4105
    void* v111;  // x9
    unsigned long long v112;  // 4105
    void* v14;  // x28
    unsigned long long v113;  // 4105
    unsigned long v114;  // cc_dep1
    unsigned long v115;  // cc_dep2
    void* v116;  // x8
    unsigned long long v117;  // 4105
    unsigned long long v118;  // 4105
    void* v119;  // x13
    unsigned long long v120;  // 4105
    unsigned long long v121;  // 4105
    uint128_t v122;  // q1
    unsigned long long j;  // x27
    uint128_t v123;  // q1
    void* v124;  // x8
    void* v125;  // x12
    void* v126;  // x9
    void* v127;  // x13
    unsigned long long v128;  // 4109
    unsigned long long v129;  // 4109
    void* v130;  // x8
    unsigned long v131;  // x14
    unsigned long v132;  // x15
    void* iter2;  // x26
    void* v133;  // x16
    unsigned long v134;  // cc_dep1
    unsigned long v135;  // cc_dep2
    void* v136;  // x10
    unsigned long long v137;  // 4105
    unsigned long long v138;  // 4105
    void* v139;  // x11
    unsigned long long v140;  // 4105
    unsigned long long v141;  // 4105
    void* v142;  // x12
    void* i0;  // x9
    unsigned long v143;  // cc_dep1
    unsigned long v144;  // cc_dep2
    void* v145;  // x13
    void* v146;  // x9
    unsigned long long v147;  // 4105
    unsigned long long v148;  // 4105
    void* v149;  // x12
    unsigned long long v150;  // 4105
    unsigned long long v151;  // 4105
    uint128_t v152;  // q1
    void* v18;  // x8
    uint128_t v153;  // q1
    unsigned long long v154;  // x8
    unsigned long long v155;  // x12
    unsigned long long v156;  // x13
    void* v157;  // x14
    unsigned long v158;  // x13
    unsigned long v159;  // x14
    unsigned long long v160;  // x15
    void* v161;  // x16
    unsigned long v162;  // x15
    unsigned long long l;  // x10
    void* v163;  // x15
    void* v164;  // x8
    unsigned long long v165;  // x13
    void* v166;  // x14
    unsigned long long v167;  // x15
    void* v168;  // x16
    unsigned long v169;  // x15
    unsigned long v170;  // x16
    void* v171;  // x17
    void* v172;  // x1
    unsigned long long v20;  // x11
    void* v173;  // x17
    unsigned long long v174;  // x12
    void* v175;  // x11
    void* v176;  // x13
    void* v177;  // x10
    void* v178;  // x9
    unsigned long v179;  // x14
    unsigned long v180;  // x15
    void* v181;  // x16
    unsigned long v182;  // cc_dep1
    void* v21;  // x11
    unsigned long v183;  // cc_dep2
    void* v184;  // x14
    unsigned long long v185;  // 4113
    unsigned long long v186;  // 4108
    unsigned long long v187;  // 4108
    unsigned long long v188;  // x14
    void* v189;  // x12
    void* v190;  // x11
    void* v191;  // x15
    void* v22;  // x11
    unsigned long long v193;  // 4110
    unsigned long long v194;  // 4102
    unsigned long long v195;  // 4110
    unsigned long long v196;  // 4102
    long long v197;  // x0
    unsigned long long v5;  // x25
    void* v23;  // x9
    unsigned long v24;  // x12
    unsigned long v25;  // x13
    void* v26;  // x12
    unsigned long long v27;  // 4112
    void* v28;  // x9
    unsigned long long v29;  // x11
    unsigned long v30;  // x12
    unsigned long v31;  // x13
    void* v32;  // x12
    unsigned long long v6;  // x23
    unsigned long long v33;  // 4116
    unsigned long long v34;  // x12
    unsigned long v35;  // x13
    unsigned long v36;  // x14
    void* v37;  // x13
    unsigned long long v38;  // 4116
    unsigned long v39;  // x13
    unsigned long v40;  // x14
    void* v41;  // x13
    unsigned long long v42;  // 4116
    unsigned long long v7;  // x24
    unsigned long v43;  // x13
    unsigned long v44;  // x14
    void* v45;  // x13
    unsigned long long v46;  // 4116
    void* v47;  // x0
    unsigned long long v48;  // x1
    uint128_t *v49;  // x8
    unsigned long long m;  // x9
    void* v51;  // x10
    unsigned long long v52;  // x9
    unsigned long long v8;  // x3
    unsigned long long v55;  // x25
    void* node;  // x8
    unsigned long long v57;  // x9
    void* v58;  // x9
    void* v59;  // x9
    void* v60;  // x8
    unsigned long v61;  // x10
    unsigned long v62;  // x11
    void* v9;  // x1
    void* v63;  // x10
    unsigned long long v64;  // 4112
    void* v65;  // x8
    unsigned long long v66;  // x9
    unsigned long v67;  // x10
    unsigned long v68;  // x11
    void* v69;  // x10
    unsigned long long v70;  // 4116
    unsigned long long v71;  // x10
    unsigned long v72;  // x11
    void* v10;  // x2
    unsigned long v73;  // x12
    void* v74;  // x11
    unsigned long long v75;  // 4116
    unsigned long v76;  // x11
    unsigned long v77;  // x12
    void* v78;  // x11
    unsigned long long v79;  // 4116
    unsigned long v80;  // x11
    unsigned long v81;  // x12
    void* v82;  // x11
    unsigned int v11;  // w10
    unsigned long long v83;  // 4116
    uint128_t *v84;  // x8
    unsigned long long k;  // x9
    void* v86;  // x10
    unsigned long long v87;  // x9
    unsigned long long v90;  // x23
    unsigned long long v91;  // x24
    void* v92;  // x22
    void* v12;  // x9
    unsigned long long v93;  // x9
    unsigned long long v94;  // x10
    unsigned long long v95;  // x11
    void* v96;  // x9
    void* v97;  // x8
    unsigned long long v98;  // x10
    void* v99;  // x12
    unsigned long long v100;  // 4109
    unsigned long long v101;  // 4109
    unsigned long long v102;  // x13
    uint128_t v0;  // [bp-0x70]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    iter = a1;
    iter1 = dst;
    if (33 <= a1)
    {
        v5 = a5;
        v6 = a4;
        do
        {
            v7 = iter;
            while (1)
            {
                if (!(unsigned int)v6)
                    return sub_c590e0(iter1, v7, ptr, n, 1);
                v8 = v7 >> 3;
                v9 = iter1 + v8 * 64;
                v10 = iter1 + 112 * v8;
                if (64 > v7)
                {
                    v11 = (unsigned long long)*(long long *)v9 > (unsigned long long)*(long long *)iter1;
                    if (v11 ^ (unsigned long long)*(long long *)v10 > (unsigned long long)*(long long *)v9)
                        v12 = v10;
                    else
                        v12 = v9;
                    if (v11 ^ (unsigned long long)*(long long *)v10 > (unsigned long long)*(long long *)iter1)
                        v13 = iter1;
                    else
                        v13 = v12;
                }
                else
                {
                    v13 = sub_c5a048(iter1);
                }
                v6 = (unsigned int)v6 - 1;
                v14 = v13 - iter1;
                j = v14 >> 4;
                v0 = *(int128_t *)v13;
                iter2 = ptr + v7 * 16;
                if (v5 && (unsigned long long)*(long long *)v13 <= (unsigned long long)*(long long *)v5)
                    break;
                if (n < v7)
                    __debugbreak();
                iter = 0;
                i0 = iter1;
                v18 = iter2;
                l = j;
                v20 = j - 3;
                if (j < 3)
                    v20 = 0;
                v21 = iter1 + v20 * 16;
                if (v21 <= iter1)
                    goto LABEL_c5978c;
                do
                {
                    v18 -= 16;
                    i0 = v28 + 16;
                    *(int128_t *)((char *)v18 + 16 * iter) = *(int128_t *)v28;
                    l = v7;
                    v29 = v7 - 3;
                    if (v7 < 3)
                        v29 = 0;
                    v21 = iter1 + v29 * 16;
                    if (i0 < v21)
                    {
                        do
                        {
                            v30 = *(long long *)i0;
                            v31 = *(long long *)(iter1 + v14);
                            if ((unsigned long long)*(long long *)i0 < (unsigned long long)*(long long *)(iter1 + v14))
                                v32 = ptr;
                            else
                                v32 = v18 - 16;
                            *(int128_t *)((char *)v32 + 16 * iter) = *(int128_t *)i0;
                            v33 = arm64g_calculate_condition(36, v30, v31, 0);
                            if (v33 & 1)
                                v34 = iter;
                            else
                                v34 = iter + 1;
                            v35 = (long long)i0[16];
                            v36 = *(long long *)(iter1 + v14);
                            if ((unsigned long long)(long long)i0[16] < (unsigned long long)*(long long *)(iter1 + v14))
                                v37 = ptr;
                            else
                                v37 = v18 - 32;
                            *(int128_t *)((char *)v37 + 16 * v34) = (int128_t)i0[16];
                            v38 = arm64g_calculate_condition(36, v35, v36, 0);
                            if (!(v38 & 1))
                                v34 += 1;
                            v39 = (long long)i0[32];
                            v40 = *(long long *)(iter1 + v14);
                            if ((unsigned long long)(long long)i0[32] < (unsigned long long)*(long long *)(iter1 + v14))
                                v41 = ptr;
                            else
                                v41 = v18 - 48;
                            *(int128_t *)((char *)v41 + 16 * v34) = (int128_t)i0[32];
                            v42 = arm64g_calculate_condition(36, v39, v40, 0);
                            if (!(v42 & 1))
                                v34 += 1;
                            v43 = (long long)i0[48];
                            v44 = *(long long *)(iter1 + v14);
                            v18 -= 64;
                            if ((unsigned long long)(long long)i0[48] < (unsigned long long)*(long long *)(iter1 + v14))
                                v45 = ptr;
                            else
                                v45 = v18;
                            *(int128_t *)((char *)v45 + 16 * v34) = (int128_t)i0[48];
                            v46 = arm64g_calculate_condition(36, v43, v44, 0);
                            if (v46 & 1)
                                iter = v34;
                            else
                                iter = v34 + 1;
                            i0 += 64;
                        } while (i0 < v21);
                    }
LABEL_c5978c:
                    v22 = iter1 + l * 16;
                    v23 = i0;
                    if (v22 > v23)
                    {
                        do
                        {
                            v24 = *(long long *)i0;
                            v23 = i0 + 16;
                            v25 = *(long long *)(iter1 + v14);
                            v18 -= 16;
                            if ((unsigned long long)*(long long *)i0 < (unsigned long long)*(long long *)(iter1 + v14))
                                v26 = ptr;
                            else
                                v26 = v18;
                            *(int128_t *)((char *)v26 + 16 * iter) = *(int128_t *)i0;
                            v27 = arm64g_calculate_condition(36, v24, v25, 0);
                            if (!(v27 & 1))
                                iter += 1;
                            i0 = v23;
                        } while (i0 < v22);
                    }
                    v28 = v23;
                } while (l != v7);
                _memcpy(iter1, ptr, iter * 16);
                v47 = iter1 + iter * 16;
                v48 = v7 - iter;
                if (v7 != iter)
                {
                    v49 = ptr - 16 + v7 * 16;
                    m = v48;
                    v51 = v47;
                    do
                    {
                        v52 = m;
                        *(uint128_t *)v51 = *v49;
                        v51 += 16;
                        m = v52 - 1;
                        v49 = (char *)v49 - 16;
                    } while (m);
                }
                if (!iter)
                    break;
                if (v7 < iter)
                {
                    sub_c73b38("mid > lencalled `Result::unwrap()` on an `Err` valueContents/Resources/DWARFinvalid timestampfailed to create dispatch semaphore for thread synchronizationRUST_BACKTRACEpermission deniedconnection refusednetwork unreachableconnection abortednot connectedaddress in useaddress not availablenetwork downbroken pipeentity already existsoperation would blocknot a directoryis a directorydirectory not emptyread-only filesystem or storage mediumfilesystem loop or indirection limit (e.g. symlink loop)stale network file handleinvalid input parameterinvalid datatimed outwrite zeroseek on unseekable filequota exceededfile too largeresource busyexecutable file busycross-device link or renametoo many linksargument list too longoperation interruptedunsupportedunexpected end of fileout of memoryin progressother erroruncategorized error.debug_abbrev.debug_addr.debug_aranges.debug_info.debug_line.debug_line_str.debug_loc.debug_loclists.debug_macinfo.debug_macro.debug_ranges.debug_rnglists.debug_str.debug_str_offsets.debug_types", 19, &g_efd048);
                    sub_c73e74();
                    __debugbreak();
                }
                dst = sub_c595ac(v47, v48, ptr, n, v6, &v0);
                v7 = iter;
                goto LABEL_c595e0;
            }
            if (n < v7)
                __debugbreak();
            v55 = 0;
            node = iter1;
            v57 = j - 3;
            if (j < 3)
                v57 = 0;
            v58 = iter1 + v57 * 16;
            if (v58 <= iter1)
                goto LABEL_c5990c;
            do
            {
                iter2 -= 16;
                node = v65 + 16;
                *(int128_t *)((char *)ptr + 16 * v55) = *(int128_t *)v65;
                v55 += 1;
                j = v7;
                v66 = v7 - 3;
                if (v7 < 3)
                    v66 = 0;
                v58 = iter1 + v66 * 16;
                if (node < v58)
                {
                    do
                    {
                        v67 = *(long long *)node;
                        v68 = *(long long *)(iter1 + v14);
                        if ((unsigned long long)*(long long *)node <= (unsigned long long)*(long long *)(iter1 + v14))
                            v69 = ptr;
                        else
                            v69 = iter2 - 16;
                        *(int128_t *)((char *)v69 + 16 * v55) = *(int128_t *)node;
                        v70 = arm64g_calculate_condition(52, v68, v67, 0);
                        if (v70 & 1)
                            v71 = v55;
                        else
                            v71 = v55 + 1;
                        v72 = (long long)node[16];
                        v73 = *(long long *)(iter1 + v14);
                        if ((unsigned long long)(long long)node[16] <= (unsigned long long)*(long long *)(iter1 + v14))
                            v74 = ptr;
                        else
                            v74 = iter2 - 32;
                        *(int128_t *)((char *)v74 + 16 * v71) = (int128_t)node[16];
                        v75 = arm64g_calculate_condition(52, v73, v72, 0);
                        if (!(v75 & 1))
                            v71 += 1;
                        v76 = (long long)node[32];
                        v77 = *(long long *)(iter1 + v14);
                        if ((unsigned long long)(long long)node[32] <= (unsigned long long)*(long long *)(iter1 + v14))
                            v78 = ptr;
                        else
                            v78 = iter2 - 48;
                        *(int128_t *)((char *)v78 + 16 * v71) = (int128_t)node[32];
                        v79 = arm64g_calculate_condition(52, v77, v76, 0);
                        if (!(v79 & 1))
                            v71 += 1;
                        v80 = (long long)node[48];
                        v81 = *(long long *)(iter1 + v14);
                        iter2 -= 64;
                        if ((unsigned long long)(long long)node[48] <= v81)
                            v82 = ptr;
                        else
                            v82 = iter2;
                        *(int128_t *)((char *)v82 + 16 * v71) = (int128_t)node[48];
                        v83 = arm64g_calculate_condition(52, v81, v80, 0);
                        if (v83 & 1)
                            v55 = v71;
                        else
                            v55 = v71 + 1;
                        node += 64;
                    } while (node < v58);
                }
LABEL_c5990c:
                v59 = iter1 + j * 16;
                v60 = node;
                if (v59 > v60)
                {
                    do
                    {
                        v61 = *(long long *)node;
                        v60 = node + 16;
                        v62 = *(long long *)(iter1 + v14);
                        iter2 -= 16;
                        if ((unsigned long long)*(long long *)node <= v62)
                            v63 = ptr;
                        else
                            v63 = iter2;
                        *(int128_t *)((char *)v63 + 16 * v55) = *(int128_t *)node;
                        v64 = arm64g_calculate_condition(52, v62, v61, 0);
                        if (!(v64 & 1))
                            v55 += 1;
                        node = v60;
                    } while (node < v59);
                }
                v65 = v60;
            } while (j != v7);
            dst = _memcpy(iter1, ptr, v55 * 16);
            iter = v7 - v55;
            if (v7 == v55)
                return dst;
            iter1 += v55 * 16;
            v84 = ptr - 16 + v7 * 16;
            k = iter;
            v86 = iter1;
            do
            {
                v87 = k;
                *(uint128_t *)v86 = *v84;
                v86 += 16;
                k = v87 - 1;
                v84 = (char *)v84 - 16;
            } while (k);
            if (v7 < v55)
            {
                v197 = sub_c73bb0(v55, v7, v7, &g_efd060);
                _memcpy(iter1, ptr, n);
                __Unwind_Resume(v197);
            }
            v5 = 0;
        } while (33 <= iter);
    }
LABEL_c595e0:
    if (iter < 2)
        return dst;
    v90 = iter >> 1;
    v91 = v90 * 16;
    if (iter > 15)
    {
        v92 = ptr + iter * 16;
        sub_c59d90(iter1, ptr, v92);
        dst = sub_c59d90(iter1 + v91, ptr + v91, v92 + 128);
        v93 = 8;
        v94 = iter - v90;
        v95 = 128;
        if (8 < v90)
            goto LABEL_c59b68;
    }
    else if (iter > 7)
    {
        v96 = iter1 + ((unsigned long long)*(long long *)iter1 > (unsigned long long)(long long)iter1[16]) * 16;
        v97 = iter1 + ((unsigned long long)(long long)iter1[16] >= (unsigned long long)*(long long *)iter1) * 16;
        v98 = 32;
        if ((unsigned long long)(long long)iter1[48] < (unsigned long long)(long long)iter1[32])
        {
            v99 = iter1 + 48;
            v100 = arm64g_calculate_condition(52, (long long)iter1[48], (long long)iter1[32], 0);
            if (!(v100 & 1))
                goto LABEL_c59a26;
LABEL_c59a25:
            v102 = 32;
        }
        else
        {
            v99 = iter1 + 32;
            v101 = arm64g_calculate_condition(52, (long long)iter1[48], (long long)iter1[32], 0);
            if (v101 & 1)
                goto LABEL_c59a25;
LABEL_c59a26:
            v102 = 48;
        }
        v103 = iter1 + v102;
        v104 = *(long long *)v103;
        v105 = *(long long *)v97;
        if (v104 < v105)
            dst = v99;
        else
            dst = v97;
        v106 = *(long long *)v99;
        v107 = *(long long *)v96;
        if ((unsigned long long)*(long long *)v99 < (unsigned long long)*(long long *)v96)
        {
            v108 = v99;
            v109 = arm64g_calculate_condition(52, v106, v107, 0);
            if (!(v109 & 1))
                goto LABEL_c59a4e;
LABEL_c59a4d:
            v111 = v96;
            v112 = arm64g_calculate_condition(52, v106, v107, 0);
            if (!(v112 & 1))
                goto LABEL_c59a52;
LABEL_c59a51:
            v99 = v97;
        }
        else
        {
            v108 = v96;
            v110 = arm64g_calculate_condition(52, v106, v107, 0);
            if (v110 & 1)
                goto LABEL_c59a4d;
LABEL_c59a4e:
            v111 = dst;
            v113 = arm64g_calculate_condition(52, v106, v107, 0);
            if (v113 & 1)
                goto LABEL_c59a51;
LABEL_c59a52:
        }
        v114 = v104;
        v115 = v105;
        if (v104 < v105)
        {
            v116 = v97;
            v117 = arm64g_calculate_condition(52, v114, v115, 0);
            if (!(v117 & 1))
                goto LABEL_c59a5e;
LABEL_c59a5d:
            v99 = v103;
        }
        else
        {
            v116 = v103;
            v118 = arm64g_calculate_condition(52, v114, v115, 0);
            if (v118 & 1)
                goto LABEL_c59a5d;
LABEL_c59a5e:
        }
        if ((unsigned long long)*(long long *)v99 < (unsigned long long)*(long long *)v111)
        {
            v119 = v99;
            v120 = arm64g_calculate_condition(52, *(long long *)v99, *(long long *)v111, 0);
            if (!(v120 & 1))
                goto LABEL_c59a72;
LABEL_c59a71:
        }
        else
        {
            v119 = v111;
            v121 = arm64g_calculate_condition(52, *(long long *)v99, *(long long *)v111, 0);
            if (v121 & 1)
                goto LABEL_c59a71;
LABEL_c59a72:
            v111 = v99;
        }
        v122 = *(int128_t *)v119;
        *(int128_t *)ptr = *(int128_t *)v108;
        *(uint128_t *)&ptr[16] = v122;
        v123 = *(int128_t *)v116;
        *(int128_t *)&ptr[32] = *(int128_t *)v111;
        *(uint128_t *)&ptr[48] = v123;
        v124 = iter1 + v91;
        v125 = v124 + ((unsigned long long)*(long long *)v124 > (unsigned long long)(long long)v124[16]) * 16;
        v126 = v124 + ((unsigned long long)(long long)v124[16] >= (unsigned long long)*(long long *)v124) * 16;
        if ((unsigned long long)(long long)v124[48] < (unsigned long long)(long long)v124[32])
        {
            v127 = v124 + 48;
            v128 = arm64g_calculate_condition(52, (long long)v124[48], (long long)v124[32], 0);
            if (!(v128 & 1))
                goto LABEL_c59ac2;
LABEL_c59ac1:
        }
        else
        {
            v127 = v124 + 32;
            v129 = arm64g_calculate_condition(52, (long long)v124[48], (long long)v124[32], 0);
            if (v129 & 1)
                goto LABEL_c59ac1;
LABEL_c59ac2:
            v98 = 48;
        }
        v130 = v124 + v98;
        v131 = *(long long *)v130;
        v132 = *(long long *)v126;
        if (v131 < v132)
            v133 = v127;
        else
            v133 = v126;
        v134 = *(long long *)v127;
        v135 = *(long long *)v125;
        if ((unsigned long long)*(long long *)v127 < (unsigned long long)*(long long *)v125)
        {
            v136 = v127;
            v137 = arm64g_calculate_condition(52, v134, v135, 0);
            if (!(v137 & 1))
                goto LABEL_c59aea;
LABEL_c59ae9:
            v139 = v125;
            v140 = arm64g_calculate_condition(52, v134, v135, 0);
            if (!(v140 & 1))
                goto LABEL_c59aee;
LABEL_c59aed:
            v142 = v126;
        }
        else
        {
            v136 = v125;
            v138 = arm64g_calculate_condition(52, v134, v135, 0);
            if (v138 & 1)
                goto LABEL_c59ae9;
LABEL_c59aea:
            v139 = v133;
            v141 = arm64g_calculate_condition(52, v134, v135, 0);
            if (v141 & 1)
                goto LABEL_c59aed;
LABEL_c59aee:
            v142 = v127;
        }
        v143 = v131;
        v144 = v132;
        v145 = ptr + v91;
        if (v131 < v132)
        {
            v146 = v126;
            v147 = arm64g_calculate_condition(52, v143, v144, 0);
            if (!(v147 & 1))
                goto LABEL_c59afe;
LABEL_c59afd:
        }
        else
        {
            v146 = v130;
            v148 = arm64g_calculate_condition(52, v143, v144, 0);
            if (v148 & 1)
                goto LABEL_c59afd;
LABEL_c59afe:
            v130 = v142;
        }
        if ((unsigned long long)*(long long *)v130 < (unsigned long long)*(long long *)v139)
        {
            v149 = v130;
            v150 = arm64g_calculate_condition(52, *(long long *)v130, *(long long *)v139, 0);
            if (!(v150 & 1))
                goto LABEL_c59b12;
LABEL_c59b11:
            v130 = v139;
        }
        else
        {
            v149 = v139;
            v151 = arm64g_calculate_condition(52, *(long long *)v130, *(long long *)v139, 0);
            if (v151 & 1)
                goto LABEL_c59b11;
LABEL_c59b12:
        }
        v152 = *(int128_t *)v149;
        *(int128_t *)v145 = *(int128_t *)v136;
        *(uint128_t *)&v145[16] = v152;
        v153 = *(int128_t *)v146;
        *(int128_t *)&v145[32] = *(int128_t *)v130;
        *(uint128_t *)&v145[48] = v153;
        v93 = 4;
        v94 = iter - v90;
        v95 = 64;
        if (4 < v90)
            goto LABEL_c59b68;
    }
    else
    {
        *(int128_t *)ptr = *(int128_t *)iter1;
        *(int128_t *)((char *)ptr + v91) = *(int128_t *)((char *)iter1 + v91);
        v93 = 1;
        v94 = iter - v90;
        v95 = 16;
        if (v90 > 1)
        {
LABEL_c59b68:
            v154 = v95;
            v155 = v93;
            do
            {
                v156 = v155 * 16;
                v157 = ptr + v156;
                *(int128_t *)v157 = *(int128_t *)((char *)iter1 + v156);
                v158 = *(long long *)v157;
                if ((unsigned long long)*(long long *)((char *)v157 - 16) > v158)
                {
                    v159 = (long long)v157[8];
                    v160 = v154;
                    do
                    {
                        v161 = ptr + v160;
                        *(int128_t *)v161 = *(int128_t *)((char *)v161 - 16);
                        v162 = v160 - 16;
                        if (v160 == 16)
                        {
                            v163 = ptr;
                            goto LABEL_c59b78;
                        }
                    } while ((v160 = v162, v158 < (unsigned long long)*(long long *)((char *)v161 - 32)));
                    v163 = ptr + v162;
LABEL_c59b78:
                    *(unsigned long *)v163 = v158;
                    *(unsigned long *)&v163[8] = v159;
                }
            } while ((v155 += 1, v154 += 16, v155 != v90));
        }
    }
    v164 = ptr + v91;
    if (v94 > v93)
    {
        v165 = 16;
        v166 = v164;
        do
        {
            v167 = v93 * 16;
            v168 = v164 + v167;
            *(int128_t *)v168 = *(int128_t *)((char *)iter1 + v91 + v167);
            v169 = *(long long *)v168;
            if ((unsigned long long)*(long long *)((char *)v168 - 16) > v169)
            {
                v170 = (long long)v168[8];
                dst = v165;
                v171 = v166;
                do
                {
                    v172 = v171 + v95;
                    *(int128_t *)v172 = *(int128_t *)((char *)v172 - 16);
                    if (v95 == dst)
                    {
                        v173 = v164;
                        goto LABEL_c59bfc;
                    }
                } while ((v171 -= 16, dst += 16, v169 < (unsigned long long)*(long long *)((char *)v172 - 32)));
                v173 = v171 + v95;
LABEL_c59bfc:
                *(unsigned long *)v173 = v169;
                *(unsigned long *)&v173[8] = v170;
            }
        } while ((v93 += 1, v166 += 16, v165 -= 16, v93 != v94));
    }
    v174 = iter * 16 - 16;
    v175 = ptr + v174;
    v176 = v164 - 16;
    v177 = iter1;
    v178 = ptr;
    do
    {
        v179 = *(long long *)v164;
        v180 = *(long long *)v178;
        if (v179 < v180)
            v181 = v164;
        else
            v181 = v178;
        *(int128_t *)v177 = *(int128_t *)v181;
        v177 += 16;
        v164 += (v180 > v179) * 16;
        v178 += (v179 >= v180) * 16;
        v182 = *(long long *)v175;
        v183 = *(long long *)v176;
        if ((unsigned long long)*(long long *)v175 < (unsigned long long)*(long long *)v176)
            v184 = v176;
        else
            v184 = v175;
        *(int128_t *)((char *)iter1 + v174) = *(int128_t *)v184;
        v185 = arm64g_calculate_condition(52, v182, v183, 0);
        if (v185 & 1)
        {
            v186 = arm64g_calculate_condition(36, v182, v183, 0);
            if (!(v186 & 1))
                goto LABEL_c59cd2;
            goto LABEL_c59cd1;
        }
        else
        {
            v175 += 0xfffffffffffffff0;
            v187 = arm64g_calculate_condition(36, v182, v183, 0);
            if (v187 & 1)
            {
LABEL_c59cd1:
                v188 = 0;
                continue;
            }
            else
            {
LABEL_c59cd2:
                v188 = 0xffffffffffffffff;
            }
        }
    } while ((v176 += v188 * 16, v174 -= 16, v90 -= 1, v90));
    v189 = v176 + 16;
    v190 = v175 + 16;
    if (iter & 1)
    {
        v182 = v178;
        v183 = v189;
        if (v178 < v189)
            v191 = v178;
        else
            v191 = v164;
        *(int128_t *)v177 = *(int128_t *)v191;
        v164 += (v178 >= v189) * 16;
        v178 += (v189 > v178) * 16;
    }
    if (v178 == v189)
    {
        v193 = arm64g_calculate_condition(4, v182, v183, 0);
        v194 = arm64g_calculate_condition(20, (v193 & 1 ? v164 : 0), (v193 & 1 ? v190 : 0), 0);
        if (!(v194 & 1))
            return dst;
        sub_c73e74();
        __debugbreak();
    }
    else
    {
        v195 = arm64g_calculate_condition(4, v182, v183, 0);
        v196 = arm64g_calculate_condition(16, (v195 & 1 ? v164 : 0), (v195 & 1 ? v190 : 0), 0);
        if (!(v196 & 1))
            return dst;
        sub_c73e74();
        __debugbreak();
    }
}
