/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x348a4..0x34900 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_348a4(void* a0, unsigned long long a1, char *a2)
{
    char v0;  // x8
    unsigned long long j;  // x9
    unsigned long long v10;  // x9
    void* v2;  // x0
    unsigned long long v3;  // x10
    uint128_t v4;  // q0
    uint128_t *iter;  // x11
    unsigned long long i;  // x12
    unsigned long long v7;  // x12
    void* v9;  // x0

    if (!a1)
        return a0;
    v0 = *a2;
    if (32 > a1)
    {
        j = a1;
        v2 = a0;
    }
    else
    {
        v3 = a1 & 0xffffffffffffffe0;
        j = a1 & 31;
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
    do
    {
        v9 = v2;
        v10 = j;
        *(char *)v9 = v0;
        j = v10 - 1;
        v2 = v9 + 1;
    } while (j);
    return v9 + 1;
}
