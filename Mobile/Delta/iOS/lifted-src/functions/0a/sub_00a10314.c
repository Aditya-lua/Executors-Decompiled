/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa10314..0xa106a8 (916 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_1000000;

unsigned int * sub_a10314(unsigned int *a0, int *a1, void* a2)
{
    unsigned long v14;  // x0
    unsigned long v15;  // x3
    unsigned long v24;  // x25
    int v25;  // w20
    unsigned long v26;  // x11
    unsigned long v27;  // x26
    unsigned long v28;  // x14
    unsigned long v29;  // x13
    unsigned long v30;  // x7
    unsigned long v31;  // x16
    unsigned long long v32;  // x9
    unsigned long v33;  // x21
    int v16;  // w19
    unsigned long v34;  // x23
    unsigned long long v35;  // x1
    unsigned long long v36;  // x24
    unsigned int v37;  // w27
    unsigned long v38;  // x25
    unsigned long v39;  // x8
    unsigned long v40;  // x9
    unsigned long v41;  // x26
    unsigned long long v42;  // x15
    unsigned long long v43;  // x28
    unsigned long v17;  // x17
    unsigned long long v44;  // x1
    unsigned int v45;  // w26
    unsigned long v46;  // x8
    long long v47;  // x5
    unsigned long v48;  // x19
    long long v49;  // x12
    long long v50;  // x3
    unsigned long long v51;  // x1
    long long v52;  // x3
    unsigned long long v53;  // x10
    unsigned long long v18;  // x6
    unsigned long long v54;  // x4
    unsigned long long v55;  // x16
    unsigned long long v56;  // x4
    unsigned long long v57;  // x5
    unsigned long long v58;  // x4
    unsigned long long v59;  // x17
    unsigned long long v60;  // x4
    unsigned long long v61;  // x11
    unsigned long long v62;  // x5
    unsigned long long v63;  // x15
    unsigned int v19;  // w5
    unsigned long long v64;  // x6
    unsigned long long v65;  // x9
    unsigned long long v66;  // x13
    unsigned long long v67;  // x12
    unsigned long long v68;  // x2
    unsigned long long v69;  // x12
    unsigned long long v70;  // x14
    unsigned long long v71;  // x8
    unsigned long v20;  // x4
    unsigned long v21;  // x10
    unsigned long v22;  // x27
    unsigned int v23;  // w22
    unsigned long long v0;  // [bp-0xc8]
    unsigned long long v1;  // [bp-0xc0]
    unsigned long long v2;  // [bp-0xb8]
    unsigned long long v3;  // [bp-0xb0]
    unsigned long long v4;  // [bp-0xa8]
    unsigned long long v5;  // [bp-0xa0]
    unsigned long long v6;  // [bp-0x98]
    unsigned long v7;  // [bp-0x90]
    unsigned long long v8;  // [bp-0x88]
    unsigned long long v9;  // [bp-0x80]
    unsigned long v10;  // [bp-0x78]
    unsigned long v11;  // [bp-0x68]
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v14 = a1[8];
    v15 = a1[9];
    v16 = *(int *)a2;
    v17 = (int)a2[4];
    v18 = v15 * 2;
    v19 = (int)a2[8];
    v20 = (int)a2[12];
    v21 = v19 * 19;
    v22 = (unsigned int)v20 * 19;
    v23 = (int)a2[16];
    v10 = (int)a2[20];
    v24 = v23 * 19;
    v25 = *a1;
    v26 = a1[1];
    v11 = v26;
    v27 = (unsigned int)v10 * 19;
    v28 = a1[2];
    v29 = a1[3];
    v30 = a1[4];
    v31 = a1[5];
    v32 = v26 * 2;
    v33 = a1[6];
    v34 = a1[7];
    v35 = v29 * 2;
    v0 = v31 * 2;
    v1 = v18;
    v36 = v34 * 2;
    v7 = v29;
    v8 = v32;
    v37 = (int)a2[24];
    v38 = (int)a2[28];
    v39 = v37 * 19;
    v40 = v10;
    v41 = (unsigned int)v38 * 19;
    v6 = 19 * v18 * v17 + v16 * v25 + v14 * v21 + v36 * v22 + v33 * v24 + v0 * v27 + v30 * v39 + v35 * v41;
    v2 = v35 * v17 + v16 * (unsigned int)v30 + v19 * (unsigned int)v28 + v32 * v20 + v23 * v25 + v18 * v27 + v14 * v39 + v36 * v41;
    v5 = v16 * (unsigned int)v26 + (unsigned int)v17 * v25 + v15 * v21 + v14 * v22 + v34 * v24 + v33 * v27 + v31 * v39 + v30 * v41;
    v42 = v0;
    v43 = v35;
    v44 = v1;
    v3 = v16 * (unsigned int)v29 + (unsigned int)v17 * (unsigned int)v28 + v19 * (unsigned int)v11 + (unsigned int)v20 * v25 + v15 * v24 + v14 * v27 + v34 * v39 + v33 * v41;
    v4 = v32 * v17 + v16 * (unsigned int)v28 + v19 * v25 + v18 * v22 + v14 * v24 + v36 * v27 + v33 * v39 + v42 * v41;
    v45 = (int)a2[32];
    v46 = v45 * 19;
    x30 = (int)a2[36] * 19;
    v9 = v42 * v17 + v16 * (unsigned int)v33 + v19 * (unsigned int)v30 + v35 * v20 + v23 * (unsigned int)v28 + v32 * v40 + v37 * v25 + v44 * v41 + v14 * v46 + v36 * x30;
    v47 = v2 + v33 * v46 + v42 * x30;
    v48 = v7;
    v49 = v6 + v28 * v46 + v8 * x30;
    v50 = v49 + 0x2000000;
    v51 = v5 + v48 * v46 + v28 * x30 + (v50 >> 26);
    v52 = v47 + 0x2000000;
    v53 = v16 * (unsigned int)v31 + (unsigned int)v17 * (unsigned int)v30 + v19 * (unsigned int)v29 + (unsigned int)v20 * (unsigned int)v28 + v23 * (unsigned int)v11 + (unsigned int)v40 * v25 + v15 * v39 + v14 * v41 + v34 * v46 + v33 * x30 + (v52 >> 26);
    v54 = &(&g_1000000)[v51];
    v55 = v4 + v30 * v46 + v43 * x30 + ((long long)(v54) >> 25);
    v56 = &(&g_1000000)[v53];
    v57 = v9 + ((long long)(v56) >> 25);
    v58 = v55 + 0x2000000;
    v59 = v3 + v31 * v46 + v30 * x30 + ((long long)(v58) >> 26);
    v60 = v57 + 0x2000000;
    v61 = v16 * (unsigned int)v34 + (unsigned int)v17 * (unsigned int)v33 + v19 * (unsigned int)v31 + (unsigned int)v20 * (unsigned int)v30 + v23 * (unsigned int)v48 + (unsigned int)v40 * (unsigned int)v28 + v37 * (unsigned int)v11 + (unsigned int)v38 * v25 + v15 * v46 + v14 * x30 + ((long long)(v60) >> 26);
    v62 = &(&g_1000000)[v61];
    v63 = v36 * v17 + v16 * (unsigned int)v14 + v19 * (unsigned int)v33 + v42 * v20 + v23 * (unsigned int)v30 + v43 * v40 + v37 * (unsigned int)v28 + v8 * v38 + v45 * v25 + v44 * x30 + ((long long)(v62) >> 25);
    v64 = v63 + 0x2000000;
    v65 = v16 * (unsigned int)v15 + (unsigned int)v17 * (unsigned int)v14 + v19 * (unsigned int)v34 + (unsigned int)v20 * (unsigned int)v33 + v23 * (unsigned int)v31 + (unsigned int)v40 * (unsigned int)v30 + v37 * (unsigned int)v48 + (unsigned int)v38 * (unsigned int)v28 + v45 * (unsigned int)v11 + (int)a2[36] * v25 + ((long long)(v64) >> 26);
    v66 = &(&g_1000000)[v65];
    v67 = v49 - (v50 & 0xfffffffffc000000) + 19 * ((long long)(v66) >> 25);
    v68 = v67 + 0x2000000;
    *a0 = v67 - ((unsigned int)v68 & 0xfc000000);
    a0[1] = (unsigned int)(v51 - ((unsigned int)v54 & 0xfe000000)) + (unsigned int)(v68 >> 26);
    v69 = &(&g_1000000)[v59];
    v70 = v47 - (v52 & 0xfffffffffc000000) + ((long long)(v69) >> 25);
    a0[2] = v55 - ((unsigned int)v58 & 0xfc000000);
    a0[3] = v59 - ((unsigned int)v69 & 0xfe000000);
    v71 = v70 + 0x2000000;
    a0[4] = v70 - ((unsigned int)v71 & 0xfc000000);
    a0[5] = (unsigned int)(v53 - ((unsigned int)v56 & 0xfe000000)) + (unsigned int)(v71 >> 26);
    a0[6] = v57 - ((unsigned int)v60 & 0xfc000000);
    a0[7] = v61 - ((unsigned int)v62 & 0xfe000000);
    a0[8] = v63 - ((unsigned int)v64 & 0xfc000000);
    a0[9] = v65 - ((unsigned int)v66 & 0xfe000000);
    return a0;
}
