/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc58964..0xc59014 (1712 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_efd048;
extern long long g_efd060;

void* sub_c58964(void* dst, unsigned long long a1, void* ptr, unsigned long long n, unsigned long long a4, unsigned long long a5)
{
    unsigned long long i;  // x21
    void* node;  // x20
    void* v14;  // x26
    unsigned long v104;  // cc_dep2
    void* v105;  // x12
    unsigned long long v106;  // 4105
    unsigned long long v107;  // 4105
    void* v108;  // x13
    unsigned long long v109;  // 4105
    unsigned long long v110;  // 4105
    void* v111;  // x14
    unsigned long v112;  // cc_dep1
    unsigned long v113;  // cc_dep2
    unsigned long long v15;  // x28
    void* v114;  // x15
    void* v115;  // x11
    unsigned long long v116;  // 4105
    unsigned long long v117;  // 4105
    void* v118;  // x14
    unsigned long long v119;  // 4105
    unsigned long long v120;  // 4105
    uint128_t v121;  // q1
    uint128_t v122;  // q1
    uint128_t v123;  // q1
    void* iter;  // x27
    uint128_t v124;  // q1
    unsigned long long v125;  // x11
    unsigned long long v126;  // x12
    unsigned long long v127;  // x13
    uint128_t v128;  // q1
    void* v129;  // x10
    void* v130;  // x11
    uint128_t v131;  // q1
    unsigned long long v132;  // x10
    unsigned long long iter1;  // x14
    void* m;  // x8
    unsigned long long v134;  // x16
    void* v135;  // x15
    void* v136;  // x17
    uint128_t v137;  // q0
    unsigned long v138;  // x16
    unsigned long v139;  // x17
    unsigned long long v140;  // x2
    unsigned long long v141;  // x2
    void* v142;  // x0
    uint128_t v143;  // q1
    void* iter2;  // x9
    unsigned long long v144;  // x2
    void* v145;  // x1
    void* v146;  // x10
    unsigned long long v147;  // x14
    void* v148;  // x15
    unsigned long long v149;  // x17
    uint128_t *v150;  // x16
    void* v151;  // x0
    uint128_t v152;  // q0
    unsigned long v153;  // x17
    unsigned long long v19;  // x10
    unsigned long v154;  // x0
    unsigned long long v155;  // x2
    void* v156;  // x4
    void* v157;  // x4
    void* v158;  // x1
    uint128_t v159;  // q1
    void* v160;  // x2
    unsigned long long v161;  // x13
    void* v162;  // x12
    void* v163;  // x14
    void* v20;  // x11
    void* v164;  // x11
    void* v165;  // x9
    void* v166;  // x15
    unsigned long v167;  // x16
    unsigned long v168;  // x17
    void* v169;  // x0
    uint128_t v170;  // q1
    unsigned long v171;  // cc_dep1
    unsigned long v172;  // cc_dep2
    void* v173;  // x16
    void* v21;  // x8
    uint128_t v174;  // q1
    unsigned long long v175;  // 4120
    unsigned long long v176;  // 4108
    unsigned long long v177;  // 4108
    unsigned long long v178;  // x15
    void* v179;  // x8
    void* v180;  // x12
    void* v181;  // x15
    uint128_t v182;  // q1
    void* v22;  // x8
    unsigned long long v184;  // 4110
    unsigned long long v185;  // 4102
    unsigned long long v186;  // 4110
    unsigned long long v187;  // 4102
    long long v188;  // x0
    uint128_t v23;  // q1
    unsigned long long v6;  // x25
    uint128_t *v24;  // x10
    unsigned long v25;  // x12
    unsigned long v26;  // x13
    void* v27;  // x12
    uint128_t *v28;  // x12
    uint128_t v29;  // q1
    unsigned long long v30;  // 4126
    void* v31;  // x0
    unsigned long long v32;  // x1
    char *v33;  // x8
    unsigned long long v7;  // x23
    unsigned long long k;  // x9
    void* v35;  // x10
    unsigned long long v36;  // x9
    uint128_t v37;  // q1
    unsigned long long v40;  // x25
    void* l;  // x8
    void* v42;  // x9
    void* v43;  // x8
    unsigned long long v8;  // x24
    void* v44;  // x8
    uint128_t v45;  // q1
    void* v46;  // x9
    unsigned long v47;  // x10
    unsigned long v48;  // x11
    void* v49;  // x10
    uint128_t *v50;  // x10
    uint128_t v51;  // q1
    unsigned long long v52;  // 4126
    char *v53;  // x8
    unsigned long long v9;  // x3
    unsigned long long j;  // x9
    void* v55;  // x10
    unsigned long long v56;  // x9
    uint128_t v57;  // q1
    unsigned long long v60;  // x8
    unsigned long long v61;  // x9
    void* v62;  // x11
    void* v63;  // x10
    void* v10;  // x1
    unsigned long long v64;  // x12
    void* v65;  // x14
    unsigned long long v66;  // 4109
    unsigned long long v67;  // 4109
    unsigned long long v68;  // x15
    void* v69;  // x15
    unsigned long v70;  // x0
    unsigned long v71;  // x1
    void* v72;  // x2
    unsigned long v73;  // cc_dep1
    void* v11;  // x2
    unsigned long v74;  // cc_dep2
    void* v75;  // x16
    unsigned long long v76;  // 4105
    unsigned long long v77;  // 4105
    void* v78;  // x11
    unsigned long long v79;  // 4105
    unsigned long long v80;  // 4105
    unsigned long v81;  // cc_dep1
    unsigned long v82;  // cc_dep2
    void* v83;  // x10
    unsigned int v12;  // w10
    unsigned long long v84;  // 4105
    unsigned long long v85;  // 4105
    void* v86;  // x15
    unsigned long long v87;  // 4105
    unsigned long long v88;  // 4105
    uint128_t v89;  // q1
    uint128_t v90;  // q1
    uint128_t v91;  // q1
    uint128_t v92;  // q1
    void* v93;  // x10
    void* v13;  // x9
    void* v94;  // x14
    void* v95;  // x11
    void* v96;  // x15
    unsigned long long v97;  // 4109
    unsigned long long v98;  // 4109
    void* v99;  // x10
    unsigned long v100;  // x16
    unsigned long v101;  // x17
    void* v102;  // x0
    unsigned long v103;  // cc_dep1
    uint128_t v0;  // [bp-0x80]
    uint128_t v1;  // [bp-0x70]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    i = a1;
    node = dst;
    if (33 <= a1)
    {
        v6 = a5;
        v7 = a4;
        do
        {
            v8 = i;
            while (1)
            {
                if (!(unsigned int)v7)
                    return sub_c58480(node, v8, ptr, n, 1);
                v9 = v8 >> 3;
                v10 = node + v9 * 128;
                v11 = node + 224 * v9;
                if (64 > v8)
                {
                    v12 = (unsigned long long)(long long)v10[8] > (unsigned long long)(long long)node[8];
                    if (v12 ^ (unsigned long long)(long long)v11[8] > (unsigned long long)(long long)v10[8])
                        v13 = v11;
                    else
                        v13 = v10;
                    if (v12 ^ (unsigned long long)(long long)v11[8] > (unsigned long long)(long long)node[8])
                        v14 = node;
                    else
                        v14 = v13;
                }
                else
                {
                    v14 = sub_c59014(node);
                }
                v7 = (unsigned int)v7 - 1;
                v15 = v14 - node >> 5;
                v0 = *(int128_t *)v14;
                v1 = (int128_t)v14[16];
                iter = ptr + v8 * 32;
                if (v6 && (unsigned long long)(long long)v14[8] <= (unsigned long long)*(long long *)(v6 + 8))
                    break;
                if (n < v8)
                    __debugbreak();
                i = 0;
                m = node;
                iter2 = iter;
                v19 = v15;
                v20 = node + v15 * 32;
                v21 = m;
                if (v20 <= node)
                    goto LABEL_c58c0c;
                do
                {
                    iter2 -= 32;
                    v23 = (int128_t)v22[16];
                    m = v22 + 32;
                    v24 = iter2 + i * 32;
                    *v24 = *(int128_t *)v22;
                    v24[1] = v23;
                    v19 = v8;
                    v20 = node + v8 * 32;
                    v21 = m;
                    if (v21 < v20)
                    {
                        do
                        {
                            v25 = (long long)m[8];
                            v26 = (long long)v14[8];
                            iter2 -= 32;
                            if ((unsigned long long)(long long)m[8] < (unsigned long long)(long long)v14[8])
                                v27 = ptr;
                            else
                                v27 = iter2;
                            v28 = v27 + i * 32;
                            v29 = (int128_t)m[16];
                            v21 = m + 32;
                            *v28 = *(int128_t *)m;
                            v28[1] = v29;
                            v30 = arm64g_calculate_condition(36, v25, v26, 0);
                            if (!(v30 & 1))
                                i += 1;
                            m = v21;
                        } while (m < v20);
                    }
LABEL_c58c0c:
                } while ((v22 = v21, v19 != v8));
                _memcpy(node, ptr, i * 32);
                v31 = node + i * 32;
                v32 = v8 - i;
                if (v8 != i)
                {
                    v33 = ptr - 32 + v8 * 32;
                    k = v32;
                    v35 = v31;
                    do
                    {
                        v36 = k;
                        v37 = *(int128_t *)&v33[16];
                        *(int128_t *)v35 = *(int128_t *)v33;
                        *(uint128_t *)&v35[16] = v37;
                        v35 += 32;
                        v33 -= 32;
                        k = v36 - 1;
                    } while (k);
                }
                if (!i)
                    break;
                if (v8 < i)
                {
                    sub_c73b38("mid > lencalled `Result::unwrap()` on an `Err` valueContents/Resources/DWARFinvalid timestampfailed to create dispatch semaphore for thread synchronizationRUST_BACKTRACEpermission deniedconnection refusednetwork unreachableconnection abortednot connectedaddress in useaddress not availablenetwork downbroken pipeentity already existsoperation would blocknot a directoryis a directorydirectory not emptyread-only filesystem or storage mediumfilesystem loop or indirection limit (e.g. symlink loop)stale network file handleinvalid input parameterinvalid datatimed outwrite zeroseek on unseekable filequota exceededfile too largeresource busyexecutable file busycross-device link or renametoo many linksargument list too longoperation interruptedunsupportedunexpected end of fileout of memoryin progressother erroruncategorized error.debug_abbrev.debug_addr.debug_aranges.debug_info.debug_line.debug_line_str.debug_loc.debug_loclists.debug_macinfo.debug_macro.debug_ranges.debug_rnglists.debug_str.debug_str_offsets.debug_types", 19, &g_efd048);
                    sub_c73e74();
                    __debugbreak();
                }
                dst = sub_c58964(v31, v32, ptr, n, v7, &v0);
                v8 = i;
                goto LABEL_c58998;
            }
            if (n < v8)
                __debugbreak();
            v40 = 0;
            l = node;
            v42 = node + v15 * 32;
            v43 = l;
            if (v42 <= node)
                goto LABEL_c58cec;
            do
            {
                iter -= 32;
                v45 = (int128_t)v44[16];
                l = v44 + 32;
                v46 = ptr + v40 * 32;
                *(int128_t *)v46 = *(int128_t *)v44;
                *(uint128_t *)&v46[16] = v45;
                v40 += 1;
                v15 = v8;
                v42 = node + v8 * 32;
                v43 = l;
                if (v43 < v42)
                {
                    do
                    {
                        v47 = (long long)l[8];
                        v48 = (long long)v14[8];
                        iter -= 32;
                        if ((unsigned long long)(long long)l[8] <= v48)
                            v49 = ptr;
                        else
                            v49 = iter;
                        v50 = v49 + v40 * 32;
                        v51 = (int128_t)l[16];
                        v43 = l + 32;
                        *v50 = *(int128_t *)l;
                        v50[1] = v51;
                        v52 = arm64g_calculate_condition(52, v48, v47, 0);
                        if (!(v52 & 1))
                            v40 += 1;
                        l = v43;
                    } while (l < v42);
                }
LABEL_c58cec:
            } while ((v44 = v43, v15 != v8));
            dst = _memcpy(node, ptr, v40 * 32);
            i = v8 - v40;
            if (v8 == v40)
                return dst;
            node += v40 * 32;
            v53 = ptr - 32 + v8 * 32;
            j = i;
            v55 = node;
            do
            {
                v56 = j;
                v57 = *(int128_t *)&v53[16];
                *(int128_t *)v55 = *(int128_t *)v53;
                *(uint128_t *)&v55[16] = v57;
                v55 += 32;
                v53 -= 32;
                j = v56 - 1;
            } while (j);
            if (v8 < v40)
            {
                v188 = sub_c73bb0(v40, v8, v8, &g_efd060);
                _memcpy(node, ptr, n);
                __Unwind_Resume(v188);
            }
            v6 = 0;
        } while (33 <= i);
    }
LABEL_c58998:
    if (i < 2)
        return dst;
    v60 = i >> 1;
    v61 = v60 * 32;
    if (i >= 8)
    {
        v62 = node + ((unsigned long long)(long long)node[8] > (unsigned long long)(long long)node[40]) * 32;
        v63 = node + ((unsigned long long)(long long)node[40] >= (unsigned long long)(long long)node[8]) * 32;
        v64 = 64;
        if ((unsigned long long)(long long)node[104] < (unsigned long long)(long long)node[72])
        {
            v65 = node + 96;
            v66 = arm64g_calculate_condition(52, (long long)node[104], (long long)node[72], 0);
            if (!(v66 & 1))
                goto LABEL_c589ea;
LABEL_c589e9:
            v68 = 64;
        }
        else
        {
            v65 = node + 64;
            v67 = arm64g_calculate_condition(52, (long long)node[104], (long long)node[72], 0);
            if (v67 & 1)
                goto LABEL_c589e9;
LABEL_c589ea:
            v68 = 96;
        }
        v69 = node + v68;
        v70 = (long long)v69[8];
        v71 = (long long)v63[8];
        if (v70 < v71)
            v72 = v65;
        else
            v72 = v63;
        v73 = (long long)v65[8];
        v74 = (long long)v62[8];
        if ((unsigned long long)(long long)v65[8] < (unsigned long long)(long long)v62[8])
        {
            v75 = v65;
            v76 = arm64g_calculate_condition(52, v73, v74, 0);
            if (!(v76 & 1))
                goto LABEL_c58a12;
LABEL_c58a11:
            v78 = v62;
            v79 = arm64g_calculate_condition(52, v73, v74, 0);
            if (!(v79 & 1))
                goto LABEL_c58a16;
LABEL_c58a15:
            v65 = v63;
        }
        else
        {
            v75 = v62;
            v77 = arm64g_calculate_condition(52, v73, v74, 0);
            if (v77 & 1)
                goto LABEL_c58a11;
LABEL_c58a12:
            v78 = v72;
            v80 = arm64g_calculate_condition(52, v73, v74, 0);
            if (v80 & 1)
                goto LABEL_c58a15;
LABEL_c58a16:
        }
        v81 = v70;
        v82 = v71;
        if (v70 < v71)
        {
            v83 = v63;
            v84 = arm64g_calculate_condition(52, v81, v82, 0);
            if (!(v84 & 1))
                goto LABEL_c58a22;
LABEL_c58a21:
            v65 = v69;
        }
        else
        {
            v83 = v69;
            v85 = arm64g_calculate_condition(52, v81, v82, 0);
            if (v85 & 1)
                goto LABEL_c58a21;
LABEL_c58a22:
        }
        if ((unsigned long long)(long long)v65[8] < (unsigned long long)(long long)v78[8])
        {
            v86 = v65;
            v87 = arm64g_calculate_condition(52, (long long)v65[8], (long long)v78[8], 0);
            if (!(v87 & 1))
                goto LABEL_c58a36;
LABEL_c58a35:
        }
        else
        {
            v86 = v78;
            v88 = arm64g_calculate_condition(52, (long long)v65[8], (long long)v78[8], 0);
            if (v88 & 1)
                goto LABEL_c58a35;
LABEL_c58a36:
            v78 = v65;
        }
        v89 = (int128_t)v75[16];
        *(int128_t *)ptr = *(int128_t *)v75;
        *(uint128_t *)&ptr[16] = v89;
        v90 = (int128_t)v86[16];
        *(int128_t *)&ptr[32] = *(int128_t *)v86;
        *(uint128_t *)&ptr[48] = v90;
        v91 = (int128_t)v78[16];
        *(int128_t *)&ptr[64] = *(int128_t *)v78;
        *(uint128_t *)&ptr[80] = v91;
        v92 = (int128_t)v83[16];
        *(int128_t *)&ptr[96] = *(int128_t *)v83;
        *(uint128_t *)&ptr[112] = v92;
        v93 = node + v61;
        v94 = v93 + ((unsigned long long)(long long)v93[8] > (unsigned long long)(long long)v93[40]) * 32;
        v95 = v93 + ((unsigned long long)(long long)v93[40] >= (unsigned long long)(long long)v93[8]) * 32;
        if ((unsigned long long)(long long)v93[104] < (unsigned long long)(long long)v93[72])
        {
            v96 = v93 + 96;
            v97 = arm64g_calculate_condition(52, (long long)v93[104], (long long)v93[72], 0);
            if (!(v97 & 1))
                goto LABEL_c58a8e;
LABEL_c58a8d:
        }
        else
        {
            v96 = v93 + 64;
            v98 = arm64g_calculate_condition(52, (long long)v93[104], (long long)v93[72], 0);
            if (v98 & 1)
                goto LABEL_c58a8d;
LABEL_c58a8e:
            v64 = 96;
        }
        v99 = v93 + v64;
        v100 = (long long)v99[8];
        v101 = (long long)v95[8];
        if (v100 < v101)
            v102 = v96;
        else
            v102 = v95;
        v103 = (long long)v96[8];
        v104 = (long long)v94[8];
        if ((unsigned long long)(long long)v96[8] < (unsigned long long)(long long)v94[8])
        {
            v105 = v96;
            v106 = arm64g_calculate_condition(52, v103, v104, 0);
            if (!(v106 & 1))
                goto LABEL_c58ab6;
LABEL_c58ab5:
            v108 = v94;
            v109 = arm64g_calculate_condition(52, v103, v104, 0);
            if (!(v109 & 1))
                goto LABEL_c58aba;
LABEL_c58ab9:
            v111 = v95;
        }
        else
        {
            v105 = v94;
            v107 = arm64g_calculate_condition(52, v103, v104, 0);
            if (v107 & 1)
                goto LABEL_c58ab5;
LABEL_c58ab6:
            v108 = v102;
            v110 = arm64g_calculate_condition(52, v103, v104, 0);
            if (v110 & 1)
                goto LABEL_c58ab9;
LABEL_c58aba:
            v111 = v96;
        }
        v112 = v100;
        v113 = v101;
        v114 = ptr + v61;
        if (v100 < v101)
        {
            v115 = v95;
            v116 = arm64g_calculate_condition(52, v112, v113, 0);
            if (!(v116 & 1))
                goto LABEL_c58aca;
LABEL_c58ac9:
        }
        else
        {
            v115 = v99;
            v117 = arm64g_calculate_condition(52, v112, v113, 0);
            if (v117 & 1)
                goto LABEL_c58ac9;
LABEL_c58aca:
            v99 = v111;
        }
        if ((unsigned long long)(long long)v99[8] < (unsigned long long)(long long)v108[8])
        {
            v118 = v99;
            v119 = arm64g_calculate_condition(52, (long long)v99[8], (long long)v108[8], 0);
            if (!(v119 & 1))
                goto LABEL_c58ade;
LABEL_c58add:
            v99 = v108;
        }
        else
        {
            v118 = v108;
            v120 = arm64g_calculate_condition(52, (long long)v99[8], (long long)v108[8], 0);
            if (v120 & 1)
                goto LABEL_c58add;
LABEL_c58ade:
        }
        v121 = (int128_t)v105[16];
        *(int128_t *)v114 = *(int128_t *)v105;
        *(uint128_t *)&v114[16] = v121;
        v122 = (int128_t)v118[16];
        *(int128_t *)&v114[32] = *(int128_t *)v118;
        *(uint128_t *)&v114[48] = v122;
        v123 = (int128_t)v99[16];
        *(int128_t *)&v114[64] = *(int128_t *)v99;
        *(uint128_t *)&v114[80] = v123;
        v124 = (int128_t)v115[16];
        *(int128_t *)&v114[96] = *(int128_t *)v115;
        *(uint128_t *)&v114[112] = v124;
        v125 = 4;
        v126 = i - v60;
        v127 = 128;
        if (4 < v60)
            goto LABEL_c58db8;
    }
    else
    {
        v128 = (int128_t)node[16];
        *(int128_t *)ptr = *(int128_t *)node;
        *(uint128_t *)&ptr[16] = v128;
        v129 = node + v61;
        v130 = ptr + v61;
        v131 = (int128_t)v129[16];
        *(int128_t *)v130 = *(int128_t *)v129;
        *(uint128_t *)&v130[16] = v131;
        v125 = 1;
        v126 = i - v60;
        v127 = 32;
        if (v60 > 1)
        {
LABEL_c58db8:
            v132 = v127;
            iter1 = v125;
            do
            {
                v134 = iter1 * 32;
                v135 = node + v134;
                v136 = ptr + v134;
                v137 = (int128_t)v135[16];
                *(int128_t *)v136 = *(int128_t *)v135;
                *(uint128_t *)&v136[16] = v137;
                v138 = (long long)v136[8];
                if ((unsigned long long)*(long long *)((char *)v136 - 24) > v138)
                {
                    v139 = *(long long *)v136;
                    v140 = v132;
                    do
                    {
                        v141 = v140;
                        v142 = ptr + v141;
                        v143 = *(int128_t *)((char *)v142 - 16);
                        *(int128_t *)v142 = *(int128_t *)((char *)v142 - 32);
                        *(uint128_t *)&v142[16] = v143;
                        v144 = v141 - 32;
                        if (v141 == 32)
                        {
                            v145 = ptr;
                            goto LABEL_c58dc8;
                        }
                    } while ((v140 = v144, v138 < (unsigned long long)*(long long *)((char *)v142 - 56)));
                    v142 = ptr + v141;
                    v145 = ptr + v144;
LABEL_c58dc8:
                    *(unsigned long *)v145 = v139;
                    *(unsigned long *)((char *)v142 - 24) = v138;
                    *(int128_t *)((char *)v142 - 16) = (int128_t)v135[16];
                }
            } while ((iter1 += 1, v132 += 32, iter1 != v60));
        }
    }
    v146 = ptr + v61;
    if (v126 > v125)
    {
        v147 = 32;
        v148 = v146;
        do
        {
            v149 = v125 * 32;
            v150 = node + v61 + v149;
            v151 = v146 + v149;
            v152 = v150[1];
            *(uint128_t *)v151 = *v150;
            *(uint128_t *)&v151[16] = v152;
            v153 = (long long)v151[8];
            if ((unsigned long long)*(long long *)((char *)v151 - 24) > v153)
            {
                v154 = *(long long *)v151;
                v155 = v147;
                v156 = v148;
                do
                {
                    v157 = v156;
                    v158 = v157 + v127;
                    v159 = *(int128_t *)((char *)v158 - 16);
                    *(int128_t *)v158 = *(int128_t *)((char *)v158 - 32);
                    *(uint128_t *)&v158[16] = v159;
                    if (v127 == v155)
                    {
                        v160 = v146;
                        goto LABEL_c58e64;
                    }
                } while ((v156 = v157 - 32, v155 += 32, v153 < (unsigned long long)*(long long *)((char *)v158 - 56)));
                v158 = v157 + v127;
                v160 = v156 + v127;
LABEL_c58e64:
                *(unsigned long *)v160 = v154;
                *(unsigned long *)((char *)v158 - 24) = v153;
                *(uint128_t *)((char *)v158 - 16) = v150[1];
            }
        } while ((v125 += 1, v148 += 32, v147 -= 32, v125 != v126));
    }
    v161 = i * 32 - 32;
    v162 = ptr + v161;
    v163 = v146 - 32;
    v164 = node;
    v165 = ptr;
    do
    {
        v166 = node + v161;
        v167 = (long long)v146[8];
        v168 = (long long)v165[8];
        if (v167 < v168)
            v169 = v146;
        else
            v169 = v165;
        v170 = (int128_t)v169[16];
        *(int128_t *)v164 = *(int128_t *)v169;
        *(uint128_t *)&v164[16] = v170;
        v164 += 32;
        v146 += (v168 > v167) * 32;
        v165 += (v167 >= v168) * 32;
        v171 = (long long)v162[8];
        v172 = (long long)v163[8];
        if ((unsigned long long)(long long)v162[8] < (unsigned long long)(long long)v163[8])
            v173 = v163;
        else
            v173 = v162;
        v174 = (int128_t)v173[16];
        *(int128_t *)v166 = *(int128_t *)v173;
        *(uint128_t *)&v166[16] = v174;
        v175 = arm64g_calculate_condition(52, v171, v172, 0);
        if (v175 & 1)
        {
            v176 = arm64g_calculate_condition(36, v171, v172, 0);
            if (!(v176 & 1))
                goto LABEL_c58f56;
            goto LABEL_c58f55;
        }
        else
        {
            v162 += 0xffffffffffffffe0;
            v177 = arm64g_calculate_condition(36, v171, v172, 0);
            if (v177 & 1)
            {
LABEL_c58f55:
                v178 = 0;
                continue;
            }
            else
            {
LABEL_c58f56:
                v178 = 0xffffffffffffffff;
            }
        }
    } while ((v163 += v178 * 32, v161 -= 32, v60 -= 1, v60));
    v179 = v163 + 32;
    v180 = v162 + 32;
    if (i & 1)
    {
        v171 = v165;
        v172 = v179;
        if (v165 < v179)
            v181 = v165;
        else
            v181 = v146;
        v182 = (int128_t)v181[16];
        *(int128_t *)v164 = *(int128_t *)v181;
        *(uint128_t *)&v164[16] = v182;
        v146 += (v165 >= v179) * 32;
        v165 += (v179 > v165) * 32;
    }
    if (v165 == v179)
    {
        v184 = arm64g_calculate_condition(4, v171, v172, 0);
        v185 = arm64g_calculate_condition(20, (v184 & 1 ? v146 : 0), (v184 & 1 ? v180 : 0), 0);
        if (!(v185 & 1))
            return v169;
        sub_c73e74();
        __debugbreak();
    }
    else
    {
        v186 = arm64g_calculate_condition(4, v171, v172, 0);
        v187 = arm64g_calculate_condition(16, (v186 & 1 ? v146 : 0), (v186 & 1 ? v180 : 0), 0);
        if (!(v187 & 1))
            return v169;
        sub_c73e74();
        __debugbreak();
    }
}
