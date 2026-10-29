/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5b018..0xa5b060 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int * sub_a5b018(unsigned int *a0)
{
    unsigned int *v3;  // x0
    unsigned int *v4;  // x19
    long long v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_9c5df4(&v0, *a0);
    if (v3)
        v4 = *v3;
    else
        v4 = 0;
    sub_a32e7c(v0);
    return v4;
}
