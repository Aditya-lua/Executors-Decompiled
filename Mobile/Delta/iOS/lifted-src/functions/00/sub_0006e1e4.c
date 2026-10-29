/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6e1e4..0x6e410 (556 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char * sub_6e1e4(char *a0, char *a1)
{
    unsigned long v0;  // x9
    unsigned long v1;  // x10
    unsigned long v10;  // x9
    unsigned long v11;  // x10
    unsigned long v12;  // x9
    unsigned long v13;  // x10
    unsigned long v14;  // x9
    unsigned long v15;  // x10
    unsigned long v16;  // x9
    unsigned long v17;  // x10
    unsigned long v18;  // x9
    unsigned long v19;  // x10
    unsigned long v2;  // x9
    unsigned long v20;  // x9
    unsigned long v21;  // x10
    unsigned long v22;  // x9
    unsigned long v23;  // x10
    unsigned long v24;  // x9
    unsigned long v25;  // x10
    unsigned long v26;  // x9
    unsigned long v3;  // x10
    unsigned long v4;  // x9
    unsigned long v5;  // x10
    unsigned long v6;  // x9
    unsigned long v7;  // x10
    unsigned long v8;  // x9
    unsigned long v9;  // x10

    *a1 = *(char *)((*a0 >> 2) + 0xc7f9ed);
    v0 = *a0;
    v1 = a0[1];
    a1[1] = *(char *)((v1 >> 4 & 0xffffffffffffffc0 | (v1 >> 4 & 0xffffffffffffffcf | (v0 * 16 | v0 >> 60) & 48) & 63) + 0xc7f9ed);
    v2 = a0[1];
    v3 = a0[2];
    a1[2] = *(char *)((v3 >> 6 & 0xffffffffffffffc0 | (v3 >> 6 & 0xffffffffffffffc3 | (v2 * 4 | v2 >> 62) & 60) & 63) + 0xc7f9ed);
    a1[3] = *(char *)((a0[2] & 63) + 0xc7f9ed);
    a1[4] = *(char *)((a0[3] >> 2) + 0xc7f9ed);
    v4 = a0[3];
    v5 = a0[4];
    a1[5] = *(char *)((v5 >> 4 & 0xffffffffffffffc0 | (v5 >> 4 & 0xffffffffffffffcf | (v4 * 16 | v4 >> 60) & 48) & 63) + 0xc7f9ed);
    v6 = a0[4];
    v7 = a0[5];
    a1[6] = *(char *)((v7 >> 6 & 0xffffffffffffffc0 | (v7 >> 6 & 0xffffffffffffffc3 | (v6 * 4 | v6 >> 62) & 60) & 63) + 0xc7f9ed);
    a1[7] = *(char *)((a0[5] & 63) + 0xc7f9ed);
    a1[8] = *(char *)((a0[6] >> 2) + 0xc7f9ed);
    v8 = a0[6];
    v9 = a0[7];
    a1[9] = *(char *)((v9 >> 4 & 0xffffffffffffffc0 | (v9 >> 4 & 0xffffffffffffffcf | (v8 * 16 | v8 >> 60) & 48) & 63) + 0xc7f9ed);
    v10 = a0[7];
    v11 = a0[8];
    a1[10] = *(char *)((v11 >> 6 & 0xffffffffffffffc0 | (v11 >> 6 & 0xffffffffffffffc3 | (v10 * 4 | v10 >> 62) & 60) & 63) + 0xc7f9ed);
    a1[11] = *(char *)((a0[8] & 63) + 0xc7f9ed);
    a1[12] = *(char *)((a0[9] >> 2) + 0xc7f9ed);
    v12 = a0[9];
    v13 = a0[10];
    a1[13] = *(char *)((v13 >> 4 & 0xffffffffffffffc0 | (v13 >> 4 & 0xffffffffffffffcf | (v12 * 16 | v12 >> 60) & 48) & 63) + 0xc7f9ed);
    v14 = a0[10];
    v15 = a0[11];
    a1[14] = *(char *)((v15 >> 6 & 0xffffffffffffffc0 | (v15 >> 6 & 0xffffffffffffffc3 | (v14 * 4 | v14 >> 62) & 60) & 63) + 0xc7f9ed);
    a1[15] = *(char *)((a0[11] & 63) + 0xc7f9ed);
    a1[16] = *(char *)((a0[12] >> 2) + 0xc7f9ed);
    v16 = a0[12];
    v17 = a0[13];
    a1[0x11] = *(char *)((v17 >> 4 & 0xffffffffffffffc0 | (v17 >> 4 & 0xffffffffffffffcf | (v16 * 16 | v16 >> 60) & 48) & 63) + 0xc7f9ed);
    v18 = a0[13];
    v19 = a0[14];
    a1[18] = *(char *)((v19 >> 6 & 0xffffffffffffffc0 | (v19 >> 6 & 0xffffffffffffffc3 | (v18 * 4 | v18 >> 62) & 60) & 63) + 0xc7f9ed);
    a1[19] = *(char *)((a0[14] & 63) + 0xc7f9ed);
    a1[20] = *(char *)((a0[15] >> 2) + 0xc7f9ed);
    v20 = a0[15];
    v21 = a0[16];
    a1[21] = *(char *)((v21 >> 4 & 0xffffffffffffffc0 | (v21 >> 4 & 0xffffffffffffffcf | (v20 * 16 | v20 >> 60) & 48) & 63) + 0xc7f9ed);
    v22 = a0[16];
    v23 = a0[0x11];
    a1[22] = *(char *)((v23 >> 6 & 0xffffffffffffffc0 | (v23 >> 6 & 0xffffffffffffffc3 | (v22 * 4 | v22 >> 62) & 60) & 63) + 0xc7f9ed);
    a1[23] = *(char *)((a0[0x11] & 63) + 0xc7f9ed);
    a1[24] = *(char *)((a0[18] >> 2) + 0xc7f9ed);
    v24 = a0[18];
    v25 = a0[19];
    a1[25] = *(char *)((v25 >> 4 & 0xffffffffffffffc0 | (v25 >> 4 & 0xffffffffffffffcf | (v24 * 16 | v24 >> 60) & 48) & 63) + 0xc7f9ed);
    v26 = a0[19];
    a1[26] = *(char *)(((v26 * 4 | v26 >> 62) & 60 & 63) + 0xc7f9ed);
    a1[27] = 61;
    return a0;
}
