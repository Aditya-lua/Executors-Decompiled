/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb86a90..0xb86ac8 (56 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_b86a90(long long *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    if (a0[2] >= 1)
    {
        v0 = &v1;
        _free(a0[3]);
    }
    _free();
    return;
}
