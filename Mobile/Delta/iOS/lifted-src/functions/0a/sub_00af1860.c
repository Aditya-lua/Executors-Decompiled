/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf1860..0xaf1928 (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af1860_0 {
    char padding_0[32];
    unsigned int field_20;
} st_af1860_0;


unsigned long long sub_af1860(unsigned long long a0, st_af1860_0 *a1)
{
    unsigned long long v2;  // w0
    unsigned long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1)
    {
        return a0 != 0;
    }
    else if (a0)
    {
        if ((!*(long long *)(a0 + 24) || *(int *)(a0 + 8)) && sub_afa378(a0, 0) >> 31 & 1)
            return 0xfffffffe;
        if ((!*(long long *)&a1->padding_0[24] || *(int *)&a1->padding_0[8]) && sub_afa378(a1, 0) >> 31 & 1)
            return 0xfffffffe;
        v2 = *(int *)(a0 + 32) - a1->field_20;
        if (!v2 && !*(int *)(a0 + 32))
            return 0;
        if (!v2)
        {
            if (!*(long long *)(a0 + 24))
            {
                return 0xfffffffe;
            }
            else if (*(long long *)&a1->padding_0[24])
            {
                v2 = (unsigned int)_memcmp();
            }
            else
            {
                return 0xfffffffe;
            }
        }
        if (0 <= v2)
            v3 = v2 > 0;
        else
            v3 = 0xffffffff;
        return v3;
    }
    else
    {
        return 0xffffffff;
    }
}
