/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5046e0..0x505058 (2424 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5046e0_0 {
    char field_0;
} st_5046e0_0;

extern unsigned short g_f04600;
extern unsigned short g_f04602;
extern unsigned short g_f04604;
extern unsigned short g_f04606;
extern unsigned long long g_f04608;
extern unsigned short g_f120d0;
extern unsigned short g_f120d2;
extern unsigned short g_f120d4;
extern unsigned short g_f120d6;

int sub_5046e0(void)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x8
    unsigned short v12;  // x12
    unsigned long long v13;  // x13
    unsigned long v14;  // x14
    unsigned long long v15;  // x16
    unsigned long v16;  // x15
    unsigned long long v17;  // x0
    unsigned long long v18;  // x0
    unsigned long long v19;  // x15
    unsigned long long v20;  // x17
    unsigned long long v21;  // x13
    st_5046e0_0 *v4;  // x12
    unsigned long long v22;  // x13
    unsigned long long v23;  // x13
    unsigned long long v24;  // x13
    unsigned long long v25;  // x15
    unsigned long long v26;  // x14
    unsigned long v27;  // x15
    unsigned long long v28;  // x13
    unsigned int v29;  // w13
    unsigned long v30;  // x15
    unsigned long long v31;  // x16
    st_5046e0_0 **v5;  // x13
    unsigned long long v32;  // x17
    unsigned long long v33;  // x17
    unsigned long long v34;  // x15
    unsigned long long v35;  // x15
    unsigned long long v36;  // x15
    unsigned long v37;  // x15
    unsigned long long v38;  // x17
    unsigned long long v39;  // x16
    unsigned int v40;  // w15
    unsigned int v41;  // w16
    unsigned long long v6;  // x16
    unsigned int v42;  // w13
    unsigned long v43;  // x15
    unsigned long v44;  // x16
    unsigned long v45;  // x0
    unsigned long long v46;  // x2
    unsigned long long v47;  // x17
    unsigned long long v48;  // x14
    unsigned long long v49;  // x17
    unsigned long long v50;  // x15
    unsigned long long v51;  // x16
    unsigned long long v7;  // x12
    unsigned long long v52;  // x14
    unsigned long long v53;  // x14
    unsigned long long v54;  // x15
    unsigned long long v55;  // x14
    unsigned short v56;  // x14
    unsigned long v57;  // x15
    unsigned long v58;  // x16
    unsigned long long v59;  // x17
    unsigned long long v60;  // x0
    unsigned long long v61;  // x0
    unsigned long long v8;  // x13
    unsigned long long v62;  // x1
    unsigned long long v63;  // x16
    unsigned long long v64;  // x15
    unsigned long long v65;  // x15
    unsigned long long v66;  // x15
    unsigned long long v67;  // x16
    unsigned long long v68;  // x17
    unsigned long long v69;  // x0
    unsigned int v70;  // w16
    unsigned int v71;  // w15
    unsigned long long v9;  // x14
    unsigned short v72;  // x14
    unsigned long long v73;  // x15
    unsigned long v74;  // x16
    unsigned long long v75;  // x0
    unsigned long long v76;  // x17
    unsigned long long v77;  // x17
    unsigned long long v78;  // x11
    unsigned long long v79;  // x11
    unsigned long long v80;  // x11
    unsigned long long v81;  // x11
    unsigned int v10;  // w12
    unsigned long long v82;  // x15
    unsigned int v83;  // w16
    unsigned int v84;  // w12
    unsigned int v85;  // w15
    unsigned int v86;  // w16
    unsigned int v87;  // w12
    unsigned int v88;  // w15
    unsigned int v89;  // w13
    unsigned int v90;  // w15
    unsigned int v91;  // w13
    unsigned int v11;  // w13
    unsigned short v92;  // x12
    unsigned short v93;  // x13
    unsigned int v94;  // w14
    unsigned int v95;  // w14
    unsigned int v96;  // w15
    unsigned short v97;  // x11
    unsigned short v98;  // x12
    unsigned long v99;  // x13
    unsigned long long v100;  // x12
    st_5046e0_0 **v0;  // [bp-0x10], Other Possible Types: unsigned long long, char
    st_5046e0_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v1 = &v0;
    v0 = &v1;
    v2 = 0xff51afd7ed558ccd * ((char *)&g_f04600 + ~(~&g_f04600 + &g_f04600));
    v3 = ((v2 | v2 >> 29) ^ ~v2 - (v2 >> 29 | ~v2)) + ((v2 | v2 >> 29) & ~v2 - (v2 >> 29 | ~v2)) * 2;
    v4 = v1;
    v5 = v0;
    v6 = v5 - v4 + ((char *)v5 + (0xffffffffffffffff ^ v5 * 2) & v4) * 4 - ((char *)v5 + (0xffffffffffffffff ^ v5 * 2) & v4) * 2;
    v7 = v5 + v4 + ((&v4[0xffffffffffffffff ^ v4 * 2] & v5) + (char *)~v5) * 2 + (v6 ^ 1) - v6 * 2 + (v6 * 2 & 2);
    v8 = v7 + 1;
    v9 = ((~(unsigned int)v8 & 60681) + (v8 ^ 0xffffffffffff12f6) ^ v7 + 2) + ((~(unsigned int)v8 & 60681) + (v8 ^ 0xffffffffffff12f6) & v7 + 2) * 2;
    v0 = (v9 ^ (v8 | 60681) + 1) + (v9 & (v8 | 60681) + 1) * 2 - 1;
    v1 = (v7 + 4855 ^ -(v8 | 4854)) + (v8 | 4854) + (v7 + 4855 & -(v8 | 4854)) * 2;
    v10 = (unsigned int)v1 + v0;
    v11 = (v10 + 1 ^ (unsigned int)v3) + (v10 + 1 & (unsigned int)v3) * 2;
    v12 = ~v11 - ((v10 | ~(unsigned int)v3) + v3 + (v10 ^ (unsigned int)v3));
    g_f120d0 = (v12 | 0xfffe) + (v12 + (unsigned short)v11 * 2 | 1);
    v13 = v1;
    v14 = v0;
    v15 = v14 + v13;
    v16 = v15 + (0xffffffffffffffff ^ v13 * 2);
    v17 = ~(v16 + (v13 | ~v14));
    v18 = v15 + 2;
    v19 = (v18 + ~v14 * 2 | (v16 + v17) * 2) + ((v16 + v17) * 2 & v18 + ~v14 * 2);
    v20 = v14 * 2;
    v21 = v20 - (v15 + (v14 | ~v13));
    v22 = (v21 & v15 + ~v20) * 4 + (v21 ^ v15 + ~v20) * 2 | 1;
    v23 = ~((v22 ^ v18 + ~v13 * 2) + (v22 & v18 + ~v13 * 2) * 2) + ((v22 ^ v18 + ~v13 * 2) + (v22 & v18 + ~v13 * 2) * 2) * 2;
    v24 = (v23 ^ v19) + (-v23 & ~v19 | v23 & v19) * 2 + ~((v19 - v23 & -(v19 | -v23)) * 4 + (v19 - v23 ^ -(v19 | -v23)) * 2) + ((v19 - v23 & -(v19 | -v23)) * 4 + (v19 - v23 ^ -(v19 | -v23)) * 2) * 2;
    v25 = v24 + 2;
    v26 = ~v25 + v25 * 2;
    v0 = v26 + 4;
    v1 = (v26 ^ 13) + ((0xfffffffffffffffe - v24 | 13) + v25) * 2 - 1;
    v27 = v1;
    v28 = (v27 + ~v27 * 2 + 1 & v0) + v27;
    v29 = v3 >> (((char)v27 & (char)v0) + (char)v28 + ((char)v28 | (char)~(v27 & v0)) + ((char)v27 & (char)v0 & (char)~v28) + 1 & 63);
    v30 = v1;
    v31 = v0;
    v32 = (v30 ^ 1) + v30 * 2 + ~v30 * 4 + (v30 * 2 & 2) + 2 + ~((v30 ^ 1) + v30 * 2 + ~v30 * 4 + (v30 * 2 & 2) + 2) * 2;
    v33 = (v30 ^ -v31) + ((v32 + 1 | v31) & ~v32) * 4 + (v30 + (-v31 | ~v30) + (v32 ^ ~(v32 + 1 | v31))) * 2;
    v34 = v31 + v30 + ((v31 | v30) - (v31 + v30) & (v31 | v30)) * 2 + ((v31 | v30) - (v31 + v30) & ~(v31 | v30)) * 2;
    v35 = (v34 ^ 1) - v34 * 2 + (v34 * 2 & 2) - 2;
    v36 = v33 + v35 + (v35 | ~(v33 + 2)) + (v33 + 2 & ~v35) + 3;
    v37 = (v36 * 2 & 4) + (v36 ^ 2);
    v38 = v37 * 2;
    v39 = v38 + ~v37;
    v0 = (v37 - v38 | 60725) - (v39 & 60725) + v39 * 2 + 60726;
    v1 = (v39 ^ 4811) + ((-v37 | 4811) + v37) * 2 - 1;
    v40 = ((unsigned int)v1 | v0) + ((unsigned int)v1 | ~v0) + v0 + ((unsigned int)(0xfffffffe - (((unsigned int)v1 | ~v0) + v0)) | (unsigned int)v1 | v0) + (((unsigned int)v1 | ~v0) + v0 + 1 & ~((unsigned int)v1 | v0)) + 2;
    v41 = v29 + (v40 | ~v29) + (v40 | v29);
    v42 = (v40 + ~v40 * 2 + 1 & v29) + v40;
    g_f120d2 = (unsigned short)v41 + (unsigned short)v42 + ((unsigned short)(v41 + 1 - v42 - ((unsigned short)v41 + 1 | -v42 & 0xffff)) + ((unsigned short)-v42 & (unsigned short)~(v41 + 1))) * 2 + 1;
    v43 = v1;
    v44 = v0;
    v45 = ~v44;
    v46 = v44 | v43;
    v47 = (v43 + ~v43 * 2 + 1 | v44) + v43;
    v48 = v47 + (v45 & ~v43) + v46 * 2 + 2 + (0xfffffffffffffffe - ((v45 & ~v43) + v46 * 2) & ~v47) * 2 + ((0xfffffffffffffffe - ((v45 & ~v43) + v46 * 2) | ~v47) + (v45 & ~v43) + v46 * 2 + 2) * 2;
    v49 = v48 + 1;
    v50 = (v44 + v45 * 2 + 1 | v43) + v44;
    v51 = v46 + ~v50;
    v52 = -(v49 + (-v51 | ~v48));
    v53 = (v49 - v51 + (v51 - 1 | ~v48) ^ v52) + (v50 - v46 + v49 + (v49 - v49 * 2 & v51 - 1) + (v49 - v51 + (v51 - 1 | ~v48) & v52)) * 2;
    v54 = v53 + 2;
    v55 = v53 + 3;
    v0 = (v54 ^ 10) + (v55 + (10 | ~v54)) * 2 - 1;
    v1 = (v54 ^ 24) + (v55 + (~v54 | 24)) * 2 - 1;
    v56 = v3 >> ((char)(v0 - v1) + (char)v1 * 2 & 63);
    v57 = v1;
    v58 = v0;
    v59 = v57 + v58 + (v57 + 1 + v58 + (-v58 | ~v57) + (-v58 & ~v57) + (v57 + 1 + ~v57 * 2 | ~v58)) * 2 + 2;
    v60 = v58 + ~v58 * 2;
    v61 = v60 + 2;
    v62 = v61 + ~(v60 + 1) * 2 | v57;
    v63 = (v62 & v61) * 4 + (v62 ^ v61) * 2 | 1;
    v64 = -((v63 ^ v58 - v57) + (v63 & v58 - v57) * 2);
    v65 = v59 + (v64 | ~v59) + (v64 | v59) + 1;
    v66 = (v65 * 2 & 4) + (v65 ^ 2);
    v67 = (-(unsigned int)v66 | 0xffffffffffff46fe) + v66;
    v68 = (0xffffffffffff46ff - v67 ^ v66 + 0xb900) + (0xffffffffffff46ff - v67 & v66 + 0xb900) * 2;
    v69 = 0xfffe + (unsigned int)v66 * 2 & 0x8dfe;
    v0 = v68 + (v67 + 47361 | ~v68) + (v68 | v67 + 47361) + 1;
    v1 = ~(v66 + v69 + (v69 ^ 0x8dfe) + 0xffffffffffffb900) + (v66 + v69 + (v69 ^ 0x8dfe) + 0xffffffffffffb900) * 2;
    v70 = (unsigned int)v1 + ~(unsigned int)v1 * 2 + 1;
    v71 = v0 + v70 + ~v70 * 2 + 1;
    v72 = (v71 & v56) * 2 - ((v56 | ~v71) + v71);
    g_f120d4 = (v72 | 1) + (v72 & 1) + 0xfffe;
    v73 = v1;
    v74 = v0;
    v75 = v74 | v73;
    v76 = -((v74 + v73 ^ -v75) + (v74 + v73 & -v75) * 2);
    v77 = (v76 ^ v75) + (v75 + (v76 | ~v75)) * 2;
    v78 = 1 | (v74 + (0xffffffffffffffff ^ v74 * 2) & v73) * 2;
    v79 = ~((v78 ^ v74 - v73) + (v78 & v74 - v73) * 2) + ((v78 ^ v74 - v73) + (v78 & v74 - v73) * 2) * 2;
    v80 = v79 + v77 + 2 + ((v79 - 1 & ~(v77 + 2)) - v79 & v77 + 3) * 4 + ((v79 - 1 & v77 + 2) - (v79 + v77 + 2) + ((v79 - 1 & ~(v77 + 2)) - v79 ^ v77 + 3)) * 2;
    v81 = ((v80 | 27) + 1 ^ v80 + (27 | ~v80) + 1) + ((v80 | 27) + 1 & v80 + (27 | ~v80) + 1) * 2;
    v0 = v80 + 21;
    v1 = ~v81 + v81 * 2;
    v82 = v1 + ~v1 * 2;
    g_f120d6 = v3 >> ((char)v1 + (char)~v1 * 2 + (char)v0 + ((char)~v82 & (char)~v0) * 2 + ((char)v0 + ((char)~v82 | (char)~v0)) * 2 + 2 & 63);
    v83 = -g_f120d0;
    g_f04600 = ((unsigned short)v83 ^ g_f04600) + ((g_f04600 & ~g_f120d0) + (unsigned short)~(v83 | g_f04600)) * 2 + 2;
    v84 = g_f04602;
    v85 = -g_f120d2;
    v86 = g_f120d2 & ~g_f04602;
    v87 = g_f120d2 + g_f04602 + (v85 & ~g_f04602) * 2 + (unsigned int)(g_f04602 - g_f120d2 - (v85 | g_f04602)) * 2;
    v88 = (0xffffffff ^ v86 * 2) + v86 * 4 + 2;
    g_f04602 = (unsigned short)~((v87 ^ v88) + (v87 & v88) * 2) + (((unsigned short)v87 ^ (unsigned short)v88) + ((unsigned short)v87 & (unsigned short)v88) * 2) * 2;
    v89 = (0xffffffff ^ g_f04604 * 2) + g_f04604;
    v90 = v89 + g_f120d4;
    v91 = -(v89 | g_f120d4);
    v92 = g_f04604 + g_f120d4 + ~g_f120d4 * 2;
    g_f04604 = v92 + ((unsigned short)v90 & (unsigned short)v91) * 4 + ((unsigned short)v90 ^ (unsigned short)v91) * 2 + (((unsigned short)v90 & (unsigned short)v91) * 4 + ((unsigned short)v90 ^ (unsigned short)v91) * 2 | (unsigned short)(0xfffd - v92)) + (v92 + 2 & (unsigned short)~((v90 & v91) * 4 + (v90 ^ v91) * 2)) + 3;
    v93 = -g_f120d6;
    v94 = g_f04606 + ~g_f04606 * 2 + 1;
    v95 = v94 + ~v94 * 2;
    v96 = v95 + 1 | g_f120d6;
    v97 = (v93 ^ g_f04606) + (unsigned short)(g_f04606 - g_f120d6 - (v93 | g_f04606)) * 2;
    v98 = ((unsigned short)v96 & (unsigned short)~v95) * 4 + ((unsigned short)v95 ^ (unsigned short)~v96) * 2 | 1;
    g_f04606 = (v98 ^ v97) + (v98 & v97) * 2 - 1;
    v99 = g_f04608 + 1;
    v100 = v99 + ~g_f04608 * 2;
    g_f04608 = v3 + g_f04608 + (v99 + (-v3 | ~g_f04608) + (-v3 & ~g_f04608) + v100 + (v100 + ~v100 * 2 + 1 | v3)) * 2 + 2;
    return v84 - g_f120d2;
}
