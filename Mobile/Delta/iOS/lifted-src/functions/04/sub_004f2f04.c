/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4f2f04..0x4f3874 (2416 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4f2f04_0 {
    char field_0;
} st_4f2f04_0;

extern unsigned short g_f046a0;
extern unsigned short g_f046a2;
extern unsigned short g_f046a4;
extern unsigned short g_f046a6;
extern unsigned long long g_f046a8;
extern unsigned short g_f12120;
extern unsigned short g_f12122;
extern unsigned short g_f12124;
extern unsigned short g_f12126;

unsigned long long sub_4f2f04(void)
{
    unsigned long long v3;  // x8
    unsigned long long v4;  // x8
    unsigned long long v13;  // x12
    unsigned long long v14;  // x14
    unsigned long long v15;  // x10
    unsigned long long v16;  // x11
    unsigned long long v17;  // x14
    unsigned long long v18;  // x15
    unsigned long long v19;  // x11
    unsigned long long v20;  // x11
    unsigned long long v21;  // x11
    unsigned long long v22;  // x11
    st_4f2f04_0 *v5;  // x10
    unsigned long long v23;  // x12
    unsigned long long v24;  // x11
    unsigned long long v25;  // x14
    unsigned long long v26;  // x11
    unsigned long long v27;  // x14
    unsigned long long v28;  // x15
    unsigned long long v29;  // x14
    unsigned long long v30;  // x16
    unsigned long long v31;  // x15
    unsigned long long v32;  // x14
    st_4f2f04_0 **v6;  // x12
    unsigned long long v33;  // x14
    unsigned long long v34;  // x14
    unsigned long long v35;  // x14
    unsigned long v36;  // x15
    unsigned int v37;  // w14
    unsigned int v38;  // w15
    unsigned short v39;  // x17
    unsigned short v40;  // x16
    unsigned short v41;  // x14
    unsigned long long v42;  // x14
    unsigned long long v7;  // x13
    unsigned long long v43;  // x15
    unsigned long long v44;  // x16
    unsigned long long v45;  // x0
    unsigned long long v46;  // x17
    unsigned long long v47;  // x16
    unsigned long long v48;  // x14
    unsigned long long v49;  // x15
    unsigned long long v50;  // x16
    unsigned long long v51;  // x1
    unsigned short v52;  // x13
    unsigned long long v8;  // x14
    unsigned long long v53;  // x15
    unsigned long v54;  // x16
    unsigned long long v55;  // x17
    unsigned long long v56;  // x17
    unsigned long long v57;  // x15
    unsigned long long v58;  // x16
    unsigned long long v59;  // x15
    unsigned long long v60;  // x15
    unsigned long long v61;  // x0
    unsigned int v62;  // w15
    unsigned long long v9;  // x13
    unsigned short v63;  // x17
    unsigned short v64;  // x15
    unsigned short v65;  // x15
    unsigned short v66;  // x15
    unsigned long v67;  // x15
    unsigned long long v68;  // x16
    unsigned long long v69;  // x17
    unsigned long long v70;  // x0
    unsigned long long v71;  // x2
    unsigned long long v72;  // x1
    unsigned long v10;  // x16
    unsigned long long v73;  // x15
    unsigned long long v74;  // x11
    unsigned long long v75;  // x16
    unsigned long long v76;  // x15
    unsigned long long v77;  // x14
    unsigned long long v78;  // x11
    unsigned long long v79;  // x14
    unsigned long long v80;  // x11
    char v81;  // x15
    unsigned short v82;  // x17
    unsigned long long v11;  // x10
    unsigned short v83;  // x10
    unsigned short v84;  // x12
    unsigned int v85;  // w15
    unsigned int v86;  // w10
    unsigned short v87;  // x10
    unsigned int v88;  // w12
    unsigned short v89;  // x13
    unsigned short v90;  // x14
    unsigned short v91;  // x11
    unsigned long long v92;  // x11
    unsigned long long v12;  // x11
    unsigned long long v93;  // x12
    unsigned long v94;  // x10
    unsigned long long v95;  // x8
    st_4f2f04_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned long long
    unsigned long long v1;  // [bp-0x10]
    st_4f2f04_0 *v2;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v2 = &v0;
    v0 = &v2;
    v3 = 0xff51afd7ed558ccd * ((char *)&g_f046a0 + ~(~&g_f046a0 + &g_f046a0));
    v4 = ((v3 | v3 >> 29) ^ ~v3 - (v3 >> 29 | ~v3)) + ((v3 | v3 >> 29) & ~v3 - (v3 >> 29 | ~v3)) * 2;
    v5 = v2;
    v6 = v0;
    v7 = (v5 | ~v6) + (char *)v6;
    v8 = v6 | v5;
    v9 = (v8 & ~v7) * 2;
    v10 = v9 + (v7 ^ ~v8);
    v11 = v5 + v6 + ~((v8 & -v6) * 4 + (v8 ^ -v6) * 2) + (v6 - &v5[v6 | -v5] + (-v5 & ~v6)) * 2 + ((v8 & -v6) * 4 + (v8 ^ -v6) * 2) * 2;
    v12 = v11 + 2;
    v13 = v9 - (v7 ^ v8) + ((v7 ^ v8) - v9) * 2;
    v14 = v10 + v12 - 1;
    v15 = v14 + (v10 + v13 - ((v13 | ~v11) + v12 * 2) + (v11 + 0x8000000000000000 & v13)) * 2;
    v0 = (v14 | 0xfffffffffffffffe) + (v15 + 6 + ((0xffffffff ^ ((unsigned int)v15 + 6) * 2) & 19704) + (v15 + 6 + (9852 | ~(v15 + 6))) * 2 + 0xffffffffffffd986 | 1);
    v2 = v15 + 55690;
    g_f12120 = ((unsigned short)v2 + (unsigned short)v0 | (unsigned short)~(unsigned int)v4) + (unsigned short)v4 + 1;
    v16 = v2;
    v17 = v0;
    v18 = v16 - v17 + (v17 & ~v16) * 2;
    v19 = (v17 ^ -v16) + ((v17 | v16) ^ -v17) * 2 + ((v17 | v16) & -v17) * 4 + (v17 - (v16 + (v17 | -v16))) * 2 + 1;
    v20 = (v19 * 2 + ~v19 ^ 1) + ((~v19 * 2 | ~v19 >> 63) & 2 & 3) - v19 * 2 + 1;
    v21 = (v20 ^ v18) + (v20 & v18) * 2 - 1;
    v22 = (v21 * 2 & 4) + (v21 ^ 2);
    v23 = ~v22 + v22 * 2;
    v24 = -v22;
    v25 = ((v23 | 5) + 1 ^ (v24 | 5) + v23 + 1) + ((v23 | 5) + 1 & (v24 | 5) + v23 + 1) * 2;
    v26 = ((v23 + 11 ^ 0xfffffffffffffff4 - ((v24 | 0xfffffffffffffff4) + v23)) + (v23 + 11 & 0xfffffffffffffff4 - ((v24 | 0xfffffffffffffff4) + v23)) * 2 ^ (v23 | 11) + 1) + ((v23 + 11 ^ 0xfffffffffffffff4 - ((v24 | 0xfffffffffffffff4) + v23)) + (v23 + 11 & 0xfffffffffffffff4 - ((v24 | 0xfffffffffffffff4) + v23)) * 2 & (v23 | 11) + 1) * 2;
    v0 = ~v25 + v25 * 2;
    v2 = ~v26 + v26 * 2;
    v27 = v2;
    v28 = v27 + (0xffffffffffffffff ^ v27 * 2) - 1;
    v29 = v2;
    v30 = v0;
    v31 = v29 - v30 + (((v30 | v29) & -v29) * 4 + ((v30 | v29) ^ -v29) * 2 | ~(v29 - v30)) + (((v30 | v29) & -v29) * 4 + ((v30 | v29) ^ -v29) * 2 | v29 - v30) + 1;
    v32 = v30 - v29 + ~((v29 - (v30 + ~v30 * 2 + 1) + (v30 + ~v30 * 2 + 1 | ~v29) & v30 + ~v30 * 2 + 2) * 4 + (v29 - (v30 + ~v30 * 2 + 1) + (v30 + ~v30 * 2 + 1 | ~v29) ^ v30 + ~v30 * 2 + 2) * 2) + ((v29 - (v30 + ~v30 * 2 + 1) + (v30 + ~v30 * 2 + 1 | ~v29) & v30 + ~v30 * 2 + 2) * 4 + (v29 - (v30 + ~v30 * 2 + 1) + (v30 + ~v30 * 2 + 1 | ~v29) ^ v30 + ~v30 * 2 + 2) * 2) * 2 + 2;
    v33 = (v32 * 2 + ~v32 ^ 1) + ((~v32 * 2 | ~v32 >> 63) & 2 & 3) - v32 * 2 + 1;
    v34 = ~((v33 ^ v31) + (v33 & v31) * 2) + ((v33 ^ v31) + (v33 & v31) * 2) * 2;
    v35 = (v34 * 2 & 4) + (v34 ^ 2);
    v36 = (unsigned int)v35 - 1 & 16682;
    v1 = v35 + 48852;
    v2 = v35 + (-v35 & 0xffffffffffffbed5) + v35 + 16682 + ~v36 + (v35 + (-v35 & 0xffffffffffffbed5) + 16682 & v36 - (v35 + 16682)) + (0xffffffffffffbed5 - (v35 + (-v35 & 0xffffffffffffbed5)) | v35 + 16682 + ~v36) + 16683;
    v37 = v1;
    v38 = v2;
    v39 = (unsigned short)v37 + 1;
    v40 = v39 + (unsigned short)~v37 * 2 | (unsigned short)v38;
    v41 = ((unsigned short)v38 + (unsigned short)~v38 * 2 + 1 & (unsigned short)v37) + (unsigned short)v38;
    g_f12122 = ((v40 ^ v39) + (v40 & v39) * 2 | v41) + ((v40 ^ v39) + (v40 & v39) * 2 & v41) & (unsigned short)(v4 >> ((char)v28 + (char)v0 + (((char)v27 + 1 & (char)v0) + (char)~(v28 | v0)) * 2 & 63));
    v42 = v2;
    v43 = v1;
    v44 = v42 - v43 + (v43 & v42) + (v43 & ~v42) * 2;
    v45 = v43 | v42;
    v46 = -((v43 + v42 ^ -v45) + (v43 + v42 & -v45) * 2);
    v47 = (v46 ^ v44) + (v44 + (v46 | ~v44)) * 2 + 2;
    v48 = ((v43 | ~v42) + v42 ^ ~v45) + (v45 & ~((v43 | ~v42) + v42)) * 2;
    v49 = (v47 + v48 + ((v47 & v48 - 1) - (v47 + v48)) * 2 ^ (1 | (v47 & -v48) * 2)) + (v47 + v48 + ((v47 & v48 - 1) - (v47 + v48)) * 2 & (1 | (v47 & -v48) * 2)) * 2;
    v50 = ~v49 + v49 * 2;
    v51 = -v49;
    v0 = (v50 ^ 10) + ((v51 | 10) + v49) * 2 - 1;
    v2 = v50 + ((v51 | 24) + v49) * 2 + ((0xffffffff ^ (unsigned int)v50 * 2) & 48) - 25;
    v52 = v4 >> (((char)v2 | ~v0) + v0 + 1 + ((char)v2 ^ v0) + ((char)(v2 - v0) + (v0 | (char)~v2) ^ v0 + 1) + ((char)(v2 - v0) + (v0 | (char)~v2) & v0 + 1) * 2 & 63);
    v53 = v2;
    v54 = v0;
    v55 = (v53 * 2 + ~v53 * 4 + (v53 ^ 1) + (v53 * 2 & 2) + 2 & v54) * 2;
    v56 = v55 + (v53 - v54) * 2 + (v55 | ~(v53 - v54)) + (~v55 | ~(v53 - v54)) + 2;
    v57 = (v54 ^ -v53) + (v54 + (-v53 | ~v54)) * 2 + 2;
    v58 = ((v54 ^ 1) + ~v54 * 2 + ((v54 * 2 | v54 >> 63) & 2 & 3) & v53) * 2;
    v59 = v57 + (v58 | ~v57) + (v58 | v57) + 1;
    v60 = v56 + v59 + (0xffffffffffffffff ^ v59 * 2) + (v59 + (0xffffffffffffffff ^ v59 * 2) | ~v56) + (v56 & v59);
    v61 = v60 + 2;
    v0 = (v60 + 39182 ^ -(v61 | 39180)) + (v61 | 39180) + (v60 + 39182 & -(v61 | 39180)) * 2;
    v2 = (v61 | 0xfffffffffffffffe) + ((v61 ^ 26356) + (v60 + (0x7ffffffffffffffd - v60 | 26356)) * 2 + 6 & 0xfffffffffffffffe) + 1;
    v62 = v0;
    v63 = ((unsigned short)v2 | (unsigned short)~v62) + (unsigned short)v62;
    v64 = ((unsigned short)v2 ^ (unsigned short)v62) + v63 + 2;
    v65 = (v63 + 1 ^ v64) + (v63 + 1 & v64) * 2;
    v66 = v65 - (v65 - 1 | v52);
    g_f12124 = (unsigned int)(v66 - 2 - v52) + (((unsigned int)(1 - v66) & v52 + 1) + (v66 - 2 & v52 + 1)) * 2 - 1;
    v67 = v2;
    v68 = v0;
    v69 = v67 - v68 + (v67 + (0xffffffffffffffff ^ v67 * 2) + v68 & -(v67 + (0xffffffffffffffff ^ v67 * 2) | v68)) * 4 + (v67 + (0xffffffffffffffff ^ v67 * 2) + v68 ^ -(v67 + (0xffffffffffffffff ^ v67 * 2) | v68)) * 2 + (v67 - v68 & ~((v67 + (0xffffffffffffffff ^ v67 * 2) + v68 & -(v67 + (0xffffffffffffffff ^ v67 * 2) | v68)) * 4 + (v67 + (0xffffffffffffffff ^ v67 * 2) + v68 ^ -(v67 + (0xffffffffffffffff ^ v67 * 2) | v68)) * 2)) + ((v67 + (0xffffffffffffffff ^ v67 * 2) + v68 & -(v67 + (0xffffffffffffffff ^ v67 * 2) | v68)) * 4 + (v67 + (0xffffffffffffffff ^ v67 * 2) + v68 ^ -(v67 + (0xffffffffffffffff ^ v67 * 2) | v68)) * 2 | ~(v67 - v68));
    v70 = v69 + 1;
    v71 = v68 + v67;
    v72 = v71 + (0xffffffffffffffff ^ v68 * 2) + ~(v71 + (0xffffffffffffffff ^ v68 * 2) + (v68 | ~v67));
    v73 = v68 + (-v67 | ~v68) + (-v67 & ~v68);
    v74 = ((0xffffffffffffffff ^ v72 * 2) + v72 * 4 + 2 ^ v71 + v73 * 2 + 2) + ((0xffffffffffffffff ^ v72 * 2) + v72 * 4 + 2 & v71 + v73 * 2 + 2) * 2;
    v75 = v69 + 2;
    v76 = v75 + ~v70 * 2;
    v77 = v70 + v74 + (v76 + (1 - v74 | ~v76)) * 2 + 1;
    v78 = (v75 - v74 + (v74 + 0x7ffffffffffffffe & v76)) * 2 + 3;
    v79 = (v77 ^ v78) - 1;
    v80 = v79 + (v77 & v78) * 2;
    v0 = (v80 ^ 27) + (54 & v80 * 2) - 1;
    v2 = (v79 & 1) + (v80 | 1) + 21;
    v81 = (v0 + ~v0 * 2 ^ (char)~(v0 + ~v0 * 2 + 1 | v2)) + ((v0 + ~v0 * 2 + 1 | (char)v2) & (char)~(v0 + ~v0 * 2)) * 2;
    g_f12126 = v4 >> ((v81 | (char)v2 | v0) + (v81 & ((char)v2 | v0)) & 63);
    v82 = g_f046a0 + 1;
    v83 = v82 + ~g_f046a0 * 2 | g_f12120;
    g_f046a0 = (unsigned short)((v83 ^ (unsigned int)(0xfffe - g_f046a0)) + (g_f12120 | g_f046a0) - (v83 & v82) * 2) + 1;
    v84 = g_f046a2 - g_f12122 + (g_f12122 & g_f046a2) + (g_f12122 & ~g_f046a2) * 2;
    v85 = g_f12122 + g_f046a2;
    v86 = -(g_f12122 | g_f046a2);
    v87 = -((v85 ^ v86) + (v85 & v86) * 2);
    g_f046a2 = (v87 ^ v84) + (v87 & v84) * 2;
    v88 = g_f12124 | g_f046a4;
    v89 = -(g_f12124 & g_f046a4);
    g_f046a4 = g_f046a4 + g_f12124 + ((unsigned short)v88 + (v89 | (unsigned short)~v88) + (v89 & (unsigned short)~v88)) * 2 + 2;
    v90 = g_f046a6 + 1;
    v91 = v90 + ~g_f046a6 * 2 | g_f12126;
    g_f046a6 = (unsigned short)((v91 ^ (unsigned int)(0xfffe - g_f046a6)) + (g_f12126 | g_f046a6) - (v91 & v90) * 2) + 1;
    v92 = ~g_f046a8;
    v93 = g_f046a8 - v4 + (g_f046a8 & v4) + (v4 & ~g_f046a8) * 2;
    v94 = g_f046a8 + 1;
    v95 = ((v94 + v92 * 2 | v4) ^ v94) + ((v94 + v92 * 2 | v4) & v94) * 2;
    g_f046a8 = v95 + v93 + (v93 - (v95 + (v93 | -v95)) + (-v95 & ~v93)) * 2;
    return v70;
}
