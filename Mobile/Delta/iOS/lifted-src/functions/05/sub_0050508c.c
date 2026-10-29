/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x50508c..0x5059f0 (2404 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_50508c_0 {
    char field_0;
} st_50508c_0;

extern unsigned short g_f044c0;
extern unsigned short g_f044c2;
extern unsigned short g_f044c4;
extern unsigned short g_f044c6;
extern unsigned long long g_f044c8;
extern unsigned short g_f12030;
extern unsigned short g_f12032;
extern unsigned short g_f12034;
extern unsigned short g_f12036;
extern unsigned int g_fffffffffffffffc;

unsigned long long sub_50508c(void)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x8
    unsigned long long v12;  // x10
    unsigned long long v13;  // x11
    unsigned long long v14;  // x13
    unsigned long v15;  // x14
    unsigned long long v16;  // x12
    unsigned short v17;  // x10
    unsigned int v18;  // w11
    unsigned short v19;  // x10
    unsigned long long v20;  // x11
    unsigned long long v21;  // x12
    st_50508c_0 *v4;  // x10
    unsigned long long v22;  // x14
    unsigned long long v23;  // x13
    unsigned long long v24;  // x16
    unsigned long long v25;  // x11
    unsigned long long v26;  // x11
    unsigned long long v27;  // x11
    unsigned long long v28;  // x12
    unsigned long long v29;  // x11
    unsigned long long v30;  // x12
    char v31;  // x14
    st_50508c_0 **v5;  // x11
    char v32;  // x11
    unsigned int v33;  // w12
    unsigned long long v34;  // x11
    unsigned long long v35;  // x15
    unsigned long long v36;  // x16
    unsigned long long v37;  // x16
    unsigned long long v38;  // x0
    unsigned long long v39;  // x17
    unsigned long long v40;  // x16
    unsigned long long v41;  // x16
    unsigned long long v6;  // x13
    unsigned long long v42;  // x11
    unsigned long long v43;  // x17
    unsigned long long v44;  // x15
    unsigned long long v45;  // x15
    unsigned long long v46;  // x15
    unsigned long long v47;  // x15
    unsigned int v48;  // w15
    unsigned int v49;  // w16
    unsigned int v50;  // w15
    unsigned int v51;  // w15
    unsigned long long v7;  // x12
    unsigned long long v52;  // x15
    unsigned long v53;  // x17
    unsigned long long v54;  // x3
    unsigned long long v55;  // x0
    unsigned long long v56;  // x0
    unsigned long long v57;  // x2
    unsigned long long v58;  // x15
    unsigned long long v59;  // x17
    unsigned long long v60;  // x1
    unsigned long long v61;  // x16
    unsigned long long v8;  // x10
    unsigned long long v62;  // x0
    unsigned long long v63;  // x15
    unsigned long long v64;  // x13
    unsigned long long v65;  // x15
    unsigned short v66;  // x13
    unsigned long long v67;  // x15
    unsigned long v68;  // x16
    unsigned long long v69;  // x3
    unsigned long long v70;  // x15
    unsigned long long v71;  // x3
    unsigned long long v9;  // x10
    unsigned long long v72;  // x14
    unsigned long long v73;  // x14
    unsigned int v74;  // w14
    unsigned int v75;  // w15
    unsigned int v76;  // w16
    unsigned int v77;  // w14
    unsigned int v78;  // w14
    unsigned long long v79;  // x14
    unsigned long long v80;  // x15
    unsigned long long v81;  // x0
    unsigned long long v10;  // x10
    unsigned long long v82;  // x16
    unsigned long long v83;  // x14
    unsigned long v84;  // x14
    unsigned long long v85;  // x15
    unsigned long long v86;  // x11
    unsigned short v87;  // x15
    unsigned int v88;  // w10
    unsigned short v89;  // x12
    unsigned short v90;  // x15
    unsigned short v91;  // x12
    unsigned long long v11;  // x10
    unsigned short v92;  // x13
    unsigned short v93;  // x15
    unsigned long long v94;  // x11
    unsigned long v95;  // x8
    st_50508c_0 **v0;  // [bp-0x10], Other Possible Types: unsigned long long, char
    st_50508c_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long long

    v1 = &v0;
    v0 = &v1;
    v2 = 0xff51afd7ed558ccd * ((char *)&g_f044c0 + ~(~&g_f044c0 + &g_f044c0));
    v3 = ((v2 | v2 >> 29) ^ ~v2 - (v2 >> 29 | ~v2)) + ((v2 | v2 >> 29) & ~v2 - (v2 >> 29 | ~v2)) * 2;
    v4 = v1;
    v5 = v0;
    v6 = v5 + v4 + (-v5 & ~v4) * 2 + &v4[-v5 | ~v4] * 2 + 2;
    v7 = v6 + ((v5 & ~v4) * 2 | ~v6) + (v6 | (v5 & ~v4) * 2) + 1;
    v8 = ((char *)v5 + 0x2 * ~v5 ^ ~((char *)v5 + 0x2 * ~v5 + 1 | v4)) + (((char *)v5 + 0x2 * ~v5 + 1 | v4) & ~(st_50508c_0 **)((char *)v5 + 0x2 * ~v5)) * 2;
    v9 = v8 + (v5 | v4) + (-v8 & ~(v5 | v4)) * 2 + ((v5 | v4) - v8 - (v5 | v4 | -v8)) * 2;
    v10 = v9 + ~v9 * 2 + 1;
    v11 = v7 + (v10 | ~v7) + (v10 | v7) + 1;
    v12 = (v11 * 2 & 4) + (v11 ^ 2);
    v13 = ~v12 + v12 * 2;
    v14 = -v12;
    v15 = (unsigned int)v12 + (unsigned int)v14 * 2;
    v16 = (v13 + 49611 + (v15 | 0xffffffffffff3e36) ^ v13 & 49609) + (v13 + 49611 + (v15 | 0xffffffffffff3e36) & v13 & 49609) * 2;
    v0 = ~v16 + v16 * 2;
    v1 = v13 + ((v14 | 15927) + v12) * 2 + 0xffffffffffffc1c8 + ((0xffffffff ^ (unsigned int)v13 * 2) & 31854);
    v17 = (unsigned int)v0 + (unsigned int)v1 * 4 + ((unsigned int)v1 ^ 0xfffffffe) - ((unsigned int)v1 * 2 + ((unsigned int)v1 * 2 & 2));
    v18 = ((unsigned int)v3 ^ 1) + (unsigned int)v3 * 2 + ~(unsigned int)v3 * 4 + ((unsigned int)v3 * 2 & 2) + 2;
    v19 = v17 + (unsigned short)v18 + ((unsigned short)(0xfffffffd - v17) | (unsigned short)~v18);
    g_f12030 = (v19 + 3 ^ (unsigned short)v3 + 1) + (v19 + ((unsigned short)v3 + 1 | (unsigned short)(0xfffffffc - v19))) * 2 + 8;
    v20 = v1;
    v21 = v0;
    v22 = v21 + 1;
    v23 = v22 + ~v21 * 2;
    v24 = v21 & v20;
    v25 = v22 + v20 - v24 + ((v23 | v20) ^ (char *)&g_fffffffffffffffc - v21 + 2) - ((v23 | v20) & v22) * 2;
    v26 = (v23 + v22 + (v20 | ~v23) ^ -v24) + v25 + (v23 + v22 + (v20 | ~v23) + (-v24 | ~(v23 + v22 + (v20 | ~v23)))) * 2 + ~v25 * 2 + 3;
    v27 = (v26 * 2 & 4) + (v26 ^ 2);
    v28 = ((v27 - 1 ^ 0xfffffffffffffff1) + v27 + (v27 - 1 & 14 ^ 14) ^ v27 - (v27 - 1 & 14) + 14) + ((v27 - 1 ^ 0xfffffffffffffff1) + v27 + (v27 - 1 & 14 ^ 14) & v27 - (v27 - 1 & 14) + 14) * 2;
    v0 = ~v28 + v28 * 2;
    v1 = v27 + 1;
    v29 = v0;
    v30 = v1;
    v31 = ((char)v29 + 1 + (char)~v29 * 2 | (char)v30) + (char)v29 + 1;
    v32 = ((char)v30 + (char)~v30 * 2 + 1 & (char)v29) + (char)v30;
    v33 = v3 >> ((v31 | v32) + (v32 & v31) & 63);
    v34 = v1;
    v35 = v0;
    v36 = (v34 ^ 1) + ~v34 * 2 + ((v34 * 2 | v34 >> 63) & 2 & 3);
    v37 = v36 + v35 + (~v36 & ~v35) + 1;
    v38 = v35 + v34;
    v39 = v38 + (v34 - v35 - (v34 | -v35) + (-v35 & ~v34)) * 2;
    v40 = ((char *)&g_fffffffffffffffc + 3 ^ v37 * 2) + v37 * 4 + 2;
    v41 = ~((v40 ^ v39) + (v40 & v39) * 2) + ((v40 ^ v39) + (v40 & v39) * 2) * 2;
    v42 = v35 + (-v34 | ~v35) + (-v34 & ~v35);
    v43 = 1 | (v34 & ~v35) * 2;
    v44 = (v38 + v42 * 2 + 2 ^ v43) + (v38 + v42 * 2 + 2 & v43) * 2;
    v45 = (v44 - 1 ^ 1) - v44 * 2 + (((v44 - 1) * 2 | v44 - 1 >> 63) & 2 & 3) + 1;
    v46 = (v41 ^ v45) + (v41 & v45) * 2 - 1;
    v47 = (v46 * 2 & 4) + (v46 ^ 2);
    v0 = (-(unsigned int)v47 | 0xffffffffffff44d1) + (1 & ~v47) + (~v47 + v47 * 2 | 1) + (~v47 + v47 * 2 + 47918 ^ -(~v47 + v47 * 2 | 47918)) + (~v47 + v47 * 2 + 47918 & -(~v47 + v47 * 2 | 47918)) * 2 + 47918;
    v1 = v47 + 17616;
    v48 = v0;
    v49 = v1;
    v50 = v48 + v49 + 1 + (v49 + 1 + ~v49 * 2 | ~v48) + 1;
    v51 = (v50 ^ v49 & v48) + (v50 & v49 & v48) * 2;
    g_f12032 = (unsigned short)v33 + ((unsigned short)~v51 + (unsigned short)v51 * 2 | (unsigned short)~v33) + 1;
    v52 = v1;
    v53 = v0;
    v54 = v52 + 1;
    v55 = v54 + ~v52 * 2 | v53;
    v56 = v54 + v52 - v53 + (v53 | ~v52) + (v53 & ~v52) * 2 + (v55 ^ (char *)&g_fffffffffffffffc - v52 + 2) - (v55 & v54) * 2;
    v57 = (v53 ^ 1) + v53 * 2 + ~v53 * 4 + (v53 * 2 & 2) + 2;
    v58 = v53 + v52 + (v57 + v52 & -(v57 | v52)) * 4 + (v53 - v52 - (v53 | -v52) + (-v52 & ~v53) + (v57 + v52 ^ -(v57 | v52))) * 2;
    v59 = v58 - 1;
    v60 = (char *)&g_fffffffffffffffc - v56 + 2;
    v61 = v58 + v60 + (v56 + 1 | -v58) + (v59 & v56 + 1) - v58;
    v62 = v56 + 2;
    v63 = (v59 & v62 + v60 * 2) - v58;
    v64 = v61 + (v63 & v62) * 4 + (v63 ^ v62) * 2 + ((v63 & v62) * 4 + (v63 ^ v62) * 2 | (char *)&g_fffffffffffffffc - v61 + 2) + (v61 + 1 & ~((v63 & v62) * 4 + (v63 ^ v62) * 2));
    v0 = v64 + 2 + (23 | ~(v64 + 2)) + (v64 + 2 | 23) + 1;
    v1 = v64 + 11;
    v65 = v1 + ~v1 * 2 + 1;
    v66 = v3 >> (v0 + (char)v65 + (char)~v65 * 2 + 1 & 63);
    v67 = v1;
    v68 = v0;
    v69 = v68 + ~v68 * 2 + 1 + ~(v68 + ~v68 * 2 + 1) * 2;
    v70 = v68 - v67;
    v71 = v70 + (v69 ^ ~(v69 + 1 | v67)) * 2 + ((v69 + 1 | v67) & ~v69) * 4;
    v72 = v67 + 1 + v68 + (v68 & ~v67) * 4 + ((char *)&g_fffffffffffffffc + 3 ^ (v68 & ~v67) * 2) + ((v70 * 2 | v70 >> 63) & 2 & 3) + (v71 ^ 1) + ((-v68 | ~v67) + v67 + 1 + (-v68 & ~v67) + ~v71) * 2;
    v73 = ~((v72 * 2 & 4) + (v72 ^ 2)) + ((v72 * 2 & 4) + (v72 ^ 2)) * 2;
    v0 = v73 + 59022 - (v73 & 59021) + (v73 | 0xffffffffffff1972) + 59022 + (0xffffffffffff1971 - (v73 | 0xffffffffffff1972) | (v73 & 59021) - (v73 + 59022)) + ((v73 | 0xffffffffffff1972) + 59022 & v73 + 59022 + ~(v73 & 59021));
    v1 = v73 + 6514;
    v74 = v0;
    v75 = v1;
    v76 = v75 & v74;
    v77 = v74 - v75 + v76 + (v75 & ~v74) * 2;
    v78 = v76 + (v77 | ~v76) + (v77 | v76) + 1;
    g_f12034 = (v78 & v66 | v66 & ~v78) - (v78 + ~v78 * 2 + 1 & v66);
    v79 = v1;
    v80 = v0;
    v81 = v80 | v79;
    v82 = (v80 + 1 + ~v80 * 2 & v79) + v80 + 1 + (v80 + ~v81 ^ v79 + ~v79 * 2) - (v80 + ~v81 & v79 + 1) * 2;
    v83 = (v82 ^ (v80 + v79 ^ -v81) - v81 + (v80 + v79 & -v81) * 2) + (v82 & (v80 + v79 ^ -v81) - v81 + (v80 + v79 & -v81) * 2) * 2 - 1;
    v84 = (v83 * 2 & 4) + (v83 ^ 2);
    v85 = ~v84 + v84 * 2;
    v86 = (v85 | 1) + (1 & ~v84) + 28;
    v0 = (v86 | 1) + (v86 & 1) - 2;
    v1 = v85 + 20;
    g_f12036 = v3 >> ((char)(v0 - v1) + ((char)v1 & v0) + ((char)v1 + v0 ^ (char)-(v1 | v0)) + (((char)v1 + v0 & (char)-(v1 | v0)) + ((char)v1 & ~v0)) * 2 & 63);
    v87 = g_f12030 + g_f044c0;
    v88 = g_f12030 | g_f044c0;
    g_f044c0 = (unsigned short)(v88 - (v87 & -v88) * 2) + ((unsigned short)(v88 - 1) ^ v87) + 1;
    v89 = -g_f12032;
    v90 = g_f12032 & ~g_f044c2;
    g_f044c2 = (unsigned short)(g_f044c2 + g_f12032 + v90 * 4 - v90 * 2) + ((unsigned short)(g_f044c2 - g_f12032 - (v89 | g_f044c2)) + (v89 & ~g_f044c2)) * 2;
    v91 = -g_f12034;
    v92 = g_f044c4 | g_f12034;
    v93 = -g_f044c4;
    g_f044c4 = (v91 ^ g_f044c4) + (v92 & v93) * 4 + ((unsigned short)(g_f044c4 - g_f12034 - (v91 | g_f044c4)) + (v92 ^ v93)) * 2;
    g_f044c6 = g_f044c6 - g_f12036 + ((g_f044c6 * 3 + ~g_f044c6 * 4 + 3 | ~g_f12036) + g_f12036) * 2 + 2;
    v94 = g_f044c8 * 3 + ~g_f044c8 * 4 + 3;
    v95 = g_f044c8 - v3;
    g_f044c8 = v95 + ((v94 + v3 & -(v94 | v3)) * 4 + (v94 + v3 ^ -(v94 | v3)) * 2 | ~v95) + ((v94 + v3 & -(v94 | v3)) * 4 + (v94 + v3 ^ -(v94 | v3)) * 2 | v95) + 1;
    return v1 & v0;
}
