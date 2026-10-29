/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x41d71c..0x41e178 (2652 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_41d71c_0 {
    char field_0;
} st_41d71c_0;

extern unsigned short g_f044f0;
extern unsigned short g_f044f2;
extern unsigned short g_f044f4;
extern unsigned short g_f044f6;
extern unsigned long long g_f044f8;
extern unsigned short g_f12048;
extern unsigned short g_f1204a;
extern unsigned short g_f1204c;
extern unsigned short g_f1204e;

int sub_41d71c(void)
{
    unsigned long long v4;  // x8
    unsigned long long v5;  // x8
    unsigned long long v14;  // x12
    unsigned int v104;  // w11
    unsigned int v105;  // w8
    unsigned int v106;  // w9
    unsigned int v107;  // w10
    unsigned int v108;  // w8
    unsigned int v109;  // w8
    unsigned int v15;  // w10
    unsigned int v16;  // w10
    unsigned long long v17;  // x11
    unsigned long v18;  // x12
    unsigned long long v19;  // x14
    unsigned long long v20;  // x15
    unsigned long long v21;  // x13
    unsigned long long v22;  // x13
    unsigned long long v23;  // x14
    st_41d71c_0 *v6;  // x10
    unsigned long long v24;  // x11
    unsigned long long v25;  // x15
    unsigned long long v26;  // x11
    unsigned long long v27;  // x13
    unsigned long long v28;  // x14
    unsigned long long v29;  // x13
    unsigned long long v30;  // x13
    unsigned int v31;  // w13
    unsigned long long v32;  // x14
    unsigned long long v33;  // x15
    st_41d71c_0 **v7;  // x11
    unsigned long v34;  // x16
    unsigned long long v35;  // x1
    unsigned long long v36;  // x17
    unsigned long long v37;  // x17
    unsigned long long v38;  // x14
    unsigned long long v39;  // x14
    unsigned long long v40;  // x14
    unsigned long long v41;  // x15
    unsigned long long v42;  // x15
    unsigned long long v43;  // x14
    unsigned long long v8;  // x15
    unsigned int v44;  // w14
    unsigned long long v45;  // x14
    unsigned long long v46;  // x15
    unsigned long long v47;  // x17
    unsigned long long v48;  // x1
    unsigned long long v49;  // x16
    unsigned long long v50;  // x14
    unsigned long long v51;  // x15
    unsigned long long v52;  // x14
    unsigned long long v53;  // x14
    unsigned long long v9;  // x10
    unsigned long long v54;  // x14
    unsigned long long v55;  // x15
    unsigned long long v56;  // x17
    unsigned long long v57;  // x15
    unsigned long v58;  // x16
    unsigned long long v59;  // x17
    unsigned long long v60;  // x0
    unsigned long long v61;  // x2
    unsigned long long v62;  // x3
    unsigned long long v63;  // x3
    unsigned long v10;  // x11
    unsigned long long v64;  // x17
    unsigned long long v65;  // x15
    unsigned long long v66;  // x0
    unsigned long long v67;  // x15
    unsigned long long v68;  // x15
    unsigned long long v69;  // x16
    unsigned long long v70;  // x0
    unsigned long v71;  // x17
    unsigned long long v72;  // x17
    unsigned int v73;  // w16
    unsigned long v11;  // x16
    unsigned int v74;  // w0
    unsigned long v75;  // x15
    unsigned long long v76;  // x16
    unsigned long long v77;  // x0
    unsigned long long v78;  // x1
    unsigned long long v79;  // x0
    unsigned long long v80;  // x17
    unsigned long v81;  // x0
    unsigned long long v82;  // x15
    unsigned long long v83;  // x12
    unsigned long long v12;  // x10
    unsigned long long v84;  // x16
    unsigned long long v85;  // x0
    unsigned long long v86;  // x16
    unsigned long long v87;  // x12
    unsigned short v88;  // x15
    unsigned short v89;  // x16
    unsigned short v90;  // x0
    unsigned short v91;  // x13
    unsigned short v92;  // x11
    unsigned int v93;  // w14
    unsigned long long v13;  // x11
    unsigned int v94;  // w15
    unsigned int v95;  // w11
    unsigned int v96;  // w13
    unsigned int v97;  // w14
    unsigned int v98;  // w15
    unsigned int v99;  // w11
    unsigned long long v100;  // x12
    unsigned long long v101;  // x8
    unsigned int v102;  // w8
    unsigned int v103;  // w9
    st_41d71c_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned long long
    char v1;  // [bp-0x10]
    st_41d71c_0 *v2;  // [bp-0x8], Other Possible Types: unsigned long long
    unsigned long v3;  // [bp-0x8]

    v2 = &v0;
    v0 = &v2;
    v4 = 0xff51afd7ed558ccd * ((char *)&g_f044f0 + ~(~&g_f044f0 + &g_f044f0));
    v5 = ((v4 | v4 >> 29) ^ ~v4 - (v4 >> 29 | ~v4)) + ((v4 | v4 >> 29) & ~v4 - (v4 >> 29 | ~v4)) * 2;
    v6 = v2;
    v7 = v0;
    v8 = (char *)v7 + ((char *)v7 + 0x2 * ~v7 + 1 & v6);
    v9 = -(v7 & v6);
    v10 = v8 ^ v9;
    v11 = (v8 + (v9 | ~v8)) * 2 + 2;
    v12 = (v7 | v6) - (v7 + v6 & -(v7 | v6)) * 2 + ((v7 | v6) - 1 ^ v7 + v6) + ((v8 ^ ~v9) - v11) * 2 + (v10 + v11 ^ 1) + 1;
    v13 = v12 + ((v10 * 2 | v10 >> 63) & 2 & 3);
    v14 = v13 + 1;
    v0 = (v14 & 15085 | 0xffffffffffffc512 & ~v14) + (v13 - (v14 & 15085)) * 2 + 30173;
    v2 = (v12 | 0xfffffffffffffffe) + (v13 + (100902 & v14 * 2) + (100902 & v14 * 2 ^ 100902) + 0xffffffffffff3aee & 0xfffffffffffffffe) + 1;
    v15 = ((unsigned int)v2 * 4 + (unsigned int)(v2 - (unsigned int)v2 * 4) + v0 + 4 | 1) + ((unsigned int)(v2 - (unsigned int)v2 * 4) + v0 & 1);
    v16 = (unsigned int)v5 & (unsigned int)(4 - v15);
    g_f12048 = (unsigned short)~(v15 - 4) + (unsigned short)(v15 - 4) * 2 + (unsigned short)v16 + (unsigned short)~(v15 - 4) + (unsigned short)(v15 - 4) * 2 + (unsigned short)v5 + ((unsigned short)-(~(v15 - 4) + (v15 - 4) * 2 + v16) & (unsigned short)~(~(v15 - 4) + (v15 - 4) * 2 + (unsigned int)v5)) * 2 + (unsigned short)(v5 - v16 - (~(v15 - 4) + (v15 - 4) * 2 + (unsigned int)v5 | -(~(v15 - 4) + (v15 - 4) * 2 + v16))) * 2;
    v17 = v2;
    v18 = v0;
    v19 = v18 | ~v17;
    v20 = v17 + 1;
    v21 = v20 + v17 - v18 + v19 + (v18 & ~v17) * 2;
    v22 = (-((v19 ^ v20) + (v19 & v20) * 2) ^ v21) + (-((v19 ^ v20) + (v19 & v20) * 2) & v21) * 2;
    v23 = v22 + 1;
    v24 = v18 - v17 + (((v18 ^ 1) + ~v18 * 2 + ((v18 * 2 | v18 >> 63) & 2 & 3) | ~v17) + v17) * 2;
    v25 = v24 + 2;
    v26 = (v24 + 1 | v22) - (v25 + v23) + 1;
    v27 = ((v25 + ~v25 * 2 + 2 + v23 + (0xfffffffffffffffd - (v25 + ~v25 * 2) | ~v22) ^ -v23 - (v25 + ~v25 * 2 + 2 | ~v22)) + (v25 + ~v25 * 2 + 2 + v23 + (0xfffffffffffffffd - (v25 + ~v25 * 2) | ~v22) & -v23 - (v25 + ~v25 * 2 + 2 | ~v22)) * 2 ^ ((v26 & v23) * 4 + (v26 ^ v23) * 2 | 1)) + ((v25 + ~v25 * 2 + 2 + v23 + (0xfffffffffffffffd - (v25 + ~v25 * 2) | ~v22) ^ -v23 - (v25 + ~v25 * 2 + 2 | ~v22)) + (v25 + ~v25 * 2 + 2 + v23 + (0xfffffffffffffffd - (v25 + ~v25 * 2) | ~v22) & -v23 - (v25 + ~v25 * 2 + 2 | ~v22)) * 2 & ((v26 & v23) * 4 + (v26 ^ v23) * 2 | 1)) * 2;
    v28 = ~v27 + v27 * 2;
    v29 = (v28 | 1) + (1 & ~v27) + 4;
    v0 = (v29 | 1) + (v29 & 1) - 2;
    v2 = v28 + 12;
    v30 = (v0 + 1 + v2 + (v0 + 1 + ~v0 * 2 & ~v2) ^ (v2 | v0) + 1) + (v0 + 1 + v2 + (v0 + 1 + ~v0 * 2 & ~v2) & (v2 | v0) + 1) * 2;
    v31 = v5 >> ((char)~v30 + (char)v30 * 2 & 63);
    v32 = v2;
    v33 = -v32;
    v34 = v0;
    v35 = v34 + v32 + (-v34 & ~v32) * 2 + (v32 + (-v34 | ~v32)) * 2 + 2;
    v36 = ((v34 | v32) & v33) * 4 + ((v34 | v32) ^ v33) * 2 | 1;
    v37 = (v35 ^ v36) + (v35 & v36) * 2 - 1;
    v38 = (v34 ^ v33) + (v34 - v32 - (v34 | v33)) * 2;
    v39 = v38 + ((v32 + ~v34 & -(v32 | ~v34)) * 4 + (v32 + ~v34 ^ -(v32 | ~v34)) * 2 | ~v38) + (v38 | (v32 + ~v34 & -(v32 | ~v34)) * 4 + (v32 + ~v34 ^ -(v32 | ~v34)) * 2) + 1;
    v40 = v39 + (0xffffffffffffffff ^ v39 * 2) + (v37 & v39) + (v39 + (0xffffffffffffffff ^ v39 * 2) & v37);
    v41 = v40 + 1;
    v42 = v41 | 20789;
    v43 = (v40 + 20790 ^ -v42) + (v40 + 20790 & -v42) * 2;
    v0 = (v40 | 0xfffffffffffffffe) + (v40 + (89494 & v41 * 2) + (89494 & v41 * 2 ^ 89494) + 0xffffffffffff5136 | 1);
    v2 = (v43 | v42) + (v43 & v42);
    v44 = (unsigned int)((unsigned int)v2 * 2 - ((unsigned int)v2 ^ 1) - ((unsigned int)v2 * 2 & 2)) + (unsigned int)v0 + 1;
    g_f1204a = ((unsigned short)v44 & (unsigned short)~v31) + (unsigned short)~v44 + ((unsigned short)v31 & (unsigned short)v44) * 2 + 1;
    v45 = v2;
    v46 = v0;
    v47 = (v45 + 1 ^ (v46 | ~v45)) + (v45 + 1 & (v46 | ~v45)) * 2;
    v48 = v46 + v45;
    v49 = v48 + v47 + (v46 + ~v46 * 2 + 1 | ~v45) + ~v47 * 2;
    v50 = v46 | v45;
    v51 = (v48 ^ -v50) + (v48 & -v50) * 2;
    v52 = v50 + v51 + (-v51 & ~v50) * 2 + (v50 - v51 - (v50 | -v51)) * 2;
    v53 = v49 + ~v52 + (v49 + 3 & ~v52) + (v52 | 0xfffffffffffffffc - v49) + 4;
    v54 = (v53 * 2 & 4) + (v53 ^ 2);
    v55 = v54 - 1;
    v56 = v54 - v54 * 2;
    v1 = v54 + v55 + (-v54 | 0x11) + (v55 ^ 0x11) + (v56 | 0x11) + 1;
    v2 = ((v56 | 15) + v54 | v55 | 15) + ((v56 | 15) + v54 & (v55 | 15));
    v57 = v2;
    v58 = v1;
    v59 = (v58 + ~v58 * 2 + 1 & v57) + v58;
    v60 = v58 + v57;
    v61 = v58 | v57;
    v62 = -v61;
    v63 = (v60 & v62) * 2;
    v64 = v63 + (v60 ^ v62) + v59 + (-(v63 + (v60 ^ v62)) & ~v59) * 2 + (v59 - (v63 + (v60 ^ v62)) - (v59 | -(v63 + (v60 ^ v62)))) * 2;
    v65 = v58 - v57 + (v58 & v57) + (v57 & ~v58) * 2 + (v61 - 1 ^ v60) - v63;
    v66 = ~v64;
    v67 = ((v64 + v66 * 2 + 1 | ~v65) & ~(v64 + v66 * 2)) * 4 + (v64 + v66 * 2 ^ ~(v64 + v66 * 2 + 1 | ~v65)) * 2;
    v68 = (v64 ^ v65 + 1) + (v66 & ~v65 | v64 & v65 + 1) * 2 + ~v67 + v67 * 2;
    v69 = v68 + 2;
    v70 = v69 - v69 * 2;
    v71 = (unsigned int)v69 - 1 & 24824;
    v72 = ((v70 | 24824) + v69 ^ v69 - v71 + 24824) + ((v70 | 24824) + v69 & v69 - v71 + 24824) * 2;
    v0 = ~v72 + v72 * 2;
    v3 = ((v70 & 40711) + v69 ^ (0xfffffffffffffffe - v68 | 40711) + v69) + ((v70 & 40711) + v69 & (0xfffffffffffffffe - v68 | 40711) + v69) * 2 - 1;
    v73 = v3;
    v74 = v73 + ~v73 * 2 + 1;
    g_f1204c = (unsigned short)v0 + (unsigned short)v73 + (unsigned short)v74 + ((unsigned short)v0 + (unsigned short)~(unsigned int)v0 * 2 + 1 | (unsigned short)v73) + ((unsigned short)v0 | (unsigned short)~v74) + 2 & (unsigned short)(v5 >> ((char)v2 + v1 & 63));
    v75 = v3;
    v76 = v0;
    v77 = (v75 ^ 1) + ~v75 * 2 + ((v75 * 2 | v75 >> 63) & 2 & 3);
    v78 = v77 + 1;
    v79 = v76 - v78 + (v77 | ~v76) + 1;
    v80 = (v75 ^ -v76) + (v75 - v76 - (v75 | -v76) + (v79 ^ v78)) * 2 + (v79 & v78) * 4;
    v81 = v76 ^ v75;
    v82 = v81 + (v76 ^ ~v75) * 2;
    v83 = ((v80 & 0xfffffffffffffffd - v82) + v82 + 2 ^ -(v80 & v82 + 2)) + (v80 - v81 & -(v80 | -v81)) * 4 + (((v80 & 0xfffffffffffffffd - v82) + v82 + 2 & -(v80 & v82 + 2)) + (v80 - v81 ^ -(v80 | -v81))) * 2;
    v84 = v83 + ~v83 * 2;
    v85 = v84 + 1;
    v86 = (v84 ^ ~(v85 | 23)) + ((v85 | 23) & ~v84) * 2;
    v87 = (v86 ^ (v83 | 23) + 1) + (v86 & (v83 | 23) + 1) * 2;
    v0 = v85 + v83 + (v83 & 0xffffffffffffffe6 ^ 0xffffffffffffffe7 ^ v83 + 25) - (v85 & 0xffffffffffffffe6) + ((v83 & 0xffffffffffffffe6 ^ 0xffffffffffffffe7) & v83 + 25) * 2;
    v2 = ~v87 + v87 * 2;
    g_f1204e = v5 >> ((char)(v0 + (v2 ^ 0xfffffffffffffffe) - ~v2 * 2 - ((v2 * 2 | v2 >> 63) & 2 & 3)) & 63);
    v88 = g_f044f0 + g_f12048 + ~g_f12048 * 2;
    v89 = ((0xffff ^ g_f044f0 * 2) + g_f044f0 & g_f12048) * 2;
    g_f044f0 = v88 + ((unsigned short)(0xfffd - v88) | v89) + (v88 + 2 | v89) + 3;
    v90 = g_f044f2 * 2;
    v91 = g_f044f2 + g_f1204a + ~g_f1204a * 2 + 2;
    v92 = 1 | ((g_f044f2 ^ 1) + v90 + ~g_f044f2 * 4 + (v90 & 2) + 2 & g_f1204a) * 2;
    g_f044f2 = (v92 ^ v91) + (v92 & v91) * 2 - 1;
    v93 = g_f1204c + ~g_f044f4;
    v94 = -(g_f1204c | ~g_f044f4);
    v95 = g_f044f4 - g_f1204c;
    g_f044f4 = (unsigned short)v95 + ((unsigned short)v93 & (unsigned short)v94) * 4 + ((unsigned short)v93 ^ (unsigned short)v94) * 2 + (((unsigned short)v93 & (unsigned short)v94) * 4 + ((unsigned short)v93 ^ (unsigned short)v94) * 2 | (unsigned short)~v95) + ((unsigned short)v95 & (unsigned short)~((v93 & v94) * 4 + (v93 ^ v94) * 2)) + 1;
    v96 = -g_f1204e;
    v97 = g_f044f6 | g_f1204e;
    v98 = -g_f044f6;
    v99 = (v96 ^ g_f044f6) + (unsigned int)(g_f044f6 - g_f1204e - (v96 | g_f044f6)) * 2;
    g_f044f6 = (((unsigned short)v97 & (unsigned short)v98) * 4 + ((unsigned short)v97 ^ (unsigned short)v98) * 2 | (unsigned short)~v99) + ((unsigned short)v97 & (unsigned short)v98) * 4 + ((unsigned short)v97 ^ (unsigned short)v98) * 2 + (unsigned short)v99 * 2 + (unsigned short)~(v99 & (v97 & v98) * 4 + (v97 ^ v98) * 2) + 2;
    v100 = v5 + 1 + g_f044f8 + (v5 + 1 + ~v5 * 2 | ~g_f044f8);
    v101 = (v5 | ~g_f044f8) + g_f044f8;
    g_f044f8 = (v101 ^ ~v100) + (v100 & ~v101) * 2;
    v102 = v2;
    v103 = v0;
    v104 = (v102 | v103) - (v103 & v102);
    v105 = v104 - v102 + (v104 + (0xffffffff ^ v104 * 2) & v102) * 2;
    v106 = v104 - v103 + (v104 + ~v104 * 2 + 1 & v103) * 2;
    v107 = v106 & ~v105 | v106 + ~v106 * 2 + 1 & v105;
    v108 = v106 + v105 + (-(v106 & v105) & ~(v106 | v105)) * 2 + ((v106 | v105) + (-(v106 & v105) | ~(v106 | v105))) * 2 + 2;
    v109 = v108 * 2 + ~v108 * 4 + (v108 ^ 1) + (v108 * 2 & 2) + 3;
    return (v109 ^ v107) + (v109 & v107) * 2;
}
