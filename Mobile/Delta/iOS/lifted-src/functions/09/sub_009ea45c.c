/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ea45c..0x9ea50c (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9ea45c(void* a0, void* a1)
{
    unsigned long long v2;  // x0
    unsigned int i;  // w8
    unsigned long long v4;  // x0
    unsigned long long *iter;  // x9
    unsigned long long v6;  // x10
    unsigned long long *node;  // x11
    unsigned int v8;  // w8
    unsigned long long v9;  // x12
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0 != a1)
    {
        *(int *)&a0[16] = (int)a1[16];
        v2 = sub_9e4cdc(a0, (int)a1[8] + 1);
        if (!v2)
            return v2;
        i = (int)a1[8];
        *(unsigned int *)&a0[8] = i;
    }
    else
    {
        v4 = sub_9e4cdc(a0, (int)a1[8] + 1);
        if (!v4)
            return v4;
        i = (int)a1[8];
    }
    iter = *(long long *)a0;
    if ((int)i >= 1)
    {
        v6 = 0;
        node = *(long long *)a1;
        do
        {
            v8 = i;
            v9 = *node;
            node += 1;
            *iter = v6 | v9 * 2;
            iter += 1;
            v6 = v9 >> 63;
            i = v8 - 1;
        } while (i);
    }
    else
    {
        v6 = 0;
    }
    *iter = v6;
    *(unsigned int *)&a0[8] = (int)a0[8] + (unsigned int)v6;
    return 1;
}
