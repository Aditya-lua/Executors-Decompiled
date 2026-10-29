/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4e2e18..0x4e3728 (2320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4e2e18_0 {
    char field_0;
} st_4e2e18_0;

extern unsigned short g_f04570;
extern unsigned short g_f04572;
extern unsigned short g_f04574;
extern unsigned short g_f04576;
extern unsigned long long g_f04578;
extern unsigned short g_f12088;
extern unsigned short g_f1208a;
extern unsigned short g_f1208c;
extern unsigned short g_f1208e;

int sub_4e2e18(void)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x8
    unsigned long long v12;  // x14
    unsigned long long v13;  // x13
    unsigned long long v14;  // x11
    unsigned long long v15;  // x11
    unsigned long long v16;  // x12
    unsigned int v17;  // w12
    unsigned short v18;  // x11
    unsigned short v19;  // x12
    unsigned long v20;  // x12
    unsigned long v21;  // x13
    st_4e2e18_0 *v4;  // x10
    unsigned long long v22;  // x14
    unsigned long long v23;  // x12
    unsigned long long v24;  // x12
    unsigned long long v25;  // x12
    unsigned long long v26;  // x12
    unsigned long long v27;  // x12
    unsigned int v28;  // w13
    unsigned long long v29;  // x12
    unsigned long v30;  // x16
    unsigned long v31;  // x0
    st_4e2e18_0 **v5;  // x11
    unsigned long long v32;  // x17
    unsigned long long v33;  // x12
    unsigned long long v34;  // x12
    unsigned long long v35;  // x15
    unsigned long long v36;  // x16
    unsigned long long v37;  // x0
    unsigned long v38;  // x16
    unsigned int v39;  // w15
    unsigned int v40;  // w16
    unsigned int v41;  // w13
    unsigned long long v6;  // x12
    unsigned long long v42;  // x15
    unsigned long long v43;  // x16
    unsigned long long v44;  // x1
    unsigned long long v45;  // x17
    unsigned long long v46;  // x15
    unsigned long v47;  // x2
    unsigned long long v48;  // x14
    unsigned long long v49;  // x14
    unsigned long long v50;  // x14
    unsigned long long v51;  // x14
    unsigned long long v7;  // x12
    char v52;  // x17
    char v53;  // x16
    unsigned int v54;  // w14
    unsigned long long v55;  // x15
    unsigned long long v56;  // x16
    unsigned long long v57;  // x17
    unsigned long long v58;  // x17
    unsigned long long v59;  // x15
    unsigned long long v60;  // x16
    unsigned int v61;  // w15
    unsigned long long v8;  // x11
    unsigned int v62;  // w16
    unsigned int v63;  // w0
    unsigned int v64;  // w17
    unsigned int v65;  // w15
    unsigned int v66;  // w15
    unsigned int v67;  // w16
    unsigned int v68;  // w17
    unsigned int v69;  // w15
    unsigned long long v70;  // x15
    unsigned long long v71;  // x16
    unsigned long long v9;  // x13
    unsigned long long v72;  // x2
    unsigned long long v73;  // x17
    unsigned long long v74;  // x0
    unsigned long long v75;  // x15
    unsigned long long v76;  // x16
    unsigned long long v77;  // x10
    unsigned long long v78;  // x15
    unsigned long long v79;  // x10
    unsigned long long v80;  // x10
    unsigned long long v81;  // x16
    unsigned long long v10;  // x10
    unsigned long v82;  // x10
    char v83;  // x17
    char v84;  // x16
    unsigned int v85;  // w16
    unsigned int v86;  // w17
    unsigned short v87;  // x10
    unsigned short v88;  // x11
    unsigned short v89;  // x10
    unsigned short v90;  // x11
    unsigned int v91;  // w12
    unsigned long long v11;  // x11
    unsigned short v92;  // x13
    unsigned short v93;  // x12
    unsigned int v94;  // w13
    unsigned short v95;  // x12
    unsigned int v96;  // w10
    unsigned short v97;  // x10
    unsigned long long v98;  // x11
    unsigned long long v99;  // x12
    unsigned long v100;  // x8
    st_4e2e18_0 **v0;  // [bp-0x10], Other Possible Types: unsigned long long, char
    st_4e2e18_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v1 = &v0;
    v0 = &v1;
    v2 = 0xff51afd7ed558ccd * ((char *)&g_f04570 + ~(~&g_f04570 + &g_f04570));
    v3 = ((v2 | v2 >> 29) ^ ~v2 - (v2 >> 29 | ~v2)) + ((v2 | v2 >> 29) & ~v2 - (v2 >> 29 | ~v2)) * 2;
    v4 = v1;
    v5 = v0;
    v6 = (v4 ^ 1) + v4 * 2 + ~v4 * 4 + (v4 * 2 & 2) + 2;
    v7 = (v4 - v5 | (v6 + (char *)v5 & -(v6 | v5)) * 4 + (v6 + (char *)v5 ^ -(v6 | v5)) * 2) + ((v6 + (char *)v5 & -(v6 | v5)) * 4 + (v6 + (char *)v5 ^ -(v6 | v5)) * 2 & v4 - v5);
    v8 = (char *)v5 + 0x2 * ~v5 + 1;
    v9 = (v5 & v4) + (v4 & ~v5) * 2;
    v10 = (v9 - (char *)v4 - (v8 | v4) | 1) + (v9 - (char *)v4 - (v8 | v4) & 1);
    v11 = v10 - 2;
    v12 = v7 + ~v7 * 2 + 1;
    v13 = (v7 ^ v11) + (v7 & v11) * 2 + (v12 - v11 - (v12 | 2 - v10)) * 2;
    v14 = ((v7 | v10 - 3) - v11) * 2;
    v15 = (v14 + 2 | ~v13) + v14 + 2 + (0xfffffffffffffffd - v14 | ~v13) + v13 * 2;
    v16 = v15 + 2;
    v0 = v16 + (110282 & v16 * 2) + (110282 & v16 * 2 ^ 110282) + 0xffffffffffff289a;
    v1 = v16 + (~(unsigned int)v16 | 0xffffffffffffd764) + (v15 + 10397 ^ -(v16 | 10395)) + (v15 + 10397 & -(v16 | 10395)) * 2 + 10396;
    v17 = (unsigned int)v1 + ~(unsigned int)v1 * 2 + 1;
    v18 = v0 + (unsigned short)v17 + (unsigned short)~v17 * 2 + 1;
    v19 = (v18 | (unsigned short)~(unsigned int)v3) + (unsigned short)v3;
    g_f12088 = ((unsigned int)v3 | v18) + v19 - (v19 + (v18 ^ (unsigned int)v3));
    v20 = v1;
    v21 = v0;
    v22 = v21 & ~v20;
    v23 = ((0xffffffffffffffff ^ (v20 - v21 + v22) * 2) + (v20 - v21 + v22) * 4 + 2 ^ v21 - v20) + ((0xffffffffffffffff ^ (v20 - v21 + v22) * 2) + (v20 - v21 + v22) * 4 + 2 & v21 - v20) * 2;
    v24 = (v23 - v23 * 2 + 1 ^ (v20 & ~v21) - v21 + (v21 & v20) + v22 * 2) + (v23 - v23 * 2 + 1 & (v20 & ~v21) - v21 + (v21 & v20) + v22 * 2) * 2;
    v25 = (-v24 | 1) + v24 + (v24 - 1 | 1);
    v26 = v25 + (~(unsigned int)v25 | 0xfffffffffffffff7);
    v27 = (v25 + 8 ^ 0xfffffffffffffff7 - v26) + (v25 + 8 & 0xfffffffffffffff7 - v26) * 2;
    v0 = ((v25 | 1) + (v25 & 1) + 8 | 1) + ((v25 | 1) + (v25 & 1) + 8 & 1) - 2;
    v1 = (v27 | v26 + 9) + (v27 & v26 + 9);
    v28 = v3 >> ((char)~((v1 + 1 ^ v0) + (v1 + 1 & v0) * 2) + (((char)v1 + 1 ^ v0) + ((char)v1 + 1 & v0) * 2) * 2 & 63);
    v29 = v1;
    v30 = v0;
    v31 = ~v30;
    v32 = v30 + v30 + v31 * 2 + 1 - (v30 + v29 & -(v30 | v29)) * 2 + ((v30 | v29) - 1 ^ v30 + v29) + (v29 | ~(v30 + v31 * 2 + 1)) + 2;
    v33 = (v30 ^ -v29) + (v30 * 3 + v31 * 4 + 3 + v29 & -(v30 * 3 + v31 * 4 + 3 | v29)) * 4 + (v30 - v29 - (v30 | -v29) + (v30 * 3 + v31 * 4 + 3 + v29 ^ -(v30 * 3 + v31 * 4 + 3 | v29))) * 2;
    v34 = v33 + ~v33 * 2 + 2;
    v35 = (v34 ^ v32) - 1;
    v36 = ~(((v35 + (v34 & v32) * 2) * 2 & 4) + (v35 + (v34 & v32) * 2 ^ 2)) + (((v35 + (v34 & v32) * 2) * 2 & 4) + (v35 + (v34 & v32) * 2 ^ 2)) * 2;
    v37 = (v36 + 45168 ^ -(v36 | 45168)) + (v36 + 45168 & -(v36 | 45168)) * 2;
    v38 = v36 + (v36 & 45168) + ((0xffffffff ^ (unsigned int)v36 * 2) & 90336);
    v0 = (v36 & 0xfffffffffffffffe) - (v35 | 0xfffffffffffffffe) + 20366;
    v1 = v38 + 0xffffffffffff4f90 + (v37 & 45167 - v38) + (v38 + 0xffffffffffff4f90 & v37);
    v39 = (unsigned int)v1 + (unsigned int)v0;
    v40 = v28 + (v39 | ~v28) + (v28 | v39) + 1;
    v41 = v28 - v39 + (v28 & v39) + (v39 & ~v28) * 2;
    g_f1208a = (unsigned short)v41 + (unsigned short)v40 + ((unsigned short)v40 + ((unsigned short)-v41 | (unsigned short)~v40) + ((unsigned short)-v41 & (unsigned short)~v40)) * 2 + 2;
    v42 = v1;
    v43 = v0;
    v44 = v43 + 1;
    v45 = v44 + v42 + ((v42 ^ 1) + ~v42 * 2 + ((v42 * 2 | v42 >> 63) & 2 & 3) & v43) * 2 + (v42 - v43 - (v42 | -v43) + (-v43 & ~v42)) * 2;
    v46 = -v42;
    v47 = v43 ^ v46;
    v48 = v47 + (v44 + (v46 | ~v43) + (v43 + (0xffffffffffffffff ^ v43 * 2) & v42)) * 2;
    v49 = (v48 ^ 1) + ((v47 * 2 | v47 >> 63) & 2 & 3) + ~v48 * 2;
    v50 = v49 + v45 + (v49 | -v45) + (~v45 + v45 * 2 & ~v49);
    v0 = v50 + 16;
    v1 = ((0xfffffffffffffffe - v50 | 0x11) ^ v50 + 2) + (v50 + 1 | 0x11) + ((0xfffffffffffffffe - v50 | 0x11) & v50 + 2) * 2;
    v51 = v0;
    v52 = (char)v51 + 1;
    v53 = v52 + (char)~v51 * 2 | (char)v1;
    v54 = v3 >> ((v53 ^ v52) + ((char)v1 | (char)v51) + (v53 & v52) * 2 & 63);
    v55 = v1;
    v56 = v0;
    v57 = v55 + ~v55 * 2;
    v58 = (v57 ^ ~(v56 + ~(v56 | v55))) + (v56 + ~(v56 | v55) & ~v57) * 2 + v56 - v55 + (v55 & ~v56) * 2;
    v59 = v55 + v56 + (v56 + ~v56 * 2 + 1 | v57 + 1);
    v60 = v58 + v59 + 4 - v58 * 2 & 0xfffffffffffffffe | v58 + v59 + 4 & 1;
    v0 = v60 + 54830;
    v1 = v60 + 10699;
    v61 = v0;
    v62 = v1;
    v63 = v61 + 1;
    v64 = v63 + ~v61 * 2 | v62;
    v65 = v61 - v62 + (v62 & v61) + (v62 & ~v61) * 2;
    v66 = (v64 ^ v63) + (v64 & v63) * 2 + (v65 | ~((v64 ^ v63) + (v64 & v63) * 2)) + ((v64 ^ v63) + (v64 & v63) * 2 | v65) + 1;
    v67 = ~v54;
    v68 = (v54 ^ 1) + v67 * 2 + (__ROL__(v54, 1) & 2 & 3);
    v69 = (v66 | ~v68) + ~v66 + (v66 | v68) * 2 + 2;
    g_f1208c = (unsigned short)v69 + (unsigned short)v67 + ((unsigned short)v69 + ((unsigned short)v54 + 1 | (unsigned short)~v69) + ((unsigned short)v54 + 1 & (unsigned short)~v69)) * 2 + 2;
    v70 = v1;
    v71 = v0;
    v72 = v71 | v70;
    v73 = v70 + (v71 | ~v70) + (v71 ^ v70) + (v71 + v70 ^ -v72) + (v71 + v70 & -v72) * 2 + ~((v71 + v70 ^ -v72) + (v71 + v70 & -v72) * 2) * 2;
    v74 = v73 + 3;
    v75 = v71 - v70 + (v72 ^ -v71) * 2 + (v72 & -v71) * 4 + ~(v71 - v70 + (v72 ^ -v71) * 2 + (v72 & -v71) * 4) * 2;
    v76 = v75 + 2;
    v77 = 0xfffffffffffffffd - v75;
    v78 = ((v77 & v74) + v76 ^ -(v76 & v74)) + ((v77 & v74) + v76 & -(v76 & v74)) * 2;
    v79 = ((v77 & ~v74) + v76 & v73 + 4) * 4 + ((v77 & ~v74) + v76 ^ v73 + 4) * 2 | 1;
    v80 = (v79 ^ v78) + (v79 & v78) * 2 - 1;
    v81 = v80 * 2;
    v0 = (v80 ^ 5) + (v81 & 10) - 1;
    v1 = (v80 ^ 45 | 0xfffffffffffffffe) + ((v81 & 90) + (v80 ^ 45) | 1);
    v82 = v0;
    v83 = (char)v82 + 1;
    v84 = v83 + (char)~v82 * 2 | (char)v1;
    g_f1208e = v3 >> (((char)v82 | (char)v1) + (v84 ^ v83) + (v84 & v83) * 2 & 63);
    v85 = g_f12088 | g_f04570;
    v86 = -g_f04570;
    v87 = g_f04570 - g_f12088;
    v88 = ((unsigned short)v85 & (unsigned short)v86) * 4 + ((unsigned short)v85 ^ (unsigned short)v86) * 2;
    g_f04570 = (v87 | v88) + (v88 & v87);
    v89 = g_f04572 - g_f1208a;
    v90 = (g_f1208a & ~g_f04572) * 2;
    g_f04572 = (v89 | v90) + (v90 & v89);
    v91 = (0xffffffff ^ g_f04574 * 2) + g_f04574;
    v92 = (unsigned short)v91 + g_f1208c;
    v93 = -(v91 | g_f1208c);
    g_f04574 = g_f04574 - g_f1208c + (v92 ^ v93) * 2 + (v92 & v93) * 4;
    v94 = g_f1208e | g_f04576;
    v95 = (~g_f1208e & ~g_f04576) + (unsigned short)v94 * 2 + 1;
    v96 = g_f1208e + g_f04576;
    v97 = -((v96 ^ -v94) + (v96 & -v94) * 2);
    g_f04576 = (v97 ^ v95) + (v97 & v95) * 2;
    v98 = g_f04578 + ~g_f04578 * 2;
    v99 = v3 + ~(v98 + 1 | v3);
    v100 = g_f04578 - v3;
    g_f04578 = v100 + (v99 & v98 + 2) * 4 + (v99 ^ v98 + 2) * 2 + (v100 & ~((v99 & v98 + 2) * 4 + (v99 ^ v98 + 2) * 2)) + ((v99 & v98 + 2) * 4 + (v99 ^ v98 + 2) * 2 | ~v100) + 1;
    return v85 ^ v86;
}
