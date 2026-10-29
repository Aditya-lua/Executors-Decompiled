/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x425d90..0x425e28 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char * sub_425d90(char *a0, unsigned int a1, unsigned long long a2, unsigned long a3, unsigned long long a4, unsigned long a5)
{
    int v0;  // w9
    unsigned long long v1;  // x10
    unsigned long long v2;  // x12
    unsigned long long v3;  // x13

    if (a2 <= a4)
        return a0;
    v0 = (a1 | 1) + (a1 & 1) - 2;
    v1 = -a4;
    v2 = a3 - a4;
    while (1)
    {
        if (a3 + a4 + ((v1 & ~a3) + v2 - (v1 | a3)) * 2 < a5)
            return a0;
        v3 = a4 + a5;
        if (v3 < a2)
        {
            a0[v0] = a0[v0] - 1;
        }
        else if (a2 + v1 <= a5 - a2 + a4 || !(a0[v0] = a0[v0] - 1, v3 < a2))
        {
            break;
        }
        v1 -= a5;
        v2 -= a5;
        a4 = v3;
    }
    return a0;
}
