/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f4b4c..0x9f4b9c (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9f4b4c(unsigned long long *a0, long long a1)
{
    unsigned long v0;  // [bp-0x30]
    unsigned long v1;  // [bp-0x28]
    unsigned long v2;  // [bp-0x20]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    if (a0[1])
    {
        v1 = a0[1];
        v2 = a0[2];
        v0 = *a0;
    }
    else
    {
        v0 = *a0;
    }
    return sub_9d524c(a1);
}
