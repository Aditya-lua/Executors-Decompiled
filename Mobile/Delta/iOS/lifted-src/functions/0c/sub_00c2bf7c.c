/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc2bf7c..0xc2c048 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_c2bf7c(unsigned long long *a0, unsigned long a1, unsigned long a2, uint128_t a3)
{
    unsigned long v3;  // x19
    unsigned long ptr;  // x8
    unsigned long v5;  // x9
    unsigned long v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (a3 * a1 > 0xffffffffffffffff || (v3 = a1 * a3, 0x8000000000000000 - a2 < v3))
    {
        a0[1] = 0;
        v5 = 1;
    }
    else if (!v3)
    {
        v5 = 0;
        a0[1] = 0;
        a0[2] = a2;
    }
    else if (a2 > v3)
    {
        v0 = 0;
        a0 = a0;
        if (!_posix_memalign(&v0, 8, v3) && !(ptr = v0, !ptr))
            goto LABEL_c2c028;
LABEL_c2bff0:
        a0[1] = a2;
        a0[2] = v3;
        v5 = 1;
    }
    else
    {
        ptr = _malloc(v3);
        if (!ptr)
            goto LABEL_c2bff0;
LABEL_c2c028:
        v5 = 0;
        a0[1] = a1;
        a0[2] = ptr;
    }
    *a0 = v5;
    return a0;
}
