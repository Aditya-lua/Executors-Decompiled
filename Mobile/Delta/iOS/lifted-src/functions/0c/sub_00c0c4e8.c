/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc0c4e8..0xc0c524 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_c0c4e8(void* a0, unsigned int *a1, unsigned long a2)
{
    unsigned int v0;  // w8

    if (3 < a2)
    {
        v0 = *a1;
        *(unsigned int **)&a0[8] = a1 + 1;
        *(unsigned long *)&a0[16] = a2 - 4;
        *(unsigned int *)&a0[24] = v0;
        *(unsigned long long *)a0 = 3;
        return a0;
    }
    *(unsigned long long *)a0 = 1;
    *(unsigned int **)&a0[8] = a1;
    *(unsigned long *)&a0[16] = a2;
    *(char *)&a0[24] = 23;
    return a0;
}
