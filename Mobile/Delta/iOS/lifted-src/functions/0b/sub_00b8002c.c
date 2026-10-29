/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb8002c..0xb800a0 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


uint128_t * sub_b8002c(long long a0)
{
    uint128_t *ptr;  // x0
    uint128_t *v7;  // x19
    long long v8;  // x0
    long long v9;  // x19
    uint128_t v0;  // [bp-0x60]
    uint128_t v1;  // [bp-0x50]
    uint128_t v2;  // [bp-0x40]
    uint128_t v3;  // [bp-0x30]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    ptr = _malloc(64);
    if (ptr)
    {
        v7 = ptr;
        sub_b80120(&v0, a0);
        *v7 = v0;
        v7[1] = v1;
        v7[2] = v2;
        v7[3] = v3;
        return v7;
    }
    v8 = sub_c6ba70(8, 64);
    _free(v9);
    __Unwind_Resume(v8);
}
