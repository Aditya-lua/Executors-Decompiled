/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6dbf0..0x6dd5c (364 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_6dbf0(unsigned long a0, unsigned int *a1, unsigned int *a2)
{
    unsigned int v0;  // w8
    unsigned int v1;  // w9
    unsigned int v2;  // w9
    unsigned int v3;  // w10
    unsigned int v4;  // w9
    unsigned int v5;  // w11
    unsigned int v6;  // w9
    unsigned int v7;  // w10

    v0 = __ROL__(a2[12] ^ a2[1] ^ a2[6] ^ a2[4], 1);
    a2[4] = v0;
    v1 = a1[3];
    *a1 = v0 + (a1[2] ^ a1[1] ^ v1) + (a1[4] * 32 | a1[4] >> 27) + *a1 + 1859775393;
    a1[3] = v1 * 0x40000000 | v1 >> 2;
    v2 = __ROL__(a2[13] ^ a2[2] ^ a2[7] ^ a2[5], 1);
    a2[5] = v2;
    v3 = a1[4];
    a1[1] = v2 + (a1[3] ^ a1[2] ^ v3) + (*a1 * 32 | *a1 >> 27) + a1[1] + 1859775393;
    a1[4] = v3 * 0x40000000 | v3 >> 2;
    v4 = __ROL__(a2[14] ^ a2[3] ^ a2[8] ^ a2[6], 1);
    a2[6] = v4;
    v5 = *a1;
    a1[2] = v4 + (a1[4] ^ a1[3] ^ v5) + (a1[1] * 32 | a1[1] >> 27) + a1[2] + 1859775393;
    *a1 = v5 * 0x40000000 | v5 >> 2;
    v6 = __ROL__(a2[15] ^ a2[4] ^ a2[9] ^ a2[7], 1);
    a2[7] = v6;
    v7 = a1[1];
    a1[3] = v6 + (*a1 ^ a1[4] ^ v7) + (a1[2] * 32 | a1[2] >> 27) + a1[3] + 1859775393;
    a1[1] = v7 * 0x40000000 | v7 >> 2;
    return a0;
}
