/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a3ff4..0x1a40d0 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_1a3ff4(void* a0, unsigned long long a1, unsigned int *a2)
{
    unsigned int v0;  // w8
    unsigned long long v1;  // x9
    void* v2;  // x0
    unsigned long long v3;  // x10
    uint128_t v4;  // q0
    void* iter;  // x11
    unsigned long long i;  // x12
    unsigned long long v7;  // x12

    if ((long long)a1 < 1)
        return a0;
    v0 = *a2;
    if (8 > a1)
    {
        v1 = a1;
        v2 = a0;
    }
    else
    {
        v3 = a1 & 0x7ffffffffffffff8;
        v1 = a1 & 7;
        v2 = a0 + v3 * 4;
        v4 = CONCAT(v0 | v0 * 0x100000000, v0 | v0 * 0x100000000);
        iter = a0 + 16;
        i = v3;
        do
        {
            v7 = i;
            *(uint128_t *)((char *)iter - 16) = v4;
            *(uint128_t *)iter = v4;
            iter += 32;
            i = v7 - 8;
        } while (i);
        if (v3 == a1)
            return a0 + v3 * 4;
    }
    *(unsigned int *)v2 = v0;
    if (v1 < 2)
        return v2 + 4;
    *(unsigned int *)&v2[4] = v0;
    if (v1 == 2)
        return v2 + 8;
    *(unsigned int *)&v2[8] = v0;
    if (v1 < 4)
        return v2 + 12;
    *(unsigned int *)&v2[12] = v0;
    if (v1 == 4)
        return v2 + 16;
    *(unsigned int *)&v2[16] = v0;
    if (v1 < 6)
        return v2 + 20;
    *(unsigned int *)&v2[20] = v0;
    if (v1 != 7)
        return v2 + 24;
    *(unsigned int *)&v2[24] = v0;
    return v2 + 28;
}
