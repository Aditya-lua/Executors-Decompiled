/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x93c8f8..0x93d360 (2664 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_93c8f8_0 {
    char field_0;
} st_93c8f8_0;

extern unsigned short g_f04bc0;
extern unsigned short g_f04bc2;
extern unsigned short g_f04bc4;
extern unsigned short g_f04bc6;
extern unsigned long long g_f04bc8;
extern unsigned short g_f12744;
extern unsigned short g_f12746;
extern unsigned short g_f12748;
extern unsigned short g_f1274a;
extern unsigned long g_fffffffffffffff0;
extern unsigned int g_fffffffffffffff8;

unsigned int sub_93c8f8(void)
{
    unsigned long long v3;  // x8
    st_93c8f8_0 *v4;  // x11
    unsigned long v13;  // x14
    unsigned int v103;  // w17
    unsigned int v104;  // w0
    unsigned long long v105;  // x14
    unsigned long long v106;  // x10
    unsigned long long v14;  // x11
    unsigned int v15;  // w11
    unsigned long long v16;  // x10
    unsigned int v17;  // w12
    unsigned int v18;  // w12
    unsigned long long v19;  // x11
    unsigned long long v20;  // x13
    unsigned long long v21;  // x14
    unsigned long long v22;  // x17
    st_93c8f8_0 **v5;  // x13
    unsigned long long v23;  // x16
    unsigned long long v24;  // x0
    unsigned long long v25;  // x13
    unsigned long long v26;  // x13
    unsigned long long v27;  // x17
    unsigned long long v28;  // x16
    unsigned int v30;  // w13
    unsigned long v31;  // x17
    unsigned long v32;  // x0
    st_93c8f8_0 **v6;  // x14
    unsigned long long v33;  // x1
    unsigned long long v34;  // x2
    unsigned long long v35;  // x6
    unsigned long long v36;  // x17
    unsigned long long v37;  // x14
    unsigned long long v38;  // x14
    unsigned long long v39;  // x17
    unsigned int v40;  // w14
    unsigned int v41;  // w17
    unsigned int v42;  // w0
    unsigned long long v7;  // x15
    unsigned short v43;  // x14
    unsigned short v44;  // x14
    unsigned int v45;  // w17
    unsigned long v46;  // x13
    unsigned long long v47;  // x17
    unsigned long long v48;  // x2
    unsigned long long v49;  // x3
    unsigned long long v50;  // x13
    unsigned long long v51;  // x17
    unsigned long long v52;  // x2
    unsigned long long v8;  // x16
    char v53;  // x0
    unsigned int v54;  // w15
    unsigned long long v55;  // x16
    unsigned long v56;  // x17
    unsigned long long v57;  // x0
    unsigned long long v58;  // x1
    unsigned long long v59;  // x3
    unsigned long long v60;  // x2
    unsigned long long v61;  // x16
    unsigned long long v62;  // x16
    unsigned long long v9;  // x0
    unsigned long long v63;  // x17
    unsigned long long v64;  // x16
    unsigned long long v65;  // x2
    unsigned long long v66;  // x16
    unsigned long long v67;  // x17
    unsigned long long v68;  // x16
    unsigned short v69;  // x16
    unsigned int v70;  // w1
    unsigned int v71;  // w2
    unsigned int v72;  // w17
    unsigned long long v10;  // x15
    unsigned long long v73;  // x16
    unsigned long v74;  // x17
    unsigned long long v75;  // x0
    unsigned long long v76;  // x1
    unsigned long long v77;  // x0
    unsigned long long v78;  // x1
    unsigned long long v79;  // x2
    unsigned long long v80;  // x16
    unsigned long long v81;  // x16
    unsigned long long v82;  // x17
    unsigned long long v11;  // x16
    unsigned long long v83;  // x16
    unsigned long long v84;  // x16
    unsigned long long v85;  // x17
    unsigned long long v86;  // x17
    unsigned long long v87;  // x16
    unsigned long long v88;  // x16
    unsigned long v89;  // x17
    char v90;  // x0
    char v91;  // x16
    unsigned int v92;  // w0
    unsigned long long v12;  // x11
    unsigned int v93;  // w12
    unsigned int v94;  // w12
    unsigned int v95;  // w0
    unsigned int v96;  // w12
    unsigned int v97;  // w14
    unsigned int v98;  // w12
    unsigned int v99;  // w15
    unsigned short v100;  // x17
    unsigned short v101;  // x15
    unsigned short v102;  // x14
    st_93c8f8_0 **v1;  // [bp-0x10], Other Possible Types: char, unsigned long long
    st_93c8f8_0 *v2;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v2 = &v1;
    v1 = &v2;
    v3 = 13387331783114322511 + ((5059412298907101376 + ~5059412298907101376 * 2 + 1 & 9423889776) + 5059412290039220352) * 2;
    v4 = v2;
    v5 = v1;
    v6 = -v5;
    v7 = (char *)v4 + 0x2 * ~v4;
    v8 = (char *)v5 + ~(v7 + 1 | v5);
    v9 = v5 + v4;
    v10 = (((v8 & v7 + 2) * 4 + (v8 ^ v7 + 2) * 2 | 1) ^ v9 + (v4 - ((char *)v5 + (v4 | v6)) + (v6 & ~v4)) * 2) + (((v8 & v7 + 2) * 4 + (v8 ^ v7 + 2) * 2 | 1) & v9 + (v4 - ((char *)v5 + (v4 | v6)) + (v6 & ~v4)) * 2) * 2;
    v11 = ~v10 + v10 * 2;
    v12 = v9 + (v5 - &v4[v5 | -v4]) * 2 + ((v5 | v4) & v6) * 4 + (((v5 | v4) ^ v6) + (-v4 & ~v5)) * 2;
    v13 = v11 ^ v12;
    v14 = v13 + ((v10 - 1 & -v12) - (v11 - v12) & v11 - v12) * 4 + ((v11 & v12 - 1) - (v11 + v12) + (v11 & v12) + ((v10 - 1 & -v12) - (v11 - v12) ^ v11 - v12)) * 2;
    v1 = (v13 & 1) + 37729 + (v14 | 1);
    v2 = (v14 ^ 27806) + (v14 + (27806 | ~v14)) * 2 + 1;
    v15 = ((unsigned int)v1 & (unsigned int)v2) + ((unsigned int)v2 | (unsigned int)v1 | ~((unsigned int)v1 & (unsigned int)v2)) + ((unsigned int)v1 & (unsigned int)v2 | (unsigned int)v2 | (unsigned int)v1) + 1;
    v16 = ~v3 * 2;
    v17 = ((unsigned int)v3 ^ 1) + (__ROL__(3738399311, 1) & 2 & 3) + (unsigned int)v16;
    v18 = v17 + (v15 | ~v17) + (v15 ^ v17) + 1;
    v19 = v3 + 1;
    g_f12744 = (unsigned int)(v18 - v3) + ((unsigned int)v19 & ~v18 | v18 & (unsigned int)v19) * 2 - 1;
    v20 = v2;
    v21 = v1;
    v22 = v20 + 1;
    v23 = v22 + ~v20 * 2;
    v24 = (v23 + v20 + (v21 | ~v23) + 1 ^ -(v21 & v20)) + (v23 + v20 + (v21 | ~v23) + (0x7ffffffffffffffe - (v23 + v20 + (v21 | ~v23)) | -(v21 & v20))) * 2 + 4;
    v25 = (-((v21 + v20 ^ -(v21 | v20)) + (v21 + v20 & -(v21 | v20)) * 2) ^ v22 + v21 + (v23 | ~v21)) + (-((v21 + v20 ^ -(v21 | v20)) + (v21 + v20 & -(v21 | v20)) * 2) & v22 + v21 + (v23 | ~v21)) * 2;
    v26 = v24 + (v24 & v25) + v25 + (0xffffffffffffffff ^ v25 * 2) + (v25 + (0xffffffffffffffff ^ v25 * 2) | ~v24);
    v27 = v26 + 1;
    v28 = v26 + 2;
    v1 = v27 + (0xfffffffffffffffd & ~v28) + ((char *)&g_fffffffffffffff8 - v27 - (0xfffffffffffffffd & ~v28) + 3 | v28 | 2) + (v27 + (0xfffffffffffffffd & ~v28) + 4 | v28 | 2) + 5;
    v2 = (v28 ^ 15) + (v27 + (0x7ffffffffffffffd - v26 | 15)) * 2 + 3;
    v30 = v3 >> ((char)v1 + (char)v2 + (0xff ^ (char)v2 * 2) + ((char)v1 + ((char)-(v2 + (0xffffffffffffffff ^ v2 * 2)) | (char)~v1) + ((char)-(v2 + (0xffffffffffffffff ^ v2 * 2)) & (char)~v1)) * 2 + 1 & 63);
    v31 = v2;
    v32 = -v31;
    v33 = v1;
    v34 = v33 | v31;
    v35 = v33 + 1;
    v36 = (v31 + ~v33 * 2 + v35 + 1 | (v34 & v32) * 4 + (v34 ^ v32) * 2) + ((v34 & v32) * 4 + (v34 ^ v32) * 2 & v31 + ~v33 * 2 + v35 + 1);
    v37 = (0xffffffffffffffff ^ (v35 + (v32 | ~v33)) * 2) - (v33 ^ v32) + (v33 - v34) * 2;
    v38 = v36 + (v37 | ~v36) + (v36 | v37) + 2;
    v39 = ((v38 | 10504) + 1 ^ v38 & 10504) + ((v38 | 10504) + 1 & v38 & 10504) * 2;
    v1 = ~v39 + v39 * 2;
    v2 = (v38 ^ 55032) + (110064 & v38 * 2) - 1;
    v40 = v1;
    v41 = v2;
    v42 = v41 + v40;
    v43 = (unsigned short)v42 + ((unsigned short)v40 + (unsigned short)~v40 * 2 + 1 | (unsigned short)~v41) + 1;
    v44 = ((unsigned short)v42 ^ (unsigned short)-(v40 | v41)) + ((unsigned short)v42 & (unsigned short)-(v40 | v41)) * 2 + (v43 | (unsigned short)~((v42 ^ -(v40 | v41)) + (v42 & -(v40 | v41)) * 2)) + (((unsigned short)v42 ^ (unsigned short)-(v40 | v41)) + ((unsigned short)v42 & (unsigned short)-(v40 | v41)) * 2 | v43) + 1;
    v45 = (v30 ^ 1) + ~v30 * 2 + (__ROL__(v30, 1) & 2 & 3);
    g_f12746 = (unsigned short)(v45 + v30 - v44) + (v44 & (unsigned short)v45) + (v44 & (unsigned short)~v45) * 2 + 1;
    v46 = v2;
    v47 = v1;
    v48 = (v46 ^ -v47) + ((v46 | v47) + (-v47 | ~v46)) * 2 + 2;
    v49 = v47 - (v46 + (v47 | ~v46));
    v50 = (((v49 & v46 + ~v47) * 4 + (v49 ^ v46 + ~v47) * 2 | 1) ^ v46 + ~v46 * 2 + v47 + 2) + (((v49 & v46 + ~v47) * 4 + (v49 ^ v46 + ~v47) * 2 | 1) & v46 + ~v46 * 2 + v47 + 2) * 2;
    v51 = ((1 - v50 & v48) - (v48 - (v50 - 1)) & v48 - (v50 - 1)) * 4 + ((1 - v50 & v48) - (v48 - (v50 - 1)) ^ v48 - (v50 - 1)) * 2 + (v50 - 1 + ~v48 + (1 - v50 | v48) * 2) * 2 + (((1 - v50 & v48) - (v48 - (v50 - 1)) & v48 - (v50 - 1)) * 4 + ((1 - v50 & v48) - (v48 - (v50 - 1)) ^ v48 - (v50 - 1)) * 2 | 0xfffffffffffffffe - (v50 - 1 + ~v48 + (1 - v50 | v48) * 2)) - (((1 - v50 & v48) - (v48 - (v50 - 1)) & v48 - (v50 - 1)) * 4 + ((1 - v50 & v48) - (v48 - (v50 - 1)) ^ v48 - (v50 - 1)) * 2 & v50 - 1 + ~v48 + (1 - v50 | v48) * 2 + 1);
    v52 = v51 + 3;
    v1 = v51 + 4 + (v52 & 29) + (-((unsigned int)v51 + 4) | 0xffffffffffffffe2) + 29;
    v2 = (v51 + 6 ^ -(v52 | 3)) + (v52 | 3) + (v51 + 6 & -(v52 | 3)) * 2;
    v53 = (char)v2 * 3 + (char)~v2 * 4;
    v54 = v3 >> (((char)(0xfffffffffffffffd - v53) ^ v1) + (v1 + ((char)(0x7ffffffffffffffd - v53) | ~v1)) * 2 + 1 & 63);
    v55 = v2;
    v56 = v1;
    v57 = (v55 ^ -v56) + (v55 + (v56 & ~v55) + (-v56 | ~v55)) * 2;
    v58 = v57 + 2;
    v59 = v56 | v55;
    v60 = (~v56 & ~v55) + v59 * 2 + 1;
    v61 = (v56 + v55 ^ -v59) + (v56 + v55 & -v59) * 2;
    v62 = v60 + v61 + (-v61 & ~v60) * 2 + (v60 - (v61 + (v60 | -v61))) * 2;
    v63 = v62 + 1;
    v64 = v62 + 0x7fffffffffffffff;
    v65 = v58 + v63 - 1 + ((v64 & v58) - (v58 + v63 - 1)) * 2;
    v66 = (v57 + 3 - v63 + (v64 & v57 + 3 + ~v58 * 2)) * 2 + 3;
    v67 = (v66 ^ v65) - 1;
    v68 = v67 + (v66 & v65) * 2;
    v1 = (v68 ^ 21866) + (43732 & v68 * 2) - 1;
    v2 = (v67 & 1) + 43669 + (v68 | 1);
    v69 = (v1 + (unsigned short)~v1 * 2 ^ (unsigned short)~(v1 + ~v1 * 2 + 1 | (unsigned int)v2)) + ((unsigned short)v2 | v1) + ((v1 + (unsigned short)~v1 * 2 + 1 | (unsigned short)v2) & (unsigned short)~(v1 + ~v1 * 2)) * 2;
    v70 = v54 * 2;
    v71 = v70 & 2;
    v72 = (v54 ^ 1) + ~v54 * 2 + v71;
    g_f12748 = (unsigned short)((v54 ^ 0xfffe) + v54 * 4 - (v70 + v69 + v71)) + (v69 | (unsigned short)~v72) + (v69 | (unsigned short)v72) * 2 + 4;
    v73 = v2;
    v74 = v1;
    v75 = v73 * 3 + ~v73 * 4;
    v76 = v74 - v75 + (v75 + 3 | ~v74) - 3;
    v77 = (((v76 & v75 + 4) * 4 + (v76 ^ v75 + 4) * 2 | 1) ^ v73 - v74) + (((v76 & v75 + 4) * 4 + (v76 ^ v75 + 4) * 2 | 1) & v73 - v74) * 2;
    v78 = ~v77 + v77 * 2;
    v79 = (v73 + v74 * 3 + ~v74 * 4 + (0x7ffffffffffffffc - (v74 * 3 + ~v74 * 4) & ~v73)) * 2;
    v80 = (v74 ^ -v73) + (v74 + (-v73 | ~v74)) * 2 + 2;
    v81 = ((char *)&g_fffffffffffffff0 - v79 + 7 & v80) + v79 + 8 + (v79 + 8 & v80);
    v82 = v81 - v77 + (v78 | -v81) * 2;
    v83 = (v78 | v81 - 1) - (v81 + v77) + 1;
    v84 = v82 + ((v83 & v77) * 4 + (v83 ^ v77) * 2 | 0xfffffffffffffffe - v82) + ((v83 & v77) * 4 + (v83 ^ v77) * 2 | v82 + 1);
    v85 = v84 + 2;
    v86 = v85 | 46;
    v87 = (v84 + 48 ^ -v86) + (v84 + 48 & -v86) * 2;
    v1 = v85 + (v85 + (~v85 | 3)) * 2 + ((0xffffffff ^ (unsigned int)v85 * 2) & 6) - 2;
    v2 = v87 + (v86 | ~v87) + (v87 | v86) + 1;
    v88 = v1;
    v89 = v2;
    v90 = ((char)v88 | (char)~v89) + (char)v89;
    v91 = (char)v88 + ((char)v89 | (char)~v88) + ((char)v89 ^ (char)v88);
    g_f1274a = v3 >> ((char)(v91 + v90 + v91 + 1 + (v90 + 1 & 0xfffffffffffffffe - v91) - (v91 + 1 | (v88 | ~v89) + v89 + 1)) + 2 & 63);
    v92 = (g_f12744 + ~g_f12744 * 2 + 1 & g_f04bc0) + g_f12744;
    v93 = g_f12744 | ~g_f04bc0;
    v94 = (v93 ^ g_f04bc0 + 1) + (v93 & g_f04bc0 + 1) * 2;
    g_f04bc0 = (unsigned short)v94 + (unsigned short)v92 + ((unsigned short)v92 + ((unsigned short)-v94 | (unsigned short)~v92) + ((unsigned short)-v94 & (unsigned short)~v92)) * 2 + 2;
    v95 = (unsigned int)(g_f04bc2 - g_f12746) + (g_f12746 & g_f04bc2) + (g_f12746 & ~g_f04bc2) * 2;
    v96 = g_f04bc2 + ~g_f04bc2 * 2;
    v97 = v96 + 1 | g_f12746;
    v98 = (v96 ^ ~v97) + (v97 & ~v96) * 2;
    g_f04bc2 = (unsigned short)v98 + (unsigned short)v95 + ((unsigned short)v95 + ((unsigned short)-v98 | (unsigned short)~v95) + ((unsigned short)-v98 & (unsigned short)~v95)) * 2 + 2;
    v99 = (g_f04bc4 ^ 1) + ~g_f04bc4 * 2 + (__ROL__(g_f04bc4, 1) & 2 & 3);
    v100 = (unsigned short)v99 + g_f12748;
    v101 = -(v99 | g_f12748);
    v102 = -g_f12748;
    g_f04bc4 = (v102 ^ g_f04bc4) + (v100 & v101) * 4 + (g_f04bc4 + (v102 | ~g_f04bc4) + (v100 ^ v101)) * 2 + 2;
    v103 = g_f1274a | g_f04bc6;
    v104 = ~v103 + g_f1274a;
    g_f04bc6 = (unsigned short)((~g_f1274a & ~g_f04bc6) + ((unsigned short)v104 ^ g_f04bc6 + ~g_f04bc6 * 2) + v103 * 2 - (v104 & g_f04bc6 + 1) * 2) + 2;
    v105 = (g_f04bc8 ^ 1) + ~g_f04bc8 * 2 + ((g_f04bc8 * 2 | g_f04bc8 >> 63) & 2 & 3);
    v106 = v19 + g_f04bc8 + v16;
    g_f04bc8 = (v105 + v3 & -(v105 | v3)) * 4 + (v105 + v3 ^ -(v105 | v3)) * 2 + v106 * 2 + ((v105 + v3 & -(v105 | v3)) * 4 + (v105 + v3 ^ -(v105 | v3)) * 2 | 0xfffffffffffffffe - v106) + (0xfffffffffffffffe - v106 | ~((v105 + v3 & -(v105 | v3)) * 4 + (v105 + v3 ^ -(v105 | v3)) * 2)) + 4;
    return v104;
}
