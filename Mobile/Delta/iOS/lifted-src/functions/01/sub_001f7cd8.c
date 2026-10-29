/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f7cd8..0x1f7d40 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long * sub_1f7cd8(long long *a0)
{
    long long v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (a0[8])
        operatordelete(sub_1fbc44(a0[8]));
    if (a0[9])
    {
        v0 = a0[9];
        sub_271a8(&v0);
        operatordelete(v0);
    }
    _free(a0[14]);
    return a0;
}
