/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f96d4..0x9fa5c0 (3820 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f96d4_0 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_9f96d4_0;

extern st_9f96d4_0 g_d360a8;
extern st_9f96d4_0 g_d361a8;
extern st_9f96d4_0 g_d362a8;
extern st_9f96d4_0 g_d363a8;
extern st_9f96d4_0 g_d364a8;
extern st_9f96d4_0 g_d366a8;
extern st_9f96d4_0 g_d367a8;

unsigned int * sub_9f96d4(unsigned int *a0, unsigned int *a1, unsigned int a2)
{
    unsigned int v0;  // w14
    unsigned int v1;  // w12
    unsigned int v10;  // w13
    unsigned int v100;  // w5
    unsigned int v101;  // w6
    unsigned int v102;  // w7
    unsigned int v103;  // w7
    unsigned int v104;  // w6
    unsigned int *v105;  // x15
    unsigned int v106;  // w15
    unsigned int v107;  // w14
    unsigned int v108;  // w17
    unsigned int v109;  // w1
    unsigned int v11;  // w12
    unsigned int v110;  // w13
    unsigned int v111;  // w12
    unsigned int v112;  // w11
    unsigned int v113;  // w13
    unsigned int v114;  // w11
    unsigned int v115;  // w10
    unsigned int v116;  // w11
    unsigned int v117;  // w10
    unsigned int v118;  // w9
    unsigned int v119;  // w10
    unsigned int v12;  // w14
    unsigned int v120;  // w9
    unsigned int v121;  // w11
    unsigned int v122;  // w9
    unsigned int v123;  // w10
    unsigned int v124;  // w8
    unsigned int v13;  // w4
    unsigned int v14;  // w5
    unsigned int v15;  // w14
    unsigned int v16;  // w15
    unsigned int v17;  // w5
    unsigned int v18;  // w7
    unsigned int v19;  // w6
    unsigned int v2;  // w13
    unsigned int v20;  // w4
    unsigned int v21;  // w7
    unsigned int v22;  // w6
    unsigned int v23;  // w5
    unsigned int v24;  // w7
    unsigned int v25;  // w6
    unsigned int v26;  // w4
    unsigned int v27;  // w7
    unsigned int v28;  // w6
    unsigned int v29;  // w5
    unsigned int v3;  // w14
    unsigned int v30;  // w7
    unsigned int v31;  // w6
    unsigned int v32;  // w4
    unsigned int v33;  // w7
    unsigned int v34;  // w6
    unsigned int v35;  // w5
    unsigned int v36;  // w7
    unsigned int v37;  // w6
    unsigned int v38;  // w4
    unsigned int v39;  // w7
    unsigned int v4;  // w13
    unsigned int v40;  // w6
    unsigned int v41;  // w5
    unsigned int v42;  // w7
    unsigned int v43;  // w6
    unsigned int v44;  // w4
    unsigned int v45;  // w7
    unsigned int v46;  // w6
    unsigned int v47;  // w5
    unsigned int v48;  // w7
    unsigned int v49;  // w6
    unsigned int v5;  // w12
    unsigned int v50;  // w4
    unsigned int v51;  // w7
    unsigned int v52;  // w6
    unsigned int v53;  // w5
    unsigned int v54;  // w6
    unsigned int v55;  // w7
    unsigned int v56;  // w4
    unsigned int v57;  // w7
    unsigned int v58;  // w6
    unsigned int v59;  // w13
    unsigned int v6;  // w14
    unsigned int *v60;  // x15
    unsigned long long v61;  // x14
    unsigned int v62;  // w14
    unsigned int v63;  // w15
    unsigned int v64;  // w5
    unsigned int v65;  // w7
    unsigned int v66;  // w6
    unsigned int v67;  // w4
    unsigned int v68;  // w7
    unsigned int v69;  // w6
    unsigned int v7;  // w12
    unsigned int v70;  // w5
    unsigned int v71;  // w7
    unsigned int v72;  // w6
    unsigned int v73;  // w4
    unsigned int v74;  // w7
    unsigned int v75;  // w6
    unsigned int v76;  // w5
    unsigned int v77;  // w7
    unsigned int v78;  // w6
    unsigned int v79;  // w4
    unsigned int v8;  // w13
    unsigned int v80;  // w7
    unsigned int v81;  // w6
    unsigned int v82;  // w5
    unsigned int v83;  // w7
    unsigned int v84;  // w6
    unsigned int v85;  // w4
    unsigned int v86;  // w7
    unsigned int v87;  // w6
    unsigned int v88;  // w5
    unsigned int v89;  // w7
    unsigned int v9;  // w14
    unsigned int v90;  // w6
    unsigned int v91;  // w4
    unsigned int v92;  // w7
    unsigned int v93;  // w6
    unsigned int v94;  // w5
    unsigned int v95;  // w7
    unsigned int v96;  // w6
    unsigned int v97;  // w4
    unsigned int v98;  // w7
    unsigned int v99;  // w6

    v0 = (*a0 ^ a0[1] >> 4) & 0xf0f0f0f;
    v1 = v0 ^ *a0;
    v2 = a0[1] ^ v0 * 16;
    v3 = v2 & 0xffff ^ v1 >> 16;
    v4 = v3 ^ v2;
    v5 = v1 ^ v3 * 0x10000;
    v6 = (v5 ^ v4 >> 2) & 0x33333333;
    v7 = v6 ^ v5;
    v8 = v4 ^ v6 * 4;
    v9 = (v8 ^ v7 >> 8) & 0xff00ff;
    v10 = v9 ^ v8;
    v11 = v7 ^ v9 * 0x100;
    v12 = (v11 ^ v10 >> 1) & 0x55555555;
    v13 = __ROL__(v12 ^ v11, 3);
    v14 = __ROL__(v10 ^ v12 * 2, 3);
    if (a2)
    {
        v15 = a1[1];
        v16 = *a1 ^ v13;
        v17 = (&g_d360a8.field_0)[__ROL__(v16, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v16, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v16, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v16 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v15 ^ v13, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v15 ^ v13, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v15 ^ v13, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v15 ^ v13, 28) >> 26] ^ v14;
        v18 = a1[3];
        v19 = v17 ^ a1[2];
        v20 = (&g_d360a8.field_0)[__ROL__(v19, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v19, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v19, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v19 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v17 ^ v18, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v17 ^ v18, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v17 ^ v18, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v17 ^ v18, 28) >> 26] ^ v13;
        v21 = a1[5];
        v22 = v20 ^ a1[4];
        v23 = (&g_d360a8.field_0)[__ROL__(v22, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v22, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v22, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v22 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v20 ^ v21, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v20 ^ v21, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v20 ^ v21, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v20 ^ v21, 28) >> 26] ^ v17;
        v24 = a1[7];
        v25 = v23 ^ a1[6];
        v26 = (&g_d360a8.field_0)[__ROL__(v25, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v25, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v25, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v25 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v23 ^ v24, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v23 ^ v24, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v23 ^ v24, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v23 ^ v24, 28) >> 26] ^ v20;
        v27 = a1[9];
        v28 = v26 ^ a1[8];
        v29 = (&g_d360a8.field_0)[__ROL__(v28, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v28, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v28, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v28 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v26 ^ v27, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v26 ^ v27, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v26 ^ v27, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v26 ^ v27, 28) >> 26] ^ v23;
        v30 = a1[11];
        v31 = v29 ^ a1[10];
        v32 = (&g_d360a8.field_0)[__ROL__(v31, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v31, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v31, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v31 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v29 ^ v30, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v29 ^ v30, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v29 ^ v30, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v29 ^ v30, 28) >> 26] ^ v26;
        v33 = a1[13];
        v34 = v32 ^ a1[12];
        v35 = (&g_d360a8.field_0)[__ROL__(v34, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v34, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v34, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v34 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v32 ^ v33, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v32 ^ v33, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v32 ^ v33, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v32 ^ v33, 28) >> 26] ^ v29;
        v36 = a1[15];
        v37 = v35 ^ a1[14];
        v38 = (&g_d360a8.field_0)[__ROL__(v37, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v37, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v37, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v37 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v35 ^ v36, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v35 ^ v36, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v35 ^ v36, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v35 ^ v36, 28) >> 26] ^ v32;
        v39 = a1[0x11];
        v40 = v38 ^ a1[16];
        v41 = (&g_d360a8.field_0)[__ROL__(v40, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v40, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v40, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v40 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v38 ^ v39, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v38 ^ v39, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v38 ^ v39, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v38 ^ v39, 28) >> 26] ^ v35;
        v42 = a1[19];
        v43 = v41 ^ a1[18];
        v44 = (&g_d360a8.field_0)[__ROL__(v43, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v43, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v43, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v43 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v41 ^ v42, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v41 ^ v42, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v41 ^ v42, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v41 ^ v42, 28) >> 26] ^ v38;
        v45 = a1[21];
        v46 = v44 ^ a1[20];
        v47 = (&g_d360a8.field_0)[__ROL__(v46, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v46, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v46, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v46 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v44 ^ v45, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v44 ^ v45, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v44 ^ v45, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v44 ^ v45, 28) >> 26] ^ v41;
        v48 = a1[23];
        v49 = v47 ^ a1[22];
        v50 = (&g_d360a8.field_0)[__ROL__(v49, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v49, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v49, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v49 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v47 ^ v48, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v47 ^ v48, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v47 ^ v48, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v47 ^ v48, 28) >> 26] ^ v44;
        v51 = a1[25];
        v52 = v50 ^ a1[24];
        v53 = (&g_d360a8.field_0)[__ROL__(v52, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v52, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v52, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v52 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v50 ^ v51, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v50 ^ v51, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v50 ^ v51, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v50 ^ v51, 28) >> 26] ^ v47;
        v54 = v53 ^ a1[26];
        v55 = __ROL__(v53 ^ a1[27], 28);
        v56 = (&g_d360a8.field_0)[__ROL__(v54, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v54, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v54, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v54 >> 26] ^ (&g_d361a8.field_0)[__ROL__(v55, 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(v55, 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(v55, 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[v55 >> 26] ^ v50;
        v57 = a1[29];
        v58 = v56 ^ a1[28];
        v59 = (&g_d360a8.field_0)[__ROL__(v58, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v58, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v58, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v58 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v56 ^ v57, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v56 ^ v57, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v56 ^ v57, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v56 ^ v57, 28) >> 26] ^ v53;
        v60 = a1 + 30;
        v61 = 124;
    }
    else
    {
        v62 = a1[31];
        v63 = a1[30] ^ v13;
        v64 = (&g_d360a8.field_0)[__ROL__(v63, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v63, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v63, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v63 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v62 ^ v13, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v62 ^ v13, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v62 ^ v13, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v62 ^ v13, 28) >> 26] ^ v14;
        v65 = a1[29];
        v66 = v64 ^ a1[28];
        v67 = (&g_d360a8.field_0)[__ROL__(v66, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v66, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v66, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v66 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v64 ^ v65, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v64 ^ v65, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v64 ^ v65, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v64 ^ v65, 28) >> 26] ^ v13;
        v68 = a1[27];
        v69 = v67 ^ a1[26];
        v70 = (&g_d360a8.field_0)[__ROL__(v69, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v69, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v69, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v69 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v67 ^ v68, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v67 ^ v68, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v67 ^ v68, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v67 ^ v68, 28) >> 26] ^ v64;
        v71 = a1[25];
        v72 = v70 ^ a1[24];
        v73 = (&g_d360a8.field_0)[__ROL__(v72, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v72, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v72, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v72 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v70 ^ v71, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v70 ^ v71, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v70 ^ v71, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v70 ^ v71, 28) >> 26] ^ v67;
        v74 = a1[23];
        v75 = v73 ^ a1[22];
        v76 = (&g_d360a8.field_0)[__ROL__(v75, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v75, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v75, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v75 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v73 ^ v74, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v73 ^ v74, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v73 ^ v74, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v73 ^ v74, 28) >> 26] ^ v70;
        v77 = a1[21];
        v78 = v76 ^ a1[20];
        v79 = (&g_d360a8.field_0)[__ROL__(v78, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v78, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v78, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v78 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v76 ^ v77, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v76 ^ v77, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v76 ^ v77, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v76 ^ v77, 28) >> 26] ^ v73;
        v80 = a1[19];
        v81 = v79 ^ a1[18];
        v82 = (&g_d360a8.field_0)[__ROL__(v81, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v81, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v81, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v81 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v79 ^ v80, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v79 ^ v80, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v79 ^ v80, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v79 ^ v80, 28) >> 26] ^ v76;
        v83 = a1[0x11];
        v84 = v82 ^ a1[16];
        v85 = (&g_d360a8.field_0)[__ROL__(v84, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v84, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v84, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v84 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v82 ^ v83, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v82 ^ v83, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v82 ^ v83, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v82 ^ v83, 28) >> 26] ^ v79;
        v86 = a1[15];
        v87 = v85 ^ a1[14];
        v88 = (&g_d360a8.field_0)[__ROL__(v87, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v87, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v87, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v87 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v85 ^ v86, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v85 ^ v86, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v85 ^ v86, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v85 ^ v86, 28) >> 26] ^ v82;
        v89 = a1[13];
        v90 = v88 ^ a1[12];
        v91 = (&g_d360a8.field_0)[__ROL__(v90, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v90, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v90, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v90 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v88 ^ v89, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v88 ^ v89, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v88 ^ v89, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v88 ^ v89, 28) >> 26] ^ v85;
        v92 = a1[11];
        v93 = v91 ^ a1[10];
        v94 = (&g_d360a8.field_0)[__ROL__(v93, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v93, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v93, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v93 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v91 ^ v92, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v91 ^ v92, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v91 ^ v92, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v91 ^ v92, 28) >> 26] ^ v88;
        v95 = a1[9];
        v96 = v94 ^ a1[8];
        v97 = (&g_d360a8.field_0)[__ROL__(v96, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v96, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v96, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v96 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v94 ^ v95, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v94 ^ v95, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v94 ^ v95, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v94 ^ v95, 28) >> 26] ^ v91;
        v98 = a1[7];
        v99 = v97 ^ a1[6];
        v100 = (&g_d360a8.field_0)[__ROL__(v99, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v99, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v99, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v99 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v97 ^ v98, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v97 ^ v98, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v97 ^ v98, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v97 ^ v98, 28) >> 26] ^ v94;
        v101 = v100 ^ a1[4];
        v102 = __ROL__(v100 ^ a1[5], 28);
        v56 = (&g_d360a8.field_0)[__ROL__(v101, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v101, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v101, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v101 >> 26] ^ (&g_d361a8.field_0)[__ROL__(v102, 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(v102, 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(v102, 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[v102 >> 26] ^ v97;
        v103 = a1[3];
        v104 = v56 ^ a1[2];
        v59 = (&g_d360a8.field_0)[__ROL__(v104, 30) & 0xc000003f & 63] ^ (&g_d362a8.field_0)[__ROL__(v104, 22) & 0xffc0003f & 63] ^ (&g_d364a8.field_0)[__ROL__(v104, 14) & 0xffffc03f & 63] ^ (&g_d366a8.field_0)[v104 >> 26] ^ (&g_d361a8.field_0)[__ROL__(__ROL__(v56 ^ v103, 28), 30) & 0xc000003f & 63] ^ (&g_d363a8.field_0)[__ROL__(__ROL__(v56 ^ v103, 28), 22) & 0xffc0003f & 63] ^ *(int *)(4 * (__ROL__(__ROL__(v56 ^ v103, 28), 14) & 0xffffc03f & 63) + 13854120) ^ (&g_d367a8.field_0)[__ROL__(v56 ^ v103, 28) >> 26] ^ v100;
        v61 = 4;
        v60 = a1;
    }
    v105 = v60;
    v106 = v59 ^ *v105;
    v107 = __ROL__(v59 ^ *(int *)((char *)a1 + v61), 28);
    v108 = (&g_d360a8.field_0)[128 + (__ROL__(v106, 22) & 0xffc0003f & 63)];
    v109 = (&g_d360a8.field_0)[0x100 + (__ROL__(v106, 14) & 0xffffc03f & 63)];
    v110 = __ROL__(v59, 29);
    v111 = __ROL__((&g_d360a8.field_0)[__ROL__(v106, 30) & 0xc000003f & 63] ^ v108 ^ v109 ^ (&g_d360a8.field_0)[384 + (v106 >> 26)] ^ (&g_d360a8.field_0)[64 + (__ROL__(v107, 30) & 0xc000003f & 63)] ^ (&g_d360a8.field_0)[192 + (__ROL__(v107, 22) & 0xffc0003f & 63)] ^ (&g_d360a8.field_0)[320 + (__ROL__(v107, 14) & 0xffffc03f & 63)] ^ (&g_d360a8.field_0)[448 + (v107 >> 26)] ^ v56, 29);
    v112 = (v110 ^ v111 >> 1) & 0x55555555;
    v113 = v112 ^ v110;
    v114 = v111 ^ v112 * 2;
    v115 = (v114 ^ v113 >> 8) & 0xff00ff;
    v116 = v115 ^ v114;
    v117 = v113 ^ v115 * 0x100;
    v118 = (v117 ^ v116 >> 2) & 0x33333333;
    v119 = v118 ^ v117;
    v120 = v116 ^ v118 * 4;
    v121 = v120 & 0xffff ^ v119 >> 16;
    v122 = v121 ^ v120;
    v123 = v119 ^ v121 * 0x10000;
    v124 = (v123 ^ v122 >> 4) & 0xf0f0f0f;
    *a0 = v124 ^ v123;
    a0[1] = v122 ^ v124 * 16;
    return a0;
}
