/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb7205c..0xb720d8 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b7205c(unsigned long long *a0, unsigned long a1, long long a2)
{
    unsigned long v2;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0[2];
    if (*a0 - v2 < (unsigned long long)a2)
    {
        sub_c6b984(a0, v2, a2);
        v2 = a0[2];
    }
    else if (!a2)
    {
        a0[2] = v2 + a2;
        return 0;
    }
    _memcpy(a0[1] + v2);
    a0[2] = v2 + a2;
    return 0;
}
