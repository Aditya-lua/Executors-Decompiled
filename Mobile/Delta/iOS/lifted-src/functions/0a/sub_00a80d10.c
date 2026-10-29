/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa80d10..0xa80d70 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int * sub_a80d10(unsigned int *a0, void* a1, unsigned int *a2)
{
    unsigned long long i;  // x8
    unsigned long v1;  // x12
    unsigned int v2;  // w12

    i = 0;
    do
    {
        v1 = *(int *)((char *)a1 + i) * *(int *)((char *)a0 + i);
        v2 = v1 + (0xfc7fdfff * (unsigned int)v1) * 0x7fe001 >> 32;
        *(unsigned int *)((char *)a2 + i) = v2 + 0xff801fff & ~((int)(v2 + 0xff801fff & ~v2) >> 31) | (int)(v2 + 0xff801fff & ~v2) >> 31 & v2;
        i += 4;
    } while (i != 0x400);
    return a0;
}
