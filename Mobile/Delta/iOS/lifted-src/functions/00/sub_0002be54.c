/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2be54..0x2bea8 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_2be54(void* a0, void* a1)
{
    void* v0;  // x0
    void* v1;  // x8
    void* v2;  // x0
    unsigned long v3;  // x8
    void* v4;  // x9
    void* v5;  // x10
    void* v6;  // x9

    if (a0 == a1)
        return a0;
    while (1)
    {
        v0 = a0;
        v1 = v0 + 8;
        if (v1 == a1)
            break;
        v2 = v1;
        a0 = v2;
        if ((unsigned int)*(int *)v0 > (unsigned int)(int)v0[8])
        {
            v3 = *(long long *)v2;
            v4 = v2;
            do
            {
                v5 = v4;
                v6 = v4 - 8;
                *(long long *)v5 = *(long long *)((char *)v4 - 8);
                v4 = v6;
            } while ((unsigned int)v3 < (unsigned int)*(int *)((char *)v5 - 16));
            *(unsigned long *)v6 = v3;
            a0 = v2;
        }
    }
    return v0;
}
