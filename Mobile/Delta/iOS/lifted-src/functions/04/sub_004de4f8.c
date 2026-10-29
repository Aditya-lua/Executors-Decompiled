/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4de4f8..0x4dee00 (2312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4de4f8_0 {
    char field_0;
} st_4de4f8_0;

extern unsigned short g_f046f0;
extern unsigned short g_f046f2;
extern unsigned short g_f046f4;
extern unsigned short g_f046f6;
extern unsigned long long g_f046f8;
extern unsigned short g_f12148;
extern unsigned short g_f1214a;
extern unsigned short g_f1214c;
extern unsigned short g_f1214e;

unsigned int sub_4de4f8(void)
{
    unsigned long long v3;  // x8
    unsigned long long v4;  // x10
    unsigned long long v13;  // x10
    unsigned long long v14;  // x13
    unsigned long long v15;  // x14
    unsigned long v16;  // x14
    unsigned long long v17;  // x13
    unsigned int v18;  // w13
    unsigned int v19;  // w14
    unsigned short v20;  // x15
    unsigned long long v21;  // x13
    unsigned long long v22;  // x14
    unsigned long long v5;  // x12
    unsigned long long v23;  // x16
    unsigned long long v24;  // x0
    unsigned long long v25;  // x1
    unsigned long long v26;  // x2
    unsigned long long v27;  // x15
    unsigned long long v28;  // x13
    unsigned long long v29;  // x14
    unsigned long long v30;  // x16
    unsigned long long v31;  // x13
    unsigned long long v32;  // x14
    unsigned long long v6;  // x8
    unsigned long long v33;  // x16
    unsigned long long v34;  // x13
    unsigned int v35;  // w13
    unsigned long long v36;  // x14
    unsigned long v37;  // x15
    unsigned long long v38;  // x16
    unsigned long long v39;  // x15
    unsigned long long v40;  // x15
    unsigned long long v41;  // x15
    unsigned long long v42;  // x16
    unsigned long long v7;  // x11
    unsigned long long v43;  // x15
    unsigned int v44;  // w15
    unsigned int v45;  // w16
    unsigned int v46;  // w0
    unsigned int v47;  // w17
    unsigned int v48;  // w15
    unsigned long long v49;  // x15
    unsigned long long v50;  // x16
    unsigned long long v51;  // x2
    unsigned long long v52;  // x1
    unsigned long long v8;  // x8
    unsigned long long v53;  // x1
    unsigned long long v54;  // x15
    unsigned long long v55;  // x16
    unsigned long long v56;  // x12
    unsigned long long v57;  // x12
    unsigned short v58;  // x12
    unsigned long v59;  // x15
    unsigned long v60;  // x16
    unsigned long long v61;  // x17
    unsigned long long v62;  // x0
    st_4de4f8_0 *v9;  // x10
    unsigned long long v63;  // x1
    unsigned long long v64;  // x17
    unsigned long long v65;  // x1
    unsigned long v66;  // x15
    unsigned long long v67;  // x15
    unsigned long long v68;  // x16
    unsigned long long v69;  // x15
    unsigned short v70;  // x15
    unsigned int v71;  // w16
    unsigned short v72;  // x17
    st_4de4f8_0 **v10;  // x12
    unsigned short v73;  // x15
    unsigned long v74;  // x15
    unsigned long long v75;  // x16
    unsigned long long v76;  // x17
    unsigned long long v77;  // x17
    unsigned long long v78;  // x14
    unsigned long long v79;  // x14
    unsigned long long v80;  // x16
    unsigned int v81;  // w15
    unsigned int v82;  // w16
    unsigned long long v11;  // x15
    unsigned int v83;  // w17
    unsigned int v84;  // w10
    unsigned int v85;  // w13
    unsigned short v86;  // x15
    unsigned short v87;  // x13
    unsigned short v88;  // x10
    unsigned short v89;  // x11
    unsigned short v90;  // x12
    unsigned short v91;  // x10
    unsigned int v92;  // w12
    unsigned long long v12;  // x10
    unsigned int v93;  // w10
    unsigned int v94;  // w11
    unsigned long long v95;  // x11
    unsigned long long v96;  // x8
    st_4de4f8_0 **v1;  // [bp-0x10], Other Possible Types: char, unsigned long long
    st_4de4f8_0 *v2;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v2 = &v1;
    v1 = &v2;
    v3 = 0xff51afd7ed558ccd * ((char *)&g_f046f0 + ~(~&g_f046f0 + &g_f046f0));
    v4 = v3 >> 29;
    v5 = v3 | v4;
    v6 = ~v3 - (v4 | ~v3);
    v7 = v5 ^ v6;
    v8 = v7 + (v5 & v6) * 2;
    v9 = v2;
    v10 = v1;
    v11 = v10 + v9;
    v12 = v11 + ~v9 * 2 + (((v10 | v9) & -v10) * 4 + ((v10 | v9) ^ -v10) * 2 | 0xfffffffffffffffd - (v11 + ~v9 * 2)) + (((v10 | v9) & -v10) * 4 + ((v10 | v9) ^ -v10) * 2 | v11 + ~v9 * 2 + 2) + 3;
    v13 = (v12 * 2 | v12 >> 63) & 2 & 3;
    v14 = ((v12 ^ 1) + ~v12 * 2 + v13 + 1 ^ v11 + ((v10 & ~v9) + (char *)~v10) * 2 + 2) + ((v12 ^ 1) + ~v12 * 2 + v13 + 1 & v11 + ((v10 & ~v9) + (char *)~v10) * 2 + 2) * 2;
    v15 = v14 & 33307;
    v16 = v14 + v15 + 0xffffffffffff7de5 + ((0xffffffff ^ (unsigned int)v14 * 2) & 66614);
    v17 = ((v14 | 32228) + 1 ^ v14 & 32228) + ((v14 | 32228) + 1 & v14 & 32228) * 2;
    v1 = (v14 ^ 0xffffffffffff7de4) + v14 + (v15 ^ 33307) + (0xfffffffffffffffe - ((v14 ^ 0xffffffffffff7de4) + v14 + (v15 ^ 33307)) | v16) + ((v14 ^ 0xffffffffffff7de4) + v14 + (v15 ^ 33307) + 1 | v16) + 2;
    v2 = ~v17 + v17 * 2;
    v18 = v1;
    v19 = v2;
    v20 = (unsigned short)(v19 - v18) + ((unsigned short)v18 | (unsigned short)~v19);
    g_f12148 = ((unsigned short)v18 + 1 + (unsigned short)v19 + (unsigned short)~(v19 | v18) + ((unsigned short)v19 ^ (unsigned short)v18) + (v20 ^ (unsigned short)v18 + 1) + (v20 & (unsigned short)v18 + 1) * 2 | ((unsigned short)v8 ^ 1) + (((unsigned short)v7 & 1) + (unsigned short)~v8) * 2) + (unsigned short)v8 + 1;
    v21 = v2;
    v22 = v1;
    v23 = -v21;
    v24 = ~v22;
    v25 = v22 + 1;
    v26 = v21 + 1;
    v27 = (v26 + v24 * 2 + v25 | ((v22 | v21) & v23) * 4 + ((v22 | v21) ^ v23) * 2) + (((v22 | v21) & v23) * 4 + ((v22 | v21) ^ v23) * 2 & v26 + v24 * 2 + v25);
    v28 = v26 + v22 + (v21 + v24 + (v22 & ~v21)) * 2 + (v25 + (v23 | ~v22) + (v23 & ~v22)) * 2;
    v29 = v28 + 1;
    v30 = (v27 ^ v29) + (~v28 - v27 + (v27 & v28) + (v27 & v29)) * 2;
    v31 = v30 + (~(v27 - v29) - (v28 | ~v27) & v27 - v29) * 4 + (~(v27 - v29) - (v28 | ~v27) ^ v27 - v29) * 2 + ((~(v27 - v29) - (v28 | ~v27) & v27 - v29) * 4 + (~(v27 - v29) - (v28 | ~v27) ^ v27 - v29) * 2 | ~v30) + (v30 & ~((~(v27 - v29) - (v28 | ~v27) & v27 - v29) * 4 + (~(v27 - v29) - (v28 | ~v27) ^ v27 - v29) * 2));
    v32 = v31 + 1;
    v33 = ~v32;
    v34 = v31 + 2;
    v1 = (v32 ^ 12) + (v34 + (v33 | 12)) * 2 - 1;
    v2 = v32 + (v34 + (v33 | 6)) * 2 + ((0xffffffff ^ (unsigned int)v32 * 2) & 12) - 7;
    v35 = v8 >> ((char)v2 + v1 & 63);
    v36 = v2;
    v37 = v1;
    v38 = v36 - v37 + (v36 + ~v36 * 2 + 1 & v37) * 2;
    v39 = (-((v37 + v36 ^ -(v37 | v36)) + (v37 + v36 & -(v37 | v36)) * 2) ^ (v37 | v36)) + (-((v37 + v36 ^ -(v37 | v36)) + (v37 + v36 & -(v37 | v36)) * 2) & (v37 | v36)) * 2;
    v40 = v38 + (v39 | ~v38) + v39 + (0xffffffffffffffff ^ v39 * 2) + (v39 + (0xffffffffffffffff ^ v39 * 2) & v38) + 1;
    v41 = (v40 * 2 & 4) + (v40 ^ 2);
    v42 = ~v41 + v41 * 2;
    v43 = ((unsigned int)v41 - 1 | 0xffffffffffff4d9e) - v41 + v42;
    v1 = v42 + 19870;
    v2 = v43 + (0xffffffffffff4d9c - v43 | v42 | 45665) + (v43 + 45667 | v42 | 45665) + 45668;
    v44 = v1;
    v45 = v2;
    v46 = v44 + 1;
    v47 = (v46 + ~v44 * 2 | v45) + v46;
    v48 = (v45 | ~v44) - v45 + v46 * 2 + (v45 & ~v44) * 2;
    g_f1214a = (((unsigned short)v48 ^ (unsigned short)v47) + ((unsigned short)v48 & (unsigned short)v47) * 2 ^ (unsigned short)v35) + (((unsigned short)v48 ^ (unsigned short)v47) + ((unsigned short)v48 & (unsigned short)v47) * 2 & (unsigned short)v35) * 2 + (unsigned short)~(v35 - (~((v48 ^ v47) + (v48 & v47) * 2) + ((v48 ^ v47) + (v48 & v47) * 2) * 2) + (~((v48 ^ v47) + (v48 & v47) * 2) + ((v48 ^ v47) + (v48 & v47) * 2) * 2 & v35) + (~((v48 ^ v47) + (v48 & v47) * 2) + ((v48 ^ v47) + (v48 & v47) * 2) * 2 & ~v35) * 2);
    v49 = v2;
    v50 = v1;
    v51 = v49 + 1;
    v52 = v51 + ~v49 * 2 | v50;
    v53 = -((v52 ^ v51) + (v52 & v51) * 2);
    v54 = (v50 - v49 - (v50 | ~v49) & v49 + ~v50) * 4 + (v50 - v49 - (v50 | ~v49) ^ v49 + ~v50) * 2 + v49 + ~v50 - ((v50 - v49 - (v50 | ~v49) & v49 + ~v50) * 4 + (v50 - v49 - (v50 | ~v49) ^ v49 + ~v50) * 2) * 2 + (v53 ^ (v49 | v50)) + (v53 & (v49 | v50)) * 2;
    v55 = v54 + 1;
    v56 = ((0xfffffffffffffffe - v54 | 24) ^ v54 + 2) + ((0xfffffffffffffffe - v54 | 24) & v54 + 2) * 2;
    v1 = (v56 ^ (v55 & 24) - (v55 ^ 0xffffffffffffffe7)) + (v56 & (v55 & 24) - (v55 ^ 0xffffffffffffffe7)) * 2 - 1;
    v2 = (v55 | 1) + (v55 & 1) + 7;
    v57 = (v1 + (v2 | ~v1) + (v2 ^ v1) + 2 ^ v2 & v1) + (v1 + (v2 | ~v1) + (v2 ^ v1) + 2 & v2 & v1) * 2;
    v58 = v8 >> ((char)~v57 + (char)v57 * 2 & 63);
    v59 = v2;
    v60 = v1;
    v61 = ((v59 ^ 1) + ~v59 * 2 + ((v59 * 2 | v59 >> 63) & 2 & 3) | ~v60) + v60;
    v62 = v59 + (-v60 | ~v59) + (-v60 & ~v59);
    v63 = v60 + v59;
    v64 = (v61 * 2 + 3 ^ v63 + v62 * 2 + 2) + (v61 * 2 + 3 & v63 + v62 * 2 + 2) * 2;
    v65 = v63 + (0xffffffffffffffff ^ v60 * 2) + ~(v63 + (0xffffffffffffffff ^ v60 * 2) + (v60 | ~v59));
    v66 = v60 - v59 + v65 * 4 - v65 * 2 + (0xffffffffffffffff ^ (v60 - v59 + v65 * 4 - v65 * 2) * 2);
    v67 = (v66 | -v64) + v64 + (~v64 + v64 * 2 | v66);
    v68 = v67 + 1;
    v69 = v67 + ((0xffffffff ^ (unsigned int)v68 * 2) & 82322) + (v67 + (0x7ffffffffffffffe - v67 | 41161)) * 2 + 0xffffffffffff5f3c;
    v1 = ~v69 + v69 * 2;
    v2 = (v68 | 1) + (v68 & 1) + 24374;
    v70 = v1;
    v71 = v2;
    v72 = (unsigned short)(v71 - v70) + (v70 | (unsigned short)~v71);
    v73 = (v70 | (unsigned short)v71) + (v72 ^ v70 + 1) + (v72 & v70 + 1) * 2;
    g_f1214c = v73 + v58 - (v73 | v58);
    v74 = v2;
    v75 = v1;
    v76 = ((v74 ^ 1) + ~v74 * 2 + ((v74 * 2 | v74 >> 63) & 2 & 3) & v75) * 2;
    v77 = v74 - v75 + (v76 | ~(v74 - v75)) + (v76 | v74 - v75) + 1;
    v78 = v75 - v74 + ~((v75 + (0xffffffffffffffff ^ v75 * 2) + v74 & -(v75 + (0xffffffffffffffff ^ v75 * 2) | v74)) * 4 + (v75 + (0xffffffffffffffff ^ v75 * 2) + v74 ^ -(v75 + (0xffffffffffffffff ^ v75 * 2) | v74)) * 2) + ((v75 + (0xffffffffffffffff ^ v75 * 2) + v74 & -(v75 + (0xffffffffffffffff ^ v75 * 2) | v74)) * 4 + (v75 + (0xffffffffffffffff ^ v75 * 2) + v74 ^ -(v75 + (0xffffffffffffffff ^ v75 * 2) | v74)) * 2) * 2;
    v79 = ((v78 + 1 ^ v77) + (v78 + 1 & v77 | ~v78 & ~v77) * 2 | (~v78 + v77 & -(v77 | ~v78)) * 4 + (~v78 + v77 ^ -(v77 | ~v78)) * 2) + ((v78 + 1 ^ v77) + (v78 + 1 & v77 | ~v78 & ~v77) * 2 & (~v78 + v77 & -(v77 | ~v78)) * 4 + (~v78 + v77 ^ -(v77 | ~v78)) * 2);
    v80 = (v79 & 0xffffffffffffffd8 ^ 0xffffffffffffffd9 ^ v79 + 39) + ((v79 & 0xffffffffffffffd8 ^ 0xffffffffffffffd9) & v79 + 39) * 2;
    v1 = v79 + 9;
    v2 = v80 + (v79 | 39 | ~v80) + (v80 | v79 | 39) + 1;
    g_f1214e = v8 >> ((char)v2 + (char)v1 & 63);
    v81 = g_f046f0;
    v82 = g_f12148 & ~v81;
    v83 = -g_f12148;
    v84 = v81 + g_f12148 + v82 * 4 + (0xffffffff ^ v82 * 2) + (v83 & ~v81) * 2 + (v81 + (v83 | ~v81)) * 2 + 4;
    g_f046f0 = (unsigned short)~v84 + (unsigned short)v84 * 2;
    v85 = (g_f046f2 ^ 1) + ~g_f046f2 * 2 + (__ROL__(g_f046f2, 1) & 2 & 3);
    v86 = (unsigned short)v85 + g_f1214a;
    v87 = -(v85 | g_f1214a);
    v88 = g_f046f2 - g_f1214a;
    v89 = (v86 & v87) * 4 + (v86 ^ v87) * 2 | 1;
    g_f046f2 = (v89 ^ v88) + (v89 & v88) * 2 - 1;
    v90 = g_f046f4 + (g_f1214c | ~g_f046f4) + (g_f1214c ^ g_f046f4);
    v91 = -(g_f1214c & g_f046f4);
    g_f046f4 = (v90 + 1 ^ v91) + (v90 + ((unsigned short)(0xfffffffe - v90) | v91)) * 2 + 4;
    v92 = -g_f1214e;
    v93 = g_f1214e + g_f046f6 + (v92 & ~g_f046f6) * 2 + (unsigned int)(g_f046f6 - g_f1214e - (v92 | g_f046f6)) * 2;
    v94 = (g_f046f6 + ~g_f046f6 * 2 + 1 & g_f1214e) * 2;
    g_f046f6 = (unsigned short)v93 + (unsigned short)v94 + ((unsigned short)v93 & (unsigned short)~v94) + ((unsigned short)v94 | (unsigned short)~v93) + 1;
    v95 = (~g_f046f8 & ~v8) + (v8 | g_f046f8) * 2 + 1;
    v96 = g_f046f8 & v8;
    g_f046f8 = (v95 ^ -v96) + (v95 - v96 - (v95 | -v96)) * 2;
    return v83 & ~v81;
}
