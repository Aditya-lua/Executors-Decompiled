/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa216a0..0xa21a00 (864 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a216a0(unsigned long long *a0, unsigned long long *a1, unsigned long long *a2)
{
    unsigned long long v34;  // x30
    unsigned long long v35;  // x19
    unsigned long long v44;  // x28
    unsigned long long v45;  // x25
    unsigned long long v46;  // x24
    unsigned long long v47;  // x14
    unsigned long long v48;  // x15
    unsigned long long v49;  // x16
    unsigned long long v50;  // x17
    unsigned long long v52;  // x0
    unsigned long long v53;  // x11
    unsigned long long v36;  // x20
    unsigned long v54;  // cc_dep1
    unsigned long long v55;  // x17
    unsigned long long v56;  // x8
    unsigned long long v57;  // 4105
    unsigned long long v58;  // 4105
    unsigned long long v59;  // x9
    unsigned long long v60;  // x4
    unsigned long long v61;  // x5
    unsigned long long v62;  // 4113
    unsigned long long v63;  // 4113
    unsigned long long v37;  // x21
    unsigned long long v64;  // x10
    unsigned long long v65;  // 4105
    unsigned long long v66;  // 4105
    unsigned long v67;  // cc_dep1
    unsigned long long v68;  // x14
    unsigned long long v69;  // 4105
    unsigned long long v70;  // 4105
    unsigned long long v71;  // x15
    unsigned long long v72;  // x8
    unsigned long long v73;  // x9
    unsigned long long v38;  // x22
    unsigned long long v74;  // 4113
    unsigned long long v75;  // 4113
    unsigned long long v76;  // x16
    unsigned long long v77;  // 4105
    unsigned long long v78;  // 4105
    unsigned long long v79;  // x10
    unsigned long long v80;  // x11
    unsigned long v81;  // cc_dep1
    unsigned long long v82;  // x17
    unsigned long long v83;  // x8
    unsigned long long v39;  // x23
    unsigned long long v84;  // 4105
    unsigned long long v85;  // 4105
    unsigned long long v86;  // x9
    unsigned long long v87;  // x4
    unsigned long long v88;  // x5
    unsigned long long v89;  // 4113
    unsigned long long v90;  // 4113
    unsigned long long v91;  // x10
    unsigned long long v92;  // 4105
    unsigned long long v93;  // 4105
    unsigned long long v40;  // x24
    unsigned long v94;  // cc_dep1
    unsigned long long v95;  // x14
    unsigned long long v96;  // 4105
    unsigned long long v97;  // 4105
    unsigned long long v98;  // x15
    unsigned long long v99;  // x8
    unsigned long long v100;  // x9
    unsigned long long v101;  // 4113
    unsigned long long v102;  // 4113
    unsigned long long v103;  // x16
    unsigned long long v41;  // x25
    unsigned long long v104;  // 4105
    unsigned long long v105;  // 4105
    unsigned long long v106;  // x10
    unsigned long long v107;  // x11
    unsigned long v108;  // cc_dep1
    unsigned long long v109;  // x17
    unsigned long long v110;  // x8
    unsigned long long v111;  // 4105
    unsigned long long v112;  // 4105
    unsigned long long v113;  // x9
    unsigned long long v42;  // x26
    unsigned long long v114;  // 4105
    unsigned long long v115;  // 4105
    unsigned long long v116;  // x10
    unsigned long long v117;  // 4105
    unsigned long long v118;  // 4105
    unsigned long v119;  // cc_dep1
    unsigned long long v120;  // x14
    unsigned long long v121;  // 4105
    unsigned long long v122;  // 4105
    unsigned long long v123;  // x15
    unsigned long long v43;  // x27
    unsigned long long v124;  // 4105
    unsigned long long v125;  // 4105
    unsigned long long v126;  // x16
    unsigned long long v127;  // 4105
    unsigned long long v128;  // 4105
    char v0;  // [bp-0x1e0]
    unsigned long long v1;  // [bp-0x1d8]
    unsigned long long v2;  // [bp-0x1d0]
    unsigned long long v3;  // [bp-0x1c8]
    char v4;  // [bp-0x1c0]
    unsigned long long v5;  // [bp-0x1b8]
    unsigned long long v6;  // [bp-0x1b0]
    unsigned long long v7;  // [bp-0x1a8]
    unsigned long long v8;  // [bp-0x1a0]
    unsigned long long v9;  // [bp-0x198]
    unsigned long long v10;  // [bp-0x190]
    unsigned long long v11;  // [bp-0x188]
    char v12;  // [bp-0x180]
    char v13;  // [bp-0x160]
    char v14;  // [bp-0x140]
    char v15;  // [bp-0x120]
    char v16;  // [bp-0x100]
    char v17;  // [bp-0xe0]
    char v18;  // [bp-0xc0]
    char v19;  // [bp-0xa0]
    char v20;  // [bp-0x80]
    char *v21;  // [bp-0x60]
    unsigned long long v22;  // [bp-0x58]
    unsigned long long v23;  // [bp-0x50]
    unsigned long long v24;  // [bp-0x48]
    unsigned long long v25;  // [bp-0x40]
    unsigned long long v26;  // [bp-0x38]
    unsigned long long v27;  // [bp-0x30]
    unsigned long long v28;  // [bp-0x28]
    unsigned long long v29;  // [bp-0x20]
    unsigned long long v30;  // [bp-0x18]
    unsigned long long v31;  // [bp-0x10]
    unsigned long long v32;  // [bp-0x8]
    char v33;  // [bp+0x0]

    v21 = &v33;
    v22 = v34;
    v23 = v35;
    v24 = v36;
    v25 = v37;
    v26 = v38;
    v27 = v39;
    v28 = v40;
    v29 = v41;
    v30 = v42;
    v31 = v43;
    v32 = v44;
    if (!a2[8] && !a2[9] && !a2[10] && !a2[11])
        v45 = 0;
    else
        v45 = 0xffffffffffffffff;
    sub_a211f0();
    if (!a1[8] && !a1[9] && !a1[10] && !a1[11])
        v46 = 0;
    else
        v46 = 0xffffffffffffffff;
    sub_a211f0();
    sub_a21010(&v19);
    sub_a21010(&v20);
    sub_a21010(&v19);
    sub_a21010(&v20);
    sub_a213b0(&v14);
    sub_a21010(&v17);
    sub_a21010(&v18);
    sub_a213b0(&v12);
    if (v47 || v48 || v49 || v50 || ~v46 || ~v45)
    {
        sub_a211f0(&v15);
        sub_a21010(&v8);
        sub_a211f0(&v13);
        sub_a21010(&v8);
        sub_a21010(&v16);
        sub_a21010(&v18);
        sub_a21360(&v13);
        sub_a213b0(sub_a21400(&v0));
        sub_a21400(&v4);
        sub_a21010(&v20);
        v52 = sub_a213b0(sub_a21010(&v4));
        v53 = a2[3];
        v54 = v46;
        v55 = a1[3];
        if (v46)
        {
            v56 = v0;
            v57 = arm64g_calculate_condition(20, v54, 0, 0);
            if (!(v57 & 1))
                goto LABEL_a2192a;
LABEL_a21929:
            v59 = v1;
            v60 = v4;
            v61 = v5;
            v62 = arm64g_calculate_condition(20, v54, 0, 0);
            if (!(v62 & 1))
                goto LABEL_a21932;
LABEL_a21931:
            v64 = v2;
            v65 = arm64g_calculate_condition(20, v54, 0, 0);
            if (!(v65 & 1))
                goto LABEL_a21936;
LABEL_a21935:
            v53 = v3;
        }
        else
        {
            v56 = *a2;
            v58 = arm64g_calculate_condition(20, v54, 0, 0);
            if (v58 & 1)
                goto LABEL_a21929;
LABEL_a2192a:
            v59 = a2[1];
            v60 = v4;
            v61 = v5;
            v63 = arm64g_calculate_condition(20, v54, 0, 0);
            if (v63 & 1)
                goto LABEL_a21931;
LABEL_a21932:
            v64 = a2[2];
            v66 = arm64g_calculate_condition(20, v54, 0, 0);
            if (v66 & 1)
                goto LABEL_a21935;
LABEL_a21936:
        }
        v67 = v45;
        if (v45)
        {
            v68 = v56;
            v69 = arm64g_calculate_condition(20, v67, 0, 0);
            if (!(v69 & 1))
                goto LABEL_a21946;
LABEL_a21945:
            v71 = v59;
            v72 = a2[4];
            v73 = a2[5];
            v74 = arm64g_calculate_condition(20, v67, 0, 0);
            if (!(v74 & 1))
                goto LABEL_a2194e;
LABEL_a2194d:
            v76 = v64;
            v77 = arm64g_calculate_condition(20, v67, 0, 0);
            if (!(v77 & 1))
                goto LABEL_a21952;
LABEL_a21951:
        }
        else
        {
            v68 = *a1;
            v70 = arm64g_calculate_condition(20, v67, 0, 0);
            if (v70 & 1)
                goto LABEL_a21945;
LABEL_a21946:
            v71 = a1[1];
            v72 = a2[4];
            v73 = a2[5];
            v75 = arm64g_calculate_condition(20, v67, 0, 0);
            if (v75 & 1)
                goto LABEL_a2194d;
LABEL_a2194e:
            v76 = a1[2];
            v78 = arm64g_calculate_condition(20, v67, 0, 0);
            if (v78 & 1)
                goto LABEL_a21951;
LABEL_a21952:
            v53 = v55;
        }
        v79 = a2[6];
        v80 = a2[7];
        *a0 = v68;
        a0[1] = v71;
        a0[2] = v76;
        a0[3] = v53;
        v81 = v46;
        v82 = a1[7];
        if (v46)
        {
            v83 = v60;
            v84 = arm64g_calculate_condition(20, v81, 0, 0);
            if (!(v84 & 1))
                goto LABEL_a21972;
LABEL_a21971:
            v86 = v61;
            v87 = v8;
            v88 = v9;
            v89 = arm64g_calculate_condition(20, v81, 0, 0);
            if (!(v89 & 1))
                goto LABEL_a2197a;
LABEL_a21979:
            v91 = v6;
            v92 = arm64g_calculate_condition(20, v81, 0, 0);
            if (!(v92 & 1))
                goto LABEL_a2197e;
LABEL_a2197d:
            v80 = v7;
        }
        else
        {
            v83 = v72;
            v85 = arm64g_calculate_condition(20, v81, 0, 0);
            if (v85 & 1)
                goto LABEL_a21971;
LABEL_a21972:
            v86 = v73;
            v87 = v8;
            v88 = v9;
            v90 = arm64g_calculate_condition(20, v81, 0, 0);
            if (v90 & 1)
                goto LABEL_a21979;
LABEL_a2197a:
            v91 = v79;
            v93 = arm64g_calculate_condition(20, v81, 0, 0);
            if (v93 & 1)
                goto LABEL_a2197d;
LABEL_a2197e:
        }
        v94 = v45;
        if (v45)
        {
            v95 = v83;
            v96 = arm64g_calculate_condition(20, v94, 0, 0);
            if (!(v96 & 1))
                goto LABEL_a2198e;
LABEL_a2198d:
            v98 = v86;
            v99 = a2[8];
            v100 = a2[9];
            v101 = arm64g_calculate_condition(20, v94, 0, 0);
            if (!(v101 & 1))
                goto LABEL_a21996;
LABEL_a21995:
            v103 = v91;
            v104 = arm64g_calculate_condition(20, v94, 0, 0);
            if (!(v104 & 1))
                goto LABEL_a2199a;
LABEL_a21999:
            v82 = v80;
        }
        else
        {
            v95 = a1[4];
            v97 = arm64g_calculate_condition(20, v94, 0, 0);
            if (v97 & 1)
                goto LABEL_a2198d;
LABEL_a2198e:
            v98 = a1[5];
            v99 = a2[8];
            v100 = a2[9];
            v102 = arm64g_calculate_condition(20, v94, 0, 0);
            if (v102 & 1)
                goto LABEL_a21995;
LABEL_a21996:
            v103 = a1[6];
            v105 = arm64g_calculate_condition(20, v94, 0, 0);
            if (v105 & 1)
                goto LABEL_a21999;
LABEL_a2199a:
        }
        v106 = a2[10];
        v107 = a2[11];
        a0[4] = v95;
        a0[5] = v98;
        a0[6] = v103;
        a0[7] = v82;
        v108 = v46;
        v109 = a1[11];
        if (v46)
        {
            v110 = v87;
            v111 = arm64g_calculate_condition(20, v108, 0, 0);
            if (!(v111 & 1))
                goto LABEL_a219ba;
LABEL_a219b9:
            v113 = v88;
            v114 = arm64g_calculate_condition(20, v108, 0, 0);
            if (!(v114 & 1))
                goto LABEL_a219be;
LABEL_a219bd:
            v116 = v10;
            v117 = arm64g_calculate_condition(20, v108, 0, 0);
            if (!(v117 & 1))
                goto LABEL_a219c2;
LABEL_a219c1:
            v107 = v11;
        }
        else
        {
            v110 = v99;
            v112 = arm64g_calculate_condition(20, v108, 0, 0);
            if (v112 & 1)
                goto LABEL_a219b9;
LABEL_a219ba:
            v113 = v100;
            v115 = arm64g_calculate_condition(20, v108, 0, 0);
            if (v115 & 1)
                goto LABEL_a219bd;
LABEL_a219be:
            v116 = v106;
            v118 = arm64g_calculate_condition(20, v108, 0, 0);
            if (v118 & 1)
                goto LABEL_a219c1;
LABEL_a219c2:
        }
        v119 = v45;
        if (v45)
        {
            v120 = v110;
            v121 = arm64g_calculate_condition(20, v119, 0, 0);
            if (!(v121 & 1))
                goto LABEL_a219ce;
LABEL_a219cd:
            v123 = v113;
            v124 = arm64g_calculate_condition(20, v119, 0, 0);
            if (!(v124 & 1))
                goto LABEL_a219d2;
LABEL_a219d1:
            v126 = v116;
            v127 = arm64g_calculate_condition(20, v119, 0, 0);
            if (!(v127 & 1))
                goto LABEL_a219d6;
LABEL_a219d5:
            v109 = v107;
        }
        else
        {
            v120 = a1[8];
            v122 = arm64g_calculate_condition(20, v119, 0, 0);
            if (v122 & 1)
                goto LABEL_a219cd;
LABEL_a219ce:
            v123 = a1[9];
            v125 = arm64g_calculate_condition(20, v119, 0, 0);
            if (v125 & 1)
                goto LABEL_a219d1;
LABEL_a219d2:
            v126 = a1[10];
            v128 = arm64g_calculate_condition(20, v119, 0, 0);
            if (v128 & 1)
                goto LABEL_a219d5;
LABEL_a219d6:
        }
        a0[8] = v120;
        a0[9] = v123;
        a0[10] = v126;
        a0[11] = v109;
        return v52;
    }
}
