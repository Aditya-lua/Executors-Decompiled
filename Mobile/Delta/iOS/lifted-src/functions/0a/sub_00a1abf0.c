/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1abf0..0xa1ac74 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a1abf0(long long *a0, long long a1, long long a2)
{
    unsigned long long *v2;  // x22
    long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0 + 6;
    sub_a6c2e4(a0[6], "crypto/ec/ec_lib.c", 534);
    *v2 = 0;
    v2[1] = 0;
    if (!a1)
    {
        return 1;
    }
    else if (a2)
    {
        v3 = sub_a6bf4c(a2, "crypto/ec/ec_lib.c", 541);
        *v2 = v3;
        if (!v3)
            return v3;
        _memcpy();
        a0[7] = a2;
        return a2;
    }
    else
    {
        return 1;
    }
}
