/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa08d40..0xa08e88 (328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a08d40(unsigned long idx, unsigned long long *a1, unsigned long long *a2)
{
    unsigned long v0;  // x8
    unsigned long v1;  // x10
    unsigned long long v10;  // x9
    unsigned long v11;  // x13
    unsigned long long v12;  // x14
    unsigned long long v13;  // x12
    unsigned long long v14;  // x11
    unsigned long long v15;  // x10
    unsigned long long v16;  // x16
    unsigned long long v17;  // x13
    unsigned long long v18;  // x8
    unsigned long v2;  // x11
    unsigned long v3;  // x12
    unsigned long v4;  // x13
    unsigned long v5;  // x14
    unsigned long v6;  // x15
    unsigned long long v7;  // x9
    unsigned long long v8;  // x16
    unsigned long long v9;  // x15

    v0 = *a1 - *a2 + 0x1fffffffffffffe;
    *(unsigned long *)idx = v0;
    v1 = a1[1] - a2[1] + 0x1fffffffffffffe;
    *(unsigned long *)(idx + 8) = v1;
    v2 = a1[2] - a2[2] + 0x1fffffffffffffe;
    *(unsigned long *)(idx + 16) = v2;
    v3 = a1[3] - a2[3] + 0x1fffffffffffffe;
    *(unsigned long *)(idx + 24) = v3;
    v4 = a1[4] - a2[4] + 0x1fffffffffffffc;
    *(unsigned long *)(idx + 32) = v4;
    v5 = a1[5] - a2[5] + 0x1fffffffffffffe;
    *(unsigned long *)(idx + 40) = v5;
    v6 = a1[6] - a2[6] + 0x1fffffffffffffe;
    *(unsigned long *)(idx + 48) = v6;
    v7 = a1[7] - a2[7] + 0x1fffffffffffffe;
    v8 = (v7 & 0xffffffffffffff) + (v6 >> 56);
    v9 = (v6 & 0xffffffffffffff) + (v5 >> 56);
    v10 = v7 >> 56;
    v11 = v4 + v10;
    v12 = (v5 & 0xffffffffffffff) + (v11 >> 56);
    v13 = (v3 & 0xffffffffffffff) + (v2 >> 56);
    v14 = (v2 & 0xffffffffffffff) + (v1 >> 56);
    v15 = (v1 & 0xffffffffffffff) + (v0 >> 56);
    v16 = v8 >> 56;
    v17 = (v11 & 0xffffffffffffff) + (v3 >> 56) + v16;
    v18 = (v0 & 0xffffffffffffff) + v10;
    *(unsigned long long *)(idx + 48) = (v9 & 0xffffffffffffff) + (v12 >> 56);
    *(unsigned long long *)(idx + 56) = (v8 & 0xffffffffffffff) + (v9 >> 56);
    *(unsigned long long *)(idx + 32) = (v17 & 0xffffffffffffff) + (v13 >> 56);
    *(unsigned long long *)(idx + 40) = (v12 & 0xffffffffffffff) + (v17 >> 56);
    *(unsigned long long *)(idx + 16) = (v14 & 0xffffffffffffff) + (v15 >> 56);
    *(unsigned long long *)(idx + 24) = (v13 & 0xffffffffffffff) + (v14 >> 56);
    *(unsigned long long *)idx = (v18 & 0xffffffffffffff) + v16;
    *(unsigned long long *)(idx + 8) = (v15 & 0xffffffffffffff) + (v18 >> 56);
    return idx;
}
