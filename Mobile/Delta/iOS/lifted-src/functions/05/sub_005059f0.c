/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5059f0..0x5063c0 (2512 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_5059f0_0 {
    char field_0;
} st_5059f0_0;

extern unsigned short g_f04640;
extern unsigned short g_f04642;
extern unsigned short g_f04644;
extern unsigned short g_f04646;
extern unsigned long long g_f04648;
extern unsigned short g_f120f0;
extern unsigned short g_f120f2;
extern unsigned short g_f120f4;
extern unsigned short g_f120f6;

int sub_5059f0(void)
{
    unsigned long long v3;  // x8
    unsigned long long v4;  // x8
    unsigned long long v13;  // x12
    unsigned long long v14;  // x10
    unsigned long long v15;  // x12
    unsigned long v16;  // x13
    unsigned long long v17;  // x11
    unsigned int v18;  // w11
    unsigned short v19;  // x13
    unsigned short v20;  // x11
    unsigned int v21;  // w12
    unsigned long long v22;  // x14
    st_5059f0_0 *v5;  // x10
    unsigned long long v23;  // x12
    unsigned long long v24;  // x13
    unsigned long long v25;  // x13
    unsigned long long v26;  // x16
    unsigned long long v27;  // x12
    unsigned long long v28;  // x12
    unsigned int v29;  // w12
    unsigned long long v30;  // x13
    unsigned long v31;  // x14
    unsigned long long v32;  // x17
    st_5059f0_0 *v6;  // x11
    unsigned long long v33;  // x16
    unsigned long long v34;  // x13
    unsigned long long v35;  // x14
    unsigned long long v36;  // x13
    unsigned long long v37;  // x13
    unsigned long long v38;  // x13
    unsigned long long v39;  // x16
    unsigned long long v40;  // x13
    unsigned int v41;  // w13
    unsigned long long v42;  // x13
    st_5059f0_0 **v7;  // x12
    unsigned long long v43;  // x16
    unsigned long long v44;  // x17
    unsigned long long v45;  // x0
    unsigned long long v46;  // x16
    unsigned long long v47;  // x1
    unsigned long long v48;  // x2
    unsigned long long v49;  // x16
    unsigned long long v50;  // x15
    unsigned long long v51;  // x16
    unsigned long long v52;  // x17
    unsigned long long v8;  // x0
    unsigned long long v53;  // x0
    unsigned long long v54;  // x1
    unsigned long long v55;  // x16
    unsigned short v56;  // x15
    unsigned long v57;  // x17
    unsigned long long v58;  // x0
    unsigned long long v59;  // x0
    unsigned long long v60;  // x14
    unsigned long long v61;  // x14
    unsigned long long v62;  // x14
    unsigned long long v9;  // x16
    unsigned long long v63;  // x17
    unsigned int v64;  // w17
    unsigned short v65;  // x14
    unsigned long v66;  // x15
    unsigned long v67;  // x16
    unsigned long v68;  // x17
    unsigned long long v69;  // x1
    unsigned long long v70;  // x1
    unsigned long long v71;  // x0
    unsigned long long v72;  // x15
    unsigned long long v10;  // x14
    unsigned long long v73;  // x16
    unsigned long long v74;  // x15
    unsigned long long v75;  // x15
    unsigned long long v76;  // x15
    unsigned long long v77;  // x16
    unsigned long long v78;  // x0
    unsigned long long v79;  // x15
    unsigned long long v80;  // x1
    unsigned long long v81;  // x15
    unsigned long long v82;  // x16
    unsigned long long v11;  // x10
    unsigned int v83;  // w15
    unsigned int v84;  // w16
    unsigned int v85;  // w17
    unsigned int v86;  // w0
    unsigned int v87;  // w15
    unsigned int v88;  // w11
    unsigned int v89;  // w11
    unsigned short v90;  // x14
    unsigned int v91;  // w16
    unsigned int v92;  // w11
    unsigned long long v12;  // x11
    unsigned int v94;  // w10
    unsigned short v95;  // x13
    unsigned short v96;  // x10
    unsigned int v97;  // w12
    unsigned int v98;  // w11
    st_5059f0_0 **v1;  // [bp-0x10], Other Possible Types: unsigned long long, char
    st_5059f0_0 *v2;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v2 = &v1;
    v1 = &v2;
    v3 = 0xff51afd7ed558ccd * ((char *)&g_f04640 + ~(~&g_f04640 + &g_f04640));
    v4 = ((v3 | v3 >> 29) ^ ~v3 - (v3 >> 29 | ~v3)) + ((v3 | v3 >> 29) & ~v3 - (v3 >> 29 | ~v3)) * 2;
    v5 = v2;
    v6 = -v5;
    v7 = v1;
    v8 = v7 + v5;
    v9 = &v5[(-v7 | ~v5) + (-v7 & ~v5)];
    v10 = ((((v5 | v7) & v6) * 4 + ((v5 | v7) ^ v6) * 2 | 1) ^ v8 + v9 * 2 + 2) + ((((v5 | v7) & v6) * 4 + ((v5 | v7) ^ v6) * 2 | 1) & v8 + v9 * 2 + 2) * 2;
    v11 = v8 + (v7 - &v5[v7 | v6]) * 2 + (v5 - ((char *)v7 + 0x2 * ~v7 + 1) + ((char *)v7 + 0x2 * ~v7 + 1 | ~v5) & (char *)v7 + 0x2 * ~v7 + 2) * 4 + ((v5 - ((char *)v7 + 0x2 * ~v7 + 1) + ((char *)v7 + 0x2 * ~v7 + 1 | ~v5) ^ (char *)v7 + 0x2 * ~v7 + 2) + (v6 & ~v7)) * 2;
    v12 = -v11;
    v13 = -v10;
    v14 = ~v11 + v10 + (v11 - 1 | v13) + 1;
    v15 = -(v10 + (v12 | v13));
    v16 = v14 ^ v15;
    v17 = v16 + (v10 - 1 & v12) * 2 + (v14 & v15) * 2;
    v1 = v17 + (v17 + (28355 | ~v17)) * 2 + ((0xffffffff ^ (unsigned int)v17 * 2) & 56710) + 0xffffffffffff913e;
    v2 = (v17 & 0xfffffffffffffffe | v16 & 1) + 37181;
    v18 = v1;
    v19 = ((unsigned short)v18 + 1 + (unsigned short)~v18 * 2 | (unsigned short)v2) + (unsigned short)v18 + 1;
    v20 = (v19 ^ ((unsigned int)v2 | v18) + 1) + (v19 & ((unsigned int)v2 | v18) + 1) * 2 - 1;
    v21 = (unsigned int)v4 + ~(unsigned int)v4 * 2 + 1;
    g_f120f0 = (unsigned short)(v21 + v4 - v20) + (v20 & (unsigned short)v21) + (v20 & (unsigned short)~v21) * 2 + 1;
    v22 = v1 + v2;
    v23 = v1 | v2;
    v24 = -v23;
    v25 = (v22 & v24) * 2;
    v26 = v23 + v25 + (v22 ^ v24) + ~(v25 + (v22 ^ v24)) * 2;
    v27 = (v23 - 1 ^ v22) - v25 + v23;
    v28 = (v26 + 2 & v27) + ~(v26 + 1) + (v26 + 2 | ~v27) + ((0xfffffffffffffffd - v26 & v27) + ~v27 ^ v26 + 3) * 2 + ((0xfffffffffffffffd - v26 & v27) + ~v27 & v26 + 3) * 4;
    v1 = (v28 ^ 3) + v28 * 2 + (0xfffffffffffffffc & ~v28) + (v28 + ~v28 * 2 + 1 | 3) + 5;
    v2 = v28 + 13;
    v29 = v4 >> (((char)v2 + (char)~(v2 | v1) ^ v1 + 1) + ((char)v2 | v1) + ((char)v2 + (char)~(v2 | v1) & v1 + 1) * 2 & 63);
    v30 = v2;
    v31 = v1;
    v32 = (v31 + v30 ^ -(v31 | v30)) + (v31 + v30 & -(v31 | v30)) * 2;
    v33 = v31 + (v31 + ~v31 * 2 + 1 & v30) + v32 + ~v32 * 2 + 2;
    v34 = v31 & v30;
    v35 = v31 - v30 + v34 + (v30 & ~v31) * 2;
    v36 = v35 + v34 + (-v34 & ~v35) * 2 + (v35 + (-v34 | ~v35)) * 2 + 2;
    v37 = v36 + (0xffffffffffffffff ^ v36 * 2) + (v36 & v33) + (v36 + (0xffffffffffffffff ^ v36 * 2) & v33);
    v38 = (v37 * 2 & 4) + (v37 ^ 2);
    v39 = v38 - 1;
    v40 = (((v38 - v38 * 2 | 17180) ^ -(v38 - v38 * 2)) + ((v38 - v38 * 2 | 17180) & -(v38 - v38 * 2)) * 2 ^ (v39 | 17180) + 1) + (((v38 - v38 * 2 | 17180) ^ -(v38 - v38 * 2)) + ((v38 - v38 * 2 | 17180) & -(v38 - v38 * 2)) * 2 & (v39 | 17180) + 1) * 2;
    v1 = (v39 | 48355) + ((-v38 | 48355) ^ v38) + ((-v38 | 48355) & v38) * 2;
    v2 = ~v40 + v40 * 2;
    v41 = ((unsigned int)v2 + (unsigned int)v1 ^ -((unsigned int)v2 | (unsigned int)v1)) + ((unsigned int)v2 | (unsigned int)v1) + ((unsigned int)v2 + (unsigned int)v1 & -((unsigned int)v2 | (unsigned int)v1)) * 2;
    g_f120f2 = (((unsigned short)v41 | (unsigned short)v29) + ((unsigned short)v41 & (unsigned short)v29) ^ (unsigned short)-(v41 | v29)) + (((unsigned short)v41 | (unsigned short)v29) + ((unsigned short)v41 & (unsigned short)v29) + ((unsigned short)-(v41 | v29) | (unsigned short)~((v41 | v29) + (v41 & v29)))) * 2 + 2;
    v42 = v2;
    v43 = v1;
    v44 = v43 | v42;
    v45 = v43 + v42 + (-(v43 & v42) & ~v44) * 2 + (v44 + (-(v43 & v42) | ~v44)) * 2 + 2;
    v46 = ((v42 | ~v43) ^ 0xfffffffffffffffe - v43) - ((v42 | ~v43) & v43 + 1) * 2 + v44;
    v47 = v45 + ~v45 * 2 + 1;
    v48 = v46 + v45 + (v47 & ~v46) * 2;
    v49 = (v45 + ~v46 + (v47 & v46)) * 2;
    v50 = v48 + v49 + 2 + (0xfffffffffffffffd - v49 | 0xfffffffffffffffe - v48) + (v48 + 1 & v49 + 2);
    v51 = v50 + 2;
    v52 = ~v51;
    v53 = v50 + 3;
    v54 = ((v53 + v52 * 2 | 14) ^ v53) + ((v53 + v52 * 2 | 14) & v53) * 2;
    v55 = v51 + v53 + (v52 | 14) + ((0xffffffff ^ (unsigned int)v51 * 2) & 28) - 14;
    v1 = v55 + v54 + (v54 & ~v55) + (v55 | ~v54) + 1;
    v2 = v50 + 20;
    v56 = v4 >> ((char)(v1 + (char)v2 * 2 + (v2 ^ 0xfffffffffffffffe) - ((char)v2 * 2 & 2)) + 2 & 63);
    v57 = v1;
    v58 = ~v57 * 2;
    v59 = v58 + (v57 ^ 1) + ((v57 * 2 | v57 >> 63) & 2 & 3);
    v60 = (0xffffffffffffffff ^ (v57 + 1 + (-v2 | ~v57)) * 2) - (v57 ^ -v2) + (v57 + 1 + v2 + (v57 + 1 + v58 | ~v2) ^ -(v57 & v2)) - ((v59 + v2 ^ -(v59 | v2)) * 2 + (v59 + v2 & -(v59 | v2)) * 4) + (v57 + 1 + v2 + (v57 + 1 + v58 | ~v2) - ((v57 & v2) + (v57 + 1 + v2 + (v57 + 1 + v58 | ~v2) | -(v57 & v2)))) * 2;
    v61 = (~v60 | 1) + v60 + 1 + (~(v60 + 1) + (v60 + 1) * 2 | 1);
    v62 = v61 | 2037;
    v63 = (v61 + 2037 ^ -v62) + (v61 + 2037 & -v62) * 2;
    v1 = v61 + (126998 & v61 * 2) + (126998 & v61 * 2 ^ 126998) + 0xffffffffffff07f4;
    v2 = (v63 ^ v62 + 1) + (v63 & v62 + 1) * 2 - 1;
    v64 = (unsigned int)v2 | v1;
    v65 = ((unsigned short)v2 + (unsigned short)~v64 ^ v1 + 1) + ((unsigned short)v2 + (unsigned short)~v64 & v1 + 1) * 2;
    g_f120f4 = (unsigned short)((v56 ^ 0xfffe) + v56 * 2 - (v56 * 2 & 2)) + ((unsigned short)((v65 ^ v64 + 1) + (v65 & (unsigned short)v64 + 1) * 2 - 1) | (unsigned short)((v56 ^ 1) - v56 * 2) + (v56 * 2 & 2) + 0xfffe) + 3;
    v66 = v2;
    v67 = v1;
    v68 = ~v67;
    v69 = v67 | v66;
    v70 = -((v67 + v66 ^ -v69) + (v67 + v66 & -v69) * 2);
    v71 = ((v68 & ~v66) + v69 * 2 + 1 ^ v70) + ((v68 & ~v66) + v69 * 2 + (v70 | 0xfffffffffffffffe - ((v68 & ~v66) + v69 * 2))) * 2 + 4;
    v72 = v67 - v66;
    v73 = v72 + ((v67 + v68 * 2 + 1 + ~(v67 + v68 * 2 + 1) * 2 + 1 | v66) + v67 + v68 * 2 + 1) * 2 + 2;
    v74 = (v73 ^ 1) + ((v72 & 1) + ~v73) * 2;
    v75 = v71 + (v74 | ~v71) + (v74 | v71) + 1;
    v76 = v75 + (v75 & 1) + (~(unsigned int)v75 | 0xfffffffffffffffe);
    v77 = v76 + 2;
    v78 = ~v77;
    v79 = v76 + 3;
    v80 = v77 + v79 + (v78 | 4) + ((0xffffffff ^ (unsigned int)v77 * 2) & 8) - 4;
    v81 = (v79 + v78 * 2 | 44) + v77;
    v82 = (v77 | 1) + (v77 & 1) + (0xffffffffffffffd3 | ~v77) + 44;
    v1 = ((v77 | 0xfffffffffffffffb) + 5 | v80) + (v80 & (v77 | 0xfffffffffffffffb) + 5);
    v2 = v81 + (0xfffffffffffffffe - v81 | v82) + (v81 + 1 | v82) + 2;
    g_f120f6 = v4 >> ((char)(v1 - v2) + ((char)v2 & (char)v1) + ((char)v2 + (char)v1 ^ (char)-(v2 | v1)) + (((char)v2 + (char)v1 & (char)-(v2 | v1)) + ((char)v2 & (char)~v1)) * 2 & 63);
    v83 = g_f04640;
    v84 = -g_f120f0;
    v85 = (0xffffffff ^ v83 * 2) + v83 + g_f120f0;
    v86 = ~v85 - (v83 | ~g_f120f0);
    g_f04640 = (((unsigned short)v86 & (unsigned short)v85) * 4 + ((unsigned short)v86 ^ (unsigned short)v85) * 2 + (unsigned short)~((v86 & v85) * 4 + (v86 ^ v85) * 2) * 2 ^ 0xfffe) + ((unsigned short)v84 ^ (unsigned short)v83) + (unsigned short)(v83 - g_f120f0 - (v84 | v83)) * 2;
    v87 = g_f120f2 | g_f04642;
    v88 = g_f120f2 + g_f04642;
    v89 = (v88 ^ -v87) + (v88 & -v87) * 2;
    g_f04642 = (unsigned short)v87 + (unsigned short)v89 + ((unsigned short)(v87 - v89 - (v87 | -v89)) + ((unsigned short)-v89 & (unsigned short)~v87)) * 2;
    v90 = g_f04644 + (g_f120f4 | ~g_f04644) + (g_f120f4 ^ g_f04644);
    v91 = g_f120f4 + g_f04644;
    v92 = -(g_f120f4 | g_f04644);
    g_f04644 = (v91 ^ v92) + (v91 & v92) * 2 + v90 + 2 + ((-((v91 ^ v92) + (v91 & v92) * 2) & 0xffff | (unsigned int)(0xfffffffe - v90) & 0xffff) + v90 + 2 + (-((v91 ^ v92) + (v91 & v92) * 2) & 0xffff & (unsigned int)(0xfffffffe - v90) & 0xffff)) * 2 - 1;
    v94 = (0xffffffff ^ g_f04646 * 2) + g_f04646;
    v95 = (unsigned short)v94 + g_f120f6;
    v96 = -(v94 | g_f120f6);
    v97 = -g_f120f6;
    v98 = (v97 ^ g_f04646) + (g_f04646 + (v97 | ~g_f04646)) * 2 + 2;
    g_f04646 = (unsigned short)v98 + ((v95 & v96) * 4 + (v95 ^ v96) * 2 | (unsigned short)~v98) + ((v95 & v96) * 4 + (v95 ^ v96) * 2 | (unsigned short)v98) + 1;
    g_f04648 = g_f04648 - v4 + (v4 & ~g_f04648) * 2;
    return v84 ^ v83;
}
