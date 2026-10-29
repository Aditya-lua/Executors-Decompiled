/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c0a90..0x9c0b24 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9c0a90(long long a0, unsigned long long a1, long long a2)
{
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    unsigned long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = 0;
    if (!a1)
        return 0;
    v4 = sub_9c0690(a1, &v1);
    if (!(v4 >> 31 & 1))
    {
        v0 = *(long long *)(v1 + 8);
        v5 = sub_9cad7c(a2, &v0, v4 & 0xffffffff, a0, 0, 0);
    }
    else
    {
        v5 = 0;
    }
    sub_9ebcf4(v1);
    return v5;
}
