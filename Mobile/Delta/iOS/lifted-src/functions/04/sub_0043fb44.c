/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x43fb44..0x43fbbc (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_43fb44(void* node, unsigned long long a1, void* a2)
{
    unsigned long long v0;  // x10
    unsigned long long i;  // x8
    void* iter;  // x9
    char v3;  // 4117
    unsigned long long j;  // x11
    unsigned long long v5;  // x11

    if ((long long)a1 < 1)
        return node;
    if (a1 < 16 || a2 + 4 > node && node + a1 > a2)
    {
        i = a1;
        iter = node;
    }
    else
    {
        v0 = a1 & 0x7ffffffffffffff0;
        i = a1 & 15;
        iter = node + v0;
        v3 = *(char *)a2;
        j = v0;
        do
        {
            v5 = j;
            *(uint128_t *)node = CONCAT(v3 | v3 * 0x100 | (v3 | v3 * 0x100) * 0x10000 | (v3 | v3 * 0x100 | (v3 | v3 * 0x100) * 0x10000) * 0x100000000, v3 | v3 * 0x100 | (v3 | v3 * 0x100) * 0x10000 | (v3 | v3 * 0x100 | (v3 | v3 * 0x100) * 0x10000) * 0x100000000);
            node += 16;
            j = v5 - 16;
        } while (j);
        if (v0 == a1)
            return node + v0;
    }
    do
    {
        *(char *)iter = *(int *)a2;
        iter += 1;
        i -= 1;
    } while (0 < (long long)i);
    return iter + 1;
}
