/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9bf260..0x9bf2d0 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9bf260(unsigned long a0, uint128_t *iter, unsigned long long a2, unsigned long a3)
{
    unsigned long long v2;  // x17
    long long v3;  // x0
    unsigned long long v4;  // x17
    uint128_t v5;  // q0
    unsigned long long i;  // x17
    uint128_t v7;  // q1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a2;
    v3 = sub_9be840();
    v4 = v2;
    if (v4 & 16)
    {
        v3 = sub_9be860(v3 + 16);
        *iter = v5;
        iter += 1;
        v4 = v2 - 16;
        if (v2 <= 16)
            return v3;
    }
    do
    {
        i = v4;
        v3 = sub_9be950(v3 + 32);
        iter[1] = v7;
        *iter = v5;
        iter += 2;
        v4 = i - 32;
    } while (32 < i);
    return v3;
}
