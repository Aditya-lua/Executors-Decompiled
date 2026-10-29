/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb106d0..0xb106ec (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_b106d0(uint128_t *a0, uint128_t *a1)
{
    uint128_t v0;  // q1
    uint128_t v1;  // q0
    uint128_t v2;  // q1
    uint128_t v3;  // q3

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
    return (unsigned long long)v1;
}
