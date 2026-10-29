/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa77a58..0xa77ae0 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a77a58(long long a0, unsigned long a1)
{
    unsigned long long *v3;  // x0
    unsigned long long *v4;  // x21
    unsigned long long v5;  // x0
    unsigned long v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_a6820c(sub_a7a42c(), 18);
    if (v3)
    {
        v4 = v3;
        v5 = sub_a7a5d4(a0);
        if (v5 != *v4)
        {
            v0 = v4[10];
            sub_a7a5d4(a0);
            goto *((void *)(v0));
        }
        else
        {
            v3 = 1;
        }
    }
    return (unsigned int)v3;
}
