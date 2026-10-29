/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc28cc4..0xc28dac (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


uint128_t * sub_c28cc4(long long *a0)
{
    uint128_t *ptr;  // x0
    uint128_t *v8;  // x19
    uint128_t *ptr1;  // x0
    uint128_t *v10;  // x21
    uint128_t *v0;  // [bp-0x78]
    uint128_t v1;  // [bp-0x70]
    uint128_t v2;  // [bp-0x60]
    uint128_t v3;  // [bp-0x50]
    uint128_t v4;  // [bp-0x40]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    ptr = _malloc(64);
    if (ptr)
    {
        v8 = ptr;
        sub_c28e58(&v1, *a0);
        *v8 = v1;
        v8[1] = v2;
        v8[2] = v3;
        v8[3] = v4;
        v0 = v8;
        ptr1 = _malloc(64);
        if (ptr1)
        {
            v10 = ptr1;
            sub_c28e58(&v1, a0[1]);
            *v10 = v1;
            v10[1] = v2;
            v10[2] = v3;
            v10[3] = v4;
            return v0;
        }
    }
    else
    {
        sub_c6ba70(8, 64);
    }
    sub_c6ba70(8, 64);
    __debugbreak();
}
