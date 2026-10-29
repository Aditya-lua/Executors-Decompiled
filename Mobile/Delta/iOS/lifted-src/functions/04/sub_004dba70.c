/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4dba70..0x4dc3c8 (2392 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4dba70_0 {
    char field_0;
} st_4dba70_0;

extern unsigned short g_f04430;
extern unsigned short g_f04432;
extern unsigned short g_f04434;
extern unsigned short g_f04436;
extern unsigned long long g_f04438;
extern unsigned short g_f11fe8;
extern unsigned short g_f11fea;
extern unsigned short g_f11fec;
extern unsigned short g_f11fee;
extern unsigned int g_ffffffffffffffec;
extern unsigned long g_fffffffffffffff0;
extern unsigned int g_fffffffffffffff8;

unsigned long long sub_4dba70(void)
{
    unsigned long long v4;  // x8
    unsigned long long v5;  // x10
    unsigned int v14;  // w10
    unsigned long long v15;  // x11
    unsigned long long v16;  // x12
    unsigned long long v17;  // x15
    unsigned long long v18;  // x16
    unsigned long long v19;  // x14
    unsigned long long v20;  // x12
    unsigned long long v21;  // x11
    unsigned long long v22;  // x15
    unsigned long long v23;  // x15
    unsigned long long v6;  // x11
    unsigned long long v24;  // x11
    unsigned long long v25;  // x13
    unsigned long long v26;  // x14
    unsigned long long v27;  // x11
    unsigned long long v28;  // x15
    unsigned long long v29;  // x16
    unsigned long long v30;  // x15
    unsigned long long v31;  // x11
    unsigned long long v32;  // x11
    unsigned short v33;  // x11
    unsigned long long v7;  // x8
    unsigned long long v34;  // x13
    unsigned long v35;  // x14
    unsigned long v36;  // x15
    unsigned long long v37;  // x15
    unsigned long long v38;  // x16
    unsigned long long v39;  // x13
    unsigned long long v40;  // x12
    unsigned long long v41;  // x14
    unsigned long long v42;  // x13
    unsigned long long v43;  // x12
    unsigned long long v8;  // x10
    unsigned long long v44;  // x14
    unsigned long long v45;  // x12
    unsigned long long v46;  // x13
    unsigned long long v47;  // x15
    unsigned long long v48;  // x12
    unsigned long v49;  // x13
    unsigned short v50;  // x12
    unsigned long v51;  // x13
    unsigned long long v52;  // x14
    unsigned long long v53;  // x15
    unsigned long long v9;  // x8
    unsigned long long v54;  // x16
    unsigned long long v55;  // x0
    unsigned long long v56;  // x17
    unsigned long long v57;  // x14
    unsigned long long v58;  // x13
    unsigned long long v59;  // x14
    unsigned long long v60;  // x15
    unsigned long long v61;  // x13
    unsigned long long v62;  // x14
    unsigned long long v63;  // x14
    unsigned long long v10;  // x11
    unsigned long long v64;  // x15
    unsigned long long v65;  // x14
    unsigned long long v66;  // x15
    unsigned long long v67;  // x17
    unsigned long long v68;  // x16
    unsigned long long v69;  // x0
    unsigned long long v70;  // x1
    unsigned long long v71;  // x0
    unsigned long v72;  // x0
    unsigned long long v73;  // x14
    unsigned int v11;  // w11
    unsigned long long v74;  // x17
    unsigned long long v75;  // x1
    unsigned long long v76;  // x16
    unsigned long long v77;  // x14
    unsigned long long v78;  // x15
    unsigned long long v79;  // x14
    unsigned long v80;  // x14
    unsigned long v81;  // x15
    unsigned long v82;  // x0
    unsigned long long v83;  // x16
    unsigned int v12;  // w12
    unsigned long long v84;  // x16
    unsigned long long v85;  // x17
    unsigned long long v86;  // x14
    unsigned long long v87;  // x15
    unsigned long long v88;  // x14
    unsigned long long v89;  // x14
    unsigned long v90;  // x14
    unsigned long long v91;  // x12
    unsigned int v92;  // w15
    unsigned short v93;  // x10
    unsigned int v13;  // w10
    unsigned short v94;  // x12
    unsigned int v95;  // w15
    unsigned int v96;  // w16
    unsigned short v97;  // x13
    unsigned int v98;  // w11
    unsigned int v99;  // w10
    st_4dba70_0 **v0;  // [bp-0x10], Other Possible Types: unsigned long long, char
    unsigned long long v1;  // [bp-0x10]
    st_4dba70_0 *v2;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long
    unsigned long v3;  // [bp-0x8]

    v2 = &v0;
    v0 = &v2;
    v4 = 0xff51afd7ed558ccd * ((char *)&g_f04430 + ~(~&g_f04430 + &g_f04430));
    v5 = v4 >> 29;
    v6 = v4 | v5;
    v7 = ~v4 - (v5 | ~v4);
    v8 = v6 ^ v7;
    v9 = v8 + (v6 & v7) * 2;
    v10 = v0 + v2 + ((v0 | v2) - (v0 + v2)) * 2 + ((v0 | v2) - 1 ^ v0 + v2) - (v0 + v2 & -(v0 | v2)) * 2 + (v0 | v2) - (((v0 | v2) - 1 ^ v0 + v2) - (v0 + v2 & -(v0 | v2)) * 2 + (v0 | v2)) * 2;
    v0 = v10 + 61266;
    v2 = (v10 - 1 ^ 4269 | 0xfffffffffffffffe) + ((v10 - 1 ^ 4269) + (v10 + (-v10 | 4269)) * 2 | 1);
    v11 = ((unsigned int)v2 | (unsigned int)v0) + (unsigned int)v0 + 1 + ((unsigned int)v0 + 1 + ~(unsigned int)v0 * 2 | (unsigned int)v2);
    v12 = ~v9;
    v13 = ((unsigned int)v9 ^ 1) + (__ROL__((unsigned int)v8, 1) & 2 & 3) + v12 * 2;
    v14 = (v11 | ~v13) + ~v11 + (v11 | v13) * 2 + 2;
    g_f11fe8 = (unsigned short)v14 + (unsigned short)v12 + ((unsigned short)v14 + ((unsigned short)v9 + 1 | (unsigned short)~v14) + ((unsigned short)v9 + 1 & (unsigned short)~v14)) * 2 + 2;
    v15 = v2;
    v16 = v0;
    v17 = v16 - v15;
    v18 = (v17 + (v15 | ~v16) ^ v15 + 1) + (v17 + (v15 | ~v16) & v15 + 1) * 2;
    v19 = v18 + (v15 | v16) + (-v18 & ~(v15 | v16)) * 2 + ((v15 | v16) + (-v18 | ~(v15 | v16))) * 2 + 2;
    v20 = v16 + ~v16 * 2 + 1;
    v21 = ((1 | (v20 & v15) * 2) ^ v17) + ((1 | (v20 & v15) * 2) & v17) * 2;
    v22 = v19 + ~v19 * 2 + 1;
    v23 = v19 + v21 + (v22 + (1 - v21 | ~v22)) * 2;
    v24 = v23 + ((v21 - 1 - (v21 - 2 & v19) & v19 - (v21 - 1)) * 4 + (v21 - 1 - (v21 - 2 & v19) ^ v19 - (v21 - 1)) * 2 | 0xfffffffffffffffe - v23) + (v23 + 1 | (v21 - 1 - (v21 - 2 & v19) & v19 - (v21 - 1)) * 4 + (v21 - 1 - (v21 - 2 & v19) ^ v19 - (v21 - 1)) * 2);
    v25 = v24 + 2;
    v26 = ~v25;
    v27 = v24 + 3;
    v28 = v27 + v26 * 2;
    v29 = ~(unsigned int)v28 | (char *)&g_fffffffffffffff8 + 3;
    v30 = (v28 + v29 + 5 ^ v27) + (v28 + v29 + 5 & v27) * 2;
    v31 = ((v26 | 12) ^ v27) + (v25 & 12) - ((v25 | 1) + (v25 & 1) + 12) + (((v26 | 12) & v27) - (v25 & 12) + (v25 | 1) + (v25 & 1) + 12) * 2;
    v0 = v27 + (v26 | (char *)&g_fffffffffffffff8 + 3) + v30 + ((char *)&g_fffffffffffffff8 - v27 - (v26 | (char *)&g_fffffffffffffff8 + 3) + 3 | ~v30) + (v30 & v27 + (v26 | (char *)&g_fffffffffffffff8 + 3) + 4) + 5;
    v2 = ~v31 + v31 * 2;
    v32 = v0 + v2 * 3 + ~v2 * 4 + (0x7ffffffffffffffd - (v2 * 3 + ~v2 * 4) & ~v0) * 2 + (v0 + (0x7ffffffffffffffd - (v2 * 3 + ~v2 * 4) | ~v0)) * 2 + 5;
    v33 = v9 >> ((char)~v32 + (char)v32 * 2 & 63);
    v34 = v2;
    v35 = v0;
    v36 = v34 + (v35 | ~v34) + (v35 ^ v34);
    v37 = v36 + 2 + (v35 & v34) + (-(v35 & v34) & ~(v36 + 1)) * 2 + (v36 + 2 + (-(v35 & v34) | ~(v36 + 1))) * 2;
    v38 = v37 - 1;
    v39 = v35 + v34 + ((v35 | v34) & -v35) * 4 + (v35 + (-v34 | ~v35) + (-v34 & ~v35) + ((v35 | v34) ^ -v35)) * 2;
    v40 = 0xfffffffffffffffe - v39;
    v41 = v38 - v39 - 2;
    v42 = ((v39 + 1 | -v37) + v41 + 1 ^ -v37 - (-v37 | v40)) + ((v39 + 1 | -v37) + v41 + 1 & -v37 - (-v37 | v40)) * 2;
    v43 = (v41 & -(v38 | v40)) * 4 + (v41 ^ -(v38 | v40)) * 2 | 1;
    v44 = v42 ^ v43;
    v45 = v42 & v43;
    v46 = v44 + v45 * 2;
    v47 = ~v46 + v46 * 2;
    v48 = (v44 + (v45 - v46) * 2 + 17526 + (~((unsigned int)v44 + (unsigned int)(v45 - v46) * 2) | 0xffffffffffffbb8a) ^ -(v44 + (v45 - v46) * 2)) + (v44 + (v45 - v46) * 2 + 17526 + (~((unsigned int)v44 + (unsigned int)(v45 - v46) * 2) | 0xffffffffffffbb8a) & -(v44 + (v45 - v46) * 2)) * 2;
    v49 = v47 + (-(unsigned int)v46 & 17525);
    v0 = v47 + 48010;
    v2 = v49 + v48 + (v49 | ~v48) + (v48 & ~v49) + 1;
    v50 = (unsigned short)v0 + (unsigned short)v2 + (0xffff ^ (unsigned short)v2 * 2) + ((unsigned short)v2 + 1 & (unsigned short)v0) * 2 + ((unsigned short)-((unsigned int)v2 + (0xffffffff ^ (unsigned int)v2 * 2)) & (unsigned short)~(unsigned int)v0) * 2;
    g_f11fea = (unsigned short)(v33 * 2 + (v33 ^ 0xfffe) - ((v33 * 2 & 2) + (v50 + 1 - (v50 + 1) * 2 + 1 & v33))) + 2;
    v51 = v2;
    v52 = v0;
    v53 = v51 + v52 + (v51 - v52 - (v51 | -v52)) * 2 + (v51 + (0xffffffffffffffff ^ v51 * 2) + v52 & -(v51 + (0xffffffffffffffff ^ v51 * 2) | v52)) * 4 + ((v51 + (0xffffffffffffffff ^ v51 * 2) + v52 ^ -(v51 + (0xffffffffffffffff ^ v51 * 2) | v52)) + (-v52 & ~v51)) * 2;
    v54 = v53 + 1;
    v55 = v54 * 2;
    v56 = v55 + ~v54;
    v57 = (v51 - v52 + (v52 & ~v51)) * 2;
    v58 = v52 - v51 + (v57 | ~(v52 - v51)) + (v57 | v52 - v51);
    v59 = v58 + 1;
    v60 = v56 - v59 + (v58 | ~v53) + 1;
    v61 = (v60 ^ -v54 - (~v53 | ~v58)) + (v54 - v55 + v56 - (v59 + (v54 - v55 & ~v58)) + (v60 & -v54 - (~v53 | ~v58))) * 2;
    v62 = v61 + 2;
    v63 = v62 & 19;
    v64 = ((v63 ^ 19) + (v62 ^ &g_ffffffffffffffec) ^ v61 + 3) + ((v63 ^ 19) + (v62 ^ &g_ffffffffffffffec) & v61 + 3) * 2;
    v1 = v61 + 22 - v63 + v64 + (v64 & v63 - (v61 + 22)) + (v61 + 22 + ~v63 | ~v64);
    v2 = v61 + 15;
    v65 = v2;
    v66 = v1;
    v67 = (v66 | ~v65) + v65;
    v68 = v65 - v66 + v67 + (v66 & ~v65) * 2 + 1;
    v69 = v66 & v65;
    v70 = -v69;
    v71 = (v68 - v69 - (v68 | v70)) * 2;
    v72 = v71 + (v68 ^ v70);
    v73 = (v66 | v65) + ~v67;
    v74 = v72 - v73;
    v75 = v73 - 1;
    v76 = ((v68 ^ ~v70) - v71 | v75) + v74 + 1;
    v77 = (v73 - (v72 & v75) & v74) * 4 + (v73 - (v72 & v75) ^ v74) * 2;
    v78 = (v76 ^ v73 - v72 + (v72 | -v73)) + (v76 & v73 - v72 + (v72 | -v73)) * 2 - v77;
    v79 = v78 + v77 * 2;
    v0 = (v78 | 0xfffffffffffffffe) + (v79 & 0xfffffffffffffffe) + 3033;
    v3 = v79 + (v79 ^ 0xffffffffffff0bd7) + (v79 | 62504) + (~(unsigned int)v79 & 62504) + 1;
    g_f11fec = (unsigned short)(v0 + ((unsigned int)v3 & 0xffff ^ 0xfffe) + ((unsigned int)v3 & 0xffff) * 4 - (((unsigned int)v3 & 0xffff) * 2 + (((unsigned int)v3 & 0xffff) * 2 & 2))) + 2 & (unsigned short)(v9 >> ((char)v2 + (char)v1 & 63));
    v80 = v3;
    v81 = v0;
    v82 = ~v81;
    v83 = (v81 + v80 * 3 + ~v80 * 4 + (0x7ffffffffffffffc - (v80 * 3 + ~v80 * 4) & ~v81)) * 2;
    v84 = v80 + v81 + v82 * 2 + v83 + 8 + (v83 + 8 | 0xfffffffffffffffd - (v80 + v81 + v82 * 2)) + ((char *)&g_fffffffffffffff0 - v83 + 7 & v80 + v81 + v82 * 2 + 2) + 3;
    v85 = v81 * 2 + v82 * 4 + (v81 ^ 1) + (v81 * 2 & 2);
    v86 = v81 - v80;
    v87 = v86 + ((v80 | 0xfffffffffffffffd - v85) ^ v85 + 3) * 2 + ((v80 | 0xfffffffffffffffd - v85) & v85 + 3) * 4;
    v88 = (v87 ^ 1) + ((v86 * 2 | v86 >> 63) & 2 & 3) + ~v87 * 2 + 1;
    v89 = ~((v88 ^ v84) + (v88 & v84) * 2) + ((v88 ^ v84) + (v88 & v84) * 2) * 2;
    v90 = (v89 * 2 & 4) + (v89 ^ 2);
    v0 = v90 + 16;
    v2 = v90 + 30;
    v91 = v2 + (0xffffffffffffffff ^ v2 * 2);
    g_f11fee = v9 >> (v0 + (char)v2 + (0xff ^ (char)v2 * 2) + (v0 + ((char)-v91 | ~v0) + ((char)-v91 & ~v0)) * 2 + 1 & 63);
    v92 = g_f04430 | g_f11fe8;
    v93 = g_f11fe8 + g_f04430;
    g_f04430 = (unsigned short)(v92 - (v93 & -v92) * 2) + ((unsigned short)(v92 - 1) ^ v93) + 1;
    v94 = -g_f11fea;
    v95 = g_f11fea | g_f04432;
    v96 = -g_f04432;
    g_f04432 = (((unsigned short)v95 & (unsigned short)v96) * 4 + ((unsigned short)v95 ^ (unsigned short)v96) * 2 + (unsigned short)~((v95 & v96) * 4 + (v95 ^ v96) * 2) * 2 ^ 0xfffe) + (v94 ^ g_f04432) + (unsigned short)(g_f04432 - g_f11fea - (v94 | g_f04432)) * 2;
    g_f04434 = (g_f11fec | g_f04434) + (unsigned short)~((g_f04434 + ~g_f04434 * 2 + 1 | g_f11fec) + g_f04434);
    v97 = g_f11fee + 1;
    v98 = ~(g_f11fee | g_f04436) + g_f11fee;
    v99 = g_f04436 + 1;
    g_f04436 = (v97 + ~g_f11fee * 2 & g_f04436) + v97 + ((unsigned short)v98 ^ (unsigned short)v99) + ((unsigned short)v98 & (unsigned short)v99) * 2 + (unsigned short)~((v98 ^ v99) + (v98 & v99) * 2) * 2 + 1;
    g_f04438 = g_f04438 - v9 + (v9 - g_f04438 + (g_f04438 & ~v9)) * 2;
    return v85 + 3;
}
