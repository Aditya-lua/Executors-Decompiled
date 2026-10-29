/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0c59c..0xb0c5c8 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_b0c59c(uint128_t *a0, uint128_t *a1)
{
    uint128_t v0;  // q1
    uint128_t v1;  // q0
    uint128_t v2;  // q1
    uint128_t v3;  // q3
    uint128_t v4;  // q0
    uint128_t v5;  // q1
    uint128_t v6;  // q3

    v0 = a1[1];
    *a0 = *a1;
    a0[1] = v0;
    v1 = a1[2];
    v2 = a1[3];
    v3 = a1[5];
    a0[4] = a1[4];
    a0[5] = v3;
    a0[2] = v1;
    a0[3] = v2;
    v4 = a1[6];
    v5 = a1[7];
    v6 = a1[9];
    a0[8] = a1[8];
    a0[9] = v6;
    a0[6] = v4;
    a0[7] = v5;
    return (unsigned long long)v4;
}
