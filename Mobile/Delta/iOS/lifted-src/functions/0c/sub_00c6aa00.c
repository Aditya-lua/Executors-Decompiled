/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc6aa00..0xc6aa54 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_c6aa00(long long *a0, unsigned long a1, unsigned int *a2)
{
    unsigned long long v2;  // x0
    unsigned int v3;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_b48f78(*a0);
    if ((unsigned int)v2)
    {
        v2 = sub_b48f78(a0[1]);
        v3 = (unsigned int)v2 != 0;
    }
    else
    {
        v3 = 0;
    }
    *a2 = v3;
    return v2;
}
