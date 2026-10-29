/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7a764..0x7a7d4 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_7a764(unsigned long long *a0, unsigned long long a1, int a2)
{
    void* v0;  // x8
    unsigned int v1;  // w10
    int v2;  // w9
    void* iter;  // x11
    unsigned long long v4;  // x12
    unsigned long long v5;  // x12
    unsigned long long v6;  // x13
    unsigned long long v7;  // x9

    v0 = &a0[a2];
    if (a2 > (int)a1)
    {
        v1 = *(int *)v0;
        v2 = (unsigned int)a1 - 1;
        iter = &a0[(int)a1];
        v4 = a2 - (int)a1;
        do
        {
            v5 = v4;
            if ((unsigned int)*(int *)iter > v1)
            {
                v2 += 1;
                v6 = a0[v2];
                a0[v2] = *(long long *)iter;
                *(unsigned long long *)iter = v6;
            }
        } while ((iter += 8, v4 = v5 - 1, v5 != 1));
        a1 = v2 + 1;
    }
    v7 = a0[(unsigned int)a1];
    a0[(unsigned int)a1] = *(long long *)v0;
    *(unsigned long long *)v0 = v7;
    return a1;
}
