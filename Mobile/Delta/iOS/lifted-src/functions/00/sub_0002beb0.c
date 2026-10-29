/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2beb0..0x2bf0c (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_2beb0(unsigned long a0, void* a1, unsigned long a2, unsigned long long a3)
{
    unsigned long long v0;  // x8
    void* v1;  // x10
    void* v2;  // x1
    unsigned long v3;  // x9
    void* v4;  // x1

    if ((long long)a3 < 2)
        return a0;
    v0 = a3 - 2 >> 1;
    v1 = a0 + v0 * 8;
    v2 = a1 - 8;
    if ((unsigned int)*(int *)((char *)a1 - 8) <= (unsigned int)*(int *)v1)
        return a0;
    v3 = *(long long *)v2;
    do
    {
        v4 = v1;
        *(long long *)v2 = *(long long *)v1;
    } while (v0 && (v0 = (v0 - 1) / 2, v1 = a0 + v0 * 8, v2 = v4, (unsigned int)*(int *)v1 < (unsigned int)v3));
    *(unsigned long *)v4 = v3;
    return a0;
}
