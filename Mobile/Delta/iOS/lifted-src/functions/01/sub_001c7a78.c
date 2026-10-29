/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c7a78..0x1c7ae8 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_1c7a78(long long *a0, long long *a1, long long *a2)
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
        v4 = sub_1c3b30(a0);
        a0[1] = v4;
        return v4 - 24;
    }
    sub_181f0(v2, *a1, *a2, *a2 - *a1);
    v3 = v2 + 24;
    a0[1] = v3;
    a0[1] = v3;
    return v3 - 24;
}
