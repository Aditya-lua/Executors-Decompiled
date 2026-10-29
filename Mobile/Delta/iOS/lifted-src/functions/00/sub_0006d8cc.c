/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6d8cc..0x6da58 (396 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_6d8cc(unsigned long a0, unsigned int *a1, unsigned int *a2)
{
    unsigned int v0;  // w8
    unsigned int v1;  // w9
    unsigned int v2;  // w9
    unsigned int v3;  // w10
    unsigned int v4;  // w9
    unsigned int v5;  // w11
    unsigned int v6;  // w9
    unsigned int v7;  // w10

    v0 = __ROL__(*a2 ^ a2[5] ^ a2[10] ^ a2[8], 1);
    a2[8] = v0;
    v1 = a1[3];
    *a1 = v0 + ((a1[2] | v1) & a1[1] | a1[2] & v1) + (a1[4] * 32 | a1[4] >> 27) + *a1 + 2400959708;
    a1[3] = v1 * 0x40000000 | v1 >> 2;
    v2 = __ROL__(a2[1] ^ a2[6] ^ a2[11] ^ a2[9], 1);
    a2[9] = v2;
    v3 = a1[4];
    a1[1] = v2 + ((a1[3] | v3) & a1[2] | a1[3] & v3) + (*a1 * 32 | *a1 >> 27) + a1[1] + 2400959708;
    a1[4] = v3 * 0x40000000 | v3 >> 2;
    v4 = __ROL__(a2[2] ^ a2[7] ^ a2[12] ^ a2[10], 1);
    a2[10] = v4;
    v5 = *a1;
    a1[2] = v4 + ((a1[4] | v5) & a1[3] | a1[4] & v5) + (a1[1] * 32 | a1[1] >> 27) + a1[2] + 2400959708;
    *a1 = v5 * 0x40000000 | v5 >> 2;
    v6 = __ROL__(a2[3] ^ a2[8] ^ a2[13] ^ a2[11], 1);
    a2[11] = v6;
    v7 = a1[1];
    a1[3] = v6 + ((*a1 | v7) & a1[4] | *a1 & v7) + (a1[2] * 32 | a1[2] >> 27) + a1[3] + 2400959708;
    a1[1] = v7 * 0x40000000 | v7 >> 2;
    return a0;
}
