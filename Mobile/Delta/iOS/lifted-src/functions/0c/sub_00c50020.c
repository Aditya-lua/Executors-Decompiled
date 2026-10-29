/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc50020..0xc5070c (1772 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_efd048;
extern long long g_efd060;

void* sub_c50020(void* dst, unsigned int a1, void* ptr, unsigned int a3, unsigned long long a4, unsigned int a5)
{
    unsigned int i;  // x21
    void* iter;  // x20
    unsigned long v14;  // x8
    unsigned long long k;  // x9
    void* iter1;  // x10
    unsigned int v106;  // x9
    uint128_t v107;  // q1
    unsigned int j;  // x24
    unsigned long long v111;  // x8
    void* v112;  // x23
    void* iter2;  // x22
    unsigned long v15;  // x9
    unsigned int v114;  // x8
    unsigned int v115;  // x9
    uint128_t v116;  // q1
    uint128_t v117;  // q1
    unsigned long long v118;  // x10
    unsigned int v119;  // x11
    unsigned long long v120;  // x12
    void* v121;  // x13
    void* v122;  // x17
    uint128_t v123;  // q1
    unsigned long v16;  // cc_dep1
    void* v124;  // x16
    unsigned long v125;  // x12
    unsigned long v126;  // x13
    unsigned long v127;  // cc_dep1
    unsigned long v128;  // cc_dep2
    unsigned long long v129;  // 4114
    unsigned long long v130;  // 4110
    unsigned long long v131;  // 4102
    unsigned long long v132;  // 4110
    unsigned long long v133;  // 4102
    unsigned long v17;  // cc_dep2
    unsigned long v134;  // x15
    unsigned long v135;  // x14
    uint128_t v136;  // q1
    void* v137;  // x16
    void* v138;  // x17
    unsigned long v139;  // cc_dep1
    unsigned long v140;  // cc_dep2
    unsigned long long v141;  // 4114
    unsigned long long v142;  // 4110
    unsigned long long v143;  // 4102
    unsigned long v18;  // x10
    unsigned long long v144;  // 4110
    unsigned long long v145;  // 4102
    uint128_t v146;  // q1
    void* v147;  // x10
    void* v148;  // x11
    void* v149;  // x12
    unsigned long long v150;  // x13
    void* v151;  // x14
    uint128_t v152;  // q1
    void* v153;  // x17
    unsigned long v19;  // x12
    unsigned long v154;  // x13
    unsigned long v155;  // x14
    unsigned long v156;  // cc_dep1
    unsigned long v157;  // cc_dep2
    unsigned long long v158;  // 4114
    unsigned long long v159;  // 4110
    unsigned long long v160;  // 4102
    unsigned long long v161;  // 4110
    unsigned long long v162;  // 4102
    unsigned long v163;  // x16
    unsigned long v20;  // cc_dep1
    unsigned long v164;  // x15
    uint128_t v165;  // q1
    void* v166;  // x17
    void* v167;  // x2
    void* v168;  // x1
    unsigned long v169;  // cc_dep1
    unsigned long v170;  // cc_dep2
    unsigned long long v171;  // 4114
    unsigned long long v172;  // 4110
    unsigned long long v173;  // 4102
    unsigned long v21;  // cc_dep2
    unsigned long long v174;  // 4110
    unsigned long long v175;  // 4102
    uint128_t v176;  // q1
    unsigned long long v177;  // x11
    void* v178;  // x8
    void* v179;  // x12
    void* node;  // x10
    void* v181;  // x9
    unsigned int v182;  // x13
    uint128_t v183;  // q1
    unsigned long long v22;  // 4110
    unsigned long v184;  // cc_dep1
    unsigned long v185;  // cc_dep2
    unsigned long long v186;  // 4151
    unsigned int v187;  // w15
    unsigned int v188;  // w13
    void* v189;  // x14
    uint128_t v190;  // q1
    unsigned long long v191;  // 4151
    unsigned int v192;  // w16
    unsigned int v193;  // w14
    unsigned long long v23;  // 4110
    unsigned int v194;  // x14
    void* v195;  // x15
    void* v196;  // x16
    uint128_t v197;  // q1
    void* v198;  // x11
    void* v199;  // x14
    uint128_t v200;  // q1
    long long v202;  // x0
    unsigned int v6;  // x25
    void* v24;  // x26
    unsigned long long v25;  // 4106
    unsigned long long v26;  // 4110
    unsigned long long v27;  // 4106
    unsigned long long v28;  // 4110
    unsigned long v29;  // 4110
    unsigned long v30;  // cc_op
    unsigned long v31;  // cc_dep1
    unsigned long v32;  // cc_dep2
    unsigned long v33;  // 4110
    unsigned long long n;  // x23
    unsigned long long v34;  // 4126
    unsigned int v35;  // x11
    unsigned long v36;  // cc_dep1
    unsigned long v37;  // cc_dep2
    unsigned long long v38;  // 4110
    unsigned long v39;  // 4110
    unsigned long v40;  // cc_op
    unsigned long v41;  // cc_dep1
    unsigned long v42;  // cc_dep2
    unsigned long v43;  // 4110
    unsigned int v8;  // x24
    unsigned long long v44;  // 4130
    unsigned long v45;  // cc_dep1
    unsigned long v46;  // cc_dep2
    unsigned int v47;  // w8
    unsigned long long v48;  // 4110
    unsigned long long v49;  // 4110
    unsigned long long v50;  // 4105
    unsigned long long v51;  // 4110
    unsigned long long v52;  // 4105
    unsigned int v53;  // x28
    unsigned long long v9;  // x3
    void* v54;  // x27
    unsigned long v55;  // x8
    unsigned long v56;  // x9
    unsigned long v57;  // cc_dep1
    unsigned long v58;  // cc_dep2
    unsigned long long v59;  // 4110
    unsigned long long v60;  // 4102
    unsigned long long v61;  // 4110
    unsigned long long v62;  // 4102
    void* v63;  // x8
    void* v10;  // x1
    void* v64;  // x9
    unsigned int v65;  // x10
    void* v66;  // x8
    unsigned long long v67;  // 4154
    unsigned int v68;  // w14
    unsigned int v69;  // w12
    unsigned int v70;  // x12
    void* v71;  // x13
    uint128_t *v72;  // x13
    uint128_t v73;  // q1
    void* v11;  // x2
    uint128_t v74;  // q1
    uint128_t *v75;  // x10
    void* v76;  // x0
    long long v77;  // x1
    char *v78;  // x8
    long long l;  // x9
    void* v80;  // x10
    unsigned int v81;  // x9
    uint128_t v82;  // q1
    unsigned long v12;  // x13
    unsigned int v85;  // x25
    void* v86;  // x8
    void* v87;  // x8
    unsigned long v88;  // cc_dep1
    unsigned long v89;  // cc_dep2
    unsigned long long v90;  // 4118
    unsigned long v91;  // 4110
    unsigned long v92;  // cc_op
    unsigned long v93;  // cc_dep1
    unsigned long v13;  // x14
    unsigned long v94;  // cc_dep2
    unsigned long v95;  // 4110
    unsigned long long v96;  // 4129
    unsigned int v97;  // x10
    void* v98;  // x11
    uint128_t *v99;  // x11
    uint128_t v100;  // q1
    uint128_t v101;  // q1
    void* v102;  // x9
    char *v103;  // x8
    uint128_t v0;  // [bp-0x80]
    uint128_t v1;  // [bp-0x70]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    i = a1;
    iter = dst;
    if (33 <= a1)
    {
        v6 = a5;
        n = a4;
        do
        {
            v8 = i;
            while (1)
            {
                if (!(unsigned int)n)
                    return sub_c4fa38(iter, v8, ptr, a3, 1);
                v9 = v8 >> 3;
                v10 = iter + v9 * 128;
                v11 = iter + 224 * v9;
                if (64 <= v8)
                {
                    v24 = sub_c5087c(iter);
                    goto LABEL_c5015c;
                }
                v12 = *(long long *)iter;
                v13 = (long long)iter[16];
                v14 = *(long long *)v10;
                v15 = (long long)v10[16];
                v16 = v13;
                v17 = v15;
                if (v15 > v13)
                {
                    v18 = *(long long *)v11;
                    v19 = (long long)v11[16];
                    v20 = v13;
                    v21 = v19;
                    if (v13 >= v19)
                    {
                        v22 = arm64g_calculate_condition(148, v20, v21, 0);
                        if (v22 & 1)
                        {
                            v23 = arm64g_calculate_condition(148, v20, v21, 0);
                            v24 = iter;
                            v25 = arm64g_calculate_condition(52, (v23 & 1 ? v12 : 0x20000000), (v23 & 1 ? v18 : 0), 0);
                            if (!(v25 & 1))
                                goto LABEL_c5015c;
                            goto LABEL_c50134;
                        }
                        else
                        {
                            v26 = arm64g_calculate_condition(148, v20, v21, 0);
                            v24 = iter;
                            v27 = arm64g_calculate_condition(48, (v26 & 1 ? v12 : 0x20000000), (v26 & 1 ? v18 : 0), 0);
                            if (!(v27 & 1))
                                goto LABEL_c5015c;
                            goto LABEL_c50134;
                        }
                    }
                }
                v28 = arm64g_calculate_condition(148, v16, v17, 0);
                if (v28 & 1)
                {
                    v29 = arm64g_calculate_condition(148, v16, v17, 0);
                    v30 = 4;
                    v31 = (v29 & 1 ? v12 : 0x20000000);
                    v32 = (v29 & 1 ? v14 : 0);
                }
                else
                {
                    v33 = arm64g_calculate_condition(148, v16, v17, 0);
                    v30 = 0;
                    v31 = (v33 & 1 ? v12 : 0x20000000);
                    v32 = (v33 & 1 ? v14 : 0);
                }
                v34 = arm64g_calculate_condition(v30 | 32, v31, v32, 0);
                v35 = !(v34 & 1);
                v18 = *(long long *)v11;
                v19 = (long long)v11[16];
                v36 = v13;
                v37 = v19;
                if (v19 > v13)
                {
                    v24 = iter;
                    if (!(v35 & 1))
                        goto LABEL_c5015c;
LABEL_c50134:
                    v35 = 1;
                    goto LABEL_c50138;
                }
                v38 = arm64g_calculate_condition(148, v36, v37, 0);
                if (v38 & 1)
                {
                    v39 = arm64g_calculate_condition(148, v36, v37, 0);
                    v40 = 4;
                    v41 = (v39 & 1 ? v12 : 0x20000000);
                    v42 = (v39 & 1 ? v18 : 0);
                }
                else
                {
                    v43 = arm64g_calculate_condition(148, v36, v37, 0);
                    v40 = 0;
                    v41 = (v43 & 1 ? v12 : 0x20000000);
                    v42 = (v43 & 1 ? v18 : 0);
                }
                v44 = arm64g_calculate_condition(v40 | 32, v41, v42, 0);
                v24 = iter;
                if (v35 != (unsigned int)!(v44 & 1))
                    goto LABEL_c5015c;
LABEL_c50138:
                v45 = v15;
                v46 = v19;
                if (v19 > v15)
                {
                    v47 = 1;
                }
                else
                {
                    v48 = arm64g_calculate_condition(148, v45, v46, 0);
                    if (v48 & 1)
                    {
                        v49 = arm64g_calculate_condition(148, v45, v46, 0);
                        v50 = arm64g_calculate_condition(36, (v49 & 1 ? v14 : 0x20000000), (v49 & 1 ? v18 : 0), 0);
                        v47 = !(v50 & 1);
                    }
                    else
                    {
                        v51 = arm64g_calculate_condition(148, v45, v46, 0);
                        v52 = arm64g_calculate_condition(32, (v51 & 1 ? v14 : 0x20000000), (v51 & 1 ? v18 : 0), 0);
                        v47 = !(v52 & 1);
                    }
                }
                if (v35 ^ v47)
                    v24 = v11;
                else
                    v24 = v10;
LABEL_c5015c:
                n = (unsigned int)n - 1;
                v53 = v24 - iter >> 5;
                v0 = *(int128_t *)v24;
                v1 = (int128_t)v24[16];
                v54 = ptr + v8 * 32;
                if (v6 && (v55 = *(long long *)(v6 + 16), v56 = (long long)v24[16], v57 = v55, v58 = v56, v55 >= v56))
                {
                    if (v55 <= v56)
                    {
                        v59 = arm64g_calculate_condition(148, v57, v58, 0);
                        v60 = arm64g_calculate_condition(36, (v59 & 1 ? *(long long *)v6 : 0x20000000), (v59 & 1 ? *(long long *)v24 : 0), 0);
                        if (v60 & 1)
                            break;
                    }
                    else
                    {
                        v61 = arm64g_calculate_condition(148, v57, v58, 0);
                        v62 = arm64g_calculate_condition(32, (v61 & 1 ? *(long long *)v6 : 0x20000000), (v61 & 1 ? *(long long *)v24 : 0), 0);
                        if (v62 & 1)
                            break;
                    }
                }
                if (a3 < v8)
                    __debugbreak();
                i = 0;
                v63 = iter;
                v64 = v54;
                v65 = v53;
                while (1)
                {
                    while (1)
                    {
                        v66 = v63;
                        if (iter + v65 * 32 <= v66)
                            break;
                        if ((unsigned long long)(long long)v24[16] <= (unsigned long long)(long long)v66[16])
                        {
                            v67 = arm64g_calculate_condition(132, (long long)v66[16], (long long)v24[16], 0);
                            v68 = !(v67 & 1);
                            v69 = (unsigned long long)*(long long *)v24 > (unsigned long long)*(long long *)v66;
                            v64 -= 32;
                            v70 = v68 & v69;
                            if (v68 & v69)
                                v71 = ptr;
                            else
                                v71 = v64;
                        }
                        else
                        {
                            v64 -= 32;
                            v70 = 1;
                            v71 = ptr;
                        }
LABEL_c501dc:
                        v72 = v71 + i * 32;
                        v73 = (int128_t)v66[16];
                        v63 = v66 + 32;
                        *v72 = *(int128_t *)v66;
                        v72[1] = v73;
                        i += v70;
                        goto LABEL_c501dc;
                    }
                    if (v65 == v8)
                        break;
                    v64 -= 32;
                    v74 = (int128_t)v66[16];
                    v63 = v66 + 32;
                    v75 = v64 + i * 32;
                    *v75 = *(int128_t *)v66;
                    v75[1] = v74;
                    v65 = v8;
                }
                _memcpy(iter, ptr, i * 32);
                v76 = iter + i * 32;
                v77 = v8 - i;
                if (v8 != i)
                {
                    v78 = ptr - 32 + v8 * 32;
                    l = v77;
                    v80 = v76;
                    do
                    {
                        v81 = l;
                        v82 = *(int128_t *)&v78[16];
                        *(int128_t *)v80 = *(int128_t *)v78;
                        *(uint128_t *)&v80[16] = v82;
                        v80 += 32;
                        v78 -= 32;
                        l = v81 - 1;
                    } while (l);
                }
                if (!i)
                    break;
                if (v8 < i)
                {
                    sub_c73b38("mid > lencalled `Result::unwrap()` on an `Err` valueContents/Resources/DWARFinvalid timestampfailed to create dispatch semaphore for thread synchronizationRUST_BACKTRACEpermission deniedconnection refusednetwork unreachableconnection abortednot connectedaddress in useaddress not availablenetwork downbroken pipeentity already existsoperation would blocknot a directoryis a directorydirectory not emptyread-only filesystem or storage mediumfilesystem loop or indirection limit (e.g. symlink loop)stale network file handleinvalid input parameterinvalid datatimed outwrite zeroseek on unseekable filequota exceededfile too largeresource busyexecutable file busycross-device link or renametoo many linksargument list too longoperation interruptedunsupportedunexpected end of fileout of memoryin progressother erroruncategorized error.debug_abbrev.debug_addr.debug_aranges.debug_info.debug_line.debug_line_str.debug_loc.debug_loclists.debug_macinfo.debug_macro.debug_ranges.debug_rnglists.debug_str.debug_str_offsets.debug_types", 19, &g_efd048);
                    sub_c73e74();
                    __debugbreak();
                }
                dst = sub_c50020(v76, v77, ptr, a3, n, &v0);
                v8 = i;
                if (33 > i)
                    goto LABEL_c50054;
            }
            if (a3 < v8)
                __debugbreak();
            v85 = 0;
            v86 = iter;
            while (1)
            {
                while (1)
                {
                    v87 = v86;
                    if (iter + v53 * 32 <= v87)
                        break;
                    v88 = (long long)v24[16];
                    v89 = (long long)v87[16];
                    if ((unsigned long long)(long long)v87[16] <= (unsigned long long)(long long)v24[16])
                    {
                        v90 = arm64g_calculate_condition(148, v88, v89, 0);
                        if (v90 & 1)
                        {
                            v91 = arm64g_calculate_condition(148, v88, v89, 0);
                            v92 = 4;
                            v93 = (v91 & 1 ? *(long long *)v24 : 0x20000000);
                            v94 = (v91 & 1 ? *(long long *)v87 : 0);
                        }
                        else
                        {
                            v95 = arm64g_calculate_condition(148, v88, v89, 0);
                            v92 = 0;
                            v93 = (v95 & 1 ? *(long long *)v24 : 0x20000000);
                            v94 = (v95 & 1 ? *(long long *)v87 : 0);
                        }
                        v96 = arm64g_calculate_condition(v92 | 48, v93, v94, 0);
                        v97 = !(v96 & 1);
                        v54 -= 32;
                        if (v97)
                            v98 = ptr;
                        else
                            v98 = v54;
                    }
                    else
                    {
                        v97 = 0;
                        v54 -= 32;
                        v98 = v54;
                    }
LABEL_c502ec:
                    v99 = v98 + v85 * 32;
                    v100 = (int128_t)v87[16];
                    v86 = v87 + 32;
                    *v99 = *(int128_t *)v87;
                    v99[1] = v100;
                    v85 += v97;
                    goto LABEL_c502ec;
                }
                if (v53 == v8)
                    break;
                v54 -= 32;
                v101 = (int128_t)v87[16];
                v86 = v87 + 32;
                v102 = ptr + v85 * 32;
                *(int128_t *)v102 = *(int128_t *)v87;
                *(uint128_t *)&v102[16] = v101;
                v85 += 1;
                v53 = v8;
            }
            dst = _memcpy(iter, ptr, v85 * 32);
            i = v8 - v85;
            if (v8 == v85)
                return dst;
            iter += v85 * 32;
            v103 = ptr - 32 + v8 * 32;
            k = i;
            iter1 = iter;
            do
            {
                v106 = k;
                v107 = *(int128_t *)&v103[16];
                *(int128_t *)iter1 = *(int128_t *)v103;
                *(uint128_t *)&iter1[16] = v107;
                iter1 += 32;
                v103 -= 32;
                k = v106 - 1;
            } while (k);
            if (v8 < v85)
            {
                v202 = sub_c73bb0(v85, v8, v8, &g_efd060);
                _memcpy(iter, ptr, n);
                __Unwind_Resume(v202);
            }
            v6 = 0;
        } while (33 <= i);
    }
LABEL_c50054:
    if (i < 2)
        return dst;
    j = i >> 1;
    v111 = j * 32;
    v112 = iter + v111;
    iter2 = ptr + v111;
    if (i >= 8)
    {
        sub_c5070c(iter, ptr);
        dst = sub_c5070c(v112, iter2);
        v114 = 4;
        v115 = i - j;
        if (4 < j)
            goto LABEL_c503d8;
    }
    else
    {
        v116 = (int128_t)iter[16];
        *(int128_t *)ptr = *(int128_t *)iter;
        *(uint128_t *)&ptr[16] = v116;
        v117 = (int128_t)v112[16];
        *(int128_t *)iter2 = *(int128_t *)v112;
        *(uint128_t *)&iter2[16] = v117;
        v114 = 1;
        v115 = i - j;
        if (j > 1)
        {
LABEL_c503d8:
            v118 = v114 * 32;
            v119 = v114;
            do
            {
                v120 = v119 * 32;
                v121 = iter + v120;
                v122 = ptr + v120;
                v123 = (int128_t)v121[16];
                *(int128_t *)v122 = *(int128_t *)v121;
                *(uint128_t *)&v122[16] = v123;
                v124 = v122 - 32;
                v125 = (long long)v122[16];
                v126 = *(long long *)v122;
                v127 = v125;
                v128 = *(long long *)((char *)v122 - 16);
                if (v125 >= (unsigned long long)*(long long *)((char *)v122 - 16))
                {
                    v129 = arm64g_calculate_condition(148, v127, v128, 0);
                    if (v129 & 1)
                    {
                        v130 = arm64g_calculate_condition(148, v127, v128, 0);
                        v131 = arm64g_calculate_condition(36, (v130 & 1 ? v126 : 0x20000000), (v130 & 1 ? *(long long *)v124 : 0), 0);
                        if (v131 & 1)
                            continue;
                    }
                    else
                    {
                        v132 = arm64g_calculate_condition(148, v127, v128, 0);
                        v133 = arm64g_calculate_condition(32, (v132 & 1 ? v126 : 0x20000000), (v132 & 1 ? *(long long *)v124 : 0), 0);
                        if (v133 & 1)
                            continue;
                    }
                }
                v134 = (long long)v122[8];
                v135 = (long long)v122[24];
                v136 = (int128_t)v124[16];
                *(int128_t *)v122 = *(int128_t *)v124;
                *(uint128_t *)&v122[16] = v136;
                if (v119 != 1)
                {
                    v137 = v118;
                    do
                    {
                        dst = ptr + v137;
                        v138 = dst - 64;
                        v139 = v125;
                        v140 = *(long long *)((char *)dst - 48);
                        if (v125 < (unsigned long long)*(long long *)((char *)dst - 48))
                            continue;
                        v141 = arm64g_calculate_condition(148, v139, v140, 0);
                        if (v141 & 1)
                        {
                            v142 = arm64g_calculate_condition(148, v139, v140, 0);
                            v143 = arm64g_calculate_condition(52, (v142 & 1 ? v126 : 0x20000000), (v142 & 1 ? *(long long *)v138 : 0), 0);
                            if (v143 & 1)
                                continue;
                            goto LABEL_c5048c;
                        }
                        else
                        {
                            v144 = arm64g_calculate_condition(148, v139, v140, 0);
                            v145 = arm64g_calculate_condition(48, (v144 & 1 ? v126 : 0x20000000), (v144 & 1 ? *(long long *)v138 : 0), 0);
                            if (!(v145 & 1))
                            {
LABEL_c5048c:
                                v124 = ptr + v137 - 32;
                                goto LABEL_c503e8;
                            }
                        }
                    } while ((v146 = (int128_t)v138[16], *(int128_t *)((char *)dst - 32) = *(int128_t *)v138, *(int128_t *)((char *)dst - 16) = (int128_t)v138[16], dst -= 32, v137 -= 32, v137 != 32));
                    v124 = ptr;
                }
LABEL_c503e8:
                *(unsigned long *)v124 = v126;
                *(unsigned long *)&v124[8] = v134;
                *(unsigned long *)&v124[16] = v125;
                *(unsigned long *)&v124[24] = v135;
            } while ((v119 += 1, v118 += 32, v119 != j));
        }
    }
    if (v115 > v114)
    {
        v147 = v114 * 32;
        v148 = 32;
        v149 = iter2;
        do
        {
            v150 = v114 * 32;
            v151 = v112 + v150;
            dst = iter2 + v150;
            v152 = (int128_t)v151[16];
            *(int128_t *)dst = *(int128_t *)v151;
            *(uint128_t *)&dst[16] = v152;
            v153 = dst - 32;
            v154 = (long long)dst[16];
            v155 = *(long long *)dst;
            v156 = v154;
            v157 = *(long long *)((char *)dst - 16);
            if (v154 >= (unsigned long long)*(long long *)((char *)dst - 16))
            {
                v158 = arm64g_calculate_condition(148, v156, v157, 0);
                if (v158 & 1)
                {
                    v159 = arm64g_calculate_condition(148, v156, v157, 0);
                    v160 = arm64g_calculate_condition(36, (v159 & 1 ? v155 : 0x20000000), (v159 & 1 ? *(long long *)v153 : 0), 0);
                    if (v160 & 1)
                        continue;
                }
                else
                {
                    v161 = arm64g_calculate_condition(148, v156, v157, 0);
                    v162 = arm64g_calculate_condition(32, (v161 & 1 ? v155 : 0x20000000), (v161 & 1 ? *(long long *)v153 : 0), 0);
                    if (v162 & 1)
                        continue;
                }
            }
            v163 = (long long)dst[8];
            v164 = (long long)dst[24];
            v165 = (int128_t)v153[16];
            *(int128_t *)dst = *(int128_t *)v153;
            *(uint128_t *)&dst[16] = v165;
            if (v114 != 1)
            {
                dst = v148;
                v166 = v149;
                do
                {
                    v167 = v166 + v147;
                    v168 = v167 - 64;
                    v169 = v154;
                    v170 = *(long long *)((char *)v167 - 48);
                    if (v154 < (unsigned long long)*(long long *)((char *)v167 - 48))
                        continue;
                    v171 = arm64g_calculate_condition(148, v169, v170, 0);
                    if (v171 & 1)
                    {
                        v172 = arm64g_calculate_condition(148, v169, v170, 0);
                        v173 = arm64g_calculate_condition(52, (v172 & 1 ? v155 : 0x20000000), (v172 & 1 ? *(long long *)v168 : 0), 0);
                        if (v173 & 1)
                            continue;
                        goto LABEL_c50564;
                    }
                    else
                    {
                        v174 = arm64g_calculate_condition(148, v169, v170, 0);
                        v175 = arm64g_calculate_condition(48, (v174 & 1 ? v155 : 0x20000000), (v174 & 1 ? *(long long *)v168 : 0), 0);
                        if (!(v175 & 1))
                        {
LABEL_c50564:
                            v153 = v166 + v147 - 32;
                            goto LABEL_c504b4;
                        }
                    }
                } while ((v176 = (int128_t)v168[16], *(int128_t *)((char *)v167 - 32) = *(int128_t *)v168, *(int128_t *)((char *)v167 - 16) = (int128_t)v168[16], v166 -= 32, dst += 32, v147 != dst));
                v153 = iter2;
            }
LABEL_c504b4:
            *(unsigned long *)v153 = v155;
            *(unsigned long *)&v153[8] = v163;
            *(unsigned long *)&v153[16] = v154;
            *(unsigned long *)&v153[24] = v164;
        } while ((v114 += 1, v149 += 32, v148 -= 32, v114 != v115));
    }
    v177 = i * 32 - 32;
    v178 = ptr + v177;
    v179 = iter2 - 32;
    node = iter;
    v181 = ptr;
    do
    {
        if ((unsigned long long)(long long)v181[16] > (unsigned long long)(long long)iter2[16])
        {
            v182 = 1;
            v183 = (int128_t)iter2[16];
            *(int128_t *)node = *(int128_t *)iter2;
            *(uint128_t *)&node[16] = v183;
            v184 = (long long)v178[16];
            v185 = (long long)v179[16];
            if ((unsigned long long)(long long)v179[16] > (unsigned long long)(long long)v178[16])
                goto LABEL_c50650;
            goto LABEL_c5058c;
        }
        else
        {
            v186 = arm64g_calculate_condition(132, (long long)iter2[16], (long long)v181[16], 0);
            v187 = !(v186 & 1);
            v188 = (unsigned long long)*(long long *)v181 > (unsigned long long)*(long long *)iter2;
            v182 = v187 & v188;
            if (v187 & v188)
                v189 = iter2;
            else
                v189 = v181;
            v190 = (int128_t)v189[16];
            *(int128_t *)node = *(int128_t *)v189;
            *(uint128_t *)&node[16] = v190;
            v184 = (long long)v178[16];
            v185 = (long long)v179[16];
            if ((unsigned long long)(long long)v179[16] <= (unsigned long long)(long long)v178[16])
            {
LABEL_c5058c:
                v191 = arm64g_calculate_condition(132, v184, v185, 0);
                v192 = !(v191 & 1);
                v193 = (unsigned long long)*(long long *)v179 > (unsigned long long)*(long long *)v178;
                v194 = v192 & v193;
                if (v192 & v193)
                    v195 = v179;
                else
                    v195 = v178;
            }
            else
            {
LABEL_c50650:
                v194 = 1;
                v195 = v179;
            }
        }
        v196 = iter + v177;
        iter2 += (v182 & 1) * 32;
        v181 += (~v182 & 1) * 32;
        node += 32;
        v197 = (int128_t)v195[16];
        *(int128_t *)v196 = *(int128_t *)v195;
        *(uint128_t *)&v196[16] = v197;
        v178 = v178 + (v194 & 1) * 32 - 32;
        v179 += ((long long)(v194 * 0x8000000000000000) >> 63 & 0xfffffffffffffffe | v194 & 1) * 32;
        v177 -= 32;
        j -= 1;
    } while (j);
    v198 = v179 + 32;
    if (i & 1)
    {
        if (v181 < v198)
            v199 = v181;
        else
            v199 = iter2;
        v200 = (int128_t)v199[16];
        *(int128_t *)node = *(int128_t *)v199;
        *(uint128_t *)&node[16] = v200;
        iter2 += (v181 >= v198) * 32;
        v181 += (v198 > v181) * 32;
    }
    if (v181 != v198)
    {
        sub_c73e74();
        __debugbreak();
    }
    if (iter2 == v178 + 32)
        return dst;
    sub_c73e74();
    __debugbreak();
}
