/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc2b4c8..0xc2b584 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_c2b4c8(void* a0, void* a1, unsigned long long a2)
{
    unsigned long v0;  // x8
    unsigned long v1;  // x8
    unsigned long v10;  // x8
    unsigned long v2;  // x8
    unsigned long long v3;  // x9
    void* v4;  // x8
    void* v5;  // x9
    unsigned long long v6;  // x10
    unsigned int v7;  // w10
    unsigned short v8;  // x11
    char v9;  // x11

    v0 = *(long long *)a0;
    *(long long *)a0 = *(long long *)a1;
    *(unsigned long *)a1 = v0;
    v1 = (long long)a0[8];
    *(long long *)&a0[8] = (long long)a1[8];
    *(unsigned long *)&a1[8] = v1;
    v2 = (long long)a0[16];
    *(long long *)&a0[16] = (long long)a1[16];
    *(unsigned long *)&a1[16] = v2;
    if ((a2 >> 3 & 7) != 3)
    {
        v10 = (long long)a0[24];
        *(long long *)&a0[24] = (long long)a1[24];
        *(unsigned long *)&a1[24] = v10;
        return a0;
    }
    else if (a2 & 7)
    {
        v3 = a2 & 56;
        v4 = a0 + v3;
        v5 = a1 + v3;
        if (4 > (a2 & 7))
        {
            v6 = 0;
            if (a2 >> 1 & 1)
                goto LABEL_c2b558;
        }
        else
        {
            v7 = *(int *)v4;
            *(int *)v4 = *(int *)v5;
            *(unsigned int *)v5 = v7;
            v6 = 4;
            if (a2 >> 1 & 1)
            {
LABEL_c2b558:
                v8 = *(short *)((char *)v4 + v6);
                *(short *)((char *)v4 + v6) = *(short *)((char *)v5 + v6);
                *(unsigned short *)((char *)v5 + v6) = v8;
                v6 |= 2;
            }
        }
        if (!(a2 & 1))
            return a0;
        v9 = *((char *)v4 + v6);
        *((char *)v4 + v6) = *((char *)v5 + v6);
        *((char *)v5 + v6) = v9;
        return a0;
    }
    else
    {
        return a0;
    }
}
