/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9bf1d0..0x9bf260 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_9bf1d0(unsigned long a0, uint128_t *iter, unsigned long long a2, unsigned long a3, uint128_t *a4)
{
    unsigned long long v2;  // x17
    uint128_t v3;  // q6
    uint128_t *v11;  // x0
    uint128_t *v4;  // x0
    unsigned long long v5;  // x17
    uint128_t *v6;  // x0
    uint128_t v7;  // q0
    uint128_t v8;  // q0
    uint128_t v9;  // q1
    unsigned long long i;  // x17
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a2;
    v3 = *a4;
    v4 = sub_9beac0();
    v5 = v2;
    if (v5 & 16)
    {
        v6 = sub_9beaf0(v4 + 1);
        v8 = v3 ^ v7;
        v3 = *v4;
        *iter = v8;
        iter += 1;
        v5 = v2 - 16;
        v4 = v6;
        if (v2 <= 16)
        {
            *a4 = v3;
            return (unsigned long long)v8;
        }
    }
    do
    {
        i = v5;
        v11 = sub_9bec10(v4 + 2);
        v8 ^= v3;
        v9 ^= *v4;
        v3 = v4[1];
        iter[1] = v9;
        *iter = v8;
        iter += 2;
        v5 = i - 32;
        v4 = v11;
    } while (32 < i);
    *a4 = v3;
    return (unsigned long long)v8;
}
