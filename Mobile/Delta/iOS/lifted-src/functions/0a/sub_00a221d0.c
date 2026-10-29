/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa221d0..0xa222a0 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int * sub_a221d0(unsigned long a0, unsigned long long *a1, unsigned long a2)
{
    void* v0;  // x0
    unsigned long long v1;  // x4
    unsigned int *v10;  // x0
    unsigned long long v11;  // x4
    unsigned long long v12;  // x5
    unsigned long long v13;  // x6
    unsigned long long v14;  // x7
    unsigned long long v2;  // x5
    unsigned long long v3;  // x6
    unsigned long long v4;  // x7
    unsigned int *v5;  // x0
    unsigned long long v6;  // x4
    unsigned long long v7;  // x5
    unsigned long long v8;  // x6
    unsigned long long v9;  // x7

    v0 = a0 + a2 * 4;
    v1 = *a1;
    v2 = a1[1];
    v3 = a1[2];
    v4 = a1[3];
    *(unsigned int *)((char *)v0 - 4) = v1;
    *(unsigned int *)&v0[60] = v2;
    *(unsigned int *)&v0[124] = v3;
    *(unsigned int *)&v0[188] = v4;
    *(unsigned int *)&v0[252] = v1 >> 32;
    *(unsigned int *)&v0[316] = v2 >> 32;
    *(unsigned int *)&v0[380] = v3 >> 32;
    *(unsigned int *)&v0[444] = v4 >> 32;
    v5 = v0 + 0x200;
    v6 = a1[4];
    v7 = a1[5];
    v8 = a1[6];
    v9 = a1[7];
    *(unsigned int *)((char *)v5 - 4) = v6;
    v5[15] = v7;
    v5[31] = v8;
    v5[47] = v9;
    v5[63] = v6 >> 32;
    v5[79] = v7 >> 32;
    v5[95] = v8 >> 32;
    v5[111] = v9 >> 32;
    v10 = v5 + 128;
    v11 = a1[8];
    v12 = a1[9];
    v13 = a1[10];
    v14 = a1[11];
    *(unsigned int *)((char *)v10 - 4) = v11;
    v10[15] = v12;
    v10[31] = v13;
    v10[47] = v14;
    v10[63] = v11 >> 32;
    v10[79] = v12 >> 32;
    v10[95] = v13 >> 32;
    v10[111] = v14 >> 32;
    return v10;
}
