/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x546c94..0x54764c (2488 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_546c94_0 {
    char field_0;
} st_546c94_0;

typedef struct st_546c94_2 {
    char padding_0[1536];
    struct st_546c94_0 *field_600;
    char padding_608[120];
    struct st_546c94_0 *field_680;
} st_546c94_2;

typedef struct st_546c94_1 {
    char padding_0[96];
    struct st_546c94_2 *field_60;
} st_546c94_1;

extern unsigned long long g_e82420;
extern st_546c94_1 *g_f0d198;

void sub_546c94(void)
{
    unsigned long long v11;  // x24
    unsigned long long v12;  // x23
    unsigned int v21;  // w13
    unsigned int v111;  // w4
    unsigned int v112;  // w6
    unsigned int v113;  // w5
    unsigned int v114;  // w4
    unsigned int v115;  // w4
    unsigned int v116;  // w6
    unsigned int v117;  // w6
    unsigned int v118;  // w7
    unsigned int v119;  // w20
    unsigned int v120;  // w4
    unsigned int v22;  // w11
    unsigned int v121;  // w5
    unsigned int v122;  // w4
    unsigned int v123;  // w5
    unsigned int v124;  // w7
    unsigned int v125;  // w4
    unsigned int v126;  // w5
    unsigned int v127;  // w4
    unsigned int v23;  // w15
    unsigned int v24;  // w11
    unsigned int v25;  // w12
    unsigned int v26;  // w12
    unsigned int v27;  // w13
    unsigned int v28;  // w14
    unsigned int v29;  // w12
    unsigned int v30;  // w12
    unsigned long long v13;  // x22
    unsigned int v31;  // w13
    unsigned int v32;  // w14
    unsigned int v33;  // w12
    int v34;  // w13
    unsigned int v35;  // w3
    unsigned int v36;  // w5
    unsigned int v37;  // w20
    unsigned int v38;  // w3
    unsigned int v39;  // w4
    unsigned int v40;  // w3
    unsigned long long v14;  // x21
    unsigned int v41;  // w3
    unsigned int v42;  // w5
    unsigned int v43;  // w4
    unsigned int v45;  // w3
    unsigned int v46;  // w4
    unsigned int v47;  // w5
    unsigned int v48;  // w5
    unsigned int v49;  // w3
    unsigned int v50;  // w3
    unsigned long long v15;  // x20
    unsigned int v51;  // w3
    unsigned int v52;  // w4
    unsigned int v53;  // w5
    unsigned int v54;  // w3
    unsigned int v55;  // w3
    unsigned int v56;  // w4
    unsigned int v57;  // w3
    unsigned int v58;  // w4
    unsigned int v59;  // w3
    unsigned int v60;  // w4
    unsigned long long v16;  // x19
    char *v61;  // x9
    unsigned int v62;  // w10
    unsigned int v63;  // w11
    unsigned int v64;  // w14
    unsigned int v65;  // w13
    unsigned int v66;  // w15
    unsigned int v67;  // w12
    unsigned int v68;  // w10
    unsigned int v69;  // w10
    unsigned int v70;  // w10
    unsigned long long v17;  // x30
    unsigned int v71;  // w11
    unsigned int v72;  // w4
    unsigned int v73;  // w5
    unsigned int v74;  // w7
    unsigned int v75;  // w5
    unsigned int v76;  // w6
    unsigned int v77;  // w4
    unsigned int v78;  // w4
    unsigned int v79;  // w19
    unsigned int v80;  // w5
    st_546c94_0 **v18;  // x9
    unsigned int v81;  // w4
    unsigned int v82;  // w6
    unsigned int v83;  // w4
    unsigned int v84;  // w5
    unsigned int v85;  // w4
    unsigned int v86;  // w5
    unsigned int v87;  // w7
    unsigned int v88;  // w4
    unsigned int v89;  // w4
    unsigned int v90;  // w5
    char *v19;  // x10
    unsigned int v91;  // w7
    unsigned int v92;  // w6
    unsigned int v93;  // w19
    unsigned int v94;  // w4
    unsigned int v95;  // w4
    unsigned int v96;  // w5
    unsigned int v97;  // w6
    unsigned int v98;  // w4
    unsigned int v99;  // w4
    unsigned int v100;  // w5
    unsigned int v20;  // w12
    unsigned int v101;  // w4
    unsigned int v102;  // w5
    unsigned int v103;  // w19
    unsigned int v104;  // w4
    unsigned int v105;  // w7
    unsigned int v106;  // w4
    unsigned int v107;  // w4
    unsigned int v108;  // w5
    unsigned int v109;  // w7
    unsigned int v110;  // w6
    char *v0;  // [bp-0x50], Other Possible Types: char, unsigned int
    char *v1;  // [bp-0x48], Other Possible Types: unsigned int
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = v15;
    v7 = v16;
    v8 = &v10;
    v9 = v17;
    v18 = g_f0d198->field_60;
    v1 = &v0;
    v0 = &v1;
    v19 = v18[208];
    if (v19)
    {
        v20 = (unsigned int)v1;
        v21 = (unsigned int)v0;
        v22 = ((v21 | v20) & -v20) * 4 + ((v21 | v20) ^ -v20) * 2;
        v23 = v21 + v20;
        v24 = v23 + ~v22 + ((unsigned int)(v20 - v21 - (v20 | -v21)) + (-v21 & ~v20)) * 2 + v22 * 2 + 2;
        v25 = (v20 & ~(v21 + (0xffffffff ^ v21 * 2))) * 2 - v23;
        v26 = (~v24 + v24 * 2 ^ v25 | 0xfffffffe) + (-((~v24 + v24 * 2 ^ v25) + (~v24 + v24 * 2 & v25) * 2) | 1) + ((~v24 + v24 * 2 ^ v25) + (~v24 + v24 * 2 & v25) * 2) * 2;
        v27 = v26 + 1;
        v28 = v26 + 2 + (v26 + 2 + ~v27 * 2 | 53);
        v29 = (v27 & 53) - (v26 + 55) + (v26 + 55 - (v27 & 53)) * 2;
        v0 = (v28 ^ v29) + (v28 & v29) * 2 - 1;
        v1 = (v27 * 2 & 56 ^ 56) + (v27 * 2 & 56) + v27 - 29;
        v30 = v0;
        v31 = v1;
        v32 = (v31 - v30 + (v30 | ~v31) ^ v30 + 1) + (v31 - v30 + (v30 | ~v31) & v30 + 1) * 2;
        v33 = v30 - v31 + (v31 & v30) + (v31 & ~v30) * 2;
        v34 = v32 + (v33 | ~v32) + (v32 | v33) + 1;
        while (1)
        {
            v35 = v1;
            v36 = v0;
            v37 = v36 + v35;
            v38 = v37 + (-v35 & ~v36) * 2 + (unsigned int)(v36 - v35 - (v36 | -v35)) * 2;
            v39 = ((0x7ffffffd + v36 * 2 + ~v36 * 4 + (v36 ^ 1) + (v36 * 2 & 2) + 5 | ~v35) + v35) * 2;
            v40 = ~(v38 + v39 + ((unsigned int)(0xfffffffd - v39) | ~v38) + (v39 + 2 & v38)) + v37 + ((v36 ^ v35) - (v36 | v35 | -(v36 & v35)) + (-(v36 & v35) & ~(v36 | v35))) * 2;
            v41 = ((unsigned int)(2 - v40) | 1) + v40 - 2 + (~(v40 - 2) + (v40 - 2) * 2 | 1);
            v42 = v41 | 143;
            v43 = (v41 + 143 ^ -v42) + (v41 + 143 & -v42) * 2;
            v0 = (char *)_INSERT(CONCAT(v0, 0), 0, (v43 | v42) + (v43 & v42));
            v1 = (char *)_INSERT(CONCAT(v1, 0), 0, (v41 + 57 ^ -(v41 | 57)) + (v41 | 57) + (v41 + 57 & -(v41 | 57)) * 2);
            if ((int)((unsigned int)v1 + ~(unsigned int)v1 * 2 + (unsigned int)v0 + ((unsigned int)v0 + (~((unsigned int)v1 + ~(unsigned int)v1 * 2) | ~(unsigned int)v0) + (~((unsigned int)v1 + ~(unsigned int)v1 * 2) & ~(unsigned int)v0)) * 2 + 2) <= v34)
                break;
            v45 = (unsigned int)v1;
            v46 = (unsigned int)v0;
            v47 = 1 | (v45 + v46 + (0xffffffff ^ v45 * 2) + ~(v45 + v46 + (0xffffffff ^ v45 * 2) + (v45 | ~v46))) * 2;
            v48 = (v47 ^ v45 - v46) + (v47 & v45 - v46) * 2;
            v49 = v46 - v45 + ((v46 | v45) ^ -v46) * 2 + ((v46 | v45) & -v46) * 4;
            v50 = v48 - v49 + v48 + ~v49 + (v48 + ~v49 | 0xfffffffe) + (-(v48 + ~v49) | 1);
            v0 = (unsigned int)((v50 & 19) + v50 * 2 - (v50 * 2 | 0xffffffd9)) + (v50 + ~v50 * 2 + 1 | 19) - 19;
            v1 = (v50 & 0xfffffffe) + (v50 | 0xfffffffe) + 183;
            v51 = v0;
            v52 = v1;
            v53 = v52 & v51;
            v54 = v51 - v52 + v53 + (v52 & ~v51) * 2;
            v19[v34] = v19[2 * (v34 + 1 | ~((v53 | v54) + (v54 & v53))) + 2 * (v54 & v53) + 2 * (v53 | v54) + 2 * ((1 | v34 * 2) - v34 & ~((v53 | v54) + (v54 & v53))) + (v54 & v53) + (v53 | v54) + -1 * v34];
            v55 = v0;
            v56 = v55 + (-(v55 & 3) & ~(v55 | 3)) * 2 + ((v55 ^ 3) - (v55 | 3 | -(v55 & 3))) * 2 + 3;
            v57 = (v56 | v55) - (v56 & v55);
            v58 = v57 + ~v57 * 2 + 1;
            v59 = v57 + v57 - (v57 | 1) + (v58 + (~v58 | 1)) * 2 + 2;
            v60 = v59 + (~v59 | 1) + 1;
            v34 = (v60 + (v59 | 1) ^ (v59 ^ 0xfffffffe) - v60 + 1) + v34 + (v60 + (v59 | 1) + ((v59 ^ 0xfffffffe) - v60 + 1 | ~(v60 + (v59 | 1)))) * 2 + 2;
        }
    }
    v61 = v18[192];
    if (v61)
    {
        v62 = (unsigned int)v1;
        v63 = (unsigned int)v0;
        v64 = v62 + 1;
        v65 = v64 + ~v62 * 2;
        v66 = v65 | v63;
        v67 = (v66 ^ v64) + (v66 & v64) * 2 + (v62 | v63) + (-((v66 ^ v64) + (v66 & v64) * 2) & ~(v62 | v63)) * 2 + ((v62 | v63) + (-((v66 ^ v64) + (v66 & v64) * 2) | ~(v62 | v63))) * 2 + 2;
        v68 = (v64 + v63 + v65 + ~v66 ^ -(v63 & v62)) + ((unsigned int)(v64 + v63 + v65 - v66) + ((unsigned int)(v66 - (v64 + v63 + v65)) | -(v63 & v62))) * 2;
        v69 = v68 + ~v68 * 2 + 1;
        v70 = (v67 | v69) + (v69 & v67);
        v0 = v70 + 80;
        v1 = v70 + 2;
        v71 = (unsigned int)(v0 + v1 * 2 + (v1 ^ 0xfffffffe) - (v1 * 2 & 2)) + 2;
        while (1)
        {
            v72 = v1;
            v73 = v0;
            v74 = v73 | v72;
            v75 = ((~v72 & ~v73) + v74 * 2 + 1 ^ (v72 & ~v73) - v72) + ((~v72 & ~v73) + v74 * 2 + ((v72 & ~v73) - v72 | (unsigned int)(0xfffffffe - ((~v72 & ~v73) + v74 * 2)))) * 2;
            v76 = v75 + 4;
            v77 = (v73 + v72 ^ -v74) + (v73 + v72 & -v74) * 2;
            v78 = v77 + v74 + (-v77 & ~v74) * 2 + (v74 + (-v77 | ~v74)) * 2;
            v79 = 0xfffffffe - v78;
            v80 = v75 + 5;
            v81 = (v80 - (v78 + 2) + (v78 + 1 | ~v76) ^ v78 + 2 - v76 + (v76 | v79)) + (v80 - (v78 + 2) + (v78 + 1 | ~v76) & v78 + 2 - v76 + (v76 | v79)) * 2;
            v82 = v80 + ~v76 * 2 | v79;
            v83 = v81 + ((v82 & v80) * 4 + (v82 ^ v80) * 2 | ~v81) + (v81 | (v82 & v80) * 4 + (v82 ^ v80) * 2);
            v84 = v83 + 1;
            v85 = v83 + 2;
            v86 = v85 + ~v84 * 2;
            v87 = ((v86 | 100) ^ v85) + ((v86 | 100) & v85) * 2;
            v88 = v85 + v86 - (v86 & 0xffffff9b);
            v0 = (v83 + 101 ^ -(v84 | 100)) + (v84 | 100) + (v83 + 101 & -(v84 | 100)) * 2;
            v1 = (v87 ^ v88) + (v87 & v88) * 2 - 1;
            if ((int)(v0 - v1 + (v1 & v0) + (v0 + ~v0 * 2 ^ ~(v0 + ~v0 * 2 + 1 | v1)) + (((v0 + ~v0 * 2 + 1 | v1) & ~(v0 + ~v0 * 2)) + (v1 & ~v0)) * 2) <= (int)v71)
                break;
            v89 = v1;
            v90 = v0;
            v91 = v89 & ~v90;
            v92 = v89 + v90 + (-v90 & ~v89) * 2 + (unsigned int)(v89 - v90 - (v89 | -v90)) * 2 + (v90 - v89 + v91) * 4 + (0xffffffff ^ (v90 - v89 + v91) * 2);
            v93 = v92 + 2;
            v94 = (v90 & v89) - (v89 + (v89 | ~v90));
            v95 = (v94 + v91 * 2 | 1) + (v94 & 1);
            v96 = 2 - v95;
            v97 = 0xfffffffe - v92;
            v98 = v93 - v95 + (v95 - 3 | v97) + 2;
            v99 = (v98 ^ -v93 - (v96 | v97)) + (v98 & -v93 - (v96 | v97)) * 2;
            v100 = ((v93 - v93 * 2 | v96) & -(v93 - v93 * 2)) * 4 + ((v93 - v93 * 2 | v96) ^ -(v93 - v93 * 2)) * 2;
            v101 = v99 + v100 + (v100 | ~v99) + (v99 & ~v100);
            v102 = v101 + 1;
            v103 = v102 & 154;
            v104 = v101 + 2;
            v105 = ((v103 ^ 154) + (v102 ^ 0xffffff65) ^ v104) + ((v103 ^ 154) + (v102 ^ 0xffffff65) & v104) * 2;
            v106 = v104 + v103 + (308 & ~(v102 * 2));
            v0 = v101 + 47;
            v1 = v106 + v105 + ((unsigned int)(154 - v106) | ~v105) + (v105 & v106 - 155) - 154;
            v107 = v0;
            v108 = v1;
            v109 = v107 + 1;
            v110 = v109 + ~v107 * 2 | v108;
            v111 = ((v110 ^ v109) + (v110 & v109) * 2 ^ (v108 | v107) + 1) + ((v110 ^ v109) + (v110 & v109) * 2 & (v108 | v107) + 1) * 2;
            v112 = v71 * 3 + ~v71 * 4;
            v113 = ~v111 + v111 * 2 ^ (unsigned int)(0xfffffffd - v112);
            v114 = v113 + (((unsigned int)(0x7ffffffd - v112) | -v111) + v111) * 2;
            v61[v71] = v61[(v114 | 1) + (v113 | 0xfffffffe)];
            v115 = v0;
            v116 = v115 + ~v115 * 2 + 63;
            v117 = ((0xffffff84 & v115 * 2 | 1) ^ v116) + ((0xffffff84 & v115 * 2 | 1) & v116) * 2;
            v118 = ~v117 + v117 * 2;
            v119 = v118 - v117 * 4 + v118 * 2 + 3;
            v120 = v118 + v115 + (-v117 & -v115) * 2 + ((-v117 | -v115) + v117) * 2;
            v121 = (v119 + v115 & -(v119 | v115)) * 4 + (v119 + v115 ^ -(v119 | v115)) * 2 | 1;
            v122 = (v121 ^ v120) + (v121 & v120) * 2;
            v123 = v122 - 1;
            v124 = v122 - v122 * 2 + (v123 | 0xfffffffe) + 2;
            v125 = v123 + (v124 ^ v122);
            v126 = v125 + (unsigned int)((v124 & v122) - ((-v122 | 1) + v123)) * 2;
            v127 = ((-v126 & 0xfffffffe) + v126 | 1) + (v125 & 1) + 1;
            v71 = (v127 ^ v71) + (v71 + (v127 | ~v71)) * 2 + 1;
        }
    }
    (g_e82420 - 0xe0de7300)();
}
