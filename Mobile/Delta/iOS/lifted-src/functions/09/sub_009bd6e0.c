/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9bd6e0..0x9bda40 (864 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9bd6e0_2 {
    char padding_0[240];
    unsigned int field_f0;
} st_9bd6e0_2;

typedef struct st_9bd6e0_0 {
    char field_0;
} st_9bd6e0_0;


uint128_t * sub_9bd6e0(unsigned long a0, uint128_t *a1, unsigned long long a2, st_9bd6e0_2 *a3, uint128_t *a4, unsigned long a5, unsigned long a6, unsigned long a7, char a8, unsigned long a9, unsigned long a10, unsigned long a11)
{
    unsigned long long v7;  // x30
    unsigned long long v8;  // d8
    uint128_t v17;  // q6
    uint128_t v106;  // q3
    uint128_t *v107;  // x0
    uint128_t v108;  // q5
    uint128_t *v109;  // x0
    uint128_t v110;  // q7
    uint128_t *v111;  // x0
    uint128_t v112;  // q8
    uint128_t *v113;  // x1
    uint128_t *v114;  // x1
    uint128_t *v115;  // x1
    uint128_t v18;  // q15
    uint128_t *v116;  // x0
    uint128_t v117;  // q2
    uint128_t *v118;  // x0
    uint128_t v119;  // q3
    uint128_t *v120;  // x0
    uint128_t v121;  // q5
    uint128_t *v122;  // x1
    uint128_t *v123;  // x1
    uint128_t *v124;  // x0
    uint128_t v125;  // q2
    uint128_t v19;  // q7
    uint128_t *v126;  // x0
    uint128_t v127;  // q3
    uint128_t *v128;  // x1
    uint128_t *v129;  // x0
    uint128_t v130;  // q2
    uint128_t v20;  // q4
    unsigned long long v21;  // x2
    unsigned long long v22;  // 4106
    uint128_t *v23;  // x0
    uint128_t v24;  // q1
    uint128_t *v25;  // x0
    unsigned long long v9;  // d9
    uint128_t v26;  // q2
    uint128_t *v27;  // x0
    uint128_t v28;  // q3
    uint128_t *v29;  // x0
    uint128_t v30;  // q4
    uint128_t *v31;  // x0
    uint128_t v32;  // q5
    uint128_t *v33;  // x0
    uint128_t *v34;  // x0
    uint128_t *v35;  // x0
    unsigned long long v10;  // d10
    uint128_t v36;  // q16
    uint128_t *v37;  // x0
    uint128_t *v38;  // x1
    uint128_t v39;  // q0
    uint128_t *v40;  // x0
    uint128_t *v41;  // x1
    uint128_t v42;  // q1
    uint128_t *v43;  // x0
    uint128_t v44;  // q4
    uint128_t *v45;  // x0
    uint128_t v11;  // q15
    uint128_t *v46;  // x0
    uint128_t *v47;  // x1
    uint128_t *v48;  // x1
    uint128_t v49;  // q1
    uint128_t *v50;  // x0
    uint128_t *v51;  // x1
    uint128_t v52;  // q2
    uint128_t *v53;  // x0
    uint128_t *v54;  // x1
    uint128_t *v55;  // x1
    unsigned long long v12;  // x2
    unsigned long long v56;  // x2
    unsigned long long v57;  // 4106
    uint128_t v58;  // q15
    uint128_t v59;  // q0
    uint128_t *v60;  // x0
    uint128_t v61;  // q1
    uint128_t *v62;  // x0
    unsigned long long v63;  // 4112
    uint128_t v64;  // q2
    uint128_t *v65;  // x0
    st_9bd6e0_0 **i;  // x14
    uint128_t v66;  // q3
    uint128_t *v67;  // x0
    unsigned long long v68;  // 4105
    uint128_t v69;  // q4
    uint128_t *v70;  // x0
    uint128_t *v71;  // x0
    unsigned long long v72;  // 4105
    uint128_t v73;  // q6
    uint128_t *v74;  // x0
    uint128_t v75;  // q5
    uint128_t *v14;  // x0
    uint128_t *v76;  // x0
    uint128_t v77;  // q8
    uint128_t *v78;  // x0
    uint128_t v79;  // q9
    uint128_t *v80;  // x0
    uint128_t v81;  // q10
    uint128_t *v82;  // x0
    uint128_t *v83;  // x1
    uint128_t v84;  // q0
    uint128_t *v85;  // x0
    uint128_t v15;  // q6
    uint128_t v86;  // q5
    uint128_t *v87;  // x1
    uint128_t *v88;  // x1
    uint128_t *v89;  // x1
    uint128_t *v90;  // x1
    uint128_t *v91;  // x0
    uint128_t v92;  // q3
    uint128_t *v93;  // x0
    uint128_t v94;  // q5
    uint128_t *v95;  // x0
    uint128_t v16;  // q7
    uint128_t v96;  // q8
    uint128_t *v97;  // x0
    uint128_t v98;  // q9
    uint128_t *v99;  // x0
    uint128_t *v100;  // x1
    uint128_t v101;  // q0
    uint128_t *v102;  // x1
    uint128_t *v103;  // x1
    uint128_t *v104;  // x1
    uint128_t *v105;  // x0
    st_9bd6e0_0 *v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    unsigned long long v4;  // [bp-0x10]
    unsigned long v5;  // [bp-0x8]
    char v6;  // [bp+0x30]

    if (128 <= a2)
    {
        v0 = &a8;
        v1 = v7;
        v2 = v8;
        v3 = v9;
        v4 = v10;
        v5 = *(unsigned long long *)&v11;
        v12 = a2 >> 4;
        i = &v0;
        xsp = (int)&(&v6)[-128 * a3->field_f0];
        v14 = sub_9bd640();
        v15 = *(int128_t *)xsp;
        *(uint128_t *)xsp = v11;
        v17 = v16 ^ v15;
        *(uint128_t *)xsp = v17;
        v18 = *a4;
        while (1)
        {
            v21 = v12 - 8;
            v22 = arm64g_calculate_condition(0x44, v12, 8, 0);
            if (v22 & 1)
                break;
            v23 = v14 + 1;
            v24 = *v23;
            v25 = v23 + 1;
            v26 = *v25;
            v27 = v25 + 1;
            v28 = *v27;
            v29 = v27 + 1;
            v30 = *v29;
            v31 = v29 + 1;
            v32 = *v31;
            v33 = v31 + 1;
            v17 = *v33;
            v34 = v33 + 1;
            v19 = *v34;
            v35 = sub_9bc9a0((char *)v34 - 112);
            v36 = *v35;
            v37 = v35 + 1;
            *a1 = v18 ^ *v14;
            v38 = a1 + 1;
            v39 = *v37;
            v40 = v37 + 1;
            *v38 = v36 ^ v24;
            v41 = v38 + 1;
            v42 = *v40;
            v43 = v40 + 1;
            v44 = *v43;
            v45 = v43 + 1;
            v20 = *v45;
            v46 = v45 + 1;
            *v41 = v39 ^ v17;
            v47 = v41 + 1;
            *v47 = v42 ^ v30;
            v48 = v47 + 1;
            v49 = *v46;
            v50 = v46 + 1;
            *v48 = v44 ^ v26;
            v51 = v48 + 1;
            v52 = *v50;
            v53 = v50 + 1;
            v18 = *v53;
            v14 = v53 + 1;
            *v51 = v20 ^ v19;
            v54 = v51 + 1;
            *v54 = v49 ^ v28;
            v55 = v54 + 1;
            *v55 = v52 ^ v32;
            a1 = v55 + 1;
            v12 = v21;
        }
        v56 = v21 + 8;
        v57 = arm64g_calculate_condition(2, v21, 8, 0);
        v58 = v18;
        if (!(v57 & 1))
        {
            v59 = *v14;
            v60 = v14 + 1;
            if (v56 >= 2)
            {
                v61 = *v60;
                v62 = v60 + 1;
                v63 = arm64g_calculate_condition(4, v56, 2, 0);
                if (!(v63 & 1))
                {
                    v64 = *v62;
                    v65 = v62 + 1;
                    if (v56 >= 4)
                    {
                        v66 = *v65;
                        v67 = v65 + 1;
                        v68 = arm64g_calculate_condition(4, v56, 4, 0);
                        if (!(v68 & 1))
                        {
                            v69 = *v67;
                            v70 = v67 + 1;
                            if (v56 >= 6)
                            {
                                v71 = v70 + 1;
                                v72 = arm64g_calculate_condition(4, v56, 6, 0);
                                if (!(v72 & 1))
                                {
                                    v73 = *v71;
                                    v74 = sub_9bc9a0((char *)v71 - 96);
                                    v75 = *v74;
                                    v76 = v74 + 1;
                                    v77 = *v76;
                                    v78 = v76 + 1;
                                    v79 = *v78;
                                    v80 = v78 + 1;
                                    v81 = *v80;
                                    v82 = v80 + 1;
                                    *a1 = v18 ^ v59;
                                    v83 = a1 + 1;
                                    v84 = *v82;
                                    v85 = v82 + 1;
                                    v86 = *v85;
                                    v14 = v85 + 1;
                                    v58 = *v14;
                                    *v83 = v75 ^ v61;
                                    v87 = v83 + 1;
                                    *v87 = v77 ^ v73;
                                    v88 = v87 + 1;
                                    *v88 = v79 ^ v69;
                                    v89 = v88 + 1;
                                    *v89 = v81 ^ v64;
                                    v90 = v89 + 1;
                                    *v90 = v84 ^ v19;
                                    v90[1] = v86 ^ v66;
                                }
                                else
                                {
                                    v91 = sub_9bc9a0((char *)v71 - 96);
                                    v92 = *v91;
                                    v93 = v91 + 1;
                                    v94 = *v93;
                                    v95 = v93 + 1;
                                    v96 = *v95;
                                    v97 = v95 + 1;
                                    v98 = *v97;
                                    v99 = v97 + 1;
                                    *a1 = v18 ^ v59;
                                    v100 = a1 + 1;
                                    v101 = *v99;
                                    v14 = v99 + 1;
                                    v58 = *v14;
                                    *v100 = v92 ^ v61;
                                    v102 = v100 + 1;
                                    *v102 = v94 ^ v17;
                                    v103 = v102 + 1;
                                    *v103 = v96 ^ v69;
                                    v104 = v103 + 1;
                                    *v104 = v98 ^ v64;
                                    v104[1] = v101 ^ v19;
                                }
                            }
                            else
                            {
                                v105 = sub_9bc9a0((char *)v70 - 80);
                                v106 = *v105;
                                v107 = v105 + 1;
                                v108 = *v107;
                                v109 = v107 + 1;
                                v110 = *v109;
                                v111 = v109 + 1;
                                v112 = *v111;
                                v14 = v111 + 1;
                                *a1 = v18 ^ v59;
                                v113 = a1 + 1;
                                v58 = *v14;
                                *v113 = v106 ^ v61;
                                v114 = v113 + 1;
                                *v114 = v108 ^ v17;
                                v115 = v114 + 1;
                                *v115 = v110 ^ v69;
                                v115[1] = v112 ^ v64;
                            }
                        }
                        else
                        {
                            v116 = sub_9bc9a0((char *)v67 - 64);
                            v117 = *v116;
                            v118 = v116 + 1;
                            v119 = *v118;
                            v120 = v118 + 1;
                            v121 = *v120;
                            v14 = v120 + 1;
                            *a1 = v18 ^ v59;
                            v122 = a1 + 1;
                            v58 = *v14;
                            *v122 = v117 ^ v61;
                            v123 = v122 + 1;
                            *v123 = v119 ^ v17;
                            v123[1] = v121 ^ v20;
                        }
                    }
                    else
                    {
                        v124 = sub_9bc9a0((char *)v65 - 48);
                        v125 = *v124;
                        v126 = v124 + 1;
                        v127 = *v126;
                        v14 = v126 + 1;
                        v58 = *v14;
                        *a1 = v18 ^ v59;
                        v128 = a1 + 1;
                        *v128 = v125 ^ v61;
                        v128[1] = v127 ^ v17;
                    }
                }
                else
                {
                    v129 = sub_9bc9a0((char *)v62 - 32);
                    v130 = *v129;
                    v14 = v129 + 1;
                    v58 = *v14;
                    *a1 = v18 ^ v59;
                    a1[1] = v130 ^ v61;
                }
            }
            else
            {
                xsp = xsp - 32;
                *(uint128_t **)(xsp - 32) = a1;
                *(uint128_t **)(xsp - 24) = a4;
                *(st_9bd6e0_0 ***)(xsp + 16) = &v0;
                v58 = v59;
                v14 = sub_9b9120((char *)v60 - 16);
                i = *(long long *)(xsp + 16);
                a4 = *(long long *)(xsp + 8);
                xsp = xsp + 32;
                *(uint128_t *)*(long long *)xsp = v18 ^ *(int128_t *)*(long long *)xsp;
            }
        }
        do
        {
            *(uint128_t *)xsp = 0;
            *(uint128_t *)(xsp + 16) = 0;
            xsp = xsp + 32;
        } while (xsp != i);
        *a4 = v58;
        return v14;
    }
}
