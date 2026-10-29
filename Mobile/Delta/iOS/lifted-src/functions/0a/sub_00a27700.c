/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa27700..0xa27770 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a27700(long long *a0)
{
    long long v2;  // x0
    long long v3;  // x0
    long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9e4958();
    a0[2] = v2;
    v3 = sub_9e4958(v2);
    a0[3] = v3;
    v4 = sub_9e4958(v3);
    a0[4] = v4;
    *(unsigned int *)&a0[5] = 0;
    if (a0[2] && a0[3] && v4)
        return 1;
    sub_9e48d4(a0[2]);
    sub_9e48d4(a0[3]);
    sub_9e48d4(a0[4]);
    return 0;
}
