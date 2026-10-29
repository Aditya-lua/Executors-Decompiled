/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7f880..0x7f8e4 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_7f880(void* a0, unsigned long long a1, unsigned int a2)
{
    unsigned long long v0;  // w8
    unsigned int v1;  // w8
    unsigned int v2;  // w9
    unsigned long long v3;  // x9
    unsigned long long v4;  // x10
    unsigned int v5;  // w9

    if (a1 >= 4)
    {
        *(double *)&a0[4] = *(double *)a0;
        v0 = a1 - 3;
    }
    else
    {
        v1 = a1 + a2;
        v2 = v1 - 1;
        if (v1 == 1)
            return a0;
        if (v2 == 3)
        {
            v0 = *(int *)a0 - 1;
            v3 = 4;
        }
        else
        {
            v0 = *(int *)((char *)a0 + 4 * v2);
            v3 = 8;
            v4 = 4;
            if (1 < v2)
                v3 = v4;
        }
LABEL_7f8d0:
        v5 = *(int *)((char *)a0 + v3);
        *(int *)&a0[4] = *(int *)a0;
        *(unsigned int *)&a0[8] = v5;
        goto LABEL_7f8d0;
    }
    *(unsigned int *)a0 = v0;
    return a0;
}
