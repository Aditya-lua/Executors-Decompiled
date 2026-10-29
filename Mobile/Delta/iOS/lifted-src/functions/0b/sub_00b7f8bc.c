/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb7f8bc..0xb7f924 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_b7f8bc(uint128_t *a0, unsigned long a1)
{
    uint128_t *ptr;  // x0
    uint128_t v3;  // q1
    uint128_t v4;  // q0
    uint128_t v5;  // q1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    ptr = _malloc(64);
    if (ptr)
    {
        v3 = a0[1];
        *ptr = *a0;
        ptr[1] = v3;
        v4 = a0[2];
        v5 = a0[3];
        ptr[2] = v4;
        ptr[3] = v5;
        return (unsigned long long)v4;
    }
    sub_c6ba70(8, 64);
    __debugbreak();
}
