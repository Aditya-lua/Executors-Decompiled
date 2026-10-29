/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fa5c0..0x9fb3ec (3628 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9fa5c0_0 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_9fa5c0_0;

extern st_9fa5c0_0 g_d360a8;
extern st_9fa5c0_0 g_d361a8;
extern st_9fa5c0_0 g_d362a8;
extern st_9fa5c0_0 g_d363a8;
extern st_9fa5c0_0 g_d364a8;
extern st_9fa5c0_0 g_d366a8;
extern st_9fa5c0_0 g_d367a8;

unsigned int * sub_9fa5c0(unsigned int *a0, unsigned int *a1, unsigned int a2)
{
    unsigned int v0;  // w16
    unsigned int v1;  // w17
    unsigned int v10;  // w17
    unsigned int v11;  // w3
    unsigned int v12;  // w2
    unsigned int v13;  // w16
    unsigned int v14;  // w3
    unsigned int v15;  // w2
    unsigned int v16;  // w17
    unsigned int v17;  // w3
    unsigned int v18;  // w2
    unsigned int v19;  // w16
    unsigned int v2;  // w10
    unsigned int v20;  // w3
    unsigned int v21;  // w2
    unsigned int v22;  // w17
    unsigned int v23;  // w3
    unsigned int v24;  // w2
    unsigned int v25;  // w16
    unsigned int v26;  // w3
    unsigned int v27;  // w2
    unsigned int v28;  // w17
    unsigned int v29;  // w3
    unsigned int v3;  // w11
    unsigned int v30;  // w2
    unsigned int v31;  // w16
    unsigned int v32;  // w3
    unsigned int v33;  // w2
    unsigned int v34;  // w17
    unsigned int v35;  // w3
    unsigned int v36;  // w2
    unsigned int v37;  // w16
    unsigned int v38;  // w3
    unsigned int v39;  // w2
    unsigned int v4;  // w17
    unsigned int v40;  // w17
    unsigned int v41;  // w2
    unsigned int v42;  // w3
    unsigned int v43;  // w16
    unsigned int v44;  // w3
    unsigned int v45;  // w2
    unsigned int v46;  // w9
    unsigned int *v47;  // x11
    unsigned long long v48;  // x10
    unsigned int v49;  // w10
    unsigned int v5;  // w3
    unsigned int v50;  // w11
    unsigned int v51;  // w17
    unsigned int v52;  // w3
    unsigned int v53;  // w2
    unsigned int v54;  // w16
    unsigned int v55;  // w3
    unsigned int v56;  // w2
    unsigned int v57;  // w17
    unsigned int v58;  // w3
    unsigned int v59;  // w2
    unsigned int v6;  // w2
    unsigned int v60;  // w16
    unsigned int v61;  // w3
    unsigned int v62;  // w2
    unsigned int v63;  // w17
    unsigned int v64;  // w3
    unsigned int v65;  // w2
    unsigned int v66;  // w16
    unsigned int v67;  // w3
    unsigned int v68;  // w2
    unsigned int v69;  // w17
    unsigned int v7;  // w16
    unsigned int v70;  // w3
    unsigned int v71;  // w2
    unsigned int v72;  // w16
    unsigned int v73;  // w3
    unsigned int v74;  // w2
    unsigned int v75;  // w17
    unsigned int v76;  // w3
    unsigned int v77;  // w2
    unsigned int v78;  // w16
    unsigned int v79;  // w3
    unsigned int v8;  // w3
    unsigned int v80;  // w2
    unsigned int v81;  // w17
    unsigned int v82;  // w3
    unsigned int v83;  // w2
    unsigned int v84;  // w16
    unsigned int v85;  // w3
    unsigned int v86;  // w2
    unsigned int v87;  // w17
    unsigned int v88;  // w2
    unsigned int v89;  // w3
    unsigned int v9;  // w2
    unsigned int v90;  // w3
    unsigned int v91;  // w2
    unsigned int *v92;  // x11
    unsigned int v93;  // w11
    unsigned int v94;  // w10
    unsigned int v95;  // w8

    v0 = __ROL__(*a0, 3);
    v1 = __ROL__(a0[1], 3);
    if (a2)
    {
        v2 = a1[1];
        v3 = *a1 ^ v0;
        v4 = (&g_d360a8.field_0)[__ROL__(v3, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v3, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v3, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v3 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v2 ^ v0, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v2 ^ v0, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v2 ^ v0, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v2 ^ v0, 28) >> 26] ^ v1;
        v5 = a1[3];
        v6 = v4 ^ a1[2];
        v7 = (&g_d360a8.field_0)[__ROL__(v6, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v6, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v6, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v6 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v4 ^ v5, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v4 ^ v5, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v4 ^ v5, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v4 ^ v5, 28) >> 26] ^ v0;
        v8 = a1[5];
        v9 = v7 ^ a1[4];
        v10 = (&g_d360a8.field_0)[__ROL__(v9, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v9, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v9, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v9 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v7 ^ v8, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v7 ^ v8, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v7 ^ v8, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v7 ^ v8, 28) >> 26] ^ v4;
        v11 = a1[7];
        v12 = v10 ^ a1[6];
        v13 = (&g_d360a8.field_0)[__ROL__(v12, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v12, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v12, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v12 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v10 ^ v11, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v10 ^ v11, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v10 ^ v11, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v10 ^ v11, 28) >> 26] ^ v7;
        v14 = a1[9];
        v15 = v13 ^ a1[8];
        v16 = (&g_d360a8.field_0)[__ROL__(v15, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v15, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v15, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v15 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v13 ^ v14, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v13 ^ v14, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v13 ^ v14, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v13 ^ v14, 28) >> 26] ^ v10;
        v17 = a1[11];
        v18 = v16 ^ a1[10];
        v19 = (&g_d360a8.field_0)[__ROL__(v18, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v18, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v18, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v18 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v16 ^ v17, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v16 ^ v17, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v16 ^ v17, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v16 ^ v17, 28) >> 26] ^ v13;
        v20 = a1[13];
        v21 = v19 ^ a1[12];
        v22 = (&g_d360a8.field_0)[__ROL__(v21, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v21, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v21, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v21 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v19 ^ v20, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v19 ^ v20, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v19 ^ v20, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v19 ^ v20, 28) >> 26] ^ v16;
        v23 = a1[15];
        v24 = v22 ^ a1[14];
        v25 = (&g_d360a8.field_0)[__ROL__(v24, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v24, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v24, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v24 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v22 ^ v23, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v22 ^ v23, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v22 ^ v23, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v22 ^ v23, 28) >> 26] ^ v19;
        v26 = a1[0x11];
        v27 = v25 ^ a1[16];
        v28 = (&g_d360a8.field_0)[__ROL__(v27, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v27, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v27, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v27 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v25 ^ v26, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v25 ^ v26, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v25 ^ v26, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v25 ^ v26, 28) >> 26] ^ v22;
        v29 = a1[19];
        v30 = v28 ^ a1[18];
        v31 = (&g_d360a8.field_0)[__ROL__(v30, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v30, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v30, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v30 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v28 ^ v29, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v28 ^ v29, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v28 ^ v29, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v28 ^ v29, 28) >> 26] ^ v25;
        v32 = a1[21];
        v33 = v31 ^ a1[20];
        v34 = (&g_d360a8.field_0)[__ROL__(v33, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v33, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v33, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v33 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v31 ^ v32, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v31 ^ v32, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v31 ^ v32, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v31 ^ v32, 28) >> 26] ^ v28;
        v35 = a1[23];
        v36 = v34 ^ a1[22];
        v37 = (&g_d360a8.field_0)[__ROL__(v36, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v36, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v36, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v36 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v34 ^ v35, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v34 ^ v35, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v34 ^ v35, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v34 ^ v35, 28) >> 26] ^ v31;
        v38 = a1[25];
        v39 = v37 ^ a1[24];
        v40 = (&g_d360a8.field_0)[__ROL__(v39, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v39, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v39, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v39 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v37 ^ v38, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v37 ^ v38, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v37 ^ v38, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v37 ^ v38, 28) >> 26] ^ v34;
        v41 = v40 ^ a1[26];
        v42 = __ROL__(v40 ^ a1[27], 28);
        v43 = (&g_d360a8.field_0)[__ROL__(v41, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v41, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v41, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v41 >> 26] ^ (&g_d361a8.field_0)[__ROL__(v42, 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(v42, 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(v42, 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[v42 >> 26] ^ v37;
        v44 = a1[29];
        v45 = v43 ^ a1[28];
        v46 = (&g_d360a8.field_0)[__ROL__(v45, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v45, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v45, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v45 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v43 ^ v44, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v43 ^ v44, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v43 ^ v44, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v43 ^ v44, 28) >> 26] ^ v40;
        v47 = a1 + 30;
        v48 = 124;
    }
    else
    {
        v49 = a1[31];
        v50 = a1[30] ^ v0;
        v51 = (&g_d360a8.field_0)[__ROL__(v50, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v50, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v50, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v50 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v49 ^ v0, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v49 ^ v0, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v49 ^ v0, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v49 ^ v0, 28) >> 26] ^ v1;
        v52 = a1[29];
        v53 = v51 ^ a1[28];
        v54 = (&g_d360a8.field_0)[__ROL__(v53, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v53, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v53, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v53 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v51 ^ v52, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v51 ^ v52, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v51 ^ v52, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v51 ^ v52, 28) >> 26] ^ v0;
        v55 = a1[27];
        v56 = v54 ^ a1[26];
        v57 = (&g_d360a8.field_0)[__ROL__(v56, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v56, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v56, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v56 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v54 ^ v55, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v54 ^ v55, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v54 ^ v55, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v54 ^ v55, 28) >> 26] ^ v51;
        v58 = a1[25];
        v59 = v57 ^ a1[24];
        v60 = (&g_d360a8.field_0)[__ROL__(v59, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v59, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v59, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v59 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v57 ^ v58, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v57 ^ v58, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v57 ^ v58, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v57 ^ v58, 28) >> 26] ^ v54;
        v61 = a1[23];
        v62 = v60 ^ a1[22];
        v63 = (&g_d360a8.field_0)[__ROL__(v62, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v62, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v62, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v62 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v60 ^ v61, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v60 ^ v61, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v60 ^ v61, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v60 ^ v61, 28) >> 26] ^ v57;
        v64 = a1[21];
        v65 = v63 ^ a1[20];
        v66 = (&g_d360a8.field_0)[__ROL__(v65, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v65, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v65, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v65 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v63 ^ v64, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v63 ^ v64, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v63 ^ v64, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v63 ^ v64, 28) >> 26] ^ v60;
        v67 = a1[19];
        v68 = v66 ^ a1[18];
        v69 = (&g_d360a8.field_0)[__ROL__(v68, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v68, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v68, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v68 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v66 ^ v67, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v66 ^ v67, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v66 ^ v67, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v66 ^ v67, 28) >> 26] ^ v63;
        v70 = a1[0x11];
        v71 = v69 ^ a1[16];
        v72 = (&g_d360a8.field_0)[__ROL__(v71, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v71, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v71, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v71 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v69 ^ v70, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v69 ^ v70, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v69 ^ v70, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v69 ^ v70, 28) >> 26] ^ v66;
        v73 = a1[15];
        v74 = v72 ^ a1[14];
        v75 = (&g_d360a8.field_0)[__ROL__(v74, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v74, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v74, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v74 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v72 ^ v73, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v72 ^ v73, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v72 ^ v73, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v72 ^ v73, 28) >> 26] ^ v69;
        v76 = a1[13];
        v77 = v75 ^ a1[12];
        v78 = (&g_d360a8.field_0)[__ROL__(v77, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v77, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v77, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v77 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v75 ^ v76, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v75 ^ v76, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v75 ^ v76, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v75 ^ v76, 28) >> 26] ^ v72;
        v79 = a1[11];
        v80 = v78 ^ a1[10];
        v81 = (&g_d360a8.field_0)[__ROL__(v80, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v80, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v80, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v80 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v78 ^ v79, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v78 ^ v79, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v78 ^ v79, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v78 ^ v79, 28) >> 26] ^ v75;
        v82 = a1[9];
        v83 = v81 ^ a1[8];
        v84 = (&g_d360a8.field_0)[__ROL__(v83, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v83, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v83, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v83 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v81 ^ v82, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v81 ^ v82, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v81 ^ v82, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v81 ^ v82, 28) >> 26] ^ v78;
        v85 = a1[7];
        v86 = v84 ^ a1[6];
        v87 = (&g_d360a8.field_0)[__ROL__(v86, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v86, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v86, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v86 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v84 ^ v85, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v84 ^ v85, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v84 ^ v85, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v84 ^ v85, 28) >> 26] ^ v81;
        v88 = v87 ^ a1[4];
        v89 = __ROL__(v87 ^ a1[5], 28);
        v43 = (&g_d360a8.field_0)[__ROL__(v88, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v88, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v88, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v88 >> 26] ^ (&g_d361a8.field_0)[__ROL__(v89, 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(v89, 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(v89, 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[v89 >> 26] ^ v84;
        v90 = a1[3];
        v91 = v43 ^ a1[2];
        v46 = (&g_d360a8.field_0)[__ROL__(v91, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v91, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v91, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v91 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v43 ^ v90, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v43 ^ v90, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v43 ^ v90, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v43 ^ v90, 28) >> 26] ^ v87;
        v48 = 4;
        v47 = a1;
    }
    v92 = v47;
    v93 = v46 ^ *v92;
    v94 = *(int *)((char *)a1 + v48);
    v95 = (&g_d360a8.field_0)[__ROL__(v93, 30) & 0xc000003f & 63] ^ (&g_d360a8.field_0)[128 + (__ROL__(v93, 22) & 0xffc0003f & 63)] ^ (&g_d360a8.field_0)[0x100 + (__ROL__(v93, 14) & 0xffffc03f & 63)] ^ (&g_d360a8.field_0)[384 + (v93 >> 26)] ^ (&g_d360a8.field_0)[64 + (__ROL__(__ROL__(v46 ^ v94, 28), 30) & 0xc000003f & 63)] ^ (&g_d360a8.field_0)[192 + (__ROL__(__ROL__(v46 ^ v94, 28), 22) & 0xffc0003f & 63)] ^ (&g_d360a8.field_0)[320 + (__ROL__(__ROL__(v46 ^ v94, 28), 14) & 0xffffc03f & 63)] ^ (&g_d360a8.field_0)[448 + (__ROL__(v46 ^ v94, 28) >> 26)] ^ v43;
    *a0 = v46 * 0x20000000 | v46 >> 3;
    a0[1] = v95 * 0x20000000 | v95 >> 3;
    return a0;
}
