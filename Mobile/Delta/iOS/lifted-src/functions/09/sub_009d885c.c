/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d885c..0x9d8904 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_e8b5e0;

double sub_9d885c(unsigned long a0, unsigned long long a1)
{
    unsigned long long len;  // x20
    unsigned long long idx;  // x0
    uint128_t *v4;  // x9
    unsigned long v5;  // x8
    uint128_t v6;  // q0
    uint128_t v7;  // q1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0)
    {
        if (!(a1 >> 31 & 1))
            len = a1 & 0xffffffff;
        else
            len = _strlen(a0);
        idx = sub_9d3c1c(&g_e8b5e0);
        if (idx)
        {
            v4 = *(long long *)*(long long *)(idx + 64);
            v5 = *(long long *)(*(long long *)(idx + 64) + 8);
            *(unsigned long long *)v4 = len;
            *(unsigned long *)((char *)v4 + 8) = a0;
            *(unsigned long long *)&v4[1] = len;
            v6 = *v4;
            v7 = v4[1];
            *(uint128_t *)v5 = v6;
            *(uint128_t *)(v5 + 16) = v7;
            *(unsigned int *)(idx + 48) = *(int *)(idx + 48) | 0x200;
            *(unsigned int *)(idx + 56) = 0;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/bio/bss_mem.c", 90, "BIO_new_mem_buf");
        sub_a36abc(32, 0xc0102, 0);
    }
    return *(unsigned long long *)&v6;
}
