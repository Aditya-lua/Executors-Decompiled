/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95d01c..0x95d078 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_95d01c(void* a0, long long a1)
{
    unsigned int v2;  // w0
    unsigned long v3;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if ((long long)a0[24])
    {
        v2 = sub_95a720((long long)a0[24], a1);
        v3 = (long long)a0[32];
        if ((long long)a0[32])
            goto LABEL_95d048;
    }
    else
    {
        v2 = 1;
        v3 = (long long)a0[32];
        if ((long long)a0[32])
        {
LABEL_95d048:
            v2 = sub_95a97c(v3, a1);
        }
    }
    return (int)v2 > 0;
}
