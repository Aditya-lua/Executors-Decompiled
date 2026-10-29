/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb860fc..0xb86210 (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_b860fc(void* a0, void* a1, unsigned long long a2)
{
    unsigned long long v0;  // x9
    unsigned long long v1;  // x8
    void* v10;  // x9
    void* v11;  // x10
    unsigned long long v12;  // x8
    unsigned int v13;  // w8
    unsigned short v14;  // x11
    char v15;  // x11
    unsigned long v2;  // x10
    unsigned long v3;  // x10
    unsigned long v4;  // x10
    unsigned long v5;  // x10
    unsigned long v6;  // x10
    unsigned long v7;  // x10
    unsigned long v8;  // x9
    unsigned long long v9;  // x10

    v0 = a2 >> 3;
    v1 = a2 & 7;
    if (v0)
    {
        v2 = *(long long *)a0;
        *(long long *)a0 = *(long long *)a1;
        *(unsigned long *)a1 = v2;
        if (v0 != 1)
        {
            v3 = (long long)a0[8];
            *(long long *)&a0[8] = (long long)a1[8];
            *(unsigned long *)&a1[8] = v3;
            if (v0 != 2)
            {
                v4 = (long long)a0[16];
                *(long long *)&a0[16] = (long long)a1[16];
                *(unsigned long *)&a1[16] = v4;
                if (v0 != 3)
                {
                    v5 = (long long)a0[24];
                    *(long long *)&a0[24] = (long long)a1[24];
                    *(unsigned long *)&a1[24] = v5;
                    if (v0 != 4)
                    {
                        v6 = (long long)a0[32];
                        *(long long *)&a0[32] = (long long)a1[32];
                        *(unsigned long *)&a1[32] = v6;
                        if (v0 != 5)
                        {
                            v7 = (long long)a0[40];
                            *(long long *)&a0[40] = (long long)a1[40];
                            *(unsigned long *)&a1[40] = v7;
                            if (v0 != 6)
                            {
                                v8 = (long long)a0[48];
                                *(long long *)&a0[48] = (long long)a1[48];
                                *(unsigned long *)&a1[48] = v8;
                            }
                        }
                    }
                }
            }
        }
    }
    if (!v1)
        return a0;
    v9 = a2 & 56;
    v10 = a0 + v9;
    v11 = a1 + v9;
    if (4 > v1)
    {
        v12 = 0;
        if (a2 >> 1 & 1)
            goto LABEL_b861e4;
    }
    else
    {
        v13 = *(int *)v10;
        *(int *)v10 = *(int *)v11;
        *(unsigned int *)v11 = v13;
        v12 = 4;
        if (a2 >> 1 & 1)
        {
LABEL_b861e4:
            v14 = *(short *)((char *)v10 + v12);
            *(short *)((char *)v10 + v12) = *(short *)((char *)v11 + v12);
            *(unsigned short *)((char *)v11 + v12) = v14;
            v12 |= 2;
        }
    }
    if (!(a2 & 1))
        return a0;
    v15 = *((char *)v10 + v12);
    *((char *)v10 + v12) = *((char *)v11 + v12);
    *((char *)v11 + v12) = v15;
    return a0;
}
