/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xacd334..0xacdc60 (2348 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_acd334_0 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_acd334_0;

extern char g_df88d0;
extern st_acd334_0 g_df89d0;
extern st_acd334_0 g_df8dd0;
extern st_acd334_0 g_df91d0;
extern st_acd334_0 g_df95d0;
extern char g_1000000;

long long sub_acd334(unsigned int *a0, char *a1, unsigned int *a2)
{
    unsigned long v0;  // x8
    unsigned long v1;  // x9
    unsigned int v10;  // w13
    unsigned long long v11;  // x12
    unsigned int v12;  // w12
    unsigned int v13;  // w14
    unsigned int v14;  // w11
    unsigned long long v15;  // x12
    unsigned int v16;  // w12
    unsigned int v17;  // w15
    unsigned long long v18;  // x10
    unsigned int v19;  // w10
    unsigned int v2;  // w11
    unsigned int v20;  // w16
    unsigned int v21;  // w12
    unsigned int v22;  // w13
    unsigned int v23;  // w17
    unsigned int v24;  // w14
    unsigned int v25;  // w17
    unsigned int v26;  // w0
    unsigned int v27;  // w15
    unsigned int v28;  // w17
    unsigned int v29;  // w16
    unsigned long v3;  // x8
    unsigned int v30;  // w17
    unsigned int v31;  // w13
    unsigned int v32;  // w17
    unsigned int v33;  // w14
    unsigned int v34;  // w17
    unsigned int v35;  // w0
    unsigned int v36;  // w15
    unsigned int v37;  // w17
    unsigned int v38;  // w16
    unsigned int v39;  // w17
    unsigned long v4;  // x9
    unsigned int v40;  // w13
    unsigned int v41;  // w17
    unsigned int v42;  // w14
    unsigned int v43;  // w17
    unsigned int v44;  // w0
    unsigned int v45;  // w15
    unsigned int v46;  // w17
    unsigned int v47;  // w16
    unsigned int v48;  // w17
    unsigned int v49;  // w13
    unsigned int v5;  // w10
    unsigned int v50;  // w17
    unsigned int v51;  // w14
    unsigned int v52;  // w17
    unsigned int v53;  // w0
    unsigned int v54;  // w15
    unsigned int v55;  // w17
    unsigned int v56;  // w16
    unsigned int v57;  // w17
    unsigned int v58;  // w13
    unsigned int v59;  // w17
    unsigned int v6;  // w9
    unsigned int v60;  // w14
    unsigned int v61;  // w0
    unsigned int v62;  // w17
    unsigned int v63;  // w17
    unsigned int v64;  // w15
    unsigned int v65;  // w16
    unsigned int v66;  // w15
    unsigned int v67;  // w15
    unsigned int v68;  // w13
    unsigned int v69;  // w14
    unsigned long long v7;  // x13
    unsigned int v70;  // w0
    unsigned int v71;  // w13
    unsigned int v72;  // w13
    unsigned int v73;  // w17
    unsigned int v74;  // w9
    unsigned long long v75;  // x10
    unsigned int v76;  // w10
    unsigned int v77;  // w10
    unsigned long long v78;  // x11
    unsigned int v79;  // w11
    unsigned int v8;  // w13
    unsigned int v80;  // w11
    unsigned int v81;  // w12
    unsigned long long v82;  // x14
    unsigned long v83;  // x0
    unsigned int v84;  // w14
    unsigned int v85;  // w13
    unsigned long long v86;  // x12
    unsigned int v87;  // w8
    unsigned int v88;  // w8

    v0 = *a0;
    v1 = a0[1];
    v2 = (((((v1 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v1 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v1 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v1 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    v3 = a0[2];
    v4 = a0[3];
    v5 = (((((v3 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v3 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v3 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v3 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    v6 = (((((v4 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v4 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v4 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v4 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    v7 = v5 ^ a2[31] ^ v6 ^ v2;
    v8 = (&g_df88d0)[v7 >> 24] * &g_1000000 | (&g_df88d0)[(v7 * 0x1000000000000 | v7 >> 16) & 0xffff0000000000ff & 0xff] * 0x10000 | (&g_df88d0)[(v7 * 0x100000000000000 | v7 >> 8) & 0xff000000000000ff & 0xff] * 0x100 | (&g_df88d0)[v7 & 0xff];
    v10 = (unsigned int)((((((v0 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v0 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v0 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v0 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) ^ (v8 * 4 | v8 >> 30) ^ (v8 * 0x400 | v8 >> 22) ^ (v8 * 0x40000 | v8 >> 14) ^ (v8 * &g_1000000 | v8 >> 8) ^ v8;
    v11 = v5 ^ a2[30] ^ v6 ^ v10;
    v12 = (&g_df88d0)[v11 >> 24] * &g_1000000 | (&g_df88d0)[(v11 * 0x1000000000000 | v11 >> 16) & 0xffff0000000000ff & 0xff] * 0x10000 | (&g_df88d0)[(v11 * 0x100000000000000 | v11 >> 8) & 0xff000000000000ff & 0xff] * 0x100 | (&g_df88d0)[v11 & 0xff];
    v13 = (v12 * 4 | v12 >> 30) ^ (v12 * 0x400 | v12 >> 22) ^ (v12 * 0x40000 | v12 >> 14) ^ (v12 * &g_1000000 | v12 >> 8) ^ v2 ^ v12;
    v14 = v13 ^ v10;
    v15 = a2[29] ^ v6 ^ v14;
    v16 = (&g_df88d0)[v15 >> 24] * &g_1000000 | (&g_df88d0)[(v15 * 0x1000000000000 | v15 >> 16) & 0xffff0000000000ff & 0xff] * 0x10000 | (&g_df88d0)[(v15 * 0x100000000000000 | v15 >> 8) & 0xff000000000000ff & 0xff] * 0x100 | (&g_df88d0)[v15 & 0xff];
    v17 = (v16 * 4 | v16 >> 30) ^ (v16 * 0x400 | v16 >> 22) ^ (v16 * 0x40000 | v16 >> 14) ^ (v16 * &g_1000000 | v16 >> 8) ^ v5 ^ v16;
    v18 = v14 ^ a2[28] ^ v17;
    v19 = (&g_df88d0)[v18 >> 24] * &g_1000000 | (&g_df88d0)[(v18 * 0x1000000000000 | v18 >> 16) & 0xffff0000000000ff & 0xff] * 0x10000 | (&g_df88d0)[(v18 * 0x100000000000000 | v18 >> 8) & 0xff000000000000ff & 0xff] * 0x100 | (&g_df88d0)[v18 & 0xff];
    v20 = (v19 * 4 | v19 >> 30) ^ (v19 * 0x400 | v19 >> 22) ^ (v19 * 0x40000 | v19 >> 14) ^ (v19 * &g_1000000 | v19 >> 8) ^ v6 ^ v19;
    v21 = v17 ^ a2[27] ^ v13 ^ v20;
    v22 = (&g_df89d0.field_0)[v21 >> 24] ^ (&g_df8dd0.field_0)[__ROL__(v21, 16) & 0xffff00ff & 0xff] ^ (&g_df91d0.field_0)[__ROL__(v21, 24) & 0xff0000ff & 0xff] ^ (&g_df95d0.field_0)[v21 & 0xff] ^ v10;
    v23 = v17 ^ a2[26] ^ v20 ^ v22;
    v24 = (&g_df89d0.field_0)[v23 >> 24] ^ (&g_df8dd0.field_0)[__ROL__(v23, 16) & 0xffff00ff & 0xff] ^ (&g_df91d0.field_0)[__ROL__(v23, 24) & 0xff0000ff & 0xff] ^ (&g_df95d0.field_0)[v23 & 0xff] ^ v13;
    v25 = v24 ^ v22;
    v26 = a2[25] ^ v20 ^ v25;
    v27 = (&g_df89d0.field_0)[v26 >> 24] ^ (&g_df8dd0.field_0)[__ROL__(v26, 16) & 0xffff00ff & 0xff] ^ (&g_df91d0.field_0)[__ROL__(v26, 24) & 0xff0000ff & 0xff] ^ (&g_df95d0.field_0)[v26 & 0xff] ^ v17;
    v28 = a2[24] ^ v25 ^ v27;
    v29 = (&g_df89d0.field_0)[v28 >> 24] ^ (&g_df8dd0.field_0)[__ROL__(v28, 16) & 0xffff00ff & 0xff] ^ (&g_df91d0.field_0)[__ROL__(v28, 24) & 0xff0000ff & 0xff] ^ (&g_df95d0.field_0)[v28 & 0xff] ^ v20;
    v30 = v27 ^ a2[23] ^ v24 ^ v29;
    v31 = (&g_df89d0.field_0)[v30 >> 24] ^ (&g_df8dd0.field_0)[__ROL__(v30, 16) & 0xffff00ff & 0xff] ^ (&g_df91d0.field_0)[__ROL__(v30, 24) & 0xff0000ff & 0xff] ^ (&g_df95d0.field_0)[v30 & 0xff] ^ v22;
    v32 = v27 ^ a2[22] ^ v29 ^ v31;
    v33 = (&g_df89d0.field_0)[v32 >> 24] ^ (&g_df8dd0.field_0)[__ROL__(v32, 16) & 0xffff00ff & 0xff] ^ (&g_df91d0.field_0)[__ROL__(v32, 24) & 0xff0000ff & 0xff] ^ (&g_df95d0.field_0)[v32 & 0xff] ^ v24;
    v34 = v33 ^ v31;
    v35 = a2[21] ^ v29 ^ v34;
    v36 = (&g_df89d0.field_0)[v35 >> 24] ^ (&g_df8dd0.field_0)[__ROL__(v35, 16) & 0xffff00ff & 0xff] ^ (&g_df91d0.field_0)[__ROL__(v35, 24) & 0xff0000ff & 0xff] ^ (&g_df95d0.field_0)[v35 & 0xff] ^ v27;
    v37 = a2[20] ^ v34 ^ v36;
    v38 = (&g_df89d0.field_0)[v37 >> 24] ^ (&g_df8dd0.field_0)[__ROL__(v37, 16) & 0xffff00ff & 0xff] ^ (&g_df91d0.field_0)[__ROL__(v37, 24) & 0xff0000ff & 0xff] ^ (&g_df95d0.field_0)[v37 & 0xff] ^ v29;
    v39 = v36 ^ a2[19] ^ v33 ^ v38;
    v40 = (&g_df89d0.field_0)[v39 >> 24] ^ (&g_df8dd0.field_0)[__ROL__(v39, 16) & 0xffff00ff & 0xff] ^ (&g_df91d0.field_0)[__ROL__(v39, 24) & 0xff0000ff & 0xff] ^ (&g_df95d0.field_0)[v39 & 0xff] ^ v31;
    v41 = v36 ^ a2[18] ^ v38 ^ v40;
    v42 = (&g_df89d0.field_0)[v41 >> 24] ^ (&g_df8dd0.field_0)[__ROL__(v41, 16) & 0xffff00ff & 0xff] ^ (&g_df91d0.field_0)[__ROL__(v41, 24) & 0xff0000ff & 0xff] ^ (&g_df95d0.field_0)[v41 & 0xff] ^ v33;
    v43 = v42 ^ v40;
    v44 = a2[0x11] ^ v38 ^ v43;
    v45 = (&g_df89d0.field_0)[v44 >> 24] ^ (&g_df8dd0.field_0)[__ROL__(v44, 16) & 0xffff00ff & 0xff] ^ (&g_df91d0.field_0)[__ROL__(v44, 24) & 0xff0000ff & 0xff] ^ (&g_df95d0.field_0)[v44 & 0xff] ^ v36;
    v46 = a2[16] ^ v43 ^ v45;
    v47 = (&g_df89d0.field_0)[v46 >> 24] ^ (&g_df8dd0.field_0)[__ROL__(v46, 16) & 0xffff00ff & 0xff] ^ (&g_df91d0.field_0)[__ROL__(v46, 24) & 0xff0000ff & 0xff] ^ (&g_df95d0.field_0)[v46 & 0xff] ^ v38;
    v48 = v45 ^ a2[15] ^ v42 ^ v47;
    v49 = (&g_df89d0.field_0)[v48 >> 24] ^ (&g_df8dd0.field_0)[__ROL__(v48, 16) & 0xffff00ff & 0xff] ^ (&g_df91d0.field_0)[__ROL__(v48, 24) & 0xff0000ff & 0xff] ^ (&g_df95d0.field_0)[v48 & 0xff] ^ v40;
    v50 = v45 ^ a2[14] ^ v47 ^ v49;
    v51 = (&g_df89d0.field_0)[v50 >> 24] ^ (&g_df8dd0.field_0)[__ROL__(v50, 16) & 0xffff00ff & 0xff] ^ (&g_df91d0.field_0)[__ROL__(v50, 24) & 0xff0000ff & 0xff] ^ (&g_df95d0.field_0)[v50 & 0xff] ^ v42;
    v52 = v51 ^ v49;
    v53 = a2[13] ^ v47 ^ v52;
    v54 = (&g_df89d0.field_0)[v53 >> 24] ^ (&g_df8dd0.field_0)[__ROL__(v53, 16) & 0xffff00ff & 0xff] ^ (&g_df91d0.field_0)[__ROL__(v53, 24) & 0xff0000ff & 0xff] ^ (&g_df95d0.field_0)[v53 & 0xff] ^ v45;
    v55 = a2[12] ^ v52 ^ v54;
    v56 = (&g_df89d0.field_0)[v55 >> 24] ^ (&g_df8dd0.field_0)[__ROL__(v55, 16) & 0xffff00ff & 0xff] ^ (&g_df91d0.field_0)[__ROL__(v55, 24) & 0xff0000ff & 0xff] ^ (&g_df95d0.field_0)[v55 & 0xff] ^ v47;
    v57 = v54 ^ a2[11] ^ v51 ^ v56;
    v58 = (&g_df89d0.field_0)[v57 >> 24] ^ (&g_df8dd0.field_0)[__ROL__(v57, 16) & 0xffff00ff & 0xff] ^ (&g_df91d0.field_0)[__ROL__(v57, 24) & 0xff0000ff & 0xff] ^ (&g_df95d0.field_0)[v57 & 0xff] ^ v49;
    v59 = v54 ^ a2[10] ^ v56 ^ v58;
    v60 = (&g_df89d0.field_0)[v59 >> 24] ^ (&g_df8dd0.field_0)[__ROL__(v59, 16) & 0xffff00ff & 0xff] ^ (&g_df91d0.field_0)[__ROL__(v59, 24) & 0xff0000ff & 0xff] ^ (&g_df95d0.field_0)[v59 & 0xff] ^ v51;
    v61 = v60 ^ v58;
    v62 = a2[9] ^ v56 ^ v61;
    v63 = (&g_df89d0.field_0)[v62 >> 24] ^ (&g_df8dd0.field_0)[__ROL__(v62, 16) & 0xffff00ff & 0xff] ^ (&g_df91d0.field_0)[__ROL__(v62, 24) & 0xff0000ff & 0xff] ^ (&g_df95d0.field_0)[v62 & 0xff] ^ v54;
    v64 = a2[8] ^ v61 ^ v63;
    v65 = (&g_df89d0.field_0)[v64 >> 24] ^ (&g_df8dd0.field_0)[__ROL__(v64, 16) & 0xffff00ff & 0xff] ^ (&g_df91d0.field_0)[__ROL__(v64, 24) & 0xff0000ff & 0xff] ^ (&g_df95d0.field_0)[v64 & 0xff] ^ v56;
    v66 = v63 ^ a2[7] ^ v60 ^ v65;
    v67 = (&g_df89d0.field_0)[v66 >> 24] ^ (&g_df8dd0.field_0)[__ROL__(v66, 16) & 0xffff00ff & 0xff] ^ (&g_df91d0.field_0)[__ROL__(v66, 24) & 0xff0000ff & 0xff] ^ (&g_df95d0.field_0)[v66 & 0xff] ^ v58;
    v68 = v63 ^ a2[6] ^ v65 ^ v67;
    v69 = (&g_df89d0.field_0)[v68 >> 24] ^ (&g_df8dd0.field_0)[__ROL__(v68, 16) & 0xffff00ff & 0xff] ^ (&g_df91d0.field_0)[__ROL__(v68, 24) & 0xff0000ff & 0xff] ^ (&g_df95d0.field_0)[v68 & 0xff] ^ v60;
    v70 = v69 ^ v67;
    v71 = a2[5] ^ v65 ^ v70;
    v72 = (&g_df89d0.field_0)[v71 >> 24] ^ (&g_df8dd0.field_0)[__ROL__(v71, 16) & 0xffff00ff & 0xff] ^ (&g_df91d0.field_0)[__ROL__(v71, 24) & 0xff0000ff & 0xff] ^ (&g_df95d0.field_0)[v71 & 0xff] ^ v63;
    v73 = a2[4] ^ v70 ^ v72;
    v74 = (&g_df89d0.field_0)[v73 >> 24] ^ (&g_df8dd0.field_0)[__ROL__(v73, 16) & 0xffff00ff & 0xff] ^ (&g_df91d0.field_0)[__ROL__(v73, 24) & 0xff0000ff & 0xff] ^ (&g_df95d0.field_0)[v73 & 0xff] ^ v65;
    v75 = v72 ^ a2[3] ^ v69 ^ v74;
    v76 = (&g_df88d0)[v75 >> 24] * &g_1000000 | (&g_df88d0)[(v75 * 0x1000000000000 | v75 >> 16) & 0xffff0000000000ff & 0xff] * 0x10000 | (&g_df88d0)[(v75 * 0x100000000000000 | v75 >> 8) & 0xff000000000000ff & 0xff] * 0x100 | (&g_df88d0)[v75 & 0xff];
    v77 = (v76 * 4 | v76 >> 30) ^ (v76 * 0x400 | v76 >> 22) ^ (v76 * 0x40000 | v76 >> 14) ^ (v76 * &g_1000000 | v76 >> 8) ^ v67 ^ v76;
    v78 = v72 ^ a2[2] ^ v74 ^ v77;
    v79 = (&g_df88d0)[v78 >> 24] * &g_1000000 | (&g_df88d0)[(v78 * 0x1000000000000 | v78 >> 16) & 0xffff0000000000ff & 0xff] * 0x10000 | (&g_df88d0)[(v78 * 0x100000000000000 | v78 >> 8) & 0xff000000000000ff & 0xff] * 0x100 | (&g_df88d0)[v78 & 0xff];
    v80 = (v79 * 4 | v79 >> 30) ^ (v79 * 0x400 | v79 >> 22) ^ (v79 * 0x40000 | v79 >> 14) ^ (v79 * &g_1000000 | v79 >> 8) ^ v69 ^ v79;
    v81 = v80 ^ v77;
    v82 = a2[1] ^ v74 ^ v81;
    v83 = (&g_df88d0)[(v82 * 0x100000000000000 | v82 >> 8) & 0xff000000000000ff & 0xff];
    v84 = (&g_df88d0)[v82 >> 24] * &g_1000000 | (&g_df88d0)[(v82 * 0x1000000000000 | v82 >> 16) & 0xffff0000000000ff & 0xff] * 0x10000 | (unsigned int)v83 * 0x100 | (&g_df88d0)[v82 & 0xff];
    v85 = (v84 * 4 | v84 >> 30) ^ (v84 * 0x400 | v84 >> 22) ^ (v84 * 0x40000 | v84 >> 14) ^ (v84 * &g_1000000 | v84 >> 8) ^ v72 ^ v84;
    v86 = v81 ^ *a2 ^ v85;
    v87 = (&g_df88d0)[v86 >> 24] * &g_1000000 | (&g_df88d0)[(v86 * 0x1000000000000 | v86 >> 16) & 0xffff0000000000ff & 0xff] * 0x10000 | (&g_df88d0)[(v86 * 0x100000000000000 | v86 >> 8) & 0xff000000000000ff & 0xff] * 0x100 | (&g_df88d0)[v86 & 0xff];
    v88 = (v87 * 4 | v87 >> 30) ^ (v87 * 0x400 | v87 >> 22) ^ (v87 * 0x40000 | v87 >> 14) ^ (v87 * &g_1000000 | v87 >> 8) ^ v74 ^ v87;
    *a1 = v88 >> 24;
    a1[1] = v88 >> 16;
    a1[2] = v88 >> 8;
    a1[3] = v88;
    a1[4] = v85 >> 24;
    a1[5] = v85 >> 16;
    a1[6] = v85 >> 8;
    a1[7] = v85;
    a1[8] = v80 >> 24;
    a1[9] = v80 >> 16;
    a1[10] = v80 >> 8;
    a1[11] = v80;
    a1[12] = v77 >> 24;
    a1[13] = v77 >> 16;
    a1[14] = v77 >> 8;
    a1[15] = v77;
    return v83;
}
