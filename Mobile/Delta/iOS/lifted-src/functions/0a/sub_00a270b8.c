/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa270b8..0xa27128 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a270b8(long long *a0)
{
    long long v2;  // x0
    long long v3;  // x0
    long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9e4958();
    a0[8] = v2;
    v3 = sub_9e4958(v2);
    a0[12] = v3;
    v4 = sub_9e4958(v3);
    a0[13] = v4;
    if (a0[8] && a0[12] && v4)
    {
        *(unsigned int *)&a0[14] = 0;
        return 1;
    }
    sub_9e48d4(a0[8]);
    sub_9e48d4(a0[12]);
    sub_9e48d4(a0[13]);
    return 0;
}
