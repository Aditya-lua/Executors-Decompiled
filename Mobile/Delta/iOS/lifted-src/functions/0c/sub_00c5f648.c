/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5f648..0xc5f688 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_c5f648(unsigned long long *a0)
{
    unsigned long long v2;  // x20
    unsigned long long *ptr;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0[1];
    ptr = _malloc(16);
    if (ptr)
    {
        *ptr = *a0;
        ptr[1] = v2;
        return (unsigned int)ptr;
    }
    sub_c6ba70(8, 16);
}
