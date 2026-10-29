/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa66f20..0xa66f84 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a66f20(void* a0, void* a1, unsigned long long i)
{
    unsigned long long v0;  // w3
    unsigned long long v1;  // x2
    void* v2;  // x0
    void* v3;  // x1

    v0 = 0;
    if (i)
    {
        if (i == 16)
        {
            if (!(*(long long *)a0 ^ *(long long *)a1) && !((long long)a0[8] ^ (long long)a1[8]))
                return 0;
            return 1;
        }
        do
        {
            v1 = i;
            v2 = a0 + 1;
            v3 = a1 + 1;
            v0 |= *(char *)a0 ^ *(char *)a1;
            i = v1 - 1;
            a0 = v2;
            a1 = v3;
        } while (i);
    }
    return -v0 >> 31;
}
