/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95cfc0..0x95d01c (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_95cfc0(void* a0, long long a1)
{
    unsigned int v2;  // w0
    unsigned long v3;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if ((long long)a0[24])
    {
        v2 = sub_961418((long long)a0[24], a1);
        v3 = (long long)a0[32];
        if ((long long)a0[32])
            goto LABEL_95cfec;
    }
    else
    {
        v2 = 1;
        v3 = (long long)a0[32];
        if ((long long)a0[32])
        {
LABEL_95cfec:
            v2 = sub_9614f0(v3, a1);
        }
    }
    return (int)v2 > 0;
}
