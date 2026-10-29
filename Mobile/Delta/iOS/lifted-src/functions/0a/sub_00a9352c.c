/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9352c..0xa937c8 (668 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_a9352c(void* a0, void* a1, unsigned long a2, unsigned long long a3)
{
    unsigned long long j;  // x21
    void* v3;  // x23
    unsigned long long v12;  // x10
    unsigned long v13;  // x11
    unsigned long long v15;  // x8
    unsigned long long v16;  // x8
    void* iter;  // x0
    unsigned long long v18;  // x8
    void* v19;  // x10
    unsigned long v21;  // x10
    unsigned long v4;  // x24
    unsigned long long *v5;  // x25
    unsigned long long v6;  // x8
    unsigned long v7;  // x26
    unsigned long long v8;  // x8
    void* node;  // x9
    unsigned long long v10;  // x10
    unsigned long long i;  // x10
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    j = a3;
    v3 = a1;
    v4 = *(char *)a0;
    v5 = (long long)a0[40];
    if (!(v4 >> 6 & 1))
        v5();
    v6 = v4 & 7;
    *(char *)a0 = v6;
    v7 = v6 ^ 15;
    if ((unsigned int)v6)
    {
        v8 = 0;
        node = a0 + v7;
        v10 = 14 - v7;
        if (14 < v7)
            v10 = 0;
        i = v10 + 1;
        do
        {
            v12 = i;
            v13 = *(char *)node;
            *(char *)node = 0;
            node += 1;
            v8 = (v8 | v13) * 0x100;
            i = v12 - 1;
        } while (i);
    }
    else
    {
        v8 = 0;
    }
    v15 = v8 | (char)a0[15];
    *(char *)&a0[15] = 1;
    if (v15 != j)
        return 0xffffffff;
    v16 = (long long)a0[32] + (j + 15 >> 3 | 1);
    *(unsigned long long *)&a0[32] = v16;
    if (v16 > 0x2000000000000000)
        return 0xfffffffe;
    if (16 <= j)
    {
        v21 = (long long)a0[24];
        *(long long *)&a0[16] = (long long)a0[16] ^ *(long long *)v3;
        *(unsigned long *)&a0[24] = v21 ^ (long long)v3[8];
        v5();
    }
    else if (j)
    {
        iter = a0 + 16;
        do
        {
            v18 = j;
            v19 = v3 + 1;
            *(char *)iter = *(char *)iter ^ *(char *)v3;
            iter += 1;
            j = v18 - 1;
            v3 = v19;
        } while (j);
        v5();
    }
    else
    {
        _bzero(a0 + (v7 & 0xffffffff), 16 - v7);
        v5();
    }
}
