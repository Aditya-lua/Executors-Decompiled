/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa02d24..0xa02dd8 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a02d24(long long a0, long long a1, long long a2)
{
    long long v2;  // x20
    long long v3;  // x0
    long long v4;  // x23
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9e4958();
    if (!v2)
        return v2;
    sub_9de064(a2);
    v3 = sub_9de208(a2);
    if (!v3 || (v4 = v3, !sub_9e4d58(v2, 2) || !sub_9db58c(v4, a1, v2) || !sub_9defb0(v2, a0, v4, a1, a2, 0)))
    {
        sub_9e48d4(v2);
        v2 = 0;
    }
    sub_9de17c(a2);
    return v2;
}
