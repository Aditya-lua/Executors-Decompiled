/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x43ac98..0x43b7c4 (2860 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_43ac98_0 {
    char field_0;
} st_43ac98_0;

extern unsigned short g_f04560;
extern unsigned short g_f04562;
extern unsigned short g_f04564;
extern unsigned short g_f04566;
extern unsigned long long g_f04568;
extern unsigned short g_f12080;
extern unsigned short g_f12082;
extern unsigned short g_f12084;
extern unsigned short g_f12086;

int sub_43ac98(void)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x8
    unsigned long long v12;  // x12
    unsigned int v102;  // w8
    unsigned int v103;  // w9
    unsigned int v104;  // w10
    unsigned int v105;  // w9
    unsigned int v106;  // w10
    unsigned int v107;  // w11
    unsigned int v108;  // w12
    unsigned int v109;  // w8
    unsigned int v110;  // w9
    unsigned int v111;  // w9
    unsigned long long v13;  // x10
    unsigned int v112;  // w8
    unsigned int v113;  // w10
    unsigned int v114;  // w12
    unsigned int v115;  // w8
    unsigned int v116;  // w8
    unsigned int v117;  // w9
    unsigned long long v14;  // x12
    unsigned long long v15;  // x10
    unsigned long long v16;  // x14
    unsigned long long v17;  // x14
    unsigned long long v18;  // x15
    unsigned int v19;  // w12
    unsigned int v20;  // w12
    st_43ac98_0 *v4;  // x10
    unsigned long long v22;  // x10
    unsigned int v23;  // w12
    unsigned long v24;  // x13
    unsigned long v25;  // x14
    unsigned long long v26;  // x15
    unsigned long long v27;  // x16
    unsigned long long v28;  // x13
    unsigned long long v29;  // x13
    unsigned long long v30;  // x13
    unsigned long long v31;  // x15
    st_43ac98_0 **v5;  // x11
    unsigned int v32;  // w15
    unsigned long long v33;  // x13
    unsigned long long v34;  // x16
    unsigned long long v35;  // x0
    unsigned long long v36;  // x17
    unsigned long long v37;  // x2
    unsigned long long v38;  // x17
    unsigned long long v39;  // x13
    unsigned long long v40;  // x13
    unsigned long long v41;  // x16
    unsigned long long v6;  // x12
    unsigned long long v42;  // x17
    unsigned long long v43;  // x1
    unsigned long v44;  // x16
    unsigned long long v46;  // x16
    unsigned long v47;  // x17
    unsigned long long v48;  // x0
    unsigned long long v49;  // x1
    unsigned long long v50;  // x2
    unsigned long long v51;  // x17
    unsigned long long v7;  // x12
    unsigned long long v52;  // x16
    unsigned long long v53;  // x16
    unsigned long long v54;  // x0
    unsigned long long v55;  // x2
    unsigned long long v56;  // x1
    unsigned long long v57;  // x16
    unsigned int v58;  // w16
    unsigned long long v59;  // x17
    unsigned long long v60;  // x0
    unsigned long v61;  // x1
    unsigned long long v8;  // x13
    unsigned long long v62;  // x2
    unsigned long long v63;  // x17
    unsigned long long v64;  // x0
    unsigned long long v65;  // x17
    unsigned long long v66;  // x2
    unsigned long long v67;  // x17
    unsigned long long v68;  // x17
    unsigned long long v69;  // x0
    unsigned long long v70;  // x17
    unsigned int v71;  // w17
    unsigned long long v9;  // x14
    unsigned int v72;  // w0
    unsigned long long v73;  // x17
    unsigned long long v74;  // x0
    unsigned long long v75;  // x1
    unsigned long long v76;  // x14
    unsigned long long v77;  // x17
    unsigned long long v78;  // x17
    unsigned long long v79;  // x17
    unsigned long long v80;  // x11
    unsigned long long v81;  // x11
    unsigned long long v10;  // x10
    unsigned long long v82;  // x17
    unsigned long v83;  // x14
    unsigned int v84;  // w17
    unsigned int v85;  // w0
    unsigned int v86;  // w12
    unsigned int v87;  // w11
    unsigned short v88;  // x15
    unsigned short v89;  // x16
    unsigned short v90;  // x14
    unsigned long long v91;  // x10
    unsigned long long v11;  // x11
    unsigned long long v92;  // x8
    unsigned int v93;  // w8
    unsigned int v94;  // w9
    unsigned int v95;  // w11
    unsigned int v96;  // w12
    unsigned int v97;  // w13
    unsigned int v98;  // w14
    unsigned int v99;  // w11
    unsigned int v100;  // w8
    unsigned int v101;  // w12
    st_43ac98_0 **v0;  // [bp-0x10], Other Possible Types: unsigned long long, char
    st_43ac98_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v1 = &v0;
    v0 = &v1;
    v2 = 0xff51afd7ed558ccd * ((char *)&g_f04560 + ~(~&g_f04560 + &g_f04560));
    v3 = ((v2 | v2 >> 29) ^ ~v2 - (v2 >> 29 | ~v2)) + ((v2 | v2 >> 29) & ~v2 - (v2 >> 29 | ~v2)) * 2;
    v4 = v1;
    v5 = v0;
    v6 = (char *)v4 + 0x2 * ~v4 + 1;
    v7 = v4 - v5 + ~((v6 + (char *)v5 & -(v6 | v5)) * 4 + (v6 + (char *)v5 ^ -(v6 | v5)) * 2) + ((v6 + (char *)v5 & -(v6 | v5)) * 4 + (v6 + (char *)v5 ^ -(v6 | v5)) * 2) * 2;
    v8 = v7 + 2;
    v9 = ~v8 + v8 * 2;
    v10 = &(~&v4[v5 | ~v4])[(~v5 & ~v4) + 2 * (v4 | v5)];
    v11 = v10 + 1;
    v12 = (v9 ^ v11) + ((v9 & v11) + (v7 + 1 | ~v10) - v8) * 2;
    v13 = v12 + ((v11 - (v9 & v10) & v9 - v11) * 4 + (v11 - (v9 & v10) ^ v9 - v11) * 2 | 0xfffffffffffffffd - v12) + (v12 + 2 | (v11 - (v9 & v10) & v9 - v11) * 4 + (v11 - (v9 & v10) ^ v9 - v11) * 2);
    v14 = v13 + 3;
    v15 = v13 + 4;
    v16 = v15 + (16425 | ~v14) + (v14 ^ 16425) + 1;
    v17 = v15 + ~v14 * 2;
    v18 = v17 + 0xbfd7 + (~(unsigned int)v17 | 0xffffffffffff4029);
    v0 = (v16 ^ (v14 | 0xffffffffffffbfd6) + 16426) + (v16 & (v14 | 0xffffffffffffbfd6) + 16426) * 2 - 1;
    v1 = v14 + (v17 | 0xffffffffffff4029) + (v18 ^ v15) + (v18 & v15) * 2 + 0xbfd7;
    v19 = ((unsigned int)v1 ^ 1) + ~(unsigned int)v1 * 2 + (__ROL__((unsigned int)v1, 1) & 2 & 3);
    v20 = v0 + v19 + ~v19 * 2 + 1;
    v22 = v3 + ~v3 * 2 + 1;
    v23 = v20 + ~v20 * 2 + 1;
    g_f12080 = (unsigned short)v20 + (unsigned short)v3 + 1 + (unsigned short)v23 + ((unsigned short)v22 & (unsigned short)~v23) + (unsigned short)v20 + (unsigned short)v3 + (((unsigned short)-(v20 + (unsigned int)v3 + 1 + v23 + ((unsigned int)v22 & ~v23)) | (unsigned short)~(v20 + (unsigned int)v3)) + (unsigned short)v20 + (unsigned short)v3 + 1 + ((unsigned short)-(v20 + (unsigned int)v3 + 1 + v23 + ((unsigned int)v22 & ~v23)) & (unsigned short)~(v20 + (unsigned int)v3))) * 2;
    v24 = v1;
    v25 = v0;
    v26 = v25 | v24;
    v27 = (v26 & ~((v25 | ~v24) + v24)) * 2 - (v26 ^ (v25 | ~v24) + v24);
    v28 = v25 + v24 + (-(v25 & v24) & ~v26) * 2 + (v26 + (-(v25 & v24) | ~v26)) * 2;
    v29 = (v27 - 1 & v28 + 1) - v27 + (v27 - 1 | 0xfffffffffffffffe - v28) - (((-v27 | 0xfffffffffffffffe - v28) & v27) * 4 + ((-v27 | 0xfffffffffffffffe - v28) ^ v27) * 2) + (((-v27 | 0xfffffffffffffffe - v28) & v27) * 4 + ((-v27 | 0xfffffffffffffffe - v28) ^ v27) * 2) * 2;
    v0 = v29 + 7;
    v1 = v29 + 11;
    v30 = v1 | v0;
    v31 = (v1 + v0 ^ -v30) + (v1 + v0 & -v30) * 2;
    v32 = v3 >> ((char)v31 + ((char)v30 | (char)~v31) + ((char)v31 | (char)v30) + 1 & 63);
    v33 = v1;
    v34 = v0;
    v35 = v33 + 1;
    v36 = v35 + ~v33 * 2;
    v37 = v36 | ~v34;
    v38 = (v33 ^ -v34) + ((-v34 | ~v33) + v35) * 2 + ~((v34 - v36 + v37 & v36 + 1) * 4 + (v34 - v36 + v37 ^ v36 + 1) * 2) + ((v34 - v36 + v37 & v36 + 1) * 4 + (v34 - v36 + v37 ^ v36 + 1) * 2) * 2;
    v39 = v35 + v34 + (v34 & ~v33) - v34 + v37;
    v40 = ((((v39 - 1 & 0xfffffffffffffffe - v38) - v39 & v38 + 2) * 4 + ((v39 - 1 & 0xfffffffffffffffe - v38) - v39 ^ v38 + 2) * 2 | 1) ^ v39 - 1 + v38 + 2 + (v38 + 2 - (v38 + 2) * 2 - v39 - (v38 + 2 - (v38 + 2) * 2 | -v39)) * 2) + ((((v39 - 1 & 0xfffffffffffffffe - v38) - v39 & v38 + 2) * 4 + ((v39 - 1 & 0xfffffffffffffffe - v38) - v39 ^ v38 + 2) * 2 | 1) & v39 - 1 + v38 + 2 + (v38 + 2 - (v38 + 2) * 2 - v39 - (v38 + 2 - (v38 + 2) * 2 | -v39)) * 2) * 2;
    v41 = v40 - 1;
    v42 = (v40 + 25173 ^ -(v41 | 25174)) + (v40 + 25173 & -(v41 | 25174)) * 2;
    v43 = -v40;
    v44 = v40 + (v41 & 40361) + 0xffffffffffff6256 + ((0xffffffff ^ (unsigned int)v41 * 2) & 80722);
    v0 = v42 + (v40 + 25174 + (v43 | 0xffffffffffff9da9) | ~v42) + (v42 | v40 + 25174 + (v43 | 0xffffffffffff9da9)) + 1;
    v1 = v40 + (v43 & 0xffffffffffff6256) + (v44 | 0xffffffffffff6256 - (v40 + (v43 & 0xffffffffffff6256))) + (v44 | v40 + (v43 & 0xffffffffffff6256) + 40361) + 40362;
    g_f12082 = (unsigned short)v32 + (unsigned short)~v32 * 2 + ((unsigned short)v1 + v0 | (unsigned short)~v32) + ((unsigned short)~((unsigned int)v1 + v0 | ~v32) & (unsigned short)~(v32 + ~v32 * 2)) * 2 + ((unsigned short)~(v32 + ~v32 * 2 + ((unsigned int)v1 + v0 | ~v32 | ~(v32 + ~v32 * 2))) + ((unsigned short)v1 + v0 | (unsigned short)~v32)) * 2 + 1;
    v46 = v1;
    v47 = v0;
    v48 = ~v47 * 2;
    v49 = (v47 + v48 + 1 & v46) + v47;
    v50 = (v47 + v46 ^ -(v46 | v47)) + (v47 + v46 & -(v46 | v47)) * 2;
    v51 = (v48 + (v47 ^ 1) + ((v47 * 2 | v47 >> 63) & 2 & 3) & v46) * 2;
    v52 = v47 - v46 + v51 + (v51 | ~(v47 - v46)) + (v47 - v46 & ~v51) + 1;
    v53 = v49 + v50 + (v49 - v50 - (v49 | -v50) + (-v50 & ~v49)) * 2 + (v52 ^ 1) + v52 * 2 + ~v52 * 4 + (v52 * 2 & 2);
    v54 = v53 + 3;
    v55 = v54 | 26;
    v56 = (v53 + 29 ^ -v55) + (v53 + 29 & -v55) * 2;
    v57 = (((v54 | 0xfffffffffffffff9) - (v53 + 2) + 5 ^ v53 + 4) + ((v54 | 0xfffffffffffffff9) - (v53 + 2) + 5 & v53 + 4) * 2 ^ v53 + 2 + (v54 & 6) - (v54 * 2 | 0xfffffffffffffff3) - 5) + (((v54 | 0xfffffffffffffff9) - (v53 + 2) + 5 ^ v53 + 4) + ((v54 | 0xfffffffffffffff9) - (v53 + 2) + 5 & v53 + 4) * 2 & v53 + 2 + (v54 & 6) - (v54 * 2 | 0xfffffffffffffff3) - 5) * 2;
    v0 = v55 + v56 + (v55 | ~v56) + (v56 & ~v55) + 1;
    v1 = ~v57 + v57 * 2;
    v58 = v3 >> ((char)v1 + (char)v0 & 63);
    v59 = v1;
    v60 = v0;
    v61 = v60 ^ v59;
    v62 = v59 + ~v59 * 2 + 1;
    v63 = (-((v59 + ~(v60 | v59) ^ v60 + 1) + (v59 + ~(v60 | v59) & v60 + 1) * 2) ^ v60 + 1 + v59 + (v62 | ~v60)) + (-((v59 + ~(v60 | v59) ^ v60 + 1) + (v59 + ~(v60 | v59) & v60 + 1) * 2) & v60 + 1 + v59 + (v62 | ~v60)) * 2;
    v64 = v63 - 1;
    v65 = v61 - v63;
    v66 = (v65 + (v64 | ~v61) + 1 ^ (v64 & v61) - v61) + (v65 + (v64 | ~v61) + 1 & (v64 & v61) - v61) * 2;
    v67 = (v65 + (v64 & ~v61)) * 2;
    v68 = v67 + v66 + (0xfffffffffffffffd - v67 | ~v66) + (v66 & v67 + 2);
    v69 = v68 + 3;
    v70 = v68 + 4;
    v0 = v70 + (45770 | ~v69) + (v69 ^ 45770) + (0xffffffffffff4d36 - (v69 & 0xffffffffffff4d35) ^ v68 + 45773) + (0xffffffffffff4d36 - (v69 & 0xffffffffffff4d35) & v68 + 45773) * 2;
    v1 = ((0xffffffff ^ (unsigned int)v69 * 2) & 39532) + 0xffffffffffffb2c9 + v69 + (v70 + (19766 | ~v69)) * 2;
    v71 = (unsigned int)v0 | (unsigned int)v1;
    v72 = ((unsigned int)v1 + (unsigned int)v0 ^ -v71) + ((unsigned int)v1 + (unsigned int)v0 & -v71) * 2;
    g_f12084 = (unsigned short)(v58 + (v58 & -((v72 ^ v71 + 1) + (v72 & v71 + 1) * 2)) + (~((v72 ^ v71 + 1) + (v72 & v71 + 1) * 2) + ((v72 ^ v71 + 1) + (v72 & v71 + 1) * 2) * 2 | ~v58) - ((v72 ^ v71 + 1) + ((v72 & v71 + 1) - ((v72 ^ v71 + 1) + (v72 & v71 + 1) * 2)) * 2 & v58)) + 1;
    v73 = v1;
    v74 = v0;
    v75 = v74 + v73;
    v76 = v75 + (v73 + 1 + ~v73 * 2 | ~v74) + ((v73 + 1 + ~v73 * 2 | v74) ^ 0xfffffffffffffffe - v73) - ((v73 + 1 + ~v73 * 2 | v74) & v73 + 1) * 2;
    v77 = v75 + (v74 + (-v73 | ~v74) + (-v73 & ~v74)) * 2 + 2;
    v78 = v77 + ((v74 | v73) & -v74) * 4 + ((v74 | v73) ^ -v74) * 2 + (((v74 | v73) & -v74) * 4 + ((v74 | v73) ^ -v74) * 2 | ~v77) + (v77 & ~(((v74 | v73) & -v74) * 4 + ((v74 | v73) ^ -v74) * 2)) + 1;
    v79 = v78 + ~v78 * 2 + 1;
    v80 = v76 + (v79 | 0xfffffffffffffffd - v76) + (v79 | v76 + 2) + 3;
    v81 = (v80 * 2 & 4) + (v80 ^ 2);
    v82 = -v81;
    v83 = (unsigned int)v81 - 1 & 29;
    v0 = v81 + 29 + ~v83 + (v81 + (v82 & 0xffffffffffffffe2)) * 2 + (0xffffffffffffffe2 - (v81 + (v82 & 0xffffffffffffffe2)) | v81 + 29 + ~v83) + (0xffffffffffffffe2 - (v81 + (v82 & 0xffffffffffffffe2)) | v83 - (v81 + 29)) + 60;
    v1 = (v82 | 19) + v81 + ((v82 | 19) + v81 & v82 & 0xffffffffffffffec) - (((v82 | 19) + v81 | ~(v82 & 0xffffffffffffffec)) + (v82 & 0xffffffffffffffec) * 2) - 2;
    g_f12086 = v3 >> ((char)v1 + v0 & 63);
    v84 = g_f12080 + ~g_f04560;
    v85 = -(g_f12080 | ~g_f04560);
    v86 = -g_f12080;
    v87 = (v86 ^ g_f04560) + (g_f04560 + (v86 | ~g_f04560)) * 2;
    g_f04560 = (unsigned short)v87 + ((unsigned short)v84 & (unsigned short)v85) * 4 + ((unsigned short)v84 ^ (unsigned short)v85) * 2 + (((unsigned short)v84 & (unsigned short)v85) * 4 + ((unsigned short)v84 ^ (unsigned short)v85) * 2 | (unsigned short)~(v87 + 2)) + ((unsigned short)v87 + 2 & (unsigned short)~((v84 & v85) * 4 + (v84 ^ v85) * 2)) + 3;
    g_f04562 = g_f04562 + g_f12082 + ((g_f04562 + (0xffff ^ g_f04562 * 2) & g_f12082) + ~g_f12082) * 2 + 2;
    v88 = g_f12084 | g_f04564;
    v89 = -(g_f12084 & g_f04564);
    g_f04564 = (v88 ^ v89) + (unsigned short)((g_f12084 ^ g_f04564) - (v88 | v89)) * 2;
    v90 = g_f12086 & ~g_f04566;
    g_f04566 = g_f04566 + g_f12086 + ~g_f12086 * 2 + v90 * 4 + (0xffff ^ v90 * 2) + 3;
    v91 = v22 + g_f04568 + 1;
    v92 = 1 | (v3 & ~g_f04568) * 2;
    g_f04568 = (v92 ^ v91) + (v92 & v91) * 2 - 1;
    v93 = v1;
    v94 = *(unsigned int *)&v0;
    v95 = v93 + (v94 | ~v93) + (v94 ^ v93) + (v94 & v93) + ~(v94 & v93) * 2;
    v96 = v95 + 2;
    v97 = v95 + 3;
    v98 = ~v96;
    v99 = 0xfffffffc - v95;
    v100 = v96 - v93 + v98 + (v99 | v93) + (v97 ^ v93) + (v97 | v93);
    v101 = v100 + 3;
    v102 = v100 + 2;
    v103 = v97 + v94 + (v99 & -v94) * 2 + (unsigned int)(v97 - v94 - (v97 | -v94)) * 2;
    v104 = (v94 + v98 + (v97 & ~v94)) * 2;
    v105 = (v103 | v104) + (v103 & v104);
    v106 = v102 - v105 + (v102 - v101 * 4 + v102 * 2 + ((unsigned int)(0x7ffffffc - (v102 - v101 * 4 + v102 * 2)) | v105)) * 2;
    v107 = v106 + 8;
    v108 = v105 + v101 + (v101 - v101 * 2 | ~v105);
    v109 = v105 & v102;
    v110 = -v109;
    v111 = (v108 ^ v110) + 1;
    v112 = v111 + (unsigned int)(v108 - v109 - (v108 | v110)) * 2;
    v113 = v106 + 9;
    v114 = v113 + ~v107 * 2;
    v115 = (v114 & v112 - 2) - v112 + 1;
    v116 = (v115 & v113) * 4 + (v115 ^ v113) * 2;
    v117 = v107 - ((v111 & 1) + (-v112 | 1)) + (v114 & (v111 & 1) + (-v112 | 1)) * 2;
    return v116 + v117 * 2 + ~(v116 & v117) + (v116 | ~v117) + 2;
}
