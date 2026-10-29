/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb55654..0xb556f8 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b55654(long long *a0, unsigned long a1, unsigned long a2, long long a3, long long a4)
{
    long long v3;  // x0
    long long v4;  // x22
    unsigned long long v5;  // x0
    unsigned long long v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_afd760(*a0);
    v0 = 0;
    if (!v3)
        return v3;
    v4 = v3;
    sub_a36c8c();
    v5 = sub_9c0690(v4, &v0);
    sub_a36cd4(v5, &v0);
    if (v5 >> 31 & 1 && v0)
    {
        sub_9ebcf4(v0);
        v0 = 0;
    }
    sub_9d3c28(v4);
    return sub_b5575c(a0, 0, 0, 0, v0, a3, a4);
}
