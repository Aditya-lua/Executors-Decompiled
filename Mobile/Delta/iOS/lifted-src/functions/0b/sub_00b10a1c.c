/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb10a1c..0xb10a80 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_b10a1c(uint128_t *a0)
{
    uint128_t *v2;  // x0
    uint128_t v3;  // q1
    uint128_t v4;  // q1
    uint128_t v5;  // q0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a2f9e0() && !(v2 = sub_a6bf4c(112, "providers/implementations/digests/sha2_prov.c", 0x44), !v2))
    {
        v3 = a0[5];
        v2[4] = a0[4];
        v2[5] = v3;
        v2[6] = a0[6];
        v4 = a0[1];
        *v2 = *a0;
        v2[1] = v4;
        v5 = a0[3];
        v2[2] = a0[2];
        v2[3] = v5;
    }
    return (unsigned long long)v5;
}
