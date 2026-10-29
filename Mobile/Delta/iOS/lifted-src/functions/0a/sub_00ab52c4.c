/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab52c4..0xab5344 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_ab52c4(long long a0, long long a1, long long a2, long long a3)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a2)
        return sub_9dd260();
    v2 = sub_9dd4e0(a0);
    if (!(unsigned int)v2)
        return v2;
    v3 = sub_9dd260(a1, a2, a0, a3);
    sub_9dd4e8(a0);
    return v3;
}
