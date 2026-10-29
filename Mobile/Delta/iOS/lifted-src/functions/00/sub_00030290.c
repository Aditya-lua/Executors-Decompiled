/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x30290..0x30310 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_30290(void* a0, void* a1)
{
    void* v0;  // x10
    unsigned long long v1;  // x8
    void* v2;  // x9
    void* v3;  // x9
    unsigned long v4;  // x10
    unsigned long long v5;  // x11
    void* v6;  // x12

    if (a0 == a1)
        return a0;
    v0 = a0 + 8;
    if (v0 == a1)
        return a0;
    v1 = 0;
    v2 = a0;
    do
    {
        v3 = v0;
        if ((unsigned int)*(int *)v2 > (unsigned int)(int)v2[8])
        {
            v4 = *(long long *)v3;
            v5 = v1;
            do
            {
                v6 = a0 + v5;
                *(long long *)&v6[8] = *(long long *)v6;
                if (!v5)
                    *(unsigned long *)a0 = v4;
            } while ((v5 -= 8, (unsigned int)v4 < (unsigned int)*(int *)((char *)v6 - 8)));
            *(unsigned long *)((char *)a0 + v5 + 8) = v4;
        }
    } while ((v0 = v3 + 8, v1 += 8, v2 = v3, v0 != a1));
    return a0;
}
