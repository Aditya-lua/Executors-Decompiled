/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1110c..0xa113ac (672 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int * sub_a1110c(unsigned int *a0, unsigned int *a1, unsigned int a2)
{
    unsigned int v0;  // w8
    unsigned int v1;  // w9
    unsigned int v10;  // w12
    unsigned int v11;  // w12
    unsigned int v12;  // w12
    unsigned int v13;  // w12
    unsigned int v14;  // w12
    unsigned int v15;  // w12
    unsigned int v16;  // w12
    unsigned int v2;  // w12
    unsigned int v3;  // w12
    unsigned int v4;  // w12
    unsigned int v5;  // w12
    unsigned int v6;  // w12
    unsigned int v7;  // w12
    unsigned int v8;  // w12
    unsigned int v9;  // w12

    v0 = -a2;
    v1 = a2 - 1;
    v2 = a0[1];
    *a0 = *a1 & v0 | *a0 & v1;
    a0[1] = a1[1] & v0 | v2 & v1;
    v3 = a0[3];
    a0[2] = a1[2] & v0 | a0[2] & v1;
    a0[3] = a1[3] & v0 | v3 & v1;
    v4 = a0[5];
    a0[4] = a1[4] & v0 | a0[4] & v1;
    a0[5] = a1[5] & v0 | v4 & v1;
    v5 = a0[7];
    a0[6] = a1[6] & v0 | a0[6] & v1;
    a0[7] = a1[7] & v0 | v5 & v1;
    v6 = a0[9];
    a0[8] = a1[8] & v0 | a0[8] & v1;
    a0[9] = a1[9] & v0 | v6 & v1;
    v7 = a0[11];
    a0[10] = a1[10] & v0 | a0[10] & v1;
    a0[11] = a1[11] & v0 | v7 & v1;
    v8 = a0[13];
    a0[12] = a1[12] & v0 | a0[12] & v1;
    a0[13] = a1[13] & v0 | v8 & v1;
    v9 = a0[15];
    a0[14] = a1[14] & v0 | a0[14] & v1;
    a0[15] = a1[15] & v0 | v9 & v1;
    v10 = a0[0x11];
    a0[16] = a1[16] & v0 | a0[16] & v1;
    a0[0x11] = a1[0x11] & v0 | v10 & v1;
    v11 = a0[19];
    a0[18] = a1[18] & v0 | a0[18] & v1;
    a0[19] = a1[19] & v0 | v11 & v1;
    v12 = a0[21];
    a0[20] = a1[20] & v0 | a0[20] & v1;
    a0[21] = a1[21] & v0 | v12 & v1;
    v13 = a0[23];
    a0[22] = a1[22] & v0 | a0[22] & v1;
    a0[23] = a1[23] & v0 | v13 & v1;
    v14 = a0[25];
    a0[24] = a1[24] & v0 | a0[24] & v1;
    a0[25] = a1[25] & v0 | v14 & v1;
    v15 = a0[27];
    a0[26] = a1[26] & v0 | a0[26] & v1;
    a0[27] = a1[27] & v0 | v15 & v1;
    v16 = a0[29];
    a0[28] = a1[28] & v0 | a0[28] & v1;
    a0[29] = a1[29] & v0 | v16 & v1;
    return a0;
}
