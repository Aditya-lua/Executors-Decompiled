/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb430b0..0xb43124 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_b430b0(uint128_t *a0)
{
    uint128_t *v2;  // x0
    uint128_t v3;  // q1
    uint128_t v4;  // q1
    uint128_t v5;  // q1
    uint128_t v6;  // q1
    uint128_t v7;  // q1
    uint128_t v8;  // q0
    uint128_t v9;  // q1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a2f9e0() && !(v2 = sub_a6bffc(192, "providers/implementations/macs/blake2_mac_impl.c", 65), !v2))
    {
        v3 = a0[9];
        v2[8] = a0[8];
        v2[9] = v3;
        v4 = a0[11];
        v2[10] = a0[10];
        v2[11] = v4;
        v5 = a0[5];
        v2[4] = a0[4];
        v2[5] = v5;
        v6 = a0[7];
        v2[6] = a0[6];
        v2[7] = v6;
        v7 = a0[1];
        *v2 = *a0;
        v2[1] = v7;
        v8 = a0[2];
        v9 = a0[3];
        v2[2] = v8;
        v2[3] = v9;
    }
    return (unsigned long long)v8;
}
