/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d9620..0x9d9880 (608 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_f0d570;

int sub_9d9620(unsigned long long *a0, void* a1, unsigned long long *a2, void* a3, unsigned long long *a4, long long a5)
{
    unsigned long long v9;  // x30
    unsigned long long v10;  // x19
    unsigned long long v19;  // x5
    unsigned long long v109;  // 4125
    unsigned long v110;  // 4133
    unsigned long v111;  // cc_dep1
    unsigned long v112;  // cc_ndep
    unsigned long v113;  // x23
    unsigned long long *node;  // x22
    unsigned long v115;  // x8
    unsigned long long *iter;  // x0
    unsigned long long v117;  // x5
    unsigned long long v118;  // 4108
    unsigned long long v20;  // x4
    unsigned long v119;  // x14
    unsigned long long v120;  // 4108
    unsigned long long v121;  // 4105
    unsigned long v122;  // x14
    unsigned long long *iter1;  // x22
    unsigned long long *v22;  // x3
    unsigned long long v23;  // x6
    unsigned long long i;  // x21
    unsigned long long v25;  // x7
    unsigned long long v26;  // x10
    unsigned long long v27;  // x11
    unsigned long long v28;  // x15
    unsigned long long v11;  // x20
    unsigned long long v29;  // x16
    unsigned long long v30;  // x17
    unsigned long v31;  // 4215
    unsigned long long v32;  // x13
    unsigned long long *v33;  // x1
    unsigned long long *v34;  // x3
    unsigned long long v35;  // x6
    unsigned long v36;  // 4144
    unsigned long long v37;  // x12
    unsigned long v38;  // 4155
    unsigned long long v12;  // x21
    unsigned long v39;  // 4170
    unsigned long long v40;  // x6
    void* v41;  // x1
    unsigned long v42;  // 4146
    unsigned long long v43;  // x7
    unsigned long long v44;  // x12
    void* v45;  // x3
    unsigned long v46;  // 4153
    unsigned long long v47;  // x13
    unsigned long long j;  // x20
    unsigned long long v13;  // x22
    unsigned long v49;  // 4160
    unsigned long long v50;  // 4167
    unsigned long long v51;  // x19
    unsigned long v52;  // x9
    unsigned long long *v53;  // x1
    unsigned long long *v54;  // x22
    unsigned long v55;  // x6
    unsigned long long l;  // x21
    unsigned long long *v57;  // x3
    unsigned long v58;  // x10
    unsigned long long v14;  // x23
    unsigned long v59;  // x6
    unsigned long long v60;  // x11
    unsigned long v61;  // 4163
    unsigned long long v62;  // x7
    unsigned long long v63;  // x15
    unsigned long long v64;  // x13
    unsigned long long v65;  // x16
    unsigned long v66;  // cc_op
    unsigned long v67;  // cc_dep1
    unsigned long v68;  // cc_dep2
    unsigned long long v15;  // x24
    unsigned long long v69;  // x17
    unsigned long long *v70;  // x22
    unsigned long long *v71;  // x1
    unsigned long long *v72;  // x3
    unsigned long long v73;  // x11
    unsigned long v74;  // 4158
    unsigned long long v75;  // x13
    unsigned long long v76;  // x6
    unsigned long v77;  // 4165
    unsigned long long v78;  // x12
    unsigned long long v16;  // x9
    unsigned long v79;  // 4172
    unsigned long long v80;  // x6
    unsigned long v81;  // 4187
    unsigned long long *v82;  // x22
    unsigned long v83;  // 4165
    unsigned long long v84;  // x13
    unsigned long long v85;  // x6
    unsigned long v86;  // 4172
    unsigned long long v87;  // x12
    unsigned long v88;  // 4179
    unsigned long long *iter2;  // x2
    unsigned long long v89;  // x13
    unsigned long v90;  // 4186
    unsigned long long v91;  // x6
    unsigned long v92;  // 4193
    unsigned long long v93;  // x7
    unsigned long v94;  // 4200
    unsigned long v95;  // 4207
    unsigned long long v96;  // x23
    unsigned long long *v97;  // x22
    unsigned long v98;  // x14
    unsigned long long *v18;  // x1
    unsigned long long *v99;  // x3
    unsigned long long k;  // x21
    unsigned long v101;  // cc_op
    unsigned long v102;  // cc_dep2
    unsigned long v103;  // cc_ndep
    unsigned long v104;  // cc_dep1
    unsigned long long *v105;  // x1
    unsigned long long v106;  // 4121
    unsigned long long v107;  // x23
    unsigned long v108;  // x14
    char *v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    unsigned long long v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (!(a5 & 3))
    {
        if (a5 > 32)
            if (*(int *)&g_f0d570)
                goto LABEL_0x9d9880;
            else
                goto LABEL_9d963c;
LABEL_9d963c:
        if (!(a5 & 7))
            goto LABEL_0x9da2c0;
        if (!(a5 & 3))
            goto LABEL_0x9daca0;
        else
            goto LABEL_9d964c;
    }
LABEL_9d964c:
    v0 = &v8;
    v1 = v9;
    v2 = v10;
    v3 = v11;
    v4 = v12;
    v5 = v13;
    v6 = v14;
    v7 = v15;
    v16 = *a2;
    iter2 = a2 + 1;
    v18 = a1 + 16;
    v19 = a5 * 8;
    v20 = *a4;
    iter1 = &(&v0)[-1 * a5] & 0xfffffffffffffff0;
    v22 = a3 + 16;
    v23 = v16 * *(long long *)a1;
    i = v19 - 16;
    v25 = *(long long *)a1 * v16 >> 64;
    v26 = v16 * (long long)a1[8];
    v27 = (long long)a1[8] * v16 >> 64;
    v28 = v20 * v23;
    xsp = (int)iter1;
    v29 = v28 * (long long)a3[8];
    v30 = (long long)a3[8] * v28 >> 64;
    v31 = arm64g_calculate_flag_c(4, v23, 1, 0);
    v32 = (*(long long *)a3 * v28 >> 64) + v31;
    v33 = v18;
    v34 = v22;
    if (i)
    {
        do
        {
            v33 = v18 + 1;
            v35 = v26 + v25;
            i -= 8;
            v36 = arm64g_calculate_flag_c(2, v26, v25, 0);
            v25 = v27 + v36;
            v34 = v22 + 1;
            v37 = v29 + v32;
            v26 = v16 * *v18;
            v38 = arm64g_calculate_flag_c(2, v29, v32, 0);
            v27 = *v18 * v16 >> 64;
            v29 = v28 * *v22;
            v39 = arm64g_calculate_flag_c(2, v37, v35, 0);
            v32 = v30 + v38 + v39;
            v30 = *v22 * v28 >> 64;
            *iter1 = v37 + v35;
            iter1 += 1;
            v18 = v33;
            v22 = v34;
        } while (i);
    }
    v40 = v26 + v25;
    v41 = (char *)v33 - v19;
    v42 = arm64g_calculate_flag_c(2, v26, v25, 0);
    v43 = v27 + v42;
    v44 = v29 + v32;
    v45 = (char *)v34 - v19;
    v46 = arm64g_calculate_flag_c(2, v29, v32, 0);
    v47 = v30 + v46;
    j = v19 - 8;
    v49 = arm64g_calculate_flag_c(2, v44, v40, 0);
    v50 = arm64g_calculate_flag_c(6, v47, v43, v49);
    v51 = v50;
    *iter1 = v44 + v40;
    iter1[1] = v47 + v43 + v49;
    do
    {
        v52 = *iter2;
        iter2 += 1;
        v53 = v41 + 16;
        v54 = xsp + 8;
        v55 = v52 * *(long long *)v41;
        l = v19 - 16;
        v57 = v45 + 16;
        v58 = v52 * (long long)v41[8];
        v59 = v55 + *(long long *)xsp;
        v60 = (long long)v41[8] * v52 >> 64;
        v61 = arm64g_calculate_flag_c(2, v55, *(long long *)xsp, 0);
        v62 = (*(long long *)v41 * v52 >> 64) + v61;
        v63 = v20 * v59;
        j -= 8;
        v64 = *(long long *)v45 * v63 >> 64;
        v65 = v63 * (long long)v45[8];
        v66 = 4;
        v67 = v59;
        v68 = 1;
        v69 = (long long)v45[8] * v63 >> 64;
        v70 = v54;
        v71 = v53;
        v72 = v57;
        v73 = v60;
        if (l)
        {
            do
            {
                v71 = v53 + 1;
                v74 = arm64g_calculate_flag_c(v66, v67, v68, 0);
                v75 = v64 + v74;
                v70 = v54 + 1;
                v76 = v58 + v62;
                l -= 8;
                v77 = arm64g_calculate_flag_c(2, v58, v62, 0);
                v78 = v65 + v75;
                v72 = v57 + 1;
                v79 = arm64g_calculate_flag_c(2, v65, v75, 0);
                v64 = v69 + v79;
                v58 = v52 * *v53;
                v80 = v76 + *v54;
                v73 = *v53 * v52 >> 64;
                v81 = arm64g_calculate_flag_c(2, v76, *v54, 0);
                v62 = v60 + v77 + v81;
                v65 = v63 * *v57;
                v66 = 2;
                v67 = v78;
                v68 = v80;
                v69 = *v57 * v63 >> 64;
                *(unsigned long long *)((char *)v70 - 16) = v78 + v80;
                v54 = v70;
                v53 = v71;
                v57 = v72;
                v60 = v73;
            } while (l);
        }
        v82 = v70 + 1;
        v83 = arm64g_calculate_flag_c(v66, v67, v68, 0);
        v84 = v64 + v83;
        v85 = v58 + v62;
        v41 = (char *)v71 - v19;
        v86 = arm64g_calculate_flag_c(2, v58, v62, 0);
        v87 = v65 + v84;
        v45 = (char *)v72 - v19;
        v88 = arm64g_calculate_flag_c(2, v65, v84, 0);
        v89 = v69 + v51 + v88;
        v90 = arm64g_calculate_flag_c(6, v69, v51, v88);
        v91 = v85 + *v70;
        v92 = arm64g_calculate_flag_c(2, v85, *v70, 0);
        v93 = v73 + v86 + v92;
        v94 = arm64g_calculate_flag_c(2, v87, v91, 0);
        v95 = arm64g_calculate_flag_c(6, v89, v93, v94);
        v51 = v90 + v95;
        *(unsigned long long *)((char *)v82 - 16) = v87 + v91;
        *(unsigned long *)((char *)v82 - 8) = v89 + v93 + v94;
    } while (j);
    v96 = *(long long *)xsp;
    v97 = xsp + 8;
    v98 = *(long long *)v45;
    v99 = v45 + 8;
    k = v19 - 8;
    v101 = 4;
    v102 = 8;
    v103 = 0;
    v104 = v19;
    v105 = a0;
    do
    {
        v106 = arm64g_calculate_flag_c(v101, v104, v102, v103);
        v101 = 8;
        v104 = v96;
        v102 = v98;
        v103 = v106;
        v107 = *v97;
        v97 += 1;
        k -= 8;
        v108 = *v99;
        v99 += 1;
        *v105 = v96 - v98 - (v106 ^ 1);
        v105 += 1;
        v96 = v107;
        v98 = v108;
    } while (k);
    v109 = arm64g_calculate_flag_c(8, v104, v102, v103);
    v110 = arm64g_calculate_flag_c(8, v107, v108, v109);
    v111 = v51;
    v112 = v110;
    *v105 = v107 - v108 - (v109 ^ 1);
    v113 = *(long long *)xsp;
    node = xsp + 8;
    v115 = *a0;
    iter = a0 + 1;
    v117 = v19 - 16;
    v118 = arm64g_calculate_condition(56, v111, 0, v112);
    if (!(v118 & 1))
        goto LABEL_9d983e;
    while (1)
    {
        v119 = v113;
        while (1)
        {
            v113 = *node;
            node += 1;
            v115 = *iter;
            iter += 1;
            *(unsigned long long *)((char *)node - 16) = 0;
            *(unsigned long *)((char *)iter - 16) = v119;
            if (!v117)
            {
                v121 = arm64g_calculate_condition(56, v111, 0, v112);
                if (v121 & 1)
                    v122 = v113;
                else
                    v122 = v115;
                *(unsigned long long *)((char *)node - 8) = 0;
                *(unsigned long *)((char *)iter - 8) = v122;
                return 1;
            }
            v117 -= 8;
            v120 = arm64g_calculate_condition(56, v111, 0, v112);
            if (v120 & 1)
                break;
LABEL_9d983e:
            v119 = v115;
        }
    }
}
