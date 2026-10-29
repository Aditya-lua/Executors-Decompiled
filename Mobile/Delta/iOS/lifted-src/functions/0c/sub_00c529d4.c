/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc529d4..0xc53198 (1988 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c529d4_0 {
    uint128_t field_0;
    unsigned long long field_10;
} st_c529d4_0;

typedef struct st_c529d4_1 {
    char field_0[24];
    unsigned long long field_8[2];
    char field_10;
} st_c529d4_1;

extern long long g_efd048;
extern long long g_efd060;

void* sub_c529d4(void* dst, unsigned long long a1, void* ptr, unsigned long long a3, unsigned long long a4, unsigned long long a5)
{
    unsigned long long i;  // x21
    void* iter;  // x20
    void* v14;  // x26
    void* v104;  // x10
    void* v105;  // x14
    unsigned long long v106;  // 4105
    unsigned long long v107;  // 4105
    void* v108;  // x15
    unsigned long long v109;  // 4105
    unsigned long long v110;  // 4105
    uint128_t v111;  // q0
    uint128_t v112;  // q0
    uint128_t v113;  // q0
    unsigned long long j;  // x28
    uint128_t v114;  // q0
    unsigned long long v115;  // x10
    unsigned long long v116;  // x11
    unsigned long long v117;  // x12
    uint128_t v118;  // q0
    unsigned long long v119;  // x10
    void* v120;  // x11
    void* v121;  // x10
    uint128_t v122;  // q0
    unsigned long long v123;  // x13
    void* iter1;  // x8
    unsigned long long v124;  // x14
    unsigned long long v125;  // x15
    void* v126;  // x16
    void* v127;  // x17
    unsigned long v128;  // x15
    void* v129;  // x15
    unsigned long long v130;  // x16
    void* v131;  // x17
    unsigned long long v132;  // x16
    void* v133;  // x16
    void* iter2;  // x9
    unsigned long long v134;  // x13
    void* v135;  // x9
    unsigned long long v136;  // x12
    unsigned long long v137;  // x14
    void* v138;  // x15
    unsigned long long v139;  // x16
    st_c529d4_1 *v140;  // x17
    void* v141;  // x0
    unsigned long v142;  // x16
    void* v143;  // x16
    unsigned long long l;  // x10
    unsigned long long v144;  // x0
    void* v145;  // x17
    void* v146;  // x1
    void* v147;  // x17
    unsigned long long v148;  // x14
    void* v149;  // x13
    void* v150;  // x15
    void* v151;  // x11
    void* v152;  // x10
    void* v153;  // x16
    void* v19;  // x11
    void* v154;  // x17
    void* v155;  // x0
    void* v156;  // x1
    uint128_t v157;  // q0
    void* v158;  // x0
    unsigned long v159;  // cc_dep1
    unsigned long v160;  // cc_dep2
    void* v161;  // x17
    uint128_t v162;  // q0
    unsigned long long v163;  // 4120
    st_c529d4_0 *v20;  // x10
    unsigned long long v164;  // 4109
    unsigned long long v165;  // 4109
    unsigned long long v166;  // x16
    void* v167;  // x8
    void* v168;  // x12
    void* v169;  // x15
    uint128_t v170;  // q0
    unsigned long long v172;  // 4110
    unsigned long long v173;  // 4102
    unsigned long v21;  // x12
    unsigned long long v174;  // 4110
    unsigned long long v175;  // 4102
    long long v176;  // x0
    unsigned long v22;  // x13
    void* v23;  // x12
    unsigned long long v6;  // x25
    st_c529d4_0 *v24;  // x12
    uint128_t v25;  // q0
    unsigned long long v26;  // 4127
    unsigned long long v27;  // x1
    void* v28;  // x8
    char *v29;  // x10
    unsigned long long m;  // x9
    unsigned long long v31;  // x9
    unsigned long long v33;  // x25
    unsigned long long v7;  // x23
    void* v34;  // x8
    void* node;  // x9
    void* v36;  // x10
    uint128_t v37;  // q0
    void* v38;  // x11
    unsigned long v39;  // x11
    unsigned long v40;  // x12
    void* v41;  // x11
    st_c529d4_0 *v42;  // x11
    uint128_t v43;  // q0
    unsigned long long v8;  // x24
    unsigned long long v44;  // 4127
    char *v45;  // x8
    unsigned long long k;  // x9
    void* v47;  // x10
    unsigned long long v48;  // x9
    unsigned long long v50;  // x8
    unsigned long long v51;  // x9
    void* v52;  // x11
    void* v53;  // x10
    unsigned long long v9;  // x3
    unsigned long long v54;  // x12
    void* v55;  // x15
    unsigned long long v56;  // 4109
    unsigned long long v57;  // 4109
    unsigned long long v58;  // x16
    void* v59;  // x16
    unsigned long v60;  // x1
    unsigned long v61;  // x2
    void* v62;  // x3
    unsigned long v63;  // cc_dep1
    void* v10;  // x1
    unsigned long v64;  // cc_dep2
    void* v65;  // x17
    unsigned long long v66;  // 4105
    unsigned long long v67;  // 4105
    void* v68;  // x11
    unsigned long long v69;  // 4105
    unsigned long long v70;  // 4105
    unsigned long v71;  // cc_dep1
    unsigned long v72;  // cc_dep2
    void* v73;  // x10
    void* v11;  // x2
    unsigned long long v74;  // 4105
    unsigned long long v75;  // 4105
    void* v76;  // x16
    unsigned long long v77;  // 4105
    unsigned long long v78;  // 4105
    uint128_t v79;  // q0
    uint128_t v80;  // q0
    uint128_t v81;  // q0
    uint128_t v82;  // q0
    unsigned long long v83;  // x10
    unsigned int v12;  // w10
    void* v84;  // x11
    void* v85;  // x16
    void* v86;  // x14
    void* v87;  // x15
    unsigned long long v88;  // 4109
    unsigned long long v89;  // 4109
    void* v90;  // x11
    unsigned long v91;  // x17
    unsigned long v92;  // x0
    void* v93;  // x1
    void* v13;  // x9
    unsigned long v94;  // cc_dep1
    unsigned long v95;  // cc_dep2
    void* v96;  // x12
    unsigned long long v97;  // 4105
    unsigned long long v98;  // 4105
    void* v99;  // x13
    unsigned long long v100;  // 4105
    unsigned long long v101;  // 4105
    unsigned long v102;  // cc_dep1
    unsigned long v103;  // cc_dep2
    uint128_t v0;  // [bp-0x80]
    unsigned long v1;  // [bp-0x70]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    i = a1;
    iter = dst;
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
                    return sub_c524ac(iter, v8, ptr, a3, 1);
                v9 = v8 >> 3;
                v10 = iter + 96 * v9;
                v11 = iter + 168 * v9;
                if (64 > v8)
                {
                    v12 = (unsigned long long)*(long long *)v10 > (unsigned long long)*(long long *)iter;
                    if (v12 ^ (unsigned long long)*(long long *)v11 > (unsigned long long)*(long long *)v10)
                        v13 = v11;
                    else
                        v13 = v10;
                    if (v12 ^ (unsigned long long)*(long long *)v11 > (unsigned long long)*(long long *)iter)
                        v14 = iter;
                    else
                        v14 = v13;
                }
                else
                {
                    v14 = sub_c53198(iter);
                }
                v7 = (unsigned int)v7 - 1;
                j = 12297829382473034411 * (v14 - iter >> 3);
                v0 = *(int128_t *)v14;
                v1 = (long long)v14[16];
                if (v6 && (unsigned long long)*(long long *)v14 <= (unsigned long long)*(long long *)v6)
                    break;
                if (a3 < v8)
                    __debugbreak();
                i = 0;
                iter1 = ptr + 24 * v8;
                iter2 = iter;
                l = j;
                v19 = iter + 24 * j;
                if (v19 <= iter)
                    goto LABEL_c52ce8;
                do
                {
                    iter1 -= 24;
                    v20 = iter1 + 24 * i;
                    v20->field_0 = *(int128_t *)iter2;
                    v20->field_10 = (long long)iter2[16];
                    iter2 += 24;
                    l = v8;
                    v19 = iter + 24 * v8;
                    if (iter2 < v19)
                    {
                        do
                        {
                            v21 = *(long long *)iter2;
                            v22 = *(long long *)v14;
                            iter1 -= 24;
                            if ((unsigned long long)*(long long *)iter2 < (unsigned long long)*(long long *)v14)
                                v23 = ptr;
                            else
                                v23 = iter1;
                            v24 = v23 + 24 * i;
                            v25 = *(int128_t *)iter2;
                            v24->field_10 = (long long)iter2[16];
                            v24->field_0 = v25;
                            v26 = arm64g_calculate_condition(36, v21, v22, 0);
                            if (!(v26 & 1))
                                i += 1;
                            iter2 += 24;
                        } while (iter2 < v19);
                    }
LABEL_c52ce8:
                } while (l != v8);
                _memcpy(iter, ptr, i * 24);
                v27 = v8 - i;
                if (v8 != i)
                {
                    v28 = iter + 24 * i;
                    v29 = ptr - 24 + 24 * v8;
                    m = v27;
                    do
                    {
                        v31 = m;
                        *(int128_t *)v28 = *(int128_t *)v29;
                        *(long long *)&v28[16] = *(long long *)&v29[16];
                        v28 += 24;
                        v29 -= 24;
                        m = v31 - 1;
                    } while (m);
                }
                if (!i)
                    break;
                if (v8 < i)
                {
                    sub_c73b38("mid > lencalled `Result::unwrap()` on an `Err` valueContents/Resources/DWARFinvalid timestampfailed to create dispatch semaphore for thread synchronizationRUST_BACKTRACEpermission deniedconnection refusednetwork unreachableconnection abortednot connectedaddress in useaddress not availablenetwork downbroken pipeentity already existsoperation would blocknot a directoryis a directorydirectory not emptyread-only filesystem or storage mediumfilesystem loop or indirection limit (e.g. symlink loop)stale network file handleinvalid input parameterinvalid datatimed outwrite zeroseek on unseekable filequota exceededfile too largeresource busyexecutable file busycross-device link or renametoo many linksargument list too longoperation interruptedunsupportedunexpected end of fileout of memoryin progressother erroruncategorized error.debug_abbrev.debug_addr.debug_aranges.debug_info.debug_line.debug_line_str.debug_loc.debug_loclists.debug_macinfo.debug_macro.debug_ranges.debug_rnglists.debug_str.debug_str_offsets.debug_types", 19, &g_efd048);
                    sub_c73e74();
                    __debugbreak();
                }
                dst = sub_c529d4(iter + 24 * i, v27, ptr, a3, v7, &v0);
                v8 = i;
                goto LABEL_c52a08;
            }
            if (a3 < v8)
                __debugbreak();
            v33 = 0;
            v34 = ptr + 24 * v8;
            node = iter;
            v36 = iter + 24 * j;
            if (v36 <= iter)
                goto LABEL_c52df8;
            do
            {
                v34 -= 24;
                v37 = *(int128_t *)node;
                v38 = ptr + 24 * v33;
                *(long long *)&v38[16] = (long long)node[16];
                *(uint128_t *)v38 = v37;
                v33 += 1;
                node += 24;
                j = v8;
                v36 = iter + 24 * v8;
                if (node < v36)
                {
                    do
                    {
                        v39 = *(long long *)node;
                        v40 = *(long long *)v14;
                        v34 -= 24;
                        if ((unsigned long long)*(long long *)node <= (unsigned long long)*(long long *)v14)
                            v41 = ptr;
                        else
                            v41 = v34;
                        v42 = v41 + 24 * v33;
                        v43 = *(int128_t *)node;
                        v42->field_10 = (long long)node[16];
                        v42->field_0 = v43;
                        v44 = arm64g_calculate_condition(52, v40, v39, 0);
                        if (!(v44 & 1))
                            v33 += 1;
                        node += 24;
                    } while (node < v36);
                }
LABEL_c52df8:
            } while (j != v8);
            dst = _memcpy(iter, ptr, v33 * 24);
            i = v8 - v33;
            if (v8 == v33)
                return dst;
            iter += 24 * v33;
            v45 = ptr - 24 + 24 * v8;
            k = i;
            v47 = iter;
            do
            {
                v48 = k;
                *(int128_t *)v47 = *(int128_t *)v45;
                *(long long *)&v47[16] = *(long long *)&v45[16];
                v47 += 24;
                v45 -= 24;
                k = v48 - 1;
            } while (k);
            if (v8 < v33)
            {
                v176 = sub_c73bb0(v33, v8, v8, &g_efd060);
                _memcpy(iter, ptr, i * 24);
                __Unwind_Resume(v176);
            }
            v6 = 0;
        } while (33 <= i);
    }
LABEL_c52a08:
    if (i < 2)
        return dst;
    v50 = i >> 1;
    v51 = v50 * 3;
    if (i >= 8)
    {
        v52 = iter + ((unsigned long long)*(long long *)iter > (unsigned long long)(long long)iter[24]) * 24;
        v53 = iter + ((unsigned long long)(long long)iter[24] >= (unsigned long long)*(long long *)iter) * 24;
        v54 = 48;
        if ((unsigned long long)(long long)iter[72] < (unsigned long long)(long long)iter[48])
        {
            v55 = iter + 72;
            v56 = arm64g_calculate_condition(52, (long long)iter[72], (long long)iter[48], 0);
            if (!(v56 & 1))
                goto LABEL_c52a5e;
LABEL_c52a5d:
            v58 = 48;
        }
        else
        {
            v55 = iter + 48;
            v57 = arm64g_calculate_condition(52, (long long)iter[72], (long long)iter[48], 0);
            if (v57 & 1)
                goto LABEL_c52a5d;
LABEL_c52a5e:
            v58 = 72;
        }
        v59 = iter + v58;
        v60 = *(long long *)v59;
        v61 = *(long long *)v53;
        if (v60 < v61)
            v62 = v55;
        else
            v62 = v53;
        v63 = *(long long *)v55;
        v64 = *(long long *)v52;
        if ((unsigned long long)*(long long *)v55 < (unsigned long long)*(long long *)v52)
        {
            v65 = v55;
            v66 = arm64g_calculate_condition(52, v63, v64, 0);
            if (!(v66 & 1))
                goto LABEL_c52a86;
LABEL_c52a85:
            v68 = v52;
            v69 = arm64g_calculate_condition(52, v63, v64, 0);
            if (!(v69 & 1))
                goto LABEL_c52a8a;
LABEL_c52a89:
            v55 = v53;
        }
        else
        {
            v65 = v52;
            v67 = arm64g_calculate_condition(52, v63, v64, 0);
            if (v67 & 1)
                goto LABEL_c52a85;
LABEL_c52a86:
            v68 = v62;
            v70 = arm64g_calculate_condition(52, v63, v64, 0);
            if (v70 & 1)
                goto LABEL_c52a89;
LABEL_c52a8a:
        }
        v71 = v60;
        v72 = v61;
        if (v60 < v61)
        {
            v73 = v53;
            v74 = arm64g_calculate_condition(52, v71, v72, 0);
            if (!(v74 & 1))
                goto LABEL_c52a96;
LABEL_c52a95:
            v55 = v59;
        }
        else
        {
            v73 = v59;
            v75 = arm64g_calculate_condition(52, v71, v72, 0);
            if (v75 & 1)
                goto LABEL_c52a95;
LABEL_c52a96:
        }
        if ((unsigned long long)*(long long *)v55 < (unsigned long long)*(long long *)v68)
        {
            v76 = v55;
            v77 = arm64g_calculate_condition(52, *(long long *)v55, *(long long *)v68, 0);
            if (!(v77 & 1))
                goto LABEL_c52aaa;
LABEL_c52aa9:
        }
        else
        {
            v76 = v68;
            v78 = arm64g_calculate_condition(52, *(long long *)v55, *(long long *)v68, 0);
            if (v78 & 1)
                goto LABEL_c52aa9;
LABEL_c52aaa:
            v68 = v55;
        }
        v79 = *(int128_t *)v65;
        *(long long *)&ptr[16] = (long long)v65[16];
        *(uint128_t *)ptr = v79;
        v80 = *(int128_t *)v76;
        *(long long *)&ptr[40] = (long long)v76[16];
        *(uint128_t *)&ptr[24] = v80;
        v81 = *(int128_t *)v68;
        *(long long *)&ptr[64] = (long long)v68[16];
        *(uint128_t *)&ptr[48] = v81;
        v82 = *(int128_t *)v73;
        *(long long *)&ptr[88] = (long long)v73[16];
        *(uint128_t *)&ptr[72] = v82;
        v83 = v51 * 8;
        v84 = iter + v83;
        v85 = v84 + ((unsigned long long)*(long long *)v84 > (unsigned long long)(long long)v84[24]) * 24;
        v86 = v84 + ((unsigned long long)(long long)v84[24] >= (unsigned long long)*(long long *)v84) * 24;
        if ((unsigned long long)(long long)v84[72] < (unsigned long long)(long long)v84[48])
        {
            v87 = v84 + 72;
            v88 = arm64g_calculate_condition(52, (long long)v84[72], (long long)v84[48], 0);
            if (!(v88 & 1))
                goto LABEL_c52b26;
LABEL_c52b25:
        }
        else
        {
            v87 = v84 + 48;
            v89 = arm64g_calculate_condition(52, (long long)v84[72], (long long)v84[48], 0);
            if (v89 & 1)
                goto LABEL_c52b25;
LABEL_c52b26:
            v54 = 72;
        }
        v90 = v84 + v54;
        v91 = *(long long *)v90;
        v92 = *(long long *)v86;
        if (v91 < v92)
            v93 = v87;
        else
            v93 = v86;
        v94 = *(long long *)v87;
        v95 = *(long long *)v85;
        if ((unsigned long long)*(long long *)v87 < (unsigned long long)*(long long *)v85)
        {
            v96 = v87;
            v97 = arm64g_calculate_condition(52, v94, v95, 0);
            if (!(v97 & 1))
                goto LABEL_c52b4e;
LABEL_c52b4d:
            v99 = v85;
            v100 = arm64g_calculate_condition(52, v94, v95, 0);
            if (!(v100 & 1))
                goto LABEL_c52b52;
LABEL_c52b51:
            v87 = v86;
        }
        else
        {
            v96 = v85;
            v98 = arm64g_calculate_condition(52, v94, v95, 0);
            if (v98 & 1)
                goto LABEL_c52b4d;
LABEL_c52b4e:
            v99 = v93;
            v101 = arm64g_calculate_condition(52, v94, v95, 0);
            if (v101 & 1)
                goto LABEL_c52b51;
LABEL_c52b52:
        }
        v102 = v91;
        v103 = v92;
        v104 = ptr + v83;
        if (v91 < v92)
        {
            v105 = v86;
            v106 = arm64g_calculate_condition(52, v102, v103, 0);
            if (!(v106 & 1))
                goto LABEL_c52b62;
LABEL_c52b61:
        }
        else
        {
            v105 = v90;
            v107 = arm64g_calculate_condition(52, v102, v103, 0);
            if (v107 & 1)
                goto LABEL_c52b61;
LABEL_c52b62:
            v90 = v87;
        }
        if ((unsigned long long)*(long long *)v90 < (unsigned long long)*(long long *)v99)
        {
            v108 = v90;
            v109 = arm64g_calculate_condition(52, *(long long *)v90, *(long long *)v99, 0);
            if (!(v109 & 1))
                goto LABEL_c52b76;
LABEL_c52b75:
            v90 = v99;
        }
        else
        {
            v108 = v99;
            v110 = arm64g_calculate_condition(52, *(long long *)v90, *(long long *)v99, 0);
            if (v110 & 1)
                goto LABEL_c52b75;
LABEL_c52b76:
        }
        v111 = *(int128_t *)v96;
        *(long long *)&v104[16] = (long long)v96[16];
        *(uint128_t *)v104 = v111;
        v112 = *(int128_t *)v108;
        *(long long *)&v104[40] = (long long)v108[16];
        *(uint128_t *)&v104[24] = v112;
        v113 = *(int128_t *)v90;
        *(long long *)&v104[64] = (long long)v90[16];
        *(uint128_t *)&v104[48] = v113;
        v114 = *(int128_t *)v105;
        *(long long *)&v104[88] = (long long)v105[16];
        *(uint128_t *)&v104[72] = v114;
        v115 = 4;
        v116 = i - v50;
        v117 = 12;
        if (4 < v50)
            goto LABEL_c52ef8;
    }
    else
    {
        v118 = *(int128_t *)iter;
        *(long long *)&ptr[16] = (long long)iter[16];
        *(uint128_t *)ptr = v118;
        v119 = v51 * 8;
        v120 = iter + v119;
        v121 = ptr + v119;
        v122 = *(int128_t *)v120;
        *(long long *)&v121[16] = (long long)v120[16];
        *(uint128_t *)v121 = v122;
        v115 = 1;
        v116 = i - v50;
        v117 = 3;
        if (v50 > 1)
        {
LABEL_c52ef8:
            v123 = v117 * 8;
            v124 = v115;
            do
            {
                v125 = v124 * 24;
                v126 = iter + v125;
                v127 = ptr + v125;
                v128 = (long long)v126[16];
                *(int128_t *)v127 = *(int128_t *)v126;
                *(unsigned long *)&v127[16] = v128;
                v129 = *(long long *)v127;
                if ((unsigned long long)*(long long *)((char *)v127 - 24) > v129)
                {
                    v0 = (int128_t)v126[8];
                    v130 = v123;
                    do
                    {
                        v131 = ptr + v130;
                        *(int128_t *)v131 = *(int128_t *)((char *)v131 - 24);
                        *(long long *)&v131[16] = *(long long *)((char *)v131 - 8);
                        v132 = v130 - 24;
                        if (v130 == 24)
                        {
                            v133 = ptr;
                            goto LABEL_c52f08;
                        }
                    } while ((v130 = v132, v129 < (unsigned long long)*(long long *)((char *)v131 - 48)));
                    v133 = ptr + v132;
LABEL_c52f08:
                    *(void* *)v133 = v129;
                    *(uint128_t *)&v133[8] = v0;
                }
            } while ((v124 += 1, v123 += 24, v124 != v50));
        }
    }
    v134 = v51 * 8;
    v135 = ptr + v134;
    if (v116 > v115)
    {
        v136 = v117 * 8;
        v137 = 24;
        v138 = v135;
        do
        {
            v139 = v115 * 24;
            v140 = iter + v134 + v139;
            v141 = v135 + v139;
            v142 = *(long long *)&v140->field_0[16];
            *(int128_t *)v141 = *(int128_t *)&v140->field_0[0];
            *(unsigned long *)&v141[16] = v142;
            v143 = *(long long *)v141;
            if ((unsigned long long)*(long long *)((char *)v141 - 24) > v143)
            {
                v0 = *(int128_t *)&v140->field_0[8];
                v144 = v137;
                v145 = v138;
                do
                {
                    v146 = v145 + v136;
                    *(int128_t *)v146 = *(int128_t *)((char *)v146 - 24);
                    *(long long *)&v146[16] = *(long long *)((char *)v146 - 8);
                    if (v136 == v144)
                    {
                        v147 = v135;
                        goto LABEL_c52fb8;
                    }
                } while ((v145 -= 24, v144 += 24, v143 < (unsigned long long)*(long long *)((char *)v146 - 48)));
                v147 = v145 + v136;
LABEL_c52fb8:
                *(void* *)v147 = v143;
                *(uint128_t *)&v147[8] = v0;
            }
        } while ((v115 += 1, v138 += 24, v137 -= 24, v115 != v116));
    }
    v148 = 0xffffffffffffffe8 + 24 * i;
    v149 = ptr + v148;
    v150 = v135 - 24;
    v151 = iter;
    v152 = ptr;
    do
    {
        v153 = iter + v148;
        v154 = *(long long *)v135;
        v155 = *(long long *)v152;
        if (v154 < v155)
            v156 = v135;
        else
            v156 = v152;
        v157 = *(int128_t *)v156;
        *(long long *)&v151[16] = (long long)v156[16];
        *(uint128_t *)v151 = v157;
        v151 += 24;
        v135 += (v155 > v154) * 24;
        v152 += (v154 >= v155) * 24;
        v158 = *(long long *)v150;
        v159 = *(long long *)v149;
        v160 = v158;
        if ((unsigned long long)*(long long *)v149 < v158)
            v161 = v150;
        else
            v161 = v149;
        v162 = *(int128_t *)v161;
        *(long long *)&v153[16] = (long long)v161[16];
        *(uint128_t *)v153 = v162;
        v163 = arm64g_calculate_condition(52, v159, v160, 0);
        if (v163 & 1)
        {
            v164 = arm64g_calculate_condition(36, v159, v160, 0);
            if (!(v164 & 1))
                goto LABEL_c530ca;
            goto LABEL_c530c9;
        }
        else
        {
            v149 += 0xffffffffffffffe8;
            v165 = arm64g_calculate_condition(36, v159, v160, 0);
            if (v165 & 1)
            {
LABEL_c530c9:
                v166 = 0;
                continue;
            }
            else
            {
LABEL_c530ca:
                v166 = 0xffffffffffffffff;
            }
        }
    } while ((v150 += 24 * v166, v148 -= 24, v50 -= 1, v50));
    v167 = v150 + 24;
    v168 = v149 + 24;
    if (i & 1)
    {
        v159 = v152;
        v160 = v167;
        if (v152 < v167)
            v169 = v152;
        else
            v169 = v135;
        v170 = *(int128_t *)v169;
        *(long long *)&v151[16] = (long long)v169[16];
        *(uint128_t *)v151 = v170;
        v135 += (v152 >= v167) * 24;
        v152 += (v167 > v152) * 24;
    }
    if (v152 == v167)
    {
        v172 = arm64g_calculate_condition(4, v159, v160, 0);
        v173 = arm64g_calculate_condition(20, (v172 & 1 ? v135 : 0), (v172 & 1 ? v168 : 0), 0);
        if (!(v173 & 1))
            return v158;
        sub_c73e74();
        __debugbreak();
    }
    else
    {
        v174 = arm64g_calculate_condition(4, v159, v160, 0);
        v175 = arm64g_calculate_condition(16, (v174 & 1 ? v135 : 0), (v174 & 1 ? v168 : 0), 0);
        if (!(v175 & 1))
            return v158;
        sub_c73e74();
        __debugbreak();
    }
}
