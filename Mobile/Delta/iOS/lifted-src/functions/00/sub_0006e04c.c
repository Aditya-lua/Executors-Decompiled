/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6e04c..0x6e1e4 (408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_6e04c(unsigned long a0, unsigned int *a1, unsigned int *a2)
{
    unsigned long long v3;  // x0
    unsigned int v4;  // w8
    unsigned int v5;  // w9
    unsigned int v6;  // w9
    unsigned int v7;  // w11
    unsigned int v8;  // w9
    unsigned int v9;  // w10
    unsigned int v10;  // w9
    unsigned int v11;  // w11
    char v0;  // [bp-0x21]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_70684(&v0);
    v4 = __ROL__(a2[12] ^ a2[1] ^ a2[6] ^ a2[4], 1);
    a2[4] = v4;
    v5 = a1[4];
    a1[1] = v4 + (a1[3] ^ a1[2] ^ v5) + (*a1 * 32 | *a1 >> 27) + a1[1] + 1859775393;
    a1[4] = v5 * 0x40000000 | v5 >> 2;
    v6 = __ROL__(a2[13] ^ a2[2] ^ a2[7] ^ a2[5], 1);
    a2[5] = v6;
    v7 = *a1;
    a1[2] = v6 + (a1[4] ^ a1[3] ^ v7) + (a1[1] * 32 | a1[1] >> 27) + a1[2] + 1859775393;
    *a1 = v7 * 0x40000000 | v7 >> 2;
    v8 = __ROL__(a2[14] ^ a2[3] ^ a2[8] ^ a2[6], 1);
    a2[6] = v8;
    v9 = a1[1];
    a1[3] = v8 + (*a1 ^ a1[4] ^ v9) + (a1[2] * 32 | a1[2] >> 27) + a1[3] + 1859775393;
    a1[1] = v9 * 0x40000000 | v9 >> 2;
    v10 = __ROL__(a2[15] ^ a2[4] ^ a2[9] ^ a2[7], 1);
    a2[7] = v10;
    v11 = a1[2];
    a1[4] = v10 + (a1[1] ^ *a1 ^ v11) + (a1[3] * 32 | a1[3] >> 27) + a1[4] + 1859775393;
    a1[2] = v11 * 0x40000000 | v11 >> 2;
    return v3;
}
