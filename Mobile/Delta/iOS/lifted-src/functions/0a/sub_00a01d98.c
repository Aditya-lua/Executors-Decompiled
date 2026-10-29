/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa01d98..0xa01e1c (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a01d98(long long a0, long long *a1, unsigned long a2, long long a3)
{
    long long v2;  // x0
    long long v3;  // x23
    long long v4;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9e4958();
    if (!v2)
        return 0;
    v3 = v2;
    sub_9e5cb4();
    v4 = sub_9dea6c(a3, a1[3], v3, a1[1], a0) != 0;
    sub_9e4838(v3);
    return v4;
}
