/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4ddb80..0x4de4f8 (2424 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4ddb80_0 {
    char field_0;
} st_4ddb80_0;

extern unsigned short g_f045a0;
extern unsigned short g_f045a2;
extern unsigned short g_f045a4;
extern unsigned short g_f045a6;
extern unsigned long long g_f045a8;
extern unsigned short g_f120a0;
extern unsigned short g_f120a2;
extern unsigned short g_f120a4;
extern unsigned short g_f120a6;
extern unsigned int g_fffffffffffffffc;

unsigned int sub_4ddb80(void)
{
    unsigned long long v3;  // x8
    unsigned long long v4;  // x8
    unsigned long long v13;  // x13
    unsigned long long v14;  // x16
    unsigned long long v15;  // x0
    unsigned long long v16;  // x10
    unsigned long long v17;  // x12
    unsigned long v18;  // x10
    unsigned long long v19;  // x10
    unsigned int v20;  // w13
    unsigned short v21;  // x12
    st_4ddb80_0 *v5;  // x10
    unsigned long v23;  // x14
    unsigned long long v24;  // x16
    unsigned long long v25;  // x12
    unsigned long long v26;  // x13
    unsigned long long v27;  // x15
    unsigned long long v28;  // x12
    unsigned int v29;  // w12
    unsigned long long v30;  // x13
    unsigned long v31;  // x14
    unsigned long long v32;  // x15
    st_4ddb80_0 **v6;  // x12
    unsigned long long v33;  // x16
    unsigned long long v34;  // x15
    unsigned long long v35;  // x11
    unsigned long long v36;  // x11
    unsigned long long v37;  // x11
    unsigned long long v38;  // x13
    unsigned long long v39;  // x11
    unsigned int v40;  // w11
    unsigned int v41;  // w13
    unsigned short v42;  // x14
    unsigned long long v7;  // x11
    unsigned short v43;  // x14
    unsigned short v44;  // x11
    unsigned long long v45;  // x12
    unsigned long v46;  // x13
    unsigned long long v47;  // x15
    unsigned long long v48;  // x14
    unsigned long long v49;  // x14
    unsigned long long v50;  // x16
    unsigned long long v51;  // x12
    unsigned long long v52;  // x14
    st_4ddb80_0 **v8;  // x14
    unsigned long long v53;  // x13
    unsigned long v54;  // x12
    unsigned long long v55;  // x12
    unsigned long long v56;  // x13
    unsigned long long v57;  // x15
    unsigned long long v58;  // x12
    unsigned long long v59;  // x12
    unsigned long long v60;  // x12
    unsigned int v61;  // w12
    unsigned long long v62;  // x13
    unsigned long long v9;  // x17
    unsigned long v63;  // x14
    unsigned long long v64;  // x0
    unsigned long long v65;  // x16
    unsigned long long v66;  // x16
    unsigned long long v67;  // x15
    unsigned long long v68;  // x13
    unsigned long long v69;  // x13
    unsigned long long v70;  // x13
    unsigned long v71;  // x13
    unsigned long long v72;  // x14
    unsigned long long v10;  // x13
    unsigned int v73;  // w13
    unsigned int v74;  // w14
    unsigned int v75;  // w13
    unsigned long v76;  // x14
    unsigned long v77;  // x15
    unsigned long long v78;  // x16
    unsigned long long v79;  // x17
    unsigned long long v80;  // x0
    unsigned long long v81;  // x14
    unsigned long long v82;  // x14
    unsigned long long v11;  // x11
    unsigned long long v83;  // x15
    unsigned long long v84;  // x15
    unsigned long long v85;  // x14
    unsigned short v86;  // x16
    unsigned short v87;  // x17
    unsigned short v88;  // x10
    unsigned short v89;  // x15
    unsigned short v90;  // x15
    unsigned short v91;  // x0
    unsigned short v92;  // x16
    unsigned long v12;  // x15
    unsigned short v93;  // x16
    unsigned short v94;  // x16
    unsigned short v95;  // x15
    unsigned short v96;  // x11
    unsigned short v97;  // x10
    unsigned short v98;  // x11
    st_4ddb80_0 **v1;  // [bp-0x10], Other Possible Types: char
    st_4ddb80_0 *v2;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v2 = &v1;
    v1 = &v2;
    v3 = 0xff51afd7ed558ccd * ((char *)&g_f045a0 + ~(~&g_f045a0 + &g_f045a0));
    v4 = ((v3 | v3 >> 29) ^ ~v3 - (v3 >> 29 | ~v3)) + ((v3 | v3 >> 29) & ~v3 - (v3 >> 29 | ~v3)) * 2;
    v5 = v2;
    v6 = v1;
    v7 = (v5 ^ 1) + ~v5 * 2 + ((v5 * 2 | v5 >> 63) & 2 & 3);
    v8 = (char *)v6 + 1;
    v9 = v6 + v5;
    v10 = v9 + &v5[(-v6 | ~v5) + (-v6 & ~v5)] * 2 + 2;
    v11 = ((v7 | ~v6) + (char *)v8 - v7 - 1 & v7 + 1) * 4 + ((v7 | ~v6) + (char *)v8 - v7 - 1 ^ v7 + 1) * 2 | 1;
    v12 = v11 ^ v10;
    v13 = v11 & v10;
    v14 = v12 + v13 * 2;
    v15 = (char *)v6 + ((char *)&g_fffffffffffffffc + 3 ^ v6 * 2) & v5;
    v16 = v9 + v15 * 4 - v15 * 2 + ((char *)v8 + (-v5 | ~v6) + (-v5 & ~v6)) * 2;
    v17 = v14 + v16 + (-v14 & -v16) * 2;
    v18 = (v14 - v16 + v12 + (v13 - v14) * 2 + (v16 - 1 | ~(v12 + (v13 - v14) * 2))) * 2 + 2;
    v19 = (v18 | -v17) + v17 + (v18 | v17 - 1);
    v1 = (0xffffffffffffe105 & ~v19) - (v19 & 7930) + v19 * 2 + 15861;
    v2 = (v19 | 1) + (v19 & 1) + 57604;
    v20 = (unsigned int)v2 | v1;
    v21 = (unsigned short)v2 + (unsigned short)~v20;
    g_f120a0 = (((unsigned short)v2 + (unsigned short)~v20 ^ v1 + 1) + (v21 & v1 + 1) * 2 + ((unsigned short)v20 | (unsigned short)~(((unsigned int)v2 + ~v20 ^ v1 + 1) + ((unsigned int)v2 + ~v20 & v1 + 1) * 2)) + (((unsigned short)v2 + (unsigned short)~v20 ^ v1 + 1) + (v21 & v1 + 1) * 2 | (unsigned short)v20) + 1 | (unsigned short)v4 * 3 + (unsigned short)~(unsigned int)v4 * 4 + 3) + (unsigned short)v4 + 1;
    v23 = v1;
    v24 = (v23 ^ 1) + ~v23 * 2 + ((v23 * 2 | v23 >> 63) & 2 & 3);
    v25 = (v2 ^ -v23) - (v2 + v23) + ~((v23 + (-v2 | ~v23)) * 2 + 2) - (v2 + ~(v24 | v2) & v24 + 1) * 4 + ((v2 | v23) + (-v23 | ~v2) - (-v2 & ~v23) - (v2 + ~(v24 | v2) ^ v24 + 1)) * 2;
    v26 = v25 + 3;
    v27 = ~v26;
    v28 = v25 + 4;
    v1 = v26 - (v26 | 1) + (v27 | (char *)&g_fffffffffffffffc + 2) + v28 + 2;
    v2 = (v26 & 15) + v26 * 2 + (~((unsigned int)v26 * 2) & 30) + (v28 + v27 * 2 | 15) - 14;
    v29 = v4 >> ((char)v2 + v1 & 63);
    v30 = v2;
    v31 = v1;
    v32 = v31 | v30;
    v33 = -((v31 + ~v32 ^ v30 + 1) + (v31 + ~v32 & v30 + 1) * 2);
    v34 = (v33 ^ v32) + (v32 + (v33 | ~v32)) * 2 + 2;
    v35 = 1 | (v31 + v30 + ((char *)&g_fffffffffffffffc + 3 ^ v31 * 2) + ~(v31 + v30 + ((char *)&g_fffffffffffffffc + 3 ^ v31 * 2) + (v31 | ~v30))) * 2;
    v36 = ~((v35 ^ v31 - v30) + (v35 & v31 - v30) * 2) + ((v35 ^ v31 - v30) + (v35 & v31 - v30) * 2) * 2;
    v37 = (((v34 - v36 & -(v34 | -v36)) * 4 + (v34 - v36 ^ -(v34 | -v36)) * 2 | 1) ^ (v36 ^ v34) + (-v36 & ~v34 | v36 & v34) * 2) + (((v34 - v36 & -(v34 | -v36)) * 4 + (v34 - v36 ^ -(v34 | -v36)) * 2 | 1) & (v36 ^ v34) + (-v36 & ~v34 | v36 & v34) * 2) * 2;
    v38 = ~v37 + v37 * 2;
    v39 = (((v38 & 40652 ^ 40652) + (v38 ^ 0xffffffffffff6133) ^ v37) + ((v38 & 40652 ^ 40652) + (v38 ^ 0xffffffffffff6133) & v37) * 2 ^ v37 - (v38 & 40652) + 40652) + (((v38 & 40652 ^ 40652) + (v38 ^ 0xffffffffffff6133) ^ v37) + ((v38 & 40652 ^ 40652) + (v38 ^ 0xffffffffffff6133) & v37) * 2 & v37 - (v38 & 40652) + 40652) * 2;
    v1 = v38 + (49768 & v38 * 2) + (49768 & v38 * 2 ^ 49768) + 0xffffffffffff9ecb;
    v2 = ~v39 + v39 * 2;
    v40 = v1;
    v41 = v2;
    v42 = (unsigned short)(v41 - v40) + ((unsigned short)v40 | (unsigned short)~v41);
    v43 = (v42 ^ (unsigned short)v40 + 1) + (v42 & (unsigned short)v40 + 1) * 2;
    v44 = (unsigned short)v41 + 1 + (unsigned short)v40 + ((unsigned short)v41 + 1 + (unsigned short)~v41 * 2 | (unsigned short)~v40);
    g_f120a2 = (unsigned short)v29 + (unsigned short)~v29 * 2 + (unsigned short)~(v29 + ~v29 * 2 + 1) * 2 + ((v43 | v44) + (v43 & v44) | (unsigned short)v29 + (unsigned short)~v29 * 2 + 1) + 3;
    v45 = v2;
    v46 = v1;
    v47 = (v45 | v46) - (v46 & v45);
    v48 = v46 + ~v46 * 2;
    v49 = v48 + 2;
    v50 = v49 + ~(v48 + 1) * 2 | v45;
    v51 = (v46 - v45 | (v50 & v49) * 4 + (v50 ^ v49) * 2) + ((v50 & v49) * 4 + (v50 ^ v49) * 2 & v46 - v45);
    v52 = v47 + ~v47 * 2 + 1;
    v53 = v51 + v47 + (v52 - v51 - (v52 | -v51)) * 2;
    v54 = (v47 - v51 + (v51 - 1 & ~v47)) * 2 + 2;
    v55 = v53 + (v54 | ~v53) + (v54 | v53);
    v56 = v55 + 1;
    v57 = ~v56;
    v58 = v55 + 2;
    v59 = (unsigned int)v58 + (unsigned int)v57 * 2 | 0xffffffffffffffec;
    v60 = (v56 + v59 + 21 ^ v58 + (19 | ~v56)) + (v56 + v59 + 21 & v58 + (19 | ~v56)) * 2;
    v1 = (v56 | (char *)&g_fffffffffffffffc + 2) + ((v56 ^ 14) + (v58 + (v57 | 14)) * 2 & (char *)&g_fffffffffffffffc + 2) + 1;
    v2 = ~v60 + v60 * 2;
    v61 = v4 >> (((char)v2 + 1 ^ v1) + (v1 + ((char)v2 + 1 | ~v1)) * 2 + 1 & 63);
    v62 = v2;
    v63 = v1;
    v64 = v63 & v62;
    v65 = v62 - v63 + v64 + (v63 & ~v62) * 2;
    v66 = (v65 ^ -v64) + (v65 + (-v64 | ~v65)) * 2 + 2;
    v67 = v63 + ~v63 * 2 + 1 | v62 + ~v62 * 2 + 1;
    v68 = (v63 + v62 + v67 + 1 ^ -((v63 + v62 ^ -(v63 | v62)) + (v63 + v62 & -(v63 | v62)) * 2)) + (v63 + v62 + v67 + 1 & -((v63 + v62 ^ -(v63 | v62)) + (v63 + v62 & -(v63 | v62)) * 2)) * 2;
    v69 = v68 + ~v68 * 2 + 1;
    v70 = v66 + (v69 | ~v66) + (v69 | v66) + 1;
    v71 = (v70 * 2 & 4) + (v70 ^ 2);
    v72 = ~v71 + v71 * 2;
    v1 = (v72 ^ 9555) + (19110 & v72 * 2) - 1;
    v2 = (v72 ^ 55982) + ((-v71 | 55982) + v71) * 2 - 1;
    v73 = ((unsigned int)v2 + 1 ^ v1) + (v1 + ((unsigned int)v2 + 1 | ~v1)) * 2 + 2;
    v74 = ~v61;
    v75 = ~v73 + v73 * 2 | v61 + v74 * 2 + 1;
    g_f120a4 = ((unsigned short)v75 ^ (unsigned short)(0xfffd - ((unsigned short)v61 * 3 + (unsigned short)v74 * 4))) + ((unsigned short)v75 + ((unsigned short)(0x7ffd - ((unsigned short)v61 * 3 + (unsigned short)v74 * 4)) | (unsigned short)~v75)) * 2 + 2;
    v76 = v2;
    v77 = v1;
    v78 = v77 + ~v77 * 2;
    v79 = v78 + 1;
    v80 = (v79 & v76) + v77 + ((v77 | v76) - 1 ^ v77 + v76) - (v77 + v76 & -(v77 | v76)) * 2;
    v81 = v77 - v76 + (v78 + 2 ^ (v76 | ~v79)) * 2 + (v78 + 2 & (v76 | ~v79)) * 4;
    v82 = (v81 ^ v80 + 1) + ((char *)&g_fffffffffffffffc - v80 - v81 - ((char *)&g_fffffffffffffffc - v80 + 2 | -v81) + 2) * 2 + ((v80 + 1 & -v81) + (v81 & v80 + 1)) * 2;
    v83 = v82 + 1;
    v84 = ((v83 - v83 * 2 | 20) ^ v83) + ((v83 - v83 * 2 | 20) & v83) * 2;
    v85 = (v82 | 1) + (v82 & 1) - (v82 & 20) + 20;
    v1 = (v82 ^ 29) + ((29 | ~v82) + v83) * 2 - 1;
    v2 = (v84 ^ v85) + (v84 & v85) * 2 - 1;
    g_f120a6 = v4 >> (((char)v2 + v1 ^ (char)-(v1 | v2)) + (v1 | (char)v2) + ((char)v2 + v1 & (char)-(v1 | v2)) * 2 & 63);
    v86 = g_f120a0 + ~g_f045a0;
    v87 = g_f045a0 - g_f120a0 - (g_f045a0 | ~g_f120a0);
    v88 = g_f045a0 - g_f120a0;
    v89 = (v87 & v86) * 4 + (v87 ^ v86) * 2 | 1;
    g_f045a0 = (v89 ^ v88) + (v89 & v88) * 2 - 1;
    v90 = -g_f120a2;
    v91 = g_f045a2 * 2;
    v92 = v91 + ~g_f045a2 * 4 + (g_f045a2 ^ 1) + (v91 & 2);
    v93 = v92 + g_f120a2 + ((unsigned short)(0xfffffffd - v92) & ~g_f120a2) + 3;
    g_f045a2 = (v90 ^ g_f045a2) + (unsigned int)(g_f045a2 - g_f120a2 - (v90 | g_f045a2)) * 2 + v93 * 4 - v93 * 2;
    v94 = g_f045a4 + 1;
    v95 = v94 + ~g_f045a4 * 2 | g_f120a4;
    v96 = (g_f120a4 + ~g_f120a4 * 2 + 1 & g_f045a4) + g_f120a4;
    g_f045a4 = (unsigned short)(v96 + (v95 ^ (unsigned int)(0xfffe - g_f045a4)) - (v95 & v94) * 2) + 1;
    v97 = g_f045a6 + g_f120a6 + ~g_f120a6 * 2;
    v98 = (g_f120a6 - g_f045a6 + (g_f045a6 & ~g_f120a6)) * 2;
    g_f045a6 = (unsigned short)(v98 + v97 * 2 + ((unsigned int)(0xfffd - v97) | v98) - (v97 + 2 & v98)) + 5;
    g_f045a8 = g_f045a8 ^ v4;
    return 0xfffffffd;
}
