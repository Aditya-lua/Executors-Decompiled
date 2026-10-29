/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc0c524..0xc0c5d8 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_c0c524(unsigned long long *a0, unsigned long long a1)
{
    unsigned long long idx;  // x8
    unsigned long long idx1;  // x9
    unsigned long long v2;  // x10
    unsigned long long v3;  // x10
    unsigned long long j;  // x11
    unsigned long long v5;  // x13
    unsigned long long v6;  // x12
    unsigned long long index;  // x12
    unsigned long long v8;  // x11
    unsigned long long v9;  // x13

    idx = a1 + (a1 >> 1);
    do
    {
        idx -= 1;
        idx1 = idx - a1;
        if (a1 > idx)
        {
            idx1 = 0;
            v2 = *a0;
            *a0 = a0[idx];
            a0[idx] = v2;
        }
        if (a1 < idx)
            v3 = a1;
        else
            v3 = idx;
        j = (1 | (idx1 * 2 | idx1 >> 63) & 0x7ffffffffffffffe) & 0x7fffffffffffffff;
        if (v3 > j)
        {
            v5 = idx1 * 2;
            do
            {
                v6 = v5 + 2;
                if (v3 > v6)
                {
                    if (a0[v6] <= a0[j])
                        index = j;
                    else
                        index = j + 1;
                    v8 = a0[idx1];
                    v9 = a0[index];
                    if (v8 >= v9)
                        break;
                }
                else
                {
                    index = j;
                    v8 = a0[idx1];
                    v9 = a0[index];
                    if (v9 <= v8)
                        break;
                }
                a0[idx1] = v9;
                a0[index] = v8;
                v5 = index * 2;
                j = (1 | (index * 2 | index >> 63) & 0x7ffffffffffffffe) & 0x7fffffffffffffff;
                idx1 = index;
            } while (j < v3);
        }
    } while (idx);
    return a0;
}
