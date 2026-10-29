/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc3ef84..0xc3efb4 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_c3ef84(void* a0, unsigned long a1, unsigned long long a2)
{
    unsigned long long v0;  // x9
    unsigned long v1;  // x8

    v0 = (long long)a0[8];
    if (a2 <= (unsigned long long)(long long)a0[8])
        v1 = *(int *)a0;
    else
        v1 = 1;
    *(unsigned long *)a0 = v1;
    *(unsigned long long *)&a0[8] = v0 - a2;
    if (v1 & 1)
        return 1;
    goto *((void *)(*(long long *)(*(long long *)((long long)a0[16] + 8) + 24)));
}
