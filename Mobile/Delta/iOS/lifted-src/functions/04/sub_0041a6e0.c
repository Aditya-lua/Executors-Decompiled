/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x41a6e0..0x41b1f0 (2832 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_41a6e0_0 {
    char field_0;
} st_41a6e0_0;

extern unsigned short g_f043d8;
extern unsigned short g_f043da;
extern unsigned short g_f043dc;
extern unsigned short g_f043de;
extern unsigned long long g_f043e0;
extern unsigned short g_f11fc8;
extern unsigned short g_f11fca;
extern unsigned short g_f11fcc;
extern unsigned short g_f11fce;

int sub_41a6e0(void)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x8
    unsigned long long v12;  // x15
    unsigned int v102;  // w14
    unsigned int v103;  // w12
    unsigned int v104;  // w15
    unsigned int v105;  // w8
    unsigned int v106;  // w8
    unsigned int v107;  // w10
    unsigned int v108;  // w9
    unsigned int v109;  // w9
    unsigned int v110;  // w10
    unsigned int v111;  // w11
    unsigned long long v13;  // x10
    unsigned int v112;  // w12
    unsigned int v113;  // w11
    unsigned int v114;  // w9
    unsigned int v115;  // w8
    unsigned int v116;  // w9
    unsigned int v117;  // w10
    unsigned int v118;  // w12
    unsigned long long v14;  // x12
    unsigned int v15;  // w10
    unsigned int v16;  // w12
    unsigned short v17;  // x13
    unsigned short v18;  // x10
    unsigned short v19;  // x12
    unsigned long long v20;  // x12
    unsigned long long v21;  // x13
    st_41a6e0_0 *v4;  // x10
    unsigned long long v22;  // x14
    unsigned long long v23;  // x15
    unsigned long long v24;  // x16
    unsigned long long v25;  // x1
    unsigned long long v26;  // x17
    unsigned long long v27;  // x12
    unsigned long long v28;  // x12
    unsigned long long v29;  // x12
    unsigned long long v30;  // x13
    unsigned int v31;  // w12
    st_41a6e0_0 **v5;  // x11
    unsigned long long v32;  // x13
    unsigned long long v33;  // x14
    unsigned long long v34;  // x15
    unsigned long long v35;  // x16
    unsigned long long v36;  // x14
    unsigned long long v37;  // x13
    unsigned long long v38;  // x14
    unsigned long long v39;  // x17
    unsigned long long v40;  // x0
    unsigned long long v41;  // x14
    unsigned long long v6;  // x14
    unsigned long v42;  // x15
    unsigned long long v43;  // x13
    unsigned long long v44;  // x11
    unsigned long long v45;  // x12
    unsigned long long v46;  // x14
    unsigned long long v47;  // x15
    unsigned long long v48;  // x16
    unsigned long long v49;  // x16
    unsigned long long v50;  // x12
    unsigned long long v51;  // x14
    unsigned long long v7;  // x12
    unsigned long long v52;  // x16
    unsigned long long v53;  // x12
    unsigned short v54;  // x14
    unsigned long long v55;  // x15
    unsigned long v56;  // x17
    unsigned long long v57;  // x0
    unsigned long long v58;  // x2
    unsigned long long v59;  // x1
    unsigned long long v60;  // x1
    unsigned long long v61;  // x15
    unsigned long long v8;  // x13
    unsigned long long v62;  // x16
    unsigned long v63;  // x17
    unsigned long long v64;  // x15
    unsigned long long v65;  // x1
    unsigned long long v66;  // x16
    unsigned long long v67;  // x15
    unsigned long long v68;  // x16
    unsigned long long v69;  // x13
    unsigned int v70;  // w13
    unsigned short v71;  // x13
    unsigned long long v9;  // x10
    unsigned long long v72;  // x14
    unsigned long v73;  // x15
    unsigned long long v74;  // x17
    unsigned long long v75;  // x14
    unsigned long long v76;  // x14
    unsigned long long v77;  // x15
    unsigned long long v78;  // x17
    unsigned long long v79;  // x16
    unsigned int v80;  // w16
    unsigned int v81;  // w17
    unsigned long long v10;  // x14
    unsigned int v82;  // w14
    unsigned int v83;  // w10
    unsigned int v84;  // w12
    unsigned short v85;  // x14
    unsigned short v86;  // x12
    unsigned short v87;  // x10
    unsigned short v88;  // x11
    unsigned int v89;  // w12
    unsigned short v90;  // x10
    unsigned int v91;  // w12
    unsigned long long v11;  // x12
    unsigned short v92;  // x13
    unsigned short v93;  // x12
    unsigned short v94;  // x10
    unsigned long long v95;  // x11
    unsigned long long v96;  // x10
    unsigned long long v97;  // x8
    unsigned int v98;  // w8
    unsigned int v99;  // w10
    unsigned int v100;  // w12
    unsigned int v101;  // w13
    st_41a6e0_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned long long
    st_41a6e0_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long long

    v1 = &v0;
    v0 = &v1;
    v2 = 0xff51afd7ed558ccd * ((char *)&g_f043d8 + ~(~&g_f043d8 + &g_f043d8));
    v3 = ((v2 | v2 >> 29) ^ ~v2 - (v2 >> 29 | ~v2)) + ((v2 | v2 >> 29) & ~v2 - (v2 >> 29 | ~v2)) * 2;
    v4 = v1;
    v5 = v0;
    v6 = v4 & ~v5;
    v7 = (((v6 + 1 & v5 + ~v4) * 4 + (v6 + 1 ^ v5 + ~v4) * 2 | 1) ^ v4 + v5 + ~v5 * 2 + 2) + (((v6 + 1 & v5 + ~v4) * 4 + (v6 + 1 ^ v5 + ~v4) * 2 | 1) & v4 + v5 + ~v5 * 2 + 2) * 2;
    v8 = ~v7 + v7 * 2;
    v9 = v5 - v4 + (v6 * 2 | ~(v5 - v4)) + (v6 * 2 | v5 - v4);
    v10 = v9 + 1;
    v11 = -v7;
    v12 = (v10 + ~v10 * 2 + (0xfffffffffffffffd - (v10 + ~v10 * 2) | v11) + v8 + 3 ^ -(v8 & v10 + ~v10 * 2 + 2)) + (v10 + ~v10 * 2 + (0xfffffffffffffffd - (v10 + ~v10 * 2) | v11) + v8 + 3 & -(v8 & v10 + ~v10 * 2 + 2)) * 2;
    v13 = v12 + ((~(v8 - v10) - (v9 | v11) & v8 - v10) * 4 + (~(v8 - v10) - (v9 | v11) ^ v8 - v10) * 2 | ~v12) + (v12 | (~(v8 - v10) - (v9 | v11) & v8 - v10) * 4 + (~(v8 - v10) - (v9 | v11) ^ v8 - v10) * 2);
    v14 = (v13 + 1 + (57100 | ~(v13 + 1)) + 1 ^ (v13 + 1 & 0xffffffffffff20f3) + 57101) + (v13 + 1 + (57100 | ~(v13 + 1)) + 1 & (v13 + 1 & 0xffffffffffff20f3) + 57101) * 2;
    v0 = ~v14 + v14 * 2;
    v1 = v13 + 8436;
    v15 = (unsigned int)v0 + ~(unsigned int)v1 + ((unsigned int)v1 + 1 & ~(unsigned int)v0) * 2 + ((unsigned int)v1 + 1 & (unsigned int)v0) * 2;
    v16 = (unsigned int)v3 * 2;
    v17 = ~v16;
    v18 = (unsigned short)v3 + ((unsigned short)v15 * 3 + (unsigned short)~v15 * 2 + 1 & (unsigned short)v3) + v17;
    v19 = (unsigned short)(((unsigned int)v3 ^ 0xfffffffe) + v17 + (unsigned int)v3 * 4 - (v16 & 2)) + 4;
    g_f11fc8 = (v18 ^ v19) + (v18 & v19) * 2;
    v20 = v1;
    v21 = v0;
    v22 = v21 + 1;
    v23 = ~v21 * 2;
    v24 = v22 + v23;
    v25 = v21 | v20;
    v26 = ((v24 & v20) + v21 ^ -((v21 + v20 ^ -v25) + (v21 + v20 & -v25) * 2)) + ((v24 & v20) + v21 & -((v21 + v20 ^ -v25) + (v21 + v20 & -v25) * 2)) * 2;
    v27 = v25 + ((v24 | v20) ^ v23 + v21) - ((v24 | v20) & v22) * 2;
    v28 = 1 | (v26 & ~v27) * 2;
    v29 = (((v26 & v27) + ~v27 ^ (v26 & v27) - v26) + ((v26 & v27) + ~v27 & (v26 & v27) - v26) * 2 ^ v28) + (((v26 & v27) + ~v27 ^ (v26 & v27) - v26) + ((v26 & v27) + ~v27 & (v26 & v27) - v26) * 2 & v28) * 2;
    v30 = v29 * 2 - 2;
    v0 = v29 + (v30 & 10) + (v30 & 10 ^ 10) - 7;
    v1 = v29 + ((-v29 | 13) + v29) * 2 + (~(unsigned int)v30 & 26) - 15;
    v31 = v3 >> ((char)(v0 + (v1 ^ 0xfffffffffffffffe) - ~v1 * 2 - ((v1 * 2 | v1 >> 63) & 2 & 3)) & 63);
    v32 = v1;
    v33 = v0;
    v34 = (((v32 + (0xffffffffffffffff ^ v32 * 2) + v33 & -(v32 + (0xffffffffffffffff ^ v32 * 2) | v33)) * 4 + (v32 + (0xffffffffffffffff ^ v32 * 2) + v33 ^ -(v32 + (0xffffffffffffffff ^ v32 * 2) | v33)) * 2 | 1) ^ (v32 ^ -v33) + (v32 - (v33 + (v32 | -v33))) * 2) + (((v32 + (0xffffffffffffffff ^ v32 * 2) + v33 & -(v32 + (0xffffffffffffffff ^ v32 * 2) | v33)) * 4 + (v32 + (0xffffffffffffffff ^ v32 * 2) + v33 ^ -(v32 + (0xffffffffffffffff ^ v32 * 2) | v33)) * 2 | 1) & (v32 ^ -v33) + (v32 - (v33 + (v32 | -v33))) * 2) * 2;
    v35 = ~v34 + v34 * 2;
    v36 = ((v33 ^ 1) + v33 * 2 + ~v33 * 4 + (v33 * 2 & 2) + 2 & v32) * 2;
    v37 = v33 - v32 + v36 + (v33 - v32 & ~v36) + (v36 | ~(v33 - v32));
    v38 = (v37 + 2 + ~(v37 + 1) * 2 | 1) + (v37 + 2 & 1);
    v39 = v38 | v35;
    v40 = -v34;
    v41 = -(v34 + (v38 | v40));
    v42 = v39 ^ v41;
    v43 = (v35 + (v40 | ~v37)) * 2;
    v44 = (v42 + (v39 & v41) * 2 & 0xfffffffffffffffd - v43) + v43 + 2 + (v42 + (v39 & v41) * 2 & v43 + 2);
    v0 = (v44 | 1) + (v42 & 1) + 34415;
    v1 = v44 + 31119;
    g_f11fca = (unsigned short)v1 + (unsigned short)v0 + 1 + (unsigned short)v1 + (unsigned short)v0 + 1 + (unsigned short)~((unsigned int)v1 + (unsigned int)v0) * 2 + (unsigned short)v31 + (((unsigned short)v31 ^ 1) + (unsigned short)~v31 * 2 + ((unsigned short)(__ROL__(v31, 1)) & 2 & 3) | (unsigned short)~((unsigned int)v1 + (unsigned int)v0 + 1 + ~((unsigned int)v1 + (unsigned int)v0) * 2)) + 1;
    v45 = v1;
    v46 = v0;
    v47 = v46 | v45;
    v48 = (0xfffffffffffffffe - (v45 + ~v45 * 2) & ~v46) - v45;
    v49 = v47 - v48 + (v48 & ~v47) * 2 + (v48 & v47) * 2;
    v50 = v47 + (v46 & v45) + (-(v46 & v45) & ~v47) * 2 + (v47 - ((v46 & v45) + (v47 | -(v46 & v45)))) * 2;
    v51 = ((v50 - 1 & v49) - v50 ^ ~v49 - (-v50 | ~v49)) + ((v49 + ~v49 * 2 + 1 | -v50) & ~(v49 + ~v49 * 2)) * 4 + ((v49 + ~v49 * 2 ^ ~(v49 + ~v49 * 2 + 1 | -v50)) + ((v50 - 1 & v49) - v50 & ~v49 - (-v50 | ~v49))) * 2;
    v52 = v51 & 0xffffffffffffffe2;
    v53 = (v52 ^ 0xffffffffffffffe3 ^ v51 + 29) + ((v52 ^ 0xffffffffffffffe3) & v51 + 29) * 2;
    v0 = (v53 ^ v52 + 30) + (v53 & v52 + 30) * 2 - 1;
    v1 = v51 + (v51 + (~v51 | 4)) * 2 + ((0xffffffff ^ (unsigned int)v51 * 2) & 8) - 3;
    v54 = v3 >> ((char)v1 + v0 & 63);
    v55 = v1;
    v56 = v0;
    v57 = v56 + v55;
    v58 = v56 + ~v56 * 2 + 1;
    v59 = v57 + (v58 | v55 + ~v55 * 2 + 1) + 1;
    v60 = v59 - ((v55 & ~v56) - v55) + (v59 & (v55 & ~v56) - v55) * 2 + ((v55 & ~v56) - v55 & ~v59) * 2;
    v61 = v57 + ((-v55 & ~v56) + v56 - (v55 + (v56 | -v55))) * 2;
    v62 = ((v55 | ~v58) + v58) * 2 + 3;
    v63 = v62 ^ v61;
    v64 = v63 + (v62 & v61) * 2;
    v65 = v60 + 1 - (v60 + 1) * 2;
    v66 = (~v64 + v64 * 2 - 1 & v65) - (~v64 + v64 * 2);
    v67 = (v60 ^ -((-v64 | 1) + (v63 & 1))) + ((-v64 | 1) + (v63 & 1) & ~v60 | v60 & -((-v64 | 1) + (v63 & 1))) * 2 + ~((v66 & -v65) * 4 + (v66 ^ -v65) * 2) + ((v66 & -v65) * 4 + (v66 ^ -v65) * 2) * 2;
    v68 = v67 + 2;
    v69 = 0xfffffffffffffffe - v67;
    v0 = (v68 + 32316 + (v69 & 0xffffffffffff81c3) ^ -(v69 & 0xffffffffffff81c3)) + (v68 + 32316 + (v69 & 0xffffffffffff81c3) & -(v69 & 0xffffffffffff81c3)) * 2 - 1;
    v1 = (~((unsigned int)v67 * 2 + 2) & 66440) + 0xffffffffffff7e3a + v68 + ((v69 | 33220) + v68) * 2;
    v70 = v0 + ~(unsigned int)v1 + (unsigned int)v1 * 2 + 2;
    v71 = (unsigned short)v70 * 3 + (unsigned short)~v70 * 2;
    g_f11fcc = v71 + v54 + (v54 + (0xffff ^ v54 * 2) & (unsigned short)(0xfffffffe - v71)) + 2;
    v72 = v1;
    v73 = v0;
    v74 = (v73 ^ 1) + ~v73 * 2 + ((v73 * 2 | v73 >> 63) & 2 & 3);
    v75 = v73 - v72 + (v74 + v72 ^ -(v74 | v72)) * 2 + (v74 + v72 & -(v74 | v72)) * 4;
    v76 = v75 + (v73 ^ v72) + ((v75 + 0x7fffffffffffffff | v73 ^ v72) - v75 + (v75 + 0x7fffffffffffffff & (v73 ^ v72)) - (v75 + (v73 ^ v72))) * 2;
    v77 = v76 + 2;
    v78 = ((v77 & 0xffffffffffffffe0 ^ 0xffffffffffffffe1 ^ v76 + 33) + ((v77 & 0xffffffffffffffe0 ^ 0xffffffffffffffe1) & v76 + 33) * 2 ^ (v77 | 31) + 1) + ((v77 & 0xffffffffffffffe0 ^ 0xffffffffffffffe1 ^ v76 + 33) + ((v77 & 0xffffffffffffffe0 ^ 0xffffffffffffffe1) & v76 + 33) * 2 & (v77 | 31) + 1) * 2;
    v79 = (~(unsigned int)v77 & 0x11) + (v77 ^ 0xffffffffffffffee);
    v0 = ~v78 + v78 * 2;
    v1 = (v79 ^ v76 + 3) + (v77 | 0x11) + (v79 & v76 + 3) * 2;
    g_f11fce = v3 >> (((char)v1 + (char)~(v1 | v0) ^ (char)v0 + 1) + ((char)v1 | (char)v0) + ((char)v1 + (char)~(v1 | v0) & (char)v0 + 1) * 2 & 63);
    v80 = g_f11fc8 | g_f043d8;
    v81 = -g_f043d8;
    v82 = (v80 & v81) * 4 + (v80 ^ v81) * 2 | 1;
    v83 = (v82 ^ (unsigned int)(g_f043d8 - g_f11fc8)) + (v82 & (unsigned int)(g_f043d8 - g_f11fc8)) * 2;
    g_f043d8 = (unsigned short)~v83 + (unsigned short)v83 * 2;
    v84 = (0xffffffff ^ g_f043da * 2) + g_f043da;
    v85 = (unsigned short)v84 + g_f11fca;
    v86 = -(v84 | g_f11fca);
    v87 = g_f043da - g_f11fca;
    v88 = (v85 & v86) * 4 + (v85 ^ v86) * 2 | 1;
    g_f043da = (v88 ^ v87) + (v88 & v87) * 2 - 1;
    v89 = g_f11fcc | g_f043dc;
    v90 = g_f11fcc + g_f043dc;
    g_f043dc = (unsigned short)(v89 - (v90 & -v89) * 2) + ((unsigned short)(v89 - 1) ^ v90) + 1;
    v91 = g_f043de + ~g_f043de * 2 + 1;
    v92 = (unsigned short)v91 + g_f11fce;
    v93 = -(v91 | g_f11fce);
    v94 = g_f043de - g_f11fce;
    g_f043de = (v94 | (v92 & v93) * 4 + (v92 ^ v93) * 2) + ((v92 & v93) * 4 + (v92 ^ v93) * 2 & v94);
    v95 = g_f043e0 | v3;
    v96 = g_f043e0 + ~g_f043e0 * 2;
    v97 = (v96 ^ ~(v96 + 1 | v3)) + ((v96 + 1 | v3) & ~v96) * 2;
    g_f043e0 = v97 + v95 + (-v97 & ~v95) * 2 + (v95 + (-v97 | ~v95)) * 2 + 2;
    v98 = v1;
    v99 = v0;
    v100 = v98 + v99 + (v99 & v98) + ~(v99 & v98) * 2 + (v99 + ~v99 * 2 + 1 | v98 + ~v98 * 2 + 1);
    v101 = v100 + 3;
    v102 = 0xfffffffc - v100;
    v103 = v100 + 4;
    v104 = v102 * 2;
    v105 = (v101 ^ -v98) + (unsigned int)(v101 - v98 - (v101 | -v98)) * 2;
    v106 = v105 + (v104 + v103 & v98) * 2 + (v105 & ~((v104 + v103 & v98) * 2)) + ((v104 + v103 & v98) * 2 | ~v105) + 1;
    v107 = v101 + v99 + (v102 & -v99) * 2 + ((v102 | -v99) + v103) * 2;
    v108 = ((__ROL__(v101, 1) & 2 & 3) + (v101 ^ 1) + v104 & v99) * 2;
    v109 = v107 + (v108 | ~v107) + (v108 | v107);
    v110 = v109 + 1;
    v111 = v106 - v110 + (v110 & v106) + (v110 & ~v106) * 2;
    v112 = -((v110 + v106 ^ -(v106 | v110)) + (v110 + v106 & -(v106 | v110)) * 2);
    v113 = (v112 ^ v111) + (v112 & v111) * 2;
    v114 = v109 * 3 + ~v110 * 4 + 6;
    v115 = v110 - v106 + (((v114 & v106) - (v114 + v106) & v114 + v106) * 4 + ((v114 & v106) - (v114 + v106) ^ v114 + v106) * 2 | ~(v110 - v106)) + (((v114 & v106) - (v114 + v106) & v114 + v106) * 4 + ((v114 & v106) - (v114 + v106) ^ v114 + v106) * 2 | v110 - v106);
    v116 = v115 + 1;
    v117 = (v115 & v113) - v116;
    v118 = v116 - v113 + (v113 | ~v115);
    return (v117 ^ v118) + (v113 - v116 + (v115 & v113 + ~v113 * 2 + 1) + (v117 & v118)) * 2 + 2;
}
