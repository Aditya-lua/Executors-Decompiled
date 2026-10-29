/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b644..0x1b690 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_1b644(void* a0, void* a1)
{
    unsigned int v0;  // w8
    uint128_t v1;  // q0
    uint128_t v2;  // q0

    v0 = (char)a0[24];
    if (v0 == (char)a1[24])
    {
        if (v0)
        {
            *(long long *)a0 = *(long long *)a1;
            v1 = (int128_t)a1[8];
            *(uint128_t *)&a0[8] = v1;
            return (unsigned long long)v1;
        }
    }
    else
    {
        if (!v0)
        {
            v2 = *(int128_t *)a1;
            *(long long *)&a0[16] = (long long)a1[16];
            *(uint128_t *)a0 = v2;
            *(char *)&a0[24] = 1;
        }
    }
    return *(unsigned long long *)&v2;
}
