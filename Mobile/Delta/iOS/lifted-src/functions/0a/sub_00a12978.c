/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa12978..0xa129e4 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a12978(long long *a0)
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
    if (a0[2] && a0[3] && v4)
        return 1;
    sub_9e48d4(a0[2]);
    sub_9e48d4(a0[3]);
    sub_9e48d4(a0[4]);
    return 0;
}
