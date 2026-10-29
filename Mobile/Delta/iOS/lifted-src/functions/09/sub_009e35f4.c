/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e35f4..0x9e3698 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9e35f4(long long a0, long long a1, long long *a2, long long a3)
{
    long long v2;  // x0
    long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!*(int *)a2)
    {
        sub_9e5b4c();
        return 1;
    }
    sub_9de064(a3);
    v2 = sub_9de208(a3);
    if (v2 && sub_9e55d4())
        v3 = sub_9e34a4(a0, a1, v2, a2, a3);
    else
        v3 = 0;
    sub_9de17c(a3);
    return v3;
}
