/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5b5fc..0xa5b680 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a5b5fc(long long a0, long long a1, long long a2, long long a3)
{
    long long v2;  // x0
    long long v3;  // x19
    long long v4;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a3f728();
    if (!v2)
        return 0xffffffff;
    v3 = v2;
    sub_a36c8c();
    v4 = sub_a565c4(v3, 0, a2, a1, a3, a0, 0);
    sub_a36cd4(v4, 0, a2, a1, a3, a0, 0);
    sub_a3f73c(v3);
    return v4;
}
