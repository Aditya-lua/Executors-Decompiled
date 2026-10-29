/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5ad34..0xa5ad88 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a5ad34(long long a0, long long a1)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a02090(a1);
    if (!(unsigned int)v2)
    {
        return v2;
    }
    else if (sub_a5ab14(a0, 116, a1))
    {
        return 1;
    }
    else
    {
        sub_a01fd4(a1);
        return 0;
    }
}
