/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e3408..0x9e34a4 (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9e3408(long long a0, long long a1, unsigned long a2, long long a3, long long a4)
{
    long long v2;  // x0
    long long v3;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_9de064(a4);
    v2 = sub_9de208(a4);
    if (v2 && sub_9e2de0())
        v3 = sub_9e2c40(a0, a1, v2, a3, a4) != 0;
    else
        v3 = 0;
    sub_9de17c(a4);
    return v3;
}
