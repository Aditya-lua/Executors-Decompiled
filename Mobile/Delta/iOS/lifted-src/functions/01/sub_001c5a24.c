/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c5a24..0x1c5a80 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_1c5a24(void* a0)
{
    void* v2;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if ((long long)a0[16])
        _free((long long)a0[16]);
    if ((long long)a0[24])
        _free((long long)a0[24]);
    if ((long long)a0[32])
        _free((long long)a0[32]);
    v2 = a0 + 8;
    if ((long long)a0[8])
        _free((long long)a0[8]);
    *(uint128_t *)v2 = 0;
    *(uint128_t *)&v2[16] = 0;
    return a0;
}
