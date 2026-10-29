/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x30efc..0x30f60 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_30efc(long long *a0)
{
    long long v2;  // x20
    long long v3;  // x0
    long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0[1];
    if ((unsigned long long)a0[2] <= (unsigned long long)v2)
    {
        v4 = sub_29860(a0);
        a0[1] = v4;
        return v4 - 0x88;
    }
    sub_2fb6c(v2);
    v3 = v2 + 0x88;
    a0[1] = v3;
    a0[1] = v3;
    return v3 - 0x88;
}
