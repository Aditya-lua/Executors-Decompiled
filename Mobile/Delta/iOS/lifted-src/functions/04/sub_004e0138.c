/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4e0138..0x4e0b18 (2528 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4e0138_0 {
    char field_0;
} st_4e0138_0;

extern unsigned short g_f046e0;
extern unsigned short g_f046e2;
extern unsigned short g_f046e4;
extern unsigned short g_f046e6;
extern unsigned long long g_f046e8;
extern unsigned short g_f12140;
extern unsigned short g_f12142;
extern unsigned short g_f12144;
extern unsigned short g_f12146;

long long sub_4e0138(void)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x8
    unsigned long long v12;  // x10
    unsigned long long v102;  // x11
    unsigned long v103;  // x10
    unsigned long long v104;  // x8
    unsigned long long v105;  // x8
    unsigned long long v13;  // x11
    unsigned int v14;  // w11
    unsigned int v15;  // w13
    unsigned int v16;  // w10
    unsigned int v17;  // w10
    unsigned int v18;  // w15
    unsigned long long v19;  // x15
    unsigned long long v20;  // x16
    unsigned long long v21;  // x17
    st_4e0138_0 *v4;  // x10
    unsigned long long v22;  // x0
    unsigned long long v23;  // x1
    unsigned long long v24;  // x2
    unsigned long v25;  // x4
    unsigned long long v26;  // x0
    unsigned long long v27;  // x15
    unsigned long long v28;  // x14
    unsigned long long v29;  // x15
    unsigned long long v30;  // x16
    unsigned long long v31;  // x0
    st_4e0138_0 **v5;  // x11
    unsigned int v32;  // w16
    unsigned long long v33;  // x15
    unsigned long long v34;  // x17
    unsigned long long v35;  // x1
    unsigned long long v36;  // x0
    unsigned long long v37;  // x1
    unsigned long long v38;  // x15
    unsigned long long v39;  // x15
    unsigned long long v40;  // x17
    unsigned long long v41;  // x15
    unsigned long long v6;  // x13
    unsigned long long v42;  // x0
    unsigned long long v43;  // x1
    unsigned long v44;  // x13
    unsigned long long v45;  // x16
    unsigned long v46;  // x17
    unsigned long long v47;  // x1
    unsigned long long v48;  // x2
    unsigned long long v49;  // x0
    unsigned long long v50;  // x1
    unsigned long long v51;  // x16
    unsigned long long v7;  // x12
    unsigned long long v52;  // x16
    unsigned long long v53;  // x16
    unsigned long long v54;  // x17
    unsigned long long v55;  // x1
    unsigned int v56;  // w16
    unsigned long long v57;  // x17
    unsigned long v58;  // x0
    unsigned long long v59;  // x1
    unsigned long long v60;  // x5
    unsigned long long v61;  // x4
    unsigned long long v8;  // x10
    unsigned long long v62;  // x12
    unsigned long long v63;  // x3
    unsigned long long v64;  // x17
    unsigned long long v65;  // x17
    unsigned long long v66;  // x0
    unsigned long long v67;  // x2
    unsigned long long v68;  // x12
    unsigned long v69;  // x17
    unsigned long long v70;  // x12
    unsigned long long v71;  // x12
    unsigned long long v9;  // x15
    unsigned int v72;  // w12
    unsigned int v73;  // w14
    unsigned int v74;  // w17
    unsigned int v75;  // w15
    unsigned int v76;  // w12
    unsigned int v77;  // w14
    unsigned int v78;  // w11
    unsigned long v79;  // x12
    unsigned long v80;  // x14
    unsigned long long v81;  // x0
    unsigned long long v10;  // x11
    unsigned long long v82;  // x1
    unsigned long long v83;  // x16
    unsigned long long v84;  // x12
    unsigned long v85;  // x14
    unsigned long long v86;  // x12
    unsigned long long v87;  // x14
    unsigned long long v88;  // x12
    unsigned long long v89;  // x15
    unsigned long long v90;  // x16
    unsigned int v91;  // w15
    unsigned long v11;  // x10
    unsigned int v92;  // w10
    unsigned int v93;  // w14
    unsigned int v94;  // w14
    unsigned int v95;  // w13
    unsigned int v96;  // w10
    unsigned short v97;  // x10
    unsigned int v98;  // w13
    unsigned int v99;  // w10
    unsigned short v100;  // x14
    unsigned short v101;  // x11
    st_4e0138_0 **v0;  // [bp-0x10], Other Possible Types: unsigned long long, char
    st_4e0138_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v1 = &v0;
    v0 = &v1;
    v2 = 0xff51afd7ed558ccd * ((char *)&g_f046e0 + ~(~&g_f046e0 + &g_f046e0));
    v3 = ((v2 | v2 >> 29) ^ ~v2 - (v2 >> 29 | ~v2)) + ((v2 | v2 >> 29) & ~v2 - (v2 >> 29 | ~v2)) * 2;
    v4 = v1;
    v5 = v0;
    v6 = v5 & ~v4;
    v7 = v5 + v4 + (v4 - v5 - (v4 | -v5) + (-v5 & ~v4) + v6) * 2;
    v8 = (v5 | v4) + (char *)v5 - v6 + 2 * (-(st_4e0138_0 **)((char *)v5 - v6) & ~(v5 | v4)) + 2 * (-(st_4e0138_0 **)((char *)v5 - v6) | ~(v5 | v4)) + 2 * (v5 | v4) + 3;
    v9 = v7 + ~v7 * 2 + 1;
    v10 = (v8 - 1 ^ v7) + (v8 - 1 & v7) * 2 + (v9 + (1 - v8 | ~v9)) * 2;
    v11 = (v7 - v8 + (v8 + 0x7ffffffffffffffe & ~v7)) * 2 + 4;
    v12 = v10 + (v11 | ~(v10 + 2)) + (v10 + 2 | v11);
    v13 = v12 + 3;
    v0 = v12 + 4 + (v13 | 30536) + (v12 + 4 + ~v13 * 2 | 30536);
    v1 = (v13 & 0xfffffffffffffffe) + (v13 | 0xfffffffffffffffe) + 35001;
    v14 = (unsigned int)v1 * 3 + ~(unsigned int)v1 * 4;
    v15 = (unsigned int)(0xfffffffd - v14) ^ (unsigned int)v0;
    v16 = (v15 + ((unsigned int)(0x7ffffffffffffffd - v14) & (unsigned int)v0) * 2 & 0xfffffffe) + (v15 | 0xfffffffe);
    v17 = v16 + ((unsigned int)(0xfffffffe - v16) & (unsigned int)v3 + (0xffffffff ^ (unsigned int)v3 * 2)) + 1;
    v18 = (unsigned int)v3 + ~(unsigned int)v3 * 2;
    g_f12140 = (unsigned short)v18 + (unsigned short)v17 + ((unsigned short)~(v18 + (v17 | ~v18)) + (unsigned short)v17 + ((unsigned short)~v17 & (unsigned short)~v18)) * 2 + 1;
    v19 = v1;
    v20 = v0;
    v21 = v20 & ~v19;
    v22 = v19 - v20;
    v23 = v22 + (v20 & v19) + v21 * 2;
    v24 = -((v20 + ~(v20 | v19) ^ v19 + 1) + (v20 + ~(v20 | v19) & v19 + 1) * 2);
    v25 = (v23 + (v24 | ~v23)) * 2 + 2;
    v26 = -v19;
    v27 = v20 + v19 + (v26 & ~v20) * 2;
    v28 = (v27 + (v20 + (v26 | ~v20)) * 2 + 2 ^ (1 | (v22 + v21) * 2)) + (v27 + (v20 + (v26 | ~v20)) * 2 + 2 & (1 | (v22 + v21) * 2)) * 2;
    v29 = v25 + (v24 ^ v23) - (~v28 + v28 * 2) + (~v28 + v28 * 2 | (v24 ^ ~v23) - v25) + (v25 + (v24 ^ v23) & -v28);
    v30 = v29 + 1;
    v31 = v29 + (0xfffffffffffffffe - v29 | 3) + (v30 ^ 3) + 2;
    v0 = v31 + (v30 & 3) * 2 + (v31 | ~(v30 & 3)) - (v31 & v30 & 3) + 1;
    v1 = v29 + (v30 * 2 & 28) + (v30 * 2 & 28 ^ 28) - 14;
    v32 = v3 >> ((char)v1 + (char)v0 & 63);
    v33 = v1;
    v34 = v0;
    v35 = ~v33 * 2;
    v36 = (v33 ^ -v34) + (v33 - v34 - (v33 | -v34)) * 2 + ((v35 + (v33 ^ 1) + ((v33 * 2 | v33 >> 63) & 2 & 3) | ~v34) + v34) * 2;
    v37 = (v33 + v35 + 1 & v34) + v33;
    v38 = (v33 - v34 + (v34 | ~v33) ^ v34 + 1) + (v33 - v34 + (v34 | ~v33) & v34 + 1) * 2;
    v39 = v38 + v37 + 1 + (-v38 & ~v37) * 2 + ((-v38 | ~v37) + v37 + 1) * 2;
    v40 = v36 - v39 + (v36 + 2 & -v39) + (v39 - 1 | 0xfffffffffffffffd - v36);
    v41 = v40 + 3;
    v42 = v40 + 4;
    v43 = ((v42 | 0xffffffffffff2c12) - v41 + 54252 ^ v40 + 5) + ((v42 | 0xffffffffffff2c12) - v41 + 54252 & v40 + 5) * 2;
    v44 = v41 + (v42 & 54253) + 0xffffffffffff2c14 + ((0xffffffff ^ (unsigned int)v42 * 2) & 108506);
    v0 = v44 + v43 + (v44 | ~v43) + (v43 & ~v44) + 1;
    v1 = v40 + 11286;
    g_f12142 = (((unsigned short)v1 + v0 | (unsigned short)~v32) ^ (unsigned short)v32 + 1) + (((unsigned short)v1 + v0 | (unsigned short)~v32) + ((unsigned short)v32 + 1 | (unsigned short)~((unsigned int)v1 + v0 | ~v32))) * 2 + 2;
    v45 = v1;
    v46 = v0;
    v47 = v46 - v45 + (v45 | ~v46);
    v48 = v46 + ~v46 * 2;
    v49 = (((v46 + ~v45 & -v47) * 4 + (v46 + ~v45 ^ -v47) * 2 | 1) ^ v48 + v45 + 2) + (((v46 + ~v45 & -v47) * 4 + (v46 + ~v45 ^ -v47) * 2 | 1) & v48 + v45 + 2) * 2;
    v50 = v46 + v47 + (v45 & ~v46) * 2;
    v51 = (v48 ^ ~(v45 - v46 + (v46 | ~v45))) + (v45 - v46 + (v46 | ~v45) & ~v48) * 2;
    v52 = v50 + 1 + v51 + (-v51 & 0xfffffffffffffffe - v50) * 2 + (v50 + 1 - v51 - (v50 + 1 | -v51)) * 2;
    v53 = (~v49 + v49 * 2 | -v52) + ~(~v49 + v49 * 2 + (-v52 | -v49)) + (v52 + ~v52 * 2 + ~v49 + v49 * 2 - (v52 + ~v52 * 2 + 2 | ~v49 + v49 * 2)) * 2;
    v54 = v53 + 4;
    v55 = v54 * 2;
    v0 = (v54 ^ 3) + (v55 & 6) - 1;
    v1 = v54 + (v54 & 30) + (v53 + 0x22 ^ -(v54 | 30)) - (v55 | 0xffffffffffffffc3) + (v53 + 0x22 & -(v54 | 30)) * 2 - 31;
    v56 = v3 >> (((char)(v0 - (v1 + 1)) + ((char)v1 + 1) * 2 | 1) + ((char)(v0 - (v1 + 1)) | 254) & 63);
    v57 = v1;
    v58 = v0;
    v59 = ~v57;
    v60 = v57 + 1;
    v61 = v60 + v58;
    v62 = v61 + ((-v58 | ~v57) + v60 + (-v58 & ~v57)) * 2 + ((v57 * 2 + v59 * 4 + (v57 ^ 1) + (v57 * 2 & 2) + 9223372036854775810 | ~v58) + v58) * 2;
    v63 = v62 + 1;
    v64 = (v58 + ~v58 * 2 + 1 & v57) * 2;
    v65 = v61 + v59 * 2 + v64 + (v64 | 0xfffffffffffffffe - (v61 + v59 * 2)) + (v61 + v59 * 2 + 1 & ~v64);
    v66 = v65 + 2;
    v67 = 0xfffffffffffffffe - v62;
    v68 = (v66 ^ v63) + (v66 & v63) * 2 + (v62 + v67 * 2 + 2 - v66 - (v62 + v67 * 2 + 2 | 0xfffffffffffffffe - v65)) * 2;
    v69 = (v63 - v66 + (v65 + 1 & v67)) * 2 + 2;
    v70 = (v69 | ~v68) + v69 + v68 * 2 - (v68 & v69);
    v71 = v70 + 1;
    v0 = (0xfffffffffffffffe - v70 | 12696) + v71 + (v70 + (0xfffffffffffffffe - v70 | 12696) + 2 | v71 | 12696) + (0xfffffffffffffffe - ((0xfffffffffffffffe - v70 | 12696) + v71) | v71 | 12696) + 2;
    v1 = (v71 ^ 52840) + (105680 & v71 * 2) - 1;
    v72 = v0;
    v73 = v1;
    v74 = v72 + 1;
    v75 = v73 + v72 + (v74 + ~v72 * 2 & ~v73);
    v76 = (unsigned int)(v74 + v72 - v73) + (v73 | ~v72) + (v73 & ~v72) * 2;
    v77 = v56 + 1;
    v78 = v75 + ((unsigned int)(0xfffffffe - v75) | v76) + (v75 + 1 | v76) + 2 | v77 + ~v56 * 2;
    g_f12144 = ((unsigned short)v78 ^ (unsigned short)v77) + ((unsigned short)v78 + ((unsigned short)v77 | (unsigned short)~v78)) * 2 + 2;
    v79 = v1;
    v80 = v0;
    v81 = v79 * 2;
    v82 = v80 + v79;
    v83 = v82 + ~v80 * 2 + ((v79 ^ 1) + ~v79 * 2 + (v81 & 2) & v80) * 2 + 2;
    v84 = v81 - (v82 + ((v80 | v79) ^ -v80) * 2 + ((v80 | v79) & -v80) * 4);
    v85 = v84 ^ v83;
    v86 = v85 + (v84 & v83) * 2;
    v87 = (v85 | 0xfffffffffffffffe) + (-v86 | 1) + 1;
    v88 = v87 + v86 * 2;
    v89 = (v88 + 29 ^ -(v88 | 29)) + (v88 + 29 & -(v88 | 29)) * 2;
    v90 = (v88 & 29) - (v88 + 30) + (v88 + 30 - (v88 & 29)) * 2;
    v0 = (v89 ^ v90) + (v89 & v90) * 2 - 1;
    v1 = (v87 | 0xfffffffffffffffe) + (v88 & 0xfffffffffffffffe) + 21;
    g_f12146 = v3 >> ((char)v1 + v0 & 63);
    v91 = -g_f12140;
    v92 = (v91 ^ g_f046e0) + (unsigned int)(g_f046e0 - g_f12140 - (v91 | g_f046e0)) * 2;
    v93 = (g_f12140 & ~g_f046e0) * 2;
    g_f046e0 = ((unsigned short)v93 | (unsigned short)~v92) + (unsigned short)v93 + ((unsigned short)~v92 | (unsigned short)~v93) + (unsigned short)v92 * 2 + 2;
    v94 = (g_f12142 + ~g_f12142 * 2 + 1 & g_f046e2) + g_f12142;
    v95 = g_f12142 | ~g_f046e2;
    v96 = g_f046e2 + 1;
    v97 = -((v95 ^ v96) + (v95 & v96) * 2);
    g_f046e2 = ((unsigned short)v94 ^ v97) + ((unsigned short)v94 + (v97 | (unsigned short)~v94)) * 2 + 2;
    v98 = (g_f12144 + ~g_f12144 * 2 + 1 & g_f046e4) + g_f12144;
    v99 = (g_f046e4 + ~g_f046e4 * 2 + 1 | g_f12144) + g_f046e4;
    g_f046e4 = ((unsigned short)v99 ^ (unsigned short)~v98) + ((unsigned short)v98 & (unsigned short)~v99) * 2;
    v100 = g_f046e6 + 1;
    v101 = v100 + ~g_f046e6 * 2 | g_f12146;
    g_f046e6 = (unsigned short)((v101 ^ (unsigned int)(0xfffe - g_f046e6)) + (g_f12146 | g_f046e6) - (v101 & v100) * 2) + 1;
    v102 = g_f046e8 | v3;
    v103 = g_f046e8 + 1;
    v104 = v103 + ~g_f046e8 * 2 | v3;
    v105 = -((v104 ^ v103) + (v104 & v103) * 2);
    g_f046e8 = (v105 ^ v102) + (v102 + (v105 | ~v102)) * 2 + 2;
    return v88 + 30 - (v88 & 29);
}
