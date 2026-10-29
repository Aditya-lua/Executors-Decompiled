/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb7f288..0xb7f370 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


uint128_t * sub_b7f288(uint128_t *a0, uint128_t *a1)
{
    uint128_t *ptr;  // x0
    uint128_t v8;  // q1
    uint128_t v9;  // q1
    uint128_t *ptr1;  // x0
    uint128_t v11;  // q1
    uint128_t v12;  // q1
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
        v8 = a0[1];
        *ptr = *a0;
        ptr[1] = v8;
        v9 = a0[3];
        ptr[2] = a0[2];
        ptr[3] = v9;
        v0 = ptr;
        v1 = *a1;
        v2 = a1[1];
        v3 = a1[2];
        v4 = a1[3];
        ptr1 = _malloc(64);
        if (ptr1)
        {
            v11 = a1[1];
            *ptr1 = *a1;
            ptr1[1] = v11;
            v12 = a1[3];
            ptr1[2] = a1[2];
            ptr1[3] = v12;
            return ptr;
        }
        sub_c6ba70(8, 64);
    }
    else
    {
        sub_c6ba70(8, 64);
    }
    __debugbreak();
}
