/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5070c..0xc5087c (368 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_c5070c(void* a0, uint128_t *a1)
{
    unsigned long v0;  // x8
    unsigned long v1;  // x9
    unsigned long v10;  // cc_dep2
    unsigned long v11;  // 4110
    unsigned long long v12;  // 4126
    void* v13;  // x8
    void* v14;  // x11
    unsigned long long v16;  // 4128
    unsigned long v17;  // 4110
    unsigned long v18;  // cc_op
    unsigned long v19;  // cc_dep1
    unsigned long v2;  // cc_dep1
    unsigned long v20;  // cc_dep2
    unsigned long long v21;  // 4105
    unsigned long v22;  // 4110
    unsigned long long v23;  // 4105
    unsigned long long v24;  // 4128
    unsigned long long v25;  // x8
    void* v26;  // x8
    void* v27;  // x11
    void* v28;  // x9
    unsigned long v29;  // x12
    unsigned long v3;  // cc_dep2
    unsigned long v30;  // x13
    unsigned long v31;  // cc_dep1
    unsigned long v32;  // cc_dep2
    unsigned int v33;  // w12
    unsigned long v34;  // x13
    unsigned long v35;  // cc_dep1
    unsigned long v36;  // cc_dep2
    unsigned long v37;  // x13
    unsigned long v38;  // x14
    unsigned long long v39;  // 4118
    unsigned int v4;  // w9
    unsigned long v40;  // 4110
    unsigned long v41;  // cc_op
    unsigned long v42;  // cc_dep1
    unsigned long v43;  // cc_dep2
    unsigned long v44;  // 4110
    unsigned long long v45;  // 4126
    unsigned long long v46;  // 4118
    unsigned long v47;  // 4110
    unsigned long v48;  // cc_dep1
    unsigned long v49;  // cc_dep2
    unsigned long v5;  // x8
    unsigned long v50;  // 4101
    unsigned long long v51;  // x13
    unsigned long long v52;  // 4113
    unsigned long v53;  // 4110
    unsigned long v54;  // cc_dep1
    unsigned long v55;  // cc_dep2
    unsigned long v56;  // 4101
    unsigned long long v57;  // 4113
    void* v58;  // x14
    unsigned long v59;  // cc_dep1
    unsigned long v6;  // x10
    void* v60;  // x12
    unsigned long long v61;  // 4105
    unsigned long long v62;  // 4105
    void* v63;  // x11
    unsigned long long v64;  // 4105
    unsigned long long v65;  // 4105
    unsigned long v66;  // cc_dep1
    unsigned long long v67;  // 4109
    unsigned long long v68;  // 4105
    unsigned long long v69;  // 4105
    unsigned long v7;  // 4110
    unsigned long v70;  // cc_dep1
    unsigned long v71;  // cc_dep2
    unsigned long v72;  // x10
    unsigned long v73;  // x13
    unsigned long long v74;  // 4118
    void* v75;  // x9
    void* v76;  // x11
    unsigned long v77;  // cc_dep1
    unsigned long long v78;  // 4105
    unsigned long long v79;  // 4105
    unsigned long v8;  // cc_op
    unsigned long long v80;  // 4118
    void* v81;  // x9
    unsigned long v82;  // 4110
    unsigned long v83;  // cc_op
    unsigned long v84;  // cc_dep1
    unsigned long v85;  // cc_dep2
    unsigned long long v86;  // 4105
    unsigned long v87;  // 4110
    unsigned long long v88;  // 4105
    unsigned long long v89;  // 4105
    unsigned long v9;  // cc_dep1
    unsigned long long v90;  // 4105
    void* v91;  // x9
    uint128_t v92;  // q1
    uint128_t v93;  // q1
    uint128_t v94;  // q1
    uint128_t v95;  // q0
    uint128_t v96;  // q1

    v0 = (long long)a0[48];
    v1 = (long long)a0[16];
    v2 = v0;
    v3 = v1;
    if (v1 > v0)
    {
        v4 = 1;
        v5 = (long long)a0[112];
        v6 = (long long)a0[80];
        if ((unsigned long long)(long long)a0[112] < (unsigned long long)(long long)a0[80])
            goto LABEL_c50780;
LABEL_c50730:
        v13 = a0 + 64;
        v14 = v13;
        v16 = arm64g_calculate_condition(148, v5, v6, 0);
        if (v16 & 1)
        {
            v17 = arm64g_calculate_condition(148, v5, v6, 0);
            v18 = 4;
            v19 = (v17 & 1 ? (long long)v14[32] : 0x20000000);
            v20 = (v17 & 1 ? (long long)a0[64] : 0);
            v21 = arm64g_calculate_condition(52, v19, v20, 0);
            if (!(v21 & 1))
                goto LABEL_c50746;
LABEL_c50745:
            v13 = v14 + 32;
        }
        else
        {
            v22 = arm64g_calculate_condition(148, v5, v6, 0);
            v18 = 0;
            v19 = (v22 & 1 ? (long long)v14[32] : 0x20000000);
            v20 = (v22 & 1 ? (long long)a0[64] : 0);
            v23 = arm64g_calculate_condition(48, v19, v20, 0);
            if (v23 & 1)
                goto LABEL_c50745;
LABEL_c50746:
        }
        v24 = arm64g_calculate_condition(v18 | 32, v19, v20, 0);
        v25 = 2;
        if (v24 & 1)
            v25 = 3;
    }
    else
    {
        if (v0 <= v1)
        {
            v7 = arm64g_calculate_condition(148, v2, v3, 0);
            v8 = 4;
            v9 = (v7 & 1 ? (long long)a0[32] : 0x20000000);
            v10 = (v7 & 1 ? *(long long *)a0 : 0);
        }
        else
        {
            v11 = arm64g_calculate_condition(148, v2, v3, 0);
            v8 = 0;
            v9 = (v11 & 1 ? (long long)a0[32] : 0x20000000);
            v10 = (v11 & 1 ? *(long long *)a0 : 0);
        }
        v12 = arm64g_calculate_condition(v8 | 32, v9, v10, 0);
        v4 = !(v12 & 1);
        v5 = (long long)a0[112];
        v6 = (long long)a0[80];
        if ((unsigned long long)(long long)a0[80] <= (unsigned long long)(long long)a0[112])
            goto LABEL_c50730;
LABEL_c50780:
        v13 = a0 + 96;
        v25 = 2;
    }
    v26 = a0 + (v4 ^ 1) * 32;
    v27 = a0 + v4 * 32;
    v28 = a0 + v25 * 32;
    v29 = (long long)v13[16];
    v30 = (long long)v27[16];
    v31 = v29;
    v32 = v30;
    if (v30 > v29)
    {
        v33 = 1;
        v34 = (long long)v28[16];
        v35 = v34;
        v36 = (long long)v26[16];
        if (v34 < (unsigned long long)(long long)v26[16])
            goto LABEL_c50828;
        v37 = *(long long *)v26;
        v38 = *(long long *)v28;
        v39 = arm64g_calculate_condition(148, v35, v36, 0);
        if (!(v39 & 1))
            goto LABEL_c507ca;
LABEL_c507c9:
        v47 = arm64g_calculate_condition(148, v35, v36, 0);
        v48 = (v47 & 1 ? v38 : 0x20000000);
        v49 = (v47 & 1 ? v37 : 0);
        v50 = arm64g_calculate_flags_nzcv(4, v48, v49, 0);
        v51 = v50 & 0xffffffff;
        v52 = arm64g_calculate_condition(52, v48, v49, 0);
        if (!(v52 & 1))
            goto LABEL_c507d2;
LABEL_c507d1:
        v58 = v13;
    }
    else
    {
        if (v29 <= v30)
        {
            v40 = arm64g_calculate_condition(148, v31, v32, 0);
            v41 = 4;
            v42 = (v40 & 1 ? *(long long *)v13 : 0x20000000);
            v43 = (v40 & 1 ? *(long long *)v27 : 0);
        }
        else
        {
            v44 = arm64g_calculate_condition(148, v31, v32, 0);
            v41 = 0;
            v42 = (v44 & 1 ? *(long long *)v13 : 0x20000000);
            v43 = (v44 & 1 ? *(long long *)v27 : 0);
        }
        v45 = arm64g_calculate_condition(v41 | 32, v42, v43, 0);
        v33 = !(v45 & 1);
        v34 = (long long)v28[16];
        v35 = v34;
        v36 = (long long)v26[16];
        if ((unsigned long long)(long long)v26[16] > v34)
        {
LABEL_c50828:
            v77 = v33;
            if (v33)
            {
                v60 = v13;
                v78 = arm64g_calculate_condition(19, v77, 0, 0);
                if (!(v78 & 1))
                    goto LABEL_c50832;
LABEL_c50831:
                v13 = v27;
            }
            else
            {
                v60 = v27;
                v79 = arm64g_calculate_condition(19, v77, 0, 0);
                if (v79 & 1)
                    goto LABEL_c50831;
LABEL_c50832:
            }
            v70 = v34;
            v71 = (long long)v13[16];
            v63 = v13;
            if (v34 < (unsigned long long)(long long)v63[16])
            {
                v91 = v28;
                v92 = (int128_t)v60[16];
                *a1 = *(int128_t *)v60;
                a1[1] = v92;
                v93 = (int128_t)v91[16];
                a1[2] = *(int128_t *)v91;
                a1[3] = v93;
                v94 = (int128_t)v63[16];
                a1[4] = *(int128_t *)v63;
                a1[5] = v94;
                v95 = *(int128_t *)v26;
                v96 = (int128_t)v26[16];
                a1[6] = v95;
                a1[7] = v96;
                return *(unsigned long long *)&v95;
            }
            v72 = *(long long *)v13;
            v73 = *(long long *)v28;
            v80 = arm64g_calculate_condition(148, v70, v71, 0);
            v63 = v13;
            v75 = v28;
            v76 = v13;
            if (!(v80 & 1))
            {
LABEL_c5084a:
                v81 = v75;
                v87 = arm64g_calculate_condition(148, v70, v71, 0);
                v83 = 0;
                v84 = (v87 & 1 ? v73 : 0x20000000);
                v85 = (v87 & 1 ? v72 : 0);
                v88 = arm64g_calculate_condition(48, v84, v85, 0);
                v63 = v76;
                if (!(v88 & 1))
                {
LABEL_c5084e:
                    v28 = v76;
                    v90 = arm64g_calculate_condition(v83 | 48, v84, v85, 0);
                    v63 = v76;
                    if (!(v90 & 1))
                    {
                        v63 = v81;
                        v91 = v28;
                        v92 = (int128_t)v60[16];
                        *a1 = *(int128_t *)v60;
                        a1[1] = v92;
                        v93 = (int128_t)v91[16];
                        a1[2] = *(int128_t *)v91;
                        a1[3] = v93;
                        v94 = (int128_t)v63[16];
                        a1[4] = *(int128_t *)v63;
                        a1[5] = v94;
                        v95 = *(int128_t *)v26;
                        v96 = (int128_t)v26[16];
                        a1[6] = v95;
                        a1[7] = v96;
                        return *(unsigned long long *)&v95;
                    }
                    v91 = v28;
                    v92 = (int128_t)v60[16];
                    *a1 = *(int128_t *)v60;
                    a1[1] = v92;
                    v93 = (int128_t)v91[16];
                    a1[2] = *(int128_t *)v91;
                    a1[3] = v93;
                    v94 = (int128_t)v63[16];
                    a1[4] = *(int128_t *)v63;
                    a1[5] = v94;
                    v95 = *(int128_t *)v26;
                    v96 = (int128_t)v26[16];
                    a1[6] = v95;
                    a1[7] = v96;
                    return *(unsigned long long *)&v95;
                }
LABEL_c5084d:
                v28 = v81;
                v89 = arm64g_calculate_condition(v83 | 48, v84, v85, 0);
                if (!(v89 & 1))
                {
                    v63 = v81;
                    v91 = v28;
                    v92 = (int128_t)v60[16];
                    *a1 = *(int128_t *)v60;
                    a1[1] = v92;
                    v93 = (int128_t)v91[16];
                    a1[2] = *(int128_t *)v91;
                    a1[3] = v93;
                    v94 = (int128_t)v63[16];
                    a1[4] = *(int128_t *)v63;
                    a1[5] = v94;
                    v95 = *(int128_t *)v26;
                    v96 = (int128_t)v26[16];
                    a1[6] = v95;
                    a1[7] = v96;
                    return *(unsigned long long *)&v95;
                }
                v91 = v28;
                v92 = (int128_t)v60[16];
                *a1 = *(int128_t *)v60;
                a1[1] = v92;
                v93 = (int128_t)v91[16];
                a1[2] = *(int128_t *)v91;
                a1[3] = v93;
                v94 = (int128_t)v63[16];
                a1[4] = *(int128_t *)v63;
                a1[5] = v94;
                v95 = *(int128_t *)v26;
                v96 = (int128_t)v26[16];
                a1[6] = v95;
                a1[7] = v96;
                return *(unsigned long long *)&v95;
            }
LABEL_c50849:
            v81 = v28;
            v82 = arm64g_calculate_condition(148, v70, v71, 0);
            v83 = 4;
            v84 = (v82 & 1 ? v73 : 0x20000000);
            v85 = (v82 & 1 ? v72 : 0);
            v86 = arm64g_calculate_condition(52, v84, v85, 0);
            v76 = v63;
            if (!(v86 & 1))
                goto LABEL_c5084e;
            goto LABEL_c5084d;
        }
        v37 = *(long long *)v26;
        v38 = *(long long *)v28;
        v46 = arm64g_calculate_condition(148, v35, v36, 0);
        if (v46 & 1)
            goto LABEL_c507c9;
LABEL_c507ca:
        v53 = arm64g_calculate_condition(148, v35, v36, 0);
        v54 = (v53 & 1 ? v38 : 0x20000000);
        v55 = (v53 & 1 ? v37 : 0);
        v56 = arm64g_calculate_flags_nzcv(0, v54, v55, 0);
        v51 = v56 & 0xffffffff;
        v57 = arm64g_calculate_condition(48, v54, v55, 0);
        if (v57 & 1)
            goto LABEL_c507d1;
LABEL_c507d2:
        v58 = v26;
    }
    v59 = v33;
    if (v33)
    {
        v60 = v13;
        v61 = arm64g_calculate_condition(19, v59, 0, 0);
        if (!(v61 & 1))
            goto LABEL_c507de;
LABEL_c507dd:
        v63 = v27;
        v64 = arm64g_calculate_condition(19, v59, 0, 0);
        if (!(v64 & 1))
            goto LABEL_c507e2;
LABEL_c507e1:
        v13 = v26;
    }
    else
    {
        v60 = v27;
        v62 = arm64g_calculate_condition(19, v59, 0, 0);
        if (v62 & 1)
            goto LABEL_c507dd;
LABEL_c507de:
        v63 = v58;
        v65 = arm64g_calculate_condition(19, v59, 0, 0);
        if (v65 & 1)
            goto LABEL_c507e1;
LABEL_c507e2:
    }
    v66 = v51 & 0xf0000000;
    v67 = arm64g_calculate_condition(48, v51 & 0xf0000000, 0, 0);
    if (v67 & 1)
    {
        v26 = v26;
        v68 = arm64g_calculate_condition(48, v66, 0, 0);
        if (!(v68 & 1))
            goto LABEL_c507ee;
LABEL_c507ed:
        v13 = v28;
    }
    else
    {
        v26 = v28;
        v69 = arm64g_calculate_condition(48, v66, 0, 0);
        if (v69 & 1)
            goto LABEL_c507ed;
LABEL_c507ee:
    }
    v70 = (long long)v13[16];
    v71 = (long long)v63[16];
    v28 = v13;
    if ((unsigned long long)(long long)v63[16] > (unsigned long long)(long long)v28[16])
    {
        v91 = v28;
        v92 = (int128_t)v60[16];
        *a1 = *(int128_t *)v60;
        a1[1] = v92;
        v93 = (int128_t)v91[16];
        a1[2] = *(int128_t *)v91;
        a1[3] = v93;
        v94 = (int128_t)v63[16];
        a1[4] = *(int128_t *)v63;
        a1[5] = v94;
        v95 = *(int128_t *)v26;
        v96 = (int128_t)v26[16];
        a1[6] = v95;
        a1[7] = v96;
        return *(unsigned long long *)&v95;
    }
    v72 = *(long long *)v63;
    v73 = *(long long *)v13;
    v74 = arm64g_calculate_condition(148, v70, v71, 0);
    v28 = v13;
    v75 = v13;
    v76 = v63;
    if (!(v74 & 1))
        goto LABEL_c5084a;
    goto LABEL_c50849;
}
