/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4dc574..0x4dcdcc (2136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4dc574_0 {
    char field_0;
} st_4dc574_0;

extern unsigned short g_f044a0;
extern unsigned short g_f044a2;
extern unsigned short g_f044a4;
extern unsigned short g_f044a6;
extern unsigned long long g_f044a8;
extern unsigned short g_f12020;
extern unsigned short g_f12022;
extern unsigned short g_f12024;
extern unsigned short g_f12026;

long long sub_4dc574(void)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x8
    unsigned long long v12;  // x0
    unsigned long long v13;  // x16
    unsigned long long v14;  // x17
    unsigned long long v15;  // x13
    unsigned long long v16;  // x15
    unsigned long long v17;  // x13
    unsigned long v18;  // x14
    unsigned long long v19;  // x13
    unsigned int v20;  // w13
    unsigned long long v21;  // x14
    st_4dc574_0 *v4;  // x10
    unsigned long v22;  // x16
    unsigned long long v23;  // x0
    unsigned long long v24;  // x2
    unsigned long long v25;  // x17
    unsigned long long v26;  // x0
    unsigned long long v27;  // x1
    unsigned long long v28;  // x14
    unsigned long long v29;  // x16
    unsigned long long v30;  // x15
    unsigned long long v31;  // x16
    unsigned long long v5;  // x12
    unsigned long long v32;  // x15
    unsigned long long v33;  // x16
    unsigned long long v34;  // x15
    unsigned long long v35;  // x15
    unsigned long v36;  // x15
    unsigned long long v37;  // x16
    unsigned long long v38;  // x17
    unsigned int v39;  // w15
    unsigned long long v40;  // x16
    unsigned long long v41;  // x17
    unsigned long long v6;  // x11
    unsigned long long v42;  // x0
    unsigned long long v43;  // x1
    unsigned long long v44;  // x16
    unsigned long long v45;  // x17
    unsigned long long v46;  // x1
    unsigned long long v47;  // x16
    unsigned long long v48;  // x17
    unsigned long long v49;  // x1
    unsigned long long v50;  // x16
    unsigned long long v51;  // x1
    unsigned long long v7;  // x13
    unsigned long long v52;  // x17
    unsigned int v53;  // w17
    unsigned long v54;  // x16
    unsigned long v55;  // x17
    unsigned long long v56;  // x0
    unsigned long long v57;  // x1
    unsigned long long v58;  // x3
    unsigned long long v59;  // x1
    unsigned long v60;  // x4
    unsigned long long v61;  // x1
    unsigned long long v8;  // x14
    unsigned long long v62;  // x16
    unsigned long long v63;  // x16
    unsigned long long v64;  // x0
    unsigned long long v65;  // x14
    unsigned long long v66;  // x14
    unsigned long long v67;  // x12
    unsigned int v68;  // w12
    unsigned int v69;  // w11
    unsigned int v70;  // w16
    unsigned int v71;  // w11
    unsigned long long v9;  // x13
    unsigned int v72;  // w10
    unsigned int v73;  // w13
    unsigned int v74;  // w11
    unsigned int v75;  // w10
    unsigned short v76;  // x12
    unsigned short v77;  // x13
    unsigned long long v78;  // x11
    unsigned long long v79;  // x8
    unsigned long long v10;  // x14
    unsigned long long v11;  // x15
    st_4dc574_0 **v0;  // [bp-0x10], Other Possible Types: char, unsigned long long
    st_4dc574_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v1 = &v0;
    v0 = &v1;
    v2 = 0xff51afd7ed558ccd * ((char *)&g_f044a0 + ~(~&g_f044a0 + &g_f044a0));
    v3 = ((v2 | v2 >> 29) ^ ~v2 - (v2 >> 29 | ~v2)) + ((v2 | v2 >> 29) & ~v2 - (v2 >> 29 | ~v2)) * 2;
    v4 = v1;
    v5 = (v4 ^ 1) + ~v4 * 2 + ((v4 * 2 | v4 >> 63) & 2 & 3);
    v6 = v5 + (v0 & v4) - (char *)v0 + (v0 | ~v5) + 1;
    v7 = v6 * 2;
    v8 = 1 | (v6 * 2 | v6 >> 63) & 0xfffffffffffffffe;
    v0 = v7 + ((-v8 | 29016) + v8) * 2 + ((0xffffffff ^ (unsigned int)v6 * 4) & 58032) + 0xffffffffffff8ea7;
    v1 = v7 + 36520;
    g_f12020 = ((unsigned short)v1 + (unsigned short)v0 | (unsigned short)v3 + (unsigned short)~(unsigned int)v3 * 2 + 1) + (unsigned short)v3 + 1;
    v9 = v1;
    v10 = -v9;
    v11 = v0;
    v12 = ~v11 * 2;
    v13 = v9 + v11 + v12 + ((v11 | v9) ^ v10) * 2 + ((v11 | v9) & v10) * 4 + 2;
    v14 = ((v11 * 2 | v11 >> 63) & 2 & 3) + (v11 ^ 1) + v12;
    v15 = (v11 ^ v10) + (v11 - (v9 + (v11 | v10))) * 2;
    v16 = ((v9 | ~v14) & v14 + 1) * 4 + ((v9 | ~v14) ^ v14 + 1) * 2;
    v17 = -(v15 + 1 + (v16 | ~v15) + v15 + 1 + v16 + (~v16 | ~v15));
    v18 = v13 ^ v17;
    v19 = v18 + (v13 & v17) * 2;
    v0 = (v18 | 0xfffffffffffffffe) + (v19 & 0xfffffffffffffffe) + 9;
    v1 = v19 + 9;
    v20 = v3 >> (((char)v1 + v0 ^ (char)-(v1 | v0)) + ((char)v1 | v0) + ((char)v1 + v0 & (char)-(v1 | v0)) * 2 & 63);
    v21 = v1;
    v22 = v0;
    v23 = v21 + ~v21 * 2 + 1 & v22;
    v24 = v23 * 2;
    v25 = (v21 ^ -v22) + (v21 - (v22 + (v21 | -v22))) * 2 + v23 * 4;
    v26 = v25 + ~v24;
    v27 = v26 + 2;
    v28 = (v22 ^ -v21) + ((v21 | ~(v22 + ~v22 * 2 + 1)) & v22 + ~v22 * 2 + 2) * 4 + (v22 - (v21 + (v22 | -v21)) + ((v21 | ~(v22 + ~v22 * 2 + 1)) ^ v22 + ~v22 * 2 + 2)) * 2;
    v29 = -(v27 + (-v28 | 0xfffffffffffffffe - v26));
    v30 = ((v28 - 1 & v25 - v24) - (v28 + 1) + 1 ^ v29) + (v27 - (v28 + 1) & ~((v28 - 1 & v25 - v24) - (v28 + 1))) * 4 + (((v28 - 1 & v25 - v24) - (v28 + 1) + 1 & v29) + ((v28 - 1 & v25 - v24) - (v28 + 1) ^ ~(v27 - (v28 + 1)))) * 2;
    v31 = v30 + ~v30 * 2 + 1;
    v0 = (9371 | ~v30) + v30 * 2 + v31 - (v31 & 0xffffffffffffdb64) + 1;
    v1 = v30 + 56164;
    g_f12022 = -(-((unsigned int)v1 + 1 ^ (unsigned int)v0) + 0xfffe * ((unsigned int)v1 + 1 & (unsigned int)v0) & v20) - (v20 - v20 * 2);
    v32 = v1;
    v33 = v0;
    v34 = (v33 | v32) + (v33 + 1 ^ (v32 | ~v33)) + (v33 + 1 & (v32 | ~v33)) * 2 + ~((v33 + 1 ^ (v32 | ~v33)) + (v33 + 1 & (v32 | ~v33)) * 2) * 2;
    v35 = (v33 ^ v32) - v34 * 2 + (v34 + 2 ^ 1) + (((v34 + 2) * 2 | v34 + 2 >> 63) & 2 & 3) - 6;
    v36 = (v35 * 2 & 4) + (v35 ^ 2);
    v37 = ~v36 + v36 * 2;
    v38 = (v37 | 1) + (1 & ~v36) + 10;
    v0 = ~v38 + v38 * 2;
    v1 = v37 + ((-v36 | 23) + v36) * 2 + ((0xffffffff ^ (unsigned int)v37 * 2) & 46) - 24;
    v39 = v3 >> ((char)v1 + (char)v0 & 63);
    v40 = v1;
    v41 = v0;
    v42 = (v40 ^ -v41) + (v40 - (v40 | -v41) + v40 * 3 + ~v40 * 4 + (0x7ffffffffffffffc - (v40 * 3 + ~v40 * 4) & ~v41)) * 2 + 8;
    v43 = (v41 ^ 1) + ~v41 * 2 + ((v41 * 2 | v41 >> 63) & 2 & 3) & v40;
    v44 = ((0xffffffffffffffff ^ v43 * 2) + v43 * 4 + 2 ^ (v41 ^ -v40) + (v41 + (-v40 | ~v41)) * 2 + 2) + ((0xffffffffffffffff ^ v43 * 2) + v43 * 4 + 2 & (v41 ^ -v40) + (v41 + (-v40 | ~v41)) * 2 + 2) * 2;
    v45 = 1 - v44;
    v46 = v42 + ~v42 * 2 + 1 + (v45 | ~(v42 + ~v42 * 2 + 1));
    v47 = v42 + v44 - 1;
    v48 = (v47 + v46 * 2 + 2 | (v45 & v42) * 2) + (v47 + v46 * 2 + 2 & (v45 & v42) * 2);
    v49 = (v48 + 1 ^ (56476 | ~v48)) + (v48 + 1 & (56476 | ~v48)) * 2;
    v50 = (v48 & 56476) - ((v48 | 1) + (v47 & 1) + 56476) + ((v48 | 1) + (v47 & 1) + 56476 - (v48 & 56476)) * 2;
    v51 = (v48 + 9059 ^ -(v48 | 9059)) + (v48 + 9059 & -(v48 | 9059)) * 2;
    v52 = v48 + (v48 & 9059) - (0xffffffffffffb939 | v48 * 2) + 0xffffffffffffdc9d;
    v0 = (v50 ^ v49) + (v50 & v49) * 2 - 1;
    v1 = (v51 ^ v52) + (v51 & v52) * 2 - 1;
    v53 = ((unsigned int)v1 ^ 1) + ~(unsigned int)v1 * 2 + (__ROL__((unsigned int)v1, 1) & 2 & 3);
    g_f12024 = (v0 + (unsigned short)v53 + ((unsigned short)-v53 & (unsigned short)~v0) * 2 + (v0 + ((unsigned short)-v53 | (unsigned short)~v0)) * 2 + 1 | (unsigned short)~v39) + (unsigned short)v39 + 1;
    v54 = v1;
    v55 = v0;
    v56 = v55 + v54;
    v57 = v54 + ~v54 * 2 + 1;
    v58 = (v57 & v55) + v54;
    v59 = (v57 & ~v55) + v56;
    v60 = v59 ^ v58;
    v61 = (v58 & ~v59) * 2;
    v62 = (~v55 & ~v54) + (v54 | v55) * 2 + ((v54 | v55) - 1 ^ v56) - (v56 & -(v54 | v55)) * 2;
    v63 = (v61 + (v59 ^ ~v58) ^ v62 + 2) + ((v61 + (v59 ^ ~v58) & v62 + 2) - (v61 + (v59 ^ ~v58) + v62 + 2) + (v62 + 1 & v61 + (v59 ^ ~v58))) * 2;
    v64 = v61 - v60;
    v65 = v64 + (v60 - v61) * 2 | 0xfffffffffffffffe - v62;
    v66 = v63 + ((v65 & v64) * 4 + (v65 ^ v64) * 2 | ~v63) + ((v65 & v64) * 4 + (v65 ^ v64) * 2 | v63);
    v0 = v66 + 43;
    v1 = v66 + 1 + (v66 + 1 & 6) + (v66 + 2 ^ (~(v66 + 1) | 6)) + ((0xffffffff ^ ((unsigned int)v66 + 1) * 2) & 12) + (v66 + 2 & (~(v66 + 1) | 6)) * 2 - 6;
    v67 = (((v0 + 1 + ~v0 * 2 | v1) ^ -(v0 + 1 + ~v0 * 2)) + ((v0 + 1 + ~v0 * 2 | v1) & -(v0 + 1 + ~v0 * 2)) * 2 ^ v1 + 1 + v0 + 1 + (v1 + 1 + ~v1 * 2 | ~v0)) + (((v0 + 1 + ~v0 * 2 | v1) ^ -(v0 + 1 + ~v0 * 2)) + ((v0 + 1 + ~v0 * 2 | v1) & -(v0 + 1 + ~v0 * 2)) * 2 & v1 + 1 + v0 + 1 + (v1 + 1 + ~v1 * 2 | ~v0)) * 2;
    g_f12026 = v3 >> ((char)~v67 + (char)v67 * 2 & 63);
    v68 = 1 | (g_f044a0 + ~g_f044a0 * 2 + 1 & g_f12020) * 2;
    v69 = (v68 ^ (unsigned int)(g_f044a0 - g_f12020)) + (v68 & (unsigned int)(g_f044a0 - g_f12020)) * 2;
    g_f044a0 = (unsigned short)~v69 + (unsigned short)v69 * 2;
    v70 = -g_f12022;
    v71 = g_f12022 + g_f044a2 + (v70 & ~g_f044a2) * 2 + (g_f044a2 + (v70 | ~g_f044a2)) * 2 + 2;
    v72 = 1 | (g_f044a2 * 3 + ~g_f044a2 * 4 + 3 & g_f12022) * 2;
    g_f044a2 = (unsigned short)~((v72 ^ v71) + (v72 & v71) * 2) + (((unsigned short)v72 ^ (unsigned short)v71) + ((unsigned short)v72 & (unsigned short)v71) * 2) * 2;
    v73 = g_f044a4 + 1;
    v74 = -g_f12024;
    v75 = (v74 ^ g_f044a4) + ((v74 | ~g_f044a4) + v73) * 2 + (v73 + ~g_f044a4 * 2 & g_f12024) * 2 + 1;
    g_f044a4 = (unsigned short)~v75 + (unsigned short)v75 * 2;
    v76 = g_f12026 + ~g_f044a6;
    v77 = g_f044a6 - g_f12026 - (g_f044a6 | ~g_f12026);
    g_f044a6 = g_f044a6 - g_f12026 + (v77 ^ v76) * 2 + (v77 & v76) * 4;
    v78 = g_f044a8 | v3;
    v79 = -(g_f044a8 & v3);
    g_f044a8 = (v78 ^ v79) + (v78 + (v79 | ~v78)) * 2 + 2;
    return v1 + 1 + ~v1 * 2;
}
