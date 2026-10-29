/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3a7ec0..0x3a7fe4 (292 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_3a7ec0(void* a0)
{
    unsigned long index;  // x8
    unsigned long long idx;  // x9
    unsigned int v10;  // w9
    unsigned int v11;  // w10
    unsigned int v2;  // w13
    unsigned int v3;  // w10
    unsigned int idx1;  // x8
    unsigned long long v5;  // x14
    unsigned int v6;  // w12
    unsigned int v7;  // w11
    unsigned int v8;  // w9
    unsigned int v9;  // w13

    index = (long long)a0[2496];
    idx = index + 1 - 624 * (index + 1 >> 4) / 39;
    if (*(int *)((char *)a0 + 4 * idx) & 1)
        v2 = 2567483615;
    else
        v2 = 0;
    v3 = v2 ^ *(int *)((char *)a0 + 4 * index + -0x9c0 * (index + 397 >> 4) / 39 + 1588) ^ (*(int *)((char *)a0 + 4 * idx) & 0x7ffffffe | *(int *)((char *)a0 + 4 * index) & 0x80000000) >> 1;
    *(unsigned int *)((char *)a0 + 4 * index) = v3;
    if (idx == 623)
        idx1 = 0;
    else
        idx1 = idx + 1;
    v5 = 397;
    if (idx >= 227)
        v5 = 0xffffffffffffff1d;
    if (*(int *)((char *)a0 + 4 * idx1) & 1)
        v6 = 2567483615;
    else
        v6 = 0;
    v7 = v6 ^ *(int *)((char *)a0 + 4 * idx + 4 * v5) ^ (*(int *)((char *)a0 + 4 * idx1) & 0x7ffffffe | *(int *)((char *)a0 + 4 * idx) & 0x80000000) >> 1;
    *(unsigned int *)((char *)a0 + 4 * idx) = v7;
    v8 = 2636928640 & (v7 ^ v7 >> 11) * 128 ^ v7 ^ v7 >> 11;
    v9 = 0xefc60000 & v8 * 0x8000;
    v10 = 2636928640 & (v3 ^ v3 >> 11) * 128 ^ v3 ^ v3 >> 11;
    v11 = 0xefc60000 & v10 * 0x8000;
    *(unsigned long long *)&a0[2496] = idx1;
    return ((double)(v9 ^ v8 ^ (v9 ^ v8) >> 18) * 4294967296.0 + (double)(v11 ^ v10 ^ (v11 ^ v10) >> 18)) * 5.421010862427522e-20;
}
