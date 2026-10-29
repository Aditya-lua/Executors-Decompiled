/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ec168..0x9ec8a8 (1856 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ec168_0 {
    char field_0;
    char field_1;
    unsigned short field_2;
    char field_4;
    char field_5;
    unsigned short field_6;
    char field_8;
    char field_9;
    unsigned short field_a;
    char field_c;
    char field_d;
    unsigned short field_e;
    unsigned int field_10;
    unsigned int field_14;
    unsigned int field_18;
    unsigned int field_1c;
} st_9ec168_0;

typedef struct st_9ec168_1 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_9ec168_1;

extern st_9ec168_1 g_d32ee8;
extern st_9ec168_1 g_d336e8;
extern char g_1000000;

unsigned int sub_9ec168(unsigned int a0, st_9ec168_0 *a1, unsigned int *a2)
{
    unsigned int v15;  // w8
    unsigned long v16;  // x9
    unsigned int v25;  // w14
    unsigned long long v115;  // x12
    unsigned long long v116;  // x13
    unsigned long long v117;  // x15
    unsigned int v118;  // w14
    unsigned int v119;  // w0
    unsigned int v120;  // w19
    unsigned int v121;  // w22
    unsigned int v122;  // w23
    unsigned int v123;  // w21
    unsigned int v124;  // w20
    unsigned int v26;  // w12
    unsigned int v125;  // w24
    unsigned int v126;  // w8
    unsigned int v127;  // w10
    unsigned int v128;  // w8
    unsigned int v129;  // w3
    unsigned int v130;  // w3
    unsigned int v131;  // w4
    unsigned int v132;  // w3
    unsigned int v133;  // w5
    unsigned int v134;  // w3
    unsigned int v27;  // w15
    unsigned int v135;  // w7
    unsigned int v136;  // w8
    unsigned int v137;  // w10
    unsigned int v138;  // w3
    unsigned int v139;  // w4
    unsigned int v140;  // w8
    unsigned int v141;  // w10
    unsigned int v142;  // w3
    unsigned int v143;  // w4
    unsigned int v144;  // w8
    unsigned long v28;  // x14
    unsigned int v145;  // w0
    unsigned int v146;  // w3
    unsigned int v147;  // w5
    unsigned int v148;  // w8
    unsigned int v149;  // w10
    unsigned int v150;  // w3
    unsigned int v151;  // w4
    unsigned int v152;  // w8
    unsigned int v153;  // w10
    unsigned int v154;  // w0
    unsigned int v29;  // w16
    unsigned int v155;  // w17
    unsigned int v156;  // w8
    unsigned int v157;  // w16
    unsigned int v158;  // w0
    unsigned int v159;  // w1
    unsigned int v160;  // w8
    unsigned int v161;  // w8
    unsigned int v162;  // w11
    unsigned int v163;  // w10
    unsigned int v164;  // w9
    unsigned int v30;  // w14
    unsigned int v165;  // w12
    unsigned int v166;  // w13
    unsigned int v167;  // w11
    unsigned int v168;  // w8
    unsigned int v169;  // w14
    unsigned int v170;  // w16
    unsigned int v171;  // w10
    unsigned int v172;  // w12
    unsigned int v31;  // w6
    unsigned int v32;  // w1
    unsigned int v33;  // w16
    unsigned int v34;  // w17
    unsigned int v17;  // w10
    unsigned long v35;  // x16
    unsigned int v36;  // w16
    unsigned long v37;  // x17
    unsigned int v38;  // w3
    unsigned int v39;  // w4
    unsigned int v40;  // w5
    unsigned long v41;  // x17
    unsigned long v42;  // x17
    unsigned long long v43;  // x28
    unsigned long long v44;  // x27
    unsigned int v18;  // w9
    unsigned long long v45;  // x26
    unsigned long long v46;  // x25
    unsigned long long v47;  // x24
    unsigned long long v48;  // x23
    unsigned long long v49;  // x22
    unsigned long long v50;  // x21
    unsigned long long v51;  // x20
    unsigned long long v52;  // x19
    unsigned long long v53;  // x30
    unsigned int v54;  // w19
    unsigned int v19;  // w10
    unsigned int v55;  // w19
    unsigned int v56;  // w20
    unsigned int v57;  // w6
    unsigned int v58;  // w19
    unsigned int v59;  // w21
    unsigned int v60;  // w1
    unsigned int v61;  // w19
    unsigned int v62;  // w20
    unsigned int v63;  // w21
    unsigned int v64;  // w17
    unsigned long v20;  // x11
    unsigned int v65;  // w16
    unsigned int v66;  // w6
    unsigned int v67;  // w6
    unsigned int v68;  // w1
    unsigned int v69;  // w6
    unsigned int v70;  // w0
    unsigned int v71;  // w3
    unsigned int v72;  // w4
    unsigned int v73;  // w5
    unsigned int v74;  // w7
    unsigned int v21;  // w12
    unsigned int v75;  // w19
    unsigned int v76;  // w1
    unsigned int v77;  // w6
    unsigned int v78;  // w16
    unsigned int v79;  // w17
    unsigned int v80;  // w0
    unsigned int v81;  // w3
    unsigned int v82;  // w4
    unsigned int v83;  // w5
    unsigned int v84;  // w0
    unsigned int v22;  // w11
    unsigned int v85;  // w3
    unsigned int v86;  // w1
    unsigned int v87;  // w6
    unsigned int v88;  // w16
    unsigned int v89;  // w17
    unsigned int v90;  // w9
    unsigned int v91;  // w11
    unsigned int v92;  // w12
    unsigned int v93;  // w8
    unsigned int v94;  // w13
    unsigned int v23;  // w13
    unsigned int v95;  // w14
    unsigned int v96;  // w10
    unsigned int v97;  // w15
    unsigned int v98;  // w9
    unsigned int v99;  // w11
    unsigned int v100;  // w8
    unsigned int v101;  // w12
    unsigned int v102;  // w13
    unsigned int v103;  // w11
    unsigned int v104;  // w10
    unsigned long v24;  // x12
    unsigned int v105;  // w9
    unsigned int v106;  // w14
    unsigned int v107;  // w12
    unsigned int v108;  // w11
    unsigned int v109;  // w16
    unsigned int v110;  // w8
    unsigned int v111;  // w0
    unsigned int v112;  // w9
    unsigned int v113;  // w10
    unsigned long long v114;  // x11
    unsigned int v0;  // [bp-0x68]
    unsigned int v1;  // [bp-0x64]
    unsigned long long v2;  // [bp-0x60]
    unsigned long long v3;  // [bp-0x58]
    unsigned long long v4;  // [bp-0x50]
    unsigned long long v5;  // [bp-0x48]
    unsigned long long v6;  // [bp-0x40]
    unsigned long long v7;  // [bp-0x38]
    unsigned long long v8;  // [bp-0x30]
    unsigned long long v9;  // [bp-0x28]
    unsigned long long v10;  // [bp-0x20]
    unsigned long long v11;  // [bp-0x18]
    char *v12;  // [bp-0x10]
    unsigned long long v13;  // [bp-0x8]
    char v14;  // [bp+0x0]

    v15 = a1->field_0 * &g_1000000 | a1->field_1 * 0x10000;
    v16 = a1->field_2;
    v17 = (((((v16 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v16 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v16 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v16 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    v18 = v15 & 0xffff0000 | (v17 * 0x10000 | v17 >> 16) & 0xffff;
    *a2 = v18;
    v19 = a1->field_4 * &g_1000000 | a1->field_5 * 0x10000;
    v20 = a1->field_6;
    v21 = (((((v20 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v20 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v20 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v20 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    v22 = v19 & 0xffff0000 | (v21 * 0x10000 | v21 >> 16) & 0xffff;
    a2[1] = v22;
    v23 = a1->field_8 * &g_1000000 | a1->field_9 * 0x10000;
    v24 = a1->field_a;
    v25 = (((((v24 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v24 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v24 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v24 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    v26 = v23 & 0xffff0000 | (v25 * 0x10000 | v25 >> 16) & 0xffff;
    a2[2] = v26;
    v27 = a1->field_c * &g_1000000 | a1->field_d * 0x10000;
    v28 = a1->field_e;
    v29 = (((((v28 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v28 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v28 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v28 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    v30 = v27 & 0xffff0000 | (v29 * 0x10000 | v29 >> 16) & 0xffff;
    a2[3] = v30;
    if (a0 == 128)
    {
        v31 = v30;
        v32 = v26;
        v33 = v22;
        v34 = v18;
    }
    else
    {
        v35 = a1->field_10;
        v36 = (((((v35 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v35 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v35 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v35 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
        a2[8] = v36;
        v37 = a1->field_14;
        v38 = (((((v37 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v37 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v37 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v37 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
        a2[9] = v38;
        if (a0 == 192)
        {
            v39 = ~v36;
            a2[10] = v39;
            v40 = ~v38;
        }
        else
        {
            v41 = a1->field_18;
            v39 = (((((v41 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v41 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v41 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v41 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
            a2[10] = v39;
            v42 = a1->field_1c;
            v40 = (((((v42 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v42 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v42 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v42 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
        }
        a2[11] = v40;
        v34 = v36 ^ v18;
        v33 = v38 ^ v22;
        v32 = v39 ^ v26;
        v31 = v40 ^ v30;
    }
    v2 = v43;
    v3 = v44;
    v4 = v45;
    v5 = v46;
    v6 = v47;
    v7 = v48;
    v8 = v49;
    v9 = v50;
    v10 = v51;
    v11 = v52;
    v12 = &v14;
    v13 = v53;
    v54 = *(int *)(4 * (__ROL__(v34 ^ 2694735487, 24) & 0xff0000ff & 0xff) + 13843176) ^ *(int *)(4 * ((v34 ^ 2694735487) & 0xff) + 13841128) ^ (&g_d336e8.field_0)[__ROL__(v34 ^ 2694735487, 16) & 0xffff00ff & 0xff] ^ (&g_d32ee8.field_0)[(v34 ^ 2694735487) >> 24];
    v55 = *(int *)(4 * (__ROL__(v33 ^ 1003262091, 24) & 0xff0000ff & 0xff) + 13841128) ^ (&g_d32ee8.field_0)[(v33 ^ 1003262091) & 0xff] ^ *(int *)(4 * (__ROL__(v33 ^ 1003262091, 16) & 0xffff00ff & 0xff) + 13843176) ^ (&g_d336e8.field_0)[(v33 ^ 1003262091) >> 24] ^ v54;
    v56 = v55 ^ v32;
    v57 = v31 ^ (v54 * &g_1000000 | v54 >> 8) ^ v55;
    v58 = *(int *)(4 * (__ROL__(v56 ^ 3061508184, 24) & 0xff0000ff & 0xff) + 13843176) ^ *(int *)(4 * ((v56 ^ 3061508184) & 0xff) + 13841128) ^ (&g_d336e8.field_0)[__ROL__(v56 ^ 3061508184, 16) & 0xffff00ff & 0xff] ^ (&g_d32ee8.field_0)[(v56 ^ 3061508184) >> 24];
    v59 = *(int *)(4 * (__ROL__(v57 ^ 1286239154, 24) & 0xff0000ff & 0xff) + 13841128) ^ (&g_d32ee8.field_0)[(v57 ^ 1286239154) & 0xff] ^ *(int *)(4 * (__ROL__(v57 ^ 1286239154, 16) & 0xffff00ff & 0xff) + 13843176) ^ (&g_d336e8.field_0)[(v57 ^ 1286239154) >> 24] ^ v58;
    v60 = v34 ^ v18 ^ v59;
    v61 = v22 ^ (v58 * &g_1000000 | v58 >> 8) ^ v33 ^ v59;
    v62 = *(int *)(4 * (__ROL__(v60 ^ 3337565999, 24) & 0xff0000ff & 0xff) + 13843176) ^ *(int *)(4 * ((v60 ^ 3337565999) & 0xff) + 13841128) ^ (&g_d336e8.field_0)[__ROL__(v60 ^ 3337565999, 16) & 0xffff00ff & 0xff] ^ (&g_d32ee8.field_0)[(v60 ^ 3337565999) >> 24];
    v63 = *(int *)(4 * (__ROL__(v61 ^ 3914302142, 24) & 0xff0000ff & 0xff) + 13841128) ^ (&g_d32ee8.field_0)[(v61 ^ 3914302142) & 0xff] ^ *(int *)(4 * (((v61 ^ 3914302142) * 0x10000 | (v61 ^ 3914302142) >> 16) & 0xffff00ff & 0xff) + 13843176) ^ (&g_d336e8.field_0)[(v61 ^ 3914302142) >> 24] ^ v62;
    v64 = v56 ^ v26 ^ v63;
    v65 = v30 ^ __ROL__(v62, 24) ^ v57 ^ v63;
    v66 = *(int *)(4 * (((v64 ^ 0x54ff53a5) * &g_1000000 | (v64 ^ 0x54ff53a5) >> 8) & 0xff0000ff & 0xff) + 13843176) ^ *(int *)(4 * ((v64 ^ 0x54ff53a5) & 0xff) + 13841128) ^ (&g_d336e8.field_0)[((v64 ^ 0x54ff53a5) * 0x10000 | (v64 ^ 0x54ff53a5) >> 16) & 0xffff00ff & 0xff] ^ (&g_d32ee8.field_0)[(v64 ^ 0x54ff53a5) >> 24];
    v67 = *(int *)(4 * (((v65 ^ 4057165596) * &g_1000000 | (v65 ^ 4057165596) >> 8) & 0xff0000ff & 0xff) + 13841128) ^ (&g_d32ee8.field_0)[(v65 ^ 4057165596) & 0xff] ^ *(int *)(4 * (((v65 ^ 4057165596) * 0x10000 | (v65 ^ 4057165596) >> 16) & 0xffff00ff & 0xff) + 13843176) ^ (&g_d336e8.field_0)[(v65 ^ 4057165596) >> 24] ^ v66;
    v68 = v67 ^ v60;
    v69 = v61 ^ __ROL__(v66, 24) ^ v67;
    if (a0 == 128)
    {
        v70 = v68 * 0x8000 | v69 >> 0x11;
        v71 = v69 * 0x8000 | v64 >> 0x11;
        v72 = v64 * 0x8000 | v65 >> 0x11;
        v73 = v65 * 0x8000 | v68 >> 0x11;
        v74 = v70 * 0x8000 | v71 >> 0x11;
        v75 = v71 * 0x8000 | v72 >> 0x11;
        a2[4] = v68;
        a2[5] = v69;
        v76 = v72 * 0x8000 | v73 >> 0x11;
        v77 = v73 * 0x8000 | v70 >> 0x11;
        a2[6] = v64;
        a2[7] = v65;
        v78 = v74 * 0x8000 | v75 >> 0x11;
        v79 = v75 * 0x8000 | v76 >> 0x11;
        a2[12] = v70;
        a2[13] = v71;
        v80 = v76 * 0x8000 | v77 >> 0x11;
        v81 = v77 * 0x8000 | v74 >> 0x11;
        a2[14] = v72;
        a2[15] = v73;
        v82 = v78 * 0x8000 | v79 >> 0x11;
        v83 = v79 * 0x8000 | v80 >> 0x11;
        a2[16] = v74;
        a2[0x11] = v75;
        v84 = v80 * 0x8000 | v81 >> 0x11;
        v85 = v81 * 0x8000 | v78 >> 0x11;
        a2[18] = v76;
        a2[19] = v77;
        v86 = v83 * 4 | v84 >> 30;
        v87 = v84 * 4 | v85 >> 30;
        a2[24] = v78;
        a2[25] = v79;
        v88 = v85 * 4 | v82 >> 30;
        v89 = v82 * 4 | v83 >> 30;
        a2[28] = v82;
        a2[29] = v83;
        a2[30] = v84;
        a2[31] = v85;
        v90 = v18 * 0x8000 | v19 >> 0x11;
        a2[40] = v86;
        a2[41] = v87;
        v91 = v22 * 0x8000 | v23 >> 0x11;
        a2[42] = v88;
        a2[43] = v89;
        v92 = v26 * 0x8000 | v27 >> 0x11;
        v93 = v30 * 0x8000 | v15 >> 0x11;
        a2[48] = v86 * 0x20000 | v87 >> 15;
        a2[49] = v87 * 0x20000 | v88 >> 15;
        v94 = v90 * 0x40000000 | v91 >> 2;
        v95 = v91 * 0x40000000 | v92 >> 2;
        a2[50] = v88 * 0x20000 | v89 >> 15;
        a2[0x33] = v89 * 0x20000 | v86 >> 15;
        v96 = v92 * 0x40000000 | v93 >> 2;
        v97 = v93 * 0x40000000 | v90 >> 2;
        a2[8] = v90;
        a2[9] = v91;
        v98 = v94 * 0x8000 | v95 >> 0x11;
        v99 = v95 * 0x8000 | v96 >> 0x11;
        a2[10] = v92;
        a2[11] = v93;
        v100 = v96 * 0x8000 | v97 >> 0x11;
        v101 = v97 * 0x8000 | v94 >> 0x11;
        a2[20] = v94;
        a2[21] = v95;
        v102 = v98 * 0x20000 | v99 >> 15;
        v103 = v99 * 0x20000 | v100 >> 15;
        a2[22] = v96;
        a2[23] = v97;
        v104 = v100 * 0x20000 | v101 >> 15;
        v105 = v101 * 0x20000 | v98 >> 15;
        a2[26] = v100;
        a2[27] = v101;
        v106 = v102 * 0x20000 | v103 >> 15;
        v107 = v103 * 0x20000 | v104 >> 15;
        a2[32] = v102;
        a2[33] = v103;
        v108 = v104 * 0x20000 | v105 >> 15;
        v109 = v105 * 0x20000 | v102 >> 15;
        a2[0x22] = v104;
        a2[35] = v105;
        v110 = v106 * 0x20000 | v107 >> 15;
        v111 = 3;
        v112 = v107 * 0x20000 | v108 >> 15;
        a2[36] = v106;
        a2[37] = v107;
        a2[38] = v108;
        a2[39] = v109;
        v113 = v108 * 0x20000 | v109 >> 15;
        v114 = 188;
        v115 = 184;
        v116 = 180;
        v117 = 176;
        v118 = v109 * 0x20000 | v106 >> 15;
    }
    else
    {
        v119 = a2[8];
        v120 = a2[9];
        v121 = v119 ^ v68;
        v122 = v120 ^ v69;
        v0 = v19;
        v1 = v15;
        v123 = a2[10];
        v124 = a2[11];
        v125 = *(int *)(4 * (__ROL__(v121 ^ 0x10e527fa, 24) & 0xff0000ff & 0xff) + 13843176) ^ *(int *)(4 * ((v121 ^ 0x10e527fa) & 0xff) + 13841128) ^ (&g_d336e8.field_0)[__ROL__(v121 ^ 0x10e527fa, 16) & 0xffff00ff & 0xff] ^ (&g_d32ee8.field_0)[(v121 ^ 0x10e527fa) >> 24];
        v126 = *(int *)(4 * (__ROL__(v122 ^ 3731369245, 24) & 0xff0000ff & 0xff) + 13841128) ^ (&g_d32ee8.field_0)[(v122 ^ 3731369245) & 0xff] ^ *(int *)(4 * (__ROL__(v122 ^ 3731369245, 16) & 0xffff00ff & 0xff) + 13843176) ^ (&g_d336e8.field_0)[(v122 ^ 3731369245) >> 24] ^ v125;
        v127 = v123 ^ v64 ^ v126;
        v128 = v65 ^ (v125 * &g_1000000 | v125 >> 8) ^ v124 ^ v126;
        v129 = *(int *)(4 * (__ROL__(v127 ^ 2958461122, 24) & 0xff0000ff & 0xff) + 13843176) ^ *(int *)(4 * ((v127 ^ 2958461122) & 0xff) + 13841128) ^ (&g_d336e8.field_0)[__ROL__(v127 ^ 2958461122, 16) & 0xffff00ff & 0xff] ^ (&g_d32ee8.field_0)[(v127 ^ 2958461122) >> 24];
        v130 = *(int *)(4 * (__ROL__(v128 ^ 3018244605, 24) & 0xff0000ff & 0xff) + 13841128) ^ (&g_d32ee8.field_0)[(v128 ^ 3018244605) & 0xff] ^ *(int *)(4 * (__ROL__(v128 ^ 3018244605, 16) & 0xffff00ff & 0xff) + 13843176) ^ (&g_d336e8.field_0)[(v128 ^ 3018244605) >> 24] ^ v129;
        v131 = v130 ^ v121;
        v132 = v122 ^ (v129 * &g_1000000 | v129 >> 8) ^ v130;
        v133 = v131 * 0x40000000 | v132 >> 2;
        a2[4] = v131;
        a2[5] = v132;
        v134 = v132 * 0x40000000 | v127 >> 2;
        v135 = v127 * 0x40000000 | v128 >> 2;
        a2[6] = v127;
        a2[7] = v128;
        v136 = v128 * 0x40000000 | v131 >> 2;
        v137 = v133 * 0x40000000 | v134 >> 2;
        a2[20] = v133;
        a2[21] = v134;
        v138 = v134 * 0x40000000 | v135 >> 2;
        v139 = v135 * 0x40000000 | v136 >> 2;
        a2[22] = v135;
        a2[23] = v136;
        v140 = v136 * 0x40000000 | v133 >> 2;
        a2[40] = v137;
        a2[41] = v138;
        a2[42] = v139;
        a2[43] = v140;
        a2[64] = v138 * 0x80000 | v139 >> 13;
        a2[65] = v139 * 0x80000 | v140 >> 13;
        a2[66] = v140 * 0x80000 | v137 >> 13;
        v141 = v119 * 0x8000 | v120 >> 0x11;
        v142 = v120 * 0x8000 | v123 >> 0x11;
        v143 = v123 * 0x8000 | v124 >> 0x11;
        a2[67] = v137 * 0x80000 | v138 >> 13;
        v144 = v124 * 0x8000 | v119 >> 0x11;
        v145 = v141 * 0x8000 | v142 >> 0x11;
        a2[8] = v141;
        a2[9] = v142;
        v146 = v142 * 0x8000 | v143 >> 0x11;
        v147 = v143 * 0x8000 | v144 >> 0x11;
        a2[10] = v143;
        a2[11] = v144;
        v148 = v144 * 0x8000 | v141 >> 0x11;
        v149 = v145 * 0x40000000 | v146 >> 2;
        a2[16] = v145;
        a2[0x11] = v146;
        v150 = v146 * 0x40000000 | v147 >> 2;
        v151 = v147 * 0x40000000 | v148 >> 2;
        a2[18] = v147;
        a2[19] = v148;
        v152 = v148 * 0x40000000 | v145 >> 2;
        a2[36] = v149;
        a2[37] = v150;
        a2[38] = v151;
        a2[39] = v152;
        v153 = v68 * 0x8000 | v69 >> 0x11;
        a2[52] = v150 * 4 | v151 >> 30;
        a2[53] = v151 * 4 | v152 >> 30;
        v154 = v69 * 0x8000 | v64 >> 0x11;
        v155 = v64 * 0x8000 | v65 >> 0x11;
        a2[54] = v152 * 4 | v149 >> 30;
        a2[55] = v149 * 4 | v150 >> 30;
        v156 = v65 * 0x8000 | v68 >> 0x11;
        v157 = v153 * 0x40000000 | v154 >> 2;
        a2[12] = v153;
        a2[13] = v154;
        v158 = v154 * 0x40000000 | v155 >> 2;
        v159 = v155 * 0x40000000 | v156 >> 2;
        a2[14] = v155;
        a2[15] = v156;
        v160 = v156 * 0x40000000 | v153 >> 2;
        a2[28] = v157;
        a2[29] = v158;
        a2[30] = v159;
        a2[31] = v160;
        a2[48] = v158;
        a2[49] = v159;
        a2[50] = v160;
        a2[0x33] = v157;
        v161 = v22 * 0x2000 | v23 >> 19;
        v162 = v26 * 0x2000 | v27 >> 19;
        a2[56] = v158 * 0x20000 | v159 >> 15;
        a2[57] = v159 * 0x20000 | v160 >> 15;
        v163 = v30 * 0x2000 | v1 >> 19;
        v164 = v18 * 0x2000 | v0 >> 19;
        a2[58] = v160 * 0x20000 | v157 >> 15;
        a2[59] = v157 * 0x20000 | v158 >> 15;
        v165 = v161 * 0x8000 | v162 >> 0x11;
        v166 = v162 * 0x8000 | v163 >> 0x11;
        a2[24] = v161;
        a2[25] = v162;
        v167 = v163 * 0x8000 | v164 >> 0x11;
        v168 = v164 * 0x8000 | v161 >> 0x11;
        a2[26] = v163;
        a2[27] = v164;
        v169 = v165 * 0x20000 | v166 >> 15;
        v170 = v166 * 0x20000 | v167 >> 15;
        a2[32] = v165;
        a2[33] = v166;
        v171 = v167 * 0x20000 | v168 >> 15;
        v172 = v168 * 0x20000 | v165 >> 15;
        a2[0x22] = v167;
        a2[35] = v168;
        v110 = v170 * 4 | v171 >> 30;
        v111 = 4;
        v112 = v171 * 4 | v172 >> 30;
        a2[44] = v169;
        a2[45] = v170;
        a2[46] = v171;
        a2[47] = v172;
        v113 = v172 * 4 | v169 >> 30;
        v114 = 252;
        v115 = 248;
        v116 = 244;
        v117 = 240;
        v118 = v169 * 4 | v170 >> 30;
    }
    *(unsigned int *)((char *)a2 + v117) = v110;
    *(unsigned int *)((char *)a2 + v116) = v112;
    *(unsigned int *)((char *)a2 + v115) = v113;
    *(unsigned int *)((char *)a2 + v114) = v118;
    return v111;
}
