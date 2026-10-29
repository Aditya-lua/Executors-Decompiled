/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5534..0xb5610 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int * sub_b5534(unsigned int *a0, unsigned int *a1)
{
    unsigned int v0;  // w9
    unsigned int v1;  // w10
    unsigned int v2;  // w8
    unsigned int v3;  // w9
    unsigned int v4;  // w9
    unsigned int v5;  // w9

    v0 = *a1;
    a0[5] = v0;
    v1 = a0[4];
    v2 = a0[1];
    if (v1)
    {
        if (!v2)
            goto LABEL_b5584;
    }
    else
    {
        if (!v2)
        {
            v1 = 7 - a1[6] / 3;
            a0[4] = v1;
LABEL_b5584:
            v2 = v0 - v1;
            if (v2 >= 30)
                v2 = 30;
            if (6 >= v2)
                v2 = 6;
            a0[1] = v2;
        }
        else if (v0 > v2)
        {
            a0[4] = v0 - v2;
        }
    }
    if (a0[3])
    {
        v3 = a0[2];
        if (!v3)
            goto LABEL_b55e4;
    }
    else
    {
        if (7 < a1[6])
            v4 = 32;
        else
            v4 = 64;
        a0[3] = v4;
        v3 = a0[2];
        if (!v3)
        {
LABEL_b55e4:
            v5 = a1[6];
            if (a1[6] >= 8)
                v5 = 8;
            if (4 >= v5)
                v5 = 4;
            if (v5 < v2)
                v2 = v5;
            a0[2] = v2;
            return a0;
        }
    }
    if (v3 < v2)
        v2 = v3;
    a0[2] = v2;
    return a0;
}
