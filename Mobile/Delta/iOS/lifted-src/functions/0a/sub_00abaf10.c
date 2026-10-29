/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xabaf10..0xabba30 (2848 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_abaf10_0 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_abaf10_0;

extern st_abaf10_0 g_df6fa4;
extern st_abaf10_0 g_df73a4;
extern st_abaf10_0 g_df77a4;
extern st_abaf10_0 g_df7ba4;

unsigned int sub_abaf10(unsigned int *a0, char *a1, unsigned int *a2)
{
    unsigned long v0;  // x8
    unsigned long v1;  // x14
    unsigned int v10;  // w17
    unsigned int v100;  // w13
    unsigned int v101;  // w17
    unsigned int v102;  // w13
    unsigned int v103;  // w12
    unsigned int v104;  // w16
    unsigned int v105;  // w17
    unsigned int v106;  // w17
    unsigned int v107;  // w16
    unsigned int v108;  // w17
    unsigned int v109;  // w16
    unsigned int v11;  // w14
    unsigned int v110;  // w14
    unsigned int v111;  // w15
    unsigned int v112;  // w17
    unsigned int v113;  // w17
    unsigned int v114;  // w15
    unsigned int v115;  // w8
    unsigned int v116;  // w9
    unsigned int v117;  // w8
    unsigned int v12;  // w15
    unsigned int v13;  // w16
    unsigned int v14;  // w17
    unsigned int v15;  // w17
    unsigned int v16;  // w16
    unsigned int v17;  // w17
    unsigned int v18;  // w12
    unsigned int v19;  // w13
    unsigned long v2;  // x8
    unsigned int v20;  // w16
    unsigned int v21;  // w17
    unsigned int v22;  // w17
    unsigned int v23;  // w16
    unsigned int v24;  // w17
    unsigned int v25;  // w14
    unsigned int v26;  // w15
    unsigned int v27;  // w16
    unsigned int v28;  // w17
    unsigned int v29;  // w17
    unsigned long v3;  // x9
    unsigned int v30;  // w16
    unsigned int v31;  // w17
    unsigned int v32;  // w12
    unsigned int v33;  // w13
    unsigned int v34;  // w16
    unsigned int v35;  // w17
    unsigned int v36;  // w17
    unsigned int v37;  // w16
    unsigned int v38;  // w17
    unsigned int v39;  // w14
    unsigned int v4;  // w12
    unsigned int v40;  // w15
    unsigned int v41;  // w16
    unsigned int v42;  // w17
    unsigned int v43;  // w17
    unsigned int v44;  // w16
    unsigned int v45;  // w17
    unsigned int v46;  // w12
    unsigned int v47;  // w13
    unsigned int v48;  // w16
    unsigned int v49;  // w17
    unsigned int v5;  // w13
    unsigned int v50;  // w17
    unsigned int v51;  // w16
    unsigned int v52;  // w17
    unsigned int v53;  // w14
    unsigned int v54;  // w15
    unsigned int v55;  // w16
    unsigned int v56;  // w17
    unsigned int v57;  // w17
    unsigned int v58;  // w16
    unsigned int v59;  // w17
    unsigned int v6;  // w16
    unsigned int v60;  // w12
    unsigned int v61;  // w13
    unsigned int v62;  // w16
    unsigned int v63;  // w17
    unsigned int v64;  // w17
    unsigned int v65;  // w16
    unsigned int v66;  // w17
    unsigned int v67;  // w14
    unsigned int v68;  // w15
    unsigned int v69;  // w16
    unsigned int v7;  // w11
    unsigned int v70;  // w17
    unsigned int v71;  // w17
    unsigned int v72;  // w16
    unsigned int v73;  // w17
    unsigned int v74;  // w12
    unsigned int v75;  // w13
    unsigned int v76;  // w16
    unsigned int v77;  // w17
    unsigned int v78;  // w17
    unsigned int v79;  // w16
    unsigned int v8;  // w17
    unsigned int v80;  // w17
    unsigned int v81;  // w14
    unsigned int v82;  // w15
    unsigned int v83;  // w16
    unsigned int v84;  // w17
    unsigned int v85;  // w17
    unsigned int v86;  // w16
    unsigned int v87;  // w17
    unsigned int v88;  // w12
    unsigned int v89;  // w16
    unsigned int v9;  // w16
    unsigned int v90;  // w13
    unsigned int v91;  // w17
    unsigned int v92;  // w17
    unsigned int v93;  // w13
    unsigned int v94;  // w17
    unsigned int v95;  // w14
    unsigned int v96;  // w15
    unsigned int v97;  // w13
    unsigned int v98;  // w17
    unsigned int v99;  // w17

    v0 = *a0;
    v1 = a0[1];
    v2 = a0[2];
    v3 = a0[3];
    v4 = (((((v2 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v2 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v2 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v2 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    v5 = (((((v3 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v3 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v3 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v3 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    v6 = *a2 ^ v4;
    v7 = v6 ^ a2[1] ^ v5;
    v8 = (&g_df73a4.field_0)[__ROL__(v7, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v7 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v7, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v7 >> 24];
    v9 = (&g_df73a4.field_0)[__ROL__(v8 + v6, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v8 + v6 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v8 + v6, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v8 + v6 >> 24];
    v10 = (&g_df73a4.field_0)[__ROL__(v9 + v8, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v9 + v8 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v9 + v8, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v9 + v8 >> 24];
    v11 = v10 + v9 ^ (unsigned int)((((((v0 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v0 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v0 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v0 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32);
    v12 = v10 ^ (unsigned int)((((((v1 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v1 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v1 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v1 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32);
    v13 = v11 ^ a2[2];
    v14 = v12 ^ a2[3] ^ v13;
    v15 = (&g_df73a4.field_0)[__ROL__(v14, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v14 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v14, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v14 >> 24];
    v16 = (&g_df73a4.field_0)[__ROL__(v15 + v13, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v15 + v13 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v15 + v13, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v15 + v13 >> 24];
    v17 = (&g_df73a4.field_0)[__ROL__(v16 + v15, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v16 + v15 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v16 + v15, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v16 + v15 >> 24];
    v18 = v17 + v16 ^ v4;
    v19 = v17 ^ v5;
    v20 = v18 ^ a2[4];
    v21 = v19 ^ a2[5] ^ v20;
    v22 = (&g_df73a4.field_0)[__ROL__(v21, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v21 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v21, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v21 >> 24];
    v23 = (&g_df73a4.field_0)[__ROL__(v22 + v20, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v22 + v20 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v22 + v20, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v22 + v20 >> 24];
    v24 = (&g_df73a4.field_0)[__ROL__(v23 + v22, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v23 + v22 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v23 + v22, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v23 + v22 >> 24];
    v25 = v24 + v23 ^ v11;
    v26 = v24 ^ v12;
    v27 = v25 ^ a2[6];
    v28 = v26 ^ a2[7] ^ v27;
    v29 = (&g_df73a4.field_0)[__ROL__(v28, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v28 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v28, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v28 >> 24];
    v30 = (&g_df73a4.field_0)[__ROL__(v29 + v27, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v29 + v27 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v29 + v27, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v29 + v27 >> 24];
    v31 = (&g_df73a4.field_0)[__ROL__(v30 + v29, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v30 + v29 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v30 + v29, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v30 + v29 >> 24];
    v32 = v31 + v30 ^ v18;
    v33 = v31 ^ v19;
    v34 = v32 ^ a2[8];
    v35 = v33 ^ a2[9] ^ v34;
    v36 = (&g_df73a4.field_0)[__ROL__(v35, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v35 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v35, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v35 >> 24];
    v37 = (&g_df73a4.field_0)[__ROL__(v36 + v34, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v36 + v34 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v36 + v34, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v36 + v34 >> 24];
    v38 = (&g_df73a4.field_0)[__ROL__(v37 + v36, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v37 + v36 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v37 + v36, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v37 + v36 >> 24];
    v39 = v38 + v37 ^ v25;
    v40 = v38 ^ v26;
    v41 = v39 ^ a2[10];
    v42 = v40 ^ a2[11] ^ v41;
    v43 = (&g_df73a4.field_0)[__ROL__(v42, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v42 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v42, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v42 >> 24];
    v44 = (&g_df73a4.field_0)[__ROL__(v43 + v41, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v43 + v41 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v43 + v41, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v43 + v41 >> 24];
    v45 = (&g_df73a4.field_0)[__ROL__(v44 + v43, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v44 + v43 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v44 + v43, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v44 + v43 >> 24];
    v46 = v45 + v44 ^ v32;
    v47 = v45 ^ v33;
    v48 = v46 ^ a2[12];
    v49 = v47 ^ a2[13] ^ v48;
    v50 = (&g_df73a4.field_0)[__ROL__(v49, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v49 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v49, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v49 >> 24];
    v51 = (&g_df73a4.field_0)[__ROL__(v50 + v48, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v50 + v48 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v50 + v48, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v50 + v48 >> 24];
    v52 = (&g_df73a4.field_0)[__ROL__(v51 + v50, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v51 + v50 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v51 + v50, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v51 + v50 >> 24];
    v53 = v52 + v51 ^ v39;
    v54 = v52 ^ v40;
    v55 = v53 ^ a2[14];
    v56 = v54 ^ a2[15] ^ v55;
    v57 = (&g_df73a4.field_0)[__ROL__(v56, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v56 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v56, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v56 >> 24];
    v58 = (&g_df73a4.field_0)[__ROL__(v57 + v55, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v57 + v55 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v57 + v55, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v57 + v55 >> 24];
    v59 = (&g_df73a4.field_0)[__ROL__(v58 + v57, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v58 + v57 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v58 + v57, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v58 + v57 >> 24];
    v60 = v59 + v58 ^ v46;
    v61 = v59 ^ v47;
    v62 = v60 ^ a2[16];
    v63 = v61 ^ a2[0x11] ^ v62;
    v64 = (&g_df73a4.field_0)[__ROL__(v63, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v63 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v63, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v63 >> 24];
    v65 = (&g_df73a4.field_0)[__ROL__(v64 + v62, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v64 + v62 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v64 + v62, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v64 + v62 >> 24];
    v66 = (&g_df73a4.field_0)[__ROL__(v65 + v64, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v65 + v64 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v65 + v64, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v65 + v64 >> 24];
    v67 = v66 + v65 ^ v53;
    v68 = v66 ^ v54;
    v69 = v67 ^ a2[18];
    v70 = v68 ^ a2[19] ^ v69;
    v71 = (&g_df73a4.field_0)[__ROL__(v70, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v70 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v70, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v70 >> 24];
    v72 = (&g_df73a4.field_0)[__ROL__(v71 + v69, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v71 + v69 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v71 + v69, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v71 + v69 >> 24];
    v73 = (&g_df73a4.field_0)[__ROL__(v72 + v71, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v72 + v71 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v72 + v71, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v72 + v71 >> 24];
    v74 = v73 + v72 ^ v60;
    v75 = v73 ^ v61;
    v76 = v74 ^ a2[20];
    v77 = v75 ^ a2[21] ^ v76;
    v78 = (&g_df73a4.field_0)[__ROL__(v77, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v77 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v77, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v77 >> 24];
    v79 = (&g_df73a4.field_0)[__ROL__(v78 + v76, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v78 + v76 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v78 + v76, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v78 + v76 >> 24];
    v80 = (&g_df73a4.field_0)[__ROL__(v79 + v78, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v79 + v78 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v79 + v78, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v79 + v78 >> 24];
    v81 = v80 + v79 ^ v67;
    v82 = v80 ^ v68;
    v83 = v81 ^ a2[22];
    v84 = v82 ^ a2[23] ^ v83;
    v85 = (&g_df73a4.field_0)[__ROL__(v84, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v84 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v84, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v84 >> 24];
    v86 = (&g_df73a4.field_0)[__ROL__(v85 + v83, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v85 + v83 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v85 + v83, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v85 + v83 >> 24];
    v87 = (&g_df73a4.field_0)[__ROL__(v86 + v85, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v86 + v85 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v86 + v85, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v86 + v85 >> 24];
    v88 = v87 + v86 ^ v74;
    v89 = v87 ^ v75;
    v90 = v88 ^ a2[24];
    v91 = v89 ^ a2[25] ^ v90;
    v92 = (&g_df73a4.field_0)[__ROL__(v91, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v91 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v91, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v91 >> 24];
    v93 = (&g_df73a4.field_0)[__ROL__(v92 + v90, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v92 + v90 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v92 + v90, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v92 + v90 >> 24];
    v94 = (&g_df73a4.field_0)[__ROL__(v93 + v92, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v93 + v92 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v93 + v92, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v93 + v92 >> 24];
    v95 = v94 + v93 ^ v81;
    v96 = v94 ^ v82;
    v97 = v95 ^ a2[26];
    v98 = v96 ^ a2[27] ^ v97;
    v99 = (&g_df73a4.field_0)[__ROL__(v98, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v98 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v98, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v98 >> 24];
    v100 = (&g_df73a4.field_0)[__ROL__(v99 + v97, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v99 + v97 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v99 + v97, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v99 + v97 >> 24];
    v101 = (&g_df73a4.field_0)[__ROL__(v100 + v99, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v100 + v99 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v100 + v99, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v100 + v99 >> 24];
    v102 = v101 + v100 ^ v88;
    v103 = v101 ^ v89;
    v104 = v102 ^ a2[28];
    v105 = v103 ^ a2[29] ^ v104;
    v106 = (&g_df73a4.field_0)[__ROL__(v105, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v105 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v105, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v105 >> 24];
    v107 = (&g_df73a4.field_0)[__ROL__(v106 + v104, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v106 + v104 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v106 + v104, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v106 + v104 >> 24];
    v108 = (&g_df73a4.field_0)[__ROL__(v107 + v106, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v107 + v106 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v107 + v106, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v107 + v106 >> 24];
    v109 = v108 + v107 ^ v95;
    v110 = v108 ^ v96;
    v111 = v109 ^ a2[30];
    v112 = v110 ^ a2[31] ^ v111;
    v113 = (&g_df73a4.field_0)[__ROL__(v112, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v112 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v112, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v112 >> 24];
    v114 = (&g_df73a4.field_0)[__ROL__(v113 + v111, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v113 + v111 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v113 + v111, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v113 + v111 >> 24];
    v115 = (&g_df73a4.field_0)[__ROL__(v114 + v113, 24) & 0xff0000ff & 0xff] ^ (&g_df6fa4.field_0)[v114 + v113 & 0xff] ^ (&g_df77a4.field_0)[__ROL__(v114 + v113, 16) & 0xffff00ff & 0xff] ^ (&g_df7ba4.field_0)[v114 + v113 >> 24];
    v116 = v115 + v114 ^ v102;
    *a1 = v116 >> 24;
    a1[1] = v116 >> 16;
    a1[2] = v116 >> 8;
    a1[3] = v116;
    v117 = v115 ^ v103;
    a1[4] = v117 >> 24;
    a1[5] = v117 >> 16;
    a1[6] = v117 >> 8;
    a1[7] = v117;
    a1[8] = v109 >> 24;
    a1[9] = v109 >> 16;
    a1[10] = v109 >> 8;
    a1[11] = v109;
    a1[12] = v110 >> 24;
    a1[13] = v110 >> 16;
    a1[14] = v110 >> 8;
    a1[15] = v110;
    return __ROL__(v114 + v113, 16) & 0xffff00ff & 0xff;
}
