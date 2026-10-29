/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95f460..0x95f514 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int * sub_95f460(unsigned int *a0, long long a1)
{
    unsigned long v2;  // x8
    unsigned int idx;  // x19
    long long v4;  // x20
    unsigned long v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return a0;
    v2 = *a0;
    if ((unsigned int)v2)
    {
        if (!(v2 >> 7 & 1))
            idx = 0;
        else
            idx = sub_980dc8();
        if (!idx)
            return a0;
    }
    else
    {
        idx = (unsigned int)a0;
    }
    v4 = a1;
    v5 = *(long long *)(idx + 88);
    if (*(long long *)(idx + 96))
    {
        v5 = sub_9d4f1c(v5);
        *(unsigned long *)(idx + 88) = v5;
    }
    sub_9d5018(v5);
    *(long long *)(idx + 88) = v4;
    if (*(long long *)(idx + 96))
        *(unsigned long long *)(idx + 88) = sub_9d4ec8(*(long long *)(idx + 96), v4);
    goto *((void *)(*(long long *)(*(long long *)(idx + 3192) + 88)));
}
