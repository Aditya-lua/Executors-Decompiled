/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb59b98..0xb59be4 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_b59b98(uint128_t *a0)
{
    uint128_t *v2;  // x0
    uint128_t v3;  // q0
    uint128_t v4;  // q1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a2f9e0() && !(v2 = sub_a6bf4c(32, "providers/implementations/digests/mdc2_prov.c", 61), !v2))
    {
        v3 = *a0;
        v4 = a0[1];
        *v2 = v3;
        v2[1] = v4;
    }
    return (unsigned long long)v3;
}
