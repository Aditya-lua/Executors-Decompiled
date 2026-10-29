/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa113ac..0xa115fc (592 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_1000000;

unsigned int * sub_a113ac(unsigned int *a0, int *a1)
{
    unsigned long v2;  // x13
    unsigned long v3;  // x3
    unsigned long v12;  // x24
    unsigned long v13;  // x25
    unsigned long v14;  // x20
    unsigned long long v15;  // x14
    unsigned long long v16;  // x16
    unsigned long long v17;  // x2
    unsigned long long v18;  // x4
    unsigned long long v19;  // x23
    unsigned long long v20;  // x19
    unsigned long long v21;  // x1
    unsigned long v4;  // x10
    unsigned long v22;  // x17
    long long v23;  // x7
    long long v24;  // x5
    long long v25;  // x25
    unsigned long long v26;  // x26
    long long v27;  // x6
    unsigned long long v28;  // x28
    unsigned long long v29;  // x21
    unsigned long long v30;  // x8
    unsigned long long v31;  // x27
    unsigned long v5;  // x9
    unsigned long long v32;  // x25
    unsigned long long v33;  // x24
    unsigned long long v34;  // x22
    unsigned long long v35;  // x9
    unsigned long long v36;  // x8
    unsigned long long v37;  // x13
    unsigned long long v38;  // x12
    unsigned long long v39;  // x16
    unsigned long long v40;  // x10
    unsigned long long v41;  // x11
    unsigned long v6;  // x21
    unsigned long long v42;  // x14
    unsigned long long v43;  // x17
    unsigned long long v44;  // x14
    unsigned long long v45;  // x17
    unsigned long long v46;  // x13
    unsigned long v7;  // x5
    unsigned long v8;  // x6
    unsigned long v9;  // x22
    unsigned long v10;  // x12
    unsigned long v11;  // x11
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1[4];
    v3 = a1[5];
    v4 = a1[6];
    v5 = a1[7];
    v6 = (unsigned int)v4 * 19;
    v7 = *a1;
    v8 = a1[1];
    v9 = (unsigned int)v5 * 38;
    v10 = a1[8];
    v11 = a1[9];
    v12 = (unsigned int)v10 * 19;
    v13 = a1[2];
    v14 = a1[3];
    v15 = v7 * 2;
    v16 = v8 * 2;
    v17 = v13 * 2;
    v18 = v14 * 2;
    v19 = v2 * 2;
    v20 = v3 * 2;
    v21 = v5 * 2;
    v22 = (unsigned int)v11 * 38;
    v23 = 38 * (unsigned int)v3 * (unsigned int)v3 + (unsigned int)v7 * (unsigned int)v7 + v19 * v6 + v18 * v9 + v17 * v12 + v16 * v22;
    v24 = v16 * v18 + (unsigned int)v13 * (unsigned int)v13 + v15 * v2 + v5 * v9 + v12 * v4 * 2 + v20 * v22;
    v25 = v23 + 0x2000000;
    v26 = v8 * v15 + v20 * v6 + v2 * v9 + v18 * v12 + v13 * v22 + (v25 >> 26);
    v27 = v24 + 0x2000000;
    v28 = v14 * v17 + v16 * v2 + v15 * v3 + v21 * v12 + v4 * v22 + (v27 >> 26);
    v29 = &(&g_1000000)[v26];
    v30 = v8 * v16 + v15 * v13 + v4 * v6 + v20 * v9 + v19 * v12 + v18 * v22 + ((long long)(v29) >> 25);
    v31 = &(&g_1000000)[v28];
    v32 = v17 * v2 + v14 * v18 + v16 * v20 + v15 * v4 + v10 * v12 + v21 * v22 + ((long long)(v31) >> 25);
    v33 = v30 + 0x2000000;
    v34 = v13 * v16 + v15 * v14 + v4 * v9 + v20 * v12 + v2 * v22 + ((long long)(v33) >> 26);
    v35 = v32 + 0x2000000;
    v36 = v2 * v18 + v17 * v3 + v16 * v4 + v15 * v5 + v10 * v22 + ((long long)(v35) >> 26);
    v37 = &(&g_1000000)[v36];
    v38 = v17 * v4 + (unsigned int)v2 * (unsigned int)v2 + v18 * v20 + v16 * v21 + v15 * v10 + v11 * v22 + ((long long)(v37) >> 25);
    v39 = v38 + 0x2000000;
    v40 = v3 * v19 + v18 * v4 + v17 * v5 + v16 * v10 + v15 * v11 + ((long long)(v39) >> 26);
    v41 = &(&g_1000000)[v40];
    v42 = v23 - (v25 & 0xfffffffffc000000) + 19 * ((long long)(v41) >> 25);
    v43 = v42 + 0x2000000;
    *a0 = v42 - ((unsigned int)v43 & 0xfc000000);
    a0[1] = (unsigned int)(v26 - ((unsigned int)v29 & 0xfe000000)) + (unsigned int)(v43 >> 26);
    v44 = &(&g_1000000)[v34];
    v45 = v24 - (v27 & 0xfffffffffc000000) + ((long long)(v44) >> 25);
    a0[2] = v30 - ((unsigned int)v33 & 0xfc000000);
    a0[3] = v34 - ((unsigned int)v44 & 0xfe000000);
    v46 = v45 + 0x2000000;
    a0[4] = v45 - ((unsigned int)v46 & 0xfc000000);
    a0[5] = (unsigned int)(v28 - ((unsigned int)v31 & 0xfe000000)) + (unsigned int)(v46 >> 26);
    a0[6] = v32 - ((unsigned int)v35 & 0xfc000000);
    a0[7] = v36 - ((unsigned int)v37 & 0xfe000000);
    a0[8] = v38 - ((unsigned int)v39 & 0xfc000000);
    a0[9] = v40 - ((unsigned int)v41 & 0xfe000000);
    return a0;
}
