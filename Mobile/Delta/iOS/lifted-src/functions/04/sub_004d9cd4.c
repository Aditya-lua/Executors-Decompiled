/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4d9cd4..0x4da67c (2472 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4d9cd4_0 {
    char field_0;
} st_4d9cd4_0;

extern unsigned short g_f04460;
extern unsigned short g_f04462;
extern unsigned short g_f04464;
extern unsigned short g_f04466;
extern unsigned long long g_f04468;
extern unsigned short g_f12000;
extern unsigned short g_f12002;
extern unsigned short g_f12004;
extern unsigned short g_f12006;

int sub_4d9cd4(void)
{
    unsigned long long v3;  // x8
    unsigned long long v4;  // x10
    unsigned long v13;  // x10
    unsigned long long v14;  // x10
    unsigned long long v15;  // x10
    unsigned long long v16;  // x13
    unsigned long long v17;  // x16
    unsigned long long v18;  // x15
    unsigned long v19;  // x13
    unsigned short v20;  // x13
    unsigned short v21;  // x12
    unsigned long v22;  // x13
    unsigned long long v5;  // x11
    unsigned long v23;  // x15
    unsigned long v24;  // x14
    unsigned long long v25;  // x16
    unsigned long long v26;  // x13
    unsigned long long v27;  // x15
    unsigned long long v28;  // x17
    unsigned int v29;  // w15
    unsigned long v30;  // x16
    unsigned long v31;  // x17
    unsigned long long v32;  // x0
    unsigned long long v6;  // x8
    unsigned long long v33;  // x16
    unsigned long long v34;  // x16
    unsigned long long v35;  // x16
    unsigned long long v36;  // x17
    unsigned int v37;  // w17
    unsigned long v38;  // x16
    unsigned long long v39;  // x17
    unsigned long long v40;  // x0
    unsigned long long v41;  // x2
    unsigned long long v42;  // x16
    unsigned long long v7;  // x12
    unsigned long long v43;  // x16
    unsigned long long v44;  // x16
    unsigned long long v45;  // x17
    unsigned long long v46;  // x16
    unsigned int v47;  // w16
    unsigned long v48;  // x17
    unsigned long long v49;  // x0
    unsigned long long v50;  // x3
    unsigned long long v51;  // x2
    unsigned long long v52;  // x17
    unsigned long long v8;  // x8
    unsigned long long v53;  // x0
    unsigned long long v54;  // x17
    unsigned long long v55;  // x0
    unsigned long long v56;  // x1
    unsigned int v57;  // w0
    unsigned int v58;  // w17
    unsigned long v59;  // x17
    unsigned long long v60;  // x0
    unsigned long long v61;  // x1
    unsigned long long v62;  // x11
    st_4d9cd4_0 *v9;  // x10
    unsigned long long v63;  // x2
    unsigned long long v64;  // x11
    unsigned long long v65;  // x3
    unsigned long long v66;  // x7
    unsigned long long v67;  // x17
    unsigned long long v68;  // x14
    unsigned long long v69;  // x11
    unsigned long long v70;  // x0
    unsigned long long v71;  // x1
    unsigned long long v72;  // x17
    st_4d9cd4_0 **v10;  // x11
    unsigned long long v73;  // x11
    unsigned long long v74;  // x11
    unsigned long long v75;  // x17
    unsigned long long v76;  // x14
    unsigned short v78;  // x14
    unsigned int v79;  // w15
    unsigned short v80;  // x0
    unsigned short v81;  // x15
    unsigned short v82;  // x12
    unsigned long long v11;  // x14
    unsigned short v83;  // x13
    unsigned int v84;  // w14
    unsigned int v85;  // w15
    unsigned int v86;  // w17
    unsigned short v87;  // x14
    unsigned int v88;  // w12
    unsigned short v89;  // x12
    unsigned int v90;  // w10
    unsigned int v91;  // w13
    unsigned int v92;  // w10
    unsigned long long v12;  // x13
    unsigned short v93;  // x13
    unsigned short v94;  // x12
    unsigned long long v95;  // x13
    st_4d9cd4_0 **v1;  // [bp-0x10], Other Possible Types: char, unsigned long long
    st_4d9cd4_0 *v2;  // [bp-0x8], Other Possible Types: unsigned long

    v2 = &v1;
    v1 = &v2;
    v3 = 0xff51afd7ed558ccd * ((char *)&g_f04460 + ~(~&g_f04460 + &g_f04460));
    v4 = v3 >> 29;
    v5 = v3 | v4;
    v6 = ~v3 - (v4 | ~v3);
    v7 = v5 ^ v6;
    v8 = v7 + (v5 & v6) * 2;
    v9 = v2;
    v10 = v1;
    v11 = v10 + v9;
    v12 = v11 + (0xffffffffffffffff ^ v9 * 2) + ~(v11 + (0xffffffffffffffff ^ v9 * 2) + (v9 | ~v10));
    v13 = (v9 + ~v10 + (v10 & ~v9)) * 2 + 2;
    v14 = v11 + ~v9 * 2 + (v13 | 0xfffffffffffffffd - (v11 + ~v9 * 2)) + (v13 | v11 + ~v9 * 2 + 2);
    v15 = (v9 - v10 + v12 * 4 + 1 + ~(v12 * 2) ^ v14 + 3) + (v9 - v10 + v12 * 4 + 1 + ~(v12 * 2) - (v14 + 3) + (v9 - v10 + v12 * 4 + 1 + ~(v12 * 2) & v14 + 3) + (v14 + 2 & v12 * 2 - (v9 - v10 + v12 * 4 + 1)) + v9 - v10 + v12 * 4 + 1 - v12 * 2 + (v12 * 2 - (v9 - v10 + v12 * 4 + 1)) * 2 + (0xfffffffffffffffd - v14 | ~(v9 - v10 + v12 * 4 + 1 - v12 * 2 + (v12 * 2 - (v9 - v10 + v12 * 4 + 1)) * 2))) * 2;
    v16 = v15 + 4;
    v17 = v15 + 5;
    v18 = (v16 & 0xffffffffffff8718 ^ 0xffffffffffff8719 ^ v15 + 30955) + ((v16 & 0xffffffffffff8718 ^ 0xffffffffffff8719) & v15 + 30955) * 2;
    v19 = v16 + v17 + (30951 | ~v16) + 0xffffffffffff8719 + ((0xffffffff ^ (unsigned int)v16 * 2) & 61902);
    v1 = (v16 ^ 34585) + (v17 + (34585 | ~v16)) * 2 - 1;
    v2 = v18 + (v19 | ~v18) + (v18 | v19) + 1;
    v20 = (unsigned int)(((unsigned int)v2 + v1 & (unsigned int)v8) * 2 - (v8 + v2 + v1 + ((unsigned int)v8 | ~((unsigned int)v2 + v1)))) - 2;
    v21 = ((unsigned short)(__ROL__((unsigned int)v7, 1)) & 2 & 3 ^ 3) + ((unsigned short)v8 ^ 0xfffe) + (unsigned short)v8 * 2;
    g_f12000 = (v20 ^ v21) + (v20 & v21) * 2;
    v22 = v2;
    v23 = v1;
    v24 = ~v22;
    v25 = v22 - v23 + ((v22 * 3 + v24 * 4 + 3 & v23) - (v22 * 3 + v24 * 4 + 3 + v23) ^ v22 * 3 + v24 * 4 + 3 + v23) * 2 + ((v22 * 3 + v24 * 4 + 3 & v23) - (v22 * 3 + v24 * 4 + 3 + v23) & v22 * 3 + v24 * 4 + 3 + v23) * 4;
    v26 = v22 + 1 + v23 + (v23 + 1 + ~v23 * 2 | v22 + 1 + v24 * 2) + ((v23 + 1 + ~v23 * 2 | v22) ^ 0xfffffffffffffffe - v23) - ((v23 + 1 + ~v23 * 2 | v22) & v23 + 1) * 2;
    v27 = v25 + 1 + v26 + (~v25 - v26 + (v25 | v26) & v25 + 1) * 4 + ((~v25 - v26 + (v25 | v26) ^ v25 + 1) + (~v25 & ~v26)) * 2;
    v28 = v27 * 2;
    v1 = (v27 ^ 11) + (v28 & 22) - 1;
    v2 = (v27 ^ 7) + (v28 & 14) - 1;
    v29 = v8 >> (((char)v2 & v1) + (v1 | (char)v2 | (char)~(v2 & v1)) + (v1 | (char)v2 | (char)v2 & v1) + 1 & 63);
    v30 = v2;
    v31 = v1;
    v32 = ((((v31 | v30) & -v30) * 4 + ((v31 | v30) ^ -v30) * 2 | 1) ^ v30 - v31) + ((((v31 | v30) & -v30) * 4 + ((v31 | v30) ^ -v30) * 2 | 1) & v30 - v31) * 2;
    v33 = (((v31 + ~v31 * 2 + 2 & (v30 | ~(v31 + ~v31 * 2 + 1))) * 4 + (v31 + ~v31 * 2 + 2 ^ (v30 | ~(v31 + ~v31 * 2 + 1))) * 2 | 1) ^ v30 + ~v30 * 2 + v31 + 2) + (((v31 + ~v31 * 2 + 2 & (v30 | ~(v31 + ~v31 * 2 + 1))) * 4 + (v31 + ~v31 * 2 + 2 ^ (v30 | ~(v31 + ~v31 * 2 + 1))) * 2 | 1) & v30 + ~v30 * 2 + v31 + 2) * 2;
    v34 = (v33 - 2 | v32 - 1) - (v32 + v33) + 2;
    v35 = (((v34 & v32) * 4 + (v34 ^ v32) * 2 | 1) ^ v33 - v32 + (1 - v33 | ~v32 + v32 * 2) * 2) + (((v34 & v32) * 4 + (v34 ^ v32) * 2 | 1) & v33 - v32 + (1 - v33 | ~v32 + v32 * 2) * 2) * 2;
    v36 = ~v35 + v35 * 2;
    v1 = ((-v35 | 46383) ^ v35) + v36 + ((-v35 | 46383) & v35) * 2 + (~(unsigned int)v36 | 0xffffffffffff4ad0) + 46384;
    v2 = (v36 ^ 19153) + (38306 & v36 * 2) - 1;
    v37 = (v29 ^ 1) + ~v29 * 2 + (__ROL__(v29, 1) & 2 & 3);
    g_f12002 = (unsigned short)v37 + (unsigned short)v29 + ((unsigned short)v2 + (unsigned short)v1 | (unsigned short)~v37) + ((unsigned short)v37 ^ (unsigned short)v2 + (unsigned short)v1) + 2;
    v38 = v2;
    v39 = v1;
    v40 = v39 + ~v39 * 2;
    v41 = (v38 + ~v38 * 2 + 1 & v39) + v38;
    v42 = -((v40 ^ ~(v38 - v39 + (v39 | ~v38))) + (v38 - v39 + (v39 | ~v38) & ~v40) * 2);
    v43 = v42 - (v41 + (v42 & ~v41) * 2) + (~v41 - (v42 | ~v41)) * 2;
    v44 = (v43 ^ (v40 + 1 & v38 | v39 & ~v38)) + (v43 & (v40 + 1 & v38 | v39 & ~v38)) * 2 + ((v43 ^ (v40 + 1 & v38 | v39 & ~v38)) & 1) + (v43 ^ (v40 + 1 & v38 | v39 & ~v38)) + (v43 & (v40 + 1 & v38 | v39 & ~v38)) * 2 - (~((v43 ^ (v40 + 1 & v38 | v39 & ~v38)) + (v43 & (v40 + 1 & v38 | v39 & ~v38)) * 2) + ((v43 ^ (v40 + 1 & v38 | v39 & ~v38)) + (v43 & (v40 + 1 & v38 | v39 & ~v38)) * 2) * 2 | 1);
    v45 = v44 - 1;
    v46 = (v45 & 19) - (v44 + 19) + (v44 + 19 - (v45 & 19)) * 2;
    v1 = ((v45 * 2 & 28) + (v45 ^ 14) | 1) + (v45 | 0xfffffffffffffffe);
    v2 = (v46 ^ (-v44 | 19) + v44) + (v46 & (-v44 | 19) + v44) * 2 - 1;
    v47 = v8 >> ((char)v1 + ((char)v2 | (char)~v1) + ((char)v2 ^ (char)v1) + ((char)v2 & (char)v1) + 1 & 63);
    v48 = v2;
    v49 = v1;
    v50 = v49 | v48;
    v51 = v48 - v49 + (v50 ^ -v48) * 2 + (v50 & -v48) * 4;
    v52 = v50 + ~((v49 + ~v49 * 2 + 1 | v48) + v49);
    v53 = v51 + v52 + ((v52 - 1 & v51) - (v51 + v52)) * 2;
    v54 = v53 + ((v51 & -v52) * 2 | ~v53) + (v53 | (v51 & -v52) * 2);
    v55 = v54 + 1;
    v56 = (v54 + 56092 ^ -(v55 | 56091)) + (v54 + 56092 & -(v55 | 56091)) * 2;
    v1 = (v56 & (v55 & 56091) - (v54 + 56093)) + v54 + 56093 + ~(v55 & 56091) + (v56 & v54 + 56093 + ~(v55 & 56091));
    v2 = v55 + (18890 & v55 * 2) + (18890 & v55 * 2 ^ 18890) + 0xffffffffffffdb1a;
    v57 = (unsigned int)((unsigned int)v2 * 2 + ((unsigned int)v2 ^ 0xfffffffe) - ((unsigned int)v2 * 2 & 2)) + 3;
    v58 = (v57 ^ (unsigned int)v1) + (v57 & (unsigned int)v1) * 2;
    g_f12004 = (unsigned short)v47 + (unsigned short)~(v58 - 1 + v47 + (-v58 | v47)) + ((unsigned short)(v58 - 1) & (unsigned short)v47) * 2;
    v59 = v2;
    v60 = v1;
    v61 = v59 * 2 + ~v59 * 4 + (v59 ^ 1) + (v59 * 2 & 2);
    v62 = v61 + v60 + (0xfffffffffffffffd - v61 & ~v60) + 3;
    v63 = v62 * 2;
    v64 = v59 - v60 + v62 * 4 + 1;
    v65 = v64 + ~v63;
    v66 = v60 + 1;
    v67 = v66 + ~v60 * 2 | v59;
    v68 = v60 - v59 + (v59 | ~v60) + v66 + (v59 & ~v60) * 2 + (v67 ^ 0xfffffffffffffffe - v60) - (v67 & v66) * 2;
    v69 = v63 - v64;
    v70 = v69 + 2;
    v71 = v70 + v68;
    v72 = v71 + (v65 | ~v68) * 2;
    v73 = (v72 | (v70 + v65 * 2 & (v69 | ~v68)) * 4 + (v70 + v65 * 2 ^ (v69 | ~v68)) * 2) + ((v70 + v65 * 2 & (v69 | ~v68)) * 4 + (v70 + v65 * 2 ^ (v69 | ~v68)) * 2 & v72);
    v1 = v73 + (v73 & 22) - (0xffffffffffffffd3 | v73 * 2) + (0xffffffffffffffea - (v73 & 0xffffffffffffffe9) ^ v73 + 22) + (0xffffffffffffffea - (v73 & 0xffffffffffffffe9) & v73 + 22) * 2 - 23;
    v2 = (v71 & 1) + (v73 | 1) + 25;
    v74 = v1;
    v75 = v74 + 1;
    v76 = v75 + ~v74 * 2 | v2;
    g_f12006 = v8 >> (((char)v76 ^ (char)v75) + ((char)v76 & (char)v75) * 2 + ((char)v2 | (char)v74 | (char)~((v76 ^ v75) + (v76 & v75) * 2)) + (((char)v76 ^ (char)v75) + ((char)v76 & (char)v75) * 2 | (char)v2 | (char)v74) + 1 & 63);
    g_f04460 = g_f04460 - g_f12000 + (g_f12000 & ~g_f04460) * 2;
    v78 = -g_f12002;
    v79 = g_f04462 * 2;
    v80 = g_f12002 + g_f04462;
    v81 = v79 - ((g_f04462 | ~g_f12002) + v80);
    v82 = v80 + ((v78 & ~g_f04462) + (unsigned short)(g_f04462 - g_f12002 - (v78 | g_f04462))) * 2;
    v83 = (v81 & v80 + (unsigned short)~v79) * 4 + (v81 ^ v80 + (unsigned short)~v79) * 2 | 1;
    g_f04462 = (v83 ^ v82) + (v83 & v82) * 2 - 1;
    v84 = g_f12004 + ~g_f12004 * 2 + 1;
    v85 = v84 | g_f04464;
    v86 = g_f04464 + 1;
    v87 = (unsigned short)v86 + g_f12004 + (unsigned short)v84;
    v88 = v86 + ~g_f04464 * 2 | g_f12004;
    v89 = -((v88 ^ v86) + (v88 & v86) * 2);
    g_f04464 = (v89 ^ v87 + (unsigned short)~v85) + ((unsigned short)(v87 - v85) + (v89 | (unsigned short)(v85 - v87))) * 2;
    v90 = (0xffffffff ^ g_f04466 * 2) + g_f04466;
    v91 = v90 + g_f12006;
    v92 = -(v90 | g_f12006);
    v93 = -g_f12006;
    v94 = g_f04466 + 1;
    g_f04466 = v94 + g_f12006 + ((v93 | ~g_f04466) + v94 + (v93 & ~g_f04466)) * 2 + ((v91 & v92) * 4 + (v91 ^ v92) * 2 + ~((v91 & v92) * 4 + (v91 ^ v92) * 2) * 2 ^ 0xfffe) - 1;
    v95 = v8 | ~g_f04468;
    g_f04468 = (g_f04468 | v8) - (v95 & g_f04468 + 1) * 2 + (g_f04468 + ~g_f04468 * 2 ^ v95) + 1;
    return v86 + g_f12004;
}
