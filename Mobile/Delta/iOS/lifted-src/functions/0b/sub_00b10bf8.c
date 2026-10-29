/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb10bf8..0xb10c1c (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_b10bf8(uint128_t *a0, uint128_t *a1)
{
    uint128_t v0;  // q0
    uint128_t v1;  // q2
    uint128_t v2;  // q0
    uint128_t v3;  // q1
    uint128_t v4;  // q3

    v0 = *a1;
    v1 = a1[2];
    a0[1] = a1[1];
    a0[2] = v1;
    *a0 = v0;
    v2 = a1[3];
    v3 = a1[4];
    v4 = a1[6];
    a0[5] = a1[5];
    a0[6] = v4;
    a0[3] = v2;
    a0[4] = v3;
    return (unsigned long long)v2;
}
