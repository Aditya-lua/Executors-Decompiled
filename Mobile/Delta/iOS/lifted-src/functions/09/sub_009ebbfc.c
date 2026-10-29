/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ebbfc..0x9ebc7c (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9ebbfc(void* a0, unsigned long a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long v8;  // x0
    unsigned long v9;  // x0
    void* v10;  // x8
    unsigned long idx;  // x9
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!(int)a0[8])
        return 1;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    if (a1)
    {
        v8 = sub_9db7cc(*(long long *)a0, *(long long *)a0);
        if (v8)
        {
            v9 = sub_9e4cdc(a0, (int)a0[8] + 1);
            if (!v9)
                return v9;
            v10 = *(long long *)a0;
            idx = (int)a0[8];
            *(unsigned int *)&a0[8] = (unsigned int)idx + 1;
            *(unsigned long *)((char *)v10 + 8 * idx) = v8;
        }
    }
    else
    {
        sub_9e5b4c(a0);
    }
    return 1;
}
