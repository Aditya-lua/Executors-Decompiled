/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa779ec..0xa77a58 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a779ec(long long a0, unsigned long a1)
{
    unsigned long long *v2;  // x0
    unsigned long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6820c(sub_a7a42c(), 18);
    if (v2)
    {
        v3 = sub_a7a5d4(a0);
        if (v3 != *v2)
            goto *((void *)(v2[9]));
        else
            v2 = 1;
    }
    return (unsigned int)v2;
}
