/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac2cb4..0xac2cc0 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_ac2cb4(uint128_t *a0, uint128_t *a1)
{
    uint128_t v0;  // q0
    uint128_t v1;  // q1

    v0 = *a1;
    v1 = a1[1];
    *a0 = v0;
    a0[1] = v1;
    return (unsigned long long)v0;
}
