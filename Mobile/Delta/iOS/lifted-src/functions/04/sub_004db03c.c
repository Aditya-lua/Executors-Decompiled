/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4db03c..0x4dba70 (2612 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4db03c_0 {
    char field_0;
} st_4db03c_0;

extern unsigned short g_f04660;
extern unsigned short g_f04662;
extern unsigned short g_f04664;
extern unsigned short g_f04666;
extern unsigned long long g_f04668;
extern unsigned short g_f12100;
extern unsigned short g_f12102;
extern unsigned short g_f12104;
extern unsigned short g_f12106;
extern unsigned int g_fffffffffffffffc;

int sub_4db03c(void)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x8
    unsigned long long v12;  // x12
    unsigned long long v102;  // x8
    unsigned long long v103;  // x10
    unsigned long long v13;  // x15
    unsigned long long v14;  // x10
    unsigned long long v15;  // x11
    unsigned long long v16;  // x10
    unsigned long v17;  // x12
    unsigned short v18;  // x10
    unsigned long long v19;  // x11
    unsigned long v20;  // x14
    unsigned long long v21;  // x16
    st_4db03c_0 *v4;  // x10
    unsigned long long v22;  // x15
    unsigned long long v23;  // x15
    unsigned long long v24;  // x16
    unsigned long long v25;  // x11
    unsigned long long v26;  // x15
    unsigned long long v27;  // x14
    unsigned long long v28;  // x11
    unsigned int v29;  // w11
    unsigned long v30;  // x13
    unsigned long long v31;  // x14
    st_4db03c_0 **v5;  // x11
    unsigned long long v32;  // x15
    unsigned long long v33;  // x15
    unsigned long long v34;  // x12
    unsigned long long v35;  // x12
    unsigned long long v36;  // x13
    unsigned long long v37;  // x12
    unsigned short v38;  // x12
    unsigned int v39;  // w13
    unsigned short v40;  // x13
    unsigned long long v41;  // x14
    unsigned long long v6;  // x12
    unsigned long v42;  // x15
    unsigned long long v43;  // x16
    unsigned long long v44;  // x0
    unsigned long long v45;  // x16
    unsigned long long v46;  // x16
    unsigned long long v47;  // x14
    unsigned long long v48;  // x15
    unsigned long long v49;  // x14
    unsigned long long v50;  // x14
    unsigned long long v51;  // x15
    st_4db03c_0 **v7;  // x15
    unsigned long long v52;  // x17
    unsigned long long v53;  // x16
    unsigned long long v54;  // x15
    unsigned long long v55;  // x14
    char v56;  // x14
    char v57;  // x16
    unsigned int v58;  // w14
    unsigned long long v59;  // x15
    unsigned long v60;  // x16
    unsigned long long v61;  // x0
    unsigned long long v8;  // x10
    unsigned long long v62;  // x4
    unsigned long long v63;  // x17
    unsigned long long v64;  // x1
    unsigned long long v65;  // x15
    unsigned long long v66;  // x15
    unsigned long v67;  // x15
    unsigned long long v68;  // x17
    unsigned long long v69;  // x16
    unsigned long long v70;  // x2
    unsigned int v71;  // w15
    unsigned long long v9;  // x11
    unsigned int v72;  // w16
    unsigned int v73;  // w15
    unsigned int v74;  // w15
    unsigned int v75;  // w16
    unsigned long long v76;  // x15
    unsigned long long v77;  // x16
    unsigned long long v78;  // x0
    unsigned long long v79;  // x1
    unsigned long long v80;  // x17
    unsigned long long v81;  // x15
    unsigned long long v10;  // x10
    unsigned long long v82;  // x16
    unsigned long long v83;  // x0
    unsigned long long v84;  // x17
    unsigned long long v85;  // x1
    unsigned long v86;  // x3
    unsigned long long v87;  // x0
    unsigned long long v88;  // x15
    unsigned int v89;  // w15
    unsigned int v90;  // w10
    unsigned short v91;  // x15
    unsigned long long v11;  // x14
    unsigned int v92;  // w10
    unsigned int v93;  // w13
    unsigned short v94;  // x12
    unsigned short v95;  // x12
    unsigned short v96;  // x13
    unsigned short v97;  // x12
    unsigned short v98;  // x13
    unsigned short v99;  // x10
    unsigned short v100;  // x11
    unsigned long v101;  // x12
    st_4db03c_0 **v0;  // [bp-0x10], Other Possible Types: unsigned long long, char
    st_4db03c_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v1 = &v0;
    v0 = &v1;
    v2 = 0xff51afd7ed558ccd * ((char *)&g_f04660 + ~(~&g_f04660 + &g_f04660));
    v3 = ((v2 | v2 >> 29) ^ ~v2 - (v2 >> 29 | ~v2)) + ((v2 | v2 >> 29) & ~v2 - (v2 >> 29 | ~v2)) * 2;
    v4 = v1;
    v5 = v0;
    v6 = ((v5 | v4) - 1 ^ v5 + v4) - (v5 + v4 & -(v5 | v4)) * 2 + (v5 | v4);
    v7 = (char *)v5 + 1;
    v8 = (v5 ^ -v4) + ((char *)v7 + (-v4 | ~v5)) * 2;
    v9 = ((char *)v7 + 0x2 * ~v5 & v4) * 2;
    v10 = (v9 | ~v8) + v9 + (~v8 | ~v9) + v8 * 2;
    v11 = (char *)&g_fffffffffffffffc - v6 + 2;
    v12 = v6 + 2;
    v13 = -(v12 + (v11 | (char *)&g_fffffffffffffffc - v10 + 2));
    v14 = ((((v10 + 1 & v11) - (v10 + 2) & v12) * 4 + ((v10 + 1 & v11) - (v10 + 2) ^ v12) * 2 | 1) ^ ((v10 + 1 & v6 + 1) - (v10 + 2) ^ v13) + ((v10 + 1 & v6 + 1) - (v10 + 2) & v13) * 2) + ((((v10 + 1 & v11) - (v10 + 2) & v12) * 4 + ((v10 + 1 & v11) - (v10 + 2) ^ v12) * 2 | 1) & ((v10 + 1 & v6 + 1) - (v10 + 2) ^ v13) + ((v10 + 1 & v6 + 1) - (v10 + 2) & v13) * 2) * 2;
    v15 = ~v14 + v14 * 2;
    v16 = ((-v14 | 58381) ^ v14) + ((-v14 | 58381) & v14) * 2;
    v17 = v15 + (v15 & 58381) + 0xffffffffffff1bf3 + ((0xffffffff ^ (unsigned int)v15 * 2) & 116762);
    v0 = v16 + (v17 | ~v16) + (v17 | v16) + 1;
    v1 = v15 + 7154;
    v18 = (unsigned short)v1 + v0 | (unsigned short)v3 + (0xffff ^ (unsigned short)v3 * 2);
    g_f12100 = (v18 ^ (unsigned short)v3 + 1) + (v18 & (unsigned short)v3 + 1) * 2;
    v19 = v1;
    v20 = v0;
    v21 = (v19 ^ -v20) + (v19 + (-v20 | ~v19)) * 2 + 2;
    v22 = (v19 + ((char *)&g_fffffffffffffffc + 3 ^ v19 * 2) & v20) * 2;
    v23 = v21 + (v22 | ~v21) + (v21 | v22);
    v24 = v23 + 1;
    v25 = v20 + v19 + (v19 & ~v20) * 2 + (v20 - (v19 + (v20 | -v19)) + (-v19 & ~v20)) * 2;
    v26 = v23 + 2;
    v27 = (v26 + ~v24 * 2 & v25 - 1) - v25;
    v28 = v24 - v25 + (v27 & v26) * 4 + ((v27 ^ v26) - (v24 & -v25)) * 2;
    v0 = v28 + 7;
    v1 = (v28 ^ 10) + (v28 + (10 | ~v28)) * 2 + 1;
    v29 = v3 >> ((char)v1 + (char)v0 + ((char)v1 + (char)v0 ^ (char)-(v1 | v0)) + ((char)v1 + (char)v0 & (char)-(v1 | v0)) * 2 + ((char)v1 + (char)~v1 * 2 + 1 | (char)~v0) + 1 & 63);
    v30 = v1;
    v31 = v0;
    v32 = v30 * 3 + ~v30 * 4 + 3;
    v33 = (v30 - v31 | ((v32 & v31) - (v32 + v31) & v32 + v31) * 4 + ((v32 & v31) - (v32 + v31) ^ v32 + v31) * 2) + (((v32 & v31) - (v32 + v31) & v32 + v31) * 4 + ((v32 & v31) - (v32 + v31) ^ v32 + v31) * 2 & v30 - v31);
    v34 = (v30 - (v31 + ((char *)&g_fffffffffffffffc + 3 ^ v31 * 2) + v30 ^ -(v31 + ((char *)&g_fffffffffffffffc + 3 ^ v31 * 2) | v30))) * 2 - (v30 + v31 + (v31 + ((char *)&g_fffffffffffffffc + 3 ^ v31 * 2) + v30 & -(v31 + ((char *)&g_fffffffffffffffc + 3 ^ v31 * 2) | v30)) * 4);
    v35 = (v33 ^ v34 | (char *)&g_fffffffffffffffc + 2) + (-((v33 ^ v34) + (v33 & v34) * 2) | 1) + ((v33 ^ v34) + (v33 & v34) * 2) * 2 + 1;
    v36 = v35 * 2;
    v37 = v35 + (~(unsigned int)v36 & 104452) + (v35 + (52226 | ~v35)) * 2 + 0xffffffffffff3400;
    v0 = v35 + (v36 & 0x67fe) + (v36 & 0x67fe ^ 0x67fe) + 0xffffffffffffcc00;
    v1 = ~v37 + v37 * 2;
    v38 = ((unsigned short)~(unsigned int)v1 & (unsigned short)~v0) + ((unsigned short)v1 & v0) + ((unsigned short)v1 | v0) * 2 + 1;
    v39 = (v29 ^ 1) + ~v29 * 2 + (__ROL__(v29, 1) & 2 & 3);
    v40 = (unsigned short)v39 + (v38 | (unsigned short)~v39) + (v38 ^ (unsigned short)v39);
    g_f12102 = (unsigned short)(v40 + 2 - v29) + (((unsigned short)v29 + 1 | (unsigned short)(0xfffffffe - v40)) + v40 + 2 + ((unsigned short)v29 + 1 & (unsigned short)(0xfffffffe - v40))) * 2 + 0xfffe;
    v41 = v1;
    v42 = v0;
    v43 = v41 * 2;
    v44 = v42 + v41;
    v45 = v43 - ((v41 | ~v42) + v44);
    v46 = v44 + ~v42 * 2 + ~((v45 & v44 + ~v43) * 4 + (v45 ^ v44 + ~v43) * 2) + ((v45 & v44 + ~v43) * 4 + (v45 ^ v44 + ~v43) * 2) * 2 + 3;
    v47 = ((v42 | v41) ^ -(v42 & v41)) + ((v42 ^ v41) - (v42 | v41 | -(v42 & v41))) * 2;
    v48 = (v46 ^ v47) + (v46 & v47 | -v47 & ~v46) * 2;
    v49 = ((v46 | v47 - 1) - v47) * 2;
    v50 = v49 - (((char *)&g_fffffffffffffffc - v49 + 1 & v48) + (v49 + 2 & v48)) + v48 * 2;
    v51 = v50 + 4;
    v52 = v50 + 2;
    v53 = (char *)&g_fffffffffffffffc - v50 + 1;
    v54 = (v52 * 2 - v51 + 3 ^ (v53 | 11)) + (v52 * 2 - v51 + 3 & (v53 | 11)) * 2;
    v55 = (v50 + 23 ^ -(v52 | 21)) + (v50 + 23 & -(v52 | 21)) * 2;
    v0 = v54 + (v52 | 11 | ~v54) + (v54 | v52 | 11) + 1;
    v1 = (v55 & 0xffffffffffffffeb - (v51 + (v53 | 0xffffffffffffffea))) + v51 + (v53 | 0xffffffffffffffea) + 20 + (v55 & v51 + (v53 | 0xffffffffffffffea) + 20);
    v56 = v0 + 1;
    v57 = v56 + ~v0 * 2;
    v58 = v3 >> ((char)((v56 + (v57 & (char)v1) ^ (v57 | (char)v1) + v56) + (v56 + (v57 & (char)v1) & (v57 | (char)v1) + v56) * 2 - 1) & 63);
    v59 = v1;
    v60 = v0;
    v61 = ~v59 * 2;
    v62 = v60 + v59;
    v63 = v62 + (-v60 & ~v59) * 2 + (v59 - (v60 + (v59 | -v60))) * 2;
    v64 = (v59 + v61 + 1 + v60 & -(v59 + v61 + 1 | v60)) * 4 + (v59 + v61 + 1 + v60 ^ -(v59 + v61 + 1 | v60)) * 2;
    v65 = (v60 + ~v60 * 2 + 2 & (v59 | ~(v60 + ~v60 * 2 + 1))) * 4 + (v60 + ~v60 * 2 + 2 ^ (v59 | ~(v60 + ~v60 * 2 + 1))) * 2;
    v66 = v64 - (v61 + v62) + v65 + (v64 | ~v63) + (~v64 | ~v63) + (v63 - v65) * 2 - 1;
    v67 = (v66 * 2 & 4) + (v66 ^ 2);
    v68 = v67 * 2;
    v69 = v68 + ~v67;
    v70 = v69 * 2;
    v0 = (v67 - v68 | 0xffffffffffff3004) + (v67 - v68 | 0xcffb) + v70 + 0xcffd;
    v1 = (v69 + 0xffffffffffffcffb + ((-v67 | 12293) + v67) * 2 + (~(unsigned int)v70 & 24586) | 1) + (v69 + 0xffffffffffffcffb | (char *)&g_fffffffffffffffc + 2);
    v71 = v0;
    v72 = v1;
    v73 = v71 + (v72 | ~v71) + (v72 ^ v71) + 1;
    v74 = (v71 | ~v72) + v72 + ((unsigned int)(0xfffffffe - ((v71 | ~v72) + v72)) | v73) + ((v71 | ~v72) + v72 + 1 | v73);
    v75 = (v74 + 3 ^ v58) + (v74 + 3 & v58) * 2;
    g_f12104 = ((unsigned short)v74 + 2 | (unsigned short)v58) + (unsigned short)~v75 + (unsigned short)v75 * 2 + (unsigned short)((-v75 & -(v74 + 2 | v58)) + (unsigned short)~v75 + (unsigned short)v75 * 2 - ((v74 + 2 | v58) + ((unsigned short)~v75 + (unsigned short)v75 * 2 | -(v74 + 2 | v58)))) * 2;
    v76 = v1;
    v77 = v0;
    v78 = v76 + 1;
    v79 = v77 + 1;
    v80 = v79 + v76 + (v78 + ~v76 * 2 | ~v77);
    v81 = v78 + v80 - (v77 + ((v79 + ~v77 * 2 | v76) ^ ~v77 * 2 + v77)) + ((-(v77 & v76) & ~v80) - (v76 & ~v77)) * 2 + (v80 + ((v79 + ~v77 * 2 | v76) & v79) + (-(v77 & v76) | ~v80)) * 2;
    v82 = v81 + 2;
    v83 = ~v81;
    v84 = (0xfffffffffffffffb - (v82 + (v83 | 0xfffffffffffffff9)) ^ v81 + 6) + (0xfffffffffffffffb - (v82 + (v83 | 0xfffffffffffffff9)) & v81 + 6) * 2;
    v85 = v81 + 1;
    v86 = ~((unsigned int)v82 * 2 - 4);
    v87 = v82 + v85 + (v83 | 6) + (v86 & 12) - 8;
    v88 = v82 + (v86 & 86) + ((43 | ~v81) + v85) * 2 - 45;
    v0 = v87 + v84 + (v84 & ~v87) + (v87 | ~v84) + 1;
    v1 = ~v88 + v88 * 2;
    g_f12106 = v3 >> ((char)(v0 - v1) + (char)v1 * 2 & 63);
    v89 = g_f04660;
    v90 = (g_f04660 | ~g_f12100) + g_f12100;
    g_f04660 = (unsigned short)v90 + (unsigned short)(v89 - g_f12100) + (g_f12100 & (unsigned short)v89) + (g_f12100 & ~g_f04660) * 2 + (unsigned short)~v90 * 2 + 1;
    v91 = g_f04662 + (g_f12102 | ~g_f04662) + (g_f12102 ^ g_f04662);
    v92 = g_f12102 & g_f04662;
    g_f04662 = v91 + 2 + v92 + (((unsigned int)(0xfffffffe - v91) | -v92) + v91 + 2 + ((unsigned int)(0xfffffffe - v91) & -v92)) * 2 - 1;
    v93 = g_f12104 | g_f04664;
    v94 = (unsigned short)~v93 + g_f12104;
    g_f04664 = (unsigned short)((v94 ^ (unsigned int)(0xfffe - g_f04664)) + v93 - (v94 & g_f04664 + 1) * 2) + 1;
    v95 = (g_f04666 ^ 1) + ~g_f04666 * 2 + ((unsigned short)(__ROL__(g_f04666, 1)) & 2 & 3);
    v96 = v95 + 1;
    v97 = g_f12106 - v96 + (v95 | ~g_f12106) + 1;
    v98 = -g_f12106;
    v99 = g_f12106 + g_f04666 + (v98 & ~g_f04666) * 2 + (g_f04666 + (v98 | ~g_f04666)) * 2 + 2;
    v100 = (v97 & v96) * 4 + (v97 ^ v96) * 2 | 1;
    g_f04666 = (v100 ^ v99) + (v100 & v99) * 2 - 1;
    v101 = g_f04668 + 1;
    v102 = (g_f04668 ^ -v3) + (v101 + (-v3 | ~g_f04668)) * 2;
    v103 = (v101 + ~g_f04668 * 2 & v3) * 2;
    g_f04668 = v102 + v103 + (v103 | ~v102) + (v102 & ~v103) + 1;
    return v89 - g_f12100 + (g_f12100 & v89);
}
