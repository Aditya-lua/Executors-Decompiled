/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa60b8c..0xa60c10 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a60b8c(unsigned long long a0, unsigned long long a1, unsigned int *a2)
{
    unsigned int v2;  // w8
    unsigned int v3;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    *a2 = 0;
    v2 = 64;
    if (a0 && a1)
    {
        if (sub_9e5528(a1, sub_9e4624()) >> 31 & 1)
        {
            v3 = 16;
        }
        else if (!(sub_9e5528(a1, a0) >> 31 & 1))
        {
            v3 = 32;
        }
        else
        {
            return 1;
        }
        v2 = *a2 | v3;
    }
    *a2 = v2;
    return 0;
}
