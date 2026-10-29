/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4c8244..0x4c8cac (2664 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4c8244_0 {
    char field_0;
} st_4c8244_0;

extern unsigned short g_f04690;
extern unsigned short g_f04692;
extern unsigned short g_f04694;
extern unsigned short g_f04696;
extern unsigned long long g_f04698;
extern unsigned short g_f12118;
extern unsigned short g_f1211a;
extern unsigned short g_f1211c;
extern unsigned short g_f1211e;

int sub_4c8244(void)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x8
    unsigned long v12;  // x12
    unsigned long long v13;  // x14
    unsigned long long v14;  // x15
    unsigned long long v15;  // x16
    unsigned long long v16;  // x12
    unsigned long long v17;  // x12
    unsigned long long v18;  // x13
    unsigned long long v19;  // x14
    unsigned long long v20;  // x12
    unsigned long v21;  // x17
    st_4c8244_0 *v4;  // x10
    unsigned long long v22;  // x13
    unsigned int v23;  // w13
    unsigned long long v24;  // x14
    unsigned long v25;  // x15
    unsigned long long v26;  // x16
    unsigned long long v27;  // x14
    unsigned long long v28;  // x14
    unsigned long long v29;  // x14
    unsigned int v30;  // w14
    unsigned int v31;  // w15
    st_4c8244_0 **v5;  // x11
    unsigned int v32;  // w17
    unsigned int v33;  // w16
    unsigned int v34;  // w14
    unsigned int v35;  // w15
    unsigned int v36;  // w16
    unsigned int v37;  // w13
    unsigned long long v38;  // x14
    unsigned long v39;  // x15
    unsigned long long v40;  // x17
    unsigned long long v41;  // x16
    unsigned long long v6;  // x12
    unsigned long long v42;  // x16
    unsigned long long v43;  // x17
    unsigned long long v44;  // x14
    unsigned long long v45;  // x17
    unsigned long long v46;  // x14
    unsigned long v47;  // x14
    unsigned long v48;  // x15
    char v49;  // x17
    char v50;  // x16
    unsigned int v51;  // w14
    unsigned long v7;  // x14
    unsigned long v52;  // x15
    unsigned long v53;  // x16
    unsigned long long v54;  // x17
    unsigned long long v55;  // x0
    unsigned long long v56;  // x17
    unsigned long long v57;  // x15
    unsigned long long v58;  // x16
    unsigned long long v59;  // x15
    unsigned long long v60;  // x16
    unsigned long long v61;  // x15
    unsigned long long v8;  // x10
    unsigned long long v62;  // x16
    unsigned long long v63;  // x17
    unsigned long long v64;  // x2
    unsigned long long v65;  // x15
    unsigned int v66;  // w15
    unsigned int v67;  // w16
    unsigned long long v68;  // x15
    unsigned long v69;  // x16
    unsigned long long v70;  // x17
    unsigned long long v71;  // x0
    unsigned long long v9;  // x10
    unsigned long long v72;  // x17
    unsigned long long v73;  // x17
    unsigned long long v74;  // x16
    unsigned long long v75;  // x0
    unsigned long long v76;  // x16
    unsigned long long v77;  // x17
    unsigned long long v78;  // x11
    unsigned long long v79;  // x16
    unsigned long long v80;  // x17
    unsigned long long v81;  // x1
    unsigned long long v10;  // x10
    unsigned long long v82;  // x3
    unsigned long long v83;  // x11
    unsigned long long v84;  // x11
    unsigned int v85;  // w0
    unsigned int v86;  // w17
    unsigned int v87;  // w10
    unsigned short v88;  // x10
    unsigned short v89;  // x10
    unsigned short v90;  // x11
    unsigned int v91;  // w12
    unsigned long long v11;  // x12
    unsigned int v92;  // w13
    unsigned int v93;  // w10
    unsigned int v94;  // w13
    unsigned short v95;  // x12
    unsigned int v96;  // w10
    unsigned int v97;  // w10
    unsigned long long v98;  // x11
    unsigned long long v99;  // x12
    st_4c8244_0 **v0;  // [bp-0x10], Other Possible Types: unsigned long long, char
    st_4c8244_0 *v1;  // [bp-0x8], Other Possible Types: unsigned long, unsigned long long

    v1 = &v0;
    v0 = &v1;
    v2 = 0xff51afd7ed558ccd * ((char *)&g_f04690 + ~(~&g_f04690 + &g_f04690));
    v3 = ((v2 | v2 >> 29) ^ ~v2 - (v2 >> 29 | ~v2)) + ((v2 | v2 >> 29) & ~v2 - (v2 >> 29 | ~v2)) * 2;
    v4 = v1;
    v5 = v0;
    v6 = v4 - v5 + (v5 & v4) + (v5 & ~v4) * 2 + ((v4 | v5) - 1 ^ v5 + v4) - (v5 + v4 & -(v4 | v5)) * 2;
    v7 = (char *)v5 + (v4 | ~v5) + (v5 ^ v4);
    v8 = ((char *)v5 + 0x2 * ~v5 + 1 | v4) + (char *)v5;
    v9 = (v6 + 1 ^ v7 + 1 + ~v8) + (~v6 - (v7 + 1 + ~v8) + (v6 + 1 & v7 + 1 + ~v8) + (v6 + 1 & v7 + 1 + ~v8 - 1)) * 2 + (((v7 + ~v8 + 2 + (v8 - (v7 + 1)) * 2 | 1) + (v7 + ~v8 + 2 & 1) | 0x7ffffffffffffffe - v6) + v6 + 1) * 2;
    v10 = v9 + 2;
    v11 = (v9 + (0xfffffffffffffffd - v9 | 2445) + 3 ^ (v10 & 2445) - (v10 ^ 0xfffffffffffff672)) + (v9 + (0xfffffffffffffffd - v9 | 2445) + 3 & (v10 & 2445) - (v10 ^ 0xfffffffffffff672)) * 2;
    v0 = ~v11 + v11 * 2;
    v1 = ((v10 | 1) + (v10 & 1) + 63090 | 1) + ((v10 | 1) + (v10 & 1) + 63090 & 1) - 2;
    g_f12118 = ((unsigned short)v1 + (unsigned short)v0 | (unsigned short)v3) + (unsigned short)v1 + (unsigned short)v0 + (unsigned short)v3 + ((unsigned short)(((unsigned int)v1 + (unsigned int)v0 & (unsigned int)v3) - ((unsigned int)v1 + (unsigned int)v0 + (unsigned int)v3 | -((unsigned int)v1 + (unsigned int)v0 | (unsigned int)v3))) + ((unsigned short)-((unsigned int)v1 + (unsigned int)v0 | (unsigned int)v3) & (unsigned short)~((unsigned int)v1 + (unsigned int)v0 + (unsigned int)v3))) * 2;
    v12 = v1;
    v13 = v0;
    v14 = (v12 ^ -v13) + (v12 - (v13 + (v12 | -v13))) * 2 + ((v12 ^ 1) + ~v12 * 2 + ((v12 * 2 | v12 >> 63) & 2 & 3) & v13) * 2;
    v15 = v14 + 1;
    v16 = v13 + v12 + (-v12 & ~v13) * 2 + (v13 - (v12 + (v13 | -v12))) * 2;
    v17 = v16 + (((v12 | ~(v13 + ~v13 * 2 + 1)) & v13 + ~v13 * 2 + 2) * 4 + ((v12 | ~(v13 + ~v13 * 2 + 1)) ^ v13 + ~v13 * 2 + 2) * 2 | ~v16) + (((v12 | ~(v13 + ~v13 * 2 + 1)) & v13 + ~v13 * 2 + 2) * 4 + ((v12 | ~(v13 + ~v13 * 2 + 1)) ^ v13 + ~v13 * 2 + 2) * 2 | v16);
    v18 = v17 + 1;
    v19 = (v17 & v14) - v18;
    v20 = v18 - v15 + (v14 | ~v17) + 1;
    v21 = v19 ^ v20;
    v22 = v21 + (v18 + ~v18 * 2 + v15 + (v19 & v20) + (0x7ffffffffffffffd - (v18 + ~v18 * 2) & ~v14)) * 2 + 4;
    v0 = (v21 | 0xfffffffffffffffe) + (v22 & 0xfffffffffffffffe) + 9;
    v1 = v22 + (v22 + (10 | ~v22)) * 2 + ((0xffffffff ^ (unsigned int)v22 * 2) & 20) - 9;
    v23 = v3 >> ((char)v1 + (v0 + 1) * 2 + ((char)v1 | ~v0) + ((char)v1 ^ v0) + (v0 + 1 + ~v0 * 2 & (char)~v1) & 63);
    v24 = v1;
    v25 = v0;
    v26 = v24 + (v25 | ~v24) + (v25 ^ v24) + 1;
    v27 = v25 | v24;
    v28 = -((v25 + v24 ^ -v27) + (v25 + v24 & -v27) * 2);
    v29 = ((~v25 & ~v24) + v27 * 2 + 1 ^ v28) + ((~v25 & ~v24) + v27 * 2 + (v28 | 0xfffffffffffffffe - ((~v25 & ~v24) + v27 * 2))) * 2 + 5 + (v26 ^ (v24 & ~v25) - v24) + ((v26 & (v24 & ~v25) - v24) - (((~v25 & ~v24) + v27 * 2 + 1 ^ v28) + ((~v25 & ~v24) + v27 * 2 + (v28 | 0xfffffffffffffffe - ((~v25 & ~v24) + v27 * 2))) * 2 + 5)) * 2;
    v0 = (v29 + 1 | 1) + (v29 + 1 & 1) + 23257;
    v1 = v29 + 42278;
    v30 = v0;
    v31 = v1;
    v32 = v30 + 1;
    v33 = v32 + ~v30 * 2 | v31;
    v34 = (v31 + ~v31 * 2 + 1 & v30) + v31 + (v33 ^ v32) + (v33 & v32) * 2;
    v35 = v34 + 1;
    v36 = (v35 ^ v23) + (v35 & v23) * 2;
    v37 = (v35 + ~v34 * 2 & v23) + v34;
    g_f1211a = (unsigned short)v37 + (unsigned short)~((v35 ^ v23) + (v35 & v23) * 2) + (((unsigned short)v35 ^ (unsigned short)v23) + ((unsigned short)v35 & (unsigned short)v23) * 2) * 2 + (unsigned short)((-((v35 ^ v23) + (v35 & v23) * 2) & -v37) + (unsigned short)~v36 + (unsigned short)v36 * 2 - (v37 + ((unsigned short)~v36 + (unsigned short)v36 * 2 | -v37))) * 2;
    v38 = v1;
    v39 = v0;
    v40 = v38 + 1;
    v41 = v40 + ~v38 * 2;
    v42 = ((v41 | v39) ^ v40) + ((v41 | v39) & v40) * 2;
    v43 = (v39 ^ 1) + v39 * 2 + ~v39 * 4 + (v39 * 2 & 2) + 2;
    v44 = (v39 ^ -v38) + (v39 + (-v38 | ~v39)) * 2;
    v45 = (v43 + v38 & -(v43 | v38)) * 4 + (v43 + v38 ^ -(v43 | v38)) * 2;
    v46 = (v38 + (v41 & v39) + v42 + ~v42 * 2 + 2 ^ -(v44 + 3 + (v45 | ~(v44 + 2)) + v44 + 3 + v45 + (~v45 | ~(v44 + 2)))) + (v38 + (v41 & v39) + v42 + ~v42 * 2 + 2 & -(v44 + 3 + (v45 | ~(v44 + 2)) + v44 + 3 + v45 + (~v45 | ~(v44 + 2)))) * 2;
    v0 = (v46 | 0xffffffffffffffe9) + (v46 | 22) + 23;
    v1 = (v46 ^ 11) + (v46 + (11 | ~v46)) * 2 + 1;
    v47 = v0;
    v48 = v1;
    v49 = (char)v47 + 1;
    v50 = v49 + (char)~v47 * 2 | (char)v48;
    v51 = v3 >> (((char)v48 + (char)~v48 * 2 + 1 & (char)v47) + (char)v48 + (v50 ^ v49) + (v50 & v49) * 2 & 63);
    v52 = v1;
    v53 = v0;
    v54 = (v53 + ~v53 * 2 + 1 & v52) + v53;
    v55 = (v52 + ~v52 * 2 ^ ~(v52 + ~v52 * 2 + 1 | v53)) + ((v52 + ~v52 * 2 + 1 | v53) & ~(v52 + ~v52 * 2)) * 2;
    v56 = v55 + v54 + (-v55 & ~v54) * 2 + (v54 - (v55 + (v54 | -v55))) * 2;
    v57 = v53 + v52 + ((v53 | v52) - (v53 + v52) & (v53 | v52)) * 2 + ((v53 | v52) - (v53 + v52) & ~(v53 | v52)) * 2;
    v58 = -v57;
    v59 = (v56 ^ v57) + (v58 & ~v56) * 2 + (v56 & v57) * 2;
    v60 = (v56 + ~v56 * 2 + 1 | v58) + v56;
    v61 = (v60 * 2 + 2 | ~v59) - (v60 * 2 + 2 & v59) + (v59 + v60) * 2;
    v62 = v61 + 4;
    v63 = v61 + 3;
    v64 = (v62 - v62 * 2 + 22306 + (~(unsigned int)(v62 - v62 * 2) | 0xffffffffffffa8de) ^ -(v62 - v62 * 2)) + (v62 - v62 * 2 + 22306 + (~(unsigned int)(v62 - v62 * 2) | 0xffffffffffffa8de) & -(v62 - v62 * 2)) * 2;
    v65 = (v63 & 22305) - (v61 + 22309) + (v61 + 22309 - (v63 & 22305)) * 2;
    v0 = (v64 ^ v65) + (v64 & v65) * 2 - 1;
    v1 = (v62 + ((0xfffffffffffffffc - v61 | 43231) + v62) * 2 + ((0xffffffff ^ (unsigned int)v63 * 2) & 86462) + 0xffffffffffff5720 | 1) + (~v59 | 0xfffffffffffffffe);
    v66 = (unsigned int)(v1 - (unsigned int)v1 * 4) + v0 + (unsigned int)v1 * 4;
    v67 = (v66 + 1 ^ v51) + (v66 + 1 & v51) * 2;
    g_f1211c = ((unsigned short)(v67 - 1) ^ (unsigned short)-(v66 | v51)) + (((unsigned short)-v67 | (unsigned short)-(v66 | v51)) + (unsigned short)v67) * 2;
    v68 = v1;
    v69 = v0;
    v70 = v68 + ~v68 * 2;
    v71 = v70 + 1;
    v72 = (v70 ^ ~(v71 | v69)) + ((v71 | v69) & ~v70) * 2;
    v73 = v72 + (v71 & v69) + v68 + (-v72 & ~((v71 & v69) + v68)) * 2 + ((v71 & v69) + v68 - (v72 + ((v71 & v69) + v68 | -v72))) * 2;
    v74 = ((((v69 | v68) & -v69) * 4 + ((v69 | v68) ^ -v69) * 2 | 1) ^ v69 + v71 + 1) + ((((v69 | v68) & -v69) * 4 + ((v69 | v68) ^ -v69) * 2 | 1) & v69 + v71 + 1) * 2;
    v75 = 1 - v74;
    v76 = (v74 - 2 & v73) + v75 - (v75 & v73);
    v77 = ((v75 | ~v73) + v73) * 2;
    v78 = (0xfffffffffffffffd - v77 & v76) - (v77 + v76 * 2) + (v77 + 2 & v76);
    v79 = v78 - 4;
    v80 = 2 - v78;
    v81 = v78 - 3;
    v82 = ~v79;
    v83 = (33 - v78 ^ -(v80 | 31)) + (33 - v78 & -(v80 | 31)) * 2;
    v0 = ((0xffffffff ^ (unsigned int)v80 * 2) & 36) - v79 + ((v81 | 18) + v82) * 2 - 21;
    v1 = (v81 | 0xffffffffffffffe0) + v82 + 31 - ((v83 & 0xffffffffffffffe0 - ((v81 | 0xffffffffffffffe0) + v82)) + (v83 & (v81 | 0xffffffffffffffe0) + v82 + 31)) + v83 * 2;
    v84 = (((v0 + 1 + ~v0 * 2 | v1) ^ -(v0 + 1 + ~v0 * 2)) + ((v0 + 1 + ~v0 * 2 | v1) & -(v0 + 1 + ~v0 * 2)) * 2 ^ v1 + v0 + 1 - (v1 | v0) + (v1 ^ v0)) + (((v0 + 1 + ~v0 * 2 | v1) ^ -(v0 + 1 + ~v0 * 2)) + ((v0 + 1 + ~v0 * 2 | v1) & -(v0 + 1 + ~v0 * 2)) * 2 & v1 + v0 + 1 - (v1 | v0) + (v1 ^ v0)) * 2;
    g_f1211e = v3 >> ((char)~v84 + (char)v84 * 2 & 63);
    v85 = g_f04690 | g_f12118;
    v86 = (~g_f12118 & ~g_f04690) + v85 * 2 + 1;
    v87 = g_f12118 + g_f04690;
    v88 = -((v87 ^ -v85) + (v87 & -v85) * 2);
    g_f04690 = (v88 ^ (unsigned short)v86) + ((unsigned short)v86 + (v88 | (unsigned short)~v86)) * 2 + 2;
    v89 = g_f04692 + g_f1211a + ~g_f1211a * 2 + 2;
    v90 = 1 | (g_f1211a & ~g_f04692) * 2;
    g_f04692 = (v90 ^ v89) + (v90 & v89) * 2 - 1;
    v91 = (0xffffffff ^ g_f04694 * 2) + g_f04694 + g_f1211c;
    v92 = ~v91 - (g_f04694 | ~g_f1211c);
    v93 = g_f04694 - g_f1211c;
    g_f04694 = (unsigned short)v93 + ((unsigned short)v92 & (unsigned short)v91) * 4 + ((unsigned short)v92 ^ (unsigned short)v91) * 2 + ((unsigned short)v93 & (unsigned short)~((v92 & v91) * 4 + (v92 ^ v91) * 2)) + (((unsigned short)v92 & (unsigned short)v91) * 4 + ((unsigned short)v92 ^ (unsigned short)v91) * 2 | (unsigned short)~v93) + 1;
    v94 = g_f04696 | g_f1211e;
    v95 = (~g_f1211e & ~g_f04696) + (unsigned short)v94 * 2;
    v96 = g_f1211e + g_f04696;
    v97 = (v96 ^ -v94) + (v96 & -v94) * 2;
    g_f04696 = v95 + 2 + v97 + ((-v97 | (unsigned int)(0xfffffffe - v95)) + v95 + 2 + (-v97 & (unsigned int)(0xfffffffe - v95))) * 2 - 1;
    v98 = v3 + ~g_f04698;
    v99 = -(v3 | ~g_f04698);
    g_f04698 = g_f04698 - v3 + (v98 ^ v99) * 2 + (v98 & v99) * 4;
    return v87 ^ -v85;
}
