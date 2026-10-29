/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5c568..0xc5ca00 (1176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c5c568_2 {
    uint128_t field_0;
    struct st_c5c568_0 *field_10;
} st_c5c568_2;

typedef struct st_c5c568_3 {
    char padding_0[16];
    struct st_c5c568_0 *field_10;
    char field_18;
} st_c5c568_3;

typedef struct st_c5c568_0 {
    uint128_t field_0;
    struct st_c5c568_0 *field_10;
    char field_18;
    char padding_19[15];
    struct st_c5c568_0 *field_28;
    char field_30;
    char padding_31[15];
    struct st_c5c568_0 *field_40;
    uint128_t field_48;
    struct st_c5c568_0 *field_58;
} st_c5c568_0;

typedef struct st_c5c568_1 {
    uint128_t field_0;
    struct st_c5c568_0 *field_10;
    uint128_t field_18;
    struct st_c5c568_0 *field_28;
    uint128_t field_30;
    struct st_c5c568_0 *field_40;
    uint128_t field_48;
    struct st_c5c568_0 *field_58;
} st_c5c568_1;


st_c5c568_0 * sub_c5c568(st_c5c568_0 *a0, unsigned long long a1)
{
    unsigned long long v5;  // x8
    unsigned long long v6;  // x9
    st_c5c568_0 *v15;  // x1
    unsigned long long v105;  // x17
    st_c5c568_0 *v106;  // x0
    unsigned long v107;  // cc_dep1
    unsigned long v108;  // cc_dep2
    void* v109;  // x17
    unsigned long long v110;  // 4120
    unsigned long long v111;  // 4109
    unsigned long long v112;  // 4109
    unsigned long long v113;  // x16
    void* v114;  // x8
    st_c5c568_0 *v16;  // x2
    void* v115;  // x12
    void* v116;  // x13
    unsigned long long v117;  // x11
    unsigned long long v118;  // 4121
    unsigned long long v119;  // 4108
    unsigned long long v120;  // 4108
    unsigned long long v121;  // 4110
    unsigned long long v122;  // 4102
    unsigned long long v123;  // 4110
    unsigned long long v124;  // 4102
    st_c5c568_0 *v17;  // x3
    unsigned long v18;  // cc_dep1
    unsigned long v19;  // cc_dep2
    st_c5c568_0 *v20;  // x17
    unsigned long long v21;  // 4105
    unsigned long long v22;  // 4105
    st_c5c568_0 *v23;  // x11
    unsigned long long v24;  // 4105
    st_c5c568_0 *v7;  // x11
    unsigned long long v25;  // 4105
    unsigned long v26;  // cc_dep1
    unsigned long v27;  // cc_dep2
    st_c5c568_0 *v28;  // x10
    unsigned long long v29;  // 4105
    unsigned long long v30;  // 4105
    st_c5c568_0 *v31;  // x16
    unsigned long long v32;  // 4105
    unsigned long long v33;  // 4105
    unsigned long long v34;  // x15
    st_c5c568_0 *v8;  // x10
    st_c5c568_0 *v35;  // x16
    st_c5c568_0 *v36;  // x0
    st_c5c568_0 *v37;  // x14
    st_c5c568_0 *v38;  // x17
    unsigned long long v39;  // 4109
    unsigned long long v40;  // 4109
    st_c5c568_0 *v41;  // x12
    st_c5c568_0 *v42;  // x1
    st_c5c568_0 *v43;  // x2
    st_c5c568_0 *v44;  // x3
    unsigned long long v9;  // x12
    unsigned long v45;  // cc_dep1
    unsigned long v46;  // cc_dep2
    st_c5c568_0 *v47;  // x13
    unsigned long long v48;  // 4105
    unsigned long long v49;  // 4105
    st_c5c568_0 *v50;  // x16
    unsigned long long v51;  // 4105
    unsigned long long v52;  // 4105
    unsigned long v53;  // cc_dep1
    unsigned long v54;  // cc_dep2
    st_c5c568_0 *v10;  // x15
    st_c5c568_1 *v55;  // x10
    st_c5c568_0 *v56;  // x11
    unsigned long long v57;  // 4105
    unsigned long long v58;  // 4105
    st_c5c568_0 *v59;  // x14
    unsigned long long v60;  // 4105
    unsigned long long v61;  // 4105
    unsigned long long v62;  // x11
    unsigned long long v63;  // x12
    unsigned long long v64;  // x13
    unsigned long long v11;  // 4109
    unsigned long long v65;  // x10
    st_c5c568_0 *v66;  // x11
    st_c5c568_2 *v67;  // x10
    unsigned long long v68;  // x10
    unsigned long long iter;  // x15
    unsigned long long v70;  // x17
    st_c5c568_0 *v71;  // x16
    void* v72;  // x0
    st_c5c568_0 *i;  // x17
    unsigned long long v74;  // x1
    unsigned long long v12;  // 4109
    unsigned long long v75;  // x0
    void* v76;  // x2
    uint128_t *v77;  // x1
    char *v78;  // x0
    unsigned long long v79;  // x14
    void* node;  // x9
    void* iter1;  // x10
    unsigned long long v82;  // x13
    unsigned long long v83;  // x15
    void* iter2;  // x16
    unsigned long long v13;  // x16
    unsigned long long v85;  // x0
    st_c5c568_2 *v86;  // x17
    void* v87;  // x1
    st_c5c568_0 *v88;  // x0
    unsigned long long v89;  // x2
    void* v90;  // x4
    void* v91;  // x3
    void* v92;  // x1
    void* v93;  // x2
    unsigned long long v94;  // x14
    st_c5c568_0 *v14;  // x16
    void* v95;  // x13
    void* v96;  // x15
    st_c5c568_0 *v97;  // x11
    st_c5c568_0 *v98;  // x16
    unsigned long v99;  // cc_dep1
    unsigned long v100;  // cc_dep2
    void* v101;  // x17
    unsigned long long v102;  // 4120
    unsigned long long v103;  // 4108
    unsigned long long v104;  // 4108
    st_c5c568_3 v0;  // [bp-0x4b0]
    uint128_t v1;  // [bp-0x468]
    st_c5c568_0 *v2;  // [bp-0x458]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v0 = (st_c5c568_3)0;
    if (a1 < 2)
        return a0;
    v5 = a1 >> 1;
    v6 = v5 * 3;
    if (a1 >= 8)
    {
        v7 = (char *)a0 + (a0->field_10 > a0->field_28) * 24;
        v8 = (char *)a0 + (a0->field_28 >= a0->field_10) * 24;
        v9 = 48;
        if ((unsigned long long)*(long long *)((char *)&a0->field_48 + 8) < a0->field_40)
        {
            v10 = &(&a0->field_40)[1];
            v11 = arm64g_calculate_condition(52, *(long long *)((char *)&a0->field_48 + 8), a0->field_40, 0);
            if (!(v11 & 1))
                goto LABEL_c5c5de;
LABEL_c5c5dd:
            v13 = 48;
        }
        else
        {
            v10 = &a0->field_30;
            v12 = arm64g_calculate_condition(52, *(long long *)((char *)&a0->field_48 + 8), a0->field_40, 0);
            if (v12 & 1)
                goto LABEL_c5c5dd;
LABEL_c5c5de:
            v13 = 72;
        }
        v14 = (char *)a0 + v13;
        v15 = v14->field_10;
        v16 = v8->field_10;
        if (v15 < v16)
            v17 = v10;
        else
            v17 = v8;
        v18 = v10->field_10;
        v19 = v7->field_10;
        if (v10->field_10 < v7->field_10)
        {
            v20 = v10;
            v21 = arm64g_calculate_condition(52, v18, v19, 0);
            if (!(v21 & 1))
                goto LABEL_c5c606;
LABEL_c5c605:
            v23 = v7;
            v24 = arm64g_calculate_condition(52, v18, v19, 0);
            if (!(v24 & 1))
                goto LABEL_c5c60a;
LABEL_c5c609:
            v10 = v8;
        }
        else
        {
            v20 = v7;
            v22 = arm64g_calculate_condition(52, v18, v19, 0);
            if (v22 & 1)
                goto LABEL_c5c605;
LABEL_c5c606:
            v23 = v17;
            v25 = arm64g_calculate_condition(52, v18, v19, 0);
            if (v25 & 1)
                goto LABEL_c5c609;
LABEL_c5c60a:
        }
        v26 = v15;
        v27 = v16;
        if (v15 < v16)
        {
            v28 = v8;
            v29 = arm64g_calculate_condition(52, v26, v27, 0);
            if (!(v29 & 1))
                goto LABEL_c5c616;
LABEL_c5c615:
            v10 = v14;
        }
        else
        {
            v28 = v14;
            v30 = arm64g_calculate_condition(52, v26, v27, 0);
            if (v30 & 1)
                goto LABEL_c5c615;
LABEL_c5c616:
        }
        if (v10->field_10 < v23->field_10)
        {
            v31 = v10;
            v32 = arm64g_calculate_condition(52, v10->field_10, v23->field_10, 0);
            if (!(v32 & 1))
                goto LABEL_c5c62a;
LABEL_c5c629:
        }
        else
        {
            v31 = v23;
            v33 = arm64g_calculate_condition(52, v10->field_10, v23->field_10, 0);
            if (v33 & 1)
                goto LABEL_c5c629;
LABEL_c5c62a:
            v23 = v10;
        }
        v0 = (st_c5c568_3)_INSERT(CONCAT(v0, 0), 0, v20->field_0);
        v0.field_10 = v20->field_10;
        *(struct st_c5c568_0 **)&(&v0)[1].padding_0[15] = v31->field_10;
        *(uint128_t *)&v0.field_18 = v31->field_0;
        v34 = v6 * 8;
        v35 = (char *)a0 + v34;
        v36 = (char *)v35 + (v35->field_10 > v35->field_28) * 24;
        v37 = (char *)v35 + (v35->field_28 >= v35->field_10) * 24;
        if ((unsigned long long)*(long long *)((char *)&v35->field_48 + 8) < v35->field_40)
        {
            v38 = &(&v35->field_40)[1];
            v39 = arm64g_calculate_condition(52, *(long long *)((char *)&v35->field_48 + 8), v35->field_40, 0);
            if (!(v39 & 1))
                goto LABEL_c5c686;
LABEL_c5c685:
        }
        else
        {
            v38 = &v35->field_30;
            v40 = arm64g_calculate_condition(52, *(long long *)((char *)&v35->field_48 + 8), v35->field_40, 0);
            if (v40 & 1)
                goto LABEL_c5c685;
LABEL_c5c686:
            v9 = 72;
        }
        v41 = (char *)v35 + v9;
        v42 = v41->field_10;
        v43 = v37->field_10;
        if (v42 < v43)
            v44 = v38;
        else
            v44 = v37;
        v45 = v38->field_10;
        v46 = v36->field_10;
        if (v38->field_10 < v36->field_10)
        {
            v47 = v38;
            v48 = arm64g_calculate_condition(52, v45, v46, 0);
            if (!(v48 & 1))
                goto LABEL_c5c6ae;
LABEL_c5c6ad:
            v50 = v36;
            v51 = arm64g_calculate_condition(52, v45, v46, 0);
            if (!(v51 & 1))
                goto LABEL_c5c6b2;
LABEL_c5c6b1:
            v38 = v37;
        }
        else
        {
            v47 = v36;
            v49 = arm64g_calculate_condition(52, v45, v46, 0);
            if (v49 & 1)
                goto LABEL_c5c6ad;
LABEL_c5c6ae:
            v50 = v44;
            v52 = arm64g_calculate_condition(52, v45, v46, 0);
            if (v52 & 1)
                goto LABEL_c5c6b1;
LABEL_c5c6b2:
        }
        v53 = v42;
        v54 = v43;
        *(struct st_c5c568_0 **)&(&v0)[2].padding_0[14] = v23->field_10;
        *(uint128_t *)((char *)&(&v0)[1].field_10 + 7) = v23->field_0;
        v1 = v28->field_0;
        v2 = v28->field_10;
        v55 = &v0.padding_0[v34];
        if (v42 < v43)
        {
            v56 = v37;
            v57 = arm64g_calculate_condition(52, v53, v54, 0);
            if (!(v57 & 1))
                goto LABEL_c5c6e6;
LABEL_c5c6e5:
            v38 = v41;
        }
        else
        {
            v56 = v41;
            v58 = arm64g_calculate_condition(52, v53, v54, 0);
            if (v58 & 1)
                goto LABEL_c5c6e5;
LABEL_c5c6e6:
        }
        if (v38->field_10 < v50->field_10)
        {
            v59 = v38;
            v60 = arm64g_calculate_condition(52, v38->field_10, v50->field_10, 0);
            if (!(v60 & 1))
                goto LABEL_c5c6fa;
LABEL_c5c6f9:
        }
        else
        {
            v59 = v50;
            v61 = arm64g_calculate_condition(52, v38->field_10, v50->field_10, 0);
            if (v61 & 1)
                goto LABEL_c5c6f9;
LABEL_c5c6fa:
            v50 = v38;
        }
        v55->field_0 = v47->field_0;
        v55->field_10 = v47->field_10;
        *(uint128_t *)&(&v55->field_10)[1] = v59->field_0;
        *(struct st_c5c568_0 **)((char *)&v55->field_18 + 8) = v59->field_10;
        *(uint128_t *)&v55->field_28 = v50->field_0;
        *(struct st_c5c568_0 **)&v55->field_30 = v50->field_10;
        (&v55->field_40)[1] = v56->field_10;
        *(uint128_t *)((char *)&v55->field_30 + 8) = v56->field_0;
        v62 = 4;
        v63 = a1 - v5;
        v64 = 12;
        if (4 < v5)
            goto LABEL_c5c798;
    }
    else
    {
        v0 = (st_c5c568_3)_INSERT(CONCAT(v0, 0), 0, a0->field_0);
        v0.field_10 = a0->field_10;
        v65 = v6 * 8;
        v66 = (char *)a0 + v65;
        v67 = &v0.padding_0[v65];
        v67->field_0 = v66->field_0;
        v67->field_10 = v66->field_10;
        v62 = 1;
        v63 = a1 - v5;
        v64 = 3;
        if (v5 > 1)
        {
LABEL_c5c798:
            v68 = v64 * 8;
            iter = v62;
            do
            {
                v70 = iter * 24;
                v71 = (char *)a0 + v70;
                v72 = &v0.padding_0[v70];
                *(uint128_t *)v72 = v71->field_0;
                i = v71->field_10;
                *(st_c5c568_0 **)&v72[16] = i;
                if ((unsigned long long)*(long long *)((char *)v72 - 8) > i)
                {
                    v74 = v68;
                    do
                    {
                        v75 = v74;
                        v76 = &v0.padding_0[v74];
                        *(int128_t *)v76 = *(int128_t *)((char *)v76 - 24);
                        *(long long *)&v76[16] = *(long long *)((char *)v76 - 8);
                        v74 = v75 - 24;
                        if (v75 == 24)
                        {
                            v77 = &v0;
                            v78 = &v0.field_18;
                            goto LABEL_c5c7b0;
                        }
                    } while (i < (unsigned long long)*(long long *)((char *)v76 - 32));
                    v78 = &v0.padding_0[v75];
                    v77 = &v0.padding_0[v74];
LABEL_c5c7b0:
                    *v77 = v71->field_0;
                    *(st_c5c568_0 **)(v78 - 8) = i;
                }
            } while ((iter += 1, v68 += 24, iter != v5));
        }
    }
    v79 = v6 * 8;
    node = &v0;
    iter1 = &v0.padding_0[v79];
    if (v63 > v62)
    {
        v82 = v64 * 8;
        v83 = 24;
        iter2 = iter1;
        do
        {
            v85 = v62 * 24;
            v86 = (char *)a0 + v79 + v85;
            v87 = iter1 + v85;
            *(uint128_t *)v87 = v86->field_0;
            v88 = v86->field_10;
            *(st_c5c568_0 **)&v87[16] = v88;
            if ((unsigned long long)*(long long *)((char *)v87 - 8) > v88)
            {
                v89 = v83;
                v90 = iter2;
                do
                {
                    v91 = v90;
                    v92 = v90 + v82;
                    *(int128_t *)v92 = *(int128_t *)((char *)v92 - 24);
                    *(long long *)&v92[16] = *(long long *)((char *)v92 - 8);
                    if (v82 == v89)
                    {
                        v93 = iter1;
                        goto LABEL_c5c860;
                    }
                } while ((v90 = v91 - 24, v89 += 24, v88 < (unsigned long long)*(long long *)((char *)v92 - 32)));
                v92 = v91 + v82;
                v93 = v90 + v82;
LABEL_c5c860:
                *(uint128_t *)v93 = v86->field_0;
                *(st_c5c568_0 **)((char *)v92 - 8) = v88;
            }
        } while ((v62 += 1, iter2 += 24, v83 -= 24, v62 != v63));
    }
    v94 = 0xffffffffffffffe8 + 24 * a1;
    v95 = &v0.padding_0[v94];
    v96 = iter1 - 24;
    v97 = a0;
    do
    {
        v98 = (char *)a0 + v94;
        v99 = (long long)iter1[16];
        v100 = (long long)node[16];
        if ((unsigned long long)(long long)iter1[16] < (unsigned long long)(long long)node[16])
            v101 = iter1;
        else
            v101 = node;
        v97->field_0 = *(int128_t *)v101;
        v97->field_10 = (long long)v101[16];
        v102 = arm64g_calculate_condition(52, v99, v100, 0);
        if (v102 & 1)
        {
            iter1 += 24;
            v103 = arm64g_calculate_condition(52, v99, v100, 0);
            if (!(v103 & 1))
                goto LABEL_c5c93a;
            goto LABEL_c5c939;
        }
        else
        {
            v104 = arm64g_calculate_condition(52, v99, v100, 0);
            if (v104 & 1)
            {
LABEL_c5c939:
                v105 = 0;
                goto LABEL_c5c93c;
            }
            else
            {
LABEL_c5c93a:
                v105 = 24;
LABEL_c5c93c:
                node += v105;
                v97 = &v97->field_18;
                v106 = (long long)v96[16];
                v107 = (long long)v95[16];
                v108 = v106;
                if ((unsigned long long)(long long)v95[16] < v106)
                    v109 = v96;
                else
                    v109 = v95;
                v98->field_0 = *(int128_t *)v109;
                v98->field_10 = (long long)v109[16];
                v110 = arm64g_calculate_condition(52, v107, v108, 0);
                if (v110 & 1)
                {
                    v111 = arm64g_calculate_condition(36, v107, v108, 0);
                    if (!(v111 & 1))
                        goto LABEL_c5c96e;
                    goto LABEL_c5c96d;
                }
                else
                {
                    v95 += 0xffffffffffffffe8;
                    v112 = arm64g_calculate_condition(36, v107, v108, 0);
                    if (v112 & 1)
                    {
LABEL_c5c96d:
                        v113 = 0;
                        continue;
                    }
                    else
                    {
LABEL_c5c96e:
                        v113 = 0xffffffffffffffff;
                    }
                }
            }
        }
    } while ((v96 += 24 * v113, v94 -= 24, v5 -= 1, v5));
    v114 = v96 + 24;
    v115 = v95 + 24;
    if (a1 & 1)
    {
        v107 = node;
        v108 = v114;
        if (node < v114)
            v116 = node;
        else
            v116 = iter1;
        v97->field_0 = *(int128_t *)v116;
        v97->field_10 = (long long)v116[16];
        v117 = 24;
        v118 = arm64g_calculate_condition(52, v107, v108, 0);
        if (v118 & 1)
        {
            node += 24;
            v119 = arm64g_calculate_condition(52, v107, v108, 0);
            if (!(v119 & 1))
                goto LABEL_c5c9b2;
LABEL_c5c9b1:
            v117 = 0;
        }
        else
        {
            v120 = arm64g_calculate_condition(52, v107, v108, 0);
            if (v120 & 1)
                goto LABEL_c5c9b1;
LABEL_c5c9b2:
        }
        iter1 += v117;
    }
    if (node == v114)
    {
        v121 = arm64g_calculate_condition(4, v107, v108, 0);
        v122 = arm64g_calculate_condition(20, (v121 & 1 ? iter1 : 0), (v121 & 1 ? v115 : 0), 0);
        if (!(v122 & 1))
            return v106;
    }
    else
    {
        v123 = arm64g_calculate_condition(4, v107, v108, 0);
        v124 = arm64g_calculate_condition(16, (v123 & 1 ? iter1 : 0), (v123 & 1 ? v115 : 0), 0);
        if (!(v124 & 1))
            return v106;
    }
    sub_c73e74();
    __debugbreak();
}
