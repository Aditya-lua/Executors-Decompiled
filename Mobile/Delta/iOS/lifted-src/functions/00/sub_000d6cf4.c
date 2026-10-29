/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xd6cf4..0xd6d5c (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_d6cf4(void* a0, unsigned long long a1, char *a2)
{
    char v0;  // x8
    unsigned long long v1;  // x9
    void* v10;  // x0
    void* v2;  // x0
    unsigned long long v3;  // x10
    uint128_t v4;  // q0
    uint128_t *iter;  // x11
    unsigned long long i;  // x12
    unsigned long long v7;  // x12
    unsigned long long j;  // x9

    if ((long long)a1 < 1)
        return a0;
    v0 = *a2;
    if (32 > a1)
    {
        v1 = a1;
        v2 = a0;
    }
    else
    {
        v3 = a1 & 0x7fffffffffffffe0;
        v1 = a1 & 31;
        v2 = a0 + v3;
        v4 = CONCAT(v0 | v0 * 0x100 | (v0 | v0 * 0x100) * 0x10000 | (v0 | v0 * 0x100 | (v0 | v0 * 0x100) * 0x10000) * 0x100000000, v0 | v0 * 0x100 | (v0 | v0 * 0x100) * 0x10000 | (v0 | v0 * 0x100 | (v0 | v0 * 0x100) * 0x10000) * 0x100000000);
        iter = a0 + 16;
        i = v3;
        do
        {
            v7 = i;
            *(uint128_t *)((char *)iter - 16) = v4;
            *iter = v4;
            iter += 2;
            i = v7 - 32;
        } while (i);
        if (v3 == a1)
            return a0 + v3;
    }
    j = v1 + 1;
    do
    {
        v10 = v2;
        *(char *)v10 = v0;
        j -= 1;
        v2 = v10 + 1;
    } while (1 < (long long)j);
    return v10 + 1;
}
