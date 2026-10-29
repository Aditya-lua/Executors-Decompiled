/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa64290..0xa6432c (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a64290(long long *a0)
{
    long long v2;  // x0
    long long v3;  // x0
    long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_a3f568(a0[2]);
    sub_a3f568(a0[3]);
    sub_a3f568(a0[1]);
    *a0 = 0;
    if ((a0[2] || (v2 = sub_a3f728(), a0[2] = v2, v2)) && (a0[3] || (v3 = sub_a3f728(), a0[3] = v3, v3)) && (a0[1] || !(v4 = sub_a3f728(), a0[1] = v4, !v4)))
        return 1;
    sub_a3f568(a0[2]);
    sub_a3f568(a0[3]);
    sub_a3f568(a0[1]);
    *a0 = 0;
    return 0;
}
