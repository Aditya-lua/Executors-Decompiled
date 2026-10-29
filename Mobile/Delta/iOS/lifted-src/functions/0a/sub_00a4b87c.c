/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4b87c..0xa4b8d4 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a4b87c(unsigned long a0, unsigned long a1, unsigned int *a2)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    *a2 = 0;
    if (*(int *)a0)
    {
        v2 = sub_a4b5e4();
        if (v2 >> 31 & 1)
            return 0xffffffff;
        *(unsigned int *)a0 = 0;
        *a2 = v2;
    }
    return 1;
}
