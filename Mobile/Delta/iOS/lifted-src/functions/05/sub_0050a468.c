/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x50a468..0x50acf0 (2184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_50a468_0 {
    char field_0;
} st_50a468_0;

extern unsigned short g_f044e0;
extern unsigned short g_f044e2;
extern unsigned short g_f044e4;
extern unsigned short g_f044e6;
extern unsigned long long g_f044e8;
extern unsigned short g_f12040;
extern unsigned short g_f12042;
extern unsigned short g_f12044;
extern unsigned short g_f12046;

int sub_50a468(void)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x10
    unsigned long long v12;  // x16
    unsigned long long v13;  // x11
    unsigned long long v14;  // x12
    unsigned long long v15;  // x11
    unsigned long long v16;  // x13
    unsigned int v17;  // w11
    unsigned short v18;  // x10
    unsigned long long v19;  // x11
    unsigned long v20;  // x12
    unsigned long long v21;  // x13
    unsigned long long v4;  // x11
    unsigned long long v22;  // x0
    unsigned long long v23;  // x11
    unsigned long long v24;  // x11
    unsigned long long v25;  // x13
    unsigned long long v26;  // x13
    unsigned long long v27;  // x13
    unsigned long long v28;  // x11
    unsigned int v29;  // w12
    unsigned long long v30;  // x11
    unsigned long v31;  // x13
    unsigned long long v5;  // x8
    unsigned long long v32;  // x16
    unsigned long long v33;  // x17
    unsigned long long v34;  // x15
    unsigned long long v35;  // x15
    unsigned long long v36;  // x0
    unsigned long v37;  // x16
    unsigned long long v38;  // x11
    unsigned long long v39;  // x14
    unsigned long long v40;  // x0
    unsigned long long v41;  // x11
    unsigned long long v6;  // x10
    unsigned long long v42;  // x14
    unsigned long long v43;  // x15
    unsigned long long v44;  // x17
    unsigned long v45;  // x16
    unsigned int v46;  // w14
    unsigned int v47;  // w15
    unsigned long long v48;  // x14
    unsigned long long v49;  // x15
    unsigned long long v50;  // x0
    unsigned long long v51;  // x16
    unsigned long long v7;  // x8
    unsigned long long v52;  // x14
    unsigned long long v53;  // x14
    unsigned long long v54;  // x15
    unsigned long long v55;  // x14
    unsigned short v56;  // x14
    unsigned long long v57;  // x17
    unsigned long long v58;  // x15
    unsigned long long v59;  // x16
    unsigned long long v60;  // x15
    unsigned long long v61;  // x15
    st_50a468_0 *v8;  // x11
    unsigned long long v62;  // x15
    unsigned long long v63;  // x13
    unsigned long long v64;  // x15
    unsigned long long v65;  // x13
    unsigned int v66;  // w13
    unsigned short v67;  // x17
    unsigned short v68;  // x16
    unsigned long long v69;  // x14
    unsigned long long v70;  // x15
    unsigned long long v71;  // x0
    st_50a468_0 **v9;  // x12
    unsigned long long v72;  // x16
    unsigned long long v73;  // x14
    unsigned long long v74;  // x14
    unsigned long long v75;  // x14
    unsigned long long v76;  // x15
    unsigned int v77;  // w16
    unsigned int v78;  // w10
    unsigned int v79;  // w13
    unsigned int v80;  // w14
    unsigned int v81;  // w13
    unsigned long long v10;  // x14
    unsigned short v82;  // x10
    unsigned short v83;  // x11
    unsigned long v84;  // x13
    unsigned long long v85;  // x8
    unsigned long long v11;  // x16
    st_50a468_0 **v0;  // [bp-0x10], Other Possible Types: unsigned long long, char
    st_50a468_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v1 = &v0;
    v0 = &v1;
    v2 = 0xff51afd7ed558ccd * ((char *)&g_f044e0 + ~(~&g_f044e0 + &g_f044e0));
    v3 = v2 >> 29;
    v4 = v2 | v3;
    v5 = ~v2 - (v3 | ~v2);
    v6 = v4 ^ v5;
    v7 = v6 + (v4 & v5) * 2;
    v8 = v1;
    v9 = v0;
    v10 = v9 | v8;
    v11 = &v8[v9 | ~v8];
    v12 = v10 + v11 + (~v11 & ~v10) * 2;
    v13 = &v8[(char *)v8 + 0x2 * ~v8 + 1 & v9];
    v14 = (v9 + v8 ^ -v10) + (v9 + v8 & -v10) * 2;
    v15 = ((v14 - v13 + (v13 | -v14)) * 2 - (v14 + v13 + (-v14 & ~v13) * 2) ^ v12 + (v10 & ~v11) * 2 + 1) + ((v14 - v13 + (v13 | -v14)) * 2 - (v14 + v13 + (-v14 & ~v13) * 2) & v12 + (v10 & ~v11) * 2 + 1) * 2;
    v16 = v15 + (v15 & 51568) - (0xfffffffffffe6d1f | v15 * 2) + 0xffffffffffff3690;
    v0 = ((v15 | 0xffffffffffff368f) + 51569 ^ v16) + ((v15 | 0xffffffffffff368f) + 51569 & v16) * 2 - 1;
    v1 = v15 + (v15 | 13967) + (0xffffffffffffc970 & ~v15) + 13968;
    v17 = ((unsigned int)v1 + 1 ^ v0) + ((unsigned int)v1 + 1 & v0) * 2;
    v18 = (unsigned short)~(v17 + (__ROL__((unsigned int)v6, 1) & 2 & 3) + (-v17 | (unsigned int)v7)) + (unsigned short)v7 + ((unsigned short)v7 ^ 0xfffe) + 4;
    g_f12040 = (v18 | 0xfffe) + (v18 + ((unsigned short)(v17 - 1) & (unsigned short)v7) * 2 | 1);
    v19 = v1;
    v20 = v0;
    v21 = v19 + (v20 | ~v19) + (v20 ^ v19) + 1;
    v22 = v20 | v19;
    v23 = -((v20 + v19 ^ -v22) + (v20 + v19 & -v22) * 2);
    v24 = v21 + (v20 & v19) - (v23 ^ v22) + (~v22 - (v23 | ~v22)) * 2 + (v21 - ((v20 & v19) + (v21 | -(v20 & v19))) + (-(v20 & v19) & ~v21)) * 2;
    v25 = v24 * 2;
    v26 = v24 + ~v24 * 2 + 1;
    v27 = v24 + v26 + (~(unsigned int)v26 | 0xfffffffffffffff8);
    v28 = v24 + (v24 & 7) + (~(unsigned int)v25 & 14) - 7;
    v0 = (v24 ^ 10) + (v25 & 20) - 1;
    v1 = v27 + (0xfffffffffffffff6 - v27 | v28) + (v27 + 9 | v28) + 10;
    v29 = v7 >> ((char)~((v1 + 1 ^ v0) + (v1 + 1 & v0) * 2) + (((char)v1 + 1 ^ v0) + ((char)v1 + 1 & v0) * 2) * 2 & 63);
    v30 = v1;
    v31 = v0;
    v32 = v30 - v31 + (v31 & v30) + (v31 & ~v30) * 2;
    v33 = v30 + 1;
    v34 = v33 + ~v30 * 2 | v31;
    v35 = -((v34 ^ v33) + (v34 & v33) * 2);
    v36 = (v35 & v32) * 2;
    v37 = v36 + (v35 ^ v32);
    v38 = (v31 ^ -v30) + ((v31 | v30) ^ -v31) * 2 + ((v31 | v30) & -v31) * 4 + (v31 + (-v30 | ~v31)) * 2;
    v39 = v38 + 2;
    v40 = v37 - v39;
    v41 = ((v35 ^ ~v32) - v36 | v38 + 1) + v40;
    v42 = (((v40 & ~v41) * 4 + (v41 ^ ~v40) * 2 | 1) ^ (v41 + 1 ^ v39 - v37 + (v37 | 0xfffffffffffffffe - v38)) + (v41 + 1 & v39 - v37 + (v37 | 0xfffffffffffffffe - v38)) * 2) + (((v40 & ~v41) * 4 + (v41 ^ ~v40) * 2 | 1) & (v41 + 1 ^ v39 - v37 + (v37 | 0xfffffffffffffffe - v38)) + (v41 + 1 & v39 - v37 + (v37 | 0xfffffffffffffffe - v38)) * 2) * 2;
    v43 = ~v42 + v42 * 2;
    v44 = (v43 + 39050 ^ -(v43 | 39050)) + (v43 + 39050 & -(v43 | 39050)) * 2;
    v45 = v43 + (v43 & 39050) + ((0xffffffff ^ (unsigned int)v43 * 2) & 78100);
    v0 = v45 + v44 + (v44 & 39049 - v45) + (v45 + 0xffffffffffff6776 | ~v44) + 0xffffffffffff6777;
    v1 = (v43 | 1) + (1 & ~v42) + 26484;
    v46 = ((unsigned int)v1 + (unsigned int)v0 ^ -((unsigned int)v1 | (unsigned int)v0)) + ((unsigned int)v1 | (unsigned int)v0) + ((unsigned int)v1 + (unsigned int)v0 & -((unsigned int)v1 | (unsigned int)v0)) * 2;
    v47 = (v46 + 1 ^ v29) + (v46 + 1 & v29) * 2;
    g_f12042 = ((unsigned short)(v47 - 1) ^ (unsigned short)-(v46 | v29)) + (((unsigned short)-v47 | (unsigned short)-(v46 | v29)) + (unsigned short)v47) * 2;
    v48 = v1;
    v49 = v0;
    v50 = v49 | v48;
    v51 = (v49 + ~v49 * 2 + 1 & v48) + v49 + (v50 - 1 ^ v49 + v48) - (v49 + v48 & -v50) * 2;
    v52 = ((v49 & ~v48) - v49 ^ v50) + ((v49 & ~v48) - v49 & v50) * 2;
    v53 = (((v51 + 1 | v52 + 0x7fffffffffffffff) - (v52 + 1)) * 2 + 5 ^ v51 + v52 + 1 + ((v51 + 1 & v52 + 0x7fffffffffffffff) - (v51 + v52 + 1)) * 2) + (((v51 + 1 | v52 + 0x7fffffffffffffff) - (v52 + 1)) * 2 + 5 & v51 + v52 + 1 + ((v51 + 1 & v52 + 0x7fffffffffffffff) - (v51 + v52 + 1)) * 2) * 2;
    v54 = v53 - 1;
    v0 = (v54 ^ 24) + ((-v53 | 24) + v53) * 2 - 1;
    v1 = (v54 | 1) + (v54 & 1) + 8;
    v55 = v0 + ~v1 + v1 * 2 + 2;
    v56 = v7 >> ((char)~v55 + (char)v55 * 2 & 63);
    v57 = v0 | v1;
    v58 = v0 + v1;
    v59 = v58 + (v57 - v58) * 2;
    v60 = (v58 ^ -v57) + (v58 & -v57) * 2;
    v61 = v60 + v57 + (-v60 & ~v57) * 2 + (v57 + (-v60 | ~v57)) * 2;
    v62 = (v61 + 2 + ~(v61 + 2) * 2 + 2 | ~v59) + v59;
    v63 = (v62 * 2 + 3 ^ v59 ^ 0xfffffffffffffffe - v61) + (v62 * 2 + 3 & (v59 ^ 0xfffffffffffffffe - v61)) * 2;
    v64 = ~v63;
    v65 = v64 + v63 * 2;
    v0 = v65 + (v65 | 6678) + (0xffffffffffffe5e9 & ~v65) + 6679;
    v1 = (v64 | 0xfffffffffffffffe) + 58859 + (v65 & 0xfffffffffffffffe);
    v66 = v0;
    v67 = (unsigned short)v66 + 1;
    v68 = v67 + (unsigned short)~v66 * 2 | (unsigned short)v1;
    g_f12044 = (((v68 ^ v67) + (v68 & v67) * 2 | (unsigned short)v66 | (unsigned short)v1) + ((v68 ^ v67) + (v68 & v67) * 2 & ((unsigned short)v66 | (unsigned short)v1)) | v56 + (0xffff ^ v56 * 2)) + v56 + 1;
    v69 = v1;
    v70 = v0;
    v71 = v70 | v69;
    v72 = v70 + v69 - (v70 + v69 & -v71) * 2 + (v71 - 1 ^ v70 + v69) + (v70 + ~v70 * 2 + 1 | ~v69) + 2;
    v73 = (v71 - (v70 & v69) ^ 1) + ~(v71 - (v70 & v69)) * 2 + (((v71 - (v70 & v69)) * 2 | v71 - (v70 & v69) >> 63) & 2 & 3) + 1;
    v74 = (v73 ^ v72) + (v73 & v72) * 2 - 1;
    v75 = (v74 * 2 & 4) + (v74 ^ 2);
    v76 = v75 - 1;
    v0 = v75 + (92 & v76 * 2) + (92 & v76 * 2 ^ 92) - 48;
    v1 = (v75 + 1 | 1) + (v76 & 1);
    g_f12046 = v7 >> ((char)v1 + (char)v0 & 63);
    v77 = g_f12040 | g_f044e0;
    v78 = (g_f12040 + g_f044e0 ^ -v77) + (g_f12040 + g_f044e0 & -v77) * 2;
    g_f044e0 = (unsigned short)v77 + (unsigned short)v78 + ((unsigned short)(v77 - v78 - (v77 | -v78 & 0xffff)) + ((unsigned short)-v78 & (unsigned short)~v77)) * 2;
    g_f044e2 = g_f044e2 + (g_f12042 | ~g_f044e2) + (g_f12042 ^ g_f044e2) + (unsigned short)~(g_f12042 & g_f044e2) + 2;
    v79 = g_f044e4 + ~g_f044e4 * 2 + 1;
    v80 = v79 + g_f12044;
    v81 = -(v79 | g_f12044);
    g_f044e4 = g_f044e4 - g_f12044 + (unsigned short)~((v80 & v81) * 4 + (v80 ^ v81) * 2) + (((unsigned short)v80 & (unsigned short)v81) * 4 + ((unsigned short)v80 ^ (unsigned short)v81) * 2) * 2 + 1;
    v82 = g_f044e6 - g_f12046;
    v83 = ((0xffff ^ g_f044e6 * 2) + g_f044e6 & g_f12046) * 2;
    g_f044e6 = (v82 | v83) + (v83 & v82);
    v84 = g_f044e8 + v7;
    v85 = g_f044e8 | v7;
    g_f044e8 = g_f044e8 + (v7 | ~g_f044e8) + (g_f044e8 ^ v7) - (v84 & -v85) * 2 + (v85 - 1 ^ v84) + 2;
    return v77 - v78;
}
